package com.theinnerhour.b2b.model;

import java.io.Serializable;
/* loaded from: classes2.dex */
public class MindfullnessModel implements Serializable {
    private String desc;
    private int icon;

    /* renamed from: id  reason: collision with root package name */
    private String f11768id;
    private String title;

    public MindfullnessModel() {
    }

    public MindfullnessModel(String str, String str2, int i6, String str3) {
        this.f11768id = str;
        this.title = str2;
        this.icon = i6;
        this.desc = str3;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getIcon() {
        return this.icon;
    }

    public String getId() {
        return this.f11768id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setIcon(int i6) {
        this.icon = i6;
    }

    public void setId(String str) {
        this.f11768id = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
