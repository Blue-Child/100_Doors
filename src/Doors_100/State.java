package Doors_100;

//״̬  ʹ�����滻���ʹ���
public class State {
	
	private String state;
	
	public static final State STATE_OPEN = new State("OPEN");
	public static final State STATE_CLOSE = new State("CLOSE");
	
	public State(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
	
	
}
