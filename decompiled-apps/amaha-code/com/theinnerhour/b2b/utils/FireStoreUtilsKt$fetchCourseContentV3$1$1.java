package com.theinnerhour.b2b.utils;

import com.theinnerhour.b2b.model.TemplateModel;
import fe.q;
import fe.r;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.x;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.o0;
import ss.p;
import ta.v;
/* compiled from: FireStoreUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/d0;", "Lhs/k;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@ns.e(c = "com.theinnerhour.b2b.utils.FireStoreUtilsKt$fetchCourseContentV3$1$1", f = "FireStoreUtils.kt", l = {391}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FireStoreUtilsKt$fetchCourseContentV3$1$1 extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {
    final /* synthetic */ ya.h<r> $it;
    final /* synthetic */ p<Boolean, TemplateModel, hs.k> $onLoad;
    int label;

    /* compiled from: FireStoreUtils.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/d0;", "Lhs/k;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @ns.e(c = "com.theinnerhour.b2b.utils.FireStoreUtilsKt$fetchCourseContentV3$1$1$1", f = "FireStoreUtils.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.theinnerhour.b2b.utils.FireStoreUtilsKt$fetchCourseContentV3$1$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {
        final /* synthetic */ ya.h<r> $it;
        final /* synthetic */ p<Boolean, TemplateModel, hs.k> $onLoad;
        final /* synthetic */ x<TemplateModel> $templateModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(p<? super Boolean, ? super TemplateModel, hs.k> pVar, ya.h<r> hVar, x<TemplateModel> xVar, ls.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$onLoad = pVar;
            this.$it = hVar;
            this.$templateModel = xVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new AnonymousClass1(this.$onLoad, this.$it, this.$templateModel, dVar);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                sp.b.d0(obj);
                this.$onLoad.invoke(Boolean.valueOf(this.$it.isSuccessful()), this.$templateModel.f23469u);
                return hs.k.f19476a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((AnonymousClass1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FireStoreUtilsKt$fetchCourseContentV3$1$1(ya.h<r> hVar, p<? super Boolean, ? super TemplateModel, hs.k> pVar, ls.d<? super FireStoreUtilsKt$fetchCourseContentV3$1$1> dVar) {
        super(2, dVar);
        this.$it = hVar;
        this.$onLoad = pVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new FireStoreUtilsKt$fetchCourseContentV3$1$1(this.$it, this.$onLoad, dVar);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.Object] */
    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        String str;
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
                x xVar = new x();
                if (this.$it.isSuccessful()) {
                    Iterator<q> it = this.$it.getResult().iterator();
                    while (true) {
                        r.a aVar2 = (r.a) it;
                        if (!aVar2.hasNext()) {
                            break;
                        }
                        q qVar = (q) aVar2.next();
                        ?? d10 = qVar.d(TemplateModel.class);
                        xVar.f23469u = d10;
                        ((TemplateModel) d10).setGoal_type(qVar.c());
                    }
                }
                kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
                k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onLoad, this.$it, xVar, null);
                this.label = 1;
                if (v.S(k1Var, anonymousClass1, this) == aVar) {
                    return aVar;
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
        return ((FireStoreUtilsKt$fetchCourseContentV3$1$1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }
}
