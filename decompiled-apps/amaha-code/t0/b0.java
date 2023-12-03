package t0;

import android.text.TextUtils;
import android.view.View;
import com.theinnerhour.b2b.R;
import t0.d0;
/* compiled from: ViewCompat.java */
/* loaded from: classes.dex */
public final class b0 extends d0.b<CharSequence> {
    public b0() {
        super(R.id.tag_state_description, CharSequence.class, 64, 30);
    }

    @Override // t0.d0.b
    public final CharSequence b(View view) {
        return d0.o.a(view);
    }

    @Override // t0.d0.b
    public final void c(View view, CharSequence charSequence) {
        d0.o.b(view, charSequence);
    }

    @Override // t0.d0.b
    public final boolean f(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
