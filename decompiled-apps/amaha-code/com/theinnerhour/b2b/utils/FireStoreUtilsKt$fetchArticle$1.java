package com.theinnerhour.b2b.utils;

import com.theinnerhour.b2b.model.LearningHubModel;
import kotlin.Metadata;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.o0;
import ss.p;
import ta.v;
/* compiled from: FireStoreUtils.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfe/g;", "kotlin.jvm.PlatformType", "it", "Lhs/k;", "invoke", "(Lfe/g;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class FireStoreUtilsKt$fetchArticle$1 extends kotlin.jvm.internal.k implements ss.l<fe.g, hs.k> {
    final /* synthetic */ p<Boolean, LearningHubModel, Object> $onLoad;

    /* compiled from: FireStoreUtils.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/d0;", "Lhs/k;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @ns.e(c = "com.theinnerhour.b2b.utils.FireStoreUtilsKt$fetchArticle$1$1", f = "FireStoreUtils.kt", l = {352, 356}, m = "invokeSuspend")
    /* renamed from: com.theinnerhour.b2b.utils.FireStoreUtilsKt$fetchArticle$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {
        final /* synthetic */ fe.g $it;
        final /* synthetic */ p<Boolean, LearningHubModel, Object> $onLoad;
        int label;

        /* compiled from: FireStoreUtils.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/d0;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @ns.e(c = "com.theinnerhour.b2b.utils.FireStoreUtilsKt$fetchArticle$1$1$1", f = "FireStoreUtils.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.theinnerhour.b2b.utils.FireStoreUtilsKt$fetchArticle$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C01691 extends ns.i implements p<d0, ls.d<? super Object>, Object> {
            final /* synthetic */ p<Boolean, LearningHubModel, Object> $onLoad;
            final /* synthetic */ LearningHubModel $tempModel;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C01691(p<? super Boolean, ? super LearningHubModel, ? extends Object> pVar, LearningHubModel learningHubModel, ls.d<? super C01691> dVar) {
                super(2, dVar);
                this.$onLoad = pVar;
                this.$tempModel = learningHubModel;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new C01691(this.$onLoad, this.$tempModel, dVar);
            }

            @Override // ss.p
            public /* bridge */ /* synthetic */ Object invoke(d0 d0Var, ls.d<? super Object> dVar) {
                return invoke2(d0Var, (ls.d<Object>) dVar);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    sp.b.d0(obj);
                    return this.$onLoad.invoke(Boolean.TRUE, this.$tempModel);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(d0 d0Var, ls.d<Object> dVar) {
                return ((C01691) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }
        }

        /* compiled from: FireStoreUtils.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/d0;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @ns.e(c = "com.theinnerhour.b2b.utils.FireStoreUtilsKt$fetchArticle$1$1$2", f = "FireStoreUtils.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.theinnerhour.b2b.utils.FireStoreUtilsKt$fetchArticle$1$1$2  reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass2 extends ns.i implements p<d0, ls.d<? super Object>, Object> {
            final /* synthetic */ p<Boolean, LearningHubModel, Object> $onLoad;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(p<? super Boolean, ? super LearningHubModel, ? extends Object> pVar, ls.d<? super AnonymousClass2> dVar) {
                super(2, dVar);
                this.$onLoad = pVar;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new AnonymousClass2(this.$onLoad, dVar);
            }

            @Override // ss.p
            public /* bridge */ /* synthetic */ Object invoke(d0 d0Var, ls.d<? super Object> dVar) {
                return invoke2(d0Var, (ls.d<Object>) dVar);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    sp.b.d0(obj);
                    return this.$onLoad.invoke(Boolean.FALSE, new LearningHubModel());
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(d0 d0Var, ls.d<Object> dVar) {
                return ((AnonymousClass2) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(fe.g gVar, p<? super Boolean, ? super LearningHubModel, ? extends Object> pVar, ls.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$it = gVar;
            this.$onLoad = pVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new AnonymousClass1(this.$it, this.$onLoad, dVar);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005c -> B:23:0x0065). Please submit an issue!!! */
        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            String str;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.label;
            try {
                if (i6 != 0) {
                    if (i6 != 1 && i6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sp.b.d0(obj);
                } else {
                    sp.b.d0(obj);
                    LearningHubModel learningHubModel = (LearningHubModel) this.$it.d(LearningHubModel.class);
                    if (learningHubModel != null) {
                        learningHubModel.setId(this.$it.b());
                        kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
                        k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
                        C01691 c01691 = new C01691(this.$onLoad, learningHubModel, null);
                        this.label = 1;
                        if (v.S(k1Var, c01691, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        kotlinx.coroutines.scheduling.c cVar2 = o0.f23640a;
                        k1 k1Var2 = kotlinx.coroutines.internal.k.f23608a;
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$onLoad, null);
                        this.label = 2;
                        if (v.S(k1Var2, anonymousClass2, this) == aVar) {
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
            return ((AnonymousClass1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FireStoreUtilsKt$fetchArticle$1(p<? super Boolean, ? super LearningHubModel, ? extends Object> pVar) {
        super(1);
        this.$onLoad = pVar;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(fe.g gVar) {
        String str;
        try {
            v.H(kotlin.jvm.internal.h.c(o0.f23642c), null, 0, new AnonymousClass1(gVar, this.$onLoad, null), 3);
        } catch (Exception e10) {
            this.$onLoad.invoke(Boolean.FALSE, new LearningHubModel());
            LogHelper logHelper = LogHelper.INSTANCE;
            str = FireStoreUtilsKt.TAG;
            logHelper.e(str, "exception", e10);
        }
    }

    @Override // ss.l
    public /* bridge */ /* synthetic */ hs.k invoke(fe.g gVar) {
        invoke2(gVar);
        return hs.k.f19476a;
    }
}
