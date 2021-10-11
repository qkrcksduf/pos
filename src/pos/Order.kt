//package pos
//
//class Order(
//  private val productList: MutableList<Product> = arrayListOf(),
//  private var payment: Payment? = null,
//  val totalAmount: Int
//) {
//  companion object {
//    fun createOrder() {
//      val productOrderList: MutableList<Product> = ArrayList()
//      var totalAmount = 0
//
//      while (true) {
//        print("주문할 상품의 이름을 입력하세요. (선택 완료 시 x 버튼 입력) >> ")
//        val name = scanner.next()
//        if (name == "x") {
//          break
//        }
//
//        val product = productList.find { it.name == name }
//        if (product != null) {
//          productOrderList.add(product)
//          totalAmount += product.price
//
//        } else {
//          println("존재하지 않는 상품입니다.")
//        }
//      }
//
//      print("결제 방법을 선택하세요 (1. 현금, 2. 카드) >> ")
//      val number = scanner.nextInt()
//      var payment: Payment? = null
//
//      when (number) {
//        1 -> payment = Payment.CASH
//        2 -> payment = Payment.CARD
//        else -> println("잘못된 입력입니다.")
//      }
//
//      orderList.add(Order(productOrderList, payment, totalAmount))
//    }
//
//    fun printSales() {
//      var cardTotalAmount = 0
//      var cashTotalAmount = 0
//
//      orderList.filter {
//        it.payment == Payment.CARD
//      }.forEach {
//        cardTotalAmount += it.totalAmount
//        println(it.toString())
//      }
//
//      orderList.filter {
//        it.payment == Payment.CASH
//      }.forEach {
//        cashTotalAmount += it.totalAmount
//        println(it.toString())
//      }
//
//      println("카드 매출액: $cardTotalAmount")
//      println("현금 매출액: $cashTotalAmount")
//      println("최종 매출액: ${cashTotalAmount + cardTotalAmount}")
//    }
//  }
//
//  override fun toString(): String {
//    return "OrderList((productList = $productList, payment = $payment, totalAmount = $totalAmount))"
//  }
//}
