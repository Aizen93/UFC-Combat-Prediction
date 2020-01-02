import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;


public class Statistique {

    private ArrayList<Combatsortiebis> listesortiebis=new ArrayList<>();

    public Statistique(File f1){
        BufferedReader fileReader1=null;

        try{
            String line ="";                                     
            fileReader1 = new BufferedReader(new FileReader(f1));
            fileReader1.readLine();
            while((line=fileReader1.readLine())!= null){
                String []tokens = line.split(",");
                if(tokens.length > 0){
                    Combatsortiebis csb = new Combatsortiebis(tokens[0],Integer.parseInt(tokens[1]),Double.parseDouble(tokens[2]),Integer.parseInt(tokens[3]),Integer.parseInt(tokens[4]),Integer.parseInt(tokens[5]),
                        Integer.parseInt(tokens[6]),Double.parseDouble(tokens[7]),Integer.parseInt(tokens[8]),Double.parseDouble(tokens[9]),Double.parseDouble(tokens[10]),Double.parseDouble(tokens[11]),Double.parseDouble(tokens[12]),
                        Integer.parseInt(tokens[13]),Double.parseDouble(tokens[14]),Double.parseDouble(tokens[15]),Double.parseDouble(tokens[16]),Double.parseDouble(tokens[17]),Double.parseDouble(tokens[18]),Double.parseDouble(tokens[19]),
                        Double.parseDouble(tokens[20]),Double.parseDouble(tokens[21]),Double.parseDouble(tokens[22]),Double.parseDouble(tokens[23]),Double.parseDouble(tokens[24]),Double.parseDouble(tokens[25]),Double.parseDouble(tokens[26]),
                        Double.parseDouble(tokens[27]),Double.parseDouble(tokens[28]),Double.parseDouble(tokens[29]),Double.parseDouble(tokens[30]),Double.parseDouble(tokens[31]),Double.parseDouble(tokens[32]),Double.parseDouble(tokens[33]),
                        Double.parseDouble(tokens[34]),Integer.parseInt(tokens[35]),Integer.parseInt(tokens[36]),Integer.parseInt(tokens[37]),Integer.parseInt(tokens[38]),


                        Integer.parseInt(tokens[39]), Integer.parseInt(tokens[40]), Integer.parseInt(tokens[41]), Integer.parseInt(tokens[42]), Integer.parseInt(tokens[43]), Integer.parseInt(tokens[44]), Integer.parseInt(tokens[45]),
                        Integer.parseInt(tokens[46]), Integer.parseInt(tokens[47]), Integer.parseInt(tokens[48]), Integer.parseInt(tokens[49]),
                        Integer.parseInt(tokens[50]), Integer.parseInt(tokens[51]), Integer.parseInt(tokens[52]), Integer.parseInt(tokens[53]), Integer.parseInt(tokens[54]), Integer.parseInt(tokens[55]), Integer.parseInt(tokens[56]), 
                        Integer.parseInt(tokens[57]), Integer.parseInt(tokens[58]), Integer.parseInt(tokens[59])

                        , tokens[60],Integer.parseInt(tokens[61]),Double.parseDouble(tokens[62]),Integer.parseInt(tokens[63]),Integer.parseInt(tokens[64]),Integer.parseInt(tokens[65]),
                        Integer.parseInt(tokens[66]),Double.parseDouble(tokens[67]),Integer.parseInt(tokens[68]),Double.parseDouble(tokens[69]),Double.parseDouble(tokens[70]),Double.parseDouble(tokens[71]),Double.parseDouble(tokens[72]),
                        Integer.parseInt(tokens[73]),Double.parseDouble(tokens[74]),Double.parseDouble(tokens[75]),Double.parseDouble(tokens[76]),Double.parseDouble(tokens[77]),Double.parseDouble(tokens[78]),Double.parseDouble(tokens[79]),
                        Double.parseDouble(tokens[80]),Double.parseDouble(tokens[81]),Double.parseDouble(tokens[82]),Double.parseDouble(tokens[83]),Double.parseDouble(tokens[84]),Double.parseDouble(tokens[85]),Double.parseDouble(tokens[86]),
                        Double.parseDouble(tokens[87]),Double.parseDouble(tokens[88]),Double.parseDouble(tokens[89]),Double.parseDouble(tokens[90]),Double.parseDouble(tokens[91]),Double.parseDouble(tokens[92]),Double.parseDouble(tokens[93]),
                        Double.parseDouble(tokens[94]),Integer.parseInt(tokens[95]),Integer.parseInt(tokens[96]),Integer.parseInt(tokens[97]),Integer.parseInt(tokens[98]), Integer.parseInt(tokens[99]), Integer.parseInt(tokens[100]), 
                        Integer.parseInt(tokens[101]), Integer.parseInt(tokens[102]), Integer.parseInt(tokens[103]), Integer.parseInt(tokens[104]), Integer.parseInt(tokens[105]), Integer.parseInt(tokens[106]), Integer.parseInt(tokens[107]),
                        Integer.parseInt(tokens[108]), Integer.parseInt(tokens[109]), Integer.parseInt(tokens[110]), Integer.parseInt(tokens[111]), Integer.parseInt(tokens[112]), Integer.parseInt(tokens[113]), Integer.parseInt(tokens[114]),
                        Integer.parseInt(tokens[115]), Integer.parseInt(tokens[116]), Integer.parseInt(tokens[117]), Integer.parseInt(tokens[118]), Integer.parseInt(tokens[119]));
                    csb.setRes(tokens[120]);
                    this.listesortiebis.add(csb);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    //STATISTIQUE SELON QUE L'AGE DE L'UN DES COMBATTANT INF A n ET L'AUTRE AGE SUP A F
    public String stat1(int n){
        double a = 0, b = 0;
        for(int i=0;i<listesortiebis.size();i++){
            if((listesortiebis.get(i).getAge() > n && listesortiebis.get(i).getAge2() < n) || (listesortiebis.get(i).getAge() < n && listesortiebis.get(i).getAge2() > n)){
                a++;
            }
            if((listesortiebis.get(i).getAge() > n && listesortiebis.get(i).getAge2() < n && listesortiebis.get(i).getRes().contains("B"))
                || (listesortiebis.get(i).getAge() < n && listesortiebis.get(i).getAge2() > n && listesortiebis.get(i).getRes().contains("A"))){
                b++;
            }       
        }
        return ("Si l'un des combattant a un age superieur a "+ n +" et le second un age inferieur a "+ n +", le premier aura "+ b/a +" % de chance de gagner.");
    }

    public String stat2(int n){
        double a = 0, b = 0;
        for(int i=0;i<listesortiebis.size();i++){
            if((listesortiebis.get(i).getAge() + n <= listesortiebis.get(i).getAge2()) || listesortiebis.get(i).getAge2() + n <= listesortiebis.get(i).getAge())
                a++;
            if(((listesortiebis.get(i).getAge() + n <= listesortiebis.get(i).getAge2()) && listesortiebis.get(i).getRes().contains("A"))
                || ((listesortiebis.get(i).getAge2() + n <= listesortiebis.get(i).getAge()) && listesortiebis.get(i).getRes().contains("B")))
                b++;
        }
        return ("Si l'un des combattant a "+ n +" ans de moins que son adversaire il aura "+ b/a +" % de chance de gagner.");
    }

    public String stat3(int n){
        double a = 0, b = 0;
        for(int i=0;i<listesortiebis.size();i++){
            if((listesortiebis.get(i).getAge() - n >= listesortiebis.get(i).getAge2()) || listesortiebis.get(i).getAge2() - n >= listesortiebis.get(i).getAge())
                a++;
            if(((listesortiebis.get(i).getAge() - n >= listesortiebis.get(i).getAge2()) && listesortiebis.get(i).getRes().contains("A"))
                || ((listesortiebis.get(i).getAge2() - n >= listesortiebis.get(i).getAge()) && listesortiebis.get(i).getRes().contains("B")))
                b++;
        }
        return ("Si l'un des combattant a "+ n +" ans de plus que son adversaire il aura "+ b/a +" % de chance de gagner.");
    }

    public String[] stat4(int n, double y){
        double tkoT = 0, tko = 0, decT = 0, dec = 0, subT = 0, sub = 0;

        for(int i=0;i<listesortiebis.size();i++){
            if((listesortiebis.get(i).getAge() > n && listesortiebis.get(i).getAge2() < n && listesortiebis.get(i).getPourcentageWinTKO2() > y ) || (listesortiebis.get(i).getAge() < n && listesortiebis.get(i).getAge2() > n && listesortiebis.get(i).getPourcentageWinTKO() > y))
                tkoT++;
            if((listesortiebis.get(i).getAge() > n && listesortiebis.get(i).getAge2() < n && listesortiebis.get(i).getPourcentageWinTKO2() > y && listesortiebis.get(i).getRes().contains("B"))
                || (listesortiebis.get(i).getAge() < n && listesortiebis.get(i).getAge2() > n &&listesortiebis.get(i).getPourcentageWinTKO() > y && listesortiebis.get(i).getRes().contains("A")))
                tko++;

            if((listesortiebis.get(i).getAge() > n && listesortiebis.get(i).getAge2() < n && listesortiebis.get(i).getPourcentageWinDecision2() > y ) || (listesortiebis.get(i).getAge() < n && listesortiebis.get(i).getAge2() > n && listesortiebis.get(i).getPourcentageWinDecision() > y))
                decT++;
            if((listesortiebis.get(i).getAge() > n && listesortiebis.get(i).getAge2() < n && listesortiebis.get(i).getPourcentageWinDecision2() > y && listesortiebis.get(i).getRes().contains("B"))
                || (listesortiebis.get(i).getAge() < n && listesortiebis.get(i).getAge2() > n &&listesortiebis.get(i).getPourcentageWinDecision() > y && listesortiebis.get(i).getRes().contains("A")))
                dec++;

            if((listesortiebis.get(i).getAge() > n && listesortiebis.get(i).getAge2() < n && listesortiebis.get(i).getPourcentageWinSubmission2() > y ) || (listesortiebis.get(i).getAge() < n && listesortiebis.get(i).getAge2() > n && listesortiebis.get(i).getPourcentageWinSubmission() > y))
                subT++;
            
            if((listesortiebis.get(i).getAge() > n && listesortiebis.get(i).getAge2() < n && listesortiebis.get(i).getPourcentageWinSubmission2() > y && listesortiebis.get(i).getRes().contains("B"))
                || (listesortiebis.get(i).getAge() < n && listesortiebis.get(i).getAge2() > n &&listesortiebis.get(i).getPourcentageWinSubmission() > y && listesortiebis.get(i).getRes().contains("A")))
                sub++;
        }
        return new String[]{
            ("Si l'un des combattant a un age inferieur a "+ n +" et un pourcentage de victoire par ko superieur a "+ y +" et si l'autre un age superieur a "+ n +", le premier combattant aura "+ tko/tkoT +" % de gagner"),
            ("Si l'un des combattant a un age inferieur a "+ n +" et un pourcentage de victoire par decision superieur a "+ y +" et si l'autre un age superieur a "+ n +", le premier combattant aura "+ dec/decT +" % de gagner"),
            ("Si l'un des combattant a un age inferieur a "+ n +" et un pourcentage de victoire par soumission superieur a "+ y +" et si l'autre un age superieur a "+ n +", le premier combattant aura "+ sub/subT +" % de gagner")
        };
    }

    public String stat5(){//reach
        double a = 0, b = 0;
        for(int i=0;i<listesortiebis.size();i++){
            if((listesortiebis.get(i).getReach()  >listesortiebis.get(i).getReach2()) || listesortiebis.get(i).getReach()<listesortiebis.get(i).getReach2() )
                a++;

            if(((listesortiebis.get(i).getReach()  >listesortiebis.get(i).getReach2()) && listesortiebis.get(i).getRes().contains("A"))
                || ((listesortiebis.get(i).getReach()<listesortiebis.get(i).getReach2() ) && listesortiebis.get(i).getRes().contains("B")))
                b++;
        }
        return ("Si l'un des combattant a une reach superieur a son adversaire il aura "+ b/a +" % de gagner.");
    }

    public String stat6(int n){//reach age
        double a = 0, b = 0;
        for(int i=530;i<listesortiebis.size();i++){
            if((listesortiebis.get(i).getReach() - n >listesortiebis.get(i).getReach2() && listesortiebis.get(i).getAge()<listesortiebis.get(i).getAge2()) || (listesortiebis.get(i).getReach()<listesortiebis.get(i).getReach2() - n && listesortiebis.get(i).getAge()>listesortiebis.get(i).getAge2()))
                a++;

            if(((listesortiebis.get(i).getReach() - n >listesortiebis.get(i).getReach2()&& listesortiebis.get(i).getAge()<listesortiebis.get(i).getAge2()) && listesortiebis.get(i).getRes().contains("A"))
                || ((listesortiebis.get(i).getReach()<listesortiebis.get(i).getReach2() - n  && listesortiebis.get(i).getAge()>listesortiebis.get(i).getAge2()) && listesortiebis.get(i).getRes().contains("B")))
                b++;
        }
        return ("Si l'un des combattant a une reach superieur de "+n+" et un age inferieur par rapport a son adversaire il aura "+ b/a +" % de gagner.");
    }

    public String stat7(){//nbwinstreak
        double a = 0, b = 0;
        for(int i=0;i<listesortiebis.size();i++){
            if((listesortiebis.get(i).getNbWinStreak() > listesortiebis.get(i).getNbWinStreak2() ) || listesortiebis.get(i).getNbWinStreak()<listesortiebis.get(i).getNbWinStreak2())
                a++;

            if(((listesortiebis.get(i).getNbWinStreak()>listesortiebis.get(i).getNbWinStreak2()) && listesortiebis.get(i).getRes().contains("A"))
                || ((listesortiebis.get(i).getNbWinStreak()<listesortiebis.get(i).getNbWinStreak2()) && listesortiebis.get(i).getRes().contains("B")))
                b++;
        }
        return ("Si l'un des combattant a un nombre de victoire successive superieur a son adversaire il aura "+ b/a +" % de gagner.");
    }

    public String stat8(){//nbwinstreak
        double a = 0, b = 0;
        for(int i=0;i<listesortiebis.size();i++){
            if((listesortiebis.get(i).getNbWinStreak() >listesortiebis.get(i).getNbWinStreak2() && listesortiebis.get(i).getNbTitleMatch()>listesortiebis.get(i).getNbTitleMatch2()) || listesortiebis.get(i).getNbWinStreak()<listesortiebis.get(i).getNbWinStreak2() && listesortiebis.get(i).getNbTitleMatch()<listesortiebis.get(i).getNbTitleMatch2())
                a++;

            if(((listesortiebis.get(i).getNbWinStreak()  >listesortiebis.get(i).getNbWinStreak2() && listesortiebis.get(i).getNbTitleMatch()>listesortiebis.get(i).getNbTitleMatch2()) && listesortiebis.get(i).getRes().contains("A"))
                || ((listesortiebis.get(i).getNbWinStreak()<listesortiebis.get(i).getNbWinStreak2()  && listesortiebis.get(i).getNbTitleMatch()<listesortiebis.get(i).getNbTitleMatch2()) && listesortiebis.get(i).getRes().contains("B")))
                b++;
        }

        return ("Si l'un des combattant a un nombre de victoire successive  et un nombre de match pour le titre superieur  a son adversaire il aura "+b/a+" % de gagner.");
    }

    public String[] stat9(){
        double tkoT = 0, tko = 0, decT = 0, dec = 0, subT = 0, sub = 0;

        for(int i=0;i<listesortiebis.size();i++){
            if((listesortiebis.get(i).getNbWinStreak()  > listesortiebis.get(i).getNbWinStreak2() && listesortiebis.get(i).getPourcentageWinTKO() > listesortiebis.get(i).getPourcentageWinTKO2() ) || (listesortiebis.get(i).getNbWinStreak() < listesortiebis.get(i).getNbWinStreak2()  && listesortiebis.get(i).getPourcentageWinTKO2() > listesortiebis.get(i).getPourcentageWinTKO()))
                tkoT++;
            if((listesortiebis.get(i).getNbWinStreak() > listesortiebis.get(i).getNbWinStreak2() && listesortiebis.get(i).getPourcentageWinTKO() > listesortiebis.get(i).getPourcentageWinTKO2() && listesortiebis.get(i).getRes().contains("A"))
                || (listesortiebis.get(i).getNbWinStreak() < listesortiebis.get(i).getNbWinStreak2() && listesortiebis.get(i).getPourcentageWinTKO2() > listesortiebis.get(i).getPourcentageWinTKO() && listesortiebis.get(i).getRes().contains("B")))
                tko++;

            if((listesortiebis.get(i).getNbWinStreak() > listesortiebis.get(i).getNbWinStreak2() && listesortiebis.get(i).getPourcentageWinDecision() > listesortiebis.get(i).getPourcentageWinDecision2() ) || (listesortiebis.get(i).getNbWinStreak() < listesortiebis.get(i).getNbWinStreak2() && listesortiebis.get(i).getPourcentageWinDecision2() > listesortiebis.get(i).getPourcentageWinDecision()))
                decT++;
            if((listesortiebis.get(i).getNbWinStreak() > listesortiebis.get(i).getNbWinStreak2() && listesortiebis.get(i).getPourcentageWinDecision() > listesortiebis.get(i).getPourcentageWinDecision2() && listesortiebis.get(i).getRes().contains("A"))
                || (listesortiebis.get(i).getNbWinStreak() < listesortiebis.get(i).getNbWinStreak2()  && listesortiebis.get(i).getPourcentageWinDecision2() > listesortiebis.get(i).getPourcentageWinDecision() && listesortiebis.get(i).getRes().contains("B")))
                dec++;

            if((listesortiebis.get(i).getNbWinStreak()  > listesortiebis.get(i).getNbWinStreak2() && listesortiebis.get(i).getPourcentageWinSubmission() > listesortiebis.get(i).getPourcentageWinSubmission2() ) || (listesortiebis.get(i).getNbWinStreak() < listesortiebis.get(i).getNbWinStreak2()  && listesortiebis.get(i).getPourcentageWinSubmission2() > listesortiebis.get(i).getPourcentageWinSubmission()))
                subT++;
            if((listesortiebis.get(i).getNbWinStreak() > listesortiebis.get(i).getNbWinStreak2() && listesortiebis.get(i).getPourcentageWinSubmission() > listesortiebis.get(i).getPourcentageWinSubmission2() && listesortiebis.get(i).getRes().contains("A"))
                || (listesortiebis.get(i).getNbWinStreak() < listesortiebis.get(i).getNbWinStreak2()  && listesortiebis.get(i).getPourcentageWinSubmission2() > listesortiebis.get(i).getPourcentageWinSubmission() && listesortiebis.get(i).getRes().contains("B")))
                sub++;
        }
        return new String[]{
            ("Si un combattant a un nombre de victoire successive et un pourcentage de victoire par ko superieur a son adversaire il aura "+tko/tkoT+" % de gagner"),
            ("Si un combattant a un nombre de victoire successive et un pourcentage de victoire par decision superieur a son adversaire il aura "+dec/decT+" % de gagner"),
            ("Si un combattant a un nombre de victoire successive et un pourcentage de victoire par soumission superieur a son adversaire il aura "+sub/subT+" % de gagner")
        };
    }



    public String[] stat10(){//
        double tkot=0, tko=0, dect=0, dec=0, subt=0, sub=0;
        for(int i=0;i<listesortiebis.size();i++){
            if((listesortiebis.get(i).getPourcentageWinTKO()>listesortiebis.get(i).getPourcentageLossTKO2()) || (listesortiebis.get(i).getPourcentageWinTKO2()>listesortiebis.get(i).getPourcentageLossTKO()))
                tkot++;

            if(((listesortiebis.get(i).getPourcentageWinTKO()>listesortiebis.get(i).getPourcentageLossTKO2()) && listesortiebis.get(i).getRes().contains("A"))
                || ((listesortiebis.get(i).getPourcentageWinTKO2()>listesortiebis.get(i).getPourcentageLossTKO()) && listesortiebis.get(i).getRes().contains("B")))
                tko++;

            if((listesortiebis.get(i).getPourcentageWinDecision()>listesortiebis.get(i).getPourcentageLossDecision2()) || (listesortiebis.get(i).getPourcentageWinDecision2()>listesortiebis.get(i).getPourcentageLossDecision()))
                dect++;

            if(((listesortiebis.get(i).getPourcentageWinDecision()>listesortiebis.get(i).getPourcentageLossDecision2()) && listesortiebis.get(i).getRes().contains("A"))
                || ((listesortiebis.get(i).getPourcentageWinDecision2()>listesortiebis.get(i).getPourcentageLossDecision()) && listesortiebis.get(i).getRes().contains("B")))
                dec++;


            if((listesortiebis.get(i).getPourcentageWinSubmission()>listesortiebis.get(i).getPourcentageLossSubmission2()) || (listesortiebis.get(i).getPourcentageWinSubmission2()>listesortiebis.get(i).getPourcentageLossSubmission()))
                subt++;

            if(((listesortiebis.get(i).getPourcentageWinSubmission()>listesortiebis.get(i).getPourcentageLossSubmission2()) && listesortiebis.get(i).getRes().contains("A"))
                || ((listesortiebis.get(i).getPourcentageWinSubmission2()>listesortiebis.get(i).getPourcentageLossSubmission()) && listesortiebis.get(i).getRes().contains("B")))
                sub++;
        }
        return new String[]{
            ("Si un combattant a un pourcentage de victoire par ko superieur au pourcentage de defaite par KO de son adversaire il aura "+ tko/tkot +" % de gagner"),
            ("Si un combattant a un pourcentage de victoire par decision superieur au pourcentage de defaite par decision de son adversaire il aura "+ dec/dect +" % de gagner"),
            ("Si un combattant a un pourcentage de victoire par soumission superieur au pourcentage de defaite par soumission de son adversaire il aura "+ sub/subt +" % de gagner")
        };
    }

}