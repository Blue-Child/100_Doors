package Doors_100;

import java.util.ArrayList;
import java.util.List;

//�ŵ�Э����
public class DoorHandler {

	//��ʼ��
	public static List<Door> initDoors(int number) {
		List<Door> doorList = new ArrayList<Door>();
		for (int i = 0; i < number; i++) {
			Door door = new Door(i + 1);  			  //�źŴ�1��ʼ
			door.setCurState(State.STATE_CLOSE);	  //Ĭ��״̬�ر�
			doorList.add(door);
		}
		return doorList;    
	}
	
	//���ش���
	public static List<Door> pass(List<Door> doorList, int times) {
		for (int i = 0; i < times; i++) {
			for (Door door : doorList) {
				if (isMultiple(door.getDoorNo(), (i + 1))) {
					door.toggle();
				}
			}
		}
		return doorList;
	}
	
	//�Ƿ��Ǳ���
	private static boolean isMultiple(int doorNo, int n) {
		if (doorNo % n == 0) {
			return true;
		}
		return false;
	}

	//��ӡ�ŵ�״̬
	public static void printDoorsState(List<Door> doorList) {
		for (Door door : doorList) {
			System.out.println(door.toString());
		}
	}
}
