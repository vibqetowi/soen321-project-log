package ff;

import java.util.Map;
import lf.m;
/* compiled from: FirebasePerfTraceValidator.java */
/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final df.a f15029b = df.a.d();

    /* renamed from: a  reason: collision with root package name */
    public final m f15030a;

    public d(m mVar) {
        this.f15030a = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0052 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d(m mVar, int i6) {
        boolean z10;
        boolean z11;
        if (mVar == null) {
            return false;
        }
        df.a aVar = f15029b;
        if (i6 > 1) {
            aVar.f("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry<String, Long> entry : mVar.X().entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                String trim = key.trim();
                if (trim.isEmpty()) {
                    aVar.f("counterId is empty");
                } else if (trim.length() > 100) {
                    aVar.f("counterId exceeded max length 100");
                } else {
                    z10 = true;
                    if (z10) {
                        aVar.f("invalid CounterId:" + entry.getKey());
                        return false;
                    }
                    if (entry.getValue() != null) {
                        z11 = true;
                        continue;
                    } else {
                        z11 = false;
                        continue;
                    }
                    if (!z11) {
                        aVar.f("invalid CounterValue:" + entry.getValue());
                        return false;
                    }
                }
            }
            z10 = false;
            if (z10) {
            }
        }
        for (m mVar2 : mVar.d0()) {
            if (!d(mVar2, i6 + 1)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean e(m mVar, int i6) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        df.a aVar = f15029b;
        if (mVar == null) {
            aVar.f("TraceMetric is null");
            return false;
        } else if (i6 > 1) {
            aVar.f("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        } else {
            String b02 = mVar.b0();
            if (b02 != null) {
                String trim = b02.trim();
                if (!trim.isEmpty() && trim.length() <= 100) {
                    z10 = true;
                    if (z10) {
                        aVar.f("invalid TraceId:" + mVar.b0());
                        return false;
                    }
                    if (mVar.a0() > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        aVar.f("invalid TraceDuration:" + mVar.a0());
                        return false;
                    } else if (!mVar.e0()) {
                        aVar.f("clientStartTimeUs is null.");
                        return false;
                    } else {
                        if (mVar.b0().startsWith("_st_")) {
                            Long l2 = mVar.X().get("_fr_tot");
                            if (l2 != null && l2.compareTo((Long) 0L) > 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (!z13) {
                                aVar.f("non-positive totalFrames in screen trace " + mVar.b0());
                                return false;
                            }
                        }
                        for (m mVar2 : mVar.d0()) {
                            if (!e(mVar2, i6 + 1)) {
                                return false;
                            }
                        }
                        for (Map.Entry<String, String> entry : mVar.Y().entrySet()) {
                            try {
                                e.b(entry.getKey(), entry.getValue());
                            } catch (IllegalArgumentException e10) {
                                aVar.f(e10.getLocalizedMessage());
                                z12 = false;
                            }
                        }
                        z12 = true;
                        if (!z12) {
                            return false;
                        }
                        return true;
                    }
                }
            }
            z10 = false;
            if (z10) {
            }
        }
    }

    @Override // ff.e
    public final boolean a() {
        boolean z10;
        boolean z11;
        boolean z12;
        m mVar = this.f15030a;
        boolean e10 = e(mVar, 0);
        df.a aVar = f15029b;
        if (!e10) {
            aVar.f("Invalid Trace:" + mVar.b0());
            return false;
        }
        if (mVar.W() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            for (m mVar2 : mVar.d0()) {
                if (mVar2.W() > 0) {
                    z12 = true;
                    continue;
                } else {
                    z12 = false;
                    continue;
                }
                if (z12) {
                    z11 = true;
                    break;
                }
            }
            z11 = false;
        } else {
            z11 = true;
            break;
        }
        if (!z11 || d(mVar, 0)) {
            return true;
        }
        aVar.f("Invalid Counters for Trace:" + mVar.b0());
        return false;
    }
}
