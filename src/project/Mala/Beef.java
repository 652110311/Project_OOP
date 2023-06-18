package project.Mala;

public class Beef extends Mala{
    @Override
    public int getcost() {
        return 10;
    }

    @Override
    public int calculate() {
        return getcost();
    }
}
