package programmers.lv1

/**
 * 문제 명
 * 평균 구하기
 *
 * 문제 설명
 * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
 *
 * 제한사항
 * arr은 길이 1 이상, 100 이하인 배열입니다.
 * arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
 *
 * 입출력 예
 * arr	        return
 * [1,2,3,4]	2.5
 * [5,5]	    5
 * */

// 정답
class No003 {
    // 1 average()
    fun solution(arr: IntArray): Double = arr.average()

    // 2 forEach
    fun solution2(arr: IntArray): Double {
        var answer = 0.0

        arr.forEach { answer += it } //== arr.forEach { i -> answer += i }

        answer /= arr.size

        return answer
    }

    // 3 for
    fun solution3(arr: IntArray): Double {
        var sum: Double = .0

        for (i in arr) {
            sum += i
        }

        return sum / arr.size
    }
}

fun main() {
}

fun solution2(arr: IntArray): Double = arr.average()