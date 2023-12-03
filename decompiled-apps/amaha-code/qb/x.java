package qb;

import android.view.View;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
/* compiled from: ViewUtils.java */
/* loaded from: classes.dex */
public final class x implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        d0.h.c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
