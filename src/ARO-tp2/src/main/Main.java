package main;

import bag.Bag;

public class Main {


    public static void main(String[] args) {
        //lire les fichiers et les convertires en objet utilisable
        Bag bag = new Bag("C:\\Users\\flo-t\\IdeaProjects\\m1-genieLogiciel-ascenseur\\src\\ARO-tp2\\src\\bag\\sac4.txt");
        bag.build();
        //?Trier les objets par taille? par valeur?=>non pas glouton
        Sorte sorte = new Sorte();
        //construire l'arbre
        Bag result= new Bag();
        result = sorte.glouton(bag);

        String resulteString ="[";
        for (int i=0 ; i<result.getAll().size() ; i++){
            resulteString= resulteString+" "+ result.get(i).getValue();
        }
        resulteString= resulteString+" ]";

        System.out.println(resulteString);
        System.out.println(" total value:"+result.getValue());


    }

    public void generationTree(){

    }
}
