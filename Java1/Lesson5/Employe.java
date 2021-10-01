class Employe {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    Employe(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString () {
        return name + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age;
    }

    /*public String getName() {
        return name;
    }

    public void setName(String name) {
        //if (name != null) {} контроль
        this.name = name;
    }*/

    public int getAge() {
    return age;
    }
}