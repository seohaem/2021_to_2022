package Y02_구현;

import java.util.Scanner;

public class Exam1_상하좌우 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N을 입력받기
        int n = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기
        String[] plans = sc.nextLine().split(" ");
        int x = 1, y = 1;

        /* 구현 */
        for (int i = 0; i < plans.length; i++) {
            char plan = plans[i].charAt(0);

            if (plan == 'L') {
                if (y - 1 > 1) {
                    y = y - 1;
                }
            } else if (plan == 'R') {
                if (y + 1 < n) {
                    y = y + 1;
                }
            } else if (plan == 'U') {
                if (x - 1 > 1) {
                    x = x - 1;
                }
            } else if (plan == 'D') {
                if (x + 1 < n) {
                    x = x + 1;
                }
            }
        }

        System.out.println(x + " " + y);
    }

    /* 해설 */
    public static void 해답보기() {
        Scanner sc = new Scanner(System.in);

        // N을 입력받기
        int n = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기
        String[] plans = sc.nextLine().split(" ");
        int x = 1, y = 1;

        // L, R, U, D에 따른 이동 방향
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] moveTypes = {'L', 'R', 'U', 'D'};

        // 이동 계획을 하나씩 확인
        for (int i = 0; i < plans.length; i++) {
            char plan = plans[i].charAt(0);
            // 이동 후 좌표 구하기
            int nx = -1, ny = -1;
            for (int j = 0; j < 4; j++) {
                if (plan == moveTypes[j]) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            // 공간을 벗어나는 경우 무시
            if (nx < 1 || ny < 1 || nx > n || ny > n) continue;
            // 이동 수행
            x = nx;
            y = ny;
        }

        System.out.println(x + " " + y);
    }
}
