import org.scalatest.matchers.should.Matchers
import org.scalatest.prop.TableDrivenPropertyChecks._
import org.scalatest.wordspec.AnyWordSpec

class SearchInRotatedSortedArraySpec extends AnyWordSpec with Matchers {

  val tests = Table(
    ("nums", "target", "result"),
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

  "SearchInRotatedSortedArray" should {
    forAll(tests) {
      (nums: Seq[Int], target: Int, result: Int) =>
        s"${nums.toString} and $target -> $result" in {
          val actualResult = Solution.search(nums.toArray, target)
          actualResult shouldEqual result
        }
    }
  }
}
