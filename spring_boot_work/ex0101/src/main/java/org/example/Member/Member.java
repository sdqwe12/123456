package org.example.Member;
import lombok.*;

@Data
//@Setter
//@Getter // getter 메서드
//@AllArgsConstructor // 생성자
@Builder
@ToString
public class Member {
    private String email;
    private String password;
    private String name;
    private String login_satate;
    private String sign_date;
  }