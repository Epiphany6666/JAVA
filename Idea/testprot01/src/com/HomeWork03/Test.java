package com.HomeWork.HomeWork03;

public class Test {
    public static void main(String[] args) {
        HomeWork03[] homeWork03s = new HomeWork03[3];
        homeWork03s[0] = new professor("milan", 10, "教授", 13000);
        homeWork03s[1] = new ViceProfessor("xh", 10, "教授", 12000);
        homeWork03s[1] = new teacher("xz", 10, "教授", 11000);
        for (int i = 0; i < 3; i++) {
            if (homeWork03s[i] instanceof professor) {
                ((professor).homeWork03s[i]).introduce();
            } else if (homeWork03s[i] instanceof ViceProfessor) {
                ((ViceProfessor).homeWork03s[i]).introduce();
            } else if (homeWork03s[i] instanceof teacher) {
                ((teacher).homeWork03s[i]).introduce();
            }
        }
    }
}
