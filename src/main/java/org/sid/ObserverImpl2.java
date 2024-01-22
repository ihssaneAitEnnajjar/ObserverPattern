package org.sid;


public class ObserverImpl2 implements Observer{
    private int counter;
    @Override
    public void update(int state) {
//        int state=((ObservableImpl)observable).getState();
        if((state%2)==0) ++counter;

        System.out.println("Observer impelementation 2***********************************");
        System.out.println("Nouvelle mise a jour : state ="+state);
        System.out.println("Résultat de calcul :"+((state%2)==0?"Pair":"impaire"));
        System.out.println("Le compteur est  :"+counter);
        System.out.println("/*****************************************");

    }
}
