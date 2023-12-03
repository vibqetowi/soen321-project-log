package mi;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import hh.g;
import java.lang.ref.WeakReference;
import java.util.HashSet;
/* compiled from: InAppModuleManager.kt */
/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: d  reason: collision with root package name */
    public static WeakReference<Activity> f25218d;
    public static boolean f;

    /* renamed from: a  reason: collision with root package name */
    public static final Object f25215a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f25216b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final Object f25217c = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final HashSet<String> f25219e = new HashSet<>();

    /* compiled from: InAppModuleManager.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ pi.d f25220u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pi.d dVar) {
            super(0);
            this.f25220u = dVar;
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(this.f25220u.b(), "InApp_6.5.0_InAppModuleManager addInAppToViewHierarchy(): another campaign visible, cannot show campaign ");
        }
    }

    /* compiled from: InAppModuleManager.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f25221u = new b();

        public b() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "InApp_6.5.0_InAppModuleManager resetShowInAppShowState(): ";
        }
    }

    public static void a(FrameLayout frameLayout, View view, pi.d dVar, boolean z10) {
        synchronized (f25216b) {
            if (f && !z10) {
                hh.a aVar = hh.g.f17610d;
                g.a.b(0, new a(dVar), 3);
                return;
            }
            frameLayout.addView(view);
            e(true);
            hs.k kVar = hs.k.f19476a;
        }
    }

    public static Activity b() {
        WeakReference<Activity> weakReference = f25218d;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static String c() {
        Activity activity;
        WeakReference<Activity> weakReference = f25218d;
        if (weakReference == null) {
            activity = null;
        } else {
            activity = weakReference.get();
        }
        if (activity == null) {
            return null;
        }
        return activity.getClass().getName();
    }

    public static void d() {
        try {
            synchronized (f25217c) {
                i1.f25206a.getClass();
                for (vi.a aVar : i1.f25210e.values()) {
                    ad.h hVar = new ad.h(null, -1, 4);
                    aVar.getClass();
                    aVar.f35175h = hVar;
                }
                hs.k kVar = hs.k.f19476a;
            }
        } catch (Throwable th2) {
            hh.a aVar2 = hh.g.f17610d;
            g.a.a(1, th2, b.f25221u);
        }
    }

    public static void e(boolean z10) {
        synchronized (f25215a) {
            f = z10;
            hs.k kVar = hs.k.f19476a;
        }
    }
}
