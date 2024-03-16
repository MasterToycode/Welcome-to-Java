package proxy;

public class Star implements Star_proxy{
    private String name;

    public Star(String name) {
        this.name = name;
    }

    public Star() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String sing(String name_sing){
        System.out.println(this.name+" is singing the"+name_sing);
        return "Thanks";
    }

    public void dance(){
        System.out.println(this.name+" is dancing ");
    }
}
