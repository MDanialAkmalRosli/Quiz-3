public class Cat extends Animal {
    
    public Cat(String name){
        this.name = name; }
    
    public Cat (int age){
        this.age = age; }
    
    public String obtainName(){
        return this.name;   }
   
    public int obtainAge(){
        return this.age;    }

    // Cat introduction
    @Override
    public void introduceYourself(){
        System.out.println("Meow. I am a cat. My name is " + this.name);
        System.out.println("and I am " + this.age + " years old.");
    }

}
