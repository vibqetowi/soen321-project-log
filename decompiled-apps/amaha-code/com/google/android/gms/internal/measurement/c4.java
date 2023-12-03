package com.google.android.gms.internal.measurement;

import android.util.Log;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class c4 extends h4 {
    public c4(e4 e4Var, Double d10) {
        super(e4Var, "measurement.test.double_flag", d10);
    }

    @Override // com.google.android.gms.internal.measurement.h4
    public final Object a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            this.f8405a.getClass();
            Log.e("PhenotypeFlag", "Invalid double value for " + this.f8406b + ": " + ((String) obj));
            return null;
        }
    }
}
