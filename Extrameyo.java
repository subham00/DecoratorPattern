public class Extrameyo extends BurgerDecorator {
    Extrameyo(Burger burger){
        super(burger);
    }
    public String getdescription(){
        return "extrachesse with burger";
    }
    public int getcost(){
        return burger.getcost() + 20;
    }
}
