package com.hendisantika.springbootexcelcsvpdf.view;

import com.hendisantika.springbootexcelcsvpdf.model.User;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-excel-csv-pdf
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/02/18
 * Time: 06.02
 * To change this template use File | Settings | File Templates.
 */
public class CsvView extends AbstractCsvView {


    @Override
    protected void buildCsvDocument(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws Exception {

        response.setHeader("Content-Disposition", "attachment; filename=\"my-csv-file.csv\"");

        List<User> users = (List<User>) model.get("users");
        String[] header = {"Firstname", "LastName", "LastName", "JobTitle", "Company", "Address", "City", "Country", "PhoneNumber"};
        ICsvBeanWriter csvWriter = new CsvBeanWriter(response.getWriter(),
                CsvPreference.STANDARD_PREFERENCE);

        csvWriter.writeHeader(header);

        for (User user : users) {
            csvWriter.write(user, header);
        }
        csvWriter.close();


    }
}