package com.theinnerhour.b2b.model;

import java.util.HashMap;
/* loaded from: classes2.dex */
public class FirebaseCustomEvent {
    String event;
    String timestamp;
    HashMap<String, String> params = new HashMap<>();
    HashMap<String, String> user = new HashMap<>();

    public String getEvent() {
        return this.event;
    }

    public HashMap<String, String> getParams() {
        return this.params;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public HashMap<String, String> getUser() {
        return this.user;
    }

    public void setEvent(String str) {
        this.event = str;
    }

    public void setParams(HashMap<String, String> hashMap) {
        this.params = hashMap;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }

    public void setUser(HashMap<String, String> hashMap) {
        this.user = hashMap;
    }
}
