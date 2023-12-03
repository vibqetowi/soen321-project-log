package em;

import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.components.goals.model.NotificationGoal;
import hs.k;
import is.u;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.d0;
import ns.i;
import ss.p;
import ta.v;
/* compiled from: GoalsNotificationUtils.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.utils.GoalsNotificationUtils$getNotificationsForGoals$2$1", f = "GoalsNotificationUtils.kt", l = {333}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f14399u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f14400v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ List<FirestoreGoal> f14401w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ d f14402x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ ls.d<List<NotificationGoal>> f14403y;

    /* compiled from: GoalsNotificationUtils.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.utils.GoalsNotificationUtils$getNotificationsForGoals$2$1$1$1", f = "GoalsNotificationUtils.kt", l = {332}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<d0, ls.d<? super NotificationGoal>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f14404u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ d f14405v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ FirestoreGoal f14406w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, FirestoreGoal firestoreGoal, ls.d<? super a> dVar2) {
            super(2, dVar2);
            this.f14405v = dVar;
            this.f14406w = firestoreGoal;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f14405v, this.f14406w, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super NotificationGoal> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f14404u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                this.f14404u = 1;
                obj = this.f14405v.c(this.f14406w, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(List<FirestoreGoal> list, d dVar, ls.d<? super List<NotificationGoal>> dVar2, ls.d<? super c> dVar3) {
        super(2, dVar3);
        this.f14401w = list;
        this.f14402x = dVar;
        this.f14403y = dVar2;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        c cVar = new c(this.f14401w, this.f14402x, this.f14403y, dVar);
        cVar.f14400v = obj;
        return cVar;
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((c) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f14399u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            d0 d0Var = (d0) this.f14400v;
            List<FirestoreGoal> list = this.f14401w;
            ArrayList arrayList = new ArrayList(is.i.H1(list, 10));
            for (FirestoreGoal firestoreGoal : list) {
                arrayList.add(v.g(d0Var, null, new a(this.f14402x, firestoreGoal, null), 3));
            }
            this.f14399u = 1;
            obj = ca.a.n(arrayList, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        this.f14403y.resumeWith(u.e2((Iterable) obj));
        return k.f19476a;
    }
}
