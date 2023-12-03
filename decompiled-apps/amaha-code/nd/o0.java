package nd;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: Utils.java */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ExecutorService f26099a = g0.a("awaitEvenIfOnMainThread task continuation executor");

    public static <T> T a(ya.h<T> hVar) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        hVar.continueWith(f26099a, new f0.b(27, countDownLatch));
        countDownLatch.await(4L, TimeUnit.SECONDS);
        if (hVar.isSuccessful()) {
            return hVar.getResult();
        }
        if (!hVar.isCanceled()) {
            if (hVar.isComplete()) {
                throw new IllegalStateException(hVar.getException());
            }
            throw new TimeoutException();
        }
        throw new CancellationException("Task is already canceled");
    }
}
