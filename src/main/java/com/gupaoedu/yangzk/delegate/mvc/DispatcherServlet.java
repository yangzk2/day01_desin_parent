package com.gupaoedu.yangzk.delegate.mvc;


import com.gupaoedu.yangzk.delegate.mvc.controller.MemberController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


public class DispatcherServlet  extends HttpServlet {

 private List<Handler> handlerMapping = new ArrayList<Handler>();

    public void init() throws ServletException {
        try {
            Class<?> memberControllerClass = MemberController.class;
            handlerMapping.add(new Handler().setController(memberControllerClass.newInstance())
                    .setMethod(memberControllerClass.getMethod("getMemberById",new Class[]{String.class}))
                    .setUrl("/web/getMemberById.json"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void doDispach(HttpServletRequest request,HttpServletResponse response){
        //1、获取用户请求的url
        //   如果按照J2EE的标准、每个url对对应一个Serlvet，url由浏览器输入
        String uri = request.getRequestURI();

        //2、Servlet拿到url以后，要做权衡（要做判断，要做选择）
        //   根据用户请求的URL，去找到这个url对应的某一个java类的方法

        //3、通过拿到的URL去handlerMapping（我们把它认为是策略常量）
        Handler h = null;
        for (Handler handler:handlerMapping) {
            if(uri.equals(h.getUrl())){
                h = handler;
                break;
            }
        }
        //4、将具体的任务分发给Method（通过反射去调用其对应的方法）
        Object obj = null;
        try {
            obj = h.getMethod().invoke(h.getController(),request.getParameter("mid"));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
//    private void doDispach(HttpServletRequest req, HttpServletResponse res) throws IOException {
//        //获取用户请求的url
//         String uri = req.getRequestURI();
//       //获取请求的参数
//        String mid = req.getParameter("mid");
//       //根据请求的url判断进入的是那个controller
//        if("getMemberById".equals(uri)){
//            new MemberController().getMemberById(mid);
//        }else if("getOrderById".equals(uri)){
//            new OrderController().getOrderById(mid);
//        }else if("logout".equals(uri)){
//            new SystemController().logout(mid);
//        }else{
//            res.getWriter().write("404 Not Found!!");
//        }
//    }



    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //完成调度
        doDispach(req,resp);
    }


    class Handler{
        String url;
        Method method;
        Object Controller;

        public String getUrl() {
            return url;
        }

        public Handler setUrl(String url) {
            this.url = url;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }

        public Object getController() {
            return Controller;
        }

        public Handler setController(Object controller) {
            Controller = controller;
            return this;
        }
    }



























}
