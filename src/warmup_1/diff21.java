package warmup_1;
/*Учитывая int n, верните абсолютную разницу между n и 21, за исключением
возврата двойной абсолютной разницы, если n больше 21.
diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
 */

public class diff21 {
    public int diff21(int n) {
        if (n > 21){
            return Math.abs (n - 21) * 2;
        }
        if (n =< 21) {
            return Math.abs (n - 21);
        }
}
}
/* Правильное решение:
 public int diff21(int n) {
  if (n <= 21) {
    return 21 - n;
  } else {
    return (n - 21) * 2;
  }
}