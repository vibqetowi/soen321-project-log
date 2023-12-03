package t0;

import android.view.View;
import com.theinnerhour.b2b.R;
import t0.d0;
/* compiled from: ViewCompat.java */
/* loaded from: classes.dex */
public final class c0 extends d0.b<Boolean> {
    public c0() {
        super(R.id.tag_accessibility_heading, Boolean.class, 0, 28);
    }

    @Override // t0.d0.b
    public final Boolean b(View view) {
        return Boolean.valueOf(d0.m.c(view));
    }

    @Override // t0.d0.b
    public final void c(View view, Boolean bool) {
        d0.m.g(view, bool.booleanValue());
    }

    @Override // t0.d0.b
    public final boolean f(Boolean bool, Boolean bool2) {
        return !d0.b.a(bool, bool2);
    }
}
