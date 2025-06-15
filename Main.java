import java.util.*;

public class Main {
    public static void main(String[] args){
        int[] rollNumber=new int[]{1,2,3,4,5};
        String[] name=new String[]{"Neama","Jasmine","Priya","Manu","Sanjeev"};
        int[] age=new int[]{21,32,12,32,45};
        Scanner sc=new Scanner(System.in);
        System.out.println("Actions available");
        System.out.println("1. Access data");
        System.out.println("2. Manipulate data");
        System.out.println("Choose your action:");
        int option=sc.nextInt();
        if(option==1){
            System.out.println("Choose a data on which you would like to access the data:");
            System.out.println("1. Roll Number");
            System.out.println("2. Name");
            System.out.println("3. Age");
            int choice1=sc.nextInt();
            if(choice1==1){
                System.out.println("Enter the roll number:");
                int chosenRollNumber=sc.nextInt();
                for(int i=0;i<rollNumber.length;i++){
                    if(rollNumber[i]==chosenRollNumber){
                        System.out.println("Name: "+name[i]);
                        System.out.println("Age: "+age[i]);
                    }
                }
            }
            else if(choice1==2){
                System.out.println("Enter the name:");
                sc.nextLine();
                String chosenName=sc.nextLine();
                for(int i=0;i<name.length;i++){
                    if(name[i].equals(chosenName)){
                        System.out.println("Roll Number: "+rollNumber[i]);
                        System.out.println("Age: "+age[i]);
                    }
                }
            }
            else if(choice1==3){
                System.out.println("Enter the age:");
                int chosenAge=sc.nextInt();
                for(int i=0;i<age.length;i++){
                    if(age[i]==chosenAge){
                        System.out.println("Roll Number: "+rollNumber[i]);
                        System.out.println("Name: "+name[i]);
                    }
                }
            }
            else{
                System.out.println("Invalid option!");
            }
        }
        else if(option==2){
            System.out.println("Choose a data to be edited:");
            System.out.println("1. Roll Number");
            System.out.println("2. Name");
            System.out.println("3. Age");
            int choice2=sc.nextInt();
            if(choice2==1){
                System.out.println("Choose the information you know:");
                System.out.println("1. Name");
                System.out.println("2. Age");
                int choice3=sc.nextInt();
                if(choice3==1){
                    System.out.println("Enter the name:");
                    sc.nextLine();
                    String chosen_Name=sc.nextLine();
                    for(int i=0;i<name.length;i++){
                        if(name[i].equals(chosen_Name)){
                            System.out.println("Enter the new roll number: ");
                            int EditedRollNumber=sc.nextInt();
                            rollNumber[i]=EditedRollNumber;
                            System.out.println("Updated roll number: "+rollNumber[i]);
                        }
                    }
                }
                else if(choice3==2){
                    System.out.println("Enter the age:");
                    int chosen_Age=sc.nextInt();
                    for(int i=0;i<age.length;i++){
                        if(age[i]==chosen_Age){
                            System.out.println("Enter the new roll number: ");
                            int EditedRollNumber=sc.nextInt();
                            rollNumber[i]=EditedRollNumber;
                            System.out.println("Updated roll number: "+rollNumber[i]);
                        }
                    }
                }
            }
            if(choice2==2){
                System.out.println("Choose the information you know:");
                System.out.println("1. Roll Number");
                System.out.println("2. Age");
                int choice4=sc.nextInt();
                if(choice4==1){
                    System.out.println("Enter the roll number:");
                    int chosen_RollNumber=sc.nextInt();
                    for(int i=0;i<rollNumber.length;i++){
                        if(rollNumber[i]==chosen_RollNumber){
                            System.out.println("Enter the new name: ");
                            sc.nextLine();
                            String EditedName=sc.nextLine();
                            name[i]=EditedName;
                            System.out.println("Updated name: "+name[i]);
                        }
                    }
                }
                else if(choice4==2){
                    System.out.println("Enter the age:");
                    int chosen_Age=sc.nextInt();
                    for(int i=0;i<age.length;i++){
                        if(age[i]==chosen_Age){
                            System.out.println("Enter the name: ");
                            sc.nextLine();
                            String EditedName=sc.nextLine();
                            name[i]=EditedName;
                            System.out.println("Updated name: "+name[i]);
                        }
                    }
                }
            }
            if(choice2==3){
                System.out.println("Choose the information you know:");
                System.out.println("1. Roll Number");
                System.out.println("2. Name");
                int choice5=sc.nextInt();
                if(choice5==1){
                    System.out.println("Enter the roll number:");
                    int chosen_RollNumber=sc.nextInt();
                    for(int i=0;i<rollNumber.length;i++){
                        if(rollNumber[i]==chosen_RollNumber){
                            System.out.println("Enter the new age: ");
                            int EditedAge=sc.nextInt();
                            age[i]=EditedAge;
                            System.out.println("Updated age: "+age[i]);
                        }
                    }
                }
                else if(choice5==2){
                    System.out.println("Enter the name:");
                    sc.nextLine();
                    String chosen_Name=sc.nextLine();
                    for(int i=0;i<age.length;i++){
                        if(name[i].equals(chosen_Name)){
                            System.out.println("Enter the age: ");
                            int EditedAge=sc.nextInt();
                            age[i]=EditedAge;
                            System.out.println("Updated age: "+age[i]);
                        }
                    }
                }
            }
        }

    }
}