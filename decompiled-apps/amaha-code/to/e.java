package to;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentEditProfileActivity;
import com.theinnerhour.b2b.components.profile.experiment.model.ProfileAssetModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import is.u;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
/* compiled from: SnappingCoverAdapter.kt */
/* loaded from: classes2.dex */
public final class e extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final Activity f33394x;

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<ProfileAssetModel.ProfileThemeAsset> f33395y;

    /* renamed from: z  reason: collision with root package name */
    public final LayoutInflater f33396z;

    /* compiled from: SnappingCoverAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final AppCompatImageView f33397u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f33398v;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.ivProfileCoverImage);
            i.f(findViewById, "view.findViewById(R.id.ivProfileCoverImage)");
            this.f33397u = (AppCompatImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.tvProfileCoverCurrent);
            i.f(findViewById2, "view.findViewById(R.id.tvProfileCoverCurrent)");
            this.f33398v = (RobertoTextView) findViewById2;
        }
    }

    public e(ExperimentEditProfileActivity experimentEditProfileActivity, ArrayList imageList) {
        i.g(imageList, "imageList");
        this.f33394x = experimentEditProfileActivity;
        this.f33395y = imageList;
        Object systemService = experimentEditProfileActivity.getSystemService("layout_inflater");
        i.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f33396z = (LayoutInflater) systemService;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f33395y.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        a aVar2 = aVar;
        ArrayList<ProfileAssetModel.ProfileThemeAsset> arrayList = this.f33395y;
        Activity activity = this.f33394x;
        try {
            ViewGroup.LayoutParams layoutParams = aVar2.f2751a.getLayoutParams();
            UiUtils.Companion companion = UiUtils.Companion;
            layoutParams.width = companion.getScreenWidth(activity) - companion.dpToPx(activity, 80);
            if (((ProfileAssetModel.ProfileThemeAsset) u.j2(i6, arrayList)) != null) {
                Glide.f(activity).p(arrayList.get(i6).getCoverImage()).B(aVar2.f33397u);
                boolean selected = arrayList.get(i6).getSelected();
                RobertoTextView robertoTextView = aVar2.f33398v;
                if (selected) {
                    robertoTextView.setVisibility(0);
                } else {
                    robertoTextView.setVisibility(8);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("SnappingCoverAdapter", e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        View inflate = this.f33396z.inflate(R.layout.row_profile_cover_image, (ViewGroup) parent, false);
        i.f(inflate, "inflater.inflate(R.layou…ver_image, parent, false)");
        return new a(inflate);
    }
}
