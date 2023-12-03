package dl;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.network.model.AddonProfileDetails;
import com.theinnerhour.b2b.network.model.ProviderDetailHolderModel;
import com.theinnerhour.b2b.network.model.Testimonials;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class u0 extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends String, ? extends ProviderDetailHolderModel>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13113u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(V3DashboardActivity v3DashboardActivity) {
        super(1);
        this.f13113u = v3DashboardActivity;
    }

    @Override // ss.l
    public final hs.k invoke(hs.f<? extends String, ? extends ProviderDetailHolderModel> fVar) {
        String str;
        int i6;
        ArrayList<Testimonials> testimonials;
        hs.f<? extends String, ? extends ProviderDetailHolderModel> fVar2 = fVar;
        hs.f<String, String> fVar3 = null;
        if (fVar2 != null) {
            str = (String) fVar2.f19464u;
        } else {
            str = null;
        }
        if (kotlin.jvm.internal.i.b(str, "pending")) {
            AddonProfileDetails addonProfileDetails = ((ProviderDetailHolderModel) fVar2.f19465v).getAddonProfileDetails();
            if (addonProfileDetails != null && (testimonials = addonProfileDetails.getTestimonials()) != null) {
                i6 = testimonials.size();
            } else {
                i6 = 0;
            }
            B b10 = fVar2.f19465v;
            if (i6 > 0 || ((ProviderDetailHolderModel) b10).getUserPhrases().size() > 0) {
                ProviderDetailHolderModel providerDetailHolderModel = (ProviderDetailHolderModel) b10;
                int i10 = V3DashboardActivity.f10714r1;
                V3DashboardActivity v3DashboardActivity = this.f13113u;
                v3DashboardActivity.getClass();
                try {
                    View n02 = v3DashboardActivity.n0(R.id.viewDashboardBlanketForeground);
                    if (n02 != null) {
                        n02.setVisibility(0);
                    }
                    View n03 = v3DashboardActivity.n0(R.id.viewDashboardBlanketForeground);
                    if (n03 != null) {
                        n03.setOnClickListener(new z(v3DashboardActivity, providerDetailHolderModel, 1));
                    }
                    BottomSheetBehavior.from((ConstraintLayout) v3DashboardActivity.n0(R.id.clProviderVideoViewParentContainer)).setState(3);
                    ConstraintLayout constraintLayout = (ConstraintLayout) v3DashboardActivity.n0(R.id.innerContainer);
                    if (constraintLayout != null) {
                        constraintLayout.setPaddingRelative(0, 0, 0, (int) v3DashboardActivity.getResources().getDimension(R.dimen._100sdp));
                    }
                    km.d dVar = v3DashboardActivity.Y0;
                    if (dVar != null) {
                        fVar3 = dVar.e(providerDetailHolderModel.getEarliestAvailableDateTime());
                    }
                    v3DashboardActivity.S0().c(v3DashboardActivity.findViewById(R.id.clProviderVideoViewParentContainer), providerDetailHolderModel, new d1(v3DashboardActivity, providerDetailHolderModel, fVar3), new e1(v3DashboardActivity, providerDetailHolderModel, fVar3), false);
                    BottomSheetBehavior.from((ConstraintLayout) v3DashboardActivity.n0(R.id.clProviderVideoViewParentContainer)).addBottomSheetCallback(new f1(v3DashboardActivity));
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(v3DashboardActivity.f10748v, e10);
                }
            }
        }
        return hs.k.f19476a;
    }
}
