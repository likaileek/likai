package com.sample.bean;

import java.io.Serializable;

/**
 * Created by Skeyedu on 2017/1/22.
 */
public class BlockBean implements Serializable{

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column block.block_no
     *
     * @mbggenerated
     */
    private String blockNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column block.block_name
     *
     * @mbggenerated
     */
    private String blockName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column block.parent_block
     *
     * @mbggenerated
     */
    private String parentBlock;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column block.remarks
     *
     * @mbggenerated
     */
    private String remarks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column block.tenant_no
     *
     * @mbggenerated
     */
    private String tenantNo;

    public String getBlockNo() {
        return blockNo;
    }

    public void setBlockNo(String blockNo) {
        this.blockNo = blockNo;
    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public String getParentBlock() {
        return parentBlock;
    }

    public void setParentBlock(String parentBlock) {
        this.parentBlock = parentBlock;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getTenantNo() {
        return tenantNo;
    }

    public void setTenantNo(String tenantNo) {
        this.tenantNo = tenantNo;
    }
}