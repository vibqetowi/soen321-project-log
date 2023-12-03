package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.appsflyer.R;
/* compiled from: ContextThemeWrapper.java */
/* loaded from: classes.dex */
public final class c extends ContextWrapper {
    public static Configuration f;

    /* renamed from: a  reason: collision with root package name */
    public int f22696a;

    /* renamed from: b  reason: collision with root package name */
    public Resources.Theme f22697b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f22698c;

    /* renamed from: d  reason: collision with root package name */
    public Configuration f22699d;

    /* renamed from: e  reason: collision with root package name */
    public Resources f22700e;

    /* compiled from: ContextThemeWrapper.java */
    /* loaded from: classes.dex */
    public static class a {
        public static Context a(c cVar, Configuration configuration) {
            return cVar.createConfigurationContext(configuration);
        }
    }

    public c() {
        super(null);
    }

    public final void a(Configuration configuration) {
        if (this.f22700e == null) {
            if (this.f22699d == null) {
                this.f22699d = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        boolean z10;
        if (this.f22697b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f22697b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f22697b.setTo(theme);
            }
        }
        this.f22697b.applyStyle(this.f22696a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r0.equals(k.c.f) != false) goto L13;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Resources getResources() {
        if (this.f22700e == null) {
            Configuration configuration = this.f22699d;
            if (configuration != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f = configuration2;
                    }
                }
                this.f22700e = a.a(this, this.f22699d).getResources();
            }
            this.f22700e = super.getResources();
        }
        return this.f22700e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f22698c == null) {
                this.f22698c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f22698c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f22697b;
        if (theme != null) {
            return theme;
        }
        if (this.f22696a == 0) {
            this.f22696a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f22697b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i6) {
        if (this.f22696a != i6) {
            this.f22696a = i6;
            b();
        }
    }

    public c(Context context, int i6) {
        super(context);
        this.f22696a = i6;
    }

    public c(Context context, Resources.Theme theme) {
        super(context);
        this.f22697b = theme;
    }
}
