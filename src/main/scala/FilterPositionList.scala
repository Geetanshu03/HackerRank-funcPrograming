

object FilterPositionList {
  def main(args: Array[String]): Unit = {
    val list1 = List(2,5,3,4,6,7,9,8)
    println(f(list1))

  }
  def f(arr:List[Int])= arr.view.zipWithIndex.filter(tp =>tp._2%2 !=0).map(tp => tp._1).toList

}
/*
in this program view make all transformation lazy which need to be done after view like filter, map.
example :
scala> (1 to 1000000000).filter(_ % 2 == 0).take(10).toList
java.lang.OutOfMemoryError: GC overhead limit exceeded
in above program without "view" it will give outofmemory

scala> (1 to 1000000000).view.filter(_ % 2 == 0).take(10).toList
res2: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)

as "view" produces a lazy collection now it will not perform filter operation on every element of collection
check
 */
