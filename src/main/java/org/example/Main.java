package org.example;

public class Main {
    public static void main(String[] args) {
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog +" " + " " + cat + " " + paper);

        dog= dog + 4;
        cat+=4;
        paper+=4;
        System.out.println(dog +" " + " " + cat + " " + paper);

        var dog1 = dog + 3.6;
        cat+=1.6;
        paper+=7639;

        System.out.println(dog1 +" " + " " + cat + " " + paper);

        var friend = 19;
        System.out.println(friend);
        friend = (friend + 2);
        System.out.println(friend);
        friend = friend / 2;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog*=10;
        System.out.println(frog);
        frog/=3.5;
        System.out.println(frog);
        frog+=4;
        System.out.println(frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var sum = boxer1 + boxer2;
        System.out.println(sum);
        var diff = boxer2 - boxer1;
        System.out.println(diff);
        boxer2%=boxer1;
        System.out.println(boxer2);

        var allTime = 640;
        var workTime = 8;
        var employees = allTime/workTime;
        System.out.println("Всего работников в компании – " + employees + " человек");

        employees+=94;
        allTime+= workTime * employees;
        System.out.println("Если в компании работает " + employees + " человек, то всего " + allTime + " часов работы может быть поделено между сотрудниками");
    }
}