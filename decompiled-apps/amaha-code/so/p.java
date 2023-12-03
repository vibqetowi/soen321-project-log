package so;

import androidx.cardview.widget.CardView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentEditProfileActivity;
/* compiled from: ExperimentEditProfileActivity.kt */
/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ExperimentEditProfileActivity f31838u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ExperimentEditProfileActivity experimentEditProfileActivity) {
        super(1);
        this.f31838u = experimentEditProfileActivity;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        Boolean bool2 = bool;
        if (bool2 != null) {
            bool2.booleanValue();
            if (bool2.booleanValue()) {
                ExperimentEditProfileActivity experimentEditProfileActivity = this.f31838u;
                ((CardView) experimentEditProfileActivity.o0(R.id.clEditProfileAddFamilyMember)).setVisibility(0);
                ((CardView) experimentEditProfileActivity.o0(R.id.clEditProfileAddFamilyMember)).setOnClickListener(new g(experimentEditProfileActivity, 10));
            }
        }
        return hs.k.f19476a;
    }
}
