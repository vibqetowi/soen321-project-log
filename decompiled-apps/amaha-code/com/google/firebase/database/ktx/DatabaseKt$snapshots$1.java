package com.google.firebase.database.ktx;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import hs.k;
import iv.n;
import iv.q;
import kotlin.Metadata;
import ls.d;
import ns.e;
import ns.i;
import ss.p;
/* compiled from: Database.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Liv/q;", "Lcom/google/firebase/database/DataSnapshot;", "Lhs/k;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@e(c = "com.google.firebase.database.ktx.DatabaseKt$snapshots$1", f = "Database.kt", l = {com.appsflyer.R.styleable.AppCompatTheme_popupMenuStyle}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DatabaseKt$snapshots$1 extends i implements p<q<? super DataSnapshot>, d<? super k>, Object> {
    final /* synthetic */ Query $this_snapshots;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: Database.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lhs/k;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.google.firebase.database.ktx.DatabaseKt$snapshots$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.k implements ss.a<k> {
        final /* synthetic */ ValueEventListener $listener;
        final /* synthetic */ Query $this_snapshots;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Query query, ValueEventListener valueEventListener) {
            super(0);
            this.$this_snapshots = query;
            this.$listener = valueEventListener;
        }

        @Override // ss.a
        public /* bridge */ /* synthetic */ k invoke() {
            invoke2();
            return k.f19476a;
        }

        @Override // ss.a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$this_snapshots.removeEventListener(this.$listener);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatabaseKt$snapshots$1(Query query, d<? super DatabaseKt$snapshots$1> dVar) {
        super(2, dVar);
        this.$this_snapshots = query;
    }

    @Override // ns.a
    public final d<k> create(Object obj, d<?> dVar) {
        DatabaseKt$snapshots$1 databaseKt$snapshots$1 = new DatabaseKt$snapshots$1(this.$this_snapshots, dVar);
        databaseKt$snapshots$1.L$0 = obj;
        return databaseKt$snapshots$1;
    }

    @Override // ss.p
    public final Object invoke(q<? super DataSnapshot> qVar, d<? super k> dVar) {
        return ((DatabaseKt$snapshots$1) create(qVar, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            q qVar = (q) this.L$0;
            Query query = this.$this_snapshots;
            ValueEventListener addValueEventListener = query.addValueEventListener(new DatabaseKt$snapshots$1$listener$1(query, qVar));
            kotlin.jvm.internal.i.f(addValueEventListener, "Query.snapshots\n    get(…\n            }\n        })");
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_snapshots, addValueEventListener);
            this.label = 1;
            if (n.a(qVar, anonymousClass1, this) == aVar) {
                return aVar;
            }
        }
        return k.f19476a;
    }
}
