package Doors_100;

import java.util.List;

public class Client {
	
	/**
	 * 1.��ʼ��100����
	 * 2.���ش���
	 * 3.��ӡ�ŵ�״̬
	 */
	public static void main(String[] args) {
		List<Door> doorList = DoorHandler.initDoors(100);
		DoorHandler.pass(doorList, 3);
		DoorHandler.printDoorsState(doorList);
	}

}
