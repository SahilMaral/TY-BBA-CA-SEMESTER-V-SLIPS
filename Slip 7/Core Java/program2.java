import java.util.Scanner;

class program2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many players do you want to enter: ");
        int no = sc.nextInt();
        player obj[] = new player[5];
        for (int i = 0; i < no; i++) {
            System.out.print("Enter a player id: ");
            int id = sc.nextInt();
            System.out.print("Enter a player name: ");
            String name = sc.next();
            System.out.print("Enter a player runs: ");
            int runs = sc.nextInt();
            System.out.print("Enter a player innings: ");
            int in = sc.nextInt();
            System.out.print("Enter a player not out: ");
            int out = sc.nextInt();
            obj[i] = new player(id, name, in, runs, out);
        }
        sc.close();
        float max = 0;
        System.out.println("Maximum avergage of players is: ");
        for (int i = 0; i < no; i++) {
            if (obj[i].avg >= max) {
                max = obj[i].avg;
            }
        }
        for (int i = 0; i < no; i++) {
            if (obj[i].avg == max) {
                obj[i].display();
            }
        }
        System.out.print("Maximum averrage: "+max);
    }
}

class player {
    int p_id, t_runs, innings, not_out;
    String p_name;
    float avg;

    player() {

    }

    player(int id, String name, int in, int runs, int out) {
        p_id = id;
        p_name = name;
        t_runs = runs;
        innings = in;
        not_out = out;
        avg = t_runs / innings - not_out;
    }

    void display() {
        System.out.println("Id: " + p_id);
        System.out.println("Name: " + p_name);
        System.out.println("Total Runs: " + t_runs);
        System.out.println("Innings: " + innings);
        System.out.println("Not out: " + not_out);
    }
}