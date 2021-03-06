package com.yzbbanban.rabbitmq;

import com.yzbbanban.rabbitmq.sender.Sender;
import com.yzbbanban.rabbitmq.sender.Sender2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqApplicationTests {

	@Autowired
	private Sender sender;
	@Autowired
	private Sender2 sender2;

	@Test
	public void hello() {
		for (int i = 0; i < 10; i++) {
			sender.send(i);
			sender2.send(i);
		}
	}

}
