package com.company;


import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ac1 = new Scanner(System.in);
//declaring my variables
        String firstName;
        String lastName;
        String id;
        //prompt the user with what he/she will enter
        System.out.println("How many users are you going to enter?");
        //making  um equals to the user input
        int num = ac1.nextInt();
        //calling the athlete class here
        Athlete obj[] = new Athlete[num];
//a while loop to store the first name, last and id in an array
        for(int i =0; i<num; i++){
            //calling the accept method to this array
            String[] data = Accept();
            //first name will be the first index of the array here
            firstName = data[0];
            lastName = data[1];
            id = data[2];
            Integer[] point = EntryScores();
            obj[i] = new Athlete(firstName, lastName, id, point);


        }
//a for loop for displaying the results
        for(int i=0; i<num; i++){
            obj[i].Display();
        }



    }
//creating a method to accept user entry
    public static String[] Accept() {

        String FirstName;
        String Lastname;
        String id;
        String[] data = new String[3];
        Scanner ac1 = new Scanner(System.in);
        //getting user input
            System.out.println("Enter player first name: ");
            System.out.println("Enter player last name: ");
            System.out.println("Enter the id number: ");
            FirstName = ac1.nextLine();
        Lastname = ac1.nextLine();
        id = ac1.nextLine();
        //storing them into arrays
            data[0] = FirstName;
            data[1] = Lastname;
            data[2] = id;



        return data;







    }


    public static Integer[] EntryScores() {
        ArrayList<Integer> score = new ArrayList<>();
        int points;
        Scanner ac = new Scanner(System.in);
        //while user has not pressed 1 the games score will be asked repeatidly until user presses 1 to stop

            while (true) {
                System.out.println("enter the games score of the player, press 1 to end");
                points = ac.nextInt();
                //add points to the array
                score.add(points);

                if (points == 1) {

                    break;
                }



            }
            score.remove(score.size() - 1);
            Integer[] playerpoints = score.toArray(new Integer[score.size()]);

            return playerpoints;

        }


}

