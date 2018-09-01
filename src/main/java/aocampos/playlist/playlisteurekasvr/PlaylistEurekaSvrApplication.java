package aocampos.playlist.playlisteurekasvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PlaylistEurekaSvrApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaylistEurekaSvrApplication.class, args);
	}
}
