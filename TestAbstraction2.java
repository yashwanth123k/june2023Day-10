abstract class Car{
Car(){
System.out.println("Car is created...!");
}
abstract void run();
void ChangeGear(){
System.out.println("Gear changed...!");
}
}
class Honda extends Car{
void run(){
System.out.println("Running safely...!");
}
}
class TestAbstraction2{
public static void main(String args[]){
Car obj=new Honda();
obj.run();
obj.ChangeGear();
}
}