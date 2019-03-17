package com.gupaoedu.yangzk.template.jdbc.dao;


import com.amazonaws.util.json.JSONObject;
import com.amazonaws.util.json.JSONUtils;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.gupaoedu.yangzk.template.jdbc.JdbcTemplate;
import com.gupaoedu.yangzk.template.jdbc.Member;
import com.gupaoedu.yangzk.template.jdbc.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * 通过模板模式实现jdbc封装
 */
public class MemberDao extends JdbcTemplate {
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }
//查询所有
    public List<?> selectAll(){

        String sql = "select * from t_member";
        return super.executeQuery(sql, new RowMapper<Member>() {
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setUsername(rs.getString("username"));
                member.setPassword(rs.getString("password"));
                member.setAge(rs.getInt("age"));
                member.setAddr(rs.getString("addr"));
                return member;
            }
        },null);
    }
}
