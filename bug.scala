```scala
class MyClass(val x: Int) {
  def this(s: String) = this(s.toInt)
}

val obj = new MyClass("123")
println(obj.x) // Output: 123

val obj2 = new MyClass("abc")
println(obj2.x) // java.lang.NumberFormatException: For input string: "abc"
```