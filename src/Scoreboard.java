public class Scoreboard {
    String team1 = "";
    String team2 = "";
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
            if (a.equals("Orange")) Orange += pnt;
            if (b.equals("Orange")) Orange += pnt;
            if (a.equals("Yellow")) Yellow += pnt;
            if (b.equals("Yellow")) Yellow += pnt;
            if (a.equals("Red")) Red += pnt;
            if (b.equals("Red")) Red += pnt;
            if (a.equals("Green")) Green += pnt;
            if (b.equals("Green")) Green += pnt;
            if (a.equals("Violet")) Violet += pnt;
            if (b.equals("Violet")) Violet += pnt;
            if (a.equals("Indigo")) Indigo += pnt;
            if (b.equals("Indigo")) Indigo += pnt;
            if (a.equals("Blue")) Blue += pnt;
            if (b.equals("Blue")) Blue += pnt;
        } else {
            firstTeam = !firstTeam;
        }
    }

    public static String getScoreStatic() {
        if (points1 > points2) return points1 + "-" + points2;
        return points1 + "-" + points2;
    }
}