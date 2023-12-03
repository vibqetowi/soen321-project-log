package so;

import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentAddFamilyMemberActivity;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: ExperimentAddFamilyMemberActivity.kt */
/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.k implements ss.l<String, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ExperimentAddFamilyMemberActivity f31805u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ExperimentAddFamilyMemberActivity experimentAddFamilyMemberActivity) {
        super(1);
        this.f31805u = experimentAddFamilyMemberActivity;
    }

    @Override // ss.l
    public final hs.k invoke(String str) {
        String str2 = str;
        if (str2 != null) {
            ExperimentAddFamilyMemberActivity experimentAddFamilyMemberActivity = this.f31805u;
            ((RobertoTextView) experimentAddFamilyMemberActivity.n0(R.id.tvAddFamilyMemberLimit)).setText(str2);
            ((RobertoTextView) experimentAddFamilyMemberActivity.n0(R.id.tvAddFamilyMemberLimit)).setVisibility(0);
        }
        return hs.k.f19476a;
    }
}
