package Doors_100;

//提炼类 门
public class Door {
	
	private int doorNo;				//门号
	private boolean preState;		//前一个状态  
	private boolean curState;		//当前状态
	
	public Door(int doorNo) {
		this.doorNo = doorNo;
	}
	
	//切换状态
	public void toggle() {
		setPreState(getCurState());	   //前一个状态为当前状态
		setCurState(!(getCurState())); //切换toggle
	}
	
	@Override
	public String toString() {
		StringBuffer printContent = new StringBuffer();
		printContent.append("The ");
		printContent.append(doorNo);
		printContent.append(" door's state is ");
		printContent.append(getState());
		return printContent.toString();
	}

	//取得当前状态 状态：true:开 false:闭
	private String getState() {
		return this.curState == true ? "open" : "close";
	}

	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public boolean getPreState() {
		return preState;
	}
	public void setPreState(boolean preState) {
		this.preState = preState;
	}
	public boolean getCurState() {
		return curState;
	}
	public void setCurState(boolean curState) {
		this.curState = curState;
	}
	
	
}
