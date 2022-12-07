package com.algorithm._00_알고리즘_구현.youtube1;

/*
백트래킹
- 모든 경우의 수를 확인해야 할때
  > for 로는 확인이 불가능한 경우 (깊이가 달라질때)

(예시)
순열 (M개의 숫자에서 N개를 뽑을때 순서가 상관있는 것)
3개의 숫자(1,2,3) 중에 2개를 뽑을때
1,2
1,3
2,3
2,1
3,1
3,2

위를 구현하려고하면 for 로 할 수 있다.
for (1 ~ 3)
   for (1 ~ 3) // 위 for문에서 해당하지 않은 숫자를 선택

위 깊이는 2다.
위 코드에서 N이 만약 3이라면 더이상 for 문을 늘려서 사용할 수가 없다. -> 이런 경우에 백트래킹을 사용한다.
(3,2)가 확실히 정해지지 않고 (N, M)일때는 위 반복문으로 처리가 불가능하다. 깊이가 달라지기 때문이다.

(N, M)이 불확실할때 백트래킹을 사용한다.

트리 방식으로 이해하자.

     0
  1   2   3
 2 3 1 3 1 2

각 하나의 깊이가 for 문이다.


이거를 재귀함수로 구현해야한다.

(재귀함수 예시)
recur(num) {}
if (num == M) // 끝나는 조건 필요 (M개가 뽑혔을경우. for 문 반복시바다 깊이 +1이므로 이 값이 M이면 됨)
   return n;
for ( 1 ~ N )
   방문 여부 확인 (if)

   방문 여부 true 변경
   결과값 추가

   recur(num) // 재귀함수 호출

   // 다시 되돌리는 로직이 필요하다.
   방문 여부 false 변경
   결과값 제거


[시간복잡도]
중복이 가능 : N^N (N = 8까지 가능)
중복이 불가 : N! (N = 10까지 가능)
-> 1 ~ N개 까지의 for 문을 도는 경우 -> 1 ~ N -1 개까지 for 문
   : N x (N - 1) x (N - 2) ... = N!

[팁]
- 백트래킹 문제는 N이 작다.
- 재귀함수 사용할때 종료 시점 잊지말자.

 */
public class _03_백트래킹 {
}
