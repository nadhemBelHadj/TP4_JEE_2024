package test;

import java.util.List;
import dao.ProduitDaoImpl;
import metier.entities.Produit;

public class TestMetier {

	public static void main(String[] args) {
			ProduitDaoImpl pdao= new ProduitDaoImpl();
			Produit prod= pdao.save(new Produit("iphone 8 plus",2800));
			System.out.println(prod);
			
			 List<Produit> prods =pdao.produitsParMC("ip");
			 for (Produit p : prods)
				 System.out.println(p);
			
		}

}

