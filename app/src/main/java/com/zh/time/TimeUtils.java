package com.zh.time;

/**
 * create by zj on 2019/11/5
 */
public class TimeUtils {


    /**
     * @param d
     * @return
     * 倒计时
     */
    public static String cutHHIf0(long d) {
        StringBuilder stringBuilder = new StringBuilder("");
        long hour = 0;
        long minute = d / 1000 / 60;
        long second;
        if (minute >= 60) {
            hour = minute / 60;
            minute = minute - (hour * 60);
            second = (d / 1000) - (hour * 60 * 60) - (minute * 60);
        } else {
            second = (d / 1000) - (minute * 60);
        }
        if (hour == 0) {
            stringBuilder.append(append0(minute)).append(":").append(append0(second));
        } else if (hour > 0) {
            stringBuilder.append(append0(hour)).append(":").append(append0(minute)).append(":").append(append0(second));
        }
        return stringBuilder.toString();
    }


    private static String append0(long d) {
        if (d >= 0 && d < 10) {
            return "0" + d;
        }
        return d + "";
    }

}
