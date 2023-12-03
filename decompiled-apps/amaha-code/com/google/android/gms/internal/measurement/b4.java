package com.google.android.gms.internal.measurement;

import android.util.Log;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class b4 extends h4 {
    public b4(e4 e4Var, String str, Boolean bool) {
        super(e4Var, str, bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.h4
    public final Object a(Object obj) {
        if (m3.f8465b.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (m3.f8466c.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        this.f8405a.getClass();
        Log.e("PhenotypeFlag", "Invalid boolean value for " + this.f8406b + ": " + ((String) obj));
        return null;
    }
}
