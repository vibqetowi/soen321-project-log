package com.theinnerhour.b2b.model;
/* loaded from: classes2.dex */
public class GamificationRuleBookModel {
    String desc;

    /* renamed from: id  reason: collision with root package name */
    String f11763id;
    String name;
    int points;

    public GamificationRuleBookModel() {
    }

    public GamificationRuleBookModel(String str, String str2, String str3, int i6) {
        this.f11763id = str;
        this.name = str2;
        this.desc = str3;
        this.points = i6;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getId() {
        return this.f11763id;
    }

    public String getName() {
        return this.name;
    }

    public int getPoints() {
        return this.points;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setId(String str) {
        this.f11763id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPoints(int i6) {
        this.points = i6;
    }
}
