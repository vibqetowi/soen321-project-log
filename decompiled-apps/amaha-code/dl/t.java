package dl;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity;
/* compiled from: V2DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.k implements ss.l<String, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V2DashboardActivity f13109u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(V2DashboardActivity v2DashboardActivity) {
        super(1);
        this.f13109u = v2DashboardActivity;
    }

    @Override // ss.l
    public final hs.k invoke(String str) {
        boolean z10;
        String it = str;
        if (it != null && !gv.n.B0(it)) {
            z10 = false;
        } else {
            z10 = true;
        }
        V2DashboardActivity v2DashboardActivity = this.f13109u;
        if (!z10) {
            kotlin.jvm.internal.i.f(it, "it");
            if (gv.n.H0(it, "//")) {
                it = "https:".concat(it);
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) v2DashboardActivity.findViewById(R.id.ivB2BBannerOrgImage);
            if (appCompatImageView != null) {
                Glide.c(v2DashboardActivity).d(v2DashboardActivity).p(it).B(appCompatImageView);
            }
        } else {
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) v2DashboardActivity.findViewById(R.id.ivB2BBannerOrgImage);
            if (appCompatImageView2 != null) {
                appCompatImageView2.setVisibility(8);
            }
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) v2DashboardActivity.findViewById(R.id.ivB2BBannerConnectorImage);
            if (appCompatImageView3 != null) {
                appCompatImageView3.setVisibility(8);
            }
        }
        View findViewById = v2DashboardActivity.findViewById(R.id.viewB2BOrgBanner);
        if (findViewById != null) {
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new l(v2DashboardActivity, 23));
        }
        return hs.k.f19476a;
    }
}
