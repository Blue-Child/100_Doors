package Doors_100;

import java.util.List;

public class Client {
	
	/**
	 * 1.初始化100道门
	 * 2.闯关次数
	 * 3.打印门的状态
	 */
	public static void main(String[] args) {
		List<Door> doorList = DoorHandler.initDoors(100);
		DoorHandler.pass(doorList, 3);
		DoorHandler.printDoorsState(doorList);
	}

}
