package com.gupaoedu.yangzk.observer.gperadvice;

/**
 * 创建问题对象
 */
public class Question {

    private String userName;//提问者姓名
    private String content;//问题信息

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
