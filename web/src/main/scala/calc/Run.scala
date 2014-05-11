package calc

import unfiltered.jetty.Http

object Run {
  def main(args:Array[String]){
    Http(8080).plan(new CalculatorPlan).run()
  }
}
