package Doors_100;

//状态  使用类替换类型代码
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
