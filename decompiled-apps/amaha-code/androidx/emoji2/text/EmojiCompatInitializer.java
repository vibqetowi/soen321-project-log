package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.f;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o0.k;
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements e2.b<Boolean> {

    /* loaded from: classes.dex */
    public static class a extends f.c {
        public a(Context context) {
            super(new b(context));
            this.f2046b = 1;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements f.g {

        /* renamed from: a  reason: collision with root package name */
        public final Context f2027a;

        public b(Context context) {
            this.f2027a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.f.g
        public final void a(f.h hVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer", 0));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new g(0, this, hVar, threadPoolExecutor));
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            try {
                int i6 = o0.k.f26897a;
                k.a.a("EmojiCompat.EmojiCompatInitializer.run");
                if (f.f2034j != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    f.a().c();
                }
                k.a.b();
            } catch (Throwable th2) {
                int i10 = o0.k.f26897a;
                k.a.b();
                throw th2;
            }
        }
    }

    @Override // e2.b
    public final List<Class<? extends e2.b<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // e2.b
    /* renamed from: c */
    public final Boolean b(Context context) {
        a aVar = new a(context);
        if (f.f2034j == null) {
            synchronized (f.f2033i) {
                if (f.f2034j == null) {
                    f.f2034j = new f(aVar);
                }
            }
        }
        d(context);
        return Boolean.TRUE;
    }

    public final void d(Context context) {
        Object obj;
        e2.a c10 = e2.a.c(context);
        c10.getClass();
        synchronized (e2.a.f13725e) {
            try {
                obj = c10.f13726a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c10.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        final androidx.lifecycle.j lifecycle = ((androidx.lifecycle.p) obj).getLifecycle();
        lifecycle.a(new androidx.lifecycle.f() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.f
            public final void a(androidx.lifecycle.p pVar) {
                Handler handler;
                EmojiCompatInitializer.this.getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = androidx.emoji2.text.b.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new c(), 500L);
                lifecycle.c(this);
            }

            @Override // androidx.lifecycle.f
            public final /* synthetic */ void b(androidx.lifecycle.p pVar) {
            }

            @Override // androidx.lifecycle.f
            public final /* synthetic */ void d(androidx.lifecycle.p pVar) {
            }

            @Override // androidx.lifecycle.f
            public final /* synthetic */ void e(androidx.lifecycle.p pVar) {
            }

            @Override // androidx.lifecycle.f
            public final /* synthetic */ void f(androidx.lifecycle.p pVar) {
            }

            @Override // androidx.lifecycle.f
            public final /* synthetic */ void g(androidx.lifecycle.p pVar) {
            }
        });
    }
}
