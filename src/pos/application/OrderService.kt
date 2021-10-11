package pos.application

import pos.Payment
import pos.application.ProductService.getProductList
import pos.domain.ProductService.checkExistProduct
import pos.domain.entity.Order
import pos.domain.entity.Product
import pos.util.CheckReadLine.checkReadLine

object OrderService {
  private val orderList: MutableList<Order> = ArrayList()

  fun order() {
    val orderProductList: MutableList<Product> = ArrayList()

    while (true) {
      println("주문할 상품의 이름, 수량을 입력하세요 (완료 시 x 클릭) >> ")
      val name = readLine()
      if (name == "x") break
      val quantity = readLine()

      if (checkReadLine(name!!, quantity!!)) return
      val productList = getProductList()

      val product = checkExistProduct(name, productList)
      if (product != null) {
        product.changeQuantity(product, quantity.toInt())
        val purchasedProduct = product.copy(quantity = quantity.toInt())
        orderProductList.add(purchasedProduct)
      }
    }

    print("결제방법을 선택하세요 (1. 현금, 2. 카드) >> ")
    val payment = readLine()
    if (payment!!.toInt() == 1) {
      val order = Order(orderProductList, Payment.CASH)
      orderList.add(order)
    } else if (payment.toInt() == 2) {
      val order = Order(orderProductList, Payment.CARD)
      orderList.add(order)
    }
  }

  fun getOrders() {
    var cardTotalAmount = 0
    var cashTotalAmount = 0

    orderList.filter {
      it.payment == Payment.CARD
    }.forEach { it ->
      it.productList.forEach {
          cardTotalAmount += (it.quantity * it.price)
      }
      println(it.toString())
    }

    orderList.filter {
      it.payment == Payment.CASH
    }.forEach { it ->
      it.productList.forEach {
        cashTotalAmount += (it.quantity * it.price)
      }
      println(it.toString())
    }

    println("카드 매출액: $cardTotalAmount")
    println("현금 매출액: $cashTotalAmount")
    println("최종 매출액: ${cashTotalAmount + cardTotalAmount}")
  }

}

