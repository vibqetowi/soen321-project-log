package hh;
/* compiled from: DefaultLogcatAdapter.kt */
/* loaded from: classes.dex */
public final class b implements c {
    @Override // hh.c
    public final void a(int i6, String str, String str2, String str3, Throwable th2) {
        defpackage.e.u(str, "tag", str2, "subTag", str3, "message");
        try {
            ca.a.S0(i6, str, "", str3, th2);
        } catch (Exception unused) {
        }
    }

    @Override // hh.c
    public final boolean b(int i6) {
        return hc.d.B;
    }
}
