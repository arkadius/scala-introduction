case class User(
  firstName: String,
  optionalSecondName: Option[String],
  lastName: String
)


object NameLengthComputer {
  def fullNameLength(user: User) {
    val separatorsLength = 2
    user.firstName.length + usera.optionalSecondName.length + user.lastName.length + separatorsLength
  }
}
