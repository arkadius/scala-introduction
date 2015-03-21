case class User(
  name: String,
  age: Int,
  male: Boolean
) 

object UserDescriber {
  def describe(user: User) =
    user match {
      case User(name, age, _) if age >= 18 => s"Adult $name"
      case User(name, _, true)             => s"Underage male $name"
      case User(name, _, false)            => s"Underage female $name"
    }
}
