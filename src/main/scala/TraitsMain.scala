object TraitsMain {
  def main(args: Array[String]): Unit = {
      val iterator = new IntIterator(10)
      println(iterator.next())
      println(iterator.next())
      println(iterator.next())
  }
}

trait Iterator[A] {
  def hasNext: Boolean
  def next(): A
}

 class IntIterator(to:Int) extends Iterator[Int] {
   private var current = 0

   override def hasNext: Boolean = current < to

   override def next(): Int = {
      if(hasNext) {
        val t = current
        current += 1
        t
      } else 0
   }
}