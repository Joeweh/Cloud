import cloud.Page;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class LoginPage extends Page {
	@Override
	public Scene setupMainScene(Stage stage)
	{
		/* Setup & Create Scene */
		Text logInTitle = new Text(50, 50, "Cloud");
        logInTitle.setLayoutX(75);
        logInTitle.setLayoutY(50);
        logInTitle.setFill(Color.WHITE);
        logInTitle.setFont(new Font(50));
        logInTitle.setStrokeWidth(10);
        logInTitle.requestFocus();
        
        Button Login = new Button("Login");
        Login.setFont(new Font(20));
        Login.setLayoutX(143);
        Login.setLayoutY(250);
        Login.setPrefSize(100, 50);
       
        TextField userName = new TextField();
        userName.setLayoutX(120);
        userName.setLayoutY(175);
        userName.setText(null);
        userName.setPromptText("Enter A User Name");
        userName.setFocusTraversable(false);
        
        Scene loginPage = new Scene(new Group(logInTitle, userName, Login), 400, 400, Color.BLACK);
        /* ========== */
        
        /* Center Scene */
        Rectangle2D logInScreenBounds = Screen.getPrimary().getVisualBounds();
        stage.setX((logInScreenBounds.getWidth() - 400) / 2); 
        stage.setY((logInScreenBounds.getHeight() - 400) / 2);
        /* ========== */

        /* Action For Login Button */
        Login.setOnAction((event) -> {
      
        	if (userName.getText() == null) {}
           
        	else
        	{
	        	Rectangle2D chatScreenBounds = Screen.getPrimary().getVisualBounds();
	          	stage.setX((chatScreenBounds.getWidth() - 800) / 2); 
	            stage.setY((chatScreenBounds.getHeight() - 400) / 2);
	            stage.setScene(this.pages.get("chat").setupMainScene(stage));
        	}
    	});
        /* ========== */
        
        return loginPage;
	}
}
