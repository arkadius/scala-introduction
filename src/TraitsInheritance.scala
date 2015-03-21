trait Logging {
  def log(msg: String) {
    println(s"LOG: $msg")
  }
}

case class User(
  firstName: String,
  optionalSecondName: Option[String],
  lastName: String
) 

object NameLengthComputer extends Logging {
  def fullNameLength(user: User) = {
    val separatorBeforeLastLen = 1
    val secondWithSeparatorLen = user.optionalSecondName.map { secondName =>
      log(s"User $user has second name")
      1 + secondName.length
    }.getOrElse(0)
    user.firstName.length + secondWithSeparatorLen + separatorBeforeLastLen + user.lastName.length
  }
}
