object FilterArray {
  def main(args: Array[String]): Unit = {
    val delim=3;
    val arr=List(10,9,8,2,7,5,1,3,0)
    println(f(delim,arr))

  }
  def f(delim:Int,arr:List[Int]):List[Int]={
    arr.filter(x => x<delim)
  }
}
