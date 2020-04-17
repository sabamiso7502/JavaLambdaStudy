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
        
        List<User> users = userRepository.findByAll();
        
        // メソッド参照を使うとさらに読みやすい
        users.stream()
        .map(user -> user.getName())
        .filter(name -> Objects.equals(name,"name0"))
        .forEach(System.out::println);
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
