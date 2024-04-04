import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Community {
    static int ids = 0;
    public int getId() {
        return id;
    }

    private int id;
    Set<Integer> users;
    Set<Integer> posts;
    public Community(){
        this.id = ids++;
        users = new HashSet<>();
        posts = new HashSet<>();
    }

    public void AddUser(User user){
        this.users.add(user.getId());
    }

    public void RemoveUser(User user){
        this.users.remove(user.getId());
    }

   public void AddPost(Post post){
   
      this.posts.add(post.id);
	
   }
  
   public void RemovePost(Post post){

	this.posts.remove(post.id);
   }

}
