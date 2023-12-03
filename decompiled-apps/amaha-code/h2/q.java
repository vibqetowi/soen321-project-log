package h2;

import android.os.Build;
/* compiled from: TransitionUtils.java */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f17065a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f17066b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f17067c;

    static {
        int i6 = Build.VERSION.SDK_INT;
        boolean z10 = true;
        f17065a = true;
        f17066b = true;
        if (i6 < 28) {
            z10 = false;
        }
        f17067c = z10;
    }
}
