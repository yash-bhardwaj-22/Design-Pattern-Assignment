package dependencyInversion

class Latte extends CoffeeMaker {
  override def makeCoffee(): String = {
    "Makes a Latte"
  }
}
