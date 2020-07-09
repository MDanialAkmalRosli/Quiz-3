public class Dog extends Animal {
    
    public Dog(String name){
        this.name = name;  }
    
    public Dog (int age){
        this.age = age; }
    
    public String obtainName(){
        return this.name;   }

    public int obtainAge(){
        return this.age;    }
 
    // Dog introduction
    @Override
    public void introduceYourself(){
        System.out.println("Woof. I am a dog. My name is " + this.name); 
        System.out.println("and I am " + this.age + " years old.");
    }
      
}
