package com.google.android.gms.internal.measurement;

import android.util.Log;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class a4 extends h4 {
    public a4(e4 e4Var, String str, Long l2) {
        super(e4Var, str, l2);
    }

    @Override // com.google.android.gms.internal.measurement.h4
    public final Object a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            this.f8405a.getClass();
            Log.e("PhenotypeFlag", "Invalid long value for " + this.f8406b + ": " + ((String) obj));
            return null;
        }
    }
}
