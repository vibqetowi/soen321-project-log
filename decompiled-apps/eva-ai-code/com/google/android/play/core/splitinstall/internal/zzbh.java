package com.google.android.play.core.splitinstall.internal;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public final class zzbh extends RuntimeException {
    public zzbh(String str) {
        super(str);
    }

    public zzbh(String str, Throwable th) {
        super("Failed to initialize FileStorage", th);
    }
}
