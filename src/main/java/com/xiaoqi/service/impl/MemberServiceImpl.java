package com.xiaoqi.service.impl;


import com.xiaoqi.entity.Member;
import com.xiaoqi.service.MemberService;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    @Override
    public Member getById(String memberId) {
        Member member = new Member();
        member.setMemberId(memberId);
        member.setName("name");
        member.setAge(2023);
        return member;
    }
}
