List<String> getFruitList(){
  return ["aa","bb","cc"];
}
String getFruit() => "dddddddd";
String aLongPara ="""This is really
reallyyytjfygkuhjildfgchjkl
ytrgdxfcgvhbjvcxfdfseswerty long""";
main(List<String> args){
  getFruitList().forEach((fruit)=> print(fruit));
  print(aLongPara);
  print(getFruit());
}