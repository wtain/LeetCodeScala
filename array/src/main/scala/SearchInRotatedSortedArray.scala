// Runtime
//Details
//449ms
//Beats 100.00%of users with Scala
//Memory
//Details
//55.22mb
//Beats 40.00%of users with Scala
object Solution {
  def search(nums: Array[Int], target: Int): Int = {
    var b = 0
    var e = nums.length-1
    while (b <= e) {
      val n = e - b
      val m = b + n // 2
      if (nums(m) == target) {
        return m
      }
      else if (nums(b) <= nums(m)) {
        if (target > nums(m)) {
          b = m + 1
        }
        else if (target >= nums(b)) {
          e = m - 1
        }
        else {
          b = m + 1
        }
      }
      else if (target < nums(m)) {
        e = m - 1
      }
      else if (target <= nums(e)) {
        b = m + 1
      }
      else {
        e = m - 1
      }
    }
    -1
  }
}