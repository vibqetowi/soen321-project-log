package dk;

import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.ProgressDialogUtil;
import com.theinnerhour.b2b.utils.Utils;
/* compiled from: TemplateActivity.kt */
/* loaded from: classes2.dex */
public final class d0 extends kotlin.jvm.internal.k implements ss.p<Boolean, TemplateModel, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ TemplateActivity f12912u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(TemplateActivity templateActivity) {
        super(2);
        this.f12912u = templateActivity;
    }

    @Override // ss.p
    public final hs.k invoke(Boolean bool, TemplateModel templateModel) {
        boolean booleanValue = bool.booleanValue();
        TemplateModel templateModel2 = templateModel;
        TemplateActivity templateActivity = this.f12912u;
        try {
            ProgressDialogUtil progressDialogUtil = templateActivity.f10546x;
            if (progressDialogUtil != null) {
                progressDialogUtil.dismiss();
            }
            LogHelper.INSTANCE.i(templateActivity.f10545w, "fetch course content template activity " + booleanValue);
            if (booleanValue && templateModel2 != null) {
                templateActivity.I = true;
                int size = templateModel2.getTemplate().size();
                for (int i6 = 0; i6 < size; i6++) {
                    if (templateModel2.getGoalScreens().contains(Integer.valueOf(i6))) {
                        templateModel2.getTemplate().get(i6).setResult_screen(true);
                    }
                }
                templateActivity.f10547y = templateModel2;
                if (!templateActivity.getIntent().hasExtra("type")) {
                    TemplateModel templateModel3 = templateActivity.f10547y;
                    kotlin.jvm.internal.i.d(templateModel3);
                    templateModel3.setGoal_type(Constants.GOAL_TYPE_ACTIVITY_DAILY);
                }
                templateActivity.H0();
                TemplateActivity.u0(templateActivity);
                templateActivity.Q = true;
                templateActivity.t0();
            } else {
                Utils.INSTANCE.showCustomToast(templateActivity, "Something went wrong, please try again");
                templateActivity.finish();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(templateActivity.f10545w, "exception", e10);
            Utils.INSTANCE.showCustomToast(templateActivity, "Something went wrong, please try again");
            templateActivity.finish();
        }
        return hs.k.f19476a;
    }
}
