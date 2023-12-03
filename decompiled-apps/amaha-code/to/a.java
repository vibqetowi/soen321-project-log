package to;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentEditProfileActivity;
import com.theinnerhour.b2b.components.profile.experiment.model.ProfileAssetModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.CircleImageView;
import ik.l1;
import is.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import so.k;
/* compiled from: AvatarGridAdapter.kt */
/* loaded from: classes2.dex */
public final class a extends RecyclerView.e<RecyclerView.c0> {
    public final String A;

    /* renamed from: x  reason: collision with root package name */
    public final Activity f33381x;

    /* renamed from: y  reason: collision with root package name */
    public final List<ProfileAssetModel.ProfileAvatarAsset> f33382y;

    /* renamed from: z  reason: collision with root package name */
    public final InterfaceC0555a f33383z;

    /* compiled from: AvatarGridAdapter.kt */
    /* renamed from: to.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0555a {
        void a(ProfileAssetModel.ProfileAvatarAsset profileAvatarAsset, int i6);
    }

    /* compiled from: AvatarGridAdapter.kt */
    /* loaded from: classes2.dex */
    public final class b extends RecyclerView.c0 {
        public b(View view) {
            super(view);
        }
    }

    public a(ExperimentEditProfileActivity experimentEditProfileActivity, ArrayList list, k kVar) {
        i.g(list, "list");
        this.f33381x = experimentEditProfileActivity;
        this.f33382y = list;
        this.f33383z = kVar;
        this.A = LogHelper.INSTANCE.makeLogTag(a.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f33382y.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(RecyclerView.c0 c0Var, int i6) {
        List<ProfileAssetModel.ProfileAvatarAsset> list = this.f33382y;
        try {
            ProfileAssetModel.ProfileAvatarAsset profileAvatarAsset = (ProfileAssetModel.ProfileAvatarAsset) u.j2(i6, list);
            if (profileAvatarAsset != null) {
                boolean selected = profileAvatarAsset.getSelected();
                Activity activity = this.f33381x;
                View view = c0Var.f2751a;
                if (selected) {
                    ((CircleImageView) view.findViewById(R.id.ivRowAvatar)).setBorderOverlay(true);
                    ((CircleImageView) view.findViewById(R.id.ivRowAvatar)).setBorderWidth(UiUtils.Companion.dpToPx(activity, 4));
                    ((CircleImageView) view.findViewById(R.id.ivRowAvatar)).setBorderColor(g0.a.b(activity, R.color.sea));
                } else {
                    ((CircleImageView) view.findViewById(R.id.ivRowAvatar)).setBorderOverlay(false);
                    ((CircleImageView) view.findViewById(R.id.ivRowAvatar)).setBorderWidth(0);
                }
                Glide.f(activity).p(list.get(i6).getAvatar()).B((CircleImageView) view.findViewById(R.id.ivRowAvatar));
                view.setOnClickListener(new l1(profileAvatarAsset, this, i6, 29));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        return new b(defpackage.e.h(parent, R.layout.row_avatar_grid, parent, false, "from(parent.context).inf…atar_grid, parent, false)"));
    }
}
