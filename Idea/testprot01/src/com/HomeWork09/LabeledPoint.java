package com.HomeWork.HomeWork09;

import com.HomeWork.HomeWork10.Doctor;

public class LabeledPoint extends Point {
    private String Label;
    public LabeledPoint(String Label, int x, int y) {
        super(x, y);
        this Label = Label;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(!(obj instanceof Doctor)) {
            return false;
        }
        Doctor doctor = (Doctor)obj;
        if(this.name.equals(doctor.name))
    }
}
