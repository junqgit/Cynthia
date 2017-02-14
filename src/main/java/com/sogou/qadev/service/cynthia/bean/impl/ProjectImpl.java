package com.sogou.qadev.service.cynthia.bean.impl;

import com.sogou.qadev.service.cynthia.bean.Project;

import java.sql.Timestamp;


/**
 * @author kin
 * @version $: v 0.1 2017/2/14 Exp $$
 */
public class ProjectImpl implements Project {

    private long projectId;
    private String projectTitle;
    private String company;
    private Timestamp beginTime;
    private Timestamp endTime;
    private long dpPrice;
    private long codingPrice;
    private long analyticsPrice;
    private long deduct;
    private String projectLeader;
    private String codingLeader;
    private String billStatus;
    private String paymentStatus;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"projectId\":")
                .append(projectId);
        sb.append(",\"projectTitle\":\"")
                .append(projectTitle).append('\"');
        sb.append(",\"company\":\"")
                .append(company).append('\"');
        sb.append(",\"beginTime\":\"")
                .append(beginTime).append('\"');
        sb.append(",\"endTime\":\"")
                .append(endTime).append('\"');
        sb.append(",\"dpPrice\":")
                .append(dpPrice);
        sb.append(",\"codingPrice\":")
                .append(codingPrice);
        sb.append(",\"analyticsPrice\":")
                .append(analyticsPrice);
        sb.append(",\"deduct\":")
                .append(deduct);
        sb.append(",\"projectLeader\":\"")
                .append(projectLeader).append('\"');
        sb.append(",\"codingLeader\":\"")
                .append(codingLeader).append('\"');
        sb.append(",\"billStatus\":\"")
                .append(billStatus).append('\"');
        sb.append(",\"paymentStatus\":\"")
                .append(paymentStatus).append('\"');
        sb.append('}');
        return sb.toString();
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Timestamp getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Timestamp beginTime) {
        this.beginTime = beginTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public long getDpPrice() {
        return dpPrice;
    }

    public void setDpPrice(long dpPrice) {
        this.dpPrice = dpPrice;
    }

    public long getCodingPrice() {
        return codingPrice;
    }

    public void setCodingPrice(long codingPrice) {
        this.codingPrice = codingPrice;
    }

    public long getAnalyticsPrice() {
        return analyticsPrice;
    }

    public void setAnalyticsPrice(long analyticsPrice) {
        this.analyticsPrice = analyticsPrice;
    }

    public long getDeduct() {
        return deduct;
    }

    public void setDeduct(long deduct) {
        this.deduct = deduct;
    }

    public String getProjectLeader() {
        return projectLeader;
    }

    public void setProjectLeader(String projectLeader) {
        this.projectLeader = projectLeader;
    }

    public String getCodingLeader() {
        return codingLeader;
    }

    public void setCodingLeader(String codingLeader) {
        this.codingLeader = codingLeader;
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
