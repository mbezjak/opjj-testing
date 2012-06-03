package opjj

object ListUtil {
  
  def reverse[A](list : List[A]) : List[A] = list match {
    case head :: tail => reverse(tail) :+ head
    case _            => Nil
  }

}
