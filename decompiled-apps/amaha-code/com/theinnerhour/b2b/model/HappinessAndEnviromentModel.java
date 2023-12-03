package com.theinnerhour.b2b.model;
/* loaded from: classes2.dex */
public class HappinessAndEnviromentModel {
    private String desc;
    private int icon;

    /* renamed from: id  reason: collision with root package name */
    private String f11764id;
    private String title;

    public HappinessAndEnviromentModel() {
    }

    public HappinessAndEnviromentModel(String str, String str2, int i6, String str3) {
        this.f11764id = str;
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
        return this.f11764id;
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
        this.f11764id = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
