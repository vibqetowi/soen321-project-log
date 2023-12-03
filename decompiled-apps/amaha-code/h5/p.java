package h5;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.util.Log;
import com.facebook.FacebookException;
import h5.a;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import w5.b;
import w5.l;
/* compiled from: FacebookSdk.kt */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: c  reason: collision with root package name */
    public static Executor f17271c;

    /* renamed from: d  reason: collision with root package name */
    public static volatile String f17272d;

    /* renamed from: e  reason: collision with root package name */
    public static volatile String f17273e;
    public static volatile String f;

    /* renamed from: g  reason: collision with root package name */
    public static volatile Boolean f17274g;

    /* renamed from: i  reason: collision with root package name */
    public static Context f17276i;

    /* renamed from: l  reason: collision with root package name */
    public static final String f17279l;

    /* renamed from: m  reason: collision with root package name */
    public static boolean f17280m;

    /* renamed from: n  reason: collision with root package name */
    public static boolean f17281n;

    /* renamed from: o  reason: collision with root package name */
    public static boolean f17282o;

    /* renamed from: p  reason: collision with root package name */
    public static final AtomicBoolean f17283p;

    /* renamed from: q  reason: collision with root package name */
    public static volatile String f17284q;
    public static volatile String r;

    /* renamed from: s  reason: collision with root package name */
    public static final p7.b f17285s;

    /* renamed from: t  reason: collision with root package name */
    public static boolean f17286t;

    /* renamed from: a  reason: collision with root package name */
    public static final p f17269a = new p();

    /* renamed from: b  reason: collision with root package name */
    public static final HashSet<w> f17270b = ca.a.w0(w.DEVELOPER_ERRORS);

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicLong f17275h = new AtomicLong(65536);

    /* renamed from: j  reason: collision with root package name */
    public static int f17277j = 64206;

    /* renamed from: k  reason: collision with root package name */
    public static final ReentrantLock f17278k = new ReentrantLock();

    static {
        int i6 = w5.a0.f36434a;
        f17279l = "v16.0";
        f17283p = new AtomicBoolean(false);
        f17284q = "instagram.com";
        r = "facebook.com";
        f17285s = new p7.b(6);
    }

    public static final Context a() {
        w5.f0.e();
        Context context = f17276i;
        if (context != null) {
            return context;
        }
        kotlin.jvm.internal.i.q("applicationContext");
        throw null;
    }

    public static final String b() {
        w5.f0.e();
        String str = f17272d;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final Executor c() {
        ReentrantLock reentrantLock = f17278k;
        reentrantLock.lock();
        try {
            if (f17271c == null) {
                f17271c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            hs.k kVar = hs.k.f19476a;
            reentrantLock.unlock();
            Executor executor = f17271c;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String d() {
        w5.e0 e0Var = w5.e0.f36453a;
        String str = f17279l;
        kotlin.jvm.internal.i.f(String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{str}, 1)), "java.lang.String.format(format, *args)");
        return str;
    }

    public static final String e() {
        String str;
        Date date = a.F;
        a b10 = a.b.b();
        if (b10 != null) {
            str = b10.E;
        } else {
            str = null;
        }
        w5.e0 e0Var = w5.e0.f36453a;
        String str2 = r;
        if (str != null) {
            if (kotlin.jvm.internal.i.b(str, "gaming")) {
                return gv.n.F0(str2, "facebook.com", "fb.gg");
            }
            if (kotlin.jvm.internal.i.b(str, "instagram")) {
                return gv.n.F0(str2, "facebook.com", "instagram.com");
            }
            return str2;
        }
        return str2;
    }

    public static final boolean f(Context context) {
        w5.f0.e();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static final synchronized boolean g() {
        boolean z10;
        synchronized (p.class) {
            z10 = f17286t;
        }
        return z10;
    }

    public static final boolean h() {
        return f17283p.get();
    }

    public static final void i(w behavior) {
        kotlin.jvm.internal.i.g(behavior, "behavior");
        synchronized (f17270b) {
        }
    }

    public static final void j(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            kotlin.jvm.internal.i.f(applicationInfo, "try {\n          context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)\n        } catch (e: PackageManager.NameNotFoundException) {\n          return\n        }");
            if (applicationInfo.metaData == null) {
                return;
            }
            if (f17272d == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale ROOT = Locale.ROOT;
                    kotlin.jvm.internal.i.f(ROOT, "ROOT");
                    String lowerCase = str.toLowerCase(ROOT);
                    kotlin.jvm.internal.i.f(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (gv.n.H0(lowerCase, "fb")) {
                        String substring = str.substring(2);
                        kotlin.jvm.internal.i.f(substring, "(this as java.lang.String).substring(startIndex)");
                        f17272d = substring;
                    } else {
                        f17272d = str;
                    }
                } else if (obj instanceof Number) {
                    throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (f17273e == null) {
                f17273e = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (f == null) {
                f = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (f17277j == 64206) {
                f17277j = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (f17274g == null) {
                f17274g = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static final synchronized void k(Context context) {
        synchronized (p.class) {
            l(context);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0027 A[Catch: all -> 0x015b, TRY_ENTER, TryCatch #2 {, blocks: (B:4:0x0003, B:8:0x000d, B:10:0x0017, B:11:0x001e, B:16:0x0027, B:17:0x002e, B:19:0x0039, B:20:0x0040, B:22:0x0052, B:24:0x005a, B:30:0x0066, B:32:0x006a, B:38:0x0076, B:46:0x0098, B:47:0x009a, B:49:0x009e, B:51:0x00a2, B:53:0x00a8, B:55:0x00ae, B:56:0x00b6, B:57:0x00bb, B:58:0x00bc, B:60:0x00c8, B:63:0x0139, B:64:0x013e, B:65:0x013f, B:66:0x0144, B:67:0x0145, B:68:0x014c, B:69:0x014d, B:70:0x0154, B:71:0x0155, B:72:0x015a, B:41:0x0086), top: B:78:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039 A[Catch: all -> 0x015b, TryCatch #2 {, blocks: (B:4:0x0003, B:8:0x000d, B:10:0x0017, B:11:0x001e, B:16:0x0027, B:17:0x002e, B:19:0x0039, B:20:0x0040, B:22:0x0052, B:24:0x005a, B:30:0x0066, B:32:0x006a, B:38:0x0076, B:46:0x0098, B:47:0x009a, B:49:0x009e, B:51:0x00a2, B:53:0x00a8, B:55:0x00ae, B:56:0x00b6, B:57:0x00bb, B:58:0x00bc, B:60:0x00c8, B:63:0x0139, B:64:0x013e, B:65:0x013f, B:66:0x0144, B:67:0x0145, B:68:0x014c, B:69:0x014d, B:70:0x0154, B:71:0x0155, B:72:0x015a, B:41:0x0086), top: B:78:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052 A[Catch: all -> 0x015b, TryCatch #2 {, blocks: (B:4:0x0003, B:8:0x000d, B:10:0x0017, B:11:0x001e, B:16:0x0027, B:17:0x002e, B:19:0x0039, B:20:0x0040, B:22:0x0052, B:24:0x005a, B:30:0x0066, B:32:0x006a, B:38:0x0076, B:46:0x0098, B:47:0x009a, B:49:0x009e, B:51:0x00a2, B:53:0x00a8, B:55:0x00ae, B:56:0x00b6, B:57:0x00bb, B:58:0x00bc, B:60:0x00c8, B:63:0x0139, B:64:0x013e, B:65:0x013f, B:66:0x0144, B:67:0x0145, B:68:0x014c, B:69:0x014d, B:70:0x0154, B:71:0x0155, B:72:0x015a, B:41:0x0086), top: B:78:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066 A[Catch: all -> 0x015b, TryCatch #2 {, blocks: (B:4:0x0003, B:8:0x000d, B:10:0x0017, B:11:0x001e, B:16:0x0027, B:17:0x002e, B:19:0x0039, B:20:0x0040, B:22:0x0052, B:24:0x005a, B:30:0x0066, B:32:0x006a, B:38:0x0076, B:46:0x0098, B:47:0x009a, B:49:0x009e, B:51:0x00a2, B:53:0x00a8, B:55:0x00ae, B:56:0x00b6, B:57:0x00bb, B:58:0x00bc, B:60:0x00c8, B:63:0x0139, B:64:0x013e, B:65:0x013f, B:66:0x0144, B:67:0x0145, B:68:0x014c, B:69:0x014d, B:70:0x0154, B:71:0x0155, B:72:0x015a, B:41:0x0086), top: B:78:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076 A[Catch: all -> 0x015b, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:8:0x000d, B:10:0x0017, B:11:0x001e, B:16:0x0027, B:17:0x002e, B:19:0x0039, B:20:0x0040, B:22:0x0052, B:24:0x005a, B:30:0x0066, B:32:0x006a, B:38:0x0076, B:46:0x0098, B:47:0x009a, B:49:0x009e, B:51:0x00a2, B:53:0x00a8, B:55:0x00ae, B:56:0x00b6, B:57:0x00bb, B:58:0x00bc, B:60:0x00c8, B:63:0x0139, B:64:0x013e, B:65:0x013f, B:66:0x0144, B:67:0x0145, B:68:0x014c, B:69:0x014d, B:70:0x0154, B:71:0x0155, B:72:0x015a, B:41:0x0086), top: B:78:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0145 A[Catch: all -> 0x015b, TryCatch #2 {, blocks: (B:4:0x0003, B:8:0x000d, B:10:0x0017, B:11:0x001e, B:16:0x0027, B:17:0x002e, B:19:0x0039, B:20:0x0040, B:22:0x0052, B:24:0x005a, B:30:0x0066, B:32:0x006a, B:38:0x0076, B:46:0x0098, B:47:0x009a, B:49:0x009e, B:51:0x00a2, B:53:0x00a8, B:55:0x00ae, B:56:0x00b6, B:57:0x00bb, B:58:0x00bc, B:60:0x00c8, B:63:0x0139, B:64:0x013e, B:65:0x013f, B:66:0x0144, B:67:0x0145, B:68:0x014c, B:69:0x014d, B:70:0x0154, B:71:0x0155, B:72:0x015a, B:41:0x0086), top: B:78:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014d A[Catch: all -> 0x015b, TryCatch #2 {, blocks: (B:4:0x0003, B:8:0x000d, B:10:0x0017, B:11:0x001e, B:16:0x0027, B:17:0x002e, B:19:0x0039, B:20:0x0040, B:22:0x0052, B:24:0x005a, B:30:0x0066, B:32:0x006a, B:38:0x0076, B:46:0x0098, B:47:0x009a, B:49:0x009e, B:51:0x00a2, B:53:0x00a8, B:55:0x00ae, B:56:0x00b6, B:57:0x00bb, B:58:0x00bc, B:60:0x00c8, B:63:0x0139, B:64:0x013e, B:65:0x013f, B:66:0x0144, B:67:0x0145, B:68:0x014c, B:69:0x014d, B:70:0x0154, B:71:0x0155, B:72:0x015a, B:41:0x0086), top: B:78:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0155 A[Catch: all -> 0x015b, TryCatch #2 {, blocks: (B:4:0x0003, B:8:0x000d, B:10:0x0017, B:11:0x001e, B:16:0x0027, B:17:0x002e, B:19:0x0039, B:20:0x0040, B:22:0x0052, B:24:0x005a, B:30:0x0066, B:32:0x006a, B:38:0x0076, B:46:0x0098, B:47:0x009a, B:49:0x009e, B:51:0x00a2, B:53:0x00a8, B:55:0x00ae, B:56:0x00b6, B:57:0x00bb, B:58:0x00bc, B:60:0x00c8, B:63:0x0139, B:64:0x013e, B:65:0x013f, B:66:0x0144, B:67:0x0145, B:68:0x014c, B:69:0x014d, B:70:0x0154, B:71:0x0155, B:72:0x015a, B:41:0x0086), top: B:78:0x0003 }] */
    /* JADX WARN: Type inference failed for: r1v14, types: [h5.o] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final synchronized void l(Context context) {
        ActivityInfo activityInfo;
        Context context2;
        boolean z10;
        boolean z11;
        synchronized (p.class) {
            if (f17283p.get()) {
                return;
            }
            String str = w5.f0.f36461a;
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                try {
                    activityInfo = packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (activityInfo == null) {
                    Log.w(w5.f0.f36461a, "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
                }
                String str2 = w5.f0.f36461a;
                if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
                    Log.w(w5.f0.f36461a, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
                }
                Context applicationContext = context.getApplicationContext();
                kotlin.jvm.internal.i.f(applicationContext, "applicationContext.applicationContext");
                f17276i = applicationContext;
                kc.f.D(context);
                context2 = f17276i;
                if (context2 == null) {
                    j(context2);
                    String str3 = f17272d;
                    boolean z12 = false;
                    if (str3 != null && str3.length() != 0) {
                        z10 = false;
                        if (z10) {
                            String str4 = f;
                            if (str4 != null && str4.length() != 0) {
                                z11 = false;
                                if (z11) {
                                    f17283p.set(true);
                                    g0 g0Var = g0.f17231a;
                                    if (!b6.a.b(g0.class)) {
                                        g0.f17231a.d();
                                        z12 = g0.f17235e.a();
                                    }
                                    if (z12) {
                                        f17286t = true;
                                    }
                                    Context context3 = f17276i;
                                    if (context3 != null) {
                                        if ((context3 instanceof Application) && g0.b()) {
                                            q5.c cVar = q5.c.f29137a;
                                            Context context4 = f17276i;
                                            if (context4 != null) {
                                                q5.c.b((Application) context4, f17272d);
                                            } else {
                                                kotlin.jvm.internal.i.q("applicationContext");
                                                throw null;
                                            }
                                        }
                                        w5.p.c();
                                        w5.w.k();
                                        w5.b bVar = w5.b.f36435b;
                                        Context context5 = f17276i;
                                        if (context5 != null) {
                                            b.a.a(context5);
                                            new androidx.appcompat.widget.l((o) new Callable() { // from class: h5.o
                                                @Override // java.util.concurrent.Callable
                                                public final Object call() {
                                                    Context context6 = p.f17276i;
                                                    if (context6 != null) {
                                                        return context6.getCacheDir();
                                                    }
                                                    kotlin.jvm.internal.i.q("applicationContext");
                                                    throw null;
                                                }
                                            });
                                            w5.l lVar = w5.l.f36497a;
                                            w5.n.c(new w5.m(new p7.b(1), l.b.Instrument));
                                            w5.n.c(new w5.m(new p7.b(2), l.b.AppEvents));
                                            w5.n.c(new w5.m(new p7.b(3), l.b.ChromeCustomTabsPrefetching));
                                            w5.n.c(new w5.m(new p7.b(4), l.b.IgnoreAppSwitchToLoggedOut));
                                            w5.n.c(new w5.m(new p7.b(5), l.b.BypassAppSwitch));
                                            c().execute(new FutureTask(new w2.f(1, null)));
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("applicationContext");
                                        throw null;
                                    }
                                    kotlin.jvm.internal.i.q("applicationContext");
                                    throw null;
                                }
                                throw new FacebookException("A valid Facebook app client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk.");
                            }
                            z11 = true;
                            if (z11) {
                            }
                        } else {
                            throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
                        }
                    }
                    z10 = true;
                    if (z10) {
                    }
                } else {
                    kotlin.jvm.internal.i.q("applicationContext");
                    throw null;
                }
            }
            activityInfo = null;
            if (activityInfo == null) {
            }
            String str22 = w5.f0.f36461a;
            if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            }
            Context applicationContext2 = context.getApplicationContext();
            kotlin.jvm.internal.i.f(applicationContext2, "applicationContext.applicationContext");
            f17276i = applicationContext2;
            kc.f.D(context);
            context2 = f17276i;
            if (context2 == null) {
            }
        }
    }
}
