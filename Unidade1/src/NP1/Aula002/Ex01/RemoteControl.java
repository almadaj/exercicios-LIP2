package NP1.Aula002.Ex01;

public class RemoteControl{
  public int channel;
  public int volume;

  public RemoteControl(){
    channel = 0;
    volume = 0;
  }

  public void increaseChannel(){
    this.channel++;
  }

  public void decreaseChannel(){
    this.channel--;
  }

  public void increaseVolume(){
    this.volume++;
  }

  public void decreaseVolume(){
    this.volume--;
  }

  public void changeChannel(int newChannel){
    this.channel = newChannel;
  }

  public void showStatus(){
    System.out.println("Channel: " + channel);
    System.out.println("Volume: " + volume);
  }
}
