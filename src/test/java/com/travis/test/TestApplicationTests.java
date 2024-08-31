package com.travis.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.sql.SQLOutput;

@SpringBootTest
class TestApplicationTests {

	@Test
	void contextLoads() {
	}

	public static void main(String[] args) {
		System.out.println("Hello World!.... This is Tests");
	}

	@Test
	public void runTest(){
		System.out.println("This is a custom text");
	}

	@Test
	public void handleTest(){
		System.out.println("This task will fail!");
	}

}
