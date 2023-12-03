package ik;

import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
/* compiled from: ExptInitialAssessmentHealthQuestionFragment.kt */
/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.k implements ss.a<hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ r f20268u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar) {
        super(0);
        this.f20268u = rVar;
    }

    @Override // ss.a
    public final hs.k invoke() {
        UiUtils.Companion companion = UiUtils.Companion;
        r rVar = this.f20268u;
        companion.enableClick((RobertoButton) rVar._$_findCachedViewById(R.id.healthSubOption1), (RobertoButton) rVar._$_findCachedViewById(R.id.healthSubOption2), (RobertoButton) rVar._$_findCachedViewById(R.id.healthSubOption3), (RobertoButton) rVar._$_findCachedViewById(R.id.healthSubOption4));
        return hs.k.f19476a;
    }
}
