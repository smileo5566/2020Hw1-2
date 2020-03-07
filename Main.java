import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count1 = scn.nextInt();

        Student student1 = new Student();
        student1.setName("小明");
        student1.setSexual("男");
        student1.setNumber("00001");
        student1.setClasses("A班");
        student1.setBorn("中壢");

        Student student2 = new Student();
        student2.setName("小華");
        student2.setSexual("男");
        student2.setNumber("00002");
        student2.setClasses("A班");
        student2.setBorn("西門町");

        Student student3 = new Student();
        student3.setName("小美");
        student3.setSexual("女");
        student3.setNumber("00003");
        student3.setClasses("A班");
        student3.setBorn("萬華");

        switch (count1){
            case 1 :
                System.out.println(student1.getName());
                System.out.println(student1.getSexual());
                System.out.println(student1.getNumber());
                System.out.println(student1.getClasses());
                System.out.println(student1.getBorn());
                break;
            case 2 :
                System.out.println(student2.getName());
                System.out.println(student2.getSexual());
                System.out.println(student2.getNumber());
                System.out.println(student2.getClasses());
                System.out.println(student2.getBorn());
                break;
            case 3 :
                System.out.println(student3.getName());
                System.out.println(student3.getSexual());
                System.out.println(student3.getNumber());
                System.out.println(student3.getClasses());
                System.out.println(student3.getBorn());
                break;
            default:
                System.out.println("查無此人");
        }

    }
}
