package org.example;

import java.util.Scanner;

public class App {
    private Scanner sc;
    public App(Scanner sc) {
        this.sc = sc;

    }

    private int lastWiseSayingId = 1;

    public void run() {
        System.out.println("==명언 앱==");
        System.out.print("명령) ");

        String cmd = sc.nextLine().trim();

        switch (cmd) {
            case "종료" :
                System.out.println("프로그램이 종료되었습니다.");
                return;
            case "등록":
                System.out.println("명언: ");
                String content = sc.nextLine().trim();
                System.out.println("작가: ");
                String authorName = sc.nextLine().trim();

                long id = ++lastWiseSayingId;
                System.out.printf("%d번 명언이 등록되었습니다.\n", id);
                break;
            default:
                System.out.printf("%s`(은)는 올바르지 않은 명령입니다.");
                break;
        }
    }
}
