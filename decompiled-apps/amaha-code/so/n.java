package so;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentEditProfileActivity;
import com.theinnerhour.b2b.components.profile.experiment.model.ProfileAssetModel;
import java.util.Iterator;
/* compiled from: ExperimentEditProfileActivity.kt */
/* loaded from: classes2.dex */
public final class n extends RecyclerView.r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.w f31833a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ExperimentEditProfileActivity f31834b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ to.e f31835c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ProfileAssetModel f31836d;

    public n(androidx.recyclerview.widget.w wVar, ExperimentEditProfileActivity experimentEditProfileActivity, to.e eVar, ProfileAssetModel profileAssetModel) {
        this.f31833a = wVar;
        this.f31834b = experimentEditProfileActivity;
        this.f31835c = eVar;
        this.f31836d = profileAssetModel;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void a(int i6, RecyclerView recyclerView) {
        int i10;
        kotlin.jvm.internal.i.g(recyclerView, "recyclerView");
        if (i6 == 0) {
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            kotlin.jvm.internal.i.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            View d10 = this.f31833a.d((LinearLayoutManager) layoutManager);
            ExperimentEditProfileActivity experimentEditProfileActivity = this.f31834b;
            kotlin.jvm.internal.i.d(d10);
            ((RecyclerView) experimentEditProfileActivity.o0(R.id.rvEditProfileCover)).getClass();
            RecyclerView.c0 L = RecyclerView.L(d10);
            if (L != null) {
                i10 = L.e();
            } else {
                i10 = -1;
            }
            to.e eVar = this.f31835c;
            Iterator it = is.u.N2(eVar.f33395y).iterator();
            while (true) {
                is.b0 b0Var = (is.b0) it;
                if (b0Var.hasNext()) {
                    is.z zVar = (is.z) b0Var.next();
                    boolean selected = ((ProfileAssetModel.ProfileThemeAsset) zVar.f20680b).getSelected();
                    T t3 = zVar.f20680b;
                    int i11 = zVar.f20679a;
                    if (selected) {
                        ((ProfileAssetModel.ProfileThemeAsset) t3).setSelected(false);
                        eVar.j(i11);
                    }
                    if (i11 == i10) {
                        ((ProfileAssetModel.ProfileThemeAsset) t3).setSelected(true);
                        eVar.j(i11);
                    }
                } else {
                    experimentEditProfileActivity.f11568x = this.f31836d.getThemes().get(i10).getCoverImage();
                    experimentEditProfileActivity.H = true;
                    return;
                }
            }
        }
    }
}
