package androidx.work;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: Configuration.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f3214a;

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f3215b;

    /* renamed from: c  reason: collision with root package name */
    public final x f3216c;

    /* renamed from: d  reason: collision with root package name */
    public final j f3217d;

    /* renamed from: e  reason: collision with root package name */
    public final g.x f3218e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3219g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3220h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3221i;

    /* compiled from: Configuration.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f3222a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f3223b = SubsamplingScaleImageView.TILE_SIZE_AUTO;
    }

    /* compiled from: Configuration.java */
    /* renamed from: androidx.work.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0040b {
        b a();
    }

    public b(a aVar) {
        aVar.getClass();
        this.f3214a = a(false);
        this.f3215b = a(true);
        String str = y.f3357a;
        this.f3216c = new x();
        this.f3217d = new j();
        this.f3218e = new g.x(3);
        this.f = 4;
        this.f3219g = aVar.f3222a;
        this.f3220h = aVar.f3223b;
        this.f3221i = 20;
    }

    public static ExecutorService a(boolean z10) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new androidx.work.a(z10));
    }
}
