package com.theinnerhour.b2b.utils;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.widget.Toast;
import com.theinnerhour.b2b.R;
import kotlin.Metadata;
import kotlinx.coroutines.d0;
import ss.p;
/* compiled from: FeedBackUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/d0;", "Lhs/k;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@ns.e(c = "com.theinnerhour.b2b.utils.FeedBackUtils$sendAppFeedback$1$1$1", f = "FeedBackUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FeedBackUtils$sendAppFeedback$1$1$1 extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {
    final /* synthetic */ Dialog $dialog;
    final /* synthetic */ boolean $it;
    final /* synthetic */ ProgressDialog $progressDialog;
    int label;
    final /* synthetic */ FeedBackUtils this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedBackUtils$sendAppFeedback$1$1$1(FeedBackUtils feedBackUtils, boolean z10, Dialog dialog, ProgressDialog progressDialog, ls.d<? super FeedBackUtils$sendAppFeedback$1$1$1> dVar) {
        super(2, dVar);
        this.this$0 = feedBackUtils;
        this.$it = z10;
        this.$dialog = dialog;
        this.$progressDialog = progressDialog;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new FeedBackUtils$sendAppFeedback$1$1$1(this.this$0, this.$it, this.$dialog, this.$progressDialog, dVar);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        int i6;
        if (this.label == 0) {
            sp.b.d0(obj);
            Activity activity = this.this$0.getActivity();
            Activity activity2 = this.this$0.getActivity();
            if (this.$it) {
                i6 = R.string.feedback_submit_toast;
            } else {
                i6 = R.string.feedback_submit_fail_toast;
            }
            Toast.makeText(activity, activity2.getString(i6), 0).show();
            this.$dialog.dismiss();
            this.$progressDialog.dismiss();
            return hs.k.f19476a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((FeedBackUtils$sendAppFeedback$1$1$1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }
}
