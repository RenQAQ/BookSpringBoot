package com.book.service;

import com.book.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    List<Book> bookList(@Param("from") Integer from,
                        @Param("pageIndex") Integer pageIndex);

    int count();
}
