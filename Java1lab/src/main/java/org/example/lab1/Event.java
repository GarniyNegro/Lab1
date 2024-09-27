package org.example.lab1;

public class Event {
    private int eventId;
    private String eventName;
    private String eventDates;
    private Room room;
    private int eventSeats;

    private Event(EventBuilder builder) {
        this.eventId = builder.eventId;
        this.eventName = builder.eventName;
        this.eventDates = builder.eventDates;
        this.room = builder.room;
        this.eventSeats = builder.eventSeats;
    }

    public int getEventId() {
        return eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventDates() {
        return eventDates;
    }

    public Room getRoom() {
        return room;
    }

    public int getEventSeats() {
        return eventSeats;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventId=" + eventId +
                ", eventName='" + eventName + '\'' +
                ", eventDates='" + eventDates + '\'' +
                ", room=" + room +
                ", eventSeats=" + eventSeats +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Event event = (Event) obj;
        return eventId == event.eventId && eventSeats == event.eventSeats && eventName.equals(event.eventName) &&
                eventDates.equals(event.eventDates) && room.equals(event.room);
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(eventId);
        result = 31 * result + eventName.hashCode();
        result = 31 * result + eventDates.hashCode();
        result = 31 * result + room.hashCode();
        result = 31 * result + Integer.hashCode(eventSeats);
        return result;
    }

    /**
     * Патерн Builder для класу Event.
     */
    public static class EventBuilder {
        private int eventId;
        private String eventName;
        private String eventDates;
        private Room room;
        private int eventSeats;

        public EventBuilder setEventId(int eventId) {
            this.eventId = eventId;
            return this;
        }

        public EventBuilder setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }

        public EventBuilder setEventDates(String eventDates) {
            this.eventDates = eventDates;
            return this;
        }

        public EventBuilder setRoom(Room room) {
            this.room = room;
            return this;
        }

        public EventBuilder setEventSeats(int eventSeats) {
            this.eventSeats = eventSeats;
            return this;
        }

        public Event build() {
            return new Event(this);
        }
    }
}
