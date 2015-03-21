class Animal {
  String noise = "not implemented noise";
  String makeNoise() {
    return noise;
  }
}

class Duck extends Animal {
  String noise = "quack";
  String makeNoise() {
    return noise;
  }
}
