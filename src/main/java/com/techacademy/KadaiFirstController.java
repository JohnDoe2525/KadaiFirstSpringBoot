package com.techacademy;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/dayofweek/{val}")
    public DayOfWeek dispDayOfWeek(@PathVariable String val) {
        int yearStr = Integer.parseInt(val.substring(0,4));
        int monthStr = Integer.parseInt(val.substring(4,6));
        int dayStr = Integer.parseInt(val.substring(6,8));
        LocalDate ld = LocalDate.of(yearStr, monthStr, dayStr);
        DayOfWeek dw = ld.getDayOfWeek();
        return dw;
    }
    @GetMapping("/minus/{val1}/{val2}")
    public int calcMinus(@PathVariable int val1 ,@PathVariable int val2){
        int ans;
        ans = val1 - val2;
        return ans;
    }
    @GetMapping("/times/{val1}/{val2}")
    public int calcTimes(@PathVariable int val1 ,@PathVariable int val2){
        int ans;
        ans = val1 * val2;
        return ans;
    }
    @GetMapping("/divide/{val1}/{val2}")
    public int calcPlus(@PathVariable int val1 ,@PathVariable int val2){
        int ans;
        ans = val1 / val2;
        return ans;
    }

}
