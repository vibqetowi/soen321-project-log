package com.google.firebase.crashlytics.internal.network;
/* loaded from: classes7.dex */
public class HttpResponse {
    private final String body;
    private final int code;

    public HttpResponse(int i, String str) {
        this.code = i;
        this.body = str;
    }

    public int code() {
        return this.code;
    }

    public String body() {
        return this.body;
    }
}
