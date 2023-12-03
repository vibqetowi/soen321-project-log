package com.theinnerhour.b2b.utils;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.pm.PackageInfo;
import com.theinnerhour.b2b.MyApplication;
import jl.t1;
import kotlin.Metadata;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.o0;
import ss.p;
import ta.v;
/* compiled from: FeedBackUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/d0;", "Lhs/k;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@ns.e(c = "com.theinnerhour.b2b.utils.FeedBackUtils$sendAppFeedback$1", f = "FeedBackUtils.kt", l = {304, 309}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FeedBackUtils$sendAppFeedback$1 extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {
    final /* synthetic */ Dialog $dialog;
    final /* synthetic */ String $feedback;
    final /* synthetic */ ProgressDialog $progressDialog;
    int label;
    final /* synthetic */ FeedBackUtils this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedBackUtils$sendAppFeedback$1(FeedBackUtils feedBackUtils, String str, Dialog dialog, ProgressDialog progressDialog, ls.d<? super FeedBackUtils$sendAppFeedback$1> dVar) {
        super(2, dVar);
        this.this$0 = feedBackUtils;
        this.$feedback = str;
        this.$dialog = dialog;
        this.$progressDialog = progressDialog;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new FeedBackUtils$sendAppFeedback$1(this.this$0, this.$feedback, this.$dialog, this.$progressDialog, dVar);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        String str;
        t1 nv4feedbackRepository;
        boolean z10;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.label;
        try {
        } catch (Exception e10) {
            LogHelper logHelper = LogHelper.INSTANCE;
            str = this.this$0.TAG;
            logHelper.e(str, "https://us-central1-gcpinnerhour.cloudfunctions.net/appFeedback", e10);
        }
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    sp.b.d0(obj);
                    return hs.k.f19476a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sp.b.d0(obj);
        } else {
            sp.b.d0(obj);
            nv4feedbackRepository = this.this$0.getNv4feedbackRepository();
            String str2 = this.$feedback;
            MyApplication.a aVar2 = MyApplication.V;
            PackageInfo packageInfo = aVar2.a().getPackageManager().getPackageInfo(aVar2.a().getPackageName(), 0);
            kotlin.jvm.internal.i.f(packageInfo, "MyApplication.instance.p….instance.packageName, 0)");
            this.label = 1;
            obj = nv4feedbackRepository.b(str2, packageInfo, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        FeedBackUtils feedBackUtils = this.this$0;
        Dialog dialog = this.$dialog;
        ProgressDialog progressDialog = this.$progressDialog;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
        k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
        if (booleanValue) {
            z10 = true;
        } else {
            z10 = false;
        }
        FeedBackUtils$sendAppFeedback$1$1$1 feedBackUtils$sendAppFeedback$1$1$1 = new FeedBackUtils$sendAppFeedback$1$1$1(feedBackUtils, z10, dialog, progressDialog, null);
        this.label = 2;
        if (v.S(k1Var, feedBackUtils$sendAppFeedback$1$1$1, this) == aVar) {
            return aVar;
        }
        return hs.k.f19476a;
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((FeedBackUtils$sendAppFeedback$1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }
}
