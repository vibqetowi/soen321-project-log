package dk;

import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.utils.FireStoreUtilsKt;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.ProgressDialogUtil;
import com.theinnerhour.b2b.utils.Utils;
/* compiled from: TemplateActivity.kt */
/* loaded from: classes2.dex */
public final class g0 extends kotlin.jvm.internal.k implements ss.p<Boolean, Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f12922u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TemplateActivity f12923v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(String str, TemplateActivity templateActivity) {
        super(2);
        this.f12922u = str;
        this.f12923v = templateActivity;
    }

    @Override // ss.p
    public final hs.k invoke(Boolean bool, Boolean bool2) {
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = bool2.booleanValue();
        TemplateActivity templateActivity = this.f12923v;
        try {
            if (booleanValue) {
                String str = this.f12922u;
                if (booleanValue2) {
                    FireStoreUtilsKt.fetchCourseContentV3("en", str, new e0(templateActivity, booleanValue));
                } else {
                    FireStoreUtilsKt.fetchCourseContent("en", str, new f0(templateActivity, booleanValue));
                }
            } else {
                ProgressDialogUtil progressDialogUtil = templateActivity.f10546x;
                if (progressDialogUtil != null) {
                    progressDialogUtil.dismiss();
                }
                Utils.INSTANCE.showCustomToast(templateActivity, "Something went wrong");
                templateActivity.finish();
            }
        } catch (Exception e10) {
            Utils.INSTANCE.showCustomToast(templateActivity, "Something went wrong");
            templateActivity.finish();
            LogHelper.INSTANCE.e(templateActivity.f10545w, "error in content_bank", e10);
        }
        return hs.k.f19476a;
    }
}
