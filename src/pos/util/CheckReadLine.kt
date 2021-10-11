package pos.util

object CheckReadLine {
  fun checkReadLine(vararg values: String): Boolean {
    for (value in values) {
      if (value.isEmpty()) {
        value::class.java.getField(value)
        println("반드시 입력해야 하는 항목입니다.")
        return true
      }
    }
    return false
  }
}
