public class User {
    static int ids = 0;


    public int getId() {
        return id;
    }

    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    private String name;
    private String bio;
    private String researchField;

    public User(String name, String bio, String researchField) {
        this.id = ids++;
        this.name = name;
        this.bio = bio;
        this.researchField = researchField;
    }

}
