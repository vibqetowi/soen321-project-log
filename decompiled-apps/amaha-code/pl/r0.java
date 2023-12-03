package pl;

import android.text.Editable;
import android.text.TextWatcher;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N5ScreenFragment;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: N5ScreenFragment.kt */
/* loaded from: classes2.dex */
public final class r0 implements TextWatcher {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ N5ScreenFragment f28629u;

    public r0(N5ScreenFragment n5ScreenFragment) {
        this.f28629u = n5ScreenFragment;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        boolean z10;
        N5ScreenFragment n5ScreenFragment = this.f28629u;
        try {
            if (String.valueOf(charSequence).length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ((RobertoTextView) n5ScreenFragment._$_findCachedViewById(R.id.tvN5ScreenUserComment)).setVisibility(0);
            } else {
                ((RobertoTextView) n5ScreenFragment._$_findCachedViewById(R.id.tvN5ScreenUserComment)).setVisibility(8);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(n5ScreenFragment.f11068w, e10);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
    }
}
