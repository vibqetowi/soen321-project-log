package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.j;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import java.lang.reflect.Field;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements n {

    /* renamed from: v  reason: collision with root package name */
    public static int f937v;

    /* renamed from: w  reason: collision with root package name */
    public static Field f938w;

    /* renamed from: x  reason: collision with root package name */
    public static Field f939x;

    /* renamed from: y  reason: collision with root package name */
    public static Field f940y;

    /* renamed from: u  reason: collision with root package name */
    public final Activity f941u;

    public ImmLeaksCleaner(Activity activity) {
        this.f941u = activity;
    }

    @Override // androidx.lifecycle.n
    public final void c(p pVar, j.b bVar) {
        if (bVar != j.b.ON_DESTROY) {
            return;
        }
        if (f937v == 0) {
            try {
                f937v = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f939x = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f940y = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f938w = declaredField3;
                declaredField3.setAccessible(true);
                f937v = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f937v == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f941u.getSystemService("input_method");
            try {
                Object obj = f938w.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f939x.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f940y.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } catch (ClassCastException unused3) {
                    } catch (IllegalAccessException unused4) {
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
