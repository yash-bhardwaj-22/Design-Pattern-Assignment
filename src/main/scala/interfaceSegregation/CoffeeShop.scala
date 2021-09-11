package interfaceSegregation

class CoffeeShop extends CoffeeMaker {
  override def makeCoffee(): Unit = {
    println("Making coffee... ")
  }
}

class Server extends CoffeeServer{
  override def serveCoffee(): Unit = {
    println("Serve coffee")
  }
}

class Bill(amount:Int) extends Cashier{
  override def makeBill(): Int = {
    println("Making Bill...")
    var price = amount
    price
  }
}
