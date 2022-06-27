package rdexleetcodeKotlin

fun main() {
    testValidAnagram242() // Problem242
    testTopKFrequentElements347() // Problem 347
    testContainsDuplicate217() // problem 217
    testValidPalindrome()  // Problem 125
    testTwoSum() // Problem 001 test cases
}


fun testValidAnagram242() {
    val testCase = ValidAnagram242()
    val test1InputA = "anagram"
    val test1InputB = "nagaram"

    println("242 Valid Anagram: ${testCase.isAnagram(test1InputA, test1InputB)}")
}

fun testTopKFrequentElements347() {
    val testInputList = intArrayOf(1, 1, 1, 2, 2, 3)
    val testTargetFreq = 2

    println(
        "347 Top K Frequent Elements: ${
            TopKFrequentElements347().topKFrequent(testInputList, testTargetFreq).contentToString()
        }"
    )
}

fun testContainsDuplicate217() {
    val test1 = ContainsDuplicate217()
    val test1Input = intArrayOf(1, 2, 3, 1)

    println("217: ${test1.containsDuplicate(test1Input)}")
}

fun testTwoSum() {
    val testCase = TwoSum001()

    val testInput = intArrayOf(2, 4, 3)
    val testTarget = 6

    val solutionPair = testCase.twoSum(testInput, testTarget)

    println("001 Two Sum: ${solutionPair.contentToString()}")
}

fun testValidPalindrome() {
    val testCase = ValidPalindrome()

    val testInput = "9A man, a plan, a canal: Panama9"
    println("125 Valid Palindrome: ${testCase.isPalindrome(testInput)}")
}