import java.util.HashMap;
import java.util.Scanner;

public class Main{
    private Main(){
        currentOwner = null;
        login = false;
        lastOwnerId = 0;
        tree = null;
        nodeNumber = 0;
    }
    private boolean checkUserValidOrNot(String user){
        return hh.containsKey(user);
    }
    private int nodeNumber;
    private static Scanner sc = new Scanner(System.in);
    private Owner currentOwner;
    private Tree tree;
    private boolean login;
    private int lastOwnerId;
    private HashMap<String,Integer> hh = new HashMap<>();
    public static void main(String[] args){
        Main app = new Main();
        int choice;
        String temp;
        System.out.println("1:Log in with existing user");
        System.out.println("2:Create a new user");
        choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Input your username");
                temp = sc.nextLine();
                if(app.checkUserValidOrNot(temp)){
                    app.currentOwner= new Owner(temp,app.hh.get(temp));
                    app.login = true;
                    app.tree = new Tree();
                }
                else{
                    System.out.println("You Are not a valid user");
                }
                break;
            case 2:
                //Add a new user
            default:
                //do something
        }
        while(app.login){
            tree.creatGenesisNode(data,app.nodeNumber);
            tree.createChildNode(//data,valueOfParent);
        }
    }
}