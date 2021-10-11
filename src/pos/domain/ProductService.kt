package pos.domain

import pos.domain.entity.Product

object ProductService {

  fun checkExistProduct(name: String, productList: MutableList<Product>) =
    productList.find { it.name == name }

}