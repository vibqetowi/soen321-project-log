package r1;

import android.os.Handler;
import java.util.concurrent.Executor;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Executor {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f30185u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Handler f30186v;

    public /* synthetic */ a(int i6, Handler handler) {
        this.f30185u = i6;
        this.f30186v = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i6 = this.f30185u;
        this.f30186v.post(runnable);
    }
}
