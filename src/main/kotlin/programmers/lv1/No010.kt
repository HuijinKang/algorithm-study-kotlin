package programmers.lv1

import java.util.Arrays

//  정수 내림차순으로 배치하기
/*
    문제 설명
        함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

    제한 조건
        n은 1이상 8000000000 이하인 자연수입니다.

    입출력 예
        n	    return
        118372	873211
 */

// 정답
class No010 {
    // 1
    fun solution(n: Long): Long {
        var answer: Long = 0
        val sortedList = n.toString().toCharArray().map { it.toString().toLong() }.sorted().reversed()
        answer = sortedList.joinToString(separator = "").toLong()

        return answer
    }

    // 2
    fun solution2(n: Long) = n.toString().toCharArray().sortedDescending().joinToString("").toLong()
}

fun main() {
    val no010 = No010()
    print(no010.solution2(31245))
}