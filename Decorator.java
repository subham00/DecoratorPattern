public class Decorator {
    public static void main(String[] args){
        Burger zb = new ZingerBurger();
        Burger extrachesswithzb = new Extracheese(zb);
        Burger extrachessmeyo = new Extrameyo(extrachesswithzb);
        System.out.println(extrachesswithzb.getcost());
        System.out.println(extrachessmeyo.getcost());
    }
}
