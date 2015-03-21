implicit class IntWithTimeEnrichment(n: Int) {
  def times(doJob: => Unit) {
    (1 to n).foreach(i => doJob)
  }
}
