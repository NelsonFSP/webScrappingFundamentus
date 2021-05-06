package webScrappingFundamentus;

import java.math.BigDecimal;

public class Papel {
	private String card;
	private BigDecimal cotacao;
	private BigDecimal pl;
	private BigDecimal pvp;
	private BigDecimal psr;
	private BigDecimal divYeld;
	private BigDecimal pAtivo;
	private BigDecimal pCapGiro;
	private BigDecimal pEbit;
	private BigDecimal pAtivCircLiq;
	private BigDecimal evEbit;
	private BigDecimal evEbitda;
	private BigDecimal mrgEbit;
	private BigDecimal mrLiq;
	private BigDecimal liqCorr;
	private BigDecimal roic;
	private BigDecimal roe;
	private BigDecimal liq2Meses;
	private BigDecimal patriLiq;
	private BigDecimal divBrutPatr;
	private BigDecimal cresc5a;
	
	public Papel() {
		
	}
	
	
	
	public Papel(String card, BigDecimal cotacao, BigDecimal pl, BigDecimal pvp, BigDecimal psr, BigDecimal divYeld, BigDecimal pAtivo,
			BigDecimal pCapGiro, BigDecimal pEbit, BigDecimal pAtivCircLiq, BigDecimal evEbit, BigDecimal evEbitda, BigDecimal mrgEbit, BigDecimal mrLiq, 
			BigDecimal liqCorr, BigDecimal roic, BigDecimal roe, BigDecimal liq2m, BigDecimal patriLiq, BigDecimal divBrutPatr,
			BigDecimal cresc5a) {
		
		this.card = card;
		this.cotacao = cotacao;
		this.pl = pl;
		this.pvp = pvp;
		this.psr = psr;
		this.divYeld = divYeld;
		this.pAtivo = pAtivo;
		this.pCapGiro = pCapGiro;
		this.pEbit = pEbit;
		this.pAtivCircLiq = pAtivCircLiq;
		this.evEbit = evEbit;
		this.evEbitda = evEbitda;
		this.mrgEbit = mrgEbit;
		this.mrLiq = mrLiq;
		this.liqCorr = liqCorr;
		this.roic = roic;
		this.roe = roe;
		this.liq2Meses = liq2m;
		this.patriLiq = patriLiq;
		this.divBrutPatr = divBrutPatr;
		this.cresc5a = cresc5a;
	}



	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public BigDecimal getCotacao() {
		return cotacao;
	}
	public void setCotacao(BigDecimal cotacao) {
		this.cotacao = cotacao;
	}
	public BigDecimal getPl() {
		return pl;
	}
	public void setPl(BigDecimal pl) {
		this.pl = pl;
	}
	public BigDecimal getPvp() {
		return pvp;
	}
	public void setPvp(BigDecimal pvp) {
		this.pvp = pvp;
	}
	public BigDecimal getPsr() {
		return psr;
	}
	public void setPsr(BigDecimal psr) {
		this.psr = psr;
	}
	public BigDecimal getDivYeld() {
		return divYeld;
	}
	public void setDivYeld(BigDecimal divYeld) {
		this.divYeld = divYeld;
	}
	public BigDecimal getpAtivo() {
		return pAtivo;
	}
	public void setpAtivo(BigDecimal pAtivo) {
		this.pAtivo = pAtivo;
	}
	public BigDecimal getpCapGiro() {
		return pCapGiro;
	}
	public void setpCapGiro(BigDecimal pCapGiro) {
		this.pCapGiro = pCapGiro;
	}
	public BigDecimal getpEbit() {
		return pEbit;
	}
	public void setpEbit(BigDecimal pEbit) {
		this.pEbit = pEbit;
	}
	public BigDecimal getpAtivCircLiq() {
		return pAtivCircLiq;
	}
	public void setpAtivCircLiq(BigDecimal pAtivCircLiq) {
		this.pAtivCircLiq = pAtivCircLiq;
	}
	public BigDecimal getEvEbit() {
		return evEbit;
	}
	public void setEvEbit(BigDecimal evEbit) {
		this.evEbit = evEbit;
	}
	public BigDecimal getEvEbitda() {
		return evEbitda;
	}
	public void setEvEbitda(BigDecimal evEbitda) {
		this.evEbitda = evEbitda;
	}
	public BigDecimal getMrgEbit() {
		return mrgEbit;
	}
	public void setMrgEbit(BigDecimal mrgEbit) {
		this.mrgEbit = mrgEbit;
	}
	public BigDecimal getLiqCorr() {
		return liqCorr;
	}
	public void setLiqCorr(BigDecimal liqCorr) {
		this.liqCorr = liqCorr;
	}
	public BigDecimal getRoic() {
		return roic;
	}
	public void setRoic(BigDecimal roic) {
		this.roic = roic;
	}
	public BigDecimal getRoe() {
		return roe;
	}
	public void setRoe(BigDecimal roe) {
		this.roe = roe;
	}
	public BigDecimal getLiq2M() {
		return liq2Meses;
	}
	public void setLiq2M(BigDecimal liq2m) {
		liq2Meses = liq2m;
	}
	public BigDecimal getPatriLiq() {
		return patriLiq;
	}
	public void setPatriLiq(BigDecimal patriLiq) {
		this.patriLiq = patriLiq;
	}
	public BigDecimal getDivBrutPatr() {
		return divBrutPatr;
	}
	public void setDivBrutPatr(BigDecimal divBrutPatr) {
		this.divBrutPatr = divBrutPatr;
	}
	public BigDecimal getCresc5a() {
		return cresc5a;
	}
	public void setCresc5a(BigDecimal cresc5a) {
		this.cresc5a = cresc5a;
	}



	public BigDecimal getMrLiq() {
		return mrLiq;
	}



	public void setMrLiq(BigDecimal mrLiq) {
		this.mrLiq = mrLiq;
	}



	@Override
	public String toString() {
		return "Papel [card=" + card + ", cotacao=" + cotacao + ", pl=" + pl + ", pvp=" + pvp + ", psr=" + psr
				+ ", divYeld=" + divYeld + ", pAtivo=" + pAtivo + ", pCapGiro=" + pCapGiro + ", pEbit=" + pEbit
				+ ", pAtivCircLiq=" + pAtivCircLiq + ", evEbit=" + evEbit + ", evEbitda=" + evEbitda + ", mrgEbit="
				+ mrgEbit + ", mrLiq=" + mrLiq + ", liqCorr=" + liqCorr + ", roic=" + roic + ", roe=" + roe
				+ ", liq2Meses=" + liq2Meses + ", patriLiq=" + patriLiq + ", divBrutPatr=" + divBrutPatr + ", cresc5a="
				+ cresc5a + "]";
	}
	
	
	
}
