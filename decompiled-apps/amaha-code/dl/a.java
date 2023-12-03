package dl;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.SneakPeekForPlanActivity;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: SneakPeekForPlanActivity.kt */
/* loaded from: classes2.dex */
public final class a extends kotlin.jvm.internal.k implements ss.p<Boolean, TemplateModel, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ SneakPeekForPlanActivity f12966u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SneakPeekForPlanActivity sneakPeekForPlanActivity) {
        super(2);
        this.f12966u = sneakPeekForPlanActivity;
    }

    @Override // ss.p
    public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
        boolean booleanValue = bool.booleanValue();
        TemplateModel templateModel2 = templateModel;
        SneakPeekForPlanActivity sneakPeekForPlanActivity = this.f12966u;
        try {
            ((ConstraintLayout) sneakPeekForPlanActivity.n0(R.id.clSneakPeekLoadingLayout)).setVisibility(8);
            if (booleanValue && templateModel2 != null) {
                SneakPeekForPlanActivity.o0(sneakPeekForPlanActivity, templateModel2);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(sneakPeekForPlanActivity.f10647v, "exception in load course data", e10);
        }
        return hs.k.f19476a;
    }
}
