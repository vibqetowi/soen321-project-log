package g;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
/* compiled from: ResourcesFlusher.java */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static Field f16144a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f16145b;

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f16146c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f16147d;

    /* renamed from: e  reason: collision with root package name */
    public static Field f16148e;
    public static boolean f;

    /* renamed from: g  reason: collision with root package name */
    public static Field f16149g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f16150h;

    /* compiled from: ResourcesFlusher.java */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    public static void a(Object obj) {
        LongSparseArray longSparseArray;
        if (!f16147d) {
            try {
                f16146c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f16147d = true;
        }
        Class<?> cls = f16146c;
        if (cls == null) {
            return;
        }
        if (!f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f16148e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f = true;
        }
        Field field = f16148e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            a.a(longSparseArray);
        }
    }
}
