package com.sogou.qadev.service.cynthia.dao;

import com.sogou.qadev.service.cynthia.bean.Project;
import com.sogou.qadev.service.cynthia.bean.impl.ProjectImpl;
import com.sogou.qadev.service.cynthia.service.DbPoolConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author kin
 * @version $: v 0.1 2017/2/14 Exp $$
 */
public class ProjectZiponAccessSessionMysql {
    public ProjectZiponAccessSessionMysql() {

    }
    public Project queryProjectByUserName(String userName)
    {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try
        {
            conn = DbPoolConnection.getInstance().getReadConnection();
            String sql = "select * from project_zipon where  project_leader= ?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, userName);
            rs = pstm.executeQuery();
            if(rs.next())
            {
                Project project = new ProjectImpl();
                project.setProjectId(rs.getInt("project_id"));
                project.setProjectTitle(rs.getString("project_title"));
                project.setCompany(rs.getString("company"));
                project.setBeginTime(rs.getTimestamp("begin_time"));
                project.setEndTime(rs.getTimestamp("end_time"));
                project.setDpPrice(rs.getLong("dp_price"));
                project.setCodingPrice(rs.getLong("coding_price"));
                project.setAnalyticsPrice(rs.getLong("analytics_price"));
                project.setDeduct(rs.getLong("deduct"));
                project.setProjectLeader(rs.getString("project_leader"));
                project.setCodingLeader(rs.getString("coding_leader"));
                project.setBillStatus(rs.getString("bill_status"));
                project.setPaymentStatus(rs.getString("payment_status"));

                return project;
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }finally
        {
            DbPoolConnection.getInstance().closeAll(rs, pstm, conn);
        }
        return null;
    }
}
