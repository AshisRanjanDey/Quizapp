package com.ashis.quizapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootApplication
public class QuizappApplication {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/quizapp";
		String username = "ashisrd";
		String password = ""; // Use your actual password here

		try (Connection connection = DriverManager.getConnection(url, username, password)) {
			System.out.println("Database connection established.");
		} catch (Exception e) {
			System.err.println("Failed to connect to database: " + e.getMessage());
		}
		SpringApplication.run(QuizappApplication.class, args);
	}

}
