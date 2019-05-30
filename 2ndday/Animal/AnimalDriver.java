public class AnimalDriver{
    public static void main(String[] args){
        Animal lion = new Animal("Roar",4);
        lion.print(); 
        Lion pikachu=new Lion("Roar",6,false);
        pikachu.print();
        pikachu.print(true);
        Animal lion1=pikachu; //assign Lion to Animal i.e. parent takes values from child.
        lion1.print(); // However, print only comes from lion. Due to overriding.
      //  Lion lion2 = lion; wont work, Lion is child, Animal is parent.
        System.out.println(lion);//due to toString(). Special function, that.
        Monkey man = new Monkey();
        man.setLegs(2);
        man.setwalk(true);
        man.print();
        man =new Monkey("pija", 2,true);
        System.out.println(man);
        man.setSays(" meow ");
        man.print();
    }
}