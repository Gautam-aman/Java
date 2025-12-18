package pattern.Builder;

// Builder Design pattern

import com.cfs.designpattern.Builder;

class User{
    private String name;
    private int age;
    private int height;

    private User(Builder builder){
        this.name = builder.name;
        this.age  = builder.age;
        this.height = builder.height;
    }

    public void execute() {
        System.out.println("User's name is " + name);
        System.out.println("User's age is " + age);
        System.out.println("User's height is " + height);
    }


    public static class Builder{
        private String name;
        private int age;
        private int height;

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Builder setHeight(int height){
            this.height = height;
            return this;
        }

        public User build(){
            // here you can check validatios
            return new User(this);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        User u = new User.Builder()
                .setName("Aman")
                .setAge(21)
                .build();
        u.execute();
        System.out.println("User Build SuccessFully");


    }
}
