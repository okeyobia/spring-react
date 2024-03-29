package com.okey.cardatabase;

import com.okey.cardatabase.web.CarController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CardatabaseApplicationTests {
	@Autowired
	private CarController carController;

	@Test
	public void contextLoads() {
		assertThat(carController).isNotNull();
	}

}
