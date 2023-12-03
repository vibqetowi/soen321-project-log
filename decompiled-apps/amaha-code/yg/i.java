package yg;

import android.content.Context;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f38577u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ j f38578v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Context f38579w;

    public /* synthetic */ i(j jVar, Context context, int i6) {
        this.f38577u = i6;
        this.f38578v = jVar;
        this.f38579w = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f38577u;
        Context context = this.f38579w;
        j this$0 = this.f38578v;
        switch (i6) {
            case 0:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(context, "$context");
                this$0.b(context);
                this$0.d(context);
                return;
            default:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(context, "$context");
                this$0.c(context);
                return;
        }
    }
}
