import javax.swing.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class Post {
    static int ids = 0;
    int id;

    public ResearchPaper[] getTop5() {
        return top5;
    }

    public void setTop5(ResearchPaper[] top5) {
        this.top5 = top5;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private ResearchPaper[] top5;
    private User user;
    private String title;
    private LocalDateTime dateCreated;

    public Post(    ResearchPaper[] top5,
    User user,
    String title){
        this.top5 = top5;
        this.user = user;
        this.title = title;
        dateCreated = LocalDateTime.now();
        id = ids++;
    }

}
