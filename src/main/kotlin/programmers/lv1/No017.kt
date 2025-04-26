package programmers.lv1
//  없는 숫자 더하기
/*
    문제 설명
        0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
        numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.

    제한사항
        1 ≤ numbers의 길이 ≤ 9
        0 ≤ numbers의 모든 원소 ≤ 9
        numbers의 모든 원소는 서로 다릅니다.

    입출력 예
        numbers	            result
        [1,2,3,4,6,7,8,0]	14
        [5,8,4,0,6,7,9]	    6

    입출력 예 설명
    입출력 예 #1
        5, 9가 numbers에 없으므로, 5 + 9 = 14를 return 해야 합니다.
    입출력 예 #2
        1, 2, 3이 numbers에 없으므로, 1 + 2 + 3 = 6을 return 해야 합니다.
 */

//정답
class No017 {
    // 1
    fun solution(numbers: IntArray): Int {
        var answer: Int = 45
        answer -= numbers.sum()

        return answer
    }

    // 2
    fun solution2(numbers: IntArray): Int
        = (0..9).filter { it !in numbers }.sum()

    // 3
    fun solution3(numbers: IntArray): Int
        = (0..9).filterNot { it in numbers }.sum()

    // 4
    fun solution4(numbers: IntArray): Int
            = (0..9).filterNot(numbers::contains).sum()
}

fun main() {
    val no017 = No017()
    print(no017.solution4(intArrayOf(5,8,4,0,6,7,9)))
}