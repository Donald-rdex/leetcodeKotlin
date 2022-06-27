package rdexleetcodeKotlin

fun main() {
    testValidPalindrome()  // Problem 125
    testTwoSum() // Problem 001 test cases
}

fun testTwoSum() {
    val testCase = TwoSum001()

    val testInput = intArrayOf(2,4,3)
    val testTarget = 6

    val solutionPair = testCase.twoSum(testInput, testTarget)

    println(solutionPair.contentToString())
}

fun testValidPalindrome() {
    val testCase = ValidPalindrome()

    val testInput = "9A man, a plan, a canal: Panama9"
    println(testCase.isPalindrome(testInput))
}