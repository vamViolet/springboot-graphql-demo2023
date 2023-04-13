package com.xiaoqi.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.xiaoqi.entity.Member;
import com.xiaoqi.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/***
 * GraphQLQueryResolver相当于controller，用于提供接口
 */
@Component
public class MemberQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private MemberService memberService;

    public Member getMember(String memberId) {
        return memberService.getById(memberId);
    }
}