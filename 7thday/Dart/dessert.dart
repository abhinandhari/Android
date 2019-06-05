class Dessert{
  String _type;
  factory Dessert(int price){
    if(price>50000){
      return Dessert._produceDessert("Expensive");
    }else if(price >=25000){
      return Dessert._produceDessert("Okayish");
    }else
      return Dessert._produceDessert("NO SCENE");
  }
    Dessert._produceDessert(this._type);

    @override
    String toString()=> "Type : $_type";
}
main(List<String> args) {
  var dessert = Dessert(99999);
  print(dessert);
}