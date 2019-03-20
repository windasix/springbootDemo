package com.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class HelloController {

  @RequestMapping("/hello")
  public String hello() {
    return "Hello223";
  }

//  @Scheduled(fixedRate = 1000)
//  @Scheduled(fixedDelay = 1000, initialDelay = 3000)
  @Scheduled(cron = "0 3,4 * * * ? ")
  public void getStudentSchedule() {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    Date date = new Date();
    String str = sdf.format(date);
    System.out.println(str);
  }

}
