package persongenerator;

public class Person {
    private String firstname;
    private String lastname;
    private int age;
    private Sex sex;
    private Education education;

    public Person(String firstname, String lastname, int age, Sex sex, Education education) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.sex = sex;
        this.education = education;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("firstname='").append(firstname).append('\'');
        sb.append(", lastname='").append(lastname).append('\'');
        sb.append(", age=").append(age);
        sb.append(", sex=").append(sex);
        sb.append(", education=").append(education);
        sb.append('}');
        return sb.toString();
    }
}
