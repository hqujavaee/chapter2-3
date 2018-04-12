package cn.edu.hqu.javaee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.edu.hqu.javaee.domain.cd.CompactDisc;
import cn.edu.hqu.javaee.domain.cd.impl.Albums;
import cn.edu.hqu.javaee.domain.cd.impl.CDPlayer;

@Configuration

/*显示配置没有ComponentScan注解，因此需要直接给出生成bean的语句*/
//@ComponentScan
public class CDPlayerConfig {
	
	public CompactDisc albums() {
		
		return new Albums();
	}
	
	@Bean
	public CDPlayer cdPlayer() {
		//直接注入
		return new CDPlayer(albums() );
	}
	
	/*注入还可以有另一种方法*/
	/*
	 @Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc) {
		return new CDPlayer(compactDisc);
	}
	*/

}
