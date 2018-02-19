package com.hendisantika.springbootexcelcsvpdf.resolver;

import com.hendisantika.springbootexcelcsvpdf.view.ExcelView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

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


public class ExcelViewResolver implements ViewResolver {
    @Override
    public View resolveViewName(String s, Locale locale) {
        ExcelView view = new ExcelView();
        return view;
    }
}