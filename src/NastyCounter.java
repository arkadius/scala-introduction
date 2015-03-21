interface Counter {
  int count(List<Object> objects);
}

class NastyCounter implements Counter {
  public int count(List<Object> objects) {
    boolean iAmNastyToday = new Random().nextBoolean();
    if (iAmNastyToday) {
      objects.set(new Random().nextInt(objects.size()), null);
    }
    return objects.size();
  }
}
