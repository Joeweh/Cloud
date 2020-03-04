import cloud.pages.ChatPage;
import cloud.pages.LoginPage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application 
{
	@Override public void start(Stage stage) 
	{
        Page logInPage = new LoginPage();
        Page chatPage = new ChatPage();
        
        chatPage.addPage(logInPage, "login");
        logInPage.addPage(chatPage, "chat");
        
        Scene logInScene = logInPage.setupMainScene(stage);	
		
	      stage.setTitle("Cloud"); 
        stage.setScene(logInScene); 
        stage.sizeToScene();
        stage.setResizable(false);
        stage.show(); 
	}
	
    public static void main(String[] args) 
    {
    	Application.launch(args);
    }
}
