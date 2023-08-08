import org.scalatest.flatspec.AnyFlatSpec

class SearchInRotatedSortedArraySpec extends AnyFlatSpec {
  "SearchInRotatedSortedArray" should "run test 1" in {
    val result = Solution.search(Array[Int](4,5,6,7,0,1,2), 0)
    assert(result == 4)
  }

  "SearchInRotatedSortedArray" should "run test 2" in {
    val result = Solution.search(Array[Int](4,5,6,7,0,1,2), 3)
    assert(result == -1)
  }

  "SearchInRotatedSortedArray" should "run test 3" in {
    val result = Solution.search(Array[Int](1), 0)
    assert(result == -1)
  }
}
