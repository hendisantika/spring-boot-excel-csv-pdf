package com.hendisantika.springbootexcelcsvpdf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;

@SpringBootApplication
public class SpringBootExcelCsvPdfApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExcelCsvPdfApplication.class, args);
	}

    @Bean
    public HttpMessageConverters customConverters() {
        ByteArrayHttpMessageConverter arrayHttpMessageConverter = new ByteArrayHttpMessageConverter();
        return new HttpMessageConverters(arrayHttpMessageConverter);
    }
}
