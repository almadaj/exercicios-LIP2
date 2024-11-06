public class Facebook extends SocialNetwork{
    public Facebook(String username, String password){
        super(username, password);
    }

    @Override
    public boolean login(String user, String password) {
        return false;
    }

    @Override
    public boolean sendData(byte[] data) {
        System.out.println("Sua mensagem foi postada: ");
        return true;
    }

    @Override
    public void logout() {
        System.out.println("Saindo...");
    }
}
