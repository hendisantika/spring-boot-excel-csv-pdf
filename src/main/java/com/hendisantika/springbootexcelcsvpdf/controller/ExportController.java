package com.hendisantika.springbootexcelcsvpdf.controller;

import com.hendisantika.springbootexcelcsvpdf.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
@RequiredArgsConstructor
public class ExportController {
    private final UserService userService;

    /**
     * Handle request to download an Excel document
     */
    @GetMapping(value = "/download")
    public String download(Model model) {
        model.addAttribute("users", userService.findAllUsers());
        return "";
    }
}
