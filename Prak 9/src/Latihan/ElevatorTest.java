/*
 * Nama : Muhamad Fathur Rahman
 * NIM  : 21343055
 * Prodi: Teknik Informatika
 */
package Latihan;

public class ElevatorTest {
    public static void main(String[] args) {
        Elevator myElevator = new Elevator();
        myElevator.openDoor();
        myElevator.closeDoor();
        myElevator.goUp();
        myElevator.goUp();
        myElevator.goUp();
        myElevator.openDoor();
        myElevator.closeDoor();
        myElevator.goDown();
        myElevator.openDoor();
        myElevator.closeDoor();
        myElevator.goDown();
        myElevator.setfFloor(myElevator.TOP_FLOOR);
        myElevator.openDoor();
    }
}
