import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class SearchInRotatedSortedArraySpec extends AnyFlatSpec with Matchers {

  val tests = Seq(
    (
      Seq(4,5,6,7,0,1,2),
      0,
      4
    ),
    (
      Seq(4,5,6,7,0,1,2),
      3,
      -1
    ),
    (
      Seq(1),
      0,
      -1
    )
  )

  for (test <- tests) {
    "SearchInRotatedSortedArray" should test.toString() in {
      val result = Solution.search(test._1.toArray, test._2)
      result shouldEqual test._3
    }
  }
}
