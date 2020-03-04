import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import cloud.Page;

public class ChatPage extends Page {
	
	@Override public Scene setupMainScene(Stage stage)
	{
		TextField messageInput = new TextField();
		messageInput.setLayoutX(10);
		messageInput.setLayoutY(350);
		messageInput.setPrefWidth(650);
		messageInput.setText(null);
        messageInput.setPromptText("Enter Message Here");
        messageInput.setFocusTraversable(false);
       
        Text usersOnlineText = new Text("Users Online");
        usersOnlineText.setFill(Color.WHITE);
        usersOnlineText.setFont(new Font(15));
        usersOnlineText.setLayoutX(600);
        usersOnlineText.setLayoutY(45);
        
        Text messageHistoryText = new Text("Message History");
        messageHistoryText.setFill(Color.WHITE);
        messageHistoryText.setFont(new Font(15));
        messageHistoryText.setLayoutX(200);
        messageHistoryText.setLayoutY(45);
       
        
        int yPos = 0;
        
        Text[] messages = new Text[2];
        StackPane[] messagesPanes = new StackPane[2];
        Text hi = new Text("asdklfaskldfjaskldfj");
        Text subtle = new Text("dflaksdjf;l");
        
        messages[0] = hi;
        messages[1] = subtle;
        
        yPos = 0;
        
        for (int i  = 0; i < messages.length; i++)
        {
        	StackPane container = new StackPane();
        	container.setPrefWidth(460);
        	container.setAlignment(Pos.CENTER_LEFT);
        	container.getChildren().add(messages[i]);
        	container.setLayoutY(yPos);
        	messagesPanes[i] = container; 
        	
        	yPos += 30;
        }
        
       
        
        ScrollPane messageHistory = new ScrollPane();
        messageHistory.setVbarPolicy(ScrollBarPolicy.ALWAYS);
        messageHistory.setHbarPolicy(ScrollBarPolicy.NEVER);
        messageHistory.setPrefSize(460, 250);
        messageHistory.setLayoutX(25);
        messageHistory.setLayoutY(60);
        messageHistory.setContent(new Group(messagesPanes));
        
        Button sendMessage = new Button("Send");
        sendMessage.setLayoutX(675);
        sendMessage.setLayoutY(335);
        sendMessage.setPrefWidth(100);
        sendMessage.setPrefHeight(50);
        sendMessage.setFont(new Font(17));
        
        /* Back-Button */
        /*Button backButton = new Button("Back");
        backButton.setPrefWidth(70);
        backButton.setPrefHeight(45);
        backButton.setFont(new Font(15));*/
       
        Text userListText = new Text("Online Users");
        userListText.setFill(Color.WHITE);
        userListText.setLayoutX(0);
        userListText.setLayoutY(0);
        userListText.setFont(new Font(13));
       
        Text[] usersOnline = new Text[2];
        StackPane[] usersPanes = new StackPane[2];
        Text hello = new Text("asdklfaskldfjaskldfj");
        Text sub = new Text("dflaksdjf;l");
        
        usersOnline[0] = hello;
        usersOnline[1] = sub;
        
        yPos = 0;
        
        for (int i  = 0; i < usersPanes.length; i++)
        {
        	StackPane container = new StackPane();
        	container.setPrefWidth(260);
        	container.getChildren().add(usersOnline[i]);
        	container.setLayoutY(yPos);
        	usersPanes[i] = container; 
        	
        	yPos += 30;
        }
        
        ScrollPane userList = new ScrollPane();
        userList.setVbarPolicy(ScrollBarPolicy.ALWAYS);
        userList.setHbarPolicy(ScrollBarPolicy.NEVER);
        userList.setLayoutX(515);
        userList.setLayoutY(60);
        userList.setPrefSize(260, 250);
        userList.setContent(new Group(usersPanes));

		Scene chatPage = new Scene(new Group(messageInput, sendMessage, userListText, userList, messageHistory, usersOnlineText, messageHistoryText), 800, 400, Color.BLACK);
		
		 /*backButton.setOnAction((event) -> 
		 {
			 Rectangle2D chatScreenBounds = Screen.getPrimary().getVisualBounds();
		     stage.setX((chatScreenBounds.getWidth() - 400) / 2); 
		     stage.setY((chatScreenBounds.getHeight() - 400) / 2);
		     stage.setScene(this.pages.get("login").setupMainScene(stage));
	        	
	     });*/
		
		return chatPage;
	} 
}
