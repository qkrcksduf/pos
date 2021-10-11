package pos.router

import pos.application.ProductService

object ProductController {

  fun productManagement() {
    println("------------------------------------------")
    print("1. 상품 추가 || 2. 상품 수정 || 3. 상품 삭제 || 4. 상품 목록 조회 || 5. 취소 >> ")

    when (readLine()) {
      "1" -> ProductService.createProduct()
      "2" -> ProductService.updateProduct()
      "3" -> ProductService.deleteProduct()
      "4" -> ProductService.selectProducts()
      "5" -> return
      else -> println("잘못된 입력입니다.")
    }
  }
}