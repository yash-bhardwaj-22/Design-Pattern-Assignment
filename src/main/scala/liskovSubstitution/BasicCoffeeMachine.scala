package liskovSubstitution

//extends with trait
class BasicCoffeeMachine extends CoffeeMachine {
  val coffee="Powdered"

  override def serveCoffee(): Unit = {
    val cup = brewFilterCoffee(coffee)
    println("Here is your " + cup)
  }
  def brewFilterCoffee(coffee:String): String ={
    println("coffee is in " +coffee+" form")
    println("Brewing...")
    "Freshly brewed coffee"
  }
}
object Main extends App{
  val basic = new BasicCoffeeMachine()
  val premium = new PremiumCoffeeMachine
  premium.serveCoffee()
  basic.serveCoffee()
}