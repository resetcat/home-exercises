package io.codelex.classesandobjects.practice.exercise7;

public class Dog {
    private String name;
    private String sex;

    private String father;
    private String mother;


    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public void setFather(String father) {
        this.father = father;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getFather() {

        return father;
    }

    public String getMother() {
        return mother;
    }

    public void fatherName() {
        if (father == null) {
            System.out.println("Unknown");
        } else {
            System.out.println(father);
        }
    }

    boolean hasSameMotherAs(Dog otherDog) {
        return mother.equals(otherDog.mother);
    }
}
