package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.IOException;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzadn  reason: invalid package */
/* loaded from: classes.dex */
public class zzadn extends IOException {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ int f8297u = 0;

    public zzadn(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public static zzadm a() {
        return new zzadm();
    }

    public static zzadn b() {
        return new zzadn("Protocol message had invalid UTF-8.");
    }

    public static zzadn c() {
        return new zzadn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzadn d() {
        return new zzadn("Failed to parse the message.");
    }

    public static zzadn e() {
        return new zzadn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public zzadn(String str) {
        super(str);
    }
}
