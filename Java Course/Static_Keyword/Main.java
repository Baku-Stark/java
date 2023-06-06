package Static_Keyword;

public class Main {
    public static void main(String[] args){
        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");

        Friend.displayFriends();
    }
}

class Friend{
    String name;
    static int numberOfFriends;

    Friend(String name){
        this.name = name;
        numberOfFriends++;
    }

    static void displayFriends(){
        System.out.println("You have " + numberOfFriends + " friends");
    }
}
