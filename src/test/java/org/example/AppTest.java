package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {
    // 테스트 유틸 시작
    @Test
    @DisplayName("스캐너에 키보드입력이 아닌 문자열을 입력으로 설정")
    public void t1() {
        Scanner sc = TestUtil.genScanner("안녕");

        String cmd = sc.nextLine().trim();
        assertThat(cmd).isEqualTo("안녕");
    }

//    @Test
//    @DisplayName("출력을 모니터에 하지 않고 문자열로 얻기")
//    public void t2() {
//        // System.out에 대한 화면출력 금지 시작
//        ByteArrayOutputStream output = TestUtil.setOutToByteArray();
//        System.out.println("안녕");
//
//        // 그 동안 출력되지 않던 내용들을 문자열로 반환
//        String rs = output.toString();
//
//        TestUtil.clearSetOutToByteArray();
//    }
//    // 테스트유틸 테스트 끝
//
//    // 앱 ㅔㅌ스트 시작
//    @Test
//    @DisplayName("프로그램 시작시 타이틀 출력 그리고 종료")
//    public void t3() {
//        Scanner sc = TestUtil.getScanner("종료");
//        ByteArrayOutputStream output = TestUtil.setOutToByteArray();
//
//        new App(sc).run();
//
//        String rs = output.toString();
//        TestUtil.clearSetOutToByteArray(output);
//
//        assertThat(rs)
//                .contains("== 명언 앱 ==")
//                .contains("명령) ")
//                .contains("프로그램이 종료되었습니다.");
//                .doesNotContain("올바르지 않은 명령입니다.");
//    }
//
//    @Test
//    @DisplayName("잘못된 명령어 ㅇㅂ력에 대한 처리")
//    public void t4() {
//        Scanner sc = IestUtil.getScanner("""
//                종료2
//                종료
//                """.stripIndent().trim());
//        B
//        assertThat
//    }
    // 앱 테스트 끝
}
