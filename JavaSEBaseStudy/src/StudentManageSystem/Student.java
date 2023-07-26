package StudentManageSystem;

/**
 * 创建时间：2020/5/7
 * 学生管理系统-学生类
 * @author wpf
 */

public class Student {

    private String id;
    private String age;
    private String name;
    private String address;

    public void setId(String id) {
        this.id = id;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }
    public String getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }

    public Student() {
        super();
    }

    public Student(String id, String age, String name, String address) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.address = address;
    }

}
