package Doors_100;

import java.util.ArrayList;
import java.util.List;

//门的协助类
public class DoorHandler {

	//初始化
	public static List<Door> initDoors(int number) {
		List<Door> doorList = new ArrayList<Door>();
		for (int i = 0; i < number; i++) {
			Door door = new Door(i + 1);  			  //门号从1开始
			door.setCurState(State.STATE_CLOSE);	  //默认状态关闭
			doorList.add(door);
		}
		return doorList;    
	}
	
	//闯关次数
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
	
	//是否是倍数
	private static boolean isMultiple(int doorNo, int n) {
		if (doorNo % n == 0) {
			return true;
		}
		return false;
	}

	//打印门的状态
	public static void printDoorsState(List<Door> doorList) {
		for (Door door : doorList) {
			System.out.println(door.toString());
		}
	}
}
