import java.util.HashMap;
import java.util.Map;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class Page {
	
    protected Map<String, Page> pages = new HashMap<>();
	
    public Scene setupMainScene(Stage stage) 
    {
	return null;
    }
	
    public void addPage(Page page, String name) 
    {
	this.pages.put(name, page);
    }
}
