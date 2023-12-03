package com.theinnerhour.b2b.utils;

import com.theinnerhour.b2b.model.MiniCourseMeta;
import fe.r;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.o0;
import ss.p;
import ss.q;
import ta.v;
/* compiled from: FireStoreUtils.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfe/r;", "kotlin.jvm.PlatformType", "it", "Lhs/k;", "invoke", "(Lfe/r;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class FireStoreUtilsKt$fetchTopicalCourse$1 extends kotlin.jvm.internal.k implements ss.l<r, hs.k> {
    final /* synthetic */ q<Boolean, String, ArrayList<MiniCourseMeta>, hs.k> $onLoad;
    final /* synthetic */ String $slug;

    /* compiled from: FireStoreUtils.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/d0;", "Lhs/k;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @ns.e(c = "com.theinnerhour.b2b.utils.FireStoreUtilsKt$fetchTopicalCourse$1$1", f = "FireStoreUtils.kt", l = {256}, m = "invokeSuspend")
    /* renamed from: com.theinnerhour.b2b.utils.FireStoreUtilsKt$fetchTopicalCourse$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {
        final /* synthetic */ r $it;
        final /* synthetic */ q<Boolean, String, ArrayList<MiniCourseMeta>, hs.k> $onLoad;
        final /* synthetic */ String $slug;
        int label;

        /* compiled from: FireStoreUtils.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/d0;", "Lhs/k;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @ns.e(c = "com.theinnerhour.b2b.utils.FireStoreUtilsKt$fetchTopicalCourse$1$1$2", f = "FireStoreUtils.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.theinnerhour.b2b.utils.FireStoreUtilsKt$fetchTopicalCourse$1$1$2  reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass2 extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {
            final /* synthetic */ ArrayList<MiniCourseMeta> $metaList;
            final /* synthetic */ q<Boolean, String, ArrayList<MiniCourseMeta>, hs.k> $onLoad;
            final /* synthetic */ String $slug;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(q<? super Boolean, ? super String, ? super ArrayList<MiniCourseMeta>, hs.k> qVar, String str, ArrayList<MiniCourseMeta> arrayList, ls.d<? super AnonymousClass2> dVar) {
                super(2, dVar);
                this.$onLoad = qVar;
                this.$slug = str;
                this.$metaList = arrayList;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new AnonymousClass2(this.$onLoad, this.$slug, this.$metaList, dVar);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    sp.b.d0(obj);
                    return this.$onLoad.invoke(Boolean.TRUE, this.$slug, this.$metaList);
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
        public AnonymousClass1(r rVar, q<? super Boolean, ? super String, ? super ArrayList<MiniCourseMeta>, hs.k> qVar, String str, ls.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$it = rVar;
            this.$onLoad = qVar;
            this.$slug = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new AnonymousClass1(this.$it, this.$onLoad, this.$slug, dVar);
        }

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
                    ArrayList arrayList = new ArrayList();
                    Iterator<fe.q> it = this.$it.iterator();
                    while (true) {
                        r.a aVar2 = (r.a) it;
                        if (!aVar2.hasNext()) {
                            break;
                        }
                        Object d10 = ((fe.q) aVar2.next()).d(MiniCourseMeta.class);
                        kotlin.jvm.internal.i.f(d10, "template.toObject(MiniCourseMeta::class.java)");
                        arrayList.add((MiniCourseMeta) d10);
                    }
                    kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
                    k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$onLoad, this.$slug, arrayList, null);
                    this.label = 1;
                    if (v.S(k1Var, anonymousClass2, this) == aVar) {
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
            return ((AnonymousClass1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FireStoreUtilsKt$fetchTopicalCourse$1(q<? super Boolean, ? super String, ? super ArrayList<MiniCourseMeta>, hs.k> qVar, String str) {
        super(1);
        this.$onLoad = qVar;
        this.$slug = str;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(r rVar) {
        String str;
        try {
            v.H(kotlin.jvm.internal.h.c(o0.f23642c), null, 0, new AnonymousClass1(rVar, this.$onLoad, this.$slug, null), 3);
        } catch (Exception e10) {
            this.$onLoad.invoke(Boolean.FALSE, this.$slug, new ArrayList<>());
            LogHelper logHelper = LogHelper.INSTANCE;
            str = FireStoreUtilsKt.TAG;
            logHelper.e(str, "exception", e10);
        }
    }

    @Override // ss.l
    public /* bridge */ /* synthetic */ hs.k invoke(r rVar) {
        invoke2(rVar);
        return hs.k.f19476a;
    }
}
