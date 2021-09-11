package dependencyInversion

class CoffeeServer {
  def serveCoffee(coffee:CoffeeMaker): Unit ={
    val cup = coffee.makeCoffee()
    println(cup)
  }
}

object Main extends App{
  val serve = new CoffeeServer
  serve.serveCoffee(new Cappuccino)
  serve.serveCoffee(new Latte)
}