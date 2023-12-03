package i0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import g.v;
import i0.d;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: ResourcesCompat.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f19628a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap<d, SparseArray<c>> f19629b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f19630c = new Object();

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static Drawable a(Resources resources, int i6, Resources.Theme theme) {
            return resources.getDrawable(i6, theme);
        }

        public static Drawable b(Resources resources, int i6, int i10, Resources.Theme theme) {
            return resources.getDrawableForDensity(i6, i10, theme);
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static int a(Resources resources, int i6, Resources.Theme theme) {
            int color;
            color = resources.getColor(i6, theme);
            return color;
        }

        public static ColorStateList b(Resources resources, int i6, Resources.Theme theme) {
            ColorStateList colorStateList;
            colorStateList = resources.getColorStateList(i6, theme);
            return colorStateList;
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final ColorStateList f19631a;

        /* renamed from: b  reason: collision with root package name */
        public final Configuration f19632b;

        /* renamed from: c  reason: collision with root package name */
        public final int f19633c;

        public c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            int hashCode;
            this.f19631a = colorStateList;
            this.f19632b = configuration;
            if (theme == null) {
                hashCode = 0;
            } else {
                hashCode = theme.hashCode();
            }
            this.f19633c = hashCode;
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f19634a;

        /* renamed from: b  reason: collision with root package name */
        public final Resources.Theme f19635b;

        public d(Resources resources, Resources.Theme theme) {
            this.f19634a = resources;
            this.f19635b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f19634a.equals(dVar.f19634a) && s0.b.a(this.f19635b, dVar.f19635b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return s0.b.b(this.f19634a, this.f19635b);
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static abstract class e {
        public final void a(int i6) {
            new Handler(Looper.getMainLooper()).post(new g(i6, 0, this));
        }

        public final void b(Typeface typeface) {
            new Handler(Looper.getMainLooper()).post(new v(this, 2, typeface));
        }

        public abstract void c(int i6);

        public abstract void d(Typeface typeface);
    }

    /* compiled from: ResourcesCompat.java */
    /* renamed from: i0.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0298f {

        /* compiled from: ResourcesCompat.java */
        /* renamed from: i0.f$f$a */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public static final Object f19636a = new Object();

            /* renamed from: b  reason: collision with root package name */
            public static Method f19637b;

            /* renamed from: c  reason: collision with root package name */
            public static boolean f19638c;
        }

        /* compiled from: ResourcesCompat.java */
        /* renamed from: i0.f$f$b */
        /* loaded from: classes.dex */
        public static class b {
            public static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 29) {
                b.a(theme);
            } else if (i6 >= 23) {
                synchronized (a.f19636a) {
                    if (!a.f19638c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            a.f19637b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e10) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e10);
                        }
                        a.f19638c = true;
                    }
                    Method method = a.f19637b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e11) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e11);
                            a.f19637b = null;
                        }
                    }
                }
            }
        }
    }

    public static void a(d dVar, int i6, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f19630c) {
            WeakHashMap<d, SparseArray<c>> weakHashMap = f19629b;
            SparseArray<c> sparseArray = weakHashMap.get(dVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(dVar, sparseArray);
            }
            sparseArray.append(i6, new c(colorStateList, dVar.f19634a.getConfiguration(), theme));
        }
    }

    public static Typeface b(int i6, Context context) {
        if (context.isRestricted()) {
            return null;
        }
        return c(context, i6, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface c(Context context, int i6, TypedValue typedValue, int i10, e eVar, boolean z10, boolean z11) {
        Typeface b10;
        Resources resources = context.getResources();
        resources.getValue(i6, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            if (!charSequence2.startsWith("res/")) {
                if (eVar != null) {
                    eVar.a(-3);
                }
            } else {
                int i11 = typedValue.assetCookie;
                t.f<String, Typeface> fVar = j0.h.f21631b;
                b10 = fVar.b(j0.h.b(resources, i6, charSequence2, i11, i10));
                if (b10 != null) {
                    if (eVar != null) {
                        eVar.b(b10);
                    }
                } else if (!z11) {
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            d.b a10 = i0.d.a(resources.getXml(i6), resources);
                            if (a10 == null) {
                                Log.e("ResourcesCompat", "Failed to find font-family tag");
                                if (eVar != null) {
                                    eVar.a(-3);
                                }
                            } else {
                                b10 = j0.h.a(context, a10, resources, i6, charSequence2, typedValue.assetCookie, i10, eVar, z10);
                            }
                        } else {
                            int i12 = typedValue.assetCookie;
                            b10 = j0.h.f21630a.d(context, resources, i6, charSequence2, i10);
                            if (b10 != null) {
                                fVar.c(j0.h.b(resources, i6, charSequence2, i12, i10), b10);
                            }
                            if (eVar != null) {
                                if (b10 != null) {
                                    eVar.b(b10);
                                } else {
                                    eVar.a(-3);
                                }
                            }
                        }
                    } catch (IOException e10) {
                        Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e10);
                        if (eVar != null) {
                            eVar.a(-3);
                        }
                        b10 = null;
                        if (b10 != null) {
                        }
                        return b10;
                    } catch (XmlPullParserException e11) {
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e11);
                        if (eVar != null) {
                        }
                        b10 = null;
                        if (b10 != null) {
                        }
                        return b10;
                    }
                }
                if (b10 != null && eVar == null && !z11) {
                    throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i6) + " could not be retrieved.");
                }
                return b10;
            }
            b10 = null;
            if (b10 != null) {
            }
            return b10;
        }
        throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i6) + "\" (" + Integer.toHexString(i6) + ") is not a Font: " + typedValue);
    }
}
