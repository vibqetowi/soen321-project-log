package com.google.android.gms.internal.measurement;

import android.os.Build;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f8326a;

    static {
        int i6;
        if (Build.VERSION.SDK_INT >= 31) {
            i6 = 33554432;
        } else {
            i6 = 0;
        }
        f8326a = i6;
    }
}
