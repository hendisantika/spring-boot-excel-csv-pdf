package com.hendisantika.springbootexcelcsvpdf.resolver;

import com.hendisantika.springbootexcelcsvpdf.view.CsvView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-excel-csv-pdf
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/02/18
 * Time: 06.01
 * To change this template use File | Settings | File Templates.
 */
public class CsvViewResolver implements ViewResolver {
    @Override
    public View resolveViewName(String s, Locale locale) {
        CsvView view = new CsvView();
        return view;
    }
}
