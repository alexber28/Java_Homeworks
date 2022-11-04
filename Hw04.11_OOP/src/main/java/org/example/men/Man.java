package org.example.men;

public class Man {
    private String name;
    private int age;
    private String sex;
    private int weight;

    public Man(String name, int age, String sex, int weight) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", weight=" + weight;
    }
}
