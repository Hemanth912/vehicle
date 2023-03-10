package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name,4,4,5,isManual,"red",6);
        //Use arbitrary values for parameters which are not mentione
    }

    public void accelerate(int rate){
        int newSpeed =this.getCurrentSpeed()+rate; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            this.setGears(1);

        }
        //for all other cases, change the gear accordingly
        if(newSpeed >=1 && newSpeed<=50) {
            //Stop the car, set gear as 1
            this.setGears(1);

        }
        else if(newSpeed >=51 && newSpeed<=1000) {
            //Stop the car, set gear as 1
            this.setGears(2);

        }else if(newSpeed >=101 && newSpeed<=150) {
            //Stop the car, set gear as 1
            this.setGears(3);

        }else if(newSpeed >=151 && newSpeed<=2000) {
            //Stop the car, set gear as 1
            this.setGears(4);

        }else if(newSpeed >=201 && newSpeed<=250) {
            //Stop the car, set gear as 1
            this.setGears(5);

        }
        else if(newSpeed >=250) {
            //Stop the car, set gear as 1
            this.setGears(6);

        }
        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
