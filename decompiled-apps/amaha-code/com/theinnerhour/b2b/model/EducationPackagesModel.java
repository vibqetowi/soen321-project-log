package com.theinnerhour.b2b.model;

import java.io.Serializable;
/* loaded from: classes2.dex */
public class EducationPackagesModel implements Serializable {
    private String degree;
    private String major;

    public String getDegree() {
        return this.degree;
    }

    public String getMajor() {
        return this.major;
    }

    public void setDegree(String str) {
        this.degree = str;
    }

    public void setMajor(String str) {
        this.major = str;
    }
}
