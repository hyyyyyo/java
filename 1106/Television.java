package remotecontrol;

public class Television implements RemoteControl{
	int volume;
	public void TurnOn() {
		System.out.println("Turn on tv");
		
	}
	
	public void SetVolume(int volume) {
		this.volume = volume;
		System.out.println("tv volume:" + volume);
	}

}
