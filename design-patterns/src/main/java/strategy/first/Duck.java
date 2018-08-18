package strategy.first;

/*
 * 鸭子超类superclass，各种鸭子继承此超类
 */
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
     * 每一种鸭子的外观不同，所以display方法是抽象的
     */
    public abstract void display();
}
