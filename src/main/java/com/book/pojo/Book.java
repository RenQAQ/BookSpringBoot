package com.book.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class Book {
    private int book_id;
    private String book_code;
    private String book_name;
    private int book_type;
    private String book_atuthor;
    private String publish_press;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date publish_date;
    private int is_borrow;

    public int getIs_borrow() {
        return is_borrow;
    }

    public void setIs_borrow(int is_borrow) {
        this.is_borrow = is_borrow;
    }

    private String createdBy;
    private Date creation_time;
    private Date last_updatetime;

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_code() {
        return book_code;
    }

    public void setBook_code(String book_code) {
        this.book_code = book_code;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public int getBook_type() {
        return book_type;
    }

    public void setBook_type(int book_type) {
        this.book_type = book_type;
    }

    public String getBook_atuthor() {
        return book_atuthor;
    }

    public void setBook_atuthor(String book_atuthor) {
        this.book_atuthor = book_atuthor;
    }

    public String getPublish_press() {
        return publish_press;
    }

    public void setPublish_press(String publish_press) {
        this.publish_press = publish_press;
    }

    public Date getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(Date publish_date) {
        this.publish_date = publish_date;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreation_time() {
        return creation_time;
    }

    public void setCreation_time(Date creation_time) {
        this.creation_time = creation_time;
    }

    public Date getLast_updatetime() {
        return last_updatetime;
    }

    public void setLast_updatetime(Date last_updatetime) {
        this.last_updatetime = last_updatetime;
    }
}
