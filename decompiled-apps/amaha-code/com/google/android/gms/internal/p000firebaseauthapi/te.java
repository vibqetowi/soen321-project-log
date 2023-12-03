package com.google.android.gms.internal.p000firebaseauthapi;

import aa.a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import f6.b;
import v9.o;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.te  reason: invalid package */
/* loaded from: classes.dex */
public final class te {

    /* renamed from: a  reason: collision with root package name */
    public final String f8158a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8159b;

    public te(Context context, String str) {
        o.e(str);
        this.f8158a = str;
        try {
            byte[] a10 = a.a(context, str);
            if (a10 == null) {
                Log.e("FBA-PackageInfo", "single cert required: ".concat(String.valueOf(str)));
                this.f8159b = null;
                return;
            }
            this.f8159b = b.r0(a10);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FBA-PackageInfo", "no pkg: ".concat(String.valueOf(str)));
            this.f8159b = null;
        }
    }
}
