package fr.usmb.m1isc.compilation.tp;

public class Noeud {
	public enum TypeNoeud{SEQUENCE,EXPRESSION,EXPR, VAR, INT, OUTPUT, INPUT, NIL};
	public TypeNoeud type;
	public String valeur;
	public Noeud gauche, droite;
	
	public Noeud(TypeNoeud type, String valeur) {
		this.type = type;
		this.valeur = valeur;
		this.gauche = null;
		this.droite = null;
	}
	
	public Noeud(TypeNoeud type, String valeur, Noeud gauche, Noeud droite) {
		this.type = type;
		this.valeur = valeur;
		this.gauche = gauche;
		this.droite = droite;
	}
	
	public String toString() {
        String str = "";
        if (!(this.gauche == null && this.droite == null)) {
            str = "(";
        }

        str += this.valeur;

        if (this.gauche != null) {
            str += " " + this.gauche.toString() + " ";
        }
        if (this.droite != null) {
            str += " " + this.droite.toString() + " ";
        }
        if (!(this.gauche == null && this.droite == null)) {
            str += ")";
        }
        
        return str;
    }
}
