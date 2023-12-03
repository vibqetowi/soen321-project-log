package pl;

import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N5ScreenFragment;
import com.theinnerhour.b2b.widgets.RobertoEditText;
/* compiled from: N5ScreenFragment.kt */
/* loaded from: classes2.dex */
public final class s0 extends kotlin.jvm.internal.k implements ss.a<hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ N5ScreenFragment f28631u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(N5ScreenFragment n5ScreenFragment) {
        super(0);
        this.f28631u = n5ScreenFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r2.hasFocus() == true) goto L5;
     */
    @Override // ss.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hs.k invoke() {
        boolean z10;
        RobertoEditText robertoEditText;
        int i6 = N5ScreenFragment.I;
        N5ScreenFragment n5ScreenFragment = this.f28631u;
        RobertoEditText robertoEditText2 = (RobertoEditText) n5ScreenFragment._$_findCachedViewById(R.id.etN5ScreenUserComment);
        if (robertoEditText2 != null) {
            z10 = true;
        }
        z10 = false;
        if (z10 && (robertoEditText = (RobertoEditText) n5ScreenFragment._$_findCachedViewById(R.id.etN5ScreenUserComment)) != null) {
            robertoEditText.clearFocus();
        }
        return hs.k.f19476a;
    }
}
