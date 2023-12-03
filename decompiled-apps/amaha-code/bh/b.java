package bh;

import android.os.Handler;
import android.os.Looper;
import hs.i;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.k;
/* compiled from: GlobalResources.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final i f4297a = sp.b.O(a.f4299u);

    /* renamed from: b  reason: collision with root package name */
    public static final Handler f4298b = new Handler(Looper.getMainLooper());

    /* compiled from: GlobalResources.kt */
    /* loaded from: classes.dex */
    public static final class a extends k implements ss.a<ExecutorService> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f4299u = new a();

        public a() {
            super(0);
        }

        @Override // ss.a
        public final ExecutorService invoke() {
            return Executors.newCachedThreadPool();
        }
    }

    public static ExecutorService a() {
        Object value = f4297a.getValue();
        kotlin.jvm.internal.i.f(value, "<get-executor>(...)");
        return (ExecutorService) value;
    }
}
