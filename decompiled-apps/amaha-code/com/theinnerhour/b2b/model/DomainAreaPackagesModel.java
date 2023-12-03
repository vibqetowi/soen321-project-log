package com.theinnerhour.b2b.model;

import java.io.Serializable;
/* loaded from: classes2.dex */
public class DomainAreaPackagesModel implements Serializable {

    /* renamed from: id  reason: collision with root package name */
    private int f11761id;
    private String name;

    public DomainAreaPackagesModel(int i6, String str) {
        this.f11761id = i6;
        this.name = str;
    }

    public int getId() {
        return this.f11761id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(int i6) {
        this.f11761id = i6;
    }

    public void setName(String str) {
        this.name = str;
    }
}
