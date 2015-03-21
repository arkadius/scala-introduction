class Animal {
  def makeNoise = {
    "not implemented noise"
  }
}

object Duck extends Animal {
  override def makeNoise = {
    "quack"
  }
}
