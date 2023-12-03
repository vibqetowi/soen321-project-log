package df;

import android.util.Log;
import java.util.Locale;
/* compiled from: AndroidLogger.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static volatile a f12835c;

    /* renamed from: a  reason: collision with root package name */
    public final b f12836a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12837b = false;

    public a() {
        b bVar;
        synchronized (b.class) {
            if (b.f12838v == null) {
                b.f12838v = new b(0);
            }
            bVar = b.f12838v;
        }
        this.f12836a = bVar;
    }

    public static a d() {
        if (f12835c == null) {
            synchronized (a.class) {
                if (f12835c == null) {
                    f12835c = new a();
                }
            }
        }
        return f12835c;
    }

    public final void a(String str) {
        if (this.f12837b) {
            this.f12836a.getClass();
            Log.d("FirebasePerformance", str);
        }
    }

    public final void b(String str, Object... objArr) {
        if (this.f12837b) {
            String format = String.format(Locale.ENGLISH, str, objArr);
            this.f12836a.getClass();
            Log.d("FirebasePerformance", format);
        }
    }

    public final void c(String str, Object... objArr) {
        if (this.f12837b) {
            String format = String.format(Locale.ENGLISH, str, objArr);
            this.f12836a.getClass();
            Log.e("FirebasePerformance", format);
        }
    }

    public final void e(String str, Object... objArr) {
        if (this.f12837b) {
            String format = String.format(Locale.ENGLISH, str, objArr);
            this.f12836a.getClass();
            Log.i("FirebasePerformance", format);
        }
    }

    public final void f(String str) {
        if (this.f12837b) {
            this.f12836a.getClass();
            Log.w("FirebasePerformance", str);
        }
    }

    public final void g(String str, Object... objArr) {
        if (this.f12837b) {
            String format = String.format(Locale.ENGLISH, str, objArr);
            this.f12836a.getClass();
            Log.w("FirebasePerformance", format);
        }
    }
}
