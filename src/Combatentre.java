public class Combatentre {
	private int fight_id;
	private int date;
	private String name;
	private int round;
	private boolean titlematch;
	private String methode;
	private int sig_attempts;
	private int sig_strikes;
	private int strike_attempts;
	private int strikes;
	private int td_attempts;
	private int takedowns;
	private int sub_attempts;
	private int pass;
	private int reversals;
	private int head_attempts;
	private int head ;
	private int body_attempts ;
	private int body;//0
	private int leg_attempts;
	private int leg;
	private int distance_attemps;
	private int distance;
	private int clinch_attemps;
	private int clinch ;
	private int ground_attempts;
	private int ground;
	private String res;
	

	
	
	public Combatentre(int fight_id,int date, String name, int round, String titlematch, String methode, int sig_attempts,
			int sig_strikes, int strike_attempts, int strikes, int td_attempts, int takedowns, int sub_attempts,
			int pass, int reversals, int head_attempts, int head, int body_attempts, int body, int leg_attempts,
			int leg, int distance_attemps, int distance, int clinch_attemps, int clinch, int ground_attempts,
			int ground, String res) {
		this.fight_id = fight_id;
		this.date=date;
		this.name = name;
		this.round = round;
		if(titlematch.contains("yes"))
			this.titlematch = true;
		else
			this.titlematch = false;
		this.methode = methode;
		this.sig_attempts = sig_attempts;
		this.sig_strikes = sig_strikes;
		this.strike_attempts = strike_attempts;
		this.strikes = strikes;
		this.td_attempts = td_attempts;
		this.takedowns = takedowns;
		this.sub_attempts = sub_attempts;
		this.pass = pass;
		this.reversals = reversals;
		this.head_attempts = head_attempts;
		this.head = head;
		this.body_attempts = body_attempts;
		this.body = body;
		this.leg_attempts = leg_attempts;
		this.leg = leg;
		this.distance_attemps = distance_attemps;
		this.distance = distance;
		this.clinch_attemps = clinch_attemps;
		this.clinch = clinch;
		this.ground_attempts = ground_attempts;
		this.ground = ground;
		this.res = res;
	}
	public int getBody() {
		return body;
	}
	public void setBody(int body) {
		this.body = body;
	}
	public int getBody_attempts() {
		return body_attempts;
	}
	public void setBody_attempts(int body_attempts) {
		this.body_attempts = body_attempts;
	}
	public int getClinch() {
		return clinch;
	}
	public void setClinch(int clinch) {
		this.clinch = clinch;
	}
	public int getClinch_attemps() {
		return clinch_attemps;
	}
	public void setClinch_attemps(int clinch_attemps) {
		this.clinch_attemps = clinch_attemps;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getDistance_attemps() {
		return distance_attemps;
	}
	public void setDistance_attemps(int distance_attemps) {
		this.distance_attemps = distance_attemps;
	}
	public int getFight_id() {
		return fight_id;
	}
	public void setFight_id(int fight_id) {
		this.fight_id = fight_id;
	}
	public int getGround() {
		return ground;
	}
	public void setGround(int ground) {
		this.ground = ground;
	}
	public int getGround_attempts() {
		return ground_attempts;
	}
	public void setGround_attempts(int ground_attempts) {
		this.ground_attempts = ground_attempts;
	}
	public int getHead() {
		return head;
	}
	public void setHead(int head) {
		this.head = head;
	}
	public int getHead_attempts() {
		return head_attempts;
	}
	public void setHead_attempts(int head_attempts) {
		this.head_attempts = head_attempts;
	}
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	public int getLeg_attempts() {
		return leg_attempts;
	}
	public void setLeg_attempts(int leg_attempts) {
		this.leg_attempts = leg_attempts;
	}
	public String getMethode() {
		return methode;
	}
	public void setMethode(String methode) {
		this.methode = methode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getRound() {
		return round;
	}
	public void setRound(int round) {
		this.round = round;
	}
	public int getSig_attempts() {
		return sig_attempts;
	}
	public void setSig_attempts(int sig_attempts) {
		this.sig_attempts = sig_attempts;
	}
	public int getSig_strikes() {
		return sig_strikes;
	}
	public void setSig_strikes(int sig_strikes) {
		this.sig_strikes = sig_strikes;
	}
	public int getStrike_attempts() {
		return strike_attempts;
	}
	public void setStrike_attempts(int strike_attempts) {
		this.strike_attempts = strike_attempts;
	}
	public int getStrikes() {
		return strikes;
	}
	public void setStrikes(int strikes) {
		this.strikes = strikes;
	}
	public int getSub_attempts() {
		return sub_attempts;
	}
	public void setSub_attempts(int sub_attempts) {
		this.sub_attempts = sub_attempts;
	}
	public int getTakedowns() {
		return takedowns;
	}
	public void setTakedowns(int takedowns) {
		this.takedowns = takedowns;
	}
	public int getTd_attempts() {
		return td_attempts;
	}
	public void setTd_attempts(int td_attempts) {
		this.td_attempts = td_attempts;
	}
	
	public boolean getTitlematch() {
		return titlematch;
	}
	public void setTitlematch(boolean titlematch) {
		this.titlematch = titlematch;
	}
	
	public String getRes() {
		return res;
	}
	public void setRes(String res) {
		this.res = res;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
	
	
}
