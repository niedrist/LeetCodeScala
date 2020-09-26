package problem1588

object Solution {
    def main(args: Array[String]): Unit = {
        print(sumOddLengthSubarrays(Array(1, 4, 2, 5, 3)))
    }

    def sumOddLengthSubarrays(arr: Array[Int]): Int = {
        var sum = 0
        for (i <- arr.indices; subLength <- 0 until arr.length - i by 2; j <- 0 until subLength + 1)
            sum = sum + arr(i + j)
        sum
    }
}
