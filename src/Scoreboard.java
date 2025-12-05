public class Scoreboard {
    static String team1 = "";
    static String team2 = "";
    static int Orange = 0;
    static int Yellow = 0;
    static int Red = 0;
    static int Green = 0;
    static int Violet = 0;
    static int Indigo = 0;
    static int Blue = 0;

    static int points1 = 0;
    static int points2 = 0;
    static boolean firstTeam = true;

    public void constructor(String name1, String name2) {
        team1 = name1;
        team2 = name2;
    }

    // Pass the team/color names to update the correct color variables
    public static void recordPlay(int pnt, String a, String b) {
        if (pnt > 0) {
            if (firstTeam) {
                points1 += pnt;
            } else {
                points2 += pnt;
            }
        } else {
            firstTeam = !firstTeam;
        }
    }

    public static String getScoreStatic() {
        if (points1 > points2) return points1 + "-" + points2 + "-" + team1;
        return points2 + "-" + points1 + "-" + team2;
    }
    public static void reset() {
        points1 = 0;
        points2 = 0;
    }
    public static void colorScoreRecord() {
        if (points1 > points2) {
            if (team1.equals("Orange")) Orange += 1;
            if (team1.equals("Yellow")) Yellow += 1;
            if (team1.equals("Red")) Red += 1;
            if (team1.equals("Green")) Green += 1;
            if (team1.equals("Violet")) Violet += 1;
            if (team1.equals("Indigo")) Indigo += 1;
            if (team1.equals("Blue")) Blue += 1;
        }
        if (points2 > points1) {
            if (team2.equals("Orange")) Orange += 1;
            if (team2.equals("Yellow")) Yellow += 1;
            if (team2.equals("Red")) Red += 1;
            if (team2.equals("Green")) Green += 1;
            if (team2.equals("Violet")) Violet += 1;
            if (team2.equals("Indigo")) Indigo += 1;
            if (team2.equals("Blue")) Blue += 1;
        }
    }
}