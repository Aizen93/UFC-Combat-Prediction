public class Combatsortiebis {
    private String nom;
    private int taille ;
    private double reach;
    private int age;
    private int NbMatch;
    private int NbTitleMatch;;
    private int NbRound;
    private double PourcentageWin;
    private int NbWinStreak;
    private double PourcentageWinTKO;
    private double PourcentageWinDecision;
    private double PourcentageWinSubmission;
    private double PourcentageLoss;
    private int NbLossStreak;
    private double PourcentageLossTKO;
    private double PourcentageLossDecision;
    private double PourcentageLossSubmission;
    private double PourcentageHead;
    private double PourcentageHeadDef;
    private double PourcentageBody;
    private double PourcentageBodyDef;
    private double PourcentageLeg;
    private double PourcentageLegDef;
    private double PourcentageSigStrike;
    private double PourcentageSigStrikeDef;
    private double PourcentageStrike;
    private double PourcentageStrikeDef;
    private double PourcentageTakedown;
    private double PourcentageTakedownDef;
    private double PourcentageClinch;
    private double PourcentageClinchDef;
    private double PourcentageDistance;
    private double PourcentageDistanceDef;
    private double PourcentageGround;
    private double PourcentageGroundDef;
    private int SubAttempts;
    private int SubAttemptsDef;
    private int pass;
    private int reversals;
    private int NbSigStrike;
    private int NbStrike;
    private int NbHead;
    private int NbBody;
    private int NbLeg;
    private int NbTakedown;
    private int NbClinch;
    private int NbDistance;
    private int NbGround;
    private int NbSigStrikeDef;
    private int NbStrikeDef;
    private int NbHeadDef;
    private int NbBodyDef;
    private int NbLegDef;
    private int NbTakedownDef;
    private int NbClinchDef;
    private int NbDistanceDef;
    private int NbGroundDef;	
    private int NbMatchAgainstAdv;
    private int NbWinAgainstAdv;
    private int NbLossAgainstAdv;
    private String nom2;
    private int taille2;
    private double reach2;
    private int age2;
    private int NbMatch2;
    private int NbTitleMatch2;
    private int NbRound2;
    private double PourcentageWin2;
    private int NbWinStreak2;
    private double PourcentageWinTKO2;
    private double PourcentageWinDecision2;
    private double PourcentageWinSubmission2;
    private double PourcentageLoss2;
    private int NbLossStreak2;
    private double PourcentageLossTKO2;
    private double PourcentageLossDecision2;
    private double PourcentageLossSubmission2;
    private double PourcentageHead2;
    private double PourcentageHeadDef2;
    private double PourcentageBody2;
    private double PourcentageBodyDef2;
    private double PourcentageLeg2;
    private double PourcentageLegDef2;
    private double PourcentageSigStrike2;
    private double PourcentageSigStrikeDef2;
    private double PourcentageStrike2;
    private double PourcentageStrikeDef2;
    private double PourcentageTakedown2;
    private double PourcentageTakedownDef2;
    private double PourcentageClinch2;
    private double PourcentageClinchDef2;
    private double PourcentageDistance2;
    private double PourcentageDistanceDef2;
    private double PourcentageGround2;
    private double PourcentageGroundDef2;
    private int SubAttempts2;
    private int SubAttemptsDef2;
    private int pass2;
    private int reversals2;
    private int NbSigStrike2;
    private int NbStrike2;
    private int NbHead2;
    private int NbBody2;
    private int NbLeg2;
    private int NbTakedown2;
    private int NbClinch2;
    private int NbDistance2;
    private int NbGround2;	
    private int NbSigStrikeDef2;
    private int NbStrikeDef2;
    private int NbHeadDef2;
    private int NbBodyDef2;
    private int NbLegDef2;
    private int NbTakedownDef2;
    private int NbClinchDef2;
    private int NbDistanceDef2;
    private int NbGroundDef2;
    private int NbMatchAgainstAdv2;
    private int NbWinAgainstAdv2;
    private int NbLossAgainstAdv2;
    
    private int id_fight;
    private String res;

    public Combatsortiebis(String nom, int taille, double reach, int age, int nbMatch, int nbTitleMatch,
            int nbRound, double pourcentageWin, int nbWinStreak, double pourcentageWinTKO,
            double pourcentageWinDecision, double pourcentageWinSubmission, double pourcentageLoss, int nbLossStreak,
            double pourcentageLossTKO, double pourcentageLossDecision, double pourcentageLossSubmission,
            double pourcentageHead, double pourcentageHeadDef, double pourcentageBody, double pourcentageBodyDef,
            double pourcentageLeg, double pourcentageLegDef, double pourcentageSigStrike,
            double pourcentageSigStrikeDef, double pourcentageStrike, double pourcentageStrikeDef,
            double pourcentageTakedown, double pourcentageTakedownDef, double pourcentageClinch,
            double pourcentageClinchDef, double pourcentageDistance, double pourcentageDistanceDef,
            double pourcentageGround, double pourcentageGroundDef, int subAttempts, int subAttemptsDef, int pass,
            int reversals, int NbSigStrike, int NbStrike, int NbHead, int NbBody, int NbLeg, int NbTakedown,
            int NbClinch, int NbDistance, int NbGround
            , int NbSigStrikeDef, int NbStrikeDef, int NbHeadDef, int NbBodyDef, 
            int NbLegDef, int NbTakedownDef, int NbClinchDef, int NbDistanceDef, int NbGroundDef, int NbMatchAgainstAdv, 
            int NbWinAgainstAdv, int NbLossAgainstAdv, 

            String nom2, int taille2, double reach2, int age2, int nbMatch2, int nbTitleMatch2,
            int nbRound2, double pourcentageWin2, int nbWinStreak2, double pourcentageWinTKO2,
            double pourcentageWinDecision2, double pourcentageWinSubmission2, double pourcentageLoss2,
            int nbLossStreak2, double pourcentageLossTKO2, double pourcentageLossDecision2,
            double pourcentageLossSubmission2, double pourcentageHead2, double pourcentageHeadDef2,
            double pourcentageBody2, double pourcentageBodyDef2, double pourcentageLeg2, double pourcentageLegDef2,
            double pourcentageSigStrike2, double pourcentageSigStrikeDef2, double pourcentageStrike2,
            double pourcentageStrikeDef2, double pourcentageTakedown2, double pourcentageTakedownDef2,
            double pourcentageClinch2, double pourcentageClinchDef2, double pourcentageDistance2,
            double pourcentageDistanceDef2, double pourcentageGround2, double pourcentageGroundDef2, int subAttempts2,
            int subAttemptsDef2, int pass2, int reversals2, int NbSigStrike2, int NbStrike2, int NbHead2, int NbBody2, 
            int NbLeg2, int NbTakedown2, int NbClinch2, int NbDistance2, int NbGround2 , int NbSigStrikeDef2, int NbStrikeDef2, 
            int NbHeadDef2, int NbBodyDef2, int NbLegDef2, int NbTakedownDef2, int NbClinchDef2, int NbDistanceDef2, 
            int NbGroundDef2, int NbMatchAgainstAdv2, int NbWinAgainstAdv2, int NbLossAgainstAdv2) {
            
            this.nom = nom;
            this.taille = taille;
            this.reach = reach;
            this.age = age;
            this.NbMatch = nbMatch;
            this.NbTitleMatch = nbTitleMatch;
            this.NbRound = nbRound;
            this.PourcentageWin = pourcentageWin;
            this.NbWinStreak = nbWinStreak;
            this.PourcentageWinTKO = pourcentageWinTKO;
            this.PourcentageWinDecision = pourcentageWinDecision;
            this.PourcentageWinSubmission = pourcentageWinSubmission;
            this.PourcentageLoss = pourcentageLoss;
            this.NbLossStreak = nbLossStreak;
            this.PourcentageLossTKO = pourcentageLossTKO;
            this.PourcentageLossDecision = pourcentageLossDecision;
            this.PourcentageLossSubmission = pourcentageLossSubmission;
            this.PourcentageHead = pourcentageHead;
            this.PourcentageHeadDef = pourcentageHeadDef;
            this.PourcentageBody = pourcentageBody;
            this.PourcentageBodyDef = pourcentageBodyDef;
            this.PourcentageLeg = pourcentageLeg;
            this.PourcentageLegDef = pourcentageLegDef;
            this.PourcentageSigStrike = pourcentageSigStrike;
            this.PourcentageSigStrikeDef = pourcentageSigStrikeDef;
            this.PourcentageStrike = pourcentageStrike;
            this.PourcentageStrikeDef = pourcentageStrikeDef;
            this.PourcentageTakedown = pourcentageTakedown;
            this.PourcentageTakedownDef = pourcentageTakedownDef;
            this.PourcentageClinch = pourcentageClinch;
            this.PourcentageClinchDef = pourcentageClinchDef;
            this.PourcentageDistance = pourcentageDistance;
            this.PourcentageDistanceDef = pourcentageDistanceDef;
            this.PourcentageGround = pourcentageGround;
            this.PourcentageGroundDef = pourcentageGroundDef;
            this.SubAttempts = subAttempts;
            this.SubAttemptsDef = subAttemptsDef;
            this.pass = pass;
            this.reversals = reversals;
            this.NbSigStrike=NbSigStrike;
            this.NbStrike=NbStrike;
            this.NbHead=NbHead;
            this.NbBody=NbBody;
            this.NbLeg=NbLeg;
            this.NbTakedown=NbTakedown;
            this.NbClinch=NbClinch;
            this.NbDistance=NbDistance;
            this.NbGround=NbGround;

            this.NbSigStrikeDef=NbSigStrikeDef;
            this.NbStrikeDef=NbStrikeDef;
            this.NbHeadDef=NbHeadDef;
            this.NbBodyDef=NbBodyDef;
            this.NbLegDef=NbLegDef;
            this.NbTakedownDef=NbTakedownDef;
            this.NbClinchDef=NbClinchDef;
            this.NbDistanceDef=NbDistanceDef;
            this.NbGroundDef=NbGroundDef;

            this.NbMatchAgainstAdv=NbMatchAgainstAdv;
            this.NbWinAgainstAdv=NbWinAgainstAdv;
            this.NbLossAgainstAdv=NbLossAgainstAdv;

            this.nom2 = nom2;
            this.taille2 = taille2;
            this.reach2 = reach2;
            this.age2 = age2;
            this.NbMatch2 = nbMatch2;
            this.NbTitleMatch2 = nbTitleMatch2;
            this.NbRound2 = nbRound2;
            this.PourcentageWin2 = pourcentageWin2;
            this.NbWinStreak2 = nbWinStreak2;
            this.PourcentageWinTKO2 = pourcentageWinTKO2;
            this.PourcentageWinDecision2 = pourcentageWinDecision2;
            this.PourcentageWinSubmission2 = pourcentageWinSubmission2;
            this.PourcentageLoss2 = pourcentageLoss2;
            this.NbLossStreak2 = nbLossStreak2;
            this.PourcentageLossTKO2 = pourcentageLossTKO2;
            this.PourcentageLossDecision2 = pourcentageLossDecision2;
            this.PourcentageLossSubmission2 = pourcentageLossSubmission2;
            this.PourcentageHead2 = pourcentageHead2;
            this.PourcentageHeadDef2 = pourcentageHeadDef2;
            this.PourcentageBody2 = pourcentageBody2;
            this.PourcentageBodyDef2 = pourcentageBodyDef2;
            this.PourcentageLeg2 = pourcentageLeg2;
            this.PourcentageLegDef2 = pourcentageLegDef2;
            this.PourcentageSigStrike2 = pourcentageSigStrike2;
            this.PourcentageSigStrikeDef2 = pourcentageSigStrikeDef2;
            this.PourcentageStrike2 = pourcentageStrike2;
            this.PourcentageStrikeDef2 = pourcentageStrikeDef2;
            this.PourcentageTakedown2 = pourcentageTakedown2;
            this.PourcentageTakedownDef2 = pourcentageTakedownDef2;
            this.PourcentageClinch2 = pourcentageClinch2;
            this.PourcentageClinchDef2 = pourcentageClinchDef2;
            this.PourcentageDistance2 = pourcentageDistance2;
            this.PourcentageDistanceDef2 = pourcentageDistanceDef2;
            this.PourcentageGround2 = pourcentageGround2;
            this.PourcentageGroundDef2 = pourcentageGroundDef2;
            this.SubAttempts2 = subAttempts2;
            this.SubAttemptsDef2 = subAttemptsDef2;
            this.pass2 = pass2;
            this.reversals2 = reversals2;
            this.NbSigStrike2=NbSigStrike2;
            this.NbStrike2=NbStrike2;
            this.NbHead2=NbHead2;
            this.NbBody2=NbBody2;
            this.NbLeg2=NbLeg2;
            this.NbTakedown2=NbTakedown2;
            this.NbClinch2=NbClinch2;
            this.NbDistance2=NbDistance2;
            this.NbGround2=NbGround2;

            this.NbSigStrikeDef2=NbSigStrikeDef2;
            this.NbStrikeDef2=NbStrikeDef2;
            this.NbHeadDef2=NbHeadDef2;
            this.NbBodyDef2=NbBodyDef2;
            this.NbLegDef2=NbLegDef2;
            this.NbTakedownDef2=NbTakedownDef2;
            this.NbClinchDef2=NbClinchDef2;
            this.NbDistanceDef2=NbDistanceDef2;
            this.NbGroundDef2=NbGroundDef2;

            this.NbMatchAgainstAdv2=NbMatchAgainstAdv2;
            this.NbWinAgainstAdv2=NbWinAgainstAdv2;
            this.NbLossAgainstAdv2=NbLossAgainstAdv2;
    }

    public int getId_fight() {
            return id_fight;
    }

    public String getNom() {
            return nom;
    }

    public int getTaille() {
            return taille;
    }

    public double getReach() {
            return reach;
    }

    public int getAge() {
            return age;
    }

    public int getNbMatch() {
            return NbMatch;
    }

    public int getNbTitleMatch() {
            return NbTitleMatch;
    }

    public int getNbRound() {
            return NbRound;
    }

    public double getPourcentageWin() {
            return PourcentageWin;
    }

    public int getNbWinStreak() {
            return NbWinStreak;
    }

    public double getPourcentageWinTKO() {
            return PourcentageWinTKO;
    }

    public double getPourcentageWinDecision() {
            return PourcentageWinDecision;
    }

    public double getPourcentageWinSubmission() {
            return PourcentageWinSubmission;
    }

    public double getPourcentageLoss() {
            return PourcentageLoss;
    }

    public int getNbLossStreak() {
            return NbLossStreak;
    }

    public double getPourcentageLossTKO() {
            return PourcentageLossTKO;
    }

    public double getPourcentageLossDecision() {
            return PourcentageLossDecision;
    }

    public double getPourcentageLossSubmission() {
            return PourcentageLossSubmission;
    }

    public double getPourcentageHead() {
            return PourcentageHead;
    }

    public double getPourcentageHeadDef() {
            return PourcentageHeadDef;
    }

    public double getPourcentageBody() {
            return PourcentageBody;
    }

    public double getPourcentageBodyDef() {
            return PourcentageBodyDef;
    }

    public double getPourcentageLeg() {
            return PourcentageLeg;
    }

    public double getPourcentageLegDef() {
            return PourcentageLegDef;
    }

    public double getPourcentageSigStrike() {
            return PourcentageSigStrike;
    }

    public double getPourcentageSigStrikeDef() {
            return PourcentageSigStrikeDef;
    }

    public double getPourcentageStrike() {
            return PourcentageStrike;
    }

    public double getPourcentageStrikeDef() {
            return PourcentageStrikeDef;
    }

    public double getPourcentageTakedown() {
            return PourcentageTakedown;
    }

    public double getPourcentageTakedownDef() {
            return PourcentageTakedownDef;
    }

    public double getPourcentageClinch() {
            return PourcentageClinch;
    }

    public double getPourcentageClinchDef() {
            return PourcentageClinchDef;
    }

    public double getPourcentageDistance() {
            return PourcentageDistance;
    }

    public double getPourcentageDistanceDef() {
            return PourcentageDistanceDef;
    }

    public double getPourcentageGround() {
            return PourcentageGround;
    }

    public double getPourcentageGroundDef() {
            return PourcentageGroundDef;
    }

    public int getSubAttempts() {
            return SubAttempts;
    }

    public int getSubAttemptsDef() {
            return SubAttemptsDef;
    }

    public int getPass() {
            return pass;
    }

    public int getReversals() {
            return reversals;
    }

    public String getNom2() {
            return nom2;
    }

    public int getTaille2() {
            return taille2;
    }

    public double getReach2() {
            return reach2;
    }

    public int getAge2() {
            return age2;
    }

    public int getNbMatch2() {
            return NbMatch2;
    }

    public int getNbTitleMatch2() {
            return NbTitleMatch2;
    }

    public int getNbRound2() {
            return NbRound2;
    }

    public double getPourcentageWin2() {
            return PourcentageWin2;
    }

    public int getNbWinStreak2() {
            return NbWinStreak2;
    }

    public double getPourcentageWinTKO2() {
            return PourcentageWinTKO2;
    }

    public double getPourcentageWinDecision2() {
            return PourcentageWinDecision2;
    }

    public double getPourcentageWinSubmission2() {
            return PourcentageWinSubmission2;
    }

    public double getPourcentageLoss2() {
            return PourcentageLoss2;
    }

    public int getNbLossStreak2() {
            return NbLossStreak2;
    }

    public double getPourcentageLossTKO2() {
            return PourcentageLossTKO2;
    }

    public double getPourcentageLossDecision2() {
            return PourcentageLossDecision2;
    }

    public double getPourcentageLossSubmission2() {
            return PourcentageLossSubmission2;
    }

    public double getPourcentageHead2() {
            return PourcentageHead2;
    }

    public double getPourcentageHeadDef2() {
            return PourcentageHeadDef2;
    }

    public double getPourcentageBody2() {
            return PourcentageBody2;
    }

    public double getPourcentageBodyDef2() {
            return PourcentageBodyDef2;
    }

    public double getPourcentageLeg2() {
            return PourcentageLeg2;
    }

    public double getPourcentageLegDef2() {
            return PourcentageLegDef2;
    }

    public double getPourcentageSigStrike2() {
            return PourcentageSigStrike2;
    }

    public double getPourcentageSigStrikeDef2() {
            return PourcentageSigStrikeDef2;
    }

    public double getPourcentageStrike2() {
            return PourcentageStrike2;
    }

    public double getPourcentageStrikeDef2() {
            return PourcentageStrikeDef2;
    }

    public double getPourcentageTakedown2() {
            return PourcentageTakedown2;
    }

    public double getPourcentageTakedownDef2() {
            return PourcentageTakedownDef2;
    }

    public double getPourcentageClinch2() {
            return PourcentageClinch2;
    }

    public double getPourcentageClinchDef2() {
            return PourcentageClinchDef2;
    }

    public double getPourcentageDistance2() {
            return PourcentageDistance2;
    }

    public double getPourcentageDistanceDef2() {
            return PourcentageDistanceDef2;
    }

    public double getPourcentageGround2() {
            return PourcentageGround2;
    }

    public double getPourcentageGroundDef2() {
            return PourcentageGroundDef2;
    }

    public int getSubAttempts2() {
            return SubAttempts2;
    }

    public int getSubAttemptsDef2() {
            return SubAttemptsDef2;
    }

    public int getPass2() {
            return pass2;
    }

    public int getReversals2() {
            return reversals2;
    }

    public String getRes() {
            return res;
    }

    public void setRes(String r){
            res=r;
    }

    public int getNbSigStrikeDef() {
            return NbSigStrikeDef;
    }

    public void setNbSigStrikeDef(int nbSigStrikeDef) {
            NbSigStrikeDef = nbSigStrikeDef;
    }

    public int getNbStrikeDef() {
            return NbStrikeDef;
    }

    public void setNbStrikeDef(int nbStrikeDef) {
            NbStrikeDef = nbStrikeDef;
    }

    public int getNbHeadDef() {
            return NbHeadDef;
    }

    public void setNbHeadDef(int nbHeadDef) {
            NbHeadDef = nbHeadDef;
    }

    public int getNbBodyDef() {
            return NbBodyDef;
    }

    public void setNbBodyDef(int nbBodyDef) {
            NbBodyDef = nbBodyDef;
    }

    public int getNbLegDef() {
            return NbLegDef;
    }

    public void setNbLegDef(int nbLegDef) {
            NbLegDef = nbLegDef;
    }

    public int getNbTakedownDef() {
            return NbTakedownDef;
    }

    public void setNbTakedownDef(int nbTakedownDef) {
            NbTakedownDef = nbTakedownDef;
    }

    public int getNbClinchDef() {
            return NbClinchDef;
    }

    public void setNbClinchDef(int nbClinchDef) {
            NbClinchDef = nbClinchDef;
    }

    public int getNbDistanceDef() {
            return NbDistanceDef;
    }

    public void setNbDistanceDef(int nbDistanceDef) {
            NbDistanceDef = nbDistanceDef;
    }

    public int getNbGroundDef() {
            return NbGroundDef;
    }

    public void setNbGroundDef(int nbGroundDef) {
            NbGroundDef = nbGroundDef;
    }

    public int getNbSigStrikeDef2() {
            return NbSigStrikeDef2;
    }

    public void setNbSigStrikeDef2(int nbSigStrikeDef2) {
            NbSigStrikeDef2 = nbSigStrikeDef2;
    }

    public int getNbStrikeDef2() {
            return NbStrikeDef2;
    }

    public void setNbStrikeDef2(int nbStrikeDef2) {
            NbStrikeDef2 = nbStrikeDef2;
    }

    public int getNbHeadDef2() {
            return NbHeadDef2;
    }

    public void setNbHeadDef2(int nbHeadDef2) {
            NbHeadDef2 = nbHeadDef2;
    }

    public int getNbBodyDef2() {
            return NbBodyDef2;
    }

    public void setNbBodyDef2(int nbBodyDef2) {
            NbBodyDef2 = nbBodyDef2;
    }

    public int getNbLegDef2() {
            return NbLegDef2;
    }

    public void setNbLegDef2(int nbLegDef2) {
            NbLegDef2 = nbLegDef2;
    }

    public int getNbTakedownDef2() {
            return NbTakedownDef2;
    }

    public void setNbTakedownDef2(int nbTakedownDef2) {
            NbTakedownDef2 = nbTakedownDef2;
    }

    public int getNbClinchDef2() {
            return NbClinchDef2;
    }

    public void setNbClinchDef2(int nbClinchDef2) {
            NbClinchDef2 = nbClinchDef2;
    }

    public int getNbDistanceDef2() {
            return NbDistanceDef2;
    }

    public void setNbDistanceDef2(int nbDistanceDef2) {
            NbDistanceDef2 = nbDistanceDef2;
    }

    public int getNbGroundDef2() {
            return NbGroundDef2;
    }

    public void setNbGroundDef2(int nbGroundDef2) {
            NbGroundDef2 = nbGroundDef2;
    }

    public int getNbStrike() {
            return NbStrike;
    }

    public void setNbStrike(int nbStrike) {
            NbStrike = nbStrike;
    }

    public int getNbHead() {
            return NbHead;
    }

    public void setNbHead(int nbHead) {
            NbHead = nbHead;
    }

    public int getNbBody() {
            return NbBody;
    }

    public void setNbBody(int nbBody) {
            NbBody = nbBody;
    }

    public int getNbLeg() {
            return NbLeg;
    }

    public void setNbLeg(int nbLeg) {
            NbLeg = nbLeg;
    }

    public int getNbTakedown() {
            return NbTakedown;
    }

    public void setNbTakedown(int nbTakedown) {
            NbTakedown = nbTakedown;
    }

    public int getNbClinch() {
            return NbClinch;
    }

    public void setNbClinch(int nbClinch) {
            NbClinch = nbClinch;
    }

    public int getNbDistance() {
            return NbDistance;
    }

    public void setNbDistance(int nbDistance) {
            NbDistance = nbDistance;
    }

    public int getNbGround() {
            return NbGround;
    }

    public void setNbGround(int nbGround) {
            NbGround = nbGround;
    }

    public int getNbStrike2() {
            return NbStrike2;
    }

    public void setNbStrike2(int nbStrike2) {
            NbStrike2 = nbStrike2;
    }

    public int getNbHead2() {
            return NbHead2;
    }

    public void setNbHead2(int nbHead2) {
            NbHead2 = nbHead2;
    }

    public int getNbBody2() {
            return NbBody2;
    }

    public void setNbBody2(int nbBody2) {
            NbBody2 = nbBody2;
    }

    public int getNbLeg2() {
            return NbLeg2;
    }

    public void setNbLeg2(int nbLeg2) {
            NbLeg2 = nbLeg2;
    }

    public int getNbTakedown2() {
            return NbTakedown2;
    }

    public void setNbTakedown2(int nbTakedown2) {
            NbTakedown2 = nbTakedown2;
    }

    public int getNbClinch2() {
            return NbClinch2;
    }

    public void setNbClinch2(int nbClinch2) {
            NbClinch2 = nbClinch2;
    }

    public int getNbDistance2() {
            return NbDistance2;
    }

    public void setNbDistance2(int nbDistance2) {
            NbDistance2 = nbDistance2;
    }

    public int getNbGround2() {
            return NbGround2;
    }

    public void setNbGround2(int nbGround2) {
            NbGround2 = nbGround2;
    }

    public int getNbMatchAgainstAdv() {
            return NbMatchAgainstAdv;
    }

    public void setNbMatchAgainstAdv(int nbMatchAgainstAdv) {
            NbMatchAgainstAdv = nbMatchAgainstAdv;
    }

    public int getNbWinAgainstAdv() {
            return NbWinAgainstAdv;
    }

    public void setNbWinAgainstAdv(int nbWinAgainstAdv) {
            NbWinAgainstAdv = nbWinAgainstAdv;
    }

    public int getNbLossAgainstAdv() {
            return NbLossAgainstAdv;
    }

    public void setNbLossAgainstAdv(int nbLossAgainstAdv) {
            NbLossAgainstAdv = nbLossAgainstAdv;
    }

    public int getNbMatchAgainstAdv2() {
            return NbMatchAgainstAdv2;
    }

    public void setNbMatchAgainstAdv2(int nbMatchAgainstAdv2) {
            NbMatchAgainstAdv2 = nbMatchAgainstAdv2;
    }

    public int getNbWinAgainstAdv2() {
            return NbWinAgainstAdv2;
    }

    public void setNbWinAgainstAdv2(int nbWinAgainstAdv2) {
            NbWinAgainstAdv2 = nbWinAgainstAdv2;
    }

    public int getNbLossAgainstAdv2() {
            return NbLossAgainstAdv2;
    }

    public void setNbLossAgainstAdv2(int nbLossAgainstAdv2) {
            NbLossAgainstAdv2 = nbLossAgainstAdv2;
    }

    public int getNbSigStrike() {
            return NbSigStrike;
    }

    public void setNbSigStrike(int nbSigStrike) {
            NbSigStrike = nbSigStrike;
    }

    public int getNbSigStrike2() {
            return NbSigStrike2;
    }

    public void setNbSigStrike2(int nbSigStrike2) {
            NbSigStrike2 = nbSigStrike2;
    }	
}

