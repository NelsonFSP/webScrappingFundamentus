package webScrappingFundamentus;



import java.math.BigDecimal;
import java.util.Arrays;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

public class Main {

	public static void main(String args[]) {
		//System.out.println("Tudo ok man");
		String a;
		String b;
		String[] c;
		String []d = new String[21];
		Integer qtdItens;
		Integer x = 0;		
		Movement movement = new Movement();
		final String url = "https://fundamentus.com.br/resultado.php";
		try {
			final Document document = Jsoup.connect(url).get();
			Elements row = document.select("table");
			a = row.text().substring(0, 190);
			b = row.text().substring(191);
			c = b.split(" ");
			BigDecimal decimal = new BigDecimal("100000000");
			//System.out.println(decimal);
			
			qtdItens = c.length;
			for(int i = 0; i < qtdItens/21 ; i++) {
				if (i == 0) {
					x = i;
				}else {
					x = x + 21;
				}
				System.arraycopy(c, x, d, 0, 21);
				
				movement.moveObj(d, x);
			}
			System.out.println( movement.listObj.size());
			for(int i = 0; i < movement.listObj.size(); i++)
			{
			   System.out.println(movement.listObj.get(i).toString());
			}
			
			System.out.println("Fim");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
