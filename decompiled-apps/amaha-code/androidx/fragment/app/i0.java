package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
/* compiled from: FragmentTransition.java */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final k0 f2217a = new k0();

    /* renamed from: b  reason: collision with root package name */
    public static final o0 f2218b;

    static {
        o0 o0Var;
        try {
            o0Var = (o0) h2.f.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            o0Var = null;
        }
        f2218b = o0Var;
    }

    public static void a(ArrayList<View> arrayList, int i6) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i6);
        }
    }
}
