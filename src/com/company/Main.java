package com.company;

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
        User user1=new User("userid1","name1","email@example.com");
        User user2=new User("userid2","name2","email@example.com");
        user2.addFollow(user1);//example of observer disgn pattern
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
