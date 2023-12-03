package com.theinnerhour.b2b.model;

import android.graphics.drawable.Drawable;
/* loaded from: classes2.dex */
public class DosDonts {
    String description;
    Drawable drawbale;
    String title;

    public DosDonts(String str, String str2, Drawable drawable) {
        this.title = str;
        this.description = str2;
        this.drawbale = drawable;
    }

    public String getDescription() {
        return this.description;
    }

    public Drawable getDrawbale() {
        return this.drawbale;
    }

    public String getTitle() {
        return this.title;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDrawbale(Drawable drawable) {
        this.drawbale = drawable;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
