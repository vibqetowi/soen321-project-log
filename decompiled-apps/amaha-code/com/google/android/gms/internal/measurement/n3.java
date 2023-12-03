package com.google.android.gms.internal.measurement;

import android.os.Build;
import android.os.UserManager;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class n3 {

    /* renamed from: a  reason: collision with root package name */
    public static UserManager f8482a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f8483b;

    static {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 24) {
            z10 = true;
        } else {
            z10 = false;
        }
        f8483b = !z10;
    }
}
