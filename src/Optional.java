class User {
  private String firstName;
  private String secondName;
  private String lastName;

  User(String firstName, String secondName, String lastName) {
    this.firstName = firstName;
    this.secondName = secondName;
    this.lastName = lastName;
  }

  public String getFirstName() { return firstName; }
  public String getSecondName() { return secondName; }
  public String getLastName() { return lastName; }
}

class NameLengthComputer {
  static int fullNameLength(User user) {
    int separatorsLength = 2;
    return user.getFirstName().length() + user.getSecondName().length() + user.getLastName().length() + separatorsLength;
  }
}
