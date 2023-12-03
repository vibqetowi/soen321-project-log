package ta;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.theinnerhour.b2b.utils.Constants;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class t2 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f32875u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f32876v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f32877w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f32878x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Object f32879y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ w2 f32880z;

    public t2(w2 w2Var, int i6, String str, Object obj, Object obj2, Object obj3) {
        this.f32880z = w2Var;
        this.f32875u = i6;
        this.f32876v = str;
        this.f32877w = obj;
        this.f32878x = obj2;
        this.f32879y = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        j3 j3Var = this.f32880z.f32943u.B;
        y3.i(j3Var);
        if (j3Var.f32544v) {
            w2 w2Var = this.f32880z;
            if (w2Var.f32922w == 0) {
                f fVar = w2Var.f32943u.A;
                if (fVar.f32552x == null) {
                    synchronized (fVar) {
                        if (fVar.f32552x == null) {
                            ApplicationInfo applicationInfo = fVar.f32943u.f32953u.getApplicationInfo();
                            String a10 = aa.h.a();
                            if (applicationInfo != null) {
                                String str = applicationInfo.processName;
                                if (str != null && str.equals(a10)) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                fVar.f32552x = Boolean.valueOf(z10);
                            }
                            if (fVar.f32552x == null) {
                                fVar.f32552x = Boolean.TRUE;
                                w2 w2Var2 = fVar.f32943u.C;
                                y3.k(w2Var2);
                                w2Var2.f32925z.b("My process not in the list of running processes");
                            }
                        }
                    }
                }
                if (fVar.f32552x.booleanValue()) {
                    w2 w2Var3 = this.f32880z;
                    w2Var3.f32943u.getClass();
                    w2Var3.f32922w = 'C';
                } else {
                    w2 w2Var4 = this.f32880z;
                    w2Var4.f32943u.getClass();
                    w2Var4.f32922w = 'c';
                }
            }
            w2 w2Var5 = this.f32880z;
            if (w2Var5.f32923x < 0) {
                w2Var5.f32943u.A.m();
                w2Var5.f32923x = 74029L;
            }
            char charAt = "01VDIWEA?".charAt(this.f32875u);
            w2 w2Var6 = this.f32880z;
            char c10 = w2Var6.f32922w;
            long j10 = w2Var6.f32923x;
            String r = w2.r(true, this.f32876v, this.f32877w, this.f32878x, this.f32879y);
            StringBuilder sb2 = new StringBuilder("2");
            sb2.append(charAt);
            sb2.append(c10);
            sb2.append(j10);
            String b10 = r1.b0.b(sb2, ":", r);
            if (b10.length() > 1024) {
                b10 = this.f32876v.substring(0, Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID);
            }
            h3 h3Var = j3Var.f32678x;
            if (h3Var != null) {
                j3 j3Var2 = h3Var.f32591e;
                j3Var2.h();
                if (h3Var.f32591e.l().getLong(h3Var.f32587a, 0L) == 0) {
                    h3Var.a();
                }
                if (b10 == null) {
                    b10 = "";
                }
                SharedPreferences l2 = j3Var2.l();
                String str2 = h3Var.f32588b;
                long j11 = l2.getLong(str2, 0L);
                String str3 = h3Var.f32589c;
                if (j11 <= 0) {
                    SharedPreferences.Editor edit = j3Var2.l().edit();
                    edit.putString(str3, b10);
                    edit.putLong(str2, 1L);
                    edit.apply();
                    return;
                }
                k6 k6Var = j3Var2.f32943u.F;
                y3.i(k6Var);
                long nextLong = k6Var.q().nextLong();
                long j12 = j11 + 1;
                SharedPreferences.Editor edit2 = j3Var2.l().edit();
                if ((nextLong & Long.MAX_VALUE) < Long.MAX_VALUE / j12) {
                    edit2.putString(str3, b10);
                }
                edit2.putLong(str2, j12);
                edit2.apply();
                return;
            }
            return;
        }
        Log.println(6, this.f32880z.t(), "Persisted config not initialized. Not logging error/warn");
    }
}
