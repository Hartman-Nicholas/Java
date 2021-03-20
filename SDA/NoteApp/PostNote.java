public class PostNote extends Note {

    private String comment;
    private String commentDate;

    public PostNote(String author, String title, String postingDate, String body) {
        super(author, title, postingDate, body);
        this.comment = "";
        this.commentDate = "";



    }
}
