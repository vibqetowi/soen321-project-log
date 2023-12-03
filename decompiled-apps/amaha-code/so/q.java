package so;

import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentEditProfileActivity;
/* compiled from: ExperimentEditProfileActivity.kt */
/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ExperimentEditProfileActivity f31839u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ExperimentEditProfileActivity experimentEditProfileActivity) {
        super(1);
        this.f31839u = experimentEditProfileActivity;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        Boolean bool2 = bool;
        if (bool2 != null) {
            bool2.booleanValue();
            if (bool2.booleanValue()) {
                this.f31839u.finish();
            }
        }
        return hs.k.f19476a;
    }
}
