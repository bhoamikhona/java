import java.math.BigDecimal;

public class BasicsDemo {
  // 1. Naming rules for classes/methods/variables
  // a. First character: letter, underscore, $
  // Remaining: letter, underscore, $, numbers
  // b. No reserved keywords
  // c. No duplicate names
  int id1 = 0;

  // 2. **Java is case sensitive
  int id = 0;
  int Id = 0;
  int ID = 0;

  void foo() {
  }

  void Foo() {
  }

  // 3. Printing to console
  static void print() {
    System.out.println("\n\nInside print...");
    System.out.println("Hello, World!"); // Advance cursor to beginning of next line
    System.out.println(); // Print empty line
    System.out.print("Hello, World!"); // Cursor stayed after the printed string
    System.out.println("Hello,");
    System.out.print(" "); // print a space
    System.out.print("World!");
  }

  // 4. Comments or Disabling Code
  // single line comment
  /*
   * multi
   * line
   * comment
   * OR
   * block
   * quote
   */

  // 5. Arithmetic Operations
  static void arithmetics() {
    int i = 2;
    int j = 3;

    System.out.println();
    System.out.println(i + j);
    System.out.println(i - j);
    System.out.println(i * j);
    System.out.println(i / j);
    System.out.println(i % j);
  }

  static void primitives() {
    System.out.println("\n\nInside primitives...");

    int intHex = 0x0041;
    System.out.println("intHex: " + intHex);

    int intBinary = 0b01000_001;
    System.out.println("intBinary: " + intBinary);

    long longHex = 0x0041L;
    System.out.println("longHex: " + longHex);

    int intOctal = 0101;
    System.out.println("intOctal: " + intOctal);

    char charInt = 65;
    System.out.println("charInt: " + charInt);

    char charHex = 0x0041;
    System.out.println("charHex: " + charHex);

    char charBinary = 0b0100_0001;
    System.out.println("charBinary: " + charBinary);

    char charOctal = 0101;
    System.out.println("charOctal: " + charOctal);

    int intChar = 'A';
    System.out.println("intChar: " + intChar);
  }

  public static void main(String[] args) {
    print();
    arithmetics();
    primitives();

    System.out.println(1 - 0.9);
    System.out.println(0.1 + 0.2);

    BigDecimal first = new BigDecimal("0.1");
    BigDecimal second = new BigDecimal("0.2");

    System.out.println(first.add(second));
  }
}
