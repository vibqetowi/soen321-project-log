package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
/* loaded from: classes.dex */
public final class b1 extends e1 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ int f8309y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Object f8310z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(i1 i1Var, Activity activity, g0 g0Var) {
        super(i1Var.f8421u, true);
        this.f8309y = 3;
        this.A = i1Var;
        this.f8310z = activity;
        this.B = g0Var;
    }

    @Override // com.google.android.gms.internal.measurement.e1
    public final void a() {
        Bundle bundle = null;
        switch (this.f8309y) {
            case 0:
                k0 k0Var = ((j1) this.A).f8442h;
                v9.o.h(k0Var);
                k0Var.logHealthData(5, (String) this.f8310z, new da.b(this.B), new da.b(null), new da.b(null));
                return;
            case 1:
                k0 k0Var2 = ((j1) this.A).f8442h;
                v9.o.h(k0Var2);
                k0Var2.getMaxUserProperties((String) this.f8310z, (g0) this.B);
                return;
            case 2:
                if (((Bundle) this.f8310z) != null) {
                    bundle = new Bundle();
                    if (((Bundle) this.f8310z).containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = ((Bundle) this.f8310z).get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                }
                k0 k0Var3 = ((i1) this.A).f8421u.f8442h;
                v9.o.h(k0Var3);
                k0Var3.onActivityCreated(new da.b((Activity) this.B), bundle, this.f8350v);
                return;
            default:
                k0 k0Var4 = ((i1) this.A).f8421u.f8442h;
                v9.o.h(k0Var4);
                k0Var4.onActivitySaveInstanceState(new da.b((Activity) this.f8310z), (g0) this.B, this.f8350v);
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.e1
    public final void b() {
        switch (this.f8309y) {
            case 1:
                ((g0) this.B).t(null);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(i1 i1Var, Bundle bundle, Activity activity) {
        super(i1Var.f8421u, true);
        this.f8309y = 2;
        this.A = i1Var;
        this.f8310z = bundle;
        this.B = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(j1 j1Var, Object obj) {
        super(j1Var, false);
        this.f8309y = 0;
        this.A = j1Var;
        this.f8310z = "Error with data collection. Data lost.";
        this.B = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(j1 j1Var, String str, g0 g0Var) {
        super(j1Var, true);
        this.f8309y = 1;
        this.A = j1Var;
        this.f8310z = str;
        this.B = g0Var;
    }
}
