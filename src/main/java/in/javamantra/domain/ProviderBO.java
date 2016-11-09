package in.javamantra.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_PROV")
public class ProviderBO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PROV_ID")
	private Long id;

	@Column(name = "CORP_ENT_CD", nullable = false, length = 3)
	private String corpEnt;

	@Column(name = "PROV_CLS_CD", nullable = false, length = 1)
	private String provCls;

	private Date dob;

	@Column(name = "GNDR_CD", nullable = false, length = 1)
	private String gender;

	@Column(name = "ETHINICITY_CD", nullable = false, length = 3)
	private String ethinicity;

	@Column(name = "INDV_DEA_NBR", nullable = false, length = 9)
	private String indvDEA;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCorpEnt() {
		return corpEnt;
	}

	public void setCorpEnt(String corpEnt) {
		this.corpEnt = corpEnt;
	}

	public String getProvCls() {
		return provCls;
	}

	public void setProvCls(String provCls) {
		this.provCls = provCls;
	}

	public Date getdob() {
		return dob;
	}

	public void setdob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEthinicity() {
		return ethinicity;
	}

	public void setEthinicity(String ethinicity) {
		this.ethinicity = ethinicity;
	}

	public String getIndvDEA() {
		return indvDEA;
	}

	public void setIndvDEA(String indvDEA) {
		this.indvDEA = indvDEA;
	}

}
