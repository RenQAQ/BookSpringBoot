package com.book.BookMapper;

import com.book.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface BookMapper {
    public List<Book> bookList(@Param("from") Integer from,
                               @Param("pageSize") Integer pageIndex);

    public int count();
}
