package pos

import pos.Order.Companion.createOrder
import pos.Order.Companion.printSales
import pos.Product.Companion.addProduct
import pos.Product.Companion.deleteProduct
import pos.Product.Companion.selectProduct
import pos.Product.Companion.updateProduct
import java.util.*

val scanner = Scanner(System.`in`)
var productList: MutableList<Product> = arrayListOf()
var orderList: MutableList<Order> = arrayListOf()

fun main() {
  println("포스기 프로그램을 시작합니다.\n")

  while (true) {

    println("------------------------")
    println("이용하고 싶은 기능을 입력하세요.")
    print("1. 상품 관리 || 2. 상품 주문 || 3. 매출 관리 || 4. 포스기 프로그램 종료 >> ")

    try {
      when (scanner.nextInt()) {
        1 -> productManagement()
        2 -> productOrder()
        3 -> salesManagement()
        4 -> return
      }
    } catch (e: InputMismatchException) {
      println("잘못된 입력입니다.")
    }
  }

}

fun productManagement() {
  println("------------------------------------------")
  print("1. 상품 추가 || 2. 상품 수정 || 3. 상품 삭제 || 4. 취소 >> ")


  when (scanner.nextInt()) {
    1 -> addProduct()
    2 -> updateProduct()
    3 -> deleteProduct()
    4 -> return
  }

}

fun productOrder() {
  selectProduct()
  createOrder()

}

fun salesManagement() {
  printSales()
}



