package Doors_100;

import java.util.List;

import org.junit.Test;

public class DoorTest {
	
	/**
	 * 1.��ʼ��100����
	 * 2.���ش���
	 * 3.��ӡ�ŵ�״̬
	 */
	@Test
	public void test100Doors() {
		List<Door> doorList = DoorHandler.initDoors(100);
		DoorHandler.pass(doorList, 3);
		DoorHandler.printDoorsState(doorList);
	}
	
	@Test
	public void test100Doors2() {
		List<Door> doorList = DoorHandler.initDoors(100);
		DoorHandler.pass(doorList, 2);
		DoorHandler.printDoorsState(doorList);
	}
}
