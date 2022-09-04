package me.whiteship.refactoring._02_duplicated_code;

/**
 * 냄새 2. 중복 코드
 * - 중복 코드의 단점
 * > 비슷한지, 완전히 동일한 코드인지 주의 깊게 봐야한다.
 * > 코드를 변경할때, 동일한 모든 곳의 코드를 변경해야한다.
 *
 * - 사용할 수 있는 리팩토링 기술
 * 1) 동일한 코드를 여러 메서드에서 사용하는 경우, 함수 추출하기 (Extract Function)
 * 2) 코드가 비슷하게 생겼지만 완전히 같지 않은 경우, 코드 분리하기 (Slide Statements)
 * 3) 여러 하위 클래스(상속 관계)에 동일한 코드가 있다면, 메서드 올리기 (Pull Up Method)
 */
public class Main {
}
