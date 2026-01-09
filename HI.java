class Animal{
     String name,colour;
      int ano;
void setAnimal(String n,String c,int a){
        name = n;
        age=a;
        colour=c
}
    }
    void displayAnimal() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    System.out.println("colour:"+colour);
}
class Dog extends  Animal {
    String sound ;
  void setStudent(String n, String c ,int i,String s) {
        setAnimal(i,n,c)
    }
    void displayDog() {
        displayAnimal() ;
 System.out.println("Sound:" + sound);
    }
}
class Main {
   public static void main(String[] args) {
        Dog d = new Dog();
d.setDog(5,"Puppy","Red","Bark");
        d.displayDog();
    }
}
