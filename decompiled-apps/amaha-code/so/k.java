package so;

import android.app.Dialog;
import android.os.Bundle;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentEditProfileActivity;
import com.theinnerhour.b2b.components.profile.experiment.model.ProfileAssetModel;
import com.theinnerhour.b2b.widgets.CircleImageView;
import to.a;
/* compiled from: ExperimentEditProfileActivity.kt */
/* loaded from: classes2.dex */
public final class k implements a.InterfaceC0555a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f31828a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ExperimentEditProfileActivity f31829b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Dialog f31830c;

    public k(kotlin.jvm.internal.v vVar, ExperimentEditProfileActivity experimentEditProfileActivity, Dialog dialog) {
        this.f31828a = vVar;
        this.f31829b = experimentEditProfileActivity;
        this.f31830c = dialog;
    }

    @Override // to.a.InterfaceC0555a
    public final void a(ProfileAssetModel.ProfileAvatarAsset profileAvatarAsset, int i6) {
        kotlin.jvm.internal.v vVar = this.f31828a;
        if (vVar.f23467u != i6) {
            vVar.f23467u = i6;
            ExperimentEditProfileActivity experimentEditProfileActivity = this.f31829b;
            Glide.i(experimentEditProfileActivity).p(profileAvatarAsset.getAvatar()).B((CircleImageView) this.f31830c.findViewById(R.id.ivAvatarDialogImage));
            Glide.c(experimentEditProfileActivity).d(experimentEditProfileActivity).p(profileAvatarAsset.getAvatar()).B((CircleImageView) experimentEditProfileActivity.o0(R.id.ivEditProfileImage));
            experimentEditProfileActivity.f11569y = profileAvatarAsset.getAvatar();
            experimentEditProfileActivity.f11570z = null;
            experimentEditProfileActivity.H = true;
            String str = gk.a.f16573a;
            Bundle bundle = new Bundle();
            bundle.putString("value", experimentEditProfileActivity.f11569y);
            hs.k kVar = hs.k.f19476a;
            gk.a.b(bundle, "edit_profile_avatar_select");
        }
    }
}
