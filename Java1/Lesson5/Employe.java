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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //if (name != null) {} контроль
        this.name = name;
    }

    public String getPosition() {
    return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
    return email;
    }

    public void setEmale(String email) {
        this.email = email;
    }

    public String getPhone() {
    return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getSalary() {
    return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getAge() {
    return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}