package org.springframework.cloud.stream.app.syslog.source.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SyslogSourceKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SyslogSourceKafkaApplication.class, args);
	}
}