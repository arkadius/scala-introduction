case class User(
  firstName: String,
  optionalSecondName: Option[String],
  lastName: String
)


object NameLengthComputer {
  def fullNameLength(user: User) {
    val separatorsLength = 2
    user.firstName.length + user.optionalSecondName.length + user.lastName.length + separatorsLength
  }
}
