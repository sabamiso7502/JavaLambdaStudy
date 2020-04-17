import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Main {
    // 業務プログラムの基本
    public static void main(String[] args) throws Exception {
        
        UserRepository userRepository = new UserRepository();
        
        User user = userRepository.findById(1);

        // もしuserがnullだったら死ぬ
        System.out.println(user.getName());
    }
    
    private static class UserRepository {
        
        public List<User> findByAll() {
            // 本当はDBから取ってくる
            List<User> users = new ArrayList<>();
            for(int i = 0;i < 10;i++){
                User user = new User();
                user.setName("name" + i);
                users.add(user);
            }
            return users;
        }

        public User findById(int id) {
            User user = new User();
            user.setId(id);
            user.setName("yamada");
            return user;
        }
    }
    
    private static class User {
        
        private int id;
        private String name;
        
        public void setName(String name) {
            this.name = name;
        }
        
        public String getName() {
            return name;
        }

        public void setId(int id){
            this.id = id;
        }

        public int getId() {
            return id;
        }
    }
}
