package com.xw.controller;

import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;
import com.xw.bean.User;
import com.xw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.HttpServletBean;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

@org.springframework.stereotype.Controller
@RequestMapping("/home")
@SessionAttributes({"user"})
public class Controller {
    @Autowired
    UserService userService;

    @RequestMapping("/show")
    /*使用ModelAndView类型*/
    public ModelAndView select(ModelMap map) {
        List list = userService.selAll();
        System.out.println("list" + list);
        map.put("data", list);
        /*使用ModelAndView对象*/
        ModelAndView model = new ModelAndView();
        /*放入到需要返回的页面不用加后缀*/
        model.setViewName("show");
        return model;
    }

    @RequestMapping("/login")
    public ModelAndView userLogin(String username, String pwd, ModelMap map) {

        User user = userService.login(username, pwd);
        ModelAndView model = new ModelAndView();
        if (user != null) {
            map.put("user", user);
            model.setViewName("welcome");
            return model;
        } else {
            model.setViewName("index2");
            return model;
        }

    }

    @RequestMapping("/ajax")
    public String CheckName(String name, HttpServletRequest req, HttpServletResponse res) {

        return "ajaxCheckName";
    }

    @RequestMapping("/save")
    public void ajaxCheckName(String name, HttpServletRequest req, HttpServletResponse res) throws IOException {

        res.setContentType("text/html;charset=utf-8");
        PrintWriter pw = res.getWriter();

        User uu = userService.ckname(name);
        if (uu != null) {
            pw.println("昵称已经被占用,请重新命名");
        } else {
            pw.println("昵称可以使用");
        }
    }

    @RequestMapping("/editUser")
    public String editUser(ModelMap map, Integer userid) {

        User user = userService.editUser(userid);
        map.put("editUser", user);

        return "edit";
    }

    @RequestMapping("/delUser")
    public String delUser(Integer userID, ModelMap map) {

        int delUser = userService.delUser(userID);
        map.put("delUser", delUser);

//重定向
        return "redirect:show";
    }

    @RequestMapping("/insertUser")
    public String insertUser(){

        return "insertUser";
    }


    @RequestMapping("/true")
    public String user(Integer userid,String username,String pwd,String email,HttpServletResponse response,HttpServletRequest request) throws IOException {

        try {
            User user= new User(userid,username,pwd,email);
            userService.insertUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:show";
        }

}

