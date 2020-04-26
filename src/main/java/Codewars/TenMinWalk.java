package Codewars;

public class TenMinWalk {

  public static void main(String[] args) {
    System.out.println(isValid(new char[] {'w','e','n','s','w','e','n','s','w','e'}));
  }

  public static boolean isValid(char[] walk) {
    if (walk == null || walk.length != 10) {
      return false;
    }
    int x = 0;
    int y = 0;
    for (char c : walk) {
     switch (c) {
       case 'n': y++; break;
       case 's': y--; break;
       case 'e': x++; break;
       case 'w': x--; break;
       default: break;
     }
    }
    return x == 0 && y == 0;
  }
}