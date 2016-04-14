package oualid;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oualid on 14/04/2016.
 */
public class booling_game {
    int nbrlancer;
    int nbrquille;
    int nbrframe;
    ArrayList<Integer> score=new ArrayList<Integer>(10);
 int[] tmp_quille = new int[20];
    public void  lancer()
    {
        for (int i =0;i<nbrframe*2;i++) {
            if (tmp_quille[i] == 0) {
                continue;
            } else {
                tmp_quille[i] = quille_tomber();
                if (tmp_quille[i] == 10) {
                    tmp_quille[i + 1] = 0;
                }
            }
        }



 for (int i =0;i<nbrframe;i++)
 {
     int lancer_1=lancer1();
     if(lancer_1==10)
     {
         System.out.println("X");
         score.add(i,lancer_1);
     }

 }
    }
    public int lancer1()
    {
        int i =10;
       return  i;
    }

    public int scorelancer(int nbrtomber)
    {
        return 5;
    }
   public int  quille_tomber()
    {
        return 10;
    }

    int getstatus(int i,int[] tab)
    {
        if(tab[i]==10)
            return 2;
        else if(tab[i]+tab[i+1]==10)
        { return 1;

        }else{
            return 0;
        }
    }
}
