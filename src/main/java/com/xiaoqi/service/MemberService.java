package com.xiaoqi.service;

import com.xiaoqi.entity.Member;

/**
 * Copyright (C), 2010-2023, 广州广电运通智能科技有限公司 <br>
 * fileName:     MemberService <br>
 *
 * @author: dongxiaoqi <br>
 * date:         2023/04/12 0012 14:05 <br>
 * description:   <br>
 * history: <br>
 * <author>      <time>          <version>          <desc> <br>
 * 作者姓名       修改时间         版本号             描述 <br>
 */
public interface MemberService {

    Member getById(String memberId);
}
