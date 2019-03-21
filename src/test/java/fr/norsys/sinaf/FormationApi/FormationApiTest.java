package fr.norsys.sinaf.FormationApi;

import static org.junit.Assert.assertFalse;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import org.junit.Test;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")


public class FormationApiTest{
	
	@Test
	public void test() {
		assertFalse(false);
	}
}
