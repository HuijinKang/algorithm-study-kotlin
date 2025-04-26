package programmers.lv1
//  자릿수 더하기
/*
    문제 설명
        자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
        예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

    제한사항
        N의 범위 : 100,000,000 이하의 자연수

    입출력 예
        N	answer
        123	6
        987	24

    입출력 예 설명
    입출력 예 #1
        문제의 예시와 같습니다.
    입출력 예 #2
        9 + 8 + 7 = 24이므로 24를 return 하면 됩니다.
 */

// 정답
class No007 {
    // 1
    fun solution(n: Int): Int {
        var answer = 0
        val number = n.toString()

        for (i in 0 until number.length) {
            answer += number[i].digitToInt()
        }
        return answer
    }

    // 2 리팩토링
    fun solution2(n: Int): Int {
        return n.toString().sumOf { it.digitToInt() }
    }

    // 3
    fun solution3(n: Int): Int {
        var answer = 0

        for (nn in n.toString()) { //for 활용
            answer += (nn.toString()).toInt()
        }

        return answer
    }
}

fun main() {
    val no007 = No007()
    print(no007.solution(987))
}