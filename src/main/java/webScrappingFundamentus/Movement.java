package webScrappingFundamentus;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Movement {

	public List <Papel> listObj = new ArrayList<Papel>();
	
	public void moveObj(String[]orig, Integer position) throws ParseException {
		Papel papel = new Papel();
		papel.setCard(orig[0].toString());
		papel.setCotacao(new BigDecimal(orig[1].toString().replace(".", "").replace(",", ".")));
		papel.setPl(new BigDecimal(orig[2].toString().replace(".", "").replace(",", ".")));
		papel.setPvp(new BigDecimal(orig[3].toString().replace(".", "").replace(",", ".")));
		papel.setPsr(new BigDecimal(orig[4].toString().replace(".", "").replace(",", ".")));
		papel.setDivYeld(new BigDecimal(orig[5].substring(1,orig[5].length()-1).replace(",", ".")));
		papel.setpAtivo(new BigDecimal(orig[6].toString().replace(".", "").replace(",", ".")));
		papel.setpCapGiro(new BigDecimal(orig[7].toString().replace(".", "").replace(",", ".")));
		papel.setpEbit(new BigDecimal(orig[8].toString().replace(".", "").replace(",", ".")));
		papel.setpAtivCircLiq(new BigDecimal(orig[9].toString().replace(".", "").replace(",", ".")));
		papel.setEvEbit(new BigDecimal(orig[10].toString().replace(".", "").replace(",", ".")));
		papel.setEvEbitda(new BigDecimal(orig[11].toString().replace(".", "").replace(",", ".")));
		papel.setMrgEbit(new BigDecimal(orig[12].substring(1,orig[12].length()-1).replace(".", "").replace(",", ".")));
		papel.setMrLiq(new BigDecimal(orig[13].substring(1,orig[13].length()-1).replace(".", "").replace(",", ".")));
		papel.setLiqCorr(new BigDecimal(orig[14].toString().replace(".", "").replace(",", ".")));
		papel.setRoic(new BigDecimal(orig[15].substring(1,orig[15].length()-1).replace(".", "").replace(",", ".")));
		papel.setRoe(new BigDecimal(orig[16].substring(1,orig[16].length()-1).replace(".", "").replace(",", ".")));
		papel.setLiq2M(new BigDecimal(orig[17].toString().replace(".", "").replace(",", ".")));
		papel.setPatriLiq(new BigDecimal(orig[18].toString().replace(".", "").replace(",", ".")));
		papel.setDivBrutPatr(new BigDecimal(orig[19].toString().replace(".", "").replace(",", ".")));
		papel.setCresc5a(new BigDecimal(orig[20].substring(1,orig[20].length()-1).replace(".", "").replace(",", ".")));
		listObj.add(papel);
	}

}
