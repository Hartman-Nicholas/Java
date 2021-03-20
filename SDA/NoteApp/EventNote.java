public class EventNote extends Note {

    private String eventDate;
    private String eventDuration;
    private int eventPrice;


    public EventNote(String author, String title, String postingDate, String body, String eventDate, String eventDuration, int eventPrice) {
        super(author, title, postingDate, body);
        this.eventDate = eventDate;
        this.eventDuration = eventDuration;
        this.eventPrice = eventPrice;
    }

    @Override
    public void generateNote () {
        super.generateNote();
        System.out.println(getEventDate());
        System.out.println(getEventDuration());
        System.out.println(getEventPrice());
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventDuration() {
        return eventDuration;
    }

    public void setEventDuration(String eventDuration) {
        this.eventDuration = eventDuration;
    }

    public int getEventPrice() {
        return eventPrice;
    }

    public void setEventPrice(int eventPrice) {
        this.eventPrice = eventPrice;
    }
}


