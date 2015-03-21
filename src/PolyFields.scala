class Animal {
  val noise = "not implemented noise"
  def makeNoise = {
    noise
  }
}

class Duck extends Animal {
  override val noise = "quack"
  override def makeNoise = {
    noise
  }
}
