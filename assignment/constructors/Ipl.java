public class Ipl {
    String teamName;
    int teamNumbers;
    String captain;
    String impactPlayer;
    String wKeeper;
    int matchesWin;
    double runRate;
    String couch;

    Ipl(double runRate,
            String couch) {
        this.runRate = runRate;
        this.couch = couch;

    }

    Ipl(String wKeeper,
            int matchesWin,
            double runRate,
            String couch) {
        this(runRate, couch);
        this.wKeeper = wKeeper;
        this.matchesWin = matchesWin;

    }

    Ipl(String captain,
            String impactPlayer,
            String wKeeper,
            int matchesWin,
            double runRate,
            String couch) {
        this(wKeeper, matchesWin, runRate, couch);
        this.impactPlayer = impactPlayer;
        this.captain = captain;

    }

    Ipl(String teamName,
            int teamNumbers,
            String captain,
            String impactPlayer,
            String wKeeper,
            int matchesWin,
            double runRate,
            String couch) {
        this(captain, impactPlayer, wKeeper, matchesWin, runRate, couch);
        this.teamName = teamName;
        this.teamNumbers = teamNumbers;
    }

    public void display() {
        System.out.println("<================ Team " + this.teamName + " ===============>");
        System.out.println("Team Name : " + this.teamName);
        System.out.println("Team Members : " + this.teamNumbers);
        System.out.println("Captain : " + this.captain);
        System.out.println("Impact Player : " + this.impactPlayer);
        System.out.println("WKeeper : " + this.wKeeper);
        System.out.println("Matches win : " + this.matchesWin);
        System.out.println("Run Rate : " + this.runRate);
        System.out.println("couch : " + this.couch);
        System.out.println("<================ Team " + this.teamName + " ===============>");
    }

}
