package com.book.controller;

import com.book.UserMapper.UserMapper;
import com.book.pojo.User;
import com.book.service.BookService;
import com.book.service.UserService;
import com.book.utils.HttpRequest;
import com.book.utils.Page;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class BookConoller {
    @Resource
    BookService bookService;
    @Resource
    UserMapper userMapper;
    @Resource
    UserService userService;
    @RequestMapping(value = "/bookLists")
    public Page bookLists(String pageIndex){
      /*  ModelAndView modelAndView = new ModelAndView();*/
        if(pageIndex==null||pageIndex==""){
            pageIndex = "1";
        }
        Page page = new Page();
        page.setPageSize(2);
        page.setCount(bookService.count());
        page.setPageIndex(Integer.parseInt(pageIndex));
        if(page.getPageIndex()<1){
            page.setPageIndex(1);
        }else if(page.getPageIndex()>page.getPageCount()){
            page.setPageIndex(page.getPageCount());
        }
        page.setFrom((page.getPageIndex()-1)*page.getPageSize());
        page.setBookList(bookService.bookList(page.getFrom(),page.getPageSize()));
     /*   modelAndView.addObject("page",page);
        modelAndView.setViewName("index");*/
        return page;
    }
    @RequestMapping("/login")
    public User userLogin(String userName, String password, HttpServletRequest request){
        User user = userMapper.user(userName,password);
        request.getSession().setAttribute("user",user);
        return user;
    }
    @RequestMapping(value = "/bookList")
    public ModelAndView bookList(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }
    @GetMapping(value = "/add/{number}")
    public HttpRequest add(@PathVariable("number")Integer number){
        userService.addUser(number);
        return HttpRequest.success();
    }
}
