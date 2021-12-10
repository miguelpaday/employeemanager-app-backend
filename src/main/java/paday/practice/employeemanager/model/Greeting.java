package paday.practice.employeemanager.model;

public class Greeting {

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    private final long id;

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    private final String content;


}
