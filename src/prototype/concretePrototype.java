package prototype;

public class concretePrototype extends Prototype {
    private String A;

    public concretePrototype(String name) {
        this.A = name;
    }

    @Override
    public Prototype getClone() {
        // TODO Auto-generated method stub
        return new concretePrototype(this.A);
        // try {
        // return (Prototype)super.clone();
        // }
        // catch (CloneNotSupportedException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
        // return null;
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.println(A);
    }

    @Override
    public void setA(String string) {
        // TODO Auto-generated method stub
        this.A = string;
    }
}
