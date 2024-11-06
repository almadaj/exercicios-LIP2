import java.nio.charset.StandardCharsets;

public abstract class SocialNetwork {
    public String user;
    public String password;

    public SocialNetwork(String user, String password){
        this.user = user;
        this.password = password;
    }

    public boolean postData(String msg){
        boolean isLoggedIn = this.login(this.user, this.password);
        boolean isSent = this.sendData(msg.getBytes());
        this.logout();
        return isSent && isLoggedIn;
    }

    public abstract boolean login(String user, String password);
    public abstract boolean sendData(byte[] data);
    public abstract void logout();
}
