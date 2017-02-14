package com.sogou.qadev.service.cynthia.bean;

import java.sql.Timestamp;

/**
 * @author kin
 * @version $: v 0.1 2017/2/14 Exp $$
 */
public interface Project {
    public long getProjectId();

    public void setProjectId(long projectId);

    public String getProjectTitle() ;

    public void setProjectTitle(String projectTitle);

    public String getCompany() ;

    public void setCompany(String company);

    public Timestamp getBeginTime() ;

    public void setBeginTime(Timestamp beginTime) ;

    public Timestamp getEndTime() ;

    public void setEndTime(Timestamp endTime);

    public long getDpPrice() ;

    public void setDpPrice(long dpPrice);

    public long getCodingPrice() ;
    public void setCodingPrice(long codingPrice) ;

    public long getAnalyticsPrice() ;

    public void setAnalyticsPrice(long analyticsPrice) ;

    public long getDeduct() ;

    public void setDeduct(long deduct) ;

    public String getProjectLeader() ;

    public void setProjectLeader(String projectLeader);

    public String getCodingLeader() ;

    public void setCodingLeader(String codingLeader);
    public String getBillStatus();

    public void setBillStatus(String billStatus);

    public String getPaymentStatus() ;
    public void setPaymentStatus(String paymentStatus);
}
