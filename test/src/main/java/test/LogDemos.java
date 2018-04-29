package test;



import java.time.LocalDateTime;

import org.junit.Test;
import org.slf4j.LoggerFactory;




/**
 * Java日志的演示
 * JUL和logging、 slf4j和logback、 log4j和log4j 2
 *
 * @author Double
 *
 */
public class LogDemos {

	@Test
	public void test1() {
		/**
		 * 这里通过logger的名字来获取logger，LoggerFactory和Logger都是slf4j包里的，
		 * 没有用到log4j2的任何类，这就是把log4j2的scope配置为runtime的原因
		 */
		org.slf4j.Logger logger = LoggerFactory.getLogger("test.LogDemos");

		System.out.printf("\n-- START %s\n", LocalDateTime.now());
		try {
			while (true) {
				logger.info("show something " + LocalDateTime.now());
			}
		} finally {
			System.out.printf("\n-- DONE %s\n", LocalDateTime.now());
		}
	}


	@Test
	public void test2() {

	}


	@Test
	public void test3() {

	}

	@Test
	public void test4() {

	}
	@Test
	public void test5() {

	}


	@Test
	public void test6() {


	}



}
