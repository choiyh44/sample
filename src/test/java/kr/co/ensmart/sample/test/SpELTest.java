package kr.co.ensmart.sample.test;

import org.junit.jupiter.api.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class SpELTest {

	@Test
	void stringLiteral() {
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("'Hello World'"); 
		String message = (String) exp.getValue();
		log.info("result: {}", message);
	}
		
	@Test
	void stringMethod() {
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("'Hello World'.concat('!')"); 
		String message = (String) exp.getValue();
		log.info("result: {}", message);
	}

	@Test
	void stringProperty() {
		ExpressionParser parser = new SpelExpressionParser();

		// invokes 'getBytes()'
		Expression exp = parser.parseExpression("'Hello World'.bytes"); 
		byte[] bytes = (byte[]) exp.getValue();
		log.info("result: {}", bytes);
	}

	@Test
	void propertyDotNotation() {
		ExpressionParser parser = new SpelExpressionParser();

		// invokes 'getBytes().length'
		Expression exp = parser.parseExpression("'Hello World'.bytes.length"); 
		int length = (Integer) exp.getValue();		
		log.info("result: {}", length);
	}
	
	@Test
	void stringContructor() {
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("new String('hello world').toUpperCase()"); 
		String message = exp.getValue(String.class);
		log.info("result: {}", message);
	}
}
