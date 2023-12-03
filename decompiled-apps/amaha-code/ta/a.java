package ta;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f32453u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f32454v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long f32455w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ q1 f32456x;

    public /* synthetic */ a(q1 q1Var, String str, long j10, int i6) {
        this.f32453u = i6;
        this.f32456x = q1Var;
        this.f32454v = str;
        this.f32455w = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f32453u;
        long j10 = this.f32455w;
        String str = this.f32454v;
        q1 q1Var = this.f32456x;
        switch (i6) {
            case 0:
                q1Var.h();
                v9.o.e(str);
                t.b bVar = q1Var.f32822w;
                if (bVar.isEmpty()) {
                    q1Var.f32823x = j10;
                }
                Integer num = (Integer) bVar.getOrDefault(str, null);
                if (num != null) {
                    bVar.put(str, Integer.valueOf(num.intValue() + 1));
                    return;
                } else if (bVar.f32260w >= 100) {
                    w2 w2Var = q1Var.f32943u.C;
                    y3.k(w2Var);
                    w2Var.C.b("Too many ads visible");
                    return;
                } else {
                    bVar.put(str, 1);
                    q1Var.f32821v.put(str, Long.valueOf(j10));
                    return;
                }
            default:
                q1Var.h();
                v9.o.e(str);
                t.b bVar2 = q1Var.f32822w;
                Integer num2 = (Integer) bVar2.getOrDefault(str, null);
                y3 y3Var = q1Var.f32943u;
                if (num2 != null) {
                    c5 c5Var = y3Var.I;
                    y3.j(c5Var);
                    z4 n10 = c5Var.n(false);
                    int intValue = num2.intValue() - 1;
                    if (intValue == 0) {
                        bVar2.remove(str);
                        t.b bVar3 = q1Var.f32821v;
                        Long l2 = (Long) bVar3.getOrDefault(str, null);
                        w2 w2Var2 = y3Var.C;
                        if (l2 == null) {
                            y3.k(w2Var2);
                            w2Var2.f32925z.b("First ad unit exposure time was never set");
                        } else {
                            long longValue = l2.longValue();
                            bVar3.remove(str);
                            q1Var.m(str, j10 - longValue, n10);
                        }
                        if (bVar2.isEmpty()) {
                            long j11 = q1Var.f32823x;
                            if (j11 == 0) {
                                y3.k(w2Var2);
                                w2Var2.f32925z.b("First ad exposure time was never set");
                                return;
                            }
                            q1Var.l(j10 - j11, n10);
                            q1Var.f32823x = 0L;
                            return;
                        }
                        return;
                    }
                    bVar2.put(str, Integer.valueOf(intValue));
                    return;
                }
                w2 w2Var3 = y3Var.C;
                y3.k(w2Var3);
                w2Var3.f32925z.c(str, "Call to endAdUnitExposure for unknown ad unit id");
                return;
        }
    }
}
