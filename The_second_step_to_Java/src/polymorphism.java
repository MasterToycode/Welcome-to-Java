public abstract class polymorphism
{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     public abstract void Cry();

    public polymorphism(String name)
    {
        this.name = name;
    }

    public polymorphism() {
    }
}

class Cat extends polymorphism
{
    @Override
    public void Cry()
    {
        System.out.println(getName() + " miaoamiaomiao ");
    }

}

class Dog extends polymorphism{
    @Override
    public void Cry() {
        System.out.println(getName() + " wnagwangwang ");
    }
}




