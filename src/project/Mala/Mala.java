package project.Mala;

public abstract class Mala  {
    protected static int price=0;
    public Mala(){

    }
    public abstract int getcost();
    public abstract int calculate(int piece);

    public abstract int calculate();
    public int getTotalprice(){
        return this.price;
    }
}
