package com.theinnerhour.b2b.persistence;

import hs.k;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.d0;
import ls.d;
import ns.e;
import ns.i;
import sp.b;
import ss.p;
/* compiled from: FirebasePersistenceUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/d0;", "Lhs/k;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@e(c = "com.theinnerhour.b2b.persistence.FirebasePersistenceUtils$updateCourseInfo$6", f = "FirebasePersistenceUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FirebasePersistenceUtils$updateCourseInfo$6 extends i implements p<d0, d<? super k>, Object> {
    final /* synthetic */ u $isItemsAdded;
    int label;
    final /* synthetic */ FirebasePersistenceUtils this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebasePersistenceUtils$updateCourseInfo$6(FirebasePersistenceUtils firebasePersistenceUtils, u uVar, d<? super FirebasePersistenceUtils$updateCourseInfo$6> dVar) {
        super(2, dVar);
        this.this$0 = firebasePersistenceUtils;
        this.$isItemsAdded = uVar;
    }

    @Override // ns.a
    public final d<k> create(Object obj, d<?> dVar) {
        return new FirebasePersistenceUtils$updateCourseInfo$6(this.this$0, this.$isItemsAdded, dVar);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        FirebasePersistence firebasePersistence;
        if (this.label == 0) {
            b.d0(obj);
            firebasePersistence = this.this$0.persistence;
            firebasePersistence.triggerNewItemsAdded(this.$isItemsAdded.f23466u);
            return k.f19476a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, d<? super k> dVar) {
        return ((FirebasePersistenceUtils$updateCourseInfo$6) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }
}
