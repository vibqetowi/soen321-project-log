package kf;

import com.google.firebase.perf.metrics.Trace;
/* compiled from: ScreenTraceUtil.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final df.a f23321a = df.a.d();

    public static void a(Trace trace, ef.c cVar) {
        int i6 = cVar.f13947a;
        if (i6 > 0) {
            trace.putMetric("_fr_tot", i6);
        }
        int i10 = cVar.f13948b;
        if (i10 > 0) {
            trace.putMetric("_fr_slo", i10);
        }
        int i11 = cVar.f13949c;
        if (i11 > 0) {
            trace.putMetric("_fr_fzn", i11);
        }
        f23321a.a("Screen trace: " + trace.f9801x + " _fr_tot:" + cVar.f13947a + " _fr_slo:" + i10 + " _fr_fzn:" + i11);
    }
}
