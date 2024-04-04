import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class PostTest {
    
    @Test
    public void getTop5Test() {
        ResearchPaper[] top5 = new ResearchPaper[5];
        User user = new User("", "", "");
        String title = "";
        Post post = new Post(top5, user, title);
        assertTrue(post.getTop5() == top5);
    }

    @Test
    public void setTop5Test() {
        ResearchPaper[] top5 = new ResearchPaper[5];
        User user = new User("", "", "");
        String title = "";
        Post post = new Post(top5, user, title);
        ResearchPaper[] newTop5 = new ResearchPaper[5];
        post.setTop5(newTop5);
        assertTrue(post.getTop5() == newTop5);
    }

    @Test
    public void getUserTest() {
        ResearchPaper[] top5 = new ResearchPaper[5];
        User user = new User("", "", "");
        String title = "";
        Post post = new Post(top5, user, title);
        assertTrue(post.getUser() == user);
    }

    @Test
    public void setUserTest() {
        ResearchPaper[] top5 = new ResearchPaper[5];
        User user = new User("", "", "");
        String title = "";
        Post post = new Post(top5, user, title);
        User newUser = new User("", "", "");
        post.setUser(newUser);
        assertTrue(post.getUser() == newUser);
    }

    @Test
    public void getTitleTest() {
        ResearchPaper[] top5 = new ResearchPaper[5];
        User user = new User("", "", "");
        String title = "";
        Post post = new Post(top5, user, title);
        assertTrue(post.getTitle() == title);
    }

    @Test
    public void setTitleTest() {
        ResearchPaper[] top5 = new ResearchPaper[5];
        User user = new User("", "", "");
        String title = "";
        Post post = new Post(top5, user, title);
        String newTitle = "";
        post.setTitle(newTitle);
        assertTrue(post.getTitle() == newTitle);
    }
}
