package hr;

import android.view.View;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.utils.Constants;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class w3 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f19342u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ x3 f19343v;

    public /* synthetic */ w3(x3 x3Var, int i6) {
        this.f19342u = i6;
        this.f19343v = x3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f19342u;
        x3 this$0 = this.f19343v;
        switch (i6) {
            case 0:
                int i10 = x3.f19371z;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                TemplateActivity templateActivity = this$0.f19375x;
                if (templateActivity != null) {
                    templateActivity.onBackPressed();
                    return;
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            default:
                int i11 = x3.f19371z;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                TemplateActivity templateActivity2 = this$0.f19375x;
                if (templateActivity2 != null) {
                    templateActivity2.F.put(Constants.DAYMODEL_POSITION, 0);
                    TemplateActivity templateActivity3 = this$0.f19375x;
                    if (templateActivity3 != null) {
                        templateActivity3.onBackPressed();
                        TemplateActivity templateActivity4 = this$0.f19375x;
                        if (templateActivity4 != null) {
                            templateActivity4.onBackPressed();
                            TemplateActivity templateActivity5 = this$0.f19375x;
                            if (templateActivity5 != null) {
                                templateActivity5.onBackPressed();
                                TemplateActivity templateActivity6 = this$0.f19375x;
                                if (templateActivity6 != null) {
                                    templateActivity6.P = true;
                                    return;
                                } else {
                                    kotlin.jvm.internal.i.q("act");
                                    throw null;
                                }
                            }
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
        }
    }
}
