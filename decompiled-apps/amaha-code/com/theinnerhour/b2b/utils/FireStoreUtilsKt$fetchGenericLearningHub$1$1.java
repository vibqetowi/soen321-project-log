package com.theinnerhour.b2b.utils;

import com.appsflyer.R;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.PostsDisplayed;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import fe.q;
import fe.r;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.o0;
import ss.p;
import ta.v;
/* compiled from: FireStoreUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/d0;", "Lhs/k;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@ns.e(c = "com.theinnerhour.b2b.utils.FireStoreUtilsKt$fetchGenericLearningHub$1$1", f = "FireStoreUtils.kt", l = {R.styleable.AppCompatTheme_windowFixedHeightMajor}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FireStoreUtilsKt$fetchGenericLearningHub$1$1 extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {
    final /* synthetic */ ya.h<r> $it;
    final /* synthetic */ p<Boolean, ArrayList<LearningHubModel>, hs.k> $onLoad;
    int label;

    /* compiled from: FireStoreUtils.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/d0;", "Lhs/k;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @ns.e(c = "com.theinnerhour.b2b.utils.FireStoreUtilsKt$fetchGenericLearningHub$1$1$2", f = "FireStoreUtils.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.theinnerhour.b2b.utils.FireStoreUtilsKt$fetchGenericLearningHub$1$1$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {
        final /* synthetic */ ArrayList<LearningHubModel> $learningHubModel;
        final /* synthetic */ p<Boolean, ArrayList<LearningHubModel>, hs.k> $onLoad;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(p<? super Boolean, ? super ArrayList<LearningHubModel>, hs.k> pVar, ArrayList<LearningHubModel> arrayList, ls.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$onLoad = pVar;
            this.$learningHubModel = arrayList;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new AnonymousClass2(this.$onLoad, this.$learningHubModel, dVar);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                sp.b.d0(obj);
                this.$onLoad.invoke(Boolean.TRUE, this.$learningHubModel);
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
    public FireStoreUtilsKt$fetchGenericLearningHub$1$1(ya.h<r> hVar, p<? super Boolean, ? super ArrayList<LearningHubModel>, hs.k> pVar, ls.d<? super FireStoreUtilsKt$fetchGenericLearningHub$1$1> dVar) {
        super(2, dVar);
        this.$it = hVar;
        this.$onLoad = pVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new FireStoreUtilsKt$fetchGenericLearningHub$1$1(this.$it, this.$onLoad, dVar);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z10;
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
                ArrayList<PostsDisplayed> postsDisplayed = FirebasePersistence.getInstance().getUser().getPostsDisplayed();
                r result = this.$it.getResult();
                if (result != null) {
                    Iterator<q> it = result.iterator();
                    while (true) {
                        r.a aVar2 = (r.a) it;
                        if (!aVar2.hasNext()) {
                            break;
                        }
                        q qVar = (q) aVar2.next();
                        Object d10 = qVar.d(LearningHubModel.class);
                        kotlin.jvm.internal.i.f(d10, "template1.toObject(LearningHubModel::class.java)");
                        LearningHubModel learningHubModel = (LearningHubModel) d10;
                        learningHubModel.setId(qVar.b());
                        boolean z11 = false;
                        if (postsDisplayed != null && (!postsDisplayed.isEmpty())) {
                            Iterator<PostsDisplayed> it2 = postsDisplayed.iterator();
                            z10 = true;
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                PostsDisplayed next = it2.next();
                                if (kotlin.jvm.internal.i.b(next.getPostId(), learningHubModel.getId())) {
                                    if (!kotlin.jvm.internal.i.b(next.getCourseName(), FirebasePersistence.getInstance().getUser().getCurrentCourseName())) {
                                        z11 = true;
                                        z10 = false;
                                        break;
                                    }
                                    z10 = false;
                                }
                            }
                        } else {
                            z10 = true;
                        }
                        if (!z11) {
                            arrayList.add(learningHubModel);
                        }
                        if (z10) {
                            PostsDisplayed postsDisplayed2 = new PostsDisplayed();
                            postsDisplayed2.setCourseName(FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                            postsDisplayed2.setPostId(learningHubModel.getId());
                            postsDisplayed.add(postsDisplayed2);
                            FirebasePersistence.getInstance().updateUserOnFirebase();
                        }
                    }
                }
                kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
                k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$onLoad, arrayList, null);
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
        return ((FireStoreUtilsKt$fetchGenericLearningHub$1$1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }
}
