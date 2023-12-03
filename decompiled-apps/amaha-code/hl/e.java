package hl;

import android.app.Dialog;
import android.view.View;
import com.theinnerhour.b2b.utils.FeedBackUtils;
import com.theinnerhour.b2b.utils.UtilsKt;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f17666u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Dialog f17667v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ FeedBackUtils f17668w;

    public /* synthetic */ e(Dialog dialog, FeedBackUtils feedBackUtils, int i6) {
        this.f17666u = i6;
        this.f17667v = dialog;
        this.f17668w = feedBackUtils;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f17666u;
        FeedBackUtils feedBackUtils = this.f17668w;
        Dialog dialog = this.f17667v;
        switch (i6) {
            case 0:
                int i10 = g.K;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(feedBackUtils, "$feedBackUtils");
                dialog.dismiss();
                feedBackUtils.showBadFeedbackDialog();
                String str = gk.a.f16573a;
                gk.a.b(UtilsKt.getAnalyticsBundle(), "topical_remove_dialog_cancel");
                return;
            case 1:
                int i11 = s.f17728g0;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(feedBackUtils, "$feedBackUtils");
                dialog.dismiss();
                feedBackUtils.showBadFeedbackDialog();
                String str2 = gk.a.f16573a;
                gk.a.b(UtilsKt.getAnalyticsBundle(), "topical_remove_dialog_cancel");
                return;
            case 2:
                FeedBackUtils.showPlayStoreReviewFeedbackPopup$lambda$8(feedBackUtils, dialog, view);
                return;
            default:
                FeedBackUtils.showBadFeedbackDialog$lambda$7(dialog, feedBackUtils, view);
                return;
        }
    }

    public /* synthetic */ e(FeedBackUtils feedBackUtils, Dialog dialog) {
        this.f17666u = 2;
        this.f17668w = feedBackUtils;
        this.f17667v = dialog;
    }
}
