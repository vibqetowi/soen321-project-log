package com.theinnerhour.b2b.utils;

import android.app.ProgressDialog;
import jl.t1;
import kotlin.Metadata;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.o0;
import ss.p;
import ta.v;
/* compiled from: FeedBackUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/d0;", "Lhs/k;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@ns.e(c = "com.theinnerhour.b2b.utils.FeedBackUtils$saveFeedbackPopup$1", f = "FeedBackUtils.kt", l = {341, 346}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FeedBackUtils$saveFeedbackPopup$1 extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {
    final /* synthetic */ String $platform;
    final /* synthetic */ ProgressDialog $progressDialog;
    final /* synthetic */ int $rate;
    int label;
    final /* synthetic */ FeedBackUtils this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedBackUtils$saveFeedbackPopup$1(FeedBackUtils feedBackUtils, int i6, String str, ProgressDialog progressDialog, ls.d<? super FeedBackUtils$saveFeedbackPopup$1> dVar) {
        super(2, dVar);
        this.this$0 = feedBackUtils;
        this.$rate = i6;
        this.$platform = str;
        this.$progressDialog = progressDialog;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new FeedBackUtils$saveFeedbackPopup$1(this.this$0, this.$rate, this.$platform, this.$progressDialog, dVar);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        String str;
        t1 nv4feedbackRepository;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.label;
        try {
        } catch (Exception e10) {
            LogHelper logHelper = LogHelper.INSTANCE;
            str = this.this$0.TAG;
            logHelper.e(str, "https://api.theinnerhour.com/v1/employeefeedback", e10);
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
            int i10 = this.$rate;
            String str2 = this.$platform;
            this.label = 1;
            obj = nv4feedbackRepository.a(i10, str2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        ProgressDialog progressDialog = this.$progressDialog;
        ((Boolean) obj).booleanValue();
        kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
        k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
        FeedBackUtils$saveFeedbackPopup$1$1$1 feedBackUtils$saveFeedbackPopup$1$1$1 = new FeedBackUtils$saveFeedbackPopup$1$1$1(progressDialog, null);
        this.label = 2;
        if (v.S(k1Var, feedBackUtils$saveFeedbackPopup$1$1$1, this) == aVar) {
            return aVar;
        }
        return hs.k.f19476a;
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((FeedBackUtils$saveFeedbackPopup$1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }
}
