package ni;

import android.app.Activity;
import mi.i1;
/* compiled from: BaseViewEngine.kt */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f26318a;

    /* renamed from: b  reason: collision with root package name */
    public final pi.d f26319b;

    public a(Activity activity, pi.d dVar, i5.n nVar) {
        this.f26318a = activity;
        this.f26319b = dVar;
    }

    public static void a(pi.d payload, String str, ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(payload, "payload");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        i1.f25206a.getClass();
        i1.c(sdkInstance).c(payload, sp.b.m(), str);
    }
}
