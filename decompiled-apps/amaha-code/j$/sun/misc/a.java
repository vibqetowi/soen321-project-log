package j$.sun.misc;

import sun.misc.Unsafe;
/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j10, Object obj2) {
        while (!unsafe.compareAndSwapObject(obj, j10, (Object) null, obj2)) {
            if (unsafe.getObject(obj, j10) != null) {
                return false;
            }
        }
        return true;
    }
}
