package hh;

import kotlin.jvm.internal.i;
/* compiled from: LogcatLogAdapter.kt */
/* loaded from: classes.dex */
public final class f implements c {

    /* renamed from: a  reason: collision with root package name */
    public final pg.h f17609a;

    public f(pg.h logConfig) {
        i.g(logConfig, "logConfig");
        this.f17609a = logConfig;
    }

    @Override // hh.c
    public final void a(int i6, String str, String str2, String str3, Throwable th2) {
        defpackage.e.u(str, "tag", str2, "subTag", str3, "message");
        try {
            ca.a.S0(i6, str, str2, str3, th2);
        } catch (Exception unused) {
        }
    }

    @Override // hh.c
    public final boolean b(int i6) {
        pg.h hVar = this.f17609a;
        if ((hVar.f28410b || hc.d.B) && hVar.f28409a >= i6) {
            return true;
        }
        return false;
    }
}
