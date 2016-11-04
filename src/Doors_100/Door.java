package Doors_100;

//������ ��
public class Door {
	
	private int doorNo;				//�ź�
	private State curState;			//��ǰ״̬
	
	public Door(int doorNo) {
		this.doorNo = doorNo;
	}
	
	//�л�״̬
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
	
	//ȡ�õ�ǰ״̬ ״̬��true:�� false:��
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
