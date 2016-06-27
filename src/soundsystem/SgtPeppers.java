package soundsystem;

import org.springframework.stereotype.Component;

@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {
	
	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing " + title + " by " + artist);
	}

}
