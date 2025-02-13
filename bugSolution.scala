```scala
class MyClass(val x: Int) {
  def this(s: String) = try {
    this(s.toInt)
  } catch {
    case e: NumberFormatException =>
      println(s"Error converting string to integer: "+ e.getMessage())
      this(0) // or handle the error differently, e.g., throw a custom exception
  }
}

val obj = new MyClass("123")
println(obj.x) // Output: 123

val obj2 = new MyClass("abc")
println(obj2.x) // Output: Error converting string to integer: For input string: "abc" 0
```