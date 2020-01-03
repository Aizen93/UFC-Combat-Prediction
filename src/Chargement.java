import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Chargement {
	private ArrayList<Combattant> listcombattant=new ArrayList<Combattant>();
	private ArrayList<Combatentre> listentre=new ArrayList<Combatentre>();
	private ArrayList<Combatsortie> listesortie=new ArrayList<Combatsortie>();
	private ArrayList<Combatsortiebis> listesortiebis=new ArrayList<Combatsortiebis>();
	
	public Chargement(File f1, File f2){
		BufferedReader fileReader1=null;
		BufferedReader fileReader2=null;

		try{
			String line ="";
			fileReader1 = new BufferedReader(new FileReader(f1));
			fileReader2 = new BufferedReader(new FileReader(f2));
			fileReader1.readLine();
			fileReader2.readLine();
			while((line=fileReader1.readLine())!=null)
			{
				String []tokens = line.split(",");
				if(tokens.length>0)
				{
					Combatentre cb=new Combatentre(Integer.parseInt(tokens[0]),Integer.parseInt(tokens[1]),tokens[2],Integer.parseInt(tokens[3]), tokens[4], tokens[5], Integer.parseInt(tokens[6]),Integer.parseInt(tokens[7]),Integer.parseInt(tokens[8]),Integer.parseInt(tokens[9]),Integer.parseInt(tokens[10]),Integer.parseInt(tokens[11]),Integer.parseInt(tokens[12]),Integer.parseInt(tokens[13]),Integer.parseInt(tokens[14]),Integer.parseInt(tokens[15]),Integer.parseInt(tokens[16]),Integer.parseInt(tokens[17]),Integer.parseInt(tokens[18]),Integer.parseInt(tokens[19]),Integer.parseInt(tokens[20]),Integer.parseInt(tokens[21]),Integer.parseInt(tokens[22]),Integer.parseInt(tokens[23]),Integer.parseInt(tokens[24]),Integer.parseInt(tokens[25]),Integer.parseInt(tokens[26]),tokens[27]);
					this.listentre.add(cb);
				}
			}
			while((line=fileReader2.readLine())!=null)
			{
				String []tokens = line.split(",");
				if(tokens.length>0)
				{
					Combattant c=new Combattant(tokens[0],Integer.parseInt(tokens[1]),Double.parseDouble(tokens[2]),Integer.parseInt(tokens[3]));
					this.listcombattant.add(c);

				}
			}

		}
		catch(Exception e )
		{
			e.printStackTrace();
		}
	}
	public boolean first(String s){
		for(int i=0;i<listesortie.size();i++){
			if(listesortie.get(i).getNom().contains(s))
				return false;
		}
		return true;
		
	}
	public void remplir(){
			for(int i=0 ; i<listentre.size(); i++)
			{
				Combatsortie cs=new Combatsortie(i,listentre.get(i).getFight_id(),listentre.get(i).getName());
				for(int j=0; j<listcombattant.size();j++){
					if(listcombattant.get(j).getNom().contains(cs.getNom()))
					{
						cs.setTaille(listcombattant.get(j).getTaille());
						cs.setReach(listcombattant.get(j).getReach());
						if(listcombattant.get(j).getAge()==-1)
							cs.setAge(-1);
						else
							cs.setAge(listcombattant.get(j).getAge()-(2016-listentre.get(i).getDate()));
						break;
					}
				}
				if(first(cs.getNom())){
					cs.setNbMatch(0);
					cs.setNbTitleMatch(0);
					cs.setNbRound(0);
					cs.setPourcentageWin(0);
					cs.setNbWinStreak(0);
					cs.setPourcentageWinTKO(0);
					cs.setPourcentageWinDecision(0);
					cs.setPourcentageWinSubmission(0);
					cs.setPourcentageLoss(0);
					cs.setNbLossStreak(0);
					cs.setPourcentageLossTKO(0);
					cs.setPourcentageLossDecision(0);
					cs.setPourcentageLossSubmission(0);
					cs.setPourcentageHead(0);
					cs.setPourcentageHeadDef(0);
					cs.setPourcentageBody(0);
					cs.setPourcentageBodyDef(0);
					cs.setPourcentageLeg(0);
					cs.setPourcentageLegDef(0);
					cs.setPourcentageSigStrike(0);
					cs.setPourcentageSigStrikeDef(0);
					cs.setPourcentageStrike(0);
					cs.setPourcentageStrikeDef(0);
					cs.setPourcentageTakedown(0);
					cs.setPourcentageTakedownDef(0);
					cs.setPourcentageClinch(0);
					cs.setPourcentageClinchDef(0);
					cs.setPourcentageGround(0);
					cs.setPourcentageGroundDef(0);
					cs.setPourcentageDistance(0);
					cs.setPourcentageDistanceDef(0);
					cs.setSub_attempts(0);
					cs.setSubAttemptsDef(0);
					cs.setPass(0);
					cs.setReversals(0);
					cs.setNbSigStrike(0);
					cs.setNbStrike(0);
					cs.setNbHead(0);
					cs.setNbBody(0);
					cs.setNbLeg(0);
					cs.setNbTakedown(0);
					cs.setNbClinch(0);
					cs.setNbDistance(0);
					cs.setNbGround(0);
					
					cs.setNbSigStrikeDef(0);
					cs.setNbStrikeDef(0);
					cs.setNbHeadDef(0);
					cs.setNbBodyDef(0);
					cs.setNbLegDef(0);
					cs.setNbTakedownDef(0);
					cs.setNbClinchDef(0);
					cs.setNbDistanceDef(0);
					cs.setNbGroundDef(0);
					
					cs.setNbMatchAgainstAdv(0);
					cs.setNbWinAgainstAdv(0);
					cs.setNbLossAgainstAdv(0);
					
					
					
					cs.setRes(listentre.get(i).getRes());
				}
				else{
					cs.setNbMatch(NbMatch(i,cs.getNom()));
					cs.setNbTitleMatch(NbTitleMatch(i,cs.getNom()));
					cs.setNbRound(NbRound(i,cs.getNom()));
					cs.setPourcentageWin(PourcentageWin(i,cs.getNom()));
					cs.setNbWinStreak(NbWinStreak(i,cs.getNom()));
					cs.setPourcentageWinTKO(PourcentageWinTKO(i,cs.getNom()));
					cs.setPourcentageWinDecision(PourcentageWinDecision(i,cs.getNom()));
					cs.setPourcentageWinSubmission(PourcentageWinSubmission(i,cs.getNom()));
					cs.setPourcentageLoss(PourcentageLoss(i,cs.getNom()));
					cs.setNbLossStreak(NbLossStreak(i,cs.getNom()));
					cs.setPourcentageLossTKO(PourcentageLossTKO(i,cs.getNom()));
					cs.setPourcentageLossDecision(PourcentageLossDecision(i,cs.getNom()));
					cs.setPourcentageLossSubmission(PourcentageLossSubmission(i,cs.getNom()));
					cs.setPourcentageHead(PourcentageHead(i,cs.getNom()));
					cs.setPourcentageHeadDef(PourcentageHeadDef(i,cs.getNom()));
					cs.setPourcentageBody(PourcentageBody(i,cs.getNom()));
					cs.setPourcentageBodyDef(PourcentageBodyDef(i,cs.getNom()));
					cs.setPourcentageLeg(PourcentageLeg(i,cs.getNom()));
					cs.setPourcentageLegDef(PourcentageLegDef(i,cs.getNom()));
					cs.setPourcentageSigStrike(PourcentageSigStrike(i,cs.getNom()));
					cs.setPourcentageSigStrikeDef(PourcentageSigStrikeDef(i,cs.getNom()));
					cs.setPourcentageStrike(PourcentageStrike(i,cs.getNom()));
					cs.setPourcentageStrikeDef(PourcentageStrikeDef(i,cs.getNom()));
					cs.setPourcentageTakedown(PourcentageTakedown(i,cs.getNom()));
					cs.setPourcentageTakedownDef(PourcentageTakedownDef(i,cs.getNom()));
					cs.setPourcentageClinch(PourcentageClinch(i,cs.getNom()));
					cs.setPourcentageClinchDef(PourcentageClinchDef(i,cs.getNom()));
					cs.setPourcentageGround(PourcentageGround(i,cs.getNom()));
					cs.setPourcentageGroundDef(PourcentageGroundDef(i,cs.getNom()));
					cs.setPourcentageDistance(PourcentageDistance(i,cs.getNom()));
					cs.setPourcentageDistanceDef(PourcentageDistanceDef(i,cs.getNom()));
					cs.setSub_attempts(NbSubAttempts(i,cs.getNom()));
					cs.setSubAttemptsDef(NbSubAttemptsDef(i,cs.getNom()));
					cs.setPass(NbPass(i,cs.getNom()));
					cs.setReversals(NbReversals(i,cs.getNom()));
					
					cs.setNbSigStrike(NbSigStrike(i,cs.getNom()));
					cs.setNbStrike(NbStrike(i,cs.getNom()));
					cs.setNbHead(NbHead(i,cs.getNom()));
					cs.setNbBody(NbBody(i,cs.getNom()));
					cs.setNbLeg(NbLeg(i,cs.getNom()));
					cs.setNbTakedown(NbTakedown(i,cs.getNom()));
					cs.setNbClinch(NbClinch(i,cs.getNom()));
					cs.setNbDistance(NbDistance(i,cs.getNom()));
					cs.setNbGround(NbGround(i,cs.getNom()));
				
					
					cs.setNbSigStrikeDef(NbSigStrikeDef(i,cs.getNom()));
					cs.setNbStrikeDef(NbStrikeDef(i,cs.getNom()));
					cs.setNbHeadDef(NbHeadDef(i,cs.getNom()));
					cs.setNbBodyDef(NbBodyDef(i,cs.getNom()));
					cs.setNbLegDef(NbLegDef(i,cs.getNom()));
					cs.setNbTakedownDef(NbTakedownDef(i,cs.getNom()));
					cs.setNbClinchDef(NbClinchDef(i,cs.getNom()));
					cs.setNbDistanceDef(NbDistanceDef(i,cs.getNom()));
					cs.setNbGroundDef(NbGroundDef(i,cs.getNom()));
					
					String nomadv="";
					if(listentre.get(i+1).getFight_id()==listentre.get(i).getFight_id())
						nomadv=listentre.get(i+1).getName();
					else
						nomadv=listentre.get(i-1).getName();
					
					cs.setNbMatchAgainstAdv(NbMatchAgainstAdv(i,cs.getNom(), nomadv));
					cs.setNbWinAgainstAdv(NbWinAgainstAdv(i,cs.getNom(), nomadv));
					cs.setNbLossAgainstAdv(NbLossAgainstAdv(i,cs.getNom(), nomadv));
					
			
					cs.setRes(listentre.get(i).getRes());
				}
				listesortie.add(cs);
			}
	}
	
	public void remplir2(){
		for(int i=0; i<listesortie.size();i++){
			double r=Math.random();
			if(r<0.49){
				Combatsortiebis csb=new Combatsortiebis(listesortie.get(i).getNom(),listesortie.get(i).getTaille(),listesortie.get(i).getReach(),listesortie.get(i).getAge(),
					listesortie.get(i).getNbMatch(),listesortie.get(i).getNbTitleMatch(),listesortie.get(i).getNbRound(),listesortie.get(i).getPourcentageWin(),
					listesortie.get(i).getNbWinStreak(),listesortie.get(i).getPourcentageWinTKO(),listesortie.get(i).getPourcentageWinDecision(),listesortie.get(i).getPourcentageWinSubmission(),
					listesortie.get(i).getPourcentageLoss(),listesortie.get(i).getNbLossStreak(),listesortie.get(i).getPourcentageLossTKO(),listesortie.get(i).getPourcentageLossDecision(),
					listesortie.get(i).getPourcentageLossSubmission(),listesortie.get(i).getPourcentageHead(),listesortie.get(i).getPourcentageHeadDef(),listesortie.get(i).getPourcentageBody(),
					listesortie.get(i).getPourcentageBodyDef(),listesortie.get(i).getPourcentageLeg(),listesortie.get(i).getPourcentageLegDef(),listesortie.get(i).getPourcentageSigStrike(),
					listesortie.get(i).getPourcentageSigStrikeDef(),listesortie.get(i).getPourcentageStrike(),listesortie.get(i).getPourcentageStrikeDef(),listesortie.get(i).getPourcentageTakedown(),
					listesortie.get(i).getPourcentageTakedownDef(),listesortie.get(i).getPourcentageClinch(),listesortie.get(i).getPourcentageClinchDef(),listesortie.get(i).getPourcentageDistance(),
					listesortie.get(i).getPourcentageDistanceDef(),listesortie.get(i).getPourcentageGround(),listesortie.get(i).getPourcentageGroundDef(),listesortie.get(i).getSub_attempts(),
					listesortie.get(i).getSubAttemptsDef(),listesortie.get(i).getPass(),listesortie.get(i).getReversals(),listesortie.get(i).getNbSigStrike(),listesortie.get(i).getNbStrike(),
					listesortie.get(i).getNbHead(),listesortie.get(i).getNbBody(),listesortie.get(i).getNbLeg(),listesortie.get(i).getNbTakedown(),listesortie.get(i).getNbClinch(),
					listesortie.get(i).getNbDistance(),listesortie.get(i).getNbGround(), listesortie.get(i).getNbSigStrikeDef(),listesortie.get(i).getNbStrikeDef(),
					listesortie.get(i).getNbHeadDef(),listesortie.get(i).getNbBodyDef(),listesortie.get(i).getNbLegDef(),listesortie.get(i).getNbTakedownDef(),listesortie.get(i).getNbClinchDef(),
					listesortie.get(i).getNbDistanceDef(),listesortie.get(i).getNbGroundDef(), listesortie.get(i).getNbMatchAgainstAdv(), listesortie.get(i).getNbWinAgainstAdv(), listesortie.get(i).getNbLossAgainstAdv(),
					
					
					
					listesortie.get(i+1).getNom(),listesortie.get(i+1).getTaille(),listesortie.get(i+1).getReach(),listesortie.get(i+1).getAge(),
					listesortie.get(i+1).getNbMatch(),listesortie.get(i+1).getNbTitleMatch(),listesortie.get(i+1).getNbRound(),listesortie.get(i+1).getPourcentageWin(),
					listesortie.get(i+1).getNbWinStreak(),listesortie.get(i+1).getPourcentageWinTKO(),listesortie.get(i+1).getPourcentageWinDecision(),listesortie.get(i+1).getPourcentageWinSubmission(),
					listesortie.get(i+1).getPourcentageLoss(),listesortie.get(i+1).getNbLossStreak(),listesortie.get(i+1).getPourcentageLossTKO(),listesortie.get(i+1).getPourcentageLossDecision(),
					listesortie.get(i+1).getPourcentageLossSubmission(),listesortie.get(i+1).getPourcentageHead(),listesortie.get(i+1).getPourcentageHeadDef(),listesortie.get(i).getPourcentageBody(),
					listesortie.get(i+1).getPourcentageBodyDef(),listesortie.get(i+1).getPourcentageLeg(),listesortie.get(i+1).getPourcentageLegDef(),listesortie.get(i).getPourcentageSigStrike(),
					listesortie.get(i+1).getPourcentageSigStrikeDef(),listesortie.get(i+1).getPourcentageStrike(),listesortie.get(i+1).getPourcentageStrikeDef(),listesortie.get(i+1).getPourcentageTakedown(),
					listesortie.get(i+1).getPourcentageTakedownDef(),listesortie.get(i+1).getPourcentageClinch(),listesortie.get(i+1).getPourcentageClinchDef(),listesortie.get(i+1).getPourcentageDistance(),
					listesortie.get(i+1).getPourcentageDistanceDef(),listesortie.get(i+1).getPourcentageGround(),listesortie.get(i+1).getPourcentageGroundDef(),listesortie.get(i+1).getSub_attempts(),
					listesortie.get(i+1).getSubAttemptsDef(),listesortie.get(i+1).getPass(),listesortie.get(i+1).getReversals(),listesortie.get(i+1).getNbSigStrike(),listesortie.get(i+1).getNbStrike(),
					listesortie.get(i+1).getNbHead(),listesortie.get(i+1).getNbBody(),listesortie.get(i+1).getNbLeg(),listesortie.get(i+1).getNbTakedown(),listesortie.get(i+1).getNbClinch(),
					listesortie.get(i+1).getNbDistance(),listesortie.get(i+1).getNbGround(), listesortie.get(i+1).getNbSigStrikeDef(),listesortie.get(i+1).getNbStrikeDef(),
					listesortie.get(i+1).getNbHeadDef(),listesortie.get(i+1).getNbBodyDef(),listesortie.get(i+1).getNbLegDef(),listesortie.get(i+1).getNbTakedownDef(),listesortie.get(i+1).getNbClinchDef(),
					listesortie.get(i+1).getNbDistanceDef(),listesortie.get(i+1).getNbGroundDef(), listesortie.get(i+1).getNbMatchAgainstAdv(), listesortie.get(i+1).getNbWinAgainstAdv(), 
					listesortie.get(i+1).getNbLossAgainstAdv());
		
			if(listesortie.get(i).isRes().contains("W"))
				csb.setRes("A");
			else if(listesortie.get(i).isRes().contains("L"))
				csb.setRes("B");
			else if(listesortie.get(i).isRes().contains("D"))
				csb.setRes("D");
			else
				csb.setRes("NC");
			listesortiebis.add(csb);
			}
			else{
				Combatsortiebis csb=new Combatsortiebis(listesortie.get(i+1).getNom(),listesortie.get(i+1).getTaille(),listesortie.get(i+1).getReach(),listesortie.get(i+1).getAge(),
						listesortie.get(i+1).getNbMatch(),listesortie.get(i+1).getNbTitleMatch(),listesortie.get(i+1).getNbRound(),listesortie.get(i+1).getPourcentageWin(),
						listesortie.get(i+1).getNbWinStreak(),listesortie.get(i+1).getPourcentageWinTKO(),listesortie.get(i+1).getPourcentageWinDecision(),listesortie.get(i+1).getPourcentageWinSubmission(),
						listesortie.get(i+1).getPourcentageLoss(),listesortie.get(i+1).getNbLossStreak(),listesortie.get(i+1).getPourcentageLossTKO(),listesortie.get(i+1).getPourcentageLossDecision(),
						listesortie.get(i+1).getPourcentageLossSubmission(),listesortie.get(i+1).getPourcentageHead(),listesortie.get(i+1).getPourcentageHeadDef(),listesortie.get(i+1).getPourcentageBody(),
						listesortie.get(i+1).getPourcentageBodyDef(),listesortie.get(i+1).getPourcentageLeg(),listesortie.get(i+1).getPourcentageLegDef(),listesortie.get(i+1).getPourcentageSigStrike(),
						listesortie.get(i+1).getPourcentageSigStrikeDef(),listesortie.get(i+1).getPourcentageStrike(),listesortie.get(i+1).getPourcentageStrikeDef(),listesortie.get(i+1).getPourcentageTakedown(),
						listesortie.get(i+1).getPourcentageTakedownDef(),listesortie.get(i+1).getPourcentageClinch(),listesortie.get(i+1).getPourcentageClinchDef(),listesortie.get(i+1).getPourcentageDistance(),
						listesortie.get(i+1).getPourcentageDistanceDef(),listesortie.get(i+1).getPourcentageGround(),listesortie.get(i+1).getPourcentageGroundDef(),listesortie.get(i+1).getSub_attempts(),
						listesortie.get(i+1).getSubAttemptsDef(),listesortie.get(i+1).getPass(),listesortie.get(i+1).getReversals(),listesortie.get(i+1).getNbSigStrike(),listesortie.get(i+1).getNbStrike(),
						listesortie.get(i+1).getNbHead(),listesortie.get(i+1).getNbBody(),listesortie.get(i+1).getNbLeg(),listesortie.get(i+1).getNbTakedown(),listesortie.get(i+1).getNbClinch(),
						listesortie.get(i+1).getNbDistance(),listesortie.get(i+1).getNbGround(),listesortie.get(i+1).getNbSigStrikeDef(),listesortie.get(i+1).getNbStrikeDef(),
						listesortie.get(i+1).getNbHeadDef(),listesortie.get(i+1).getNbBodyDef(),listesortie.get(i+1).getNbLegDef(),listesortie.get(i+1).getNbTakedownDef(),listesortie.get(i+1).getNbClinchDef(),
						listesortie.get(i+1).getNbDistanceDef(),listesortie.get(i+1).getNbGroundDef(), listesortie.get(i+1).getNbMatchAgainstAdv(), listesortie.get(i+1).getNbWinAgainstAdv(), listesortie.get(i+1).getNbLossAgainstAdv(),
						
						
						
						
						
						listesortie.get(i).getNom(),listesortie.get(i).getTaille(),listesortie.get(i).getReach(),listesortie.get(i).getAge(),
						listesortie.get(i).getNbMatch(),listesortie.get(i).getNbTitleMatch(),listesortie.get(i).getNbRound(),listesortie.get(i).getPourcentageWin(),
						listesortie.get(i).getNbWinStreak(),listesortie.get(i).getPourcentageWinTKO(),listesortie.get(i).getPourcentageWinDecision(),listesortie.get(i).getPourcentageWinSubmission(),
						listesortie.get(i).getPourcentageLoss(),listesortie.get(i).getNbLossStreak(),listesortie.get(i).getPourcentageLossTKO(),listesortie.get(i).getPourcentageLossDecision(),
						listesortie.get(i).getPourcentageLossSubmission(),listesortie.get(i).getPourcentageHead(),listesortie.get(i).getPourcentageHeadDef(),listesortie.get(i).getPourcentageBody(),
						listesortie.get(i).getPourcentageBodyDef(),listesortie.get(i).getPourcentageLeg(),listesortie.get(i).getPourcentageLegDef(),listesortie.get(i).getPourcentageSigStrike(),
						listesortie.get(i).getPourcentageSigStrikeDef(),listesortie.get(i).getPourcentageStrike(),listesortie.get(i).getPourcentageStrikeDef(),listesortie.get(i).getPourcentageTakedown(),
						listesortie.get(i).getPourcentageTakedownDef(),listesortie.get(i).getPourcentageClinch(),listesortie.get(i).getPourcentageClinchDef(),listesortie.get(i).getPourcentageDistance(),
						listesortie.get(i).getPourcentageDistanceDef(),listesortie.get(i).getPourcentageGround(),listesortie.get(i).getPourcentageGroundDef(),listesortie.get(i).getSub_attempts(),
						listesortie.get(i).getSubAttemptsDef(),listesortie.get(i).getPass(),listesortie.get(i).getReversals(),listesortie.get(i).getNbSigStrike(),listesortie.get(i).getNbStrike(),
						listesortie.get(i).getNbHead(),listesortie.get(i).getNbBody(),listesortie.get(i).getNbLeg(),listesortie.get(i).getNbTakedown(),listesortie.get(i).getNbClinch(),
						listesortie.get(i).getNbDistance(),listesortie.get(i).getNbGround(),listesortie.get(i).getNbSigStrikeDef(),listesortie.get(i).getNbStrikeDef(),
						listesortie.get(i).getNbHeadDef(),listesortie.get(i).getNbBodyDef(),listesortie.get(i).getNbLegDef(),listesortie.get(i).getNbTakedownDef(),listesortie.get(i).getNbClinchDef(),
						listesortie.get(i).getNbDistanceDef(),listesortie.get(i).getNbGroundDef(), listesortie.get(i).getNbMatchAgainstAdv(), listesortie.get(i).getNbWinAgainstAdv(), listesortie.get(i).getNbLossAgainstAdv());
				
				
				
				if(listesortie.get(i+1).isRes().contains("W"))
					csb.setRes("A");
				else if(listesortie.get(i+1).isRes().contains("L"))
					csb.setRes("B");
				else if(listesortie.get(i+1).isRes().contains("D"))
					csb.setRes("D");
				else
					csb.setRes("NC");
				listesortiebis.add(csb);
			}
			i++;
		}
		
	}
	
	public void creerCSV2(String s,boolean t)
	{
		
		String COMMA_DELIMITER = ",";
		String NEW_LINE_SEPARATOR = "\n";
		String FILE_HEADER;
		if(t)
			FILE_HEADER = "nom, taille, reach, age, NbMatch, NbTitleMatch, NbRound,"
				+ " PourcentageWin, NbWinStreak, PourcentageWinTKO, PourcentageWinDecision, "
				+ "PourcentageWinSubmission, PourcentageLoss, NbLossStreak, PourcentageLossTKO, "
				+ "PourcentageLossDecision, PourcentageLossSubmission, PourcentageHead, PourcentageHeadDef, "
				+ "PourcentageBody, PourcentageBodyDef, PourcentageLeg, PourcentageLegDef, PourcentageSigStrike, "
				+ "PourcentageSigStrikeDef, PourcentageStrike, PourcentageStrikeDef, PourcentageTakedown, "
				+ "PourcentageTakedownDef, PourcentageClinch, PourcentageClinchDef, PourcentageDistance, "
				+ "PourcentageDistanceDef, PourcentageGround, PourcentageGroundDef, NbSubAttempts, NbSubDef, "
				+ "NbPass, NbReversals, NbSigStrike, NbStrike, NbHead, NbBody, NbLeg, NbTakedown, NbClinch, "
				+ "NbDistance, NbGround, NbSigStrikeDef, NbStrikeDef, NbHeadDef, NbBodyDef, NbLegDef, NbTakedownDef, "
				+ "NbClinchDef, NbDistanceDef, NbGroundDef, NbMatchAgainstAdv, NbWinAgainstAdv, NbLossAgainstAdv, "
				+ "nom2, taille2, reach2, age2, NbMatch2, NbTitleMatch2, NbRound2, "
				+ "PourcentageWin2, NbWinStreak2, PourcentageWinTKO2, PourcentageWinDecision2, "
				+ "PourcentageWinSubmission2, PourcentageLoss2, NbLossStreak2, PourcentageLossTKO2, "
				+ "PourcentageLossDecision2, PourcentageLossSubmission2, PourcentageHead2, "
				+ "PourcentageHeadDef2, PourcentageBody2, PourcentageBodyDef2, PourcentageLeg2, "
				+ "PourcentageLegDef2, PourcentageSigStrike2, PourcentageSigStrikeDef2, PourcentageStrike2, "
				+ "PourcentageStrikeDef2, PourcentageTakedown2, PourcentageTakedownDef2, PourcentageClinch2, "
				+ "PourcentageClinchDef2, PourcentageDistance2, PourcentageDistanceDef2, PourcentageGround2, "
				+ "PourcentageGroundDef2, NbSubAttempts2, NbSubDef2, NbPass2, NbReversals2, NbSigStrike2, "
				+ "NbStrike2, NbHead2, NbBody2, NbLeg2, NbTakedown2, NbClinch2, NbDistance2, NbGround2, "
				+ "NbSigStrikeDef2, NbStrikeDef2, NbHeadDef2, NbBodyDef2, NbLegDef2, NbTakedownDef2, "
				+ "NbClinchDef2, NbDistanceDef2, NbGroundDef2, NbMatchAgainstAdv2, NbWinAgainstAdv2, NbLossAgainstAdv2, res";
		else
			FILE_HEADER = "taille, reach, age, NbMatch, NbTitleMatch, NbRound,"
					+ " PourcentageWin, NbWinStreak, PourcentageWinTKO, PourcentageWinDecision, "
					+ "PourcentageWinSubmission, PourcentageLoss, NbLossStreak, PourcentageLossTKO, "
					+ "PourcentageLossDecision, PourcentageLossSubmission, PourcentageHead, PourcentageHeadDef, "
					+ "PourcentageBody, PourcentageBodyDef, PourcentageLeg, PourcentageLegDef, PourcentageSigStrike, "
					+ "PourcentageSigStrikeDef, PourcentageStrike, PourcentageStrikeDef, PourcentageTakedown, "
					+ "PourcentageTakedownDef, PourcentageClinch, PourcentageClinchDef, PourcentageDistance, "
					+ "PourcentageDistanceDef, PourcentageGround, PourcentageGroundDef, NbSubAttempts, NbSubDef, "
					+ "NbPass, NbReversals, NbSigStrike, NbStrike, NbHead, NbBody, NbLeg, NbTakedown, NbClinch, "
					+ "NbDistance, NbGround, NbSigStrikeDef, NbStrikeDef, NbHeadDef, NbBodyDef, NbLegDef, NbTakedownDef, "
					+ "NbClinchDef, NbDistanceDef, NbGroundDef, NbMatchAgainstAdv, NbWinAgainstAdv, NbLossAgainstAdv, "
					+ "taille2, reach2, age2, NbMatch2, NbTitleMatch2, NbRound2, "
					+ "PourcentageWin2, NbWinStreak2, PourcentageWinTKO2, PourcentageWinDecision2, "
					+ "PourcentageWinSubmission2, PourcentageLoss2, NbLossStreak2, PourcentageLossTKO2, "
					+ "PourcentageLossDecision2, PourcentageLossSubmission2, PourcentageHead2, "
					+ "PourcentageHeadDef2, PourcentageBody2, PourcentageBodyDef2, PourcentageLeg2, "
					+ "PourcentageLegDef2, PourcentageSigStrike2, PourcentageSigStrikeDef2, PourcentageStrike2, "
					+ "PourcentageStrikeDef2, PourcentageTakedown2, PourcentageTakedownDef2, PourcentageClinch2, "
					+ "PourcentageClinchDef2, PourcentageDistance2, PourcentageDistanceDef2, PourcentageGround2, "
					+ "PourcentageGroundDef2, NbSubAttempts2, NbSubDef2, NbPass2, NbReversals2, NbSigStrike2, "
					+ "NbStrike2, NbHead2, NbBody2, NbLeg2, NbTakedown2, NbClinch2, NbDistance2, NbGround2, "
					+ "NbSigStrikeDef2, NbStrikeDef2, NbHeadDef2, NbBodyDef2, NbLegDef2, NbTakedownDef2, "
					+ "NbClinchDef2, NbDistanceDef2, NbGroundDef2, NbMatchAgainstAdv2, NbWinAgainstAdv2, NbLossAgainstAdv2, res";
			

		FileWriter fileWriter = null;
			            
	    try {
	    	fileWriter = new FileWriter(s);
	    	fileWriter.append(FILE_HEADER.toString());
	    	fileWriter.append(NEW_LINE_SEPARATOR);
	    	for(Combatsortiebis cs : listesortiebis)
	    	{
	    		  if(t)
	    		  {
	    			fileWriter.append(cs.getNom());
	    		  	fileWriter.append(COMMA_DELIMITER);
	    		  }
	    		  fileWriter.append(String.valueOf(cs.getTaille()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getReach()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getAge()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbMatch()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbTitleMatch()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbRound()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageWin()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbWinStreak()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageWinTKO()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageWinDecision()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageWinSubmission()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageLoss()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbLossStreak()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageLossTKO()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageLossDecision()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageLossSubmission()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageHead()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageHeadDef()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageBody()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageBodyDef()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageLeg()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageLegDef()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageSigStrike()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageSigStrikeDef()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageStrike()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageStrikeDef()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageTakedown()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageTakedownDef()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageClinch()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageClinchDef()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageDistance()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageDistanceDef()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageGround()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageGroundDef()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getSubAttempts()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getSubAttemptsDef()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPass()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getReversals()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbSigStrike()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbStrike()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbHead()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbBody()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbLeg()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbTakedown()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbClinch()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbDistance()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbGround()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  
	    		  fileWriter.append(String.valueOf(cs.getNbSigStrikeDef()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbStrikeDef()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbHeadDef()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbBodyDef()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbLegDef()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbTakedownDef()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbClinchDef()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbDistanceDef()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbGroundDef()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbMatchAgainstAdv()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbWinAgainstAdv()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbLossAgainstAdv()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		
	    		  
	    		  if(t)
	    		  {
	    			fileWriter.append(cs.getNom2());
	    		  	fileWriter.append(COMMA_DELIMITER);
	    		  }
	    	
	    		  fileWriter.append(String.valueOf(cs.getTaille2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getReach2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getAge2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbMatch2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbTitleMatch2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbRound2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageWin2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbWinStreak2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageWinTKO2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageWinDecision2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageWinSubmission2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageLoss2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbLossStreak2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageLossTKO2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageLossDecision2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageLossSubmission2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageHead2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageHeadDef2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageBody2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageBodyDef2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageLeg2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageLegDef2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageSigStrike2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageSigStrikeDef2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageStrike2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageStrikeDef2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageTakedown2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageTakedownDef2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageClinch2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageClinchDef2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageDistance2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageDistanceDef()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageGround2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPourcentageGroundDef2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getSubAttempts2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getSubAttemptsDef2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getPass2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getReversals2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbSigStrike2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbStrike2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbHead2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbBody2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbLeg2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbTakedown2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbClinch2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbDistance2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbGround2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  
	    		  fileWriter.append(String.valueOf(cs.getNbSigStrikeDef2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbStrikeDef2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbHeadDef2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbBodyDef2()));
	    		  //System.out.println(cs.getNbBodyDef2());
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbLegDef2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbTakedownDef2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbClinchDef2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbDistanceDef2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbGroundDef2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbMatchAgainstAdv2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbWinAgainstAdv2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  fileWriter.append(String.valueOf(cs.getNbLossAgainstAdv2()));
	    		  fileWriter.append(COMMA_DELIMITER);
	    		  
	    		  
	    		  fileWriter.append(String.valueOf(cs.getRes()));
	              fileWriter.append(NEW_LINE_SEPARATOR);
	                
	    	}
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Erreur ecriture dans le csv!");
    		e.printStackTrace();
	    }
	    finally {
	    		             
	    	try 
	    	{	
	    		fileWriter.flush();
	    		fileWriter.close();		
	    	} 
	    	catch (IOException e) 
	    	{
	    		System.out.println("Erreur flush/fermeture du csv!");
	    		e.printStackTrace();
	    	}
	    }
	    		            
	}
	
	public int NbMatch(int j, String nom){
		int res=0;
		for(int i=0; i<j; i++)
		{
			if(listentre.get(i).getName().contains(nom))
				res++;
		}
		return res;
	}
	
	public int NbTitleMatch(int j, String nom){
		int res=0;
		for(int i=0; i<j; i++)
		{
			if(listentre.get(i).getName().contains(nom) && listentre.get(i).getTitlematch())
				res++;
		}
		return res;
	}
	
	public int NbRound(int j, String nom){
		int res=0;
		for(int i=0; i<j; i++)
		{
			if(listentre.get(i).getName().contains(nom))
				res=listentre.get(i).getRound()+res;
		}
		return res;
	}
	
	public double PourcentageWin(int j, String nom){
		double nbw=0;
		double res=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom) && listentre.get(i).getRes().contains("W"))
				nbw++;		
		}
		for(int i=0; i<j; i++)
		{
			if(listentre.get(i).getName().contains(nom))
				res++;
		}
		if(res==0)
			return 0;
		return nbw/res;
	}
	
	public int NbWinStreak(int j, String nom){
		int nbws=0;

		
		for(int i=j-1;i>=0;i--)
		{
			if(listentre.get(i).getName().contains(nom) && listentre.get(i).getRes().contains("W"))
				nbws++;
			else if(listentre.get(i).getName().contains(nom) && !listentre.get(i).getRes().contains("W"))
				break;
		}
		
		return nbws;
	}
	
	
	public double PourcentageWinTKO(int j, String nom){
		double nbw=0;
		double res=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom) && listentre.get(i).getRes().contains("W"))
				nbw++;		
		}
		for(int i=0; i<j; i++)
		{
			if(listentre.get(i).getName().contains(nom) && listentre.get(i).getRes().contains("W") &&  listentre.get(i).getMethode().contains("TKO"))
				res++;
		}
		if(nbw==0)
			return 0;
		return res/nbw;
	}
	
	public double PourcentageWinDecision(int j, String nom){
		double nbw=0;
		double res=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom) && listentre.get(i).getRes().contains("W"))
				nbw++;		
		}
		for(int i=0; i<j; i++)
		{
			if(listentre.get(i).getName().contains(nom) && listentre.get(i).getRes().contains("W") &&  listentre.get(i).getMethode().contains("Decision"))
				res++;
		}
		if(nbw==0)
			return 0;
		return res/nbw;
	}
	
	public double PourcentageWinSubmission(int j, String nom){
		double nbw=0;
		double res=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom) && listentre.get(i).getRes().contains("W"))
				nbw++;		
		}
		for(int i=0; i<j; i++)
		{
			if(listentre.get(i).getName().contains(nom) && listentre.get(i).getRes().contains("W") &&  listentre.get(i).getMethode().contains("Submission"))
				res++;
		}
		if(nbw==0)
			return 0;
		return res/nbw;
	}
	
	public double PourcentageLoss(int j, String nom){
		double nbl=0;
		double res=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom) && listentre.get(i).getRes().contains("L"))
				nbl++;		
		}
		for(int i=0; i<j; i++)
		{
			if(listentre.get(i).getName().contains(nom))
				res++;
		}
		if(res==0)
			return 0;
		return nbl/res;
	}
	
	public int NbLossStreak(int j, String nom){
		int nbls=0;

		
		for(int i=j-1;i>=0;i--)
		{
			if(listentre.get(i).getName().contains(nom) && listentre.get(i).getRes().contains("L"))
				nbls++;
			else if(listentre.get(i).getName().contains(nom) && !listentre.get(i).getRes().contains("L"))
				break;
		}
		
		return nbls;
	}
	
	
	public double PourcentageLossTKO(int j, String nom){
		double nbl=0;
		double res=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom) && listentre.get(i).getRes().contains("L"))
				nbl++;		
		}
		for(int i=0; i<j; i++)
		{
			if(listentre.get(i).getName().contains(nom) && listentre.get(i).getRes().contains("L") &&  listentre.get(i).getMethode().contains("TKO"))
				res++;
		}
		if(nbl==0)
			return 0;
		return res/nbl;
	}
	
	public double PourcentageLossDecision(int j, String nom){
		double nbl=0;
		double res=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom) && listentre.get(i).getRes().contains("L"))
				nbl++;		
		}
		for(int i=0; i<j; i++)
		{
			if(listentre.get(i).getName().contains(nom) && listentre.get(i).getRes().contains("L") &&  listentre.get(i).getMethode().contains("Decision"))
				res++;
		}
		if(nbl==0)
			return 0;
		return res/nbl;
	}
	
	public double PourcentageLossSubmission(int j, String nom){
		double nbl=0;
		double res=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom) && listentre.get(i).getRes().contains("L"))
				nbl++;		
		}
		for(int i=0; i<j; i++)
		{
			if(listentre.get(i).getName().contains(nom) && listentre.get(i).getRes().contains("L") &&  listentre.get(i).getMethode().contains("Submission"))
				res++;
		}
		if(nbl==0)
			return 0;
		return res/nbl;
	}
	
	public double PourcentageHead(int j, String nom){
		double headr=0;
		double heada=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom))
			{
				headr=headr+listentre.get(i).getHead();	
				heada=heada+listentre.get(i).getHead_attempts();
				//System.out.println(headr+"/"+heada);
			}

		}
		if(heada==0)
			return 0;
		return headr/heada;
	}
	
	public double PourcentageHeadDef(int j, String nom){
		double headefr=0;
		double headefa=0;
		int idmatch=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom)){
				idmatch=listentre.get(i).getFight_id();
				if(i==0)
				{
					headefr=headefr+listentre.get(1).getHead();
					headefa=headefa+listentre.get(1).getHead_attempts();
				}
				else{
					for(int j1=i-1;j1<=i+1;j1++)
					{
						if(!listentre.get(j1).getName().contains(nom) && listentre.get(j1).getFight_id()==idmatch){
							headefr=headefr+listentre.get(j1).getHead();
							headefa=headefa+listentre.get(j1).getHead_attempts();
							break;
						}
					}
				}
			}
		}
		if(headefa==0)
			return 0;
		return 1-(headefr/headefa);
	}
	
	public int NbHeadDef(int j, String nom){
		int headefa=0;
		int idmatch=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom)){
				idmatch=listentre.get(i).getFight_id();
				if(i==0)
				{
					headefa=headefa+listentre.get(1).getHead_attempts();
				}
				else{
					for(int j1=i-1;j1<=i+1;j1++)
					{
						if(!listentre.get(j1).getName().contains(nom) && listentre.get(j1).getFight_id()==idmatch){
							headefa=headefa+listentre.get(j1).getHead_attempts();
							break;
						}
					}
				}
			}
		}

		return headefa;
	}
	
	public double PourcentageBody(int j, String nom){
		double bodyr=0;
		double bodya=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom))
			{
				bodyr=bodyr+listentre.get(i).getBody();	
				bodya=bodya+listentre.get(i).getBody_attempts();
			}		
		}
		if(bodya==0)
			return 0;
		return bodyr/bodya;
	}
	
	public double PourcentageBodyDef(int j, String nom){
		double bodydefr=0;
		double bodydefa=0;
		int idmatch=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom)){
				idmatch=listentre.get(i).getFight_id();
				if(i==0){
					bodydefr=bodydefr+listentre.get(1).getBody();
					bodydefa=bodydefa+listentre.get(1).getBody_attempts();
				}
				else{
					for(int j1=i-1;j1<=i+1;j1++)
					{
						if(!listentre.get(j1).getName().contains(nom) && listentre.get(j1).getFight_id()==idmatch){
							bodydefr=bodydefr+listentre.get(j1).getBody();
							bodydefa=bodydefa+listentre.get(j1).getBody_attempts();
							break;
						}
					}
				}
			}
		}
		if(bodydefa==0)
			return 0;
		return 1-(bodydefr/bodydefa);
	}
	
	public int NbBodyDef(int j, String nom){
		int bodydefa=0;
		int idmatch=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom)){
				idmatch=listentre.get(i).getFight_id();
				if(i==0){
					bodydefa=bodydefa+listentre.get(1).getBody_attempts();
				}
				else{
					for(int j1=i-1;j1<=i+1;j1++)
					{
						if(!listentre.get(j1).getName().contains(nom) && listentre.get(j1).getFight_id()==idmatch){
							bodydefa=bodydefa+listentre.get(j1).getBody_attempts();
							break;
						}
					}
				}
			}
		}

		return bodydefa;
	}
	
	
	public double PourcentageLeg(int j, String nom){
		double legr=0;
		double lega=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom))
			{
				legr=legr+listentre.get(i).getLeg();	
				lega=lega+listentre.get(i).getLeg_attempts();
			}		
		}
		if(lega==0)
			return 0;
		return legr/lega;
	}
	
	public double PourcentageLegDef(int j, String nom){
		double legdefr=0;
		double legdefa=0;
		int idmatch=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom)){
				idmatch=listentre.get(i).getFight_id();
				if(i==0){
					legdefr=legdefr+listentre.get(1).getLeg();
					legdefa=legdefa+listentre.get(1).getLeg_attempts();
				}
				else{
					for(int j1=i-1;j1<=i+1;j1++)
					{
						if(!listentre.get(j1).getName().contains(nom) && listentre.get(j1).getFight_id()==idmatch){
							legdefr=legdefr+listentre.get(j1).getLeg();
							legdefa=legdefa+listentre.get(j1).getLeg_attempts();
							break;
						}
					}
				}
			
			}
		}
		if(legdefa==0)
			return 0;
		return 1-(legdefr/legdefa);
	}
	
	public int NbLegDef(int j, String nom){
		int legdefa=0;
		int idmatch=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom)){
				idmatch=listentre.get(i).getFight_id();
				if(i==0){
					legdefa=legdefa+listentre.get(1).getLeg_attempts();
				}
				else{
					for(int j1=i-1;j1<=i+1;j1++)
					{
						if(!listentre.get(j1).getName().contains(nom) && listentre.get(j1).getFight_id()==idmatch){
							legdefa=legdefa+listentre.get(j1).getLeg_attempts();
							break;
						}
					}
				}
			
			}
		}

		return legdefa;
	}
	
	public double PourcentageSigStrike(int j, String nom){
		double sigr=0;
		double siga=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom))
			{
				sigr=sigr+listentre.get(i).getSig_strikes();	
				siga=siga+listentre.get(i).getSig_attempts();
			}	
		}
		if(siga==0)
			return 0;
		return sigr/siga;
	}
	

	public double PourcentageSigStrikeDef(int j, String nom){
		double sigdefr=0;
		double sigdefa=0;
		int idmatch=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom)){
				idmatch=listentre.get(i).getFight_id();
				if(i==0){
					sigdefr=sigdefr+listentre.get(1).getSig_strikes();
					sigdefa=sigdefa+listentre.get(1).getSig_attempts();
				}
				else{
					for(int j1=i-1;j1<=i+1;j1++)
					{
						if(!listentre.get(j1).getName().contains(nom) && listentre.get(j1).getFight_id()==idmatch){
							sigdefr=sigdefr+listentre.get(j1).getSig_strikes();
							sigdefa=sigdefa+listentre.get(j1).getSig_attempts();
							break;
						}
					}
				}
			}
		}
		if(sigdefa==0)
			return 0;
		return 1-(sigdefr/sigdefa);
	}
	
	public int NbSigStrikeDef(int j, String nom){
		int sigdefa=0;
		int idmatch=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom)){
				idmatch=listentre.get(i).getFight_id();
				if(i==0){
					sigdefa=sigdefa+listentre.get(1).getSig_attempts();
				}
				else{
					for(int j1=i-1;j1<=i+1;j1++)
					{
						if(!listentre.get(j1).getName().contains(nom) && listentre.get(j1).getFight_id()==idmatch){
							sigdefa=sigdefa+listentre.get(j1).getSig_attempts();
							break;
						}
					}
				}
			}
		}
		return sigdefa;
		
	}
	
	
	
	
	public double PourcentageStrike(int j, String nom){
		double striker=0;
		double strikea=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom))
			{
				striker=striker+listentre.get(i).getStrikes();	
				strikea=strikea+listentre.get(i).getStrike_attempts();
			}		
		}
		if(strikea==0)
			return 0;
		return striker/strikea;
	}
	
	public double PourcentageStrikeDef(int j, String nom){
		double strikedefr=0;
		double strikedefa=0;
		int idmatch=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom)){
				idmatch=listentre.get(i).getFight_id();
				if(i==0){
					strikedefr=strikedefr+listentre.get(1).getStrikes();
					strikedefa=strikedefa+listentre.get(1).getStrike_attempts();
				}
				else{
					for(int j1=i-1;j1<=i+1;j1++)
					{
						if(!listentre.get(j1).getName().contains(nom) && listentre.get(j1).getFight_id()==idmatch){
							strikedefr=strikedefr+listentre.get(j1).getStrikes();
							strikedefa=strikedefa+listentre.get(j1).getStrike_attempts();
							break;
						}
					}
				}
				
			}
		}
		if(strikedefa==0)
			return 0;
		return 1-(strikedefr/strikedefa);
	}
	
	public int NbStrikeDef(int j, String nom){
		int strikedefa=0;
		int idmatch=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom)){
				idmatch=listentre.get(i).getFight_id();
				if(i==0){
					strikedefa=strikedefa+listentre.get(1).getStrike_attempts();
				}
				else{
					for(int j1=i-1;j1<=i+1;j1++)
					{
						if(!listentre.get(j1).getName().contains(nom) && listentre.get(j1).getFight_id()==idmatch){
							strikedefa=strikedefa+listentre.get(j1).getStrike_attempts();
							break;
						}
					}
				}
				
			}
		}
		return strikedefa;
	}
	
	
	

	public double PourcentageTakedown(int j, String nom){
		double tkr=0;
		double tka=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom))
			{
				tkr=tkr+listentre.get(i).getTakedowns();	
				tka=tka+listentre.get(i).getTd_attempts();
			}		
		}
		if(tka==0)
			return 0;
		return tkr/tka;
	}
	
	public double PourcentageTakedownDef(int j, String nom){
		double takedowndefr=0;
		double takedowndefa=0;
		int idmatch=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom)){
				idmatch=listentre.get(i).getFight_id();
				if(i==0){
					takedowndefr=takedowndefr+listentre.get(1).getTakedowns();
					takedowndefa=takedowndefa+listentre.get(1).getTd_attempts();
				}
				else{
					for(int j1=i-1;j1<=i+1;j1++)
					{
						if(!listentre.get(j1).getName().contains(nom) && listentre.get(j1).getFight_id()==idmatch){
							takedowndefr=takedowndefr+listentre.get(j1).getTakedowns();
							takedowndefa=takedowndefa+listentre.get(j1).getTd_attempts();
							break;
						}
					}
				}
			
			}
		}
		if(takedowndefa==0)
			return 0;
		return 1-(takedowndefr/takedowndefa);
	}
	
	public int NbTakedownDef(int j, String nom){
		int takedowndefa=0;
		int idmatch=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom)){
				idmatch=listentre.get(i).getFight_id();
				if(i==0){
					takedowndefa=takedowndefa+listentre.get(1).getTd_attempts();
				}
				else{
					for(int j1=i-1;j1<=i+1;j1++)
					{
						if(!listentre.get(j1).getName().contains(nom) && listentre.get(j1).getFight_id()==idmatch){
							takedowndefa=takedowndefa+listentre.get(j1).getTd_attempts();
							break;
						}
					}
				}
			
			}
		}
		
		return takedowndefa;
	}
	

	public double PourcentageClinch(int j, String nom){
		double clinchr=0;
		double clincha=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom))
			{
				clinchr=clinchr+listentre.get(i).getClinch();	
				clincha=clincha+listentre.get(i).getClinch_attemps();
			}		
		}
		if(clincha==0)
			return 0;
		return clinchr/clincha;
	}
	
	public double PourcentageClinchDef(int j, String nom){
		double clinchdefr=0;
		double clinchdefa=0;
		int idmatch=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom)){
				idmatch=listentre.get(i).getFight_id();
				if(i==0){
					clinchdefr=clinchdefr+listentre.get(1).getClinch();
					clinchdefa=clinchdefa+listentre.get(1).getClinch_attemps();
				}
				else{
					for(int j1=i-1;j1<=i+1;j1++)
					{
						if(!listentre.get(j1).getName().contains(nom) && listentre.get(j1).getFight_id()==idmatch){
							clinchdefr=clinchdefr+listentre.get(j1).getClinch();
							clinchdefa=clinchdefa+listentre.get(j1).getClinch_attemps();
							break;
						}
					}
				}
			}
		}
		if(clinchdefa==0)
			return 0;
		return 1-(clinchdefr/clinchdefa);
	}
	
	public int NbClinchDef(int j, String nom){
		int clinchdefa=0;
		int idmatch=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom)){
				idmatch=listentre.get(i).getFight_id();
				if(i==0){
					clinchdefa=clinchdefa+listentre.get(1).getClinch_attemps();
				}
				else{
					for(int j1=i-1;j1<=i+1;j1++)
					{
						if(!listentre.get(j1).getName().contains(nom) && listentre.get(j1).getFight_id()==idmatch){
							clinchdefa=clinchdefa+listentre.get(j1).getClinch_attemps();
							break;
						}
					}
				}
			}
		}
	
		return clinchdefa;
	}
	
	public double PourcentageGround(int j, String nom){
		double groundr=0;
		double grounda=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom))
			{
				groundr=groundr+listentre.get(i).getGround();	
				grounda=grounda+listentre.get(i).getGround_attempts();	
			}	
		}
		if(grounda==0)
			return 0;
		return groundr/grounda;
	}
	
	public double PourcentageGroundDef(int j, String nom){
		double groundefr=0;
		double groundefa=0;
		int idmatch=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom)){
				idmatch=listentre.get(i).getFight_id();
				if(i==0){
					groundefr=groundefr+listentre.get(1).getGround();
					groundefa=groundefa+listentre.get(1).getGround_attempts();
				}
				else{
					for(int j1=i-1;j1<=i+1;j1++)
					{
						if(!listentre.get(j1).getName().contains(nom) && listentre.get(j1).getFight_id()==idmatch){
							groundefr=groundefr+listentre.get(j1).getGround();
							groundefa=groundefa+listentre.get(j1).getGround_attempts();
							break;
						}
					}	
				}
			}
		}
		if(groundefa==0)
			return 0;
		return 1-(groundefr/groundefa);
	}
	
	public int NbGroundDef(int j, String nom){
		int groundefa=0;
		int idmatch=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom)){
				idmatch=listentre.get(i).getFight_id();
				if(i==0){
					groundefa=groundefa+listentre.get(1).getGround_attempts();
				}
				else{
					for(int j1=i-1;j1<=i+1;j1++)
					{
						if(!listentre.get(j1).getName().contains(nom) && listentre.get(j1).getFight_id()==idmatch){
							groundefa=groundefa+listentre.get(j1).getGround_attempts();
							break;
						}
					}	
				}
			}
		}
	
		return groundefa;
	}
	
	
	public double PourcentageDistance(int j, String nom){
		double distancer=0;
		double distancea=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom))
			{
				distancer=distancer+listentre.get(i).getDistance();	
				distancea=distancea+listentre.get(i).getDistance_attemps();
			}		
		}
		if(distancea==0)
			return 0;
		return distancer/distancea;
	}
	
	public double PourcentageDistanceDef(int j, String nom){
		double distancedefr=0;
		double distancedefa=0;
		int idmatch=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom)){
				idmatch=listentre.get(i).getFight_id();
				if(i==0){
					distancedefr=distancedefr+listentre.get(1).getDistance();
					distancedefa=distancedefa+listentre.get(1).getDistance_attemps();
				}
				else{
					for(int j1=i-1;j1<=i+1;j1++)
					{
						if(!listentre.get(j1).getName().contains(nom) && listentre.get(j1).getFight_id()==idmatch){
							distancedefr=distancedefr+listentre.get(j1).getDistance();
							distancedefa=distancedefa+listentre.get(j1).getDistance_attemps();
							break;
						}
					}
				}
			}
		}
		if(distancedefa==0)
			return 0;
		return 1-(distancedefr/distancedefa);
	}
	
	public int NbDistanceDef(int j, String nom){
		int distancedefa=0;
		int idmatch=0;
		
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom)){
				idmatch=listentre.get(i).getFight_id();
				if(i==0){
					distancedefa=distancedefa+listentre.get(1).getDistance_attemps();
				}
				else{
					for(int j1=i-1;j1<=i+1;j1++)
					{
						if(!listentre.get(j1).getName().contains(nom) && listentre.get(j1).getFight_id()==idmatch){
							distancedefa=distancedefa+listentre.get(j1).getDistance_attemps();
							break;
						}
					}
				}
			}
		}
	
		return distancedefa;
	}
	
	
	public int NbSubAttempts(int j, String nom){
		int nbsub=0;
		for(int i=0; i<j; i++)
		{
			if(listentre.get(i).getName().contains(nom))
				nbsub=listentre.get(i).getSub_attempts()+nbsub;
		}
		return nbsub;
	}
	
	public int NbSubAttemptsDef(int j,String nom){
		int nbsubdef=0;
		int idmatch=0;

		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom)){
				idmatch=listentre.get(i).getFight_id();
				if(i==0)
					nbsubdef=nbsubdef+listentre.get(1).getSub_attempts();				
				else{
					for(int j1=i-1;j1<=i+1;j1++)
					{
						if(!listentre.get(j1).getName().contains(nom) && listentre.get(j1).getFight_id()==idmatch){
							nbsubdef=nbsubdef+listentre.get(j1).getSub_attempts();
							break;
						}
					}
				}
			}
		}
		return nbsubdef;
	}
	
	public int NbPass(int j, String nom){
		int nbpass=0;
		for(int i=0; i<j; i++)
		{
			if(listentre.get(i).getName().contains(nom))
				nbpass=listentre.get(i).getPass()+nbpass;
		}
		return nbpass;
	}
	
	public int NbReversals(int j, String nom){
		int nbrev=0;
		for(int i=0; i<j; i++)
		{
			if(listentre.get(i).getName().contains(nom))
				nbrev=listentre.get(i).getReversals()+nbrev;
		}
		return nbrev;
	}
	
	
	public int NbSigStrike(int j, String nom){
		int nbsigstrike=0;
		for(int i=0; i<j; i++)
		{
			if(listentre.get(i).getName().contains(nom))
				nbsigstrike=listentre.get(i).getSig_attempts()+nbsigstrike;
		}
		return nbsigstrike;
	}
	
	
	public int NbStrike(int j, String nom){
		int nbstrike=0;
		for(int i=0; i<j; i++)
		{
			if(listentre.get(i).getName().contains(nom))
				nbstrike=listentre.get(i).getStrike_attempts()+nbstrike;
		}
		return nbstrike;
	}
	

	public int NbHead(int j, String nom){
		int nbhead=0;
		for(int i=0; i<j; i++)
		{
			if(listentre.get(i).getName().contains(nom))
				nbhead=listentre.get(i).getHead_attempts()+nbhead;
		}
		return nbhead;
	}
	
	public int NbBody(int j, String nom){
		int nbbody=0;
		for(int i=0; i<j; i++)
		{
			if(listentre.get(i).getName().contains(nom))
				nbbody=listentre.get(i).getBody_attempts()+nbbody;
		}
		return nbbody;
	}
	

	public int NbLeg(int j, String nom){
		int nbleg=0;
		for(int i=0; i<j; i++)
		{
			if(listentre.get(i).getName().contains(nom))
				nbleg=listentre.get(i).getLeg_attempts()+nbleg;
		}
		return nbleg;
	}
	
	public int NbTakedown(int j, String nom){
		int nbtd=0;
		for(int i=0; i<j; i++)
		{
			if(listentre.get(i).getName().contains(nom))
				nbtd=listentre.get(i).getTd_attempts()+nbtd;
		}
		return nbtd;
	}
	
	public int NbClinch(int j, String nom){
		int nbclinch=0;
		for(int i=0; i<j; i++)
		{
			if(listentre.get(i).getName().contains(nom))
				nbclinch=listentre.get(i).getClinch_attemps()+nbclinch;
		}
		return nbclinch;
	}
	
	public int NbDistance(int j, String nom){
		int nbdist=0;
		for(int i=0; i<j; i++)
		{
			if(listentre.get(i).getName().contains(nom))
				nbdist=listentre.get(i).getDistance_attemps()+nbdist;
		}
		return nbdist;
	}
	
	public int NbGround(int j, String nom){
		int nbground=0;
		for(int i=0; i<j; i++)
		{
			if(listentre.get(i).getName().contains(nom))
				nbground=listentre.get(i).getGround_attempts()+nbground;
		}
		return nbground;
	}
	
	
	
	public int NbMatchAgainstAdv(int j, String nom, String adv){
		int nb=0;
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom)){
				int fid=listentre.get(i).getFight_id();
				if(i==0 && listentre.get(1).getName().contains(adv))
					nb++;				
				else{
					if(i==0)continue;
					if(listentre.get(i-1).getName().contains(adv) && fid==listentre.get(i-1).getFight_id())
						nb++;
					else if((listentre.get(i+1).getName().contains(adv) && fid==listentre.get(i+1).getFight_id()))
							nb++;

					}
				}
			}
		
		return nb;
	}
	
	public int NbWinAgainstAdv(int j, String nom, String adv){
		int nb=0;
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom) && listentre.get(i).getRes().contains("W")){
				int fid=listentre.get(i).getFight_id();
				if(i==0 && listentre.get(1).getName().contains(adv))
					nb++;				
				else{
					if(i==0)continue;
					if(listentre.get(i-1).getName().contains(adv) && fid==listentre.get(i-1).getFight_id() && listentre.get(i).getRes().contains("W"))
						nb++;
					else if((listentre.get(i+1).getName().contains(adv) && fid==listentre.get(i+1).getFight_id() && listentre.get(i).getRes().contains("W")))
							nb++;

					}
				}
			}
		return nb;
	}
	
	public int NbLossAgainstAdv(int j, String nom, String adv){
		int nb=0;
		for(int i=0;i<j;i++)
		{
			if(listentre.get(i).getName().contains(nom) && listentre.get(i).getRes().contains("L")){
				int fid=listentre.get(i).getFight_id();
				if(i==0 && listentre.get(1).getName().contains(adv))
					nb++;				
				else{
					if(i==0)continue;
					if(listentre.get(i-1).getName().contains(adv) && fid==listentre.get(i-1).getFight_id() && listentre.get(i).getRes().contains("L"))
						nb++;
					else if((listentre.get(i+1).getName().contains(adv) && fid==listentre.get(i+1).getFight_id() && listentre.get(i).getRes().contains("L")))
							nb++;

					}
				}
			}
		return nb;
	}
	
	
	
	public ArrayList<Combatentre> getList() {
		return listentre;
	}


	public void setList(ArrayList<Combatentre> list) {
		this.listentre = list;
	}



	public static void main(String []args){
		File f1= new File("src/Csv/fightFINAL.csv");
		File f2=new File("src/Csv/fighterFINAL.csv");
		Chargement c = new Chargement(f1,f2);	
		c.remplir();
		c.remplir2();
		c.creerCSV2("src/Csv/NewEnsemble.csv",true);
		c.creerCSV2("src/Csv/NewEnsembleSANSCOLONNENOM.csv", false);

	}
}
