package kr.hs.sdh.toast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(
		exclude = SecurityAutoConfiguration.class
)
public class ToastApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToastApplication.class, args);
		Parent parent = new Parent("신민석");
	}

	class Human {
		String name;
		public String getName(){
			return this.name;
		}

		public static String getMyName() {
			return "신민석";
		}
	}
}