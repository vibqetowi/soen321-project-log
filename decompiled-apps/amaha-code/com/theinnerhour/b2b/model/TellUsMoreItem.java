package com.theinnerhour.b2b.model;
/* loaded from: classes2.dex */
public class TellUsMoreItem {
    String itemName;
    boolean selected;

    public TellUsMoreItem() {
        this.selected = false;
    }

    public String getItemName() {
        return this.itemName;
    }

    public boolean isSelected() {
        return this.selected;
    }

    public void setItemName(String str) {
        this.itemName = str;
    }

    public void setSelected(boolean z10) {
        this.selected = z10;
    }

    public TellUsMoreItem(String str, boolean z10) {
        this.selected = z10;
        this.itemName = str;
    }
}
