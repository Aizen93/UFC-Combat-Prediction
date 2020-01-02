public class Combatsortie {
	private int id;
	private int id_fight;
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

	private String res;
	
	
	
	
	public Combatsortie(int id, int id_fight, String nom) {
		this.id = id;
		this.id_fight = id_fight;
		this.nom = nom;	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_fight() {
		return id_fight;
	}

	public void setId_fight(int id_fight) {
		this.id_fight = id_fight;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public double getReach() {
		return reach;
	}

	public void setReach(double reach) {
		this.reach = reach;
	}

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNbMatch() {
		return NbMatch;
	}

	public void setNbMatch(int nbMatch) {
		NbMatch = nbMatch;
	}

	public int getNbTitleMatch() {
		return NbTitleMatch;
	}

	public void setNbTitleMatch(int nbTitleMatch) {
		NbTitleMatch = nbTitleMatch;
	}

	public int getNbRound() {
		return NbRound;
	}

	public void setNbRound(int nbRound) {
		NbRound = nbRound;
	}

	public double getPourcentageWin() {
		return PourcentageWin;
	}

	public void setPourcentageWin(double pourcentageWin) {
		PourcentageWin = pourcentageWin;
	}

	public int getNbWinStreak() {
		return NbWinStreak;
	}

	public void setNbWinStreak(int nbWinStreak) {
		NbWinStreak = nbWinStreak;
	}


	public double getPourcentageLoss() {
		return PourcentageLoss;
	}

	public void setPourcentageLoss(double pourcentageLoss) {
		PourcentageLoss = pourcentageLoss;
	}

	public int getNbLossStreak() {
		return NbLossStreak;
	}

	public void setNbLossStreak(int nbLossStreak) {
		NbLossStreak = nbLossStreak;
	}

	
	public double getPourcentageWinTKO() {
		return PourcentageWinTKO;
	}

	public void setPourcentageWinTKO(double pourcentageWinTKO) {
		PourcentageWinTKO = pourcentageWinTKO;
	}

	public double getPourcentageWinDecision() {
		return PourcentageWinDecision;
	}

	public void setPourcentageWinDecision(double pourcentageWinDecision) {
		PourcentageWinDecision = pourcentageWinDecision;
	}

	public double getPourcentageWinSubmission() {
		return PourcentageWinSubmission;
	}

	public void setPourcentageWinSubmission(double pourcentageWinSubmission) {
		PourcentageWinSubmission = pourcentageWinSubmission;
	}

	public double getPourcentageLossTKO() {
		return PourcentageLossTKO;
	}

	public void setPourcentageLossTKO(double pourcentageLossTKO) {
		PourcentageLossTKO = pourcentageLossTKO;
	}

	public double getPourcentageLossDecision() {
		return PourcentageLossDecision;
	}

	public void setPourcentageLossDecision(double pourcentageLossDecision) {
		PourcentageLossDecision = pourcentageLossDecision;
	}

	public double getPourcentageLossSubmission() {
		return PourcentageLossSubmission;
	}

	public void setPourcentageLossSubmission(double pourcentageLossSubmission) {
		PourcentageLossSubmission = pourcentageLossSubmission;
	}

	public double getPourcentageHead() {
		return PourcentageHead;
	}

	public void setPourcentageHead(double pourcentageHead) {
		PourcentageHead = pourcentageHead;
	}

	public double getPourcentageHeadDef() {
		return PourcentageHeadDef;
	}

	public void setPourcentageHeadDef(double PourcentageHeadDef) {
		this.PourcentageHeadDef = PourcentageHeadDef;
	}

	public double getPourcentageBody() {
		return PourcentageBody;
	}

	public void setPourcentageBody(double pourcentageBody) {
		PourcentageBody = pourcentageBody;
	}

	public double getPourcentageBodyDef() {
		return PourcentageBodyDef;
	}

	public void setPourcentageBodyDef(double PourcentageBodyDef) {
		this.PourcentageBodyDef = PourcentageBodyDef;
	}

	public double getPourcentageLeg() {
		return PourcentageLeg;
	}

	public void setPourcentageLeg(double pourcentageLeg) {
		PourcentageLeg = pourcentageLeg;
	}

	public double getPourcentageLegDef() {
		return PourcentageLegDef;
	}

	public void setPourcentageLegDef(double PourcentageLegDef) {
		this.PourcentageLegDef = PourcentageLegDef;
	}

	public double getPourcentageSigStrike() {
		return PourcentageSigStrike;
	}

	public void setPourcentageSigStrike(double pourcentageSigStrike) {
		PourcentageSigStrike = pourcentageSigStrike;
	}

	public double getPourcentageSigStrikeDef() {
		return PourcentageSigStrikeDef;
	}

	public void setPourcentageSigStrikeDef(double PourcentageSigStrikeDef) {
		this.PourcentageSigStrikeDef = PourcentageSigStrikeDef;
	}

	public double getPourcentageStrike() {
		return PourcentageStrike;
	}

	public void setPourcentageStrike(double pourcentageStrike) {
		PourcentageStrike = pourcentageStrike;
	}

	public double getPourcentageStrikeDef() {
		return PourcentageStrikeDef;
	}

	public void setPourcentageStrikeDef(double PourcentageStrikeDef) {
		this.PourcentageStrikeDef = PourcentageStrikeDef;
	}

	public double getPourcentageTakedown() {
		return PourcentageTakedown;
	}

	public void setPourcentageTakedown(double pourcentageTakedown) {
		PourcentageTakedown = pourcentageTakedown;
	}

	public double getPourcentageTakedownDef() {
		return PourcentageTakedownDef;
	}

	public void setPourcentageTakedownDef(double PourcentageTakedownDef) {
		this.PourcentageTakedownDef = PourcentageTakedownDef;
	}

	public double getPourcentageClinch() {
		return PourcentageClinch;
	}

	public void setPourcentageClinch(double pourcentageClinch) {
		PourcentageClinch = pourcentageClinch;
	}

	public double getPourcentageClinchDef() {
		return PourcentageClinchDef;
	}

	public void setPourcentageClinchDef(double PourcentageClinchDef) {
		this.PourcentageClinchDef = PourcentageClinchDef;
	}

	public double getPourcentageDistance() {
		return PourcentageDistance;
	}

	public void setPourcentageDistance(double pourcentageDistance) {
		PourcentageDistance = pourcentageDistance;
	}

	public double getPourcentageDistanceDef() {
		return PourcentageDistanceDef;
	}

	public void setPourcentageDistanceDef(double PourcentageDistanceDef) {
		this.PourcentageDistanceDef = PourcentageDistanceDef;
	}

	public double getPourcentageGround() {
		return PourcentageGround;
	}

	public void setPourcentageGround(double pourcentageGround) {
		PourcentageGround = pourcentageGround;
	}

	public double getPourcentageGroundDef() {
		return PourcentageGroundDef;
	}

	public void setPourcentageGroundDef(double PourcentageGroundDef) {
		this.PourcentageGroundDef = PourcentageGroundDef;
	}

	public String isRes() {
		return res;
	}

	public void setRes(String res) {
		this.res = res;
	}

	public int getSub_attempts() {
		return SubAttempts;
	}

	public void setSub_attempts(int sub_attempts) {
		this.SubAttempts = sub_attempts;
	}
	
	public int getPass() {
		return pass;
	}

	public void setPass(int pass) {
		this.pass = pass;
	}

	public int getReversals() {
		return reversals;
	}

	public void setReversals(int reversals) {
		this.reversals = reversals;
	}

	public int getSubAttemptsDef() {
		return SubAttemptsDef;
	}

	public void setSubAttemptsDef(int subAttemptsDef) {
		SubAttemptsDef = subAttemptsDef;
	}

	public int getNbSigStrike() {
		return NbSigStrike;
	}

	public void setNbSigStrike(int nbSigStrike) {
		NbSigStrike = nbSigStrike;
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
	
}
