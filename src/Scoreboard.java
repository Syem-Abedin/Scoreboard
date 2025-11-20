public class Scoreboard {
    String team1 = "";
    String team2 = "";
    static int points1 = 0;
    static int points2 = 0;
    static boolean firstTeam = true;
    public void constructor(String name1, String name2) {
        team1 = name1;
        team2 = name2;
    }
    public static void recordPlay(int pnt) {
        if (pnt > 0) {
            if (firstTeam) {
                points1 = points1 + pnt;
            } else {
                points2 = points2 + pnt;
            }
        } else {
            firstTeam = !firstTeam;
        }
    }
    public String getScore() {
        if (points1 > points2) return points1 + "-" + points2 + "-" + team1;
        return points1 + "-" + points2 + "-" + team2;
    }
}
