package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="CD")
public class CDPlayer implements MediaPlayer {
	
	private CompactDisc cd;
	
	@Autowired(required=false)
	public CDPlayer(CompactDisc cd){
		this.cd = cd;
	}
	
	@Autowired
	public void setCompactDisc(CompactDisc cd){
		this.cd = cd;
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		cd.play();
	}

}
