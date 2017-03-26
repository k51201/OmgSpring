package ru.vampa.spring.core.beans;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by vampa on 21.03.2017.
 */
public class Event {
    private static int currentId = 0;

    private int id;
    private String msg;
    private Date date;
    private DateFormat dateFormat;

    public Event(Date date, DateFormat dateFormat) {
        id = currentId++;
        this.date = date;
        this.dateFormat = dateFormat;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public boolean isDay(int start, int end) {
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        return (start < hour) && (hour < end);
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", date=" + dateFormat.format(date) +
                '}';
    }
}
