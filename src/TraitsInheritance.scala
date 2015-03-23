trait Logging {
  def log(msg: String) {
    println(s"LOG: $msg")
  }
}

object Worker extends Logging {
  var i = 0
  def doWork = {
    i += 1
    log(s"i is now: $i")
    i
  }
}
