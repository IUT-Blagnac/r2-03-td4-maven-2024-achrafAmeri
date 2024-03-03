
/**
 * @author ameri
 *
 */
public class Pile {
	private int taillePile = 10; //taille de la pile
	private int[] elem = new int[taillePile]; //elements 
	private int sommet = 0; //indice de l'element le plus haut de la pile
	
	public void push(int i) {
		this.elem[sommet] = i;
		sommet++;
	}

	public int pull() {
		sommet--;
		int val = this.elem[sommet]; 
		return val;
	}

}
