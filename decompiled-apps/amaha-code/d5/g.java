package d5;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: LruCache.java */
/* loaded from: classes.dex */
public class g<T, Y> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f12194a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b  reason: collision with root package name */
    public final long f12195b;

    /* renamed from: c  reason: collision with root package name */
    public long f12196c;

    public g(long j10) {
        this.f12195b = j10;
    }

    public final synchronized Y a(T t3) {
        return (Y) this.f12194a.get(t3);
    }

    public int b(Y y10) {
        return 1;
    }

    public final synchronized Y d(T t3, Y y10) {
        long b10 = b(y10);
        if (b10 >= this.f12195b) {
            c(t3, y10);
            return null;
        }
        if (y10 != null) {
            this.f12196c += b10;
        }
        Y y11 = (Y) this.f12194a.put(t3, y10);
        if (y11 != null) {
            this.f12196c -= b(y11);
            if (!y11.equals(y10)) {
                c(t3, y11);
            }
        }
        e(this.f12195b);
        return y11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void e(long j10) {
        while (this.f12196c > j10) {
            Iterator it = this.f12194a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            this.f12196c -= b(value);
            Object key = entry.getKey();
            it.remove();
            c(key, value);
        }
    }

    public void c(T t3, Y y10) {
    }
}
