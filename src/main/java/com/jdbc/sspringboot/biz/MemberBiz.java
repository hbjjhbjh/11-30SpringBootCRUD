package com.jdbc.sspringboot.biz;

import com.jdbc.sspringboot.pojo.Member;

import java.util.List;

public interface MemberBiz {
    //增加
    void saveAdd(Member member);
    //删除
    void romeMember(Integer id);
    //根据ID查询
    Member finallByIdMember(Integer id);
    //修改
    void romerById(Member member);
    //查询
    List<Member> finall();
}
