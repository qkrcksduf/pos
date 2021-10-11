package pos.application

import pos.domain.ProductService.checkExistProduct
import pos.domain.entity.Product
import pos.util.CheckReadLine.checkReadLine

object ProductService {
  private val productList: MutableList<Product> = ArrayList()

  fun getProductList() =
    productList


  fun createProduct() {
    println("추가할 상품의 이름, 가격, 수량을 입력하세요 >> ")
    val name = readLine()
    val price = readLine()
    val quantity = readLine()

    if (checkReadLine(name!!, price!!, quantity!!)) return
    productList.add(Product(name, price.toInt(), quantity.toInt()))
  }

  fun updateProduct() {
    print("변경할 상품의 현재 이름을 입력하세요 >> ")
    val currentName = readLine()

    println("변경하고자 하는 이름, 가격, 수량을 입력하세요 >> ")
    val name = readLine()
    val price = readLine()
    val quantity = readLine()

    if (checkReadLine(currentName!!, name!!, price!!, quantity!!)) return

    val product = checkExistProduct(currentName, productList)
    if (product != null) {
      productList.remove(product)
      productList.add(Product(name, price.toInt(), quantity.toInt()))
    } else {
      println("존재하지 않는 상품입니다.")
    }
  }

  fun deleteProduct() {
    print("제거할 상품의 이름을 입력하세요 >> ")
    val name = readLine()

    if (checkReadLine(name!!)) return

    val product = checkExistProduct(name, productList)
    if (product != null) {
      productList.remove(product)
    } else println("존재하지 않는 상품입니다.")
  }

  fun selectProducts() {
    productList.forEach {
      println("name: ${it.name}, price: ${it.price}, quantity: ${it.quantity}")
    }
  }

}