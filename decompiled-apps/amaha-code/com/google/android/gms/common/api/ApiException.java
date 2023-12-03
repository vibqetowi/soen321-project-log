package com.google.android.gms.common.api;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public class ApiException extends Exception {
    @Deprecated

    /* renamed from: u  reason: collision with root package name */
    public final Status f7291u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ApiException(Status status) {
        super(r0 + ": " + r1);
        int i6 = status.f7298v;
        String str = status.f7299w;
        str = str == null ? "" : str;
        this.f7291u = status;
    }
}
