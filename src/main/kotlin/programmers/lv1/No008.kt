package programmers.lv1

import java.util.Arrays

//  자연수 뒤집어 배열로 만들기
/*
    문제 설명
        자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

    제한 조건
        n은 10,000,000,000이하인 자연수입니다.

    입출력 예
        n	    return
        12345	[5,4,3,2,1]
 */

// 정답
class No008 {
    // 1
    fun solution(n: Long): IntArray {
        var answer = IntArray(n.toString().length)
        val rvs = n.toString().reversed()

        for (i in 0 until rvs.length) answer[i] = rvs[i].digitToInt()
        return answer
    }

    // 2 리팩토링
    fun solution2(n: Long): IntArray {
        return n.toString().reversed().map { it.digitToInt() }.toIntArray()
    }
}

fun main() {
    val no008 = No008()
    print(Arrays.toString(no008.solution2(12345)))
}