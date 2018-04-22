package Castle;

import java.util.ArrayList;

public class Castle {

    private ArrayList<Room> roomList;

    public Castle(ArrayList<Room> roomList) {
        this.roomList = roomList;
    }

    public ArrayList<Room> getRoomList() {
        return roomList;
    }
}
