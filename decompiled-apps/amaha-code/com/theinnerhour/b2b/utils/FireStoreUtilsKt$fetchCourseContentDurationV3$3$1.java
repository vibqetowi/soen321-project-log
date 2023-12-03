package com.theinnerhour.b2b.utils;

import com.theinnerhour.b2b.model.TemplateModel;
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
@ns.e(c = "com.theinnerhour.b2b.utils.FireStoreUtilsKt$fetchCourseContentDurationV3$3$1", f = "FireStoreUtils.kt", l = {578, 582}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FireStoreUtilsKt$fetchCourseContentDurationV3$3$1 extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {
    final /* synthetic */ ya.h<r> $it;
    final /* synthetic */ p<Boolean, String, hs.k> $onLoad;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FireStoreUtilsKt$fetchCourseContentDurationV3$3$1(ya.h<r> hVar, p<? super Boolean, ? super String, hs.k> pVar, ls.d<? super FireStoreUtilsKt$fetchCourseContentDurationV3$3$1> dVar) {
        super(2, dVar);
        this.$it = hVar;
        this.$onLoad = pVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        FireStoreUtilsKt$fetchCourseContentDurationV3$3$1 fireStoreUtilsKt$fetchCourseContentDurationV3$3$1 = new FireStoreUtilsKt$fetchCourseContentDurationV3$3$1(this.$it, this.$onLoad, dVar);
        fireStoreUtilsKt$fetchCourseContentDurationV3$3$1.L$0 = obj;
        return fireStoreUtilsKt$fetchCourseContentDurationV3$3$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006f A[Catch: Exception -> 0x0085, TRY_LEAVE, TryCatch #0 {Exception -> 0x0085, blocks: (B:6:0x000d, B:11:0x001e, B:27:0x0069, B:30:0x006f, B:14:0x0029, B:16:0x0031, B:18:0x003b, B:20:0x0043, B:22:0x004d, B:24:0x0053), top: B:37:0x0007 }] */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        hs.k kVar;
        q qVar;
        TemplateModel templateModel;
        String duration;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.label;
        try {
        } catch (Exception e10) {
            LogHelper logHelper = LogHelper.INSTANCE;
            str = FireStoreUtilsKt.TAG;
            logHelper.e(str, e10);
        }
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    sp.b.d0(obj);
                    return hs.k.f19476a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d0 d0Var = (d0) this.L$0;
            sp.b.d0(obj);
        } else {
            sp.b.d0(obj);
            d0 d0Var2 = (d0) this.L$0;
            if (this.$it.isSuccessful()) {
                r result = this.$it.getResult();
                if (result != null && (qVar = (q) u.h2(result)) != null && (templateModel = (TemplateModel) qVar.d(TemplateModel.class)) != null && (duration = templateModel.getDuration()) != null) {
                    p<Boolean, String, hs.k> pVar = this.$onLoad;
                    kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
                    k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
                    FireStoreUtilsKt$fetchCourseContentDurationV3$3$1$1$1 fireStoreUtilsKt$fetchCourseContentDurationV3$3$1$1$1 = new FireStoreUtilsKt$fetchCourseContentDurationV3$3$1$1$1(pVar, duration, null);
                    this.L$0 = d0Var2;
                    this.label = 1;
                    if (v.S(k1Var, fireStoreUtilsKt$fetchCourseContentDurationV3$3$1$1$1, this) == aVar) {
                        return aVar;
                    }
                } else {
                    kVar = null;
                    if (kVar == null) {
                        p<Boolean, String, hs.k> pVar2 = this.$onLoad;
                        kotlinx.coroutines.scheduling.c cVar2 = o0.f23640a;
                        k1 k1Var2 = kotlinx.coroutines.internal.k.f23608a;
                        FireStoreUtilsKt$fetchCourseContentDurationV3$3$1$2$1 fireStoreUtilsKt$fetchCourseContentDurationV3$3$1$2$1 = new FireStoreUtilsKt$fetchCourseContentDurationV3$3$1$2$1(pVar2, null);
                        this.L$0 = null;
                        this.label = 2;
                        if (v.S(k1Var2, fireStoreUtilsKt$fetchCourseContentDurationV3$3$1$2$1, this) == aVar) {
                            return aVar;
                        }
                    }
                }
            }
            return hs.k.f19476a;
        }
        kVar = hs.k.f19476a;
        if (kVar == null) {
        }
        return hs.k.f19476a;
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((FireStoreUtilsKt$fetchCourseContentDurationV3$3$1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }
}
