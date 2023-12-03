package com.theinnerhour.b2b.model;
/* loaded from: classes2.dex */
public class GamificationBadgesModel {
    String desc;

    /* renamed from: id  reason: collision with root package name */
    String f11762id;
    int image;
    String name;

    public GamificationBadgesModel() {
    }

    public GamificationBadgesModel(String str, int i6, String str2, String str3) {
        this.f11762id = str;
        this.image = i6;
        this.name = str2;
        this.desc = str3;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getId() {
        return this.f11762id;
    }

    public int getImage() {
        return this.image;
    }

    public String getName() {
        return this.name;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setId(String str) {
        this.f11762id = str;
    }

    public void setImage(int i6) {
        this.image = i6;
    }

    public void setName(String str) {
        this.name = str;
    }
}
