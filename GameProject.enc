import java.util.Scanner;

public class GameProject {
    String name1, name2;
    int num1[] = new int[4];
    int num2[] = new int[4];
    int dead = 0;
    int wounded = 0;
    Scanner input = new Scanner(System.in);
    public void getName(){
        System.out.println("Player 1 Name = ");
        name1 = input.nextLine();
        System.out.println("Player 2 Name = ");
        name2 = input.nextLine();
}
    public void getP1Nos(){
        Scanner input = new Scanner(System.in);
        System.out.println(name1.toUpperCase() + ", " + "ENTER FOUR NUMBERS FROM 0-9");
        for(int i = 0; i<= 3; i++){
            num1[i] = input.nextInt();
            if(i>0){
                for(int j = 0; j<i; j++){
                    if((num1[i] == num1[j])){
                        System.out.println("ERROR(Number has been inputed");
                        num1[i] = input.nextInt();
                    }
                }
            }
        }
    }
    public void getP2Nos(){
           Scanner input = new Scanner(System.in);
        System.out.println(name2.toUpperCase() + ", " + "ENTER FOUR NUMBERS FROM 0-9");
        for(int i = 0; i<= 3; i++){
            num2[i] = input.nextInt();
            if(i>0){
                for(int j = 0; j<i; j++){
                    if((num2[i] == num2[j])){
                        System.out.println("ERROR(Number has been inputed");
                        num2[i] = input.nextInt();
                    }
                }
            }
        }
    }
    public  boolean check(int arry[],int value){
        boolean test = false;
        for (int element : arry){
            if (element == value){
                test =  true;
                break;
            }
        }
        return test;
    }
    public void process(){
        int win = 0;
        int skip = 0;
        
        getP1Nos();
        getP2Nos();
        
        int no1[] = new int[4];
        int no2[] = new int[4];
        while(dead <= 4){
            if(skip == 0){
                System.out.println(name2.toUpperCase() + ", " + "GUESS " + name1.toUpperCase() + " NUMBERS" );
                
            for(int i = 0; i <= 3; i++){
                no2[i] = input.nextInt();
            }
            for(int i = 0; i <= 3; i++){
                if(no2[i] == num1[i]) {
                    dead++;
                } else if(check( num1,no2[i])){
                    wounded++;
                }
            }

                System.out.println(dead + "D");
                System.out.println(wounded + "W");


            if(dead == 4){
                win = 2;
                break;
            }else {
                    dead = 0;
                wounded = 0;
            }

            skip = 1;
            }
            else if(skip == 1){
                System.out.println(name1.toUpperCase() + ", " + "GUESS " + name2.toUpperCase() + " NUMBERS" );
                for(int i = 0; i <= 3; i++){
                    no1[i] = input.nextInt();
                }
                for(int i = 0; i <= 3; i++){
                    if(no1[i] == num2[i]){
                        dead++;
                    } else if (check(num2,no1[i])) {
                        wounded++;
                    }
                }
                System.out.println(dead + "D");
                System.out.println(wounded + "W");

                if(dead == 4){
                    win = 1;
                    break;
                }else {
                    dead = 0;
                    wounded = 0;
                }
                skip = 0;
            }


        }
        System.out.println("Game Over!");
        if(win == 1){
            System.out.println(name1.toUpperCase() + "wins the game");
        }
        else if(win == 2){
            System.out.println(name2.toUpperCase() + " wins the game");
        }
    }
    
    
   
    public static void main(String[] args) {
        GameProject g1 = new GameProject();
        g1.getName();
        g1.process();
    }
    
}
