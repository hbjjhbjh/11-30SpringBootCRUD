package com.jdbc.sspringboot.dao;

import com.jdbc.sspringboot.pojo.Member;

import java.util.List;

public interface MemberMapper {

    //增加
    void insertPage(Member member);
    //删除
    void deletePage(Integer id);
    //根据ID查询
    Member selectByIdMember(Integer id);
    //修改
    void deleteById(Member member);
    //查询
    List<Member> selectPage();
}
