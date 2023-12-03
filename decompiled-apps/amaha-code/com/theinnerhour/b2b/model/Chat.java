package com.theinnerhour.b2b.model;
/* loaded from: classes2.dex */
public class Chat {
    String Message;
    boolean is_left;

    public Chat() {
    }

    public String getMessage() {
        return this.Message;
    }

    public boolean is_left() {
        return this.is_left;
    }

    public void setIs_left(boolean z10) {
        this.is_left = z10;
    }

    public void setMessage(String str) {
        this.Message = str;
    }

    public Chat(boolean z10, String str) {
        this.is_left = z10;
        this.Message = str;
    }
}
