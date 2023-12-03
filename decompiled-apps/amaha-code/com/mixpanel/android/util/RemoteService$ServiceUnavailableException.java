package com.mixpanel.android.util;
/* loaded from: classes.dex */
public class RemoteService$ServiceUnavailableException extends Exception {

    /* renamed from: u  reason: collision with root package name */
    public final int f10159u;

    public RemoteService$ServiceUnavailableException(String str) {
        super("Service Unavailable");
        int i6;
        try {
            i6 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            i6 = 0;
        }
        this.f10159u = i6;
    }
}
