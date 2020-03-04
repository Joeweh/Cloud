import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Message {
	
	public final String contentRaw;
	public final User sender;
	public final String channelID;
	
	Message(String contentRaw, User sender, String channelID) {
		this.sender = sender;
		this.contentRaw = contentRaw;
		this.channelID = channelID;
	}
	
	public String toJSON() 
	{
		GsonBuilder builder = new GsonBuilder();
		builder.disableHtmlEscaping();
		Gson gson = builder.create();
		
		return gson.toJson(this);
	}
	
	public static Message parseJSON(String json) 
	{
		Gson gson = new Gson();
		Message message = gson.fromJson(json, Message.class);
		return message;
	}
}
