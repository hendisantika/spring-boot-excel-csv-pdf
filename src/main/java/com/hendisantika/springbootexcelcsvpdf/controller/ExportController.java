package com.hendisantika.springbootexcelcsvpdf.controller;

import com.hendisantika.springbootexcelcsvpdf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-excel-csv-pdf
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/02/18
 * Time: 06.32
 * To change this template use File | Settings | File Templates.
 */

@Controller
public class ExportController {
    @Autowired
    UserService userService;

    /**
     * Handle request to download an Excel document
     */
    @RequestMapping(value = "/download", method = RequestMethod.GET)
    public String download(Model model) {
        model.addAttribute("users", userService.findAllUsers());
        return "";
    }
}
