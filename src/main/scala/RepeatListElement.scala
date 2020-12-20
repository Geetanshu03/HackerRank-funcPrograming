  /*
Repeat the number of elements of list
 */

  object RepeatListElement {
    def main(args: Array[String]): Unit = {
      val num = 3;
      val arr = List(1,2,3,4)

      println(f(3,arr))

    }
    def f(num:Int,arr:List[Int])={
      arr.flatMap(List.fill(num)(_))
    }
  }
