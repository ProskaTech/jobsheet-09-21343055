/*
 * Nama : Muhamad Fathur Rahman
 * NIM  : 21343055
 * Prodi: Teknik Informatika
 */
package Latihan;

public class Elevator {
    public boolean doorOpen = false;
    public int currentFloor = 5;
    public final int TOP_FLOOR = 5;
    public final int BOTTOM_FLOOR = 1;
    
    public void openDoor(){
        System.out.println("Opening Door");
        doorOpen = true;
        System.out.println("Door is open.");     
    }
    public void closeDoor(){
        System.out.println("Closing Door");
        doorOpen = true;
        System.out.println("Door is Close.");
    }
    public void goUp(){
        System.out.println("Going Up One Floor");
        currentFloor++;
        System.out.println("Floor : " + currentFloor);
    }
    public void goDown(){
        System.out.println("Going Down One Floor");
        currentFloor--;
        System.out.println("Floor : " + currentFloor);
    }
    public void setfFloor(int desiredfloor){
        while (currentFloor != desiredfloor){
            if (currentFloor < desiredfloor){
                goUp();           
            }
            else{
                goDown();
            }
        }
    }
    public int getFloor(){
        return currentFloor;
    }
    public boolean checkDoorStatus(){
        return doorOpen;
    }
}

