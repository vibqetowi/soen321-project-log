package mi;

import android.content.Context;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class y0 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f25293u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Context f25294v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ih.p f25295w;

    public /* synthetic */ y0(Context context, ih.p pVar) {
        this.f25293u = 2;
        this.f25295w = pVar;
        this.f25294v = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[Catch: Exception -> 0x0065, TryCatch #2 {Exception -> 0x0065, blocks: (B:6:0x001f, B:11:0x0033, B:12:0x0039, B:14:0x004b, B:20:0x0056, B:21:0x0061), top: B:54:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[Catch: Exception -> 0x0065, TRY_LEAVE, TryCatch #2 {Exception -> 0x0065, blocks: (B:6:0x001f, B:11:0x0033, B:12:0x0039, B:14:0x004b, B:20:0x0056, B:21:0x0061), top: B:54:0x001f }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        boolean z11;
        int i6 = this.f25293u;
        ih.p sdkInstance = this.f25295w;
        Context context = this.f25294v;
        switch (i6) {
            case 0:
                kotlin.jvm.internal.i.g(context, "$context");
                kotlin.jvm.internal.i.g(sdkInstance, "$sdkInstance");
                hh.g gVar = sdkInstance.f20105d;
                a2 a2Var = new a2(context, sdkInstance);
                try {
                    hh.g.b(gVar, 0, new u1(a2Var), 3);
                    if (t1.b(context, sdkInstance)) {
                        t1.j(context, sdkInstance);
                        i1.f25206a.getClass();
                        si.e c10 = a2Var.c(i1.a(sdkInstance).f35169a);
                        if (c10 != null) {
                            hh.g.b(sdkInstance.f20105d, 0, new v1(a2Var, c10), 3);
                            pi.d b10 = a2Var.b(c10, null);
                            if (b10 != null) {
                                a2Var.f25136d.f25200d.b(context, c10, b10);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    gVar.a(1, e10, new w1(a2Var));
                    return;
                }
            case 1:
                kotlin.jvm.internal.i.g(context, "$context");
                kotlin.jvm.internal.i.g(sdkInstance, "$sdkInstance");
                yi.a aVar = new yi.a(context, sdkInstance);
                vi.o oVar = aVar.f38629d;
                try {
                    long n10 = sp.b.n();
                    if (oVar.q() + 900 < n10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        aVar.a();
                        oVar.n(n10);
                    }
                    long B = oVar.B();
                    long n11 = sp.b.n();
                    long s10 = oVar.s();
                    if (aVar.f38630e.f25199c && B + s10 >= n11) {
                        z11 = false;
                        if (z11) {
                            hh.g.b(sdkInstance.f20105d, 0, new yi.b(aVar), 3);
                            return;
                        } else {
                            aVar.b();
                            return;
                        }
                    }
                    z11 = true;
                    if (z11) {
                    }
                } catch (Exception e11) {
                    sdkInstance.f20105d.a(1, e11, new yi.c(aVar));
                    return;
                }
                break;
            default:
                kotlin.jvm.internal.i.g(sdkInstance, "$sdkInstance");
                kotlin.jvm.internal.i.g(context, "$context");
                i1.f25206a.getClass();
                c0 c11 = i1.c(sdkInstance);
                ih.p pVar = c11.f25149a;
                try {
                    vi.o d10 = i1.d(context, pVar);
                    if (t1.g(context, pVar)) {
                        i1.c(pVar).d(context);
                        d10.J();
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    pVar.f20105d.a(1, e12, new b0(c11));
                    return;
                }
        }
    }

    public /* synthetic */ y0(Context context, ih.p pVar, int i6) {
        this.f25293u = i6;
        this.f25294v = context;
        this.f25295w = pVar;
    }
}
