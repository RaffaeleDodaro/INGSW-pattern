public class Sum implements Expression {

    @Override
    public int interpreter(Context op) {
        int r = op.getNumber().interpreter(op) + op.getNumber().interpreter(op);

        //fa la somma momentanea e la aggiungo in un altro stack
        op.setNumber(new Number(r + ""));
        return r;
    }
}
