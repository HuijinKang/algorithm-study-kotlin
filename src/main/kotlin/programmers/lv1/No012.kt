package programmers.lv1
//  두 정수 사이의 합
/*
    문제 설명
        두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
        예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

    제한 조건
        a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
        a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
        a와 b의 대소관계는 정해져있지 않습니다.

    입출력 예
        a	b	return
        3	5	12
        3	3	3
        5	3	12
 */

// 정답
class No012 {
    // 1
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0

        if (a == b) return a.toLong()

        when (a < b) {
            true -> for (i in a..b) answer += i
            else -> for (i in b..a) answer += i
        }

        return answer
    }

    // 2
    fun solution2(a: Int, b: Int): Long {
        return if (a==b) a.toLong()
        else {
            val (start, end) = if (a < b) a to b else b to a
            val sum = (start + end) * (end - start + 1) / 2
            sum.toLong()
        }
    }
}

fun main() {
    val no012 = No012()
    print(no012.solution2(3, 3))
}