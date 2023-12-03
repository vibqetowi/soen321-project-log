package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
/* compiled from: ViewModel.java */
/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: u  reason: collision with root package name */
    public final HashMap f2436u = new HashMap();

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashSet f2437v = new LinkedHashSet();

    /* renamed from: w  reason: collision with root package name */
    public volatile boolean f2438w = false;

    public static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final Object d(Object obj, String str) {
        Object obj2;
        synchronized (this.f2436u) {
            obj2 = this.f2436u.get(str);
            if (obj2 == null) {
                this.f2436u.put(str, obj);
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.f2438w) {
            b(obj);
        }
        return obj;
    }

    public void c() {
    }
}
