public class Student {
  int id = 1_000;
  byte age = 18;
  short rank = 165;
  long phone = 223_456_7890L;

  int minValue = Integer.MIN_VALUE;
  int maxValue = Integer.MAX_VALUE;

  byte byteMinValue = Byte.MIN_VALUE;
  byte byteMaxValue = Byte.MAX_VALUE;

  void compute() {
    int nextId = id + 1;

    System.out.println("id: " + id);
    System.out.println("nextId: " + nextId);
    System.out.println("age: " + age);
    System.out.println("rank: " + rank);
    System.out.println("phone: " + phone);
    System.out.println("minValue: " + minValue);
    System.out.println("maxValue: " + maxValue);
    System.out.println("byteMinValue: " + byteMinValue);
    System.out.println("byteMaxValue: " + byteMaxValue);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}