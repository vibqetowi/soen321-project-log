package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
/* loaded from: classes.dex */
public final class y0 extends e1 {
    public final /* synthetic */ Context A;
    public final /* synthetic */ Bundle B;
    public final /* synthetic */ j1 C;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f8698y = null;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f8699z = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(j1 j1Var, Context context, Bundle bundle) {
        super(j1Var, true);
        this.C = j1Var;
        this.A = context;
        this.B = bundle;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:2|3|(4:6|7|8|(8:10|11|(1:13)(1:31)|14|15|16|17|(2:19|20)(4:22|(1:24)(1:27)|25|26)))|34|11|(0)(0)|14|15|16|17|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
        r3.a(r5, true, false);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[Catch: Exception -> 0x00a5, TRY_ENTER, TryCatch #2 {Exception -> 0x00a5, blocks: (B:3:0x0004, B:6:0x0011, B:14:0x0028, B:16:0x0037, B:17:0x0043, B:21:0x0058, B:23:0x0060, B:25:0x006a, B:29:0x007f, B:20:0x0055), top: B:38:0x0004, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[Catch: Exception -> 0x00a5, TryCatch #2 {Exception -> 0x00a5, blocks: (B:3:0x0004, B:6:0x0011, B:14:0x0028, B:16:0x0037, B:17:0x0043, B:21:0x0058, B:23:0x0060, B:25:0x006a, B:29:0x007f, B:20:0x0055), top: B:38:0x0004, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a A[Catch: Exception -> 0x00a5, TryCatch #2 {Exception -> 0x00a5, blocks: (B:3:0x0004, B:6:0x0011, B:14:0x0028, B:16:0x0037, B:17:0x0043, B:21:0x0058, B:23:0x0060, B:25:0x006a, B:29:0x007f, B:20:0x0055), top: B:38:0x0004, inners: #1 }] */
    @Override // com.google.android.gms.internal.measurement.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z10;
        String str;
        String str2;
        String str3;
        boolean z11;
        boolean z12;
        try {
            j1 j1Var = this.C;
            String str4 = this.f8698y;
            String str5 = this.f8699z;
            j1Var.getClass();
            if (str5 != null && str4 != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, j1.class.getClassLoader());
                    z12 = true;
                } catch (ClassNotFoundException unused) {
                    z12 = false;
                }
                if (!z12) {
                    z10 = true;
                    k0 k0Var = null;
                    if (!z10) {
                        str3 = this.f8699z;
                        str2 = this.f8698y;
                        str = this.C.f8436a;
                    } else {
                        str = null;
                        str2 = null;
                        str3 = null;
                    }
                    v9.o.h(this.A);
                    j1 j1Var2 = this.C;
                    Context context = this.A;
                    j1Var2.getClass();
                    k0Var = j0.asInterface(DynamiteModule.c(context, DynamiteModule.f7450c, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    j1Var2.f8442h = k0Var;
                    if (this.C.f8442h != null) {
                        Log.w(this.C.f8436a, "Failed to connect to measurement client.");
                        return;
                    }
                    int a10 = DynamiteModule.a(this.A, ModuleDescriptor.MODULE_ID);
                    int d10 = DynamiteModule.d(this.A, ModuleDescriptor.MODULE_ID, false);
                    int max = Math.max(a10, d10);
                    if (d10 < a10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    t0 t0Var = new t0(74029L, max, z11, str, str2, str3, this.B, ta.s3.a(this.A));
                    k0 k0Var2 = this.C.f8442h;
                    v9.o.h(k0Var2);
                    k0Var2.initialize(new da.b(this.A), t0Var, this.f8349u);
                    return;
                }
            }
            z10 = false;
            k0 k0Var3 = null;
            if (!z10) {
            }
            v9.o.h(this.A);
            j1 j1Var22 = this.C;
            Context context2 = this.A;
            j1Var22.getClass();
            k0Var3 = j0.asInterface(DynamiteModule.c(context2, DynamiteModule.f7450c, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            j1Var22.f8442h = k0Var3;
            if (this.C.f8442h != null) {
            }
        } catch (Exception e10) {
            this.C.a(e10, true, false);
        }
    }
}
