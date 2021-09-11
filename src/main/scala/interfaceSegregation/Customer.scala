package interfaceSegregation

class Customer extends DrinkCoffee {
  override def drinkCoffee(): Unit = {
    println("drinking coffee")
  }
  def payBill(bill:Int): Unit ={
    println("Bill paid of "+bill)
  }
}

object Main extends App{
  val rahul = new Customer
  val cup = new CoffeeShop
  cup.makeCoffee()
  val server = new Server()
  server.serveCoffee()
  rahul.drinkCoffee()
  val bill = new Bill(100)
  rahul.payBill(bill.makeBill())
}