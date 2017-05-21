/**
 * Created by es on 2017. 5. 21..
 */
public class Bank {
    public Money reduce(Expression source, String to) {
        Sum sum= (Sum) source;
        int amount = sum.augend.amount + sum.addend.amount;
        return
    }
}
