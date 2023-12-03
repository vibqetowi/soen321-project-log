package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.i0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: AppCompatViewInflater.java */
/* loaded from: classes.dex */
public class t {

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?>[] f16123b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f16124c = {16843375};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f16125d = {16844160};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f16126e = {16844156};
    public static final int[] f = {16844148};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f16127g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h  reason: collision with root package name */
    public static final t.h<String, Constructor<? extends View>> f16128h = new t.h<>();

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f16129a = new Object[2];

    /* compiled from: AppCompatViewInflater.java */
    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {

        /* renamed from: u  reason: collision with root package name */
        public final View f16130u;

        /* renamed from: v  reason: collision with root package name */
        public final String f16131v;

        /* renamed from: w  reason: collision with root package name */
        public Method f16132w;

        /* renamed from: x  reason: collision with root package name */
        public Context f16133x;

        public a(View view, String str) {
            this.f16130u = view;
            this.f16131v = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int id2;
            String str;
            Method method;
            if (this.f16132w == null) {
                View view2 = this.f16130u;
                Context context = view2.getContext();
                while (true) {
                    String str2 = this.f16131v;
                    if (context != null) {
                        try {
                            if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                                this.f16132w = method;
                                this.f16133x = context;
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                        if (context instanceof ContextWrapper) {
                            context = ((ContextWrapper) context).getBaseContext();
                        } else {
                            context = null;
                        }
                    } else {
                        if (view2.getId() == -1) {
                            str = "";
                        } else {
                            str = " with id '" + view2.getContext().getResources().getResourceEntryName(id2) + "'";
                        }
                        StringBuilder g5 = defpackage.d.g("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                        g5.append(view2.getClass());
                        g5.append(str);
                        throw new IllegalStateException(g5.toString());
                    }
                }
            }
            try {
                this.f16132w.invoke(this.f16133x, view);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    public androidx.appcompat.widget.d a(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.d(context, attributeSet);
    }

    public androidx.appcompat.widget.f b(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.f(context, attributeSet);
    }

    public AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    public androidx.appcompat.widget.t d(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.t(context, attributeSet);
    }

    public i0 e(Context context, AttributeSet attributeSet) {
        return new i0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        t.h<String, Constructor<? extends View>> hVar = f16128h;
        Constructor<? extends View> orDefault = hVar.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            orDefault = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f16123b);
            hVar.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return orDefault.newInstance(this.f16129a);
    }

    public final void g(TextView textView, String str) {
        if (textView != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
