package strategy.second;

public abstract class Duck {
    
    /*
     * 所有的的鸭子都会叫
     */
    public void quack() {
        
    }
    
    /*
     * 所有的鸭子都会游泳
     */
    public void swim() {
        
    }
    
    /*
     * 在超类中加上fly()就会导致所有的子类都具备fly()，连那些不该具备fly()的子类也无法避免
     */
    public void fly() {
        
    }
    
    /*
     * 每一种鸭子的外观不同，所以display方法是抽象的
     */
    public abstract void display();
    
    
}
