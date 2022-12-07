package com.algorithm._00_알고리즘_구현.youtube1;

/*
MST
(Minimum Spanning Tree)

- Spanning Tree : 모든 노드가 연결된 트리
- MST : 최소의 비용으로 모든 노드가 연결된 트리
- Kruskal 알고리즘, Prim 알고리즘 으로 구현 가능

[Kruskal 알고리즘]
전체 간선 중 작은것부터 연결
https://devfunny.tistory.com/660

[Prim]
현재 연결된 트리에 이어진 간선중 가장 작은 것을 추가

[Heap]
- 최대값, 최소값을 빠르게 계산하기 위한 자료구조
- 이진트리 구조
- 처음에 저장할때부터 최대값, 최소값 결정하도록

      O
   O      O
 O   O  O   N (부모 노드와 비교하여 부모보다 작으면 위로, 그리고 부모노드와 계속 비교.. 그래서 최소값을 결정)

[아이디어]
- 최소 스패닝 트리 기본문제 외우기
- 간선을 인접 리스트 형태로 저장
- 시작점부터 힙에 넣기
- 힙이 빌때까지 수행
  -> 해당 노드 방문 안한곳일 경우
  -> 방문 체크, 비용 추가, 연결된 간선 새롭게 추가

[시간복잡도]
- Edge 리스트(인접)에 저장 : O(E)
- Heap 안에 모든 Edge에 연결된 간선 확인 : O(E + E)
- 모든 간선을 힙에 삽입 : O(ElgE)
- O(E + 2E + ElgE) = O(3E + ElgE) = O(E(3+lgE)) = O(ElgE)

[팁]
- 최소 스패닝 트리 코드는 그냥 외우기
- 중요한건, 해당 문제가 MST 문제인지 알아내는 능력
  -> 모든 노드가 연결되도록 한다거나
  -> 이미 연결된 노드를 최소의 비용으로 줄이기

*/
public class _09_MST {
}
