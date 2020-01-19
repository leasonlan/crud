package com.example.crud.entity;

/**
 * @author desheng.lan
 * @version 1.0
 * @date 2019/12/6 0006 上午 9:19
 */
public class Myuser {
    
    private int id;
    private String username;
    private String password;
    private String name;
    private String classNum;

    public Myuser(){
        /*
        * 构造函数*/
    }
    public Myuser(int id,String username){
        super();
        this.id=id;
        this.username=username;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    @Override
    public String toString() {
        return "Myuser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", classNum='" + classNum + '\'' +
                '}';
    }
}
