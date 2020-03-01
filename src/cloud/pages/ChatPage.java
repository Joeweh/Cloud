import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import cloud.Page;

public class ChatPage extends Page {
	@Override
	public Scene setupMainScene(Stage stage)
	{
		TextField messageInput = new TextField();
		messageInput.setLayoutX(10);
		messageInput.setLayoutY(350);
		messageInput.setPrefWidth(650);
		messageInput.setText(null);
        messageInput.setPromptText("Enter Message Here");
        messageInput.setFocusTraversable(false);
        
        Button sendMessage = new Button("Send");
        sendMessage.setLayoutX(675);
        sendMessage.setLayoutY(335);
        sendMessage.setPrefWidth(100);
        sendMessage.setPrefHeight(50);
        sendMessage.setFont(new Font(17));
        
        Text userListText = new Text("Online Users");
        userListText.setFill(Color.WHITE);
        userListText.setLayoutX(0);
        userListText.setLayoutY(0);
        userListText.setFont(new Font(13));
       
        Text[] usersOnline = new Text[2];
      
        Text hello = new Text("addfaefawef");
        Text sub = new Text("dflaksdjf;l");
        //hello.setLayoutX(50);
        usersOnline[0] = hello;
        usersOnline[1] = sub;
        int xPos = 200;
        int yPos = 0;
        
        for (Text current : usersOnline)
        {
        	current.setLayoutY(yPos);
        	yPos+=30;
        }
 
        ScrollPane userList = new ScrollPane();
        userList.setVbarPolicy(ScrollBarPolicy.ALWAYS);
        userList.setLayoutX(550);
        userList.setLayoutY(75);
        userList.setPrefSize(200, 200);
        userList.setContent(new Group(usersOnline));

		Scene chatPage = new Scene(new Group(messageInput, sendMessage, userListText, userList), 800, 400, Color.BLACK);
		
		return chatPage;
	} 
}
