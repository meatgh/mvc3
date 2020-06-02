package technicalblog.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import technicalblog.model.Post;
import technicalblog.repository.PostRepository;

import java.sql.*;
import java.util.Date;
import java.util.List;

@Service


public class PostService {

    @Autowired
    private PostRepository repository;
    public PostService(){System.out.println("*** Post Service *** ");}


//    @PersistenceUnit(unitName = "techblog") // MyComments - commented this out after creating the Repository class and creating the respective methods there
//    private EntityManagerFactory emf;

    public List<Post> getAllPosts() throws SQLException {
    //public ArrayList<Post> getAllPosts() throws SQLException { - changed from ArrayList to List as we are not returning List instead of Post whcih is an AraryList



        // ArrayList<Post> posts = new ArrayList<>();

//        Post post1 = new Post();
//        Post post2 = new Post();
//        Post post3 = new Post();
//
//        post1.setTitle("Post 1");
//        post1.setBody("Post Body 1");
//        post1.setDate(new Date());
//
//        post2.setTitle("Post 2");
//        post2.setBody("Post Body 2");
//        post2.setDate(new Date());
//
//        post3.setTitle("Post 3");
//        post3.setBody("Post Body 3");
//        post3.setDate(new Date());
//
//        posts.add(post1);
//        posts.add(post2);
//        posts.add(post3);

        //create an entity manager using the factor declared above and assign it to an EntityManager variable
//        EntityManager em = emf.createEntityManager(); // MyComments - commented this out after creating the Repository class and creating the respective methods there
//        TypedQuery<Post> query = em.createQuery("SELECT p from Post p", Post.class);
//        List<Post> resultList = query.getResultList();


        //Load the driver
//        Connection connection = null;
//        try {
//            Class.forName("org.postgresql.Driver");
//            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/technicalblog", "postgres", "myself");
//            Statement statement = connection.createStatement();
//            ResultSet rs = statement.executeQuery("SELECT * FROM posts");
//            while (rs.next()) {
//                Post post = new Post();
//                post.setTitle(rs.getString("title"));
//                post.setBody(rs.getString("body"));
//                posts.add(post);
//            }
//
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//        } finally {
//            connection.close();
//        }
//
//        return posts;
        // return resultList; //My comments - commented this out after the repository class was created
        return repository.getAllPosts();
    }

    public Post getOnePost() throws SQLException {

        //MC - removing all the code after creating the getLatestPost method in Repository class
        //MC2 - chagned the erturn type to Post as it is not more returning a List or ArrayList - original method signature was public ArrayList<Post> getOnePost() throws SQLException

//        ArrayList<Post> posts = new ArrayList<>();
//
////        Post post1 = new Post();
////        post1.setTitle("This is your Post");
////        post1.setBody("This is your Post. It has some valid content");
////        post1.setDate(new Date());
////        posts.add(post1);
//
//        Connection connection = null;
//        try {
//            Class.forName("org.postgresql.Driver");
//            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/technicalblog", "postgres", "myself");
//            Statement statement = connection.createStatement();
//            ResultSet rs = statement.executeQuery("SELECT * FROM posts WHERE ID = 4");
//            while (rs.next()) {
//                Post post = new Post();
//                post.setTitle(rs.getString("title"));
//                post.setBody(rs.getString("body"));
//                posts.add(post);
//            }
//
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//        } finally {
//            connection.close();
//        }
//
//        return posts;
        return repository.getLaterstPost();

    }

    public void createPost(Post newPost){

        newPost.setDate(new Date());
        repository.createPost(newPost);
        System.out.println("New Post "+ newPost);
    }







}
