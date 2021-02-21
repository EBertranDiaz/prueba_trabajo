package com.bertran.pruebatrabajo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

@SpringBootTest
@Sql({"/schema.sql", "/inserts.sql"})
class PruebaTrabajoApplicationTests {

	@Test
	void contextLoads() {
	}

}
