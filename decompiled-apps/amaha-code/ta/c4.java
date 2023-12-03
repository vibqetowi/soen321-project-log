package ta;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class c4 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f32503u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f32504v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f32505w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ long f32506x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Object f32507y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Object f32508z;

    public /* synthetic */ c4(Object obj, Object obj2, Object obj3, Object obj4, long j10, int i6) {
        this.f32503u = i6;
        this.f32508z = obj;
        this.f32504v = obj2;
        this.f32505w = obj3;
        this.f32507y = obj4;
        this.f32506x = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f32507y;
        int i6 = this.f32503u;
        Object obj2 = this.f32508z;
        Object obj3 = this.f32505w;
        Object obj4 = this.f32504v;
        switch (i6) {
            case 0:
                String str = (String) obj4;
                if (str == null) {
                    d6 d6Var = ((d4) obj2).f32521a;
                    String str2 = (String) obj3;
                    d6Var.a().h();
                    String str3 = d6Var.X;
                    if (str3 == null || str3.equals(str2)) {
                        d6Var.X = str2;
                        d6Var.W = null;
                        return;
                    }
                    return;
                }
                z4 z4Var = new z4(this.f32506x, (String) obj, str);
                d6 d6Var2 = ((d4) obj2).f32521a;
                String str4 = (String) obj3;
                d6Var2.a().h();
                String str5 = d6Var2.X;
                if (str5 != null) {
                    str5.equals(str4);
                }
                d6Var2.X = str4;
                d6Var2.W = z4Var;
                return;
            case 1:
                ((t4) obj2).x(this.f32506x, obj, (String) obj4, (String) obj3);
                return;
            default:
                c5 c5Var = (c5) obj2;
                Bundle bundle = (Bundle) obj4;
                long j10 = this.f32506x;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                k6 k6Var = c5Var.f32943u.F;
                y3.i(k6Var);
                c5Var.l((z4) obj3, (z4) obj, j10, true, k6Var.m0("screen_view", bundle, null, false));
                return;
        }
    }
}
