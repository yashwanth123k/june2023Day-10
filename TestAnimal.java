class Animal{
public void move(){
System.out.println("Call from Animals class.....! ");
}
}
class wild extends Animal{
public void move(){
System.out.println("Call from wild class....!");
}
}
class pet extends Animal{
public void move(){
System.out.println("Call from pet class.....!");
}}
class TestAnimal{
public static void main(String args[]){
Animal a=new Animal();
Animal b=new wild();
Animal p=new pet();
a.move();
b.move();
p.move();
}
}