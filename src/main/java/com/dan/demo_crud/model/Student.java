package com.dan.demo_crud.model;

import org.hibernate.annotations.Parent;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @Pattern(regexp = "^\\S{6,}$\n", message = "Độ dài từ 6 - 10 ký tự")
    private String name;

    @Min(value = 18, message = "18 tuổi trở lên")
    private int age;
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$\n", message = "Nhập theo định dạng test@gmail.com")
    private String email;

    @ManyToOne
    private Clazz clazz;

    public Student() {}

    public Student(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Student(Long id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Student(Long id, String name, int age, String email, Clazz clazz) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.clazz = clazz;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }
}
