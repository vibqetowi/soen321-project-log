package com.theinnerhour.b2b.utils;

import com.theinnerhour.b2b.model.ContentBankModel;
import fe.r;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.o0;
import ss.p;
import ta.v;
/* compiled from: FireStoreUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/d0;", "Lhs/k;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@ns.e(c = "com.theinnerhour.b2b.utils.FireStoreUtilsKt$checkIfActivityPublished$1$1", f = "FireStoreUtils.kt", l = {446, 450}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FireStoreUtilsKt$checkIfActivityPublished$1$1 extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {
    final /* synthetic */ ya.h<r> $it;
    final /* synthetic */ p<Boolean, Boolean, hs.k> $onLoad;
    int label;

    /* compiled from: FireStoreUtils.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/d0;", "Lhs/k;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @ns.e(c = "com.theinnerhour.b2b.utils.FireStoreUtilsKt$checkIfActivityPublished$1$1$1", f = "FireStoreUtils.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.theinnerhour.b2b.utils.FireStoreUtilsKt$checkIfActivityPublished$1$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {
        final /* synthetic */ ArrayList<ContentBankModel> $contentList;
        final /* synthetic */ p<Boolean, Boolean, hs.k> $onLoad;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(p<? super Boolean, ? super Boolean, hs.k> pVar, ArrayList<ContentBankModel> arrayList, ls.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$onLoad = pVar;
            this.$contentList = arrayList;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new AnonymousClass1(this.$onLoad, this.$contentList, dVar);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                sp.b.d0(obj);
                p<Boolean, Boolean, hs.k> pVar = this.$onLoad;
                Boolean bool = Boolean.TRUE;
                boolean z10 = false;
                if (!this.$contentList.isEmpty()) {
                    Boolean published = this.$contentList.get(0).getPublished();
                    kotlin.jvm.internal.i.d(published);
                    z10 = published.booleanValue();
                }
                pVar.invoke(bool, Boolean.valueOf(z10));
                return hs.k.f19476a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((AnonymousClass1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }
    }

    /* compiled from: FireStoreUtils.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/d0;", "Lhs/k;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @ns.e(c = "com.theinnerhour.b2b.utils.FireStoreUtilsKt$checkIfActivityPublished$1$1$2", f = "FireStoreUtils.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.theinnerhour.b2b.utils.FireStoreUtilsKt$checkIfActivityPublished$1$1$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {
        final /* synthetic */ p<Boolean, Boolean, hs.k> $onLoad;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(p<? super Boolean, ? super Boolean, hs.k> pVar, ls.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$onLoad = pVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new AnonymousClass2(this.$onLoad, dVar);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                sp.b.d0(obj);
                p<Boolean, Boolean, hs.k> pVar = this.$onLoad;
                Boolean bool = Boolean.FALSE;
                pVar.invoke(bool, bool);
                return hs.k.f19476a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((AnonymousClass2) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FireStoreUtilsKt$checkIfActivityPublished$1$1(ya.h<r> hVar, p<? super Boolean, ? super Boolean, hs.k> pVar, ls.d<? super FireStoreUtilsKt$checkIfActivityPublished$1$1> dVar) {
        super(2, dVar);
        this.$it = hVar;
        this.$onLoad = pVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new FireStoreUtilsKt$checkIfActivityPublished$1$1(this.$it, this.$onLoad, dVar);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005f -> B:22:0x0068). Please submit an issue!!! */
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
                if (this.$it.isSuccessful()) {
                    r result = this.$it.getResult();
                    kotlin.jvm.internal.i.d(result);
                    ArrayList g5 = result.g(ContentBankModel.class);
                    kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
                    k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onLoad, g5, null);
                    this.label = 1;
                    if (v.S(k1Var, anonymousClass1, this) == aVar) {
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
        return ((FireStoreUtilsKt$checkIfActivityPublished$1$1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }
}
