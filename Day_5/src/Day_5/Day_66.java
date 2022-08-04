/*
 * Class의 관계
 * 
 * 1. has ~ a 관계 ( ~가 ~를 가지고 있다.) -> 포함오브젝트 - 객체를 만들때 사용자에게 맞춰서 만들기 X -> 독립적으로
 * 만들기!! 2. is ~ a 관계 (! 눈 ~ 이다.) -> 상속
 * 
 * 
 * package Day_6;
 * 
 * 
 * class A{ // 데이터클래스: 독립적으로 private int a; public A() {} public A(int a) {
 * this.a = a; }
 * 
 * public int getA() { return a; }
 * 
 * public void setA(int a) { this.a = a; } }
 * 
 * 
 * public class Day_6 { // 개인정보 data 관리 클래스
 * 
 * private String name; // has ~ a관계 // private int age; private A age; // has ~
 * a관계
 * 
 * Day_6(){
 * 
 * } public Day_6(String name, int age) { this.name = name; this.age = new
 * A(age); this.age.setA(age); } public String getName() { return name; } public
 * int getAge() { return age.getA(); }
 * 
 * 
 * public static void main(String args[]) { // 사용자 Day_6 stu1 = new Day_6();
 * Day_6 stu = new Day_6("Superman", 3000);
 * 
 * System.out.println(stu.getName()); System.out.println(stu.getAge()); } }
 */