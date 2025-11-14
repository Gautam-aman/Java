package com.cfs.designpattern;




public class Builder {
    private String name;
    private  String speed;
    private String milage;
    private String cost;
    private String color;
    private Builder(CarBuilder builder) {
        builder.setColor(builder.color);
        builder.setName(name);
        builder.setSpeed(speed);
        builder.setMilage(milage);
        builder.setCost(cost);
    }


    //Setters
    public String getName(){
        return name;
    }

    public static class CarBuilder{
        private String name="Aman";
        private  String speed="40";
        private String milage = "3";
        private String cost ="3";
        private String color="3";

        public CarBuilder setName(String name) {
            this.name = name;
            return this;
        }
        public CarBuilder setSpeed(String speed) {
            this.speed = speed;
            return this;
        }

        public CarBuilder setMilage(String milage) {
            this.milage = milage;
            return this;
        }

        public CarBuilder setCost(String cost) {
            this.cost = cost;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder build() {
            return new Builder(this);
        }

    }



}
