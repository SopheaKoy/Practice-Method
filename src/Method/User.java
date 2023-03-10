package Method;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class User {
    private UUID uuid;
    private String username;
    private String password;
    private LocalDateTime createdDate;
    public void login(String username,String password){
        this.username=username;
        this.password=password;
        this.uuid =UUID.randomUUID();
        this.createdDate = LocalDateTime.now();
    }
//    public User getProfile(){
//        this.uuid =UUID.randomUUID();
//        this.createdDate = LocalDateTime.now();
//        return this;
//    }

    public void displayUser(){
        System.out.println("------------------------------------------");
        System.out.println("UUID  = "+this.uuid);
        System.out.println("USERNAME  = "+this.username);
        System.out.println("PASSWORD  = "+this.password);
        System.out.println("CREATE DATE = "+ DateTimeUtils.formatFullDateTime(this.createdDate,"dd-MMMM-yyyy  hh:mm a"));
        System.out.println("------------------------------------------");
    }
    // method string
    @Override
    public String toString() {
        return "User{" +
                "uuid=" + uuid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
