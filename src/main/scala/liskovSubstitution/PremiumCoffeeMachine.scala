package liskovSubstitution

class PremiumCoffeeMachine extends CoffeeMachine {
  val coffee = "Beans"

  override def serveCoffee(): Unit = {
    val cup = brewFilterCoffee(coffee)
    println("Here is your "+cup)
  }

  def brewFilterCoffee(coffee:String): String ={
    println("coffee is in " +coffee+" form")
    println("Grinding beans")
    println("Brewing... Filtering...")
    "Freshly brewed premium Latte` coffee"
  }
}


