package com.book.service;

import com.book.BookMapper.BookMapper;
import com.book.pojo.Book;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    @Resource
    BookMapper bookMapper;
    @Override
    public List<Book> bookList(Integer from, Integer pageIndex) {
        return bookMapper.bookList(from,pageIndex);
    }

    @Override
    public int count() {
        return bookMapper.count();
    }
}
