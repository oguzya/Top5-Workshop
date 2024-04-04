import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class UserTest {
    @Test
    public void getNameTest() {
        User user = new User("John", "Doe", "");
        assertTrue(user.getName() == "John");
    }

    @Test
    public void setNameTest() {
        User user = new User("John", "Doe", "");
        user.setName("Jane");
        assertTrue(user.getName() == "Jane");
    }

    @Test
    public void getBioTest() {
        User user = new User("John", "Doe", "I am a person.");
        assertTrue(user.getBio() == "Doe");
    }

    @Test
    public void setBioTest() {
        User user = new User("John", "Doe", "I am a person.");
        user.setBio("I am a person.");
        assertTrue(user.getBio() == "I am a person.");
    }

    @Test
    public void getResearchFieldTest() {
        User user = new User("John", "Doe", "I am a person.");
        assertTrue(user.getResearchField() == "I am a person.");
    }

    @Test
    public void setResearchFieldTest() {
        User user = new User("John", "Doe", "I am a person.");
        user.setResearchField("I am a person.");
        assertTrue(user.getResearchField() == "I am a person.");
    }

}
