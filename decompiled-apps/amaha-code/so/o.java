package so;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentEditProfileActivity;
import com.theinnerhour.b2b.components.profile.experiment.model.ProfileAssetModel;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.widgets.CircleImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: ExperimentEditProfileActivity.kt */
/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.k implements ss.l<ProfileAssetModel, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ExperimentEditProfileActivity f31837u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ExperimentEditProfileActivity experimentEditProfileActivity) {
        super(1);
        this.f31837u = experimentEditProfileActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e3  */
    @Override // ss.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hs.k invoke(ProfileAssetModel profileAssetModel) {
        boolean z10;
        int i6;
        String profile_path;
        Object obj;
        HashMap<String, Object> appConfig;
        HashMap<String, Object> appConfig2;
        ProfileAssetModel profileAssetModel2 = profileAssetModel;
        if (profileAssetModel2 != null) {
            ArrayList<ProfileAssetModel.ProfileAvatarAsset> avatars = profileAssetModel2.getAvatars();
            ExperimentEditProfileActivity experimentEditProfileActivity = this.f31837u;
            experimentEditProfileActivity.getClass();
            kotlin.jvm.internal.i.g(avatars, "<set-?>");
            experimentEditProfileActivity.F = avatars;
            if (avatars.size() > 0 && profileAssetModel2.getThemes().size() > 0) {
                User user = FirebasePersistence.getInstance().getUser();
                boolean z11 = true;
                if (user != null && (appConfig2 = user.getAppConfig()) != null && appConfig2.containsKey("profile_cover")) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    User user2 = FirebasePersistence.getInstance().getUser();
                    if (user2 != null && (appConfig = user2.getAppConfig()) != null) {
                        obj = appConfig.get("profile_cover");
                    } else {
                        obj = null;
                    }
                    if (!kotlin.jvm.internal.i.b(obj, "")) {
                        Iterator it = is.u.N2(profileAssetModel2.getThemes()).iterator();
                        i6 = 0;
                        while (true) {
                            is.b0 b0Var = (is.b0) it;
                            if (!b0Var.hasNext()) {
                                break;
                            }
                            is.z zVar = (is.z) b0Var.next();
                            if (kotlin.jvm.internal.i.b(((ProfileAssetModel.ProfileThemeAsset) zVar.f20680b).getCoverImage(), FirebasePersistence.getInstance().getUser().getAppConfig().get("profile_cover"))) {
                                ((ProfileAssetModel.ProfileThemeAsset) zVar.f20680b).setSelected(true);
                                i6 = zVar.f20679a;
                            }
                        }
                        profile_path = FirebasePersistence.getInstance().getUser().getProfile_path();
                        if (profile_path != null) {
                            if (profile_path.length() <= 0) {
                                z11 = false;
                            }
                            if (z11) {
                                Glide.c(experimentEditProfileActivity).d(experimentEditProfileActivity).p("https:".concat(profile_path)).B((CircleImageView) experimentEditProfileActivity.o0(R.id.ivEditProfileImage));
                            } else {
                                Glide.c(experimentEditProfileActivity).d(experimentEditProfileActivity).p(profileAssetModel2.getAvatars().get(0).getAvatar()).B((CircleImageView) experimentEditProfileActivity.o0(R.id.ivEditProfileImage));
                            }
                        }
                        ((RecyclerView) experimentEditProfileActivity.o0(R.id.rvEditProfileCover)).setLayoutManager(new LinearLayoutManager(experimentEditProfileActivity, 0, false));
                        to.e eVar = new to.e(experimentEditProfileActivity, profileAssetModel2.getThemes());
                        ((RecyclerView) experimentEditProfileActivity.o0(R.id.rvEditProfileCover)).setAdapter(eVar);
                        androidx.recyclerview.widget.w wVar = new androidx.recyclerview.widget.w();
                        wVar.a((RecyclerView) experimentEditProfileActivity.o0(R.id.rvEditProfileCover));
                        ((RecyclerView) experimentEditProfileActivity.o0(R.id.rvEditProfileCover)).h0(i6);
                        ((RecyclerView) experimentEditProfileActivity.o0(R.id.rvEditProfileCover)).i(new n(wVar, experimentEditProfileActivity, eVar, profileAssetModel2));
                    }
                }
                Iterator it2 = is.u.N2(profileAssetModel2.getThemes()).iterator();
                i6 = 0;
                while (true) {
                    is.b0 b0Var2 = (is.b0) it2;
                    if (!b0Var2.hasNext()) {
                        break;
                    }
                    is.z zVar2 = (is.z) b0Var2.next();
                    if (((ProfileAssetModel.ProfileThemeAsset) zVar2.f20680b).getDefault()) {
                        ((ProfileAssetModel.ProfileThemeAsset) zVar2.f20680b).setSelected(true);
                        i6 = zVar2.f20679a;
                    }
                }
                profile_path = FirebasePersistence.getInstance().getUser().getProfile_path();
                if (profile_path != null) {
                }
                ((RecyclerView) experimentEditProfileActivity.o0(R.id.rvEditProfileCover)).setLayoutManager(new LinearLayoutManager(experimentEditProfileActivity, 0, false));
                to.e eVar2 = new to.e(experimentEditProfileActivity, profileAssetModel2.getThemes());
                ((RecyclerView) experimentEditProfileActivity.o0(R.id.rvEditProfileCover)).setAdapter(eVar2);
                androidx.recyclerview.widget.w wVar2 = new androidx.recyclerview.widget.w();
                wVar2.a((RecyclerView) experimentEditProfileActivity.o0(R.id.rvEditProfileCover));
                ((RecyclerView) experimentEditProfileActivity.o0(R.id.rvEditProfileCover)).h0(i6);
                ((RecyclerView) experimentEditProfileActivity.o0(R.id.rvEditProfileCover)).i(new n(wVar2, experimentEditProfileActivity, eVar2, profileAssetModel2));
            } else {
                experimentEditProfileActivity.finish();
            }
        }
        return hs.k.f19476a;
    }
}
