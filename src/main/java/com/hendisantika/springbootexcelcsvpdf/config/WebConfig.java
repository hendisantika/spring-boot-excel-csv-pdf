package com.hendisantika.springbootexcelcsvpdf.config;

import com.hendisantika.springbootexcelcsvpdf.resolver.CsvViewResolver;
import com.hendisantika.springbootexcelcsvpdf.resolver.ExcelViewResolver;
import com.hendisantika.springbootexcelcsvpdf.resolver.PdfViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-excel-csv-pdf
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/02/18
 * Time: 20.58
 * To change this template use File | Settings | File Templates.
 */

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer
                .defaultContentType(MediaType.APPLICATION_JSON)
                .favorPathExtension(true);
    }

    /*
     * Configure ContentNegotiatingViewResolver
     */
    @Bean
    public ViewResolver contentNegotiatingViewResolver(ContentNegotiationManager manager) {
        ContentNegotiatingViewResolver resolver = new ContentNegotiatingViewResolver();
        resolver.setContentNegotiationManager(manager);

        // Define all possible view resolvers
        List<ViewResolver> resolvers = new ArrayList<>();

        resolvers.add(csvViewResolver());
        resolvers.add(excelViewResolver());
        resolvers.add(pdfViewResolver());

        resolver.setViewResolvers(resolvers);
        return resolver;
    }

    /*
     * Configure PdfView resolver to provide XLS output using Apache POI library to
     * generate XLS output for an object content
     */
    @Bean
    public ViewResolver excelViewResolver() {
        return new ExcelViewResolver();
    }

    /*
     * Configure PdfView resolver to provide Csv output using Super Csv library to
     * generate Csv output for an object content
     */
    @Bean
    public ViewResolver csvViewResolver() {
        return new CsvViewResolver();
    }

    /*
     * Configure PdfView resolver to provide Pdf output using iText library to
     * generate pdf output for an object content
     */
    @Bean
    public ViewResolver pdfViewResolver() {
        return new PdfViewResolver();
    }


}
