package hello.aop;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@SpringBootTest
class AopApplicationTests {

	@Test
	void contextLoads() {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(UUID.randomUUID().toString());
		}
		for (String s : list) {
			System.out.println("s = " + s);
		}
	}

}
