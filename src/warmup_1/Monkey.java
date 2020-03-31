package warmup_1;
/*У нас есть две обезьяны, а и Б, и параметры улыбка и улыбка указывают,
улыбается ли каждая из них . Мы попадаем в беду, если они оба улыбаются
или ни один из них не улыбается. Верните истину, если мы попали в беду.
monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false
 */

public class Monkey {
    boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == bSmile) {return true;}
        return false;
    }

}
