package com.hendisantika.springbootexcelcsvpdf.service;

import com.hendisantika.springbootexcelcsvpdf.model.User;
import com.hendisantika.springbootexcelcsvpdf.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-excel-csv-pdf
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/02/18
 * Time: 20.53
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserService {

    final String candidateChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    final String candidateNum = "0123456789";


    @Autowired
    Utils appUtil;

    public List<User> findAllUsers() {


        List<User> users = IntStream.rangeClosed(1, 20)
                .mapToObj(i -> new User(appUtil.generateRandomChars(candidateChars, 10), appUtil.generateRandomChars(candidateChars, 10), appUtil.generateRandonInteger(i),
                        appUtil.generateRandomChars(candidateChars, 15), appUtil.generateRandomChars(candidateChars, 15), appUtil.generateRandomChars(candidateChars, 20),
                        appUtil.generateRandomChars(candidateChars, 10), appUtil.generateRandomChars(candidateChars, 10), appUtil.generateRandomChars(candidateNum, 10)))
                .collect(Collectors.toList());

        return users;

    }
}