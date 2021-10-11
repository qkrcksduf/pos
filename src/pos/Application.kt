package pos

import pos.router.OrderController.productOrder
import pos.router.OrderController.salesManagement
import pos.router.ProductController.productManagement
import java.util.*

//val scanner = Scanner(System.`in`)
//val productList: MutableList<Product> = arrayListOf()
//val orderList: MutableList<Order> = arrayListOf()

fun main() {
  println("포스기 프로그램을 시작합니다.\n")

  while (true) {

    println("------------------------")
    println("이용하고 싶은 기능을 입력하세요.")
    print("1. 상품 관리 || 2. 상품 주문 || 3. 매출 관리 || 4. 포스기 프로그램 종료 >> ")

    try {
      when (readLine()) {
        "1" -> productManagement()
        "2" -> productOrder()
        "3" -> salesManagement()
        "4" -> return
        else -> println("잘못된 입력입니다.")
      }
    } catch (e: InputMismatchException) {
      println("잘못된 입력입니다.")
    }
  }
}

//fun productManagement() {
//  println("------------------------------------------")
//  print("1. 상품 추가 || 2. 상품 수정 || 3. 상품 삭제 || 4. 취소 >> ")

//  when (scanner.nextInt()) {
//    1 -> addProduct()
//    2 -> updateProduct()
//    3 -> deleteProduct()
//    4 -> return
//  }
//}
//
//fun productOrder() {
//  selectProduct()
//  createOrder()
//}
//
//fun salesManagement() {
//  printSales()
//}



