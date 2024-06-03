package D0409.p63;

public class Message {
	private String command;
	private String to;

	public Message(String c, String t) {
		this.command = c;
		this.to = t;
	}

	public String getCommand() {
		return command;
	}

	public String getTo() {
		return to;
	}
}
