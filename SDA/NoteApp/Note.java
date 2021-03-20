public abstract class Note {

    protected String author;
    protected String title;
    protected String postingDate;
    protected String body;


    public Note(String author, String title, String postingDate, String body) {
        this.author = author;
        this.title = title;
        this.postingDate = postingDate;
        this.body = body;
    }

    public void generateNote () {
        System.out.println(getAuthor());
        System.out.println(getTitle());
        System.out.println(getPostingDate());
        System.out.println(getBody());


    }


    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPostingDate() {
        return this.postingDate;
    }

    public void setPostingDate(String postingDate) {
        this.postingDate = postingDate;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }


}
