case class User(
  firstName: String,
  optionalSecondName: Option[String],
  lastName: String
)

object NameLengthComputer {
  def fullNameLength(user: User) = {
    val separatorBeforeLastLen = 1
    val secondWithSeparatorLen = user.optionalSecondName.map(1 + _.length).getOrElse(0)
    user.firstName.length + secondWithSeparatorLen + separatorBeforeLastLen + user.lastName.length
  }
}
