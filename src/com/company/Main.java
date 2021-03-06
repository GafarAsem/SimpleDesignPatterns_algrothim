package com.company;

import com.company.observe.Post;
import com.company.observe.User;
import com.company.singlet.Singleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {


        //same object       //example of singleton disgn pattern
        Singleton singleton1=Singleton.getInstance();
        Singleton singleton2=Singleton.getInstance();
///////////////////////////////////////////////////////////
        User user1=new User("userid1","name1","email1@example.com");
        User user2=new User("userid2","name2","email2@example.com");
        User user3=new User("userid3","name3","email3@example.com");
        user2.addFollow(user1);  //example of observer disgn pattern
        user2.addFollow(user3);
        user3.addFollow(user1);
        Post post1=new Post(1,user1,"Hello"," ");
        Post post2=new Post(1,user3,"mmm"," ");


        ////////////////////////////////////////




    }
    



    private static void binarySearch() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(3, 14, 20, 28,32, 40,43,50,100,112,201,201,260,307,450,500));
     //   ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(256, 2754, 33, 77, 44));
        Collections.sort(list1);
       // Collections.sort(list2);
        int i = 112;

        for (int j = 1; j < 20; j++) {

            if(list1.size()!=1) {
                int no1 = list1.get((1 + list1.size()) / 2);

                if (no1 == i) {
                    System.out.println(j);
                    System.out.println(no1);
                    break;
                } else if (no1 > i) {
                    list1.subList((1 + list1.size()) / 2, list1.size()).clear();
                } else if (no1 < i) {
                    list1.subList(0, (1 + list1.size()) / 2).clear();
                }
            }
            else {
                System.out.println(j);
                System.out.println(list1.get(0));
                break;
            }

        }





    }

    public static ArrayList<Integer> getCoin(int money) {

        ArrayList<Integer> typeMoney = new ArrayList<>(Arrays.asList(500, 100, 50, 10, 5, 1));
        ArrayList<Integer> newMoney = new ArrayList<>();

        for (int i = 0; i < typeMoney.size(); i++) {
            while (true) {
                if (money != 0 && money > 0 && money >= typeMoney.get(i)) {
                    if (money - typeMoney.get(i) >= 0) {
                        money = money - typeMoney.get(i);
                        newMoney.add(typeMoney.get(i));
                    }

                } else break;
            }
        }
        return newMoney;


    }

    static void n() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(34, 32, 62, 14, 53));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(256, 2754, 33, 77, 44));
        int i = 53 + 44;

        for (int j = 0; j < list1.size(); j++) {
            int r = i - list1.get(j);
            if (list2.contains(r)) {
                int n = list2.indexOf(r);
                System.out.println(list2.get(n));
                System.out.println(list1.get(j));
                System.out.println(j+1);
                break;


            }
        }
    }


    static void n2() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(34, 32, 62, 14, 53));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(256, 2754, 33, 77, 44));

        int i = 53 + 44;
        int n =0;
        for (int j = 0; j < list1.size(); j++) {

            for (int k = 0; k < list2.size(); k++) {

                n++;
                if(list1.get(j)+list2.get(k)==i){
                    System.out.println(list2.get(k));
                    System.out.println(list1.get(j));
                    System.out.println(n);
                    break;
                }

            }
        }
    }

}
