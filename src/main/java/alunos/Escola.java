package alunos;

import javax.persistence.Id;

public class Escola {

	@Id
	int cdEscola;
	String dsEscola;
	String dsEscolaReduzida;
	String cepOrg;
	String endOrg;
	String numEndereco;
	String baiOrg;
	String ComplementoEndereco;
	String ZonaResidencia;
	String tel1Org;
	String tel2Org;
	String Email;
	String Organizacao_Escola;
	String Dependencia_Adm;
	String Turnos_Oferecido;
	String cnpj;
	String atoconst;
	String livrofolha;
	String regmec;
	String dtregmec;
	String entidademantenedora;
	String cpf_diretor;
	String DiretorAtual;
	String DiretorAtualTratamento;
	String Matricula_PortariaDiret;
	String EMAILDIRETOR;
	String CoordenadorAtual;
	String CoordenadorAtualTratamento;
	String Matricula_PortariaCoord;
	String SecretariaAtual;
	String SecretariaAtualTratamento;
	String Matricula_PortariaSecret;
	String GestorAtual;
	String GestorAtualTratamento;
	String Matricula_PortariaGestor;
	
	
	public int getCdEscola() {
		return cdEscola;
	}
	public void setCdEscola(int cdEscola) {
		this.cdEscola = cdEscola;
	}
	public String getDsEscola() {
		return dsEscola;
	}
	public void setDsEscola(String dsEscola) {
		this.dsEscola = dsEscola;
	}
	public String getDsEscolaReduzida() {
		return dsEscolaReduzida;
	}
	public void setDsEscolaReduzida(String dsEscolaReduzida) {
		this.dsEscolaReduzida = dsEscolaReduzida;
	}
	public String getCepOrg() {
		return cepOrg;
	}
	public void setCepOrg(String cepOrg) {
		this.cepOrg = cepOrg;
	}
	public String getEndOrg() {
		return endOrg;
	}
	public void setEndOrg(String endOrg) {
		this.endOrg = endOrg;
	}
	public String getNumEndereco() {
		return numEndereco;
	}
	public void setNumEndereco(String numEndereco) {
		this.numEndereco = numEndereco;
	}
	public String getBaiOrg() {
		return baiOrg;
	}
	public void setBaiOrg(String baiOrg) {
		this.baiOrg = baiOrg;
	}
	public String getComplementoEndereco() {
		return ComplementoEndereco;
	}
	public void setComplementoEndereco(String complementoEndereco) {
		ComplementoEndereco = complementoEndereco;
	}
	public String getZonaResidencia() {
		return ZonaResidencia;
	}
	public void setZonaResidencia(String zonaResidencia) {
		ZonaResidencia = zonaResidencia;
	}
	public String getTel1Org() {
		return tel1Org;
	}
	public void setTel1Org(String tel1Org) {
		this.tel1Org = tel1Org;
	}
	public String getTel2Org() {
		return tel2Org;
	}
	public void setTel2Org(String tel2Org) {
		this.tel2Org = tel2Org;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getOrganizacao_Escola() {
		return Organizacao_Escola;
	}
	public void setOrganizacao_Escola(String organizacao_Escola) {
		Organizacao_Escola = organizacao_Escola;
	}
	public String getDependencia_Adm() {
		return Dependencia_Adm;
	}
	public void setDependencia_Adm(String dependencia_Adm) {
		Dependencia_Adm = dependencia_Adm;
	}
	public String getTurnos_Oferecido() {
		return Turnos_Oferecido;
	}
	public void setTurnos_Oferecido(String turnos_Oferecido) {
		Turnos_Oferecido = turnos_Oferecido;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getAtoconst() {
		return atoconst;
	}
	public void setAtoconst(String atoconst) {
		this.atoconst = atoconst;
	}
	public String getLivrofolha() {
		return livrofolha;
	}
	public void setLivrofolha(String livrofolha) {
		this.livrofolha = livrofolha;
	}
	public String getRegmec() {
		return regmec;
	}
	public void setRegmec(String regmec) {
		this.regmec = regmec;
	}
	public String getDtregmec() {
		return dtregmec;
	}
	public void setDtregmec(String dtregmec) {
		this.dtregmec = dtregmec;
	}
	public String getEntidademantenedora() {
		return entidademantenedora;
	}
	public void setEntidademantenedora(String entidademantenedora) {
		this.entidademantenedora = entidademantenedora;
	}
	public String getCpf_diretor() {
		return cpf_diretor;
	}
	public void setCpf_diretor(String cpf_diretor) {
		this.cpf_diretor = cpf_diretor;
	}
	public String getDiretorAtual() {
		return DiretorAtual;
	}
	public void setDiretorAtual(String diretorAtual) {
		DiretorAtual = diretorAtual;
	}
	public String getDiretorAtualTratamento() {
		return DiretorAtualTratamento;
	}
	public void setDiretorAtualTratamento(String diretorAtualTratamento) {
		DiretorAtualTratamento = diretorAtualTratamento;
	}
	public String getMatricula_PortariaDiret() {
		return Matricula_PortariaDiret;
	}
	public void setMatricula_PortariaDiret(String matricula_PortariaDiret) {
		Matricula_PortariaDiret = matricula_PortariaDiret;
	}
	public String getEMAILDIRETOR() {
		return EMAILDIRETOR;
	}
	public void setEMAILDIRETOR(String eMAILDIRETOR) {
		EMAILDIRETOR = eMAILDIRETOR;
	}
	public String getCoordenadorAtual() {
		return CoordenadorAtual;
	}
	public void setCoordenadorAtual(String coordenadorAtual) {
		CoordenadorAtual = coordenadorAtual;
	}
	public String getCoordenadorAtualTratamento() {
		return CoordenadorAtualTratamento;
	}
	public void setCoordenadorAtualTratamento(String coordenadorAtualTratamento) {
		CoordenadorAtualTratamento = coordenadorAtualTratamento;
	}
	public String getMatricula_PortariaCoord() {
		return Matricula_PortariaCoord;
	}
	public void setMatricula_PortariaCoord(String matricula_PortariaCoord) {
		Matricula_PortariaCoord = matricula_PortariaCoord;
	}
	public String getSecretariaAtual() {
		return SecretariaAtual;
	}
	public void setSecretariaAtual(String secretariaAtual) {
		SecretariaAtual = secretariaAtual;
	}
	public String getSecretariaAtualTratamento() {
		return SecretariaAtualTratamento;
	}
	public void setSecretariaAtualTratamento(String secretariaAtualTratamento) {
		SecretariaAtualTratamento = secretariaAtualTratamento;
	}
	public String getMatricula_PortariaSecret() {
		return Matricula_PortariaSecret;
	}
	public void setMatricula_PortariaSecret(String matricula_PortariaSecret) {
		Matricula_PortariaSecret = matricula_PortariaSecret;
	}
	public String getGestorAtual() {
		return GestorAtual;
	}
	public void setGestorAtual(String gestorAtual) {
		GestorAtual = gestorAtual;
	}
	public String getGestorAtualTratamento() {
		return GestorAtualTratamento;
	}
	public void setGestorAtualTratamento(String gestorAtualTratamento) {
		GestorAtualTratamento = gestorAtualTratamento;
	}
	public String getMatricula_PortariaGestor() {
		return Matricula_PortariaGestor;
	}
	public void setMatricula_PortariaGestor(String matricula_PortariaGestor) {
		Matricula_PortariaGestor = matricula_PortariaGestor;
	}
	
	
}
