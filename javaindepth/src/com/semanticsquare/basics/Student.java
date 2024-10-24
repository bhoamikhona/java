public class Student {
  int id = 1_000;
  byte age = 18;
  short rank = 165;
  long phone = 223_456_7890L;

  int minValue = Integer.MIN_VALUE;
  int maxValue = Integer.MAX_VALUE;

  byte byteMinValue = Byte.MIN_VALUE;
  byte byteMaxValue = Byte.MAX_VALUE;

  double gpa = 3.888888888888888888888888888888888888888;

  char degree = 'B';

  boolean international = true;
  double tuitionFees = 12000.0;
  double internationalFees = 5000.0;

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
    System.out.println("gpa: " + gpa);
    System.out.println("degree: " + degree);

    if (international) {
      tuitionFees = tuitionFees + internationalFees;
    }

    System.out.println("tuitionFees: " + tuitionFees);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.compute();
  }
}