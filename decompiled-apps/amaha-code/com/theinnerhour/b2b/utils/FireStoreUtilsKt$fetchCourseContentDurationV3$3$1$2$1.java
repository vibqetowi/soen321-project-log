package com.theinnerhour.b2b.utils;

import kotlin.Metadata;
import kotlinx.coroutines.d0;
import ss.p;
/* compiled from: FireStoreUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/d0;", "Lhs/k;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@ns.e(c = "com.theinnerhour.b2b.utils.FireStoreUtilsKt$fetchCourseContentDurationV3$3$1$2$1", f = "FireStoreUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FireStoreUtilsKt$fetchCourseContentDurationV3$3$1$2$1 extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {
    final /* synthetic */ p<Boolean, String, hs.k> $onLoad;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FireStoreUtilsKt$fetchCourseContentDurationV3$3$1$2$1(p<? super Boolean, ? super String, hs.k> pVar, ls.d<? super FireStoreUtilsKt$fetchCourseContentDurationV3$3$1$2$1> dVar) {
        super(2, dVar);
        this.$onLoad = pVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new FireStoreUtilsKt$fetchCourseContentDurationV3$3$1$2$1(this.$onLoad, dVar);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            sp.b.d0(obj);
            this.$onLoad.invoke(Boolean.FALSE, null);
            return hs.k.f19476a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((FireStoreUtilsKt$fetchCourseContentDurationV3$3$1$2$1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }
}
