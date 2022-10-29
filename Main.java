class Main {
  public static void main(String[] args) {
    String str1 = "teste";
    String str2 = "tesste".substring(1);

    System.out.println("string 1: " + str1 + ", string 2: " + str2);
      if(str1 == str2) {
        System.out.println("string 1 igual a string 2");
        }
        else {
          System.out.println("string 1 diferente de string 2");
        }
    }
}