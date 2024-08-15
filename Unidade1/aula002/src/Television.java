public class Television {
  public static void main(String[] args) {
    RemoteControl rc = new RemoteControl();
    rc.showStatus();

    for (int i = 0; i < 5; i++) {
      rc.increaseVolume();
    }
    rc.showStatus();
  }
}
