package org.example.lab1;

public class MainApp {
    public static void main(String[] args) {
        Room room = new Room(1, 150);

        Event event = new Event.EventBuilder()
                .setEventId(101)
                .setEventName("Concert")
                .setEventDates("2024-10-10")
                .setRoom(room)
                .setEventSeats(150)
                .build();

        System.out.println(event);
    }
}
