package com.sample.dal.model;

public class EnterpriseKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column enterprise.enterprise_no
     *
     * @mbggenerated
     */
    private String enterpriseNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column enterprise.tenant_no
     *
     * @mbggenerated
     */
    private String tenantNo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column enterprise.enterprise_no
     *
     * @return the value of enterprise.enterprise_no
     *
     * @mbggenerated
     */
    public String getEnterpriseNo() {
        return enterpriseNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column enterprise.enterprise_no
     *
     * @param enterpriseNo the value for enterprise.enterprise_no
     *
     * @mbggenerated
     */
    public void setEnterpriseNo(String enterpriseNo) {
        this.enterpriseNo = enterpriseNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column enterprise.tenant_no
     *
     * @return the value of enterprise.tenant_no
     *
     * @mbggenerated
     */
    public String getTenantNo() {
        return tenantNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column enterprise.tenant_no
     *
     * @param tenantNo the value for enterprise.tenant_no
     *
     * @mbggenerated
     */
    public void setTenantNo(String tenantNo) {
        this.tenantNo = tenantNo;
    }
}