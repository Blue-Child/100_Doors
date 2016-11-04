package Doors_100;

//提炼类 门
public class Door {
	
	private int doorNo;				//门号
	private State curState;			//当前状态
	
	public Door(int doorNo) {
		this.doorNo = doorNo;
	}
	
	//切换状态
	public void toggle() {
		if (State.STATE_OPEN == this.getCurState()) {
			this.setCurState(State.STATE_CLOSE);
		} else if (State.STATE_CLOSE == this.getCurState()) {
			this.setCurState(State.STATE_OPEN);
		}
	}
	
	@Override
	public String toString() {
		StringBuffer printContent = new StringBuffer();
		printContent.append("The ");
		printContent.append(this.getDoorNo());
		printContent.append(" door's state is ");
		printContent.append(this.getDoorState());
		return printContent.toString();
	}
	
	//取得当前状态 状态：true:开 false:闭
	private String getDoorState() {
		return this.getCurState().getState();
	}

	public int getDoorNo() {
		return doorNo;
	}

	public State getCurState() {
		return curState;
	}

	public void setCurState(State curState) {
		this.curState = curState;
	}
	
}
