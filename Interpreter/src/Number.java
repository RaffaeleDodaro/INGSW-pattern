public class Number implements Expression{
    private int number;

    public Number(String number)
    {
        this.number=Integer.parseInt(number);
    }

    @Override
    public int interpreter(Context op) {
        return number;
    }
}
