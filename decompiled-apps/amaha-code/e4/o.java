package e4;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: VolleyLog.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f13792a = Log.isLoggable("Volley", 2);

    /* renamed from: b  reason: collision with root package name */
    public static final String f13793b = o.class.getName();

    /* compiled from: VolleyLog.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final boolean f13794c = o.f13792a;

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f13795a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public boolean f13796b = false;

        /* compiled from: VolleyLog.java */
        /* renamed from: e4.o$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0215a {

            /* renamed from: a  reason: collision with root package name */
            public final String f13797a;

            /* renamed from: b  reason: collision with root package name */
            public final long f13798b;

            /* renamed from: c  reason: collision with root package name */
            public final long f13799c;

            public C0215a(long j10, String str, long j11) {
                this.f13797a = str;
                this.f13798b = j10;
                this.f13799c = j11;
            }
        }

        public final synchronized void a(long j10, String str) {
            if (!this.f13796b) {
                this.f13795a.add(new C0215a(j10, str, SystemClock.elapsedRealtime()));
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        public final synchronized void b(String str) {
            long j10;
            this.f13796b = true;
            ArrayList arrayList = this.f13795a;
            if (arrayList.size() == 0) {
                j10 = 0;
            } else {
                j10 = ((C0215a) arrayList.get(arrayList.size() - 1)).f13799c - ((C0215a) arrayList.get(0)).f13799c;
            }
            if (j10 <= 0) {
                return;
            }
            long j11 = ((C0215a) this.f13795a.get(0)).f13799c;
            o.b("(%-4d ms) %s", Long.valueOf(j10), str);
            Iterator it = this.f13795a.iterator();
            while (it.hasNext()) {
                C0215a c0215a = (C0215a) it.next();
                long j12 = c0215a.f13799c;
                o.b("(+%-4d) [%2d] %s", Long.valueOf(j12 - j11), Long.valueOf(c0215a.f13798b), c0215a.f13797a);
                j11 = j12;
            }
        }

        public final void finalize() {
            if (!this.f13796b) {
                b("Request on the loose");
                o.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    public static String a(String str, Object... objArr) {
        String str2;
        String format = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i6 = 2;
        while (true) {
            if (i6 < stackTrace.length) {
                if (!stackTrace[i6].getClassName().equals(f13793b)) {
                    String className = stackTrace[i6].getClassName();
                    String substring = className.substring(className.lastIndexOf(46) + 1);
                    StringBuilder d10 = v.g.d(substring.substring(substring.lastIndexOf(36) + 1), ".");
                    d10.append(stackTrace[i6].getMethodName());
                    str2 = d10.toString();
                    break;
                }
                i6++;
            } else {
                str2 = "<unknown>";
                break;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, format);
    }

    public static void b(String str, Object... objArr) {
        Log.d("Volley", a(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e("Volley", a(str, objArr));
    }

    public static void d(String str, Object... objArr) {
        if (f13792a) {
            Log.v("Volley", a(str, objArr));
        }
    }
}
