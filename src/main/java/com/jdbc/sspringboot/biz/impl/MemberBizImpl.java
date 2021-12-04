package com.jdbc.sspringboot.biz.impl;

import com.jdbc.sspringboot.biz.MemberBiz;
import com.jdbc.sspringboot.dao.MemberMapper;
import com.jdbc.sspringboot.pojo.Member;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class MemberBizImpl implements MemberBiz {

    @Resource
    private MemberMapper memberMapper;


    //增加
    @Override
    public void saveAdd(Member member) {
        memberMapper.insertPage(member);
    }
    //删除
    @Override
    public void romeMember(Integer id) {
        memberMapper.deletePage(id);
    }
    //根据ID查询
    @Override
    public Member finallByIdMember(Integer id) {
        Member member = memberMapper.selectByIdMember(id);
        return member;
    }
    //修改
    @Override
    public void romerById(Member member) {
        memberMapper.deleteById(member);
    }
    //查询
    @Override
    public List<Member> finall() {
        List<Member> members = memberMapper.selectPage();
        for (Member member:members) {
            System.out.println(member);
        }
        return members;
    }
}
