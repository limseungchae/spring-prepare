package com.sparta.springprepare.Memo;
import lombok.*;

// 필드에 대한 getter 메서드를 생성합니다.
@Getter
// 필드에 대한 setter 메서드를 생성합니다.
@Setter
// 파라미터 없는 생성자를 생성합니다.
@NoArgsConstructor
// 모든 필드를 파라미터로 받는 생성자를 생성합니다.
@AllArgsConstructor
// 필드만 파라미터로 받는 생성자를 생성합니다.
@RequiredArgsConstructor
public class Memo {
    private String username;
    private String contents;
}

