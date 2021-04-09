package com.example.demo.graphql;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.graphql.spring.boot.test.GraphQLResponse;
import com.graphql.spring.boot.test.GraphQLTestTemplate;

@RunWith(JUnitPlatform.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GraphQLAPITest {

	@Autowired
	private GraphQLTestTemplate graphQLTestTemplate;

	private static final int SEAT_CAPACITY=30;
	

	@Test
	public void getFlight() throws Exception {

		GraphQLResponse response = graphQLTestTemplate.postForResource("graphql/get-flights.graphql");
		assertNotNull(graphQLTestTemplate);
		assertThat(response.isOk()).isTrue();
//		assertThat(response.get("$.data.getAllFlights.id")).isNotNull();
//		assertThat(response.get("$.data.getAllFlights.seatCapacity")).isEqualTo(SEAT_CAPACITY);
	}

}
	
