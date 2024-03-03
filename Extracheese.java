public class Extracheese extends BurgerDecorator {
    Extracheese(Burger burger){
        super(burger);
    }
    public String getdescription(){
        return "extrachesse with burger";
    }
    public int getcost(){
        return burger.getcost() + 10;
    }
}
