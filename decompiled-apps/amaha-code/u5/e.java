package u5;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.i;
/* compiled from: ViewObserver.kt */
/* loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: x  reason: collision with root package name */
    public static final HashMap f33823x = new HashMap();

    /* renamed from: u  reason: collision with root package name */
    public final WeakReference<Activity> f33824u;

    /* renamed from: v  reason: collision with root package name */
    public final Handler f33825v = new Handler(Looper.getMainLooper());

    /* renamed from: w  reason: collision with root package name */
    public final AtomicBoolean f33826w = new AtomicBoolean(false);

    /* compiled from: ViewObserver.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(Activity activity) {
            i.g(activity, "activity");
            int hashCode = activity.hashCode();
            HashMap hashMap = e.f33823x;
            HashMap hashMap2 = null;
            if (!b6.a.b(e.class)) {
                try {
                    hashMap2 = e.f33823x;
                } catch (Throwable th2) {
                    b6.a.a(e.class, th2);
                }
            }
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = hashMap2.get(valueOf);
            if (obj == null) {
                obj = new e(activity);
                hashMap2.put(valueOf, obj);
            }
            e eVar = (e) obj;
            if (!b6.a.b(e.class)) {
                try {
                    if (!b6.a.b(eVar) && !eVar.f33826w.getAndSet(true)) {
                        int i6 = q5.d.f29148a;
                        View b10 = q5.d.b(eVar.f33824u.get());
                        if (b10 != null) {
                            ViewTreeObserver viewTreeObserver = b10.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.addOnGlobalLayoutListener(eVar);
                                eVar.a();
                            }
                        }
                    }
                } catch (Throwable th3) {
                    b6.a.a(e.class, th3);
                }
            }
        }

        public static void b(Activity activity) {
            i.g(activity, "activity");
            int hashCode = activity.hashCode();
            HashMap hashMap = e.f33823x;
            HashMap hashMap2 = null;
            if (!b6.a.b(e.class)) {
                try {
                    hashMap2 = e.f33823x;
                } catch (Throwable th2) {
                    b6.a.a(e.class, th2);
                }
            }
            e eVar = (e) hashMap2.remove(Integer.valueOf(hashCode));
            if (eVar != null && !b6.a.b(e.class)) {
                try {
                    if (!b6.a.b(eVar) && eVar.f33826w.getAndSet(false)) {
                        int i6 = q5.d.f29148a;
                        View b10 = q5.d.b(eVar.f33824u.get());
                        if (b10 != null) {
                            ViewTreeObserver viewTreeObserver = b10.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnGlobalLayoutListener(eVar);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    b6.a.a(e.class, th3);
                }
            }
        }
    }

    public e(Activity activity) {
        this.f33824u = new WeakReference<>(activity);
    }

    public final void a() {
        if (b6.a.b(this)) {
            return;
        }
        try {
            androidx.activity.b bVar = new androidx.activity.b(12, this);
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                bVar.run();
            } else {
                this.f33825v.post(bVar);
            }
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (b6.a.b(this)) {
            return;
        }
        try {
            a();
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }
}
