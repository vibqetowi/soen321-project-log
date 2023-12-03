package com.theinnerhour.b2b.utils;

import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import fe.q;
import fe.r;
import is.u;
import kotlin.Metadata;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.o0;
import ss.p;
import ta.v;
/* compiled from: FireStoreUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/d0;", "Lhs/k;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@ns.e(c = "com.theinnerhour.b2b.utils.FireStoreUtilsKt$fetchSingleRecommendedActivity$1$1", f = "FireStoreUtils.kt", l = {611}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FireStoreUtilsKt$fetchSingleRecommendedActivity$1$1 extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {
    final /* synthetic */ ya.h<r> $it;
    final /* synthetic */ p<Boolean, hs.f<String, String>, hs.k> $onLoad;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FireStoreUtilsKt$fetchSingleRecommendedActivity$1$1(ya.h<r> hVar, p<? super Boolean, ? super hs.f<String, String>, hs.k> pVar, ls.d<? super FireStoreUtilsKt$fetchSingleRecommendedActivity$1$1> dVar) {
        super(2, dVar);
        this.$it = hVar;
        this.$onLoad = pVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new FireStoreUtilsKt$fetchSingleRecommendedActivity$1$1(this.$it, this.$onLoad, dVar);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        String str;
        RecommendedActivityModel recommendedActivityModel;
        q qVar;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.label;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                if (this.$it.isSuccessful()) {
                    r result = this.$it.getResult();
                    if (result != null && (qVar = (q) u.h2(result)) != null) {
                        recommendedActivityModel = (RecommendedActivityModel) qVar.d(RecommendedActivityModel.class);
                    } else {
                        recommendedActivityModel = null;
                    }
                    p<Boolean, hs.f<String, String>, hs.k> pVar = this.$onLoad;
                    kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
                    k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
                    FireStoreUtilsKt$fetchSingleRecommendedActivity$1$1$1$1 fireStoreUtilsKt$fetchSingleRecommendedActivity$1$1$1$1 = new FireStoreUtilsKt$fetchSingleRecommendedActivity$1$1$1$1(pVar, recommendedActivityModel, null);
                    this.label = 1;
                    if (v.S(k1Var, fireStoreUtilsKt$fetchSingleRecommendedActivity$1$1$1$1, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper logHelper = LogHelper.INSTANCE;
            str = FireStoreUtilsKt.TAG;
            logHelper.e(str, e10);
        }
        return hs.k.f19476a;
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((FireStoreUtilsKt$fetchSingleRecommendedActivity$1$1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }
}
