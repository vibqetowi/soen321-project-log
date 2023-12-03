package com.theinnerhour.b2b.model;

import java.io.Serializable;
/* loaded from: classes2.dex */
public class LanguagePackagesModel implements Serializable {

    /* renamed from: id  reason: collision with root package name */
    private int f11765id;
    private String name;

    public LanguagePackagesModel(int i6, String str) {
        this.f11765id = i6;
        this.name = str;
    }

    public int getId() {
        return this.f11765id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(int i6) {
        this.f11765id = i6;
    }

    public void setName(String str) {
        this.name = str;
    }
}
