package org.example.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {

    private static long id = 0;
    private Map<String,Member> map =
            new HashMap<>();
    public void insert(Member member){
        map.put(member.getEmail(),member);

    }
}
