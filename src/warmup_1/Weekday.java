package warmup_1;
/*Параметр weekday является истинным, если это будний день ,
        а параметр vacation-истинным, если мы находимся в отпуске.
        Мы спиdм, если это не будний день или мы в отпуске.
        Верните истину, если мы будем спать.
sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
                  */

public class Weekday {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {return true;}
        return false;
    }

}
