package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@ComponentScan("soundsystem")
//@Import(CDConfig.class)
public class CDPlayerConfig {
	
//	@Bean
//	public CompactDisc sgtPeppers(){
//		return new SgtPeppers();
//	}
	
//	@Bean
//	public CDPlayer cdPlayer(){
//		return new CDPlayer(sgtPeppers());
//	}
//	@Bean
//	public CDPlayer anothercdPlayer(){
//		return new CDPlayer(sgtPeppers());
//	}
	
	
	
	@Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc){
		return new CDPlayer(compactDisc);
	}
}
