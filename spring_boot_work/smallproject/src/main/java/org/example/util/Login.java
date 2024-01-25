package org.example.util;

import org.example.mh.Member;

public class Login {
    //DBmember 객체 담고
    public static Member member;
    // 로그인 여부를 저장
    public static boolean login;

    public static String getRole(){
        return member.getRole();
    }
}
