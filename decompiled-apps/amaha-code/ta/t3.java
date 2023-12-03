package ta;

import java.lang.Thread;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class t3 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final String f32881a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w3 f32882b;

    public t3(w3 w3Var, String str) {
        this.f32882b = w3Var;
        this.f32881a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        w2 w2Var = this.f32882b.f32943u.C;
        y3.k(w2Var);
        w2Var.f32925z.c(th2, this.f32881a);
    }
}
