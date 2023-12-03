package j0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import i0.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
/* compiled from: TypefaceCompatApi24Impl.java */
/* loaded from: classes.dex */
public final class j extends o {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f21637a;

    /* renamed from: b  reason: collision with root package name */
    public static final Constructor<?> f21638b;

    /* renamed from: c  reason: collision with root package name */
    public static final Method f21639c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f21640d;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f21638b = constructor;
        f21637a = cls;
        f21639c = method2;
        f21640d = method;
    }

    public static boolean g(Object obj, ByteBuffer byteBuffer, int i6, int i10, boolean z10) {
        try {
            return ((Boolean) f21639c.invoke(obj, byteBuffer, Integer.valueOf(i6), null, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // j0.o
    public final Typeface a(Context context, d.c cVar, Resources resources, int i6) {
        Object obj;
        d.C0297d[] c0297dArr;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f21638b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (d.C0297d c0297d : cVar.f19616a) {
            int i10 = c0297d.f;
            File d10 = p.d(context);
            if (d10 != null) {
                try {
                    if (p.b(d10, resources, i10)) {
                        try {
                            fileInputStream = new FileInputStream(d10);
                        } catch (IOException unused2) {
                            mappedByteBuffer = null;
                        }
                        try {
                            FileChannel channel = fileInputStream.getChannel();
                            mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                            fileInputStream.close();
                            if (mappedByteBuffer != null || !g(obj, mappedByteBuffer, c0297d.f19621e, c0297d.f19618b, c0297d.f19619c)) {
                                return null;
                            }
                        } finally {
                            break;
                        }
                    }
                } finally {
                    d10.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance(f21637a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f21640d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return null;
        }
    }

    @Override // j0.o
    public final Typeface b(Context context, p0.m[] mVarArr, int i6) {
        Object obj;
        Typeface typeface;
        try {
            obj = f21638b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        t.h hVar = new t.h();
        for (p0.m mVar : mVarArr) {
            Uri uri = mVar.f27854a;
            ByteBuffer byteBuffer = (ByteBuffer) hVar.getOrDefault(uri, null);
            if (byteBuffer == null) {
                byteBuffer = p.e(context, uri);
                hVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !g(obj, byteBuffer, mVar.f27855b, mVar.f27856c, mVar.f27857d)) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance(f21637a, 1);
            Array.set(newInstance, 0, obj);
            typeface = (Typeface) f21640d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused2) {
            typeface = null;
        }
        if (typeface == null) {
            return null;
        }
        return Typeface.create(typeface, i6);
    }
}
