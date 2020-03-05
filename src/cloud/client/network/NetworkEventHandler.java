public class NetworkEvent {
	final String event;
	final String dataJSON;
	
	NetworkEvent(String event, String dataJSON) {
		this.event = event;
		this.dataJSON = dataJSON;
	}
}
