package problem1534

object Solution {
    def main(args: Array[String]): Unit = {
        print(Solution.countGoodTriplets(Array(1, 1, 2, 2, 3), 0, 0, 1))
    }

    var arrLength = 0

    def countGoodTriplets(arr: Array[Int], a: Int, b: Int, c: Int): Int = {
        var x = 0
        arrLength = arr.length
        for (i <- arr.indices; j <- i until arrLength; k <- j until arrLength)
            if (i != j && j != k && i != k && inRange(i) && inRange(j) && inRange(k) &&
                (arr(i) - arr(j)).abs <= a && (arr(j) - arr(k)).abs <= b && (arr(i) - arr(k)).abs <= c) {
                x = x + 1
            }
        x
    }

    def inRange(num: Int): Boolean = num >= 0 && num < arrLength

}