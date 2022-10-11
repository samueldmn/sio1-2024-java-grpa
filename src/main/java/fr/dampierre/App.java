package fr.dampierre;

import java.util.Random;
import java.util.Scanner;
import javax.swing.text.AbstractDocument.LeafElement;

public class App {

  public static void main(String[] args) {

    Random generateur = new Random();
    int laCase = 0;

    // boolean gagne = false;
    while (laCase != 20) {
      laCase = 0;
      for (int i = 1; i <= 5; i++) {
        // lancer le dé
        int lancer = generateur.nextInt(6) + 1;
        System.out.println("Vous avez fait " + lancer);
        // avancer le pion d'autant de cases
        laCase = laCase + lancer;
        System.out.println("Vous êtes à la case " + laCase);
      }

      if (laCase == 20) {
        System.out.println("Vous avez gagné !");
        // gagne = true;
      } else {
        System.out.println("Vous avez perdu !");
      }
    }
  }

  // public static void main(String[] args) {
  // System.out.print("Entrez le nombre d'heures travaillées : ");
  // Scanner clavier = new Scanner(System.in);
  // int nbHeures = clavier.nextInt();
  // double tauxHoraire = 15.50;

  // while (nbHeures > 42 || nbHeures < 0) {
  // System.out.println("Vous devez donner un nombre entre 0 et 42 svp : ");
  // nbHeures = clavier.nextInt();
  // }

  // double salaire = tauxHoraire * nbHeures;
  // System.out.println("Salaire : " + salaire);
  // }

  // public static void main(String[] args) {

  // int salaire = 400;
  // int quota = 10;
  // int prime = 250;

  // Scanner clavier = new Scanner(System.in);
  // System.out.print("Entrez le nombre de ventes de la semaine : ");
  // int nbVentesSemaine = clavier.nextInt();
  // clavier.close();

  // if (nbVentesSemaine >= quota) {
  // salaire = salaire + prime;
  // System.out.println("Félicitations !");
  // } else {
  // int nbVentesManquantes = quota - nbVentesSemaine;
  // System.out.println("Il vous manque " + nbVentesManquantes);
  // }

  // System.out.println("Votre salaire est de : " + salaire);
  // }

  // public static void main(String[] args) {

  // Scanner clavier = new Scanner(System.in);
  // System.out.print("Entrez les heures : ");
  // int heures = clavier.nextInt();
  // System.out.print("Entrez les minutes : ");
  // int minutes = clavier.nextInt();
  // System.out.print("Entrez les secondes : ");
  // int secondes = clavier.nextInt();
  // clavier.close();

  // int nbSecondesDepuisMinuit = heures * 60 * 60 + minutes * 60 + secondes;

  // System.out.println("Le nombre de secondes passées depuis est : " + nbSecondesDepuisMinuit);
  // }

  // public static void main(String[] args) {

  // int heures = 12;
  // int minutes = 34;
  // int secondes = 56;

  // int nbSecondesDepuisMinuit = heures * 60 * 60 + minutes * 60 + secondes;

  // System.out.println("Le nombre de secondes passées depuis est : " + nbSecondesDepuisMinuit);
  // }



  // public static void main(String[] args) {
  // Scanner clavier = new Scanner(System.in);
  // System.out.print("Entrez un premier mot : ");
  // String mot1 = clavier.nextLine();
  // System.out.print("Entrez un nombre : ");
  // int nombre = clavier.nextInt();
  // clavier.nextLine();
  // System.out.print("Entrez un deuxième mot : ");
  // String mot2 = clavier.nextLine();
  // System.out.print("Entrez un adjectif : ");
  // String adjectif = clavier.nextLine();

  // clavier.close();

  // String phrase = "Il était une fois un " + mot1 + " qui avait " + nombre + " " + mot2
  // + ". Cela le rendait très " + adjectif + ".";

  // System.out.println(phrase);
  // }

  // public static void main(String[] args) {
  // System.out.println("Bonjour !");

  // // Récupérer le nombre d’heures travaillées

  // Scanner clavier = new Scanner(System.in);
  // System.out.print("Entrez le nombre d'heures travaillées : ");
  // int heuresTravaillees = clavier.nextInt();

  // // Récupérer le taux horaire
  // System.out.print("Entrez le taux horaire : ");
  // double tauxHoraire = clavier.nextDouble();

  // // commentaire bidon

  // clavier.close();

  // // Multiplier le nombre d’heures par le taux horaire
  // double salaireBrut = heuresTravaillees * tauxHoraire;

  // // Afficher le résultat
  // // System.out.print("Le salaire brut est de : ");
  // // System.out.println(salaireBrut);
  // System.out.println("Le salaire brut est de : " + salaireBrut);
  // }

}
