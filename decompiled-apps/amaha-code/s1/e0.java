package s1;

import android.view.View;
import android.view.ViewParent;
/* compiled from: Navigation.kt */
/* loaded from: classes.dex */
public final class e0 extends kotlin.jvm.internal.k implements ss.l<View, View> {

    /* renamed from: u  reason: collision with root package name */
    public static final e0 f31113u = new e0();

    public e0() {
        super(1);
    }

    @Override // ss.l
    public final View invoke(View view) {
        View it = view;
        kotlin.jvm.internal.i.g(it, "it");
        ViewParent parent = it.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
