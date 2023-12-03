package androidx.emoji2.text;

import c9.w;
import java.util.concurrent.ThreadFactory;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f2028u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f2029v;

    public /* synthetic */ a(String str, int i6) {
        this.f2028u = i6;
        this.f2029v = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i6 = this.f2028u;
        String str = this.f2029v;
        switch (i6) {
            case 0:
                Thread thread = new Thread(runnable, str);
                thread.setPriority(10);
                return thread;
            default:
                int i10 = w.f5205a;
                return new Thread(runnable, str);
        }
    }
}
