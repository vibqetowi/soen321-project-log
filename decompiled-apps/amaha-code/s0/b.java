package s0;

import j$.util.Objects;
/* compiled from: ObjectsCompat.java */
/* loaded from: classes.dex */
public final class b {
    public static boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static int b(Object... objArr) {
        return Objects.hash(objArr);
    }
}
