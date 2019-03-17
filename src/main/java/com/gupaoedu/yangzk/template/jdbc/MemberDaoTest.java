package com.gupaoedu.yangzk.template.jdbc;

import com.gupaoedu.yangzk.template.jdbc.dao.MemberDao;

import java.util.List;

/**
 * 测试类
 */
public class MemberDaoTest {

    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
        System.out.println(result);
    }
}
