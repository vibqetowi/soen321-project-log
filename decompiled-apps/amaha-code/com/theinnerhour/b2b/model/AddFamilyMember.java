package com.theinnerhour.b2b.model;

import com.theinnerhour.b2b.utils.SessionManager;
import tf.b;
/* loaded from: classes2.dex */
public class AddFamilyMember {
    private String MobileNo;
    private String memberName;
    @b("relation")
    private String relation;
    @b(SessionManager.KEY_UID)
    private String uid;
    private String uuid;

    public AddFamilyMember(String str, String str2, String str3, String str4) {
        this.memberName = str;
        this.relation = str2;
        this.uid = str3;
        this.MobileNo = str4;
    }

    public String getEmailId() {
        return this.uid;
    }

    public String getMemberName() {
        return this.memberName;
    }

    public String getMobileNo() {
        return this.MobileNo;
    }

    public String getRelation() {
        return this.relation;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setEmailId(String str) {
        this.uid = str;
    }

    public void setMemberName(String str) {
        this.memberName = str;
    }

    public void setMobileNo(String str) {
        this.MobileNo = str;
    }

    public void setRelation(String str) {
        this.relation = str;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public AddFamilyMember(String str, String str2) {
        this.relation = str;
        this.uid = str2;
    }
}
