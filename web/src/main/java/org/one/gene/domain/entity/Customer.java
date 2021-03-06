package org.one.gene.domain.entity;
// Generated Dec 14, 2014 1:21:34 AM by One Data Tools 1.0.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Customer.
* 
 */
@Entity
@Table(name="customer"
    , uniqueConstraints = @UniqueConstraint(columnNames="code") 
)
public class Customer  implements java.io.Serializable {

    /**
    * 唯一标识id.
    */
    private Integer id;
    /**
    * 客户代码.
    */
    private String code;
    /**
    * 客户姓名.
    */
    private String name;
    /**
    * 负责人姓名.
    */
    private String leaderName;
    /**
    * 机构代码.
    */
    private String comId;
    /**
    * 机构名称.
    */
    private String comName;
    /**
    * 发票抬头.
    */
    private String invoiceTitle;
    /**
    * 结账方式.
    */
    private String payWays;
    /**
    * 客户地址.
    */
    private String address;
    /**
    * 联系电话.
    */
    private String phoneNo;
    /**
    * 邮箱.
    */
    private String email;

    public Customer() {
    }

	
    public Customer(String code, String name) {
        this.code = code;
        this.name = name;
    }
   
    @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="id", unique=true)
    public Integer getId() {
    return this.id;
    }

    public void setId(Integer id) {
    this.id = id;
    }
    
    @Column(name="code", unique=true, length=31)
    public String getCode() {
    return this.code;
    }

    public void setCode(String code) {
    this.code = code;
    }
    
    @Column(name="name", length=127)
    public String getName() {
    return this.name;
    }

    public void setName(String name) {
    this.name = name;
    }
    
    @Column(name="leader_name", length=127)
    public String getLeaderName() {
    return this.leaderName;
    }

    public void setLeaderName(String leaderName) {
    this.leaderName = leaderName;
    }
    
    @Column(name="com_id", length=120)
    public String getComId() {
    return this.comId;
    }

    public void setComId(String comId) {
    this.comId = comId;
    }
    
    @Column(name="com_name", length=120)
    public String getComName() {
    return this.comName;
    }

    public void setComName(String comName) {
    this.comName = comName;
    }
    
    @Column(name="invoice_title", length=120)
    public String getInvoiceTitle() {
    return this.invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
    this.invoiceTitle = invoiceTitle;
    }
    
    @Column(name="pay_ways", length=15)
    public String getPayWays() {
    return this.payWays;
    }

    public void setPayWays(String payWays) {
    this.payWays = payWays;
    }
    
    @Column(name="address")
    public String getAddress() {
    return this.address;
    }

    public void setAddress(String address) {
    this.address = address;
    }
    
    @Column(name="phone_no", length=15)
    public String getPhoneNo() {
    return this.phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
    this.phoneNo = phoneNo;
    }
    
    @Column(name="email", length=63)
    public String getEmail() {
    return this.email;
    }

    public void setEmail(String email) {
    this.email = email;
    }


	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}


