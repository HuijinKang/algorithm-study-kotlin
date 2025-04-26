package leetcode.problems.easy
//  Number of Good Pairs
/*
    Given an array of integers nums, return the number of good pairs.
    A pair (i, j) is called good if nums[i] == nums[j] and i < j.

    Example 1:
        Input: nums = [1,2,3,1,1,3]
        Output: 4
        Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

    Example 2:
        Input: nums = [1,1,1,1]
        Output: 6
        Explanation: Each pair in the array are good.

    Example 3:
        Input: nums = [1,2,3]
        Output: 0

    Constraints:
        1 <= nums.length <= 100
        1 <= nums[i] <= 100
 */

// 정답
class No1512 {
    // 1
    fun numIdenticalPairs(nums: IntArray): Int {
        var answer = 0

        for (i in 0 until nums.size) { //== nums.indices
            for (j in 1 until nums.size) {
                if (i < j && nums[i] == nums[j]) {
                    answer++
                }
            }
        }

    return answer
    }

    // 2
    fun numIdenticalPairs2(nums: IntArray): Int {
        return nums.indices.flatMap { i ->
            nums.indices.filter { j -> i < j && nums[i] == nums[j] }
        }.count()
    }
}

fun main() {
    val no1512 = No1512()
    print(no1512.numIdenticalPairs2(intArrayOf(1,2,3,1,1,3)))
}