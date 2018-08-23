package gov.hmrc.checkout

import gov.hmrc.checkout.Cart._

object CheckOut {
  def main(args: Array[String]) {
    /*
      A console tool  accepts shopping items (space separated) e.g Apple Apple Orange Orange.
      On pressing enter in the console, the total cost of the items will be displayed
     */
    println("Welcome to Shopping Cart")
    println("The solution only accepts input as Apple or Orange in comma separated format ")

    val items = io.StdIn.readLine().split(",").toList
    println("=> £" + totalCostWithOffers(Cart(items)))

  }
}