package Doors_100;

//������ ��
public class Door {
	
	private int doorNo;				//�ź�
	private boolean preState;		//ǰһ��״̬  
	private boolean curState;		//��ǰ״̬
	
	public Door(int doorNo) {
		this.doorNo = doorNo;
	}
	
	//�л�״̬
	public void toggle() {
		setPreState(getCurState());	   //ǰһ��״̬Ϊ��ǰ״̬
		setCurState(!(getCurState())); //�л�toggle
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

	//ȡ�õ�ǰ״̬ ״̬��true:�� false:��
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
