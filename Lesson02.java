import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    // 業務プログラムの基本
    public static void main(String[] args) throws Exception {
        
        UserRepository userRepository = new UserRepository();
        
        List<User> users = userRepository.findByAll();
        
        List<User> displayUsers = new ArrayList<User>();
        
        for(int i = 0;i < users.size();i++){
            if(users.get(i).getName().equals("name0")){
                displayUsers.add(users.get(i));
            }
        }
        // 流石にもうちょっと良いやり方ありそう
        for(int i = 0;i < displayUsers.size();i++){
            System.out.println(users.get(i).getName());
        }
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
    }
    
    private static class User {
        
        private String name;
        
        public void setName(String name) {
            this.name = name;
        }
        
        public String getName() {
            return name;
        }
    }
}
