package f0;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
/* compiled from: ActivityRecreator.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f14624a;

    /* renamed from: b  reason: collision with root package name */
    public static final Field f14625b;

    /* renamed from: c  reason: collision with root package name */
    public static final Field f14626c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f14627d;

    /* renamed from: e  reason: collision with root package name */
    public static final Method f14628e;
    public static final Method f;

    /* renamed from: g  reason: collision with root package name */
    public static final Handler f14629g = new Handler(Looper.getMainLooper());

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Class<?> cls;
        Field field;
        Field field2;
        Method declaredMethod;
        Class<?> cls2;
        Method method;
        Class<?> cls3;
        int i6;
        boolean z10;
        Method method2 = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f14624a = cls;
        try {
            field = Activity.class.getDeclaredField("mMainThread");
            field.setAccessible(true);
        } catch (Throwable unused2) {
            field = null;
        }
        f14625b = field;
        try {
            field2 = Activity.class.getDeclaredField("mToken");
            field2.setAccessible(true);
        } catch (Throwable unused3) {
            field2 = null;
        }
        f14626c = field2;
        Class<?> cls4 = f14624a;
        if (cls4 != null) {
            try {
                declaredMethod = cls4.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
            }
            f14627d = declaredMethod;
            cls2 = f14624a;
            if (cls2 != null) {
                try {
                    method = cls2.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
                    method.setAccessible(true);
                } catch (Throwable unused5) {
                    method = null;
                }
                f14628e = method;
                cls3 = f14624a;
                i6 = Build.VERSION.SDK_INT;
                if (i6 == 26 && i6 != 27) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10 && cls3 != null) {
                    try {
                        Class<?> cls5 = Boolean.TYPE;
                        Method declaredMethod2 = cls3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls5, Configuration.class, Configuration.class, cls5, cls5);
                        declaredMethod2.setAccessible(true);
                        method2 = declaredMethod2;
                    } catch (Throwable unused6) {
                    }
                }
                f = method2;
            }
            method = null;
            f14628e = method;
            cls3 = f14624a;
            i6 = Build.VERSION.SDK_INT;
            if (i6 == 26) {
            }
            z10 = true;
            if (z10) {
                Class<?> cls52 = Boolean.TYPE;
                Method declaredMethod22 = cls3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls52, Configuration.class, Configuration.class, cls52, cls52);
                declaredMethod22.setAccessible(true);
                method2 = declaredMethod22;
            }
            f = method2;
        }
        declaredMethod = null;
        f14627d = declaredMethod;
        cls2 = f14624a;
        if (cls2 != null) {
        }
        method = null;
        f14628e = method;
        cls3 = f14624a;
        i6 = Build.VERSION.SDK_INT;
        if (i6 == 26) {
        }
        z10 = true;
        if (z10) {
        }
        f = method2;
    }

    /* compiled from: ActivityRecreator.java */
    /* loaded from: classes.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: u  reason: collision with root package name */
        public Object f14630u;

        /* renamed from: v  reason: collision with root package name */
        public Activity f14631v;

        /* renamed from: w  reason: collision with root package name */
        public final int f14632w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f14633x = false;

        /* renamed from: y  reason: collision with root package name */
        public boolean f14634y = false;

        /* renamed from: z  reason: collision with root package name */
        public boolean f14635z = false;

        public a(Activity activity) {
            this.f14631v = activity;
            this.f14632w = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            if (this.f14631v == activity) {
                this.f14631v = null;
                this.f14634y = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            if (this.f14634y && !this.f14635z && !this.f14633x) {
                Object obj = this.f14630u;
                boolean z10 = false;
                try {
                    Object obj2 = g.f14626c.get(activity);
                    if (obj2 == obj && activity.hashCode() == this.f14632w) {
                        g.f14629g.postAtFrontOfQueue(new f(g.f14625b.get(activity), obj2));
                        z10 = true;
                    }
                } catch (Throwable th2) {
                    Log.e("ActivityRecreator", "Exception while fetching field values", th2);
                }
                if (z10) {
                    this.f14635z = true;
                    this.f14630u = null;
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            if (this.f14631v == activity) {
                this.f14633x = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
