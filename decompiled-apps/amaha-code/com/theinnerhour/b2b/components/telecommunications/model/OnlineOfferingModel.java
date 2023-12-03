package com.theinnerhour.b2b.components.telecommunications.model;

import java.io.Serializable;
/* loaded from: classes2.dex */
public class OnlineOfferingModel implements Serializable {
    private String display_text;
    private int minimum_fee;

    public String getDisplay_text() {
        return this.display_text;
    }

    public int getMinimum_fee() {
        return this.minimum_fee;
    }

    public void setDisplay_text(String str) {
        this.display_text = str;
    }

    public void setMinimum_fee(int i6) {
        this.minimum_fee = i6;
    }
}
