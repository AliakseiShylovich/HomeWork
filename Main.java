public class Main {
  public static void main(String[] args) {
    int a, b, c, d, e, f;
    a = 10;
    b = 10;
    c = 5;
    d = 10;
    e = 10;
    f = 15;
    // оба дома расположены вдоль стороны f
    if ((a + c <= f) && (b <= e && d <= e)) {
      System.out.println("Возможно разместить два дома");
      // поворачиваем дом cd на 90 градусов
    } else if ((a + d <= f) && (b <= e && c <= e)) {
      System.out.println("Возможно разместить два дома");
      // поворачиваем дом ab на 90 градусов а дом cd возвращаем в исходное положение
    } else if ((b + c <= f) && (a <= e && d <= e)) {
      System.out.println("Возможно разместить два дома");
      // поворачиваем дом cd на 90 градусов
    } else if ((b + d <= f) && (a <= e && c <= e)) {
      System.out.println("Возможно разместить два дома");
      /* возвращаем дома в исходное положение и поворачиваем участок на 90 градусов
      теперь оба дома расположены вдоль стороны e
      */
    } else if ((a + c <= e) && (b <= f && d <= f)) {
      System.out.println("Возможно разместить два дома");
      // поворачиваем дом cd на 90 градусов
    } else if ((a + d <= e) && (b <= f && c <= f)) {
      System.out.println("Возможно разместить два дома");
      // поворачиваем дом ab на 90 градусов а дом cd возвращаем в исходное положение
    } else if ((b + c <= f) && (a <= f && d <= f)) {
      System.out.println("Возможно разместить два дома");
      // поворачиваем дом cd на 90 градусов
    } else if ((b + d <= e) && (a <= f && c <= f)) {
      System.out.println("Возможно разместить два дома");
    } else {
      System.out.println("Невозможно разместить два дома");
    }
  }
}
