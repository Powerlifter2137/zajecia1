class zajecia {
    public static void main (String[] args){
      int [] tab1 = {1, 2, 3, 4, 5};
      System.out.println(dodawanie(tab1[0], tab1[1]));
      System.out.println(mnozenie(tab1[1], tab1[2]));
      System.out.println(dzielenie(tab1[4], tab1[2]));
      System.out.println(srednia(tab1));
      System.out.println(czy_parzysta(tab1[0]));
      System.out.println(czy_parzysta(tab1[1]));
      System.out.println(bmi(76.5, 178));
      System.out.println(ocena(srednia(tab1)));
      System.out.println(czy_palindrom("hello world"));
      System.out.println(czy_palindrom("dood"));
      System.out.println(czy_palindrom("kajak"));
      System.out.println(czy_palindrom("ka jak ajak"));
    }
    static int dodawanie (int a, int b){
      return a + b;
    }
    static int mnozenie (int a, int b){
      return a * b;
    }
    static double dzielenie (double a, double b){
      return a/b;
    }
    static double srednia (int[] numbers) {
          int sum = 0;
          for (int n : numbers) {
              sum += n;
          }
  
          return (double) sum / numbers.length;
    }
    static String czy_parzysta (int number){
        if (number % 2 == 0) {
            return "parzysta";
        }
        else return "nieparzysta";
    }
    static double bmi (double waga, double wzrost){
        wzrost = wzrost / 100;
        return waga / (wzrost * wzrost);
    }
    static char ocena (double srd){
        if(srd >= 4.5){
            return 'A';
        }
        else if (srd >= 3.5){
            return 'B';
        }
        else if (srd >= 2.5){
            return 'C';
        }
        else if (srd >= 1.5){
            return 'D';
        }
        else {
            return 'E';
        }
    }
    static boolean czy_palindrom (String x){
        x = x.replaceAll(" ", "");
        return x.equals(new StringBuilder(x).reverse().toString());
    }
  }