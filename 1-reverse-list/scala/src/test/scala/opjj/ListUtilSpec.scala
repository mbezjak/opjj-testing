package opjj

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class ListUtilSpec extends FlatSpec with ShouldMatchers {

  "reverse of empty list" should "be an empty list" in {
    ListUtil.reverse(List()) should be ('empty)
  }

  "singleton list" should "already be reversed" in {
    val list = List(42)
    ListUtil.reverse(list) should equal (list)
  }

  it should "be capable of reversing a list of integers" in {
    val list     = (1 to 5).toList
    val expected = (5 to 1 by -1).toList

    ListUtil.reverse(list) should equal (expected)
  }

  it should "be capable of reversing a list of strings" in {
    val list     = List("foo", "bar", "baz")
    val expected = List("baz", "bar", "foo")

    ListUtil.reverse(list) should equal (expected)
  }

}
