package soundsystem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="bd")
public class BlankDisc implements CompactDisc{
	
	private String title;
	private String artist;
	private List<String> tracks;
	
	public BlankDisc(){
		
	}
	
//	public BlankDisc(String title, String artist, List<String> tracks){
//		this.title = title;
//		this.artist = artist;
//		this.tracks = tracks;
//	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing " + title + " by " + artist);
		for(String track : tracks){
			System.out.println("-Track: " + track);
		}
	}
	public void setTitle(String title){
		this.title = title;
	}
	public void setArtist(String artist){
		this.artist = artist;
	}
	public void setTracks(List<String> tracks){
		this.tracks = tracks;
	}
	public void playTrack(int k){
		String str = tracks.get(k);
		System.out.println(str);
	}
}
