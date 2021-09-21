package com.company;

public class Cake {
    private final double ANTAL_PERSONER_OPRINDELIGT = 8;

    public Cake(double antalPersoner) {
        this.antalPersoner = antalPersoner;
    }

    public Cake() {
        antalPersoner = ANTAL_PERSONER_OPRINDELIGT;
    }

    private double antalPersoner;

    // ingredienser
    private double antalÆg = 4;
    private double gramSukker = 350;
    private double gramSmørKage = 60;
    private double dlSødmælk = 2;
    private double gramHvedemel = 300;
    private double tskBagepulver = 2;
    private double tskVaniljesukker = 2;
    private double gramSmørTopping = 150;
    private double gramKokosmel = 100;
    private double gramBrunFarin = 250;
    private double spskSødmælk = 3;

    // vægt af ingredienser
    private double ægVægtPer = 60;
    private double sukkerVægt1Gram = 1;
    private double smørVægt = 1;
    private double dlSødmælkVægt = 100;
    private double hvedemelVægt= 1;
    private double tskBagepulverVægt = 5;
    private double tskVaniljesukkerVægt = 3;
    private double kokosmelVægt = 1;
    private double brunfarinVægt = 1;
    private double spskSødmælkVægt = 15;

    // variabler for ingrediensernes energiindhold i kcal per enhed
    private double energiÆg = 93.06;
    private double energiSukker = 3.867;
    private double energiSmør = 7.168;
    private double energiDlSødmælk = 12.8;
    private double energiHvedemel = 3.64;
    private double energiBagepulver = 2.655;
    private double energiVaniljesukker = 11.7;
    private double energiKokosmel = 6.85;
    private double energiBrunfarin = 3.80;
    private double energiSpskSødmælk = 19.2;

    public void setAntalPersoner(double antalPersoner) {
        this.antalPersoner = antalPersoner;
    }

    public double getAntalPersoner() {
        return antalPersoner;
    }


    public double samletVægt() {
        double totalVægtIngredienser = ((ægVægtPer * antalÆg) + (sukkerVægt1Gram * gramSukker)
                + (smørVægt * gramSmørKage) + (smørVægt * gramSmørTopping) + (dlSødmælkVægt * dlSødmælk) +
                (spskSødmælkVægt * spskSødmælk) + (hvedemelVægt * gramHvedemel) + (tskBagepulverVægt * tskBagepulver) +
                (tskVaniljesukkerVægt * tskVaniljesukker) + (kokosmelVægt * gramKokosmel) +
                (brunfarinVægt * gramBrunFarin)) * (antalPersoner / ANTAL_PERSONER_OPRINDELIGT);
        return totalVægtIngredienser;
    }

    public double bagtVægt() {
        return samletVægt() * 0.9;
    }

    public double energiKage() {
        double energiÆgTotal = energiÆg * antalÆg;
        double energiSukkerTotal = energiSukker * gramSukker;
        double energiSmørTotal = energiSmør * (gramSmørKage + gramSmørTopping);
        double energiDlSødmælkTotal = energiDlSødmælk * dlSødmælk;
        double energiHvedemelTotal = energiHvedemel * gramHvedemel;
        double energiBagepulverTotal = energiBagepulver * tskBagepulver;
        double energiVaniljesukkerTotal = energiVaniljesukker * tskVaniljesukker;
        double energiKokosmelTotal = energiKokosmel * gramKokosmel;
        double energiBrunfarinTotal = energiBrunfarin * gramBrunFarin;
        double energiSpskSødmælkTotal = energiSpskSødmælk * spskSødmælk;

        double energiSødmælkTotal = energiDlSødmælkTotal + energiSpskSødmælkTotal;

        double energiKage = energiÆgTotal + energiSukkerTotal + energiSmørTotal + energiSødmælkTotal +
                energiHvedemelTotal + energiBagepulverTotal + energiVaniljesukkerTotal + energiKokosmelTotal +
                energiBrunfarinTotal;
        return energiKage * (antalPersoner / ANTAL_PERSONER_OPRINDELIGT);
    }


    @Override
    public String toString() {
        return "Cake{" +
                "ANTAL_PERSONER_OPRINDELIGT=" + ANTAL_PERSONER_OPRINDELIGT +
                ", antalPersoner=" + antalPersoner +
                ", antalÆg=" + antalÆg * (antalPersoner / ANTAL_PERSONER_OPRINDELIGT) +
                ", gramSukker=" + gramSukker * (antalPersoner / ANTAL_PERSONER_OPRINDELIGT) +
                ",\n gramSmørKage=" + gramSmørKage * (antalPersoner / ANTAL_PERSONER_OPRINDELIGT) +
                ", dlSødmælk=" + dlSødmælk * (antalPersoner / ANTAL_PERSONER_OPRINDELIGT) +
                ", gramHvedemel=" + gramHvedemel * (antalPersoner / ANTAL_PERSONER_OPRINDELIGT) +
                ", tskBagepulver=" + tskBagepulver * (antalPersoner / ANTAL_PERSONER_OPRINDELIGT) +
                ", tskVaniljesukker=" + tskVaniljesukker * (antalPersoner / ANTAL_PERSONER_OPRINDELIGT) +
                ",\n gramSmørTopping=" + gramSmørTopping * (antalPersoner / ANTAL_PERSONER_OPRINDELIGT) +
                ", gramKokosmel=" + gramKokosmel * (antalPersoner / ANTAL_PERSONER_OPRINDELIGT) +
                ", gramBrunFarin=" + gramBrunFarin * (antalPersoner / ANTAL_PERSONER_OPRINDELIGT) +
                ", spskSødmælk=" + spskSødmælk * (antalPersoner / ANTAL_PERSONER_OPRINDELIGT);
    }
}
