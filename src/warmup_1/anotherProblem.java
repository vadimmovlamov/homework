package warmup_1;

public class anotherProblem {
    //______________________________________________________________________
/*У нас есть громко говорящий попугай. Параметр " час "- это текущее часовое
время в диапазоне 0.. 23. Мы попадаем в беду, если попугай говорит,
 час-до 7 или после 20. Верните истину, если мы попали в беду.
 parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false
 */
    public boolean parrotTrouble(boolean talking, int hour) {
        if (hour < 7 || hour > 20) {
            return true;
        }
        return false;
    }
    /* Правильное решение:
    public boolean parrotTrouble(boolean talking, int hour) {
      return (talking && (hour < 7 || hour > 20));
      // Need extra parenthesis around the || clause
      // since && binds more tightly than ||
      // && is like arithmetic *, || is like arithmetic +
     */
//______________________________________________________________________
/*Учитывая int n, верните true, если он находится в пределах 10 от 100 или 200.
Примечание: Математика.abs (num) вычисляет абсолютное значение числа.
nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false
 */
    public boolean nearHundred(int n) {
        if (n >= 10 & n <= 100){
            return Math.abs(100 - n);
        }
            /* Правильное решение:
public boolean nearHundred(int n) {
  return ((Math.abs(100 - n) <= 10) ||
    (Math.abs(200 - n) <= 10));
}
  */
//______________________________________________________________________
/*Учитывая 2 значения int, верните true, если одно из них отрицательное,
 а другое положительное. Кроме того, если параметр "negative" имеет значение true,
 то возвращайте true только в том случае, если оба параметра отрицательны.
posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true
 */
        public boolean posNeg(int a, int b, boolean negative) {
            if(negative){
                return a < 0 && b < 0;
            } else {
                return (a < 0 && b > 0) || (a > 0 && b < 0);
            }
        }
        if (a > 0 && b < 0 && negative == true){
            return true;
        }
        if (a < 0 && b > 0 && negative == true){
            return true;
        }
        if (a > 0 && b < 0 && negative == false){
            return true;
        }
    }
 /* Правильное решение:
            public boolean posNeg(int a, int b, boolean negative) {
  if (negative) {
    return (a < 0 && b < 0);
  }
  else {
    return ((a < 0 && b > 0) || (a > 0 && b < 0));
  }
}
              */

    // Параметр weekday имеет значение true, если это будний день, а параметр holiday
// - true, если мы находимся в отпуске. Мы спим, если не будний день или мы в отпуске.
// Верните истину, если мы будем спать
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false || vacation == true){
            return true;
        }
        return false;
    }
}
