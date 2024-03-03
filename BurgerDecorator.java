public abstract class BurgerDecorator extends Burger{
    Burger burger;
    BurgerDecorator(Burger burger){
        this.burger = burger;
    }
}
