package rdexleetcodeKotlin

/*
Given an integer array nums and an integer k, return the k most frequent elements.
You may return the answer in any order.
 */

class TopKFrequentElements347 {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val freqMap = mutableMapOf<Int, Int>()  // <number, count>
        for (num in nums) {
            if (!freqMap.contains(num)) {
                freqMap[num] = 1
            } else {
                freqMap[num] = freqMap[num]!! + 1
            }
        }

        val outputMap = freqMap.toList().sortedBy { (_, value) -> value }.reversed().toMap()
        val outputArray = IntArray(size = k)
        var counter = 0

        for ((num, _) in outputMap) {
            outputArray[counter] = num
            counter++
            if (counter == k) break
        }

        return outputArray
    }
}