class Fruit {
  String color;
  String shape;
  int price;
  Fruit(this.color, this.shape, this.price); ///unnamed
  Fruit.halffruit(this.color,this.shape); //named
  Fruit.quarterfruit(this.color); //named
  @override
  String toString() => "Color: $color, Shape $shape, Price $price";
}

main(List<String> args) {
  var fruit = Fruit("red", "round", 100);
  var half = Fruit.halffruit("blue","square");
  var quart = Fruit.quarterfruit("yellow");
  print(fruit);
  print(half);
  print(quart);
}
