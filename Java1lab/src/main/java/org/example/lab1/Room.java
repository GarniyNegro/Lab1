package org.example.lab1;

public class Room {
    private int roomId;
    private int seatCapacity;

    public Room(int roomId, int seatCapacity) {
        this.roomId = roomId;
        this.seatCapacity = seatCapacity;
    }

    public int getRoomId() {
        return roomId;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", seatCapacity=" + seatCapacity +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Room room = (Room) obj;
        return roomId == room.roomId && seatCapacity == room.seatCapacity;
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(roomId);
        result = 31 * result + Integer.hashCode(seatCapacity);
        return result;
    }
}
