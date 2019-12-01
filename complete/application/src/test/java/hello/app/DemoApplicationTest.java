package hello.app;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import goodbye.service.SecondService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import hello.service.MyService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTest {

    @Autowired
    private MyService myService;

    @Autowired
    private SecondService secondService;

    @Test
    public void contextLoads() {
        assertThat(myService).isNotNull();
        assertNotNull(secondService);
    }

}
