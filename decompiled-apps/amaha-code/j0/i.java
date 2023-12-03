package j0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import i0.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: TypefaceCompatApi21Impl.java */
/* loaded from: classes.dex */
public class i extends o {

    /* renamed from: a  reason: collision with root package name */
    public static Class<?> f21632a = null;

    /* renamed from: b  reason: collision with root package name */
    public static Constructor<?> f21633b = null;

    /* renamed from: c  reason: collision with root package name */
    public static Method f21634c = null;

    /* renamed from: d  reason: collision with root package name */
    public static Method f21635d = null;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f21636e = false;

    public static boolean g(Object obj, String str, int i6, boolean z10) {
        h();
        try {
            return ((Boolean) f21634c.invoke(obj, str, Integer.valueOf(i6), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void h() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f21636e) {
            return;
        }
        f21636e = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f21633b = constructor;
        f21632a = cls;
        f21634c = method2;
        f21635d = method;
    }

    @Override // j0.o
    public Typeface a(Context context, d.c cVar, Resources resources, int i6) {
        d.C0297d[] c0297dArr;
        h();
        try {
            Object newInstance = f21633b.newInstance(new Object[0]);
            for (d.C0297d c0297d : cVar.f19616a) {
                File d10 = p.d(context);
                if (d10 == null) {
                    return null;
                }
                try {
                    if (!p.b(d10, resources, c0297d.f)) {
                        return null;
                    }
                    if (!g(newInstance, d10.getPath(), c0297d.f19618b, c0297d.f19619c)) {
                        return null;
                    }
                    d10.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    d10.delete();
                }
            }
            h();
            try {
                Object newInstance2 = Array.newInstance(f21632a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f21635d.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // j0.o
    public Typeface b(Context context, p0.m[] mVarArr, int i6) {
        File file;
        String readlink;
        if (mVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f(i6, mVarArr).f27854a, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
            } catch (ErrnoException unused) {
            }
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                file = new File(readlink);
                if (file != null && file.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(file);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                Typeface c10 = c(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return c10;
            }
            file = null;
            if (file != null) {
                Typeface createFromFile2 = Typeface.createFromFile(file);
                openFileDescriptor.close();
                return createFromFile2;
            }
            FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface c102 = c(context, fileInputStream2);
            fileInputStream2.close();
            openFileDescriptor.close();
            return c102;
        } catch (IOException unused2) {
            return null;
        }
    }
}
