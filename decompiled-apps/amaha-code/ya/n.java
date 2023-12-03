package ya;

import java.util.concurrent.CountDownLatch;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* loaded from: classes.dex */
public final class n<T> implements f, e, c {

    /* renamed from: a  reason: collision with root package name */
    public final CountDownLatch f38397a = new CountDownLatch(1);

    @Override // ya.c
    public final void b() {
        this.f38397a.countDown();
    }

    @Override // ya.e
    public final void onFailure(Exception exc) {
        this.f38397a.countDown();
    }

    @Override // ya.f
    public final void onSuccess(T t3) {
        this.f38397a.countDown();
    }
}
