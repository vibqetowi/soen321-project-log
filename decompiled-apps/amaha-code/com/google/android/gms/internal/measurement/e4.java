package com.google.android.gms.internal.measurement;

import android.net.Uri;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class e4 {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f8353a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8354b;

    public e4(Uri uri, boolean z10, boolean z11) {
        this.f8353a = uri;
        this.f8354b = z10;
    }

    public final a4 a(long j10, String str) {
        return new a4(this, str, Long.valueOf(j10));
    }

    public final d4 b(String str, String str2) {
        return new d4(this, str, str2);
    }

    public final b4 c(String str, boolean z10) {
        return new b4(this, str, Boolean.valueOf(z10));
    }
}
