package rdexleetcodeKotlin

fun main() {
    testContainsDuplicate217() // problem 217
    testValidPalindrome()  // Problem 125
    testTwoSum() // Problem 001 test cases
}


fun testContainsDuplicate217() {
    val test1 = ContainsDuplicate217()
    val test1Input = intArrayOf(1, 2, 3, 1)

    println("217: ${test1.containsDuplicate(test1Input)}")
}
fun testTwoSum() {
    val testCase = TwoSum001()

    val testInput = intArrayOf(2,4,3)
    val testTarget = 6

    val solutionPair = testCase.twoSum(testInput, testTarget)

    println("001 Two Sum: ${solutionPair.contentToString()}")
}

fun testValidPalindrome() {
    val testCase = ValidPalindrome()

    val testInput = "9A man, a plan, a canal: Panama9"
    println("125 Valid Palindrome: ${testCase.isPalindrome(testInput)}")
}