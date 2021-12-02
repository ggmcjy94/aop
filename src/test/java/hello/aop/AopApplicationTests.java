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
		A a = new A();
		a.run();
	}

	static class A extends B{
		@Override
		public void onCreate() {
			System.out.println("hello");
		}
	}

	static abstract class B {
		public abstract void onCreate();
		public void run() {
			onCreate();
		}

	}
}
