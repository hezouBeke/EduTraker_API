package Api.example.Edutraker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class EdutrakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdutrakerApplication.class, args);
	}

}
