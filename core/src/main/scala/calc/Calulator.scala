package calc

object Calculator{
  def main(args:Array[String]){
    println(calculate(args))
  }

  object I { def unapply(s:String) = util.control.Exception.allCatch.opt(s.toInt) }
  
  def calculate(q:Seq[String]) = q match {
    case Seq("+", I(a), I(b)) => Right(a + b) 
    case _ => Left("Don't know how to calculate " + q.mkString(" "))
  }
}
