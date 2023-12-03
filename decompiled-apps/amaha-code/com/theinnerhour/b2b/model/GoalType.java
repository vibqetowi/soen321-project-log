package com.theinnerhour.b2b.model;

import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.Utils;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import tf.b;
/* loaded from: classes2.dex */
public class GoalType {
    @b("_id")
    private String GoalId;
    @b(SessionManager.KEY_NAME)
    private String GoalName;
    @b("popup_desc")
    private String Text1;
    @b("popup_goal")
    private String Text2;
    private String Text3;
    private String activityText;
    @b("program_ids")
    private List<String> courseList;
    private String cta;
    @b("dashboard_goal")
    private String dashboardTxt;
    private Date endDate;
    private ArrayList<String> linkedGoals;
    @b("is_negative")
    private boolean negative;
    private int offline_icon;
    private Date startDate;
    private List<String> subtype;
    @b(Constants.GOAL_TYPE)
    private String type;

    public GoalType() {
        this.subtype = new ArrayList();
        this.courseList = new ArrayList();
        this.linkedGoals = new ArrayList<>();
    }

    public String getActivityText() {
        return this.activityText;
    }

    public List<String> getCourseList() {
        return this.courseList;
    }

    public String getCta() {
        return this.cta;
    }

    public String getDashboardTxt() {
        return this.dashboardTxt;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public String getGoalId() {
        return this.GoalId;
    }

    public String getGoalName() {
        return this.GoalName;
    }

    public ArrayList<String> getLinkedGoals() {
        return this.linkedGoals;
    }

    public int getOffline_icon() {
        return this.offline_icon;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public List<String> getSubtype() {
        return this.subtype;
    }

    public String getText1() {
        return this.Text1;
    }

    public String getText2() {
        return this.Text2;
    }

    public String getText3() {
        return this.Text3;
    }

    public String getType() {
        return this.type;
    }

    public boolean isNegative() {
        return this.negative;
    }

    public void setActivityText(String str) {
        this.activityText = str;
    }

    public void setCourseList(List<String> list) {
        this.courseList = list;
    }

    public void setCta(String str) {
        this.cta = str;
    }

    public void setDashboardTxt(String str) {
        this.dashboardTxt = str;
    }

    public void setEndDate(Date date) {
        this.endDate = date;
    }

    public void setGoalId(String str) {
        this.GoalId = str;
    }

    public void setGoalName(String str) {
        this.GoalName = str;
    }

    public void setLinkedGoals(ArrayList<String> arrayList) {
        this.linkedGoals = arrayList;
    }

    public void setNegative(boolean z10) {
        this.negative = z10;
    }

    public void setOffline_icon(int i6) {
        this.offline_icon = i6;
    }

    public void setStartDate(Date date) {
        this.startDate = date;
    }

    public void setSubtype(List<String> list) {
        this.subtype = list;
    }

    public void setText1(String str) {
        this.Text1 = str;
    }

    public void setText2(String str) {
        this.Text2 = str;
    }

    public void setText3(String str) {
        this.Text3 = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public GoalType(String str, boolean z10, String str2, String str3, String str4, String str5, String str6, List<String> list, int i6, String str7, String str8) {
        this.subtype = new ArrayList();
        this.courseList = new ArrayList();
        this.linkedGoals = new ArrayList<>();
        this.type = str;
        this.negative = z10;
        this.GoalId = str2;
        this.GoalName = str3;
        this.dashboardTxt = str4;
        this.Text1 = str5;
        this.Text2 = str6;
        this.courseList = list;
        this.startDate = Utils.INSTANCE.getTodayCalendar().getTime();
        this.offline_icon = i6;
        this.activityText = str7;
        this.Text3 = str8;
    }
}
