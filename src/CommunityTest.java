

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class CommunityTest {

    @Test
    public void AddUserTest() {
        Community community = new Community();
        User user = new User("", "", "");
        community.AddUser(user);
        assertTrue(community.users.contains(user.getId()));
    }

    @Test
    public void RemoveUserTest() {
        Community community = new Community();
        User user = new User("", "", "");
        community.AddUser(user);
        community.RemoveUser(user);
        assertTrue(!community.users.contains(user.getId()));
    }

    @Test 
    public void AddPostTest() {
        Community community = new Community();
        ResearchPaper[] top5 = new ResearchPaper[5];
        User user = new User("", "", "");
        String title = "";
        Post post = new Post(top5, user, title);
        community.AddPost(post);
        assertTrue(community.posts.contains(post.id));
    }

    @Test 
    public void RemovePostTest() {
        Community community = new Community();
        ResearchPaper[] top5 = new ResearchPaper[5];
        User user = new User("", "", "");
        String title = "";
        Post post = new Post(top5, user, title);
        community.AddPost(post);
        community.RemovePost(post);
        assertTrue(!community.posts.contains(post.id));
    }
}