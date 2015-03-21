case class User(
  firstName: String,
  optionalSecondName: Option[String],
  lastName: String
)

object NameLengthComputer {
  def fullNameLength(user: User) = {
    val separatorBeforeLastLen = 1
    val secondWithSeparatorLen =
      if (user.optionalSecondName.isDefined) {
        1 + user.optionalSecondName.get.length
      } else {
        0
      }
    user.firstName.length + secondWithSeparatorLen + separatorBeforeLastLen + user.lastName.length
  }
}
