package g;

import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import g.u;
import g.w;
import java.lang.ref.WeakReference;
import java.util.Iterator;
/* compiled from: AppCompatDelegate.java */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: u  reason: collision with root package name */
    public static final w.a f16054u = new w.a(new w.b());

    /* renamed from: v  reason: collision with root package name */
    public static final int f16055v = -100;

    /* renamed from: w  reason: collision with root package name */
    public static o0.g f16056w = null;

    /* renamed from: x  reason: collision with root package name */
    public static o0.g f16057x = null;

    /* renamed from: y  reason: collision with root package name */
    public static Boolean f16058y = null;

    /* renamed from: z  reason: collision with root package name */
    public static boolean f16059z = false;
    public static final t.d<WeakReference<j>> A = new t.d<>();
    public static final Object B = new Object();
    public static final Object C = new Object();

    /* compiled from: AppCompatDelegate.java */
    /* loaded from: classes.dex */
    public static class a {
        public static LocaleList a(String str) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(str);
            return forLanguageTags;
        }
    }

    /* compiled from: AppCompatDelegate.java */
    /* loaded from: classes.dex */
    public static class b {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    public static boolean l(Context context) {
        int i6;
        if (f16058y == null) {
            try {
                int i10 = u.f16134u;
                if (Build.VERSION.SDK_INT >= 24) {
                    i6 = u.a.a() | 128;
                } else {
                    i6 = 640;
                }
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, u.class), i6).metaData;
                if (bundle != null) {
                    f16058y = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f16058y = Boolean.FALSE;
            }
        }
        return f16058y.booleanValue();
    }

    public static void s(j jVar) {
        synchronized (B) {
            Iterator<WeakReference<j>> it = A.iterator();
            while (it.hasNext()) {
                j jVar2 = it.next().get();
                if (jVar2 == jVar || jVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public abstract <T extends View> T e(int i6);

    public Context f() {
        return null;
    }

    public int g() {
        return -100;
    }

    public abstract MenuInflater h();

    public abstract g.a i();

    public abstract void j();

    public abstract void k();

    public abstract void m(Configuration configuration);

    public abstract void n();

    public abstract void o();

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public abstract boolean t(int i6);

    public abstract void u(int i6);

    public abstract void v(View view);

    public abstract void w(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void x(Toolbar toolbar);

    public abstract void z(CharSequence charSequence);

    public Context d(Context context) {
        return context;
    }

    public void y(int i6) {
    }
}
