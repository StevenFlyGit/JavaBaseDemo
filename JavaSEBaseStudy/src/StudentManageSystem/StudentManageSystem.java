package StudentManageSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 创建时间：2020/5/7
 * 学生管理系统
 * @author wpf
 */

/*
具体需求：
建一个学生类，里面包含学生的四种信息，学号、姓名、年龄和居住地
系统有5个功能，分别为添加学生、删除学生、修改学生、查看所有学生和退出系统
 */
public class StudentManageSystem {

    public static void Menu() {
        System.out.println("--------欢迎来到学生管理系统--------");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查看所有学生");
        System.out.println("5.退出系统");
    }

    public static void InserStudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要添加的学生学号");
        String id = sc.nextLine();
        Iterator<Student> stu_ite = students.iterator();
        Boolean add = true;
        while (stu_ite.hasNext()) {
            Student student = stu_ite.next();
            if (id.equals(student.getId())) {
                System.out.println("该学号已添加");
                add = false;
                break;
            }
        }
        if (add) {
            System.out.println("请输入要添加的学生年龄");
            String age = sc.nextLine();
            System.out.println("请输入要添加的学生姓名");
            String name = sc.nextLine();
            System.out.println("请输入要添加的学生地址");
            String address = sc.nextLine();
            Student student = new Student(id, age, name, address);
            students.add(student);
        }
    }

    public static void DeleteStudent(ArrayList<Student> students) {
        if (students.size() == 0) {
            System.out.println("系统无学生信息！");
            return;
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入需要删除的学生的学号");
            String id = sc.nextLine();

            boolean delete = false;
            for (int i = 0; i < students.size(); i++) {
                Student student = students.get(i);
                if (id.equals(student.getId())) {
                    delete = true;
                    students.remove(student);
                    i--;
                }
            }
            if (!delete) {
                System.out.println("不存在该学号！");
            }
        }
    }

    public static void UpdateStudent(ArrayList<Student> students) {
        if (students.size() == 0) {
            System.out.println("系统无学生信息！");
            return;
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入需要修改的学生的学号");
            String id = sc.nextLine();
            Iterator<Student> stu_ite = students.iterator();
            boolean update = false;
            int count = 0;
            while (stu_ite.hasNext()) {
                Student student = stu_ite.next();
                if (id.equals(student.getId())) {
                    update = true;
                    System.out.println("请输入修改后的学生年龄");
                    String age = sc.nextLine();
                    System.out.println("请输入修改后的学生姓名");
                    String name = sc.nextLine();
                    System.out.println("请输入修改后的学生地址");
                    String address = sc.nextLine();
                    Student updateStudent = new Student(student.getId(), age, name, address);
                    students.set(count, updateStudent);
                }
                count++;
            }
            if (!update) {
                System.out.println("不存在该学号！");
            }
        }
    }

    public static void SelectAllStudents(ArrayList<Student> students) {
        if (students.size() == 0) {
            System.out.println("还没有添加学生，请添加学生信息后再查询！");
            return;
        } else {
            Iterator<Student> stu_ite = students.iterator();
            System.out.println("学号\t姓名\t年龄\t地址");
            while (stu_ite.hasNext()) {
                Student student = stu_ite.next();
                System.out.println(student.getId() +"\t"+ student.getName() +"\t"+ student.getAge() +"\t"+ student.getAddress());
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        while (true) {
            Menu();
            Scanner sc = new Scanner(System.in);
            int manipulation = sc.nextInt();
            switch (manipulation) {
                case 1:
                    InserStudent(students);
                    break;
                case 2:
                    DeleteStudent(students);
                    break;
                case 3:
                    UpdateStudent(students);
                    break;
                case 4:
                    SelectAllStudents(students);
                    break;
                case 5:
                    System.out.println("系统已退出，感谢使用");
                    System.exit(0);
            }
        }
    }
}
