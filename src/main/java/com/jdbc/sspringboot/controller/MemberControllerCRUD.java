package com.jdbc.sspringboot.controller;

import com.jdbc.sspringboot.biz.MemberBiz;
import com.jdbc.sspringboot.pojo.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MemberControllerCRUD {

    @Autowired
    private MemberBiz memberBiz;


    @RequestMapping("/{templates}")
    public String templatesPage(@PathVariable("templates") String templates){
        System.out.println(templates);
        return templates;
    }

    //增加
    @RequestMapping(value = "savefinall")
    public String savefinall(Member member){
        memberBiz.saveAdd(member);

        return "redirect:showAllMember";
    }
    //删除
    @RequestMapping(value = "romersMember")
    public String romersMember(Integer id){
        memberBiz.romeMember(id);
        return "redirect:showAllMember";
    }
    //根据ID查询
    @RequestMapping("showAllById")
    public String showAllById(Model model,Integer id){
        Member member = memberBiz.finallByIdMember(id);
        model.addAttribute("memberById",member);
        return "updatePage";
    }
    //修改
    @RequestMapping("chanMember")
    public String chanMember(Member member){
        memberBiz.romerById(member);
        return "redirect:showAllMember";
    }
    //查询
    @RequestMapping( value = "showAllMember")
    public String showAllMember(Model model){
        List<Member> finall = memberBiz.finall();
        model.addAttribute("listMember",finall);
        for (Member me:finall) {
            System.out.println(me);
        }
        return "selectPage";
    }
}
