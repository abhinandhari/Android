class Fruit {
  String color;
  String shape;
  int price;

  Fruit(this.color, this.shape, this.price);
  @override
  String toString() => "Color: $color, Shape $shape, Price $price";
}

main(List<String> args) {
  var fruit = Fruit("red", "round", 100);
  print(fruit);
}
