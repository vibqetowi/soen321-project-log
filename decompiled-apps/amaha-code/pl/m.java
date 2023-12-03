package pl;

import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N14AScreenFragment;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import ql.i;
/* compiled from: N14AScreenFragment.kt */
/* loaded from: classes2.dex */
public final class m extends kotlin.jvm.internal.k implements ss.l<i.a, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ N14AScreenFragment f28613u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(N14AScreenFragment n14AScreenFragment) {
        super(1);
        this.f28613u = n14AScreenFragment;
    }

    @Override // ss.l
    public final hs.k invoke(i.a aVar) {
        String str = aVar.f29734e;
        N14AScreenFragment n14AScreenFragment = this.f28613u;
        n14AScreenFragment.A = str;
        RobertoTextView robertoTextView = (RobertoTextView) n14AScreenFragment._$_findCachedViewById(R.id.tvN14AScreenEndTime);
        if (robertoTextView != null) {
            robertoTextView.setText(n14AScreenFragment.A);
        }
        return hs.k.f19476a;
    }
}
