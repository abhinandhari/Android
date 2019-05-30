import 'dart:io';
int counter = 0;
main(List<String> args){
    print("Hello, ${args[0]} ${args[1]} ${++counter}");
    
   /* for(int i=0;i<10;i++)
      print(i);
    var i =10;
    while(i-- >0){
      stdout.write("Yaaaay ${i}");
    }*/
    List<String> fruits = ["adadad","adswdfssg","trewfrews","fgrtfdv"];
      for(int i=0;i<fruits.length;i++)
        print(fruits[i]);
}