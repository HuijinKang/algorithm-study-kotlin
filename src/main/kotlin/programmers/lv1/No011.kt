package programmers.lv1
//  하샤드 수
/*
    문제 설명
        양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
        예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
        자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

    제한 조건
        x는 1 이상, 10000 이하인 정수입니다.

    입출력 예
        x	return
        10	true
        12	true
        11	false
        13	false

    입출력 예 설명
    입출력 예 #1
        10의 모든 자릿수의 합은 1입니다. 10은 1로 나누어 떨어지므로 10은 하샤드 수입니다.
    입출력 예 #2
        12의 모든 자릿수의 합은 3입니다. 12는 3으로 나누어 떨어지므로 12는 하샤드 수입니다.
    입출력 예 #3
        11의 모든 자릿수의 합은 2입니다. 11은 2로 나누어 떨어지지 않으므로 11는 하샤드 수가 아닙니다.
    입출력 예 #4
        13의 모든 자릿수의 합은 4입니다. 13은 4로 나누어 떨어지지 않으므로 13은 하샤드 수가 아닙니다.
 */

// 정답
class No011 {
    // 1
    fun solution(x: Int): Boolean {
        var sum: Int = 0
        x.toString().toCharArray().forEach {sum += it.digitToInt() }

        return when(x % sum == 0) {
            true -> true
            false -> false
        }
    }

    // 2
    fun solution2(x: Int): Boolean {
        /*
        fold 함수는 컬렉션의 각 요소에 대해 지정된 초기값과 함께 주어진 작업을 수행하는 함수입니다.
        여기서 fold(0)에서 0은 초기값을 나타냅니다. 초기값은 연산을 시작할 때 사용되며, 각 요소에 대한 작업에 대한 누적값의 초기값입니다.
        즉, 이 코드에서는 합계를 나타내는 변수를 0으로 초기화하고, 각 자릿수를 더해 나가는 작업을 수행하게 됩니다.
        * */
        return x % x.toString().toCharArray().fold(0){acc, digitChar -> acc + digitChar.digitToInt()} == 0
    }

    // 3
    fun solution3(x: Int): Boolean =
        x % x.toString().sumBy { it - '0' } == 0
}

fun main() {
    val no011 = No011()
    print(no011.solution3(11))
}