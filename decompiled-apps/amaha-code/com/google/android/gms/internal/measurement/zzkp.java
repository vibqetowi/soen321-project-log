package com.google.android.gms.internal.measurement;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public class zzkp extends IOException {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ int f8736u = 0;

    public zzkp(String str) {
        super(str);
    }

    public static zzkp a() {
        return new zzkp("Protocol message had invalid UTF-8.");
    }

    public static zzkp b() {
        return new zzkp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzkp c() {
        return new zzkp("Failed to parse the message.");
    }

    public static zzkp d() {
        return new zzkp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
