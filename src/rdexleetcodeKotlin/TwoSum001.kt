package rdexleetcodeKotlin

/* Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution,
and you may not use the same element twice.
*/

class TwoSum001 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var a = 0
        var b = 0
        val numsHashMap = mutableMapOf<Int, Int>()

        for ((index, num) in nums.withIndex()) {
            val numDiff = target - num
            if (numsHashMap.contains(numDiff)) {
                a = index
                b = numsHashMap[numDiff]!!
                break
            }
                    numsHashMap[num] = index
        }
        return intArrayOf(a, b)
    }
}
