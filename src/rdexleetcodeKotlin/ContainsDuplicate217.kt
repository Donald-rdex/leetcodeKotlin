package rdexleetcodeKotlin
/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every
 element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 */

// Not the best for a Comp. Sci. solution, but uses Kotlin builtin to do the counting of uniq elements in array.

class ContainsDuplicate217 {
    fun containsDuplicate(nums: IntArray): Boolean {
        val numbersSize = nums.distinct().size
        return (nums.size != numbersSize)
    }
}