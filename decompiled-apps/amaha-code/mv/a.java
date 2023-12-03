package mv;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.i;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f25753u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ boolean f25754v;

    public /* synthetic */ a(String str, boolean z10) {
        this.f25753u = str;
        this.f25754v = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String name = this.f25753u;
        i.g(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(this.f25754v);
        return thread;
    }
}
