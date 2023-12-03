package kotlinx.coroutines;
/* compiled from: DefaultExecutor.kt */
/* loaded from: classes2.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public static final j0 f23577a;

    static {
        String str;
        boolean z10;
        j0 j0Var;
        int i6 = kotlinx.coroutines.internal.s.f23616a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            z10 = Boolean.parseBoolean(str);
        } else {
            z10 = false;
        }
        if (!z10) {
            j0Var = f0.C;
        } else {
            kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
            k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
            k1Var.L0();
            if (!(k1Var instanceof j0)) {
                j0Var = f0.C;
            } else {
                j0Var = (j0) k1Var;
            }
        }
        f23577a = j0Var;
    }
}
