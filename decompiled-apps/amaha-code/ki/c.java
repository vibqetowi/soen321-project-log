package ki;

import android.content.Context;
import ih.p;
import ih.q;
import kotlin.jvm.internal.i;
import qg.w;
/* compiled from: LocalRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f23349a;

    /* renamed from: b  reason: collision with root package name */
    public final p f23350b;

    public c(Context context, p sdkInstance) {
        i.g(sdkInstance, "sdkInstance");
        this.f23349a = context;
        this.f23350b = sdkInstance;
    }

    @Override // ki.b
    public final q a() {
        Context context = this.f23349a;
        i.g(context, "context");
        p sdkInstance = this.f23350b;
        i.g(sdkInstance, "sdkInstance");
        w.f29578a.getClass();
        return w.f(context, sdkInstance).a();
    }

    @Override // ki.b
    public final void c(String str) {
        Context context = this.f23349a;
        i.g(context, "context");
        p sdkInstance = this.f23350b;
        i.g(sdkInstance, "sdkInstance");
        w.f29578a.getClass();
        w.f(context, sdkInstance).c(str);
    }

    @Override // ki.b
    public final String d() {
        Context context = this.f23349a;
        i.g(context, "context");
        p sdkInstance = this.f23350b;
        i.g(sdkInstance, "sdkInstance");
        w.f29578a.getClass();
        return w.f(context, sdkInstance).e0().f20078b;
    }
}
