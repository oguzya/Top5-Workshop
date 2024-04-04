import java.util.List;
import java.util.Map;

public class Main {
   Map<Integer, User> users;
   Map<Integer, Community> communities;
   Map<Integer, Post> posts;
   Map<Integer, List<Integer>> userPosts;
   Map<Integer, List<Integer>> communityPosts;

   public static void main(String[] args) {

   }

   public void createPost(ResearchPaper[] top5, User user, String title, int communityId){
      Community community = communities.get(communityId);
      if (community.users.contains(user.getId()))
      {
         Post post = new Post(top5, user, title);
         posts.put(post.id, post);
         community.AddPost(post);
      }
   }

}
