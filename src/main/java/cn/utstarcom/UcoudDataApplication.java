package cn.utstarcom;

import cn.utstarcom.component.GenerateTestData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UcoudDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(UcoudDataApplication.class, args);

        GenerateTestData.main(args);
	}

}
