package androidx.work;

import android.util.Log;
/* compiled from: Logger.java */
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f3333a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile q f3334b;

    /* compiled from: Logger.java */
    /* loaded from: classes.dex */
    public static class a extends q {

        /* renamed from: c  reason: collision with root package name */
        public final int f3335c;

        public a(int i6) {
            this.f3335c = i6;
        }

        @Override // androidx.work.q
        public final void a(String str, String str2) {
            if (this.f3335c <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // androidx.work.q
        public final void b(String str, String str2) {
            if (this.f3335c <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // androidx.work.q
        public final void c(String str, String str2, Throwable th2) {
            if (this.f3335c <= 6) {
                Log.e(str, str2, th2);
            }
        }

        @Override // androidx.work.q
        public final void e(String str, String str2) {
            if (this.f3335c <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // androidx.work.q
        public final void g(String str, String str2) {
            if (this.f3335c <= 5) {
                Log.w(str, str2);
            }
        }
    }

    public static q d() {
        q qVar;
        synchronized (f3333a) {
            if (f3334b == null) {
                f3334b = new a(3);
            }
            qVar = f3334b;
        }
        return qVar;
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2);

    public abstract void c(String str, String str2, Throwable th2);

    public abstract void e(String str, String str2);

    public abstract void g(String str, String str2);
}
