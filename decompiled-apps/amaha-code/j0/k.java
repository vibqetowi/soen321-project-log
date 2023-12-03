package j0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import i0.d;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: TypefaceCompatApi26Impl.java */
/* loaded from: classes.dex */
public class k extends i {
    public final Class<?> f;

    /* renamed from: g  reason: collision with root package name */
    public final Constructor<?> f21641g;

    /* renamed from: h  reason: collision with root package name */
    public final Method f21642h;

    /* renamed from: i  reason: collision with root package name */
    public final Method f21643i;

    /* renamed from: j  reason: collision with root package name */
    public final Method f21644j;

    /* renamed from: k  reason: collision with root package name */
    public final Method f21645k;

    /* renamed from: l  reason: collision with root package name */
    public final Method f21646l;

    public k() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = m(cls);
            method3 = n(cls);
            method4 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            method5 = o(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e10.getClass().getName()), e10);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f = cls;
        this.f21641g = constructor;
        this.f21642h = method2;
        this.f21643i = method3;
        this.f21644j = method4;
        this.f21645k = method;
        this.f21646l = method5;
    }

    public static Method m(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public static Method n(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    @Override // j0.i, j0.o
    public final Typeface a(Context context, d.c cVar, Resources resources, int i6) {
        Object obj;
        d.C0297d[] c0297dArr;
        FontVariationAxis[] fromFontVariationSettings;
        if (!l()) {
            return super.a(context, cVar, resources, i6);
        }
        try {
            obj = this.f21641g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (d.C0297d c0297d : cVar.f19616a) {
            String str = c0297d.f19617a;
            int i10 = c0297d.f19621e;
            int i11 = c0297d.f19618b;
            boolean z10 = c0297d.f19619c;
            fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(c0297d.f19620d);
            if (!i(context, obj, str, i10, i11, z10 ? 1 : 0, fromFontVariationSettings)) {
                try {
                    this.f21645k.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
        }
        if (!k(obj)) {
            return null;
        }
        return j(obj);
    }

    @Override // j0.i, j0.o
    public final Typeface b(Context context, p0.m[] mVarArr, int i6) {
        Object obj;
        Typeface j10;
        boolean z10;
        if (mVarArr.length < 1) {
            return null;
        }
        if (!l()) {
            p0.m f = f(i6, mVarArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f.f27854a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(f.f27856c).setItalic(f.f27857d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (p0.m mVar : mVarArr) {
            if (mVar.f27858e == 0) {
                Uri uri = mVar.f27854a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, p.e(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        try {
            obj = this.f21641g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        int length = mVarArr.length;
        int i10 = 0;
        boolean z11 = false;
        while (true) {
            Method method = this.f21645k;
            if (i10 < length) {
                p0.m mVar2 = mVarArr[i10];
                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(mVar2.f27854a);
                if (byteBuffer != null) {
                    try {
                        z10 = ((Boolean) this.f21643i.invoke(obj, byteBuffer, Integer.valueOf(mVar2.f27855b), null, Integer.valueOf(mVar2.f27856c), Integer.valueOf(mVar2.f27857d ? 1 : 0))).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                        z10 = false;
                    }
                    if (!z10) {
                        try {
                            method.invoke(obj, new Object[0]);
                            return null;
                        } catch (IllegalAccessException | InvocationTargetException unused4) {
                            return null;
                        }
                    }
                    z11 = true;
                }
                i10++;
            } else if (!z11) {
                try {
                    method.invoke(obj, new Object[0]);
                    return null;
                } catch (IllegalAccessException | InvocationTargetException unused5) {
                    return null;
                }
            } else if (!k(obj) || (j10 = j(obj)) == null) {
                return null;
            } else {
                return Typeface.create(j10, i6);
            }
        }
    }

    @Override // j0.o
    public final Typeface d(Context context, Resources resources, int i6, String str, int i10) {
        Object obj;
        if (!l()) {
            return super.d(context, resources, i6, str, i10);
        }
        try {
            obj = this.f21641g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        if (!i(context, obj, str, 0, -1, -1, null)) {
            try {
                this.f21645k.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
            return null;
        } else if (!k(obj)) {
            return null;
        } else {
            return j(obj);
        }
    }

    public final boolean i(Context context, Object obj, String str, int i6, int i10, int i11, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f21642h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i6), Integer.valueOf(i10), Integer.valueOf(i11), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface j(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f21646l.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean k(Object obj) {
        try {
            return ((Boolean) this.f21644j.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean l() {
        Method method = this.f21642h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            return true;
        }
        return false;
    }

    public Method o(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
