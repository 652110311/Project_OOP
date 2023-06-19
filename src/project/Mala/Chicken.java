package project.Mala;

public class Chicken extends Mala{
    @Override
    public int getcost() {
        return 10;
    }

    @Override
    public int calculate(int piece) {
        price = getTotalprice()+getcost()*piece;
        return getcost()*piece;
    }

    @Override
    public int calculate() {
        return 0;
    }
}
