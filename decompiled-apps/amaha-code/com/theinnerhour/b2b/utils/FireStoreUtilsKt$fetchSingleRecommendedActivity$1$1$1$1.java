package com.theinnerhour.b2b.utils;

import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import kotlin.Metadata;
import kotlinx.coroutines.d0;
import ss.p;
/* compiled from: FireStoreUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/d0;", "Lhs/k;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@ns.e(c = "com.theinnerhour.b2b.utils.FireStoreUtilsKt$fetchSingleRecommendedActivity$1$1$1$1", f = "FireStoreUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FireStoreUtilsKt$fetchSingleRecommendedActivity$1$1$1$1 extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {
    final /* synthetic */ RecommendedActivityModel $obj;
    final /* synthetic */ p<Boolean, hs.f<String, String>, hs.k> $onLoad;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FireStoreUtilsKt$fetchSingleRecommendedActivity$1$1$1$1(p<? super Boolean, ? super hs.f<String, String>, hs.k> pVar, RecommendedActivityModel recommendedActivityModel, ls.d<? super FireStoreUtilsKt$fetchSingleRecommendedActivity$1$1$1$1> dVar) {
        super(2, dVar);
        this.$onLoad = pVar;
        this.$obj = recommendedActivityModel;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new FireStoreUtilsKt$fetchSingleRecommendedActivity$1$1$1$1(this.$onLoad, this.$obj, dVar);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        String reminderDescription;
        if (this.label == 0) {
            sp.b.d0(obj);
            p<Boolean, hs.f<String, String>, hs.k> pVar = this.$onLoad;
            Boolean bool = Boolean.TRUE;
            RecommendedActivityModel recommendedActivityModel = this.$obj;
            String str = "";
            String str2 = (recommendedActivityModel == null || (str2 = recommendedActivityModel.getReminderTitle()) == null) ? "" : "";
            RecommendedActivityModel recommendedActivityModel2 = this.$obj;
            if (recommendedActivityModel2 != null && (reminderDescription = recommendedActivityModel2.getReminderDescription()) != null) {
                str = reminderDescription;
            }
            pVar.invoke(bool, new hs.f<>(str2, str));
            return hs.k.f19476a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((FireStoreUtilsKt$fetchSingleRecommendedActivity$1$1$1$1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }
}
