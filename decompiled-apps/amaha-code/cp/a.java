package cp;

import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.utils.LogHelper;
import fe.q;
import fe.r;
import fe.y;
import hs.k;
import is.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import le.l;
import ls.h;
import ns.i;
import ss.p;
import ta.v;
/* compiled from: ResetProgrammeRepository.kt */
/* loaded from: classes2.dex */
public final class a<TResult> implements ya.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f11854a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f11855b;

    /* compiled from: ResetProgrammeRepository.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.resetprogram.viewmodel.ResetProgrammeRepository$checkAndSetFirestoreGoalsInvisibleForCourse$2$1$1", f = "ResetProgrammeRepository.kt", l = {86}, m = "invokeSuspend")
    /* renamed from: cp.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0171a extends i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f11856u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f11857v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ List<y> f11858w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f11859x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ c f11860y;

        /* compiled from: ResetProgrammeRepository.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.resetprogram.viewmodel.ResetProgrammeRepository$checkAndSetFirestoreGoalsInvisibleForCourse$2$1$1$batchSuccess$1$1", f = "ResetProgrammeRepository.kt", l = {86}, m = "invokeSuspend")
        /* renamed from: cp.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0172a extends i implements p<d0, ls.d<? super Boolean>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f11861u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ c f11862v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ y f11863w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0172a(c cVar, y yVar, ls.d<? super C0172a> dVar) {
                super(2, dVar);
                this.f11862v = cVar;
                this.f11863w = yVar;
            }

            @Override // ns.a
            public final ls.d<k> create(Object obj, ls.d<?> dVar) {
                return new C0172a(this.f11862v, this.f11863w, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super Boolean> dVar) {
                return ((C0172a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f11861u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    y yVar = this.f11863w;
                    this.f11861u = 1;
                    c cVar = this.f11862v;
                    cVar.getClass();
                    h hVar = new h(ca.a.G0(this));
                    try {
                        yVar.a().addOnCompleteListener(new b(hVar));
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(cVar.f11865a, e10);
                    }
                    obj = hVar.b();
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0171a(List<? extends y> list, ls.d<? super Boolean> dVar, c cVar, ls.d<? super C0171a> dVar2) {
            super(2, dVar2);
            this.f11858w = list;
            this.f11859x = dVar;
            this.f11860y = cVar;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            C0171a c0171a = new C0171a(this.f11858w, this.f11859x, this.f11860y, dVar);
            c0171a.f11857v = obj;
            return c0171a;
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((C0171a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f11856u;
            boolean z10 = true;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                d0 d0Var = (d0) this.f11857v;
                List<y> list = this.f11858w;
                ArrayList arrayList = new ArrayList(is.i.H1(list, 10));
                for (y yVar : list) {
                    arrayList.add(v.g(d0Var, null, new C0172a(this.f11860y, yVar, null), 3));
                }
                this.f11856u = 1;
                obj = ca.a.n(arrayList, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            Iterable iterable = (Iterable) obj;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((Boolean) it.next()).booleanValue()) {
                            z10 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            this.f11859x.resumeWith(Boolean.valueOf(z10));
            return k.f19476a;
        }
    }

    public a(h hVar, c cVar) {
        this.f11854a = hVar;
        this.f11855b = cVar;
    }

    @Override // ya.d
    public final void a(ya.h<r> task) {
        kotlin.jvm.internal.i.g(task, "task");
        boolean isSuccessful = task.isSuccessful();
        ls.d<Boolean> dVar = this.f11854a;
        if (isSuccessful) {
            if (task.getResult().f15006v.f17520b.f23278u.isEmpty()) {
                dVar.resumeWith(Boolean.TRUE);
                return;
            }
            r result = task.getResult();
            kotlin.jvm.internal.i.f(result, "task.result");
            ArrayList<List> Y1 = u.Y1(result, 499);
            ArrayList arrayList = new ArrayList(is.i.H1(Y1, 10));
            for (List<q> list : Y1) {
                y a10 = FirebaseFirestore.d().a();
                for (q qVar : list) {
                    ke.i iVar = qVar.f14989b;
                    iVar.getClass();
                    FirebaseFirestore firebaseFirestore = a10.f15020a;
                    firebaseFirestore.getClass();
                    if (qVar.f14988a == firebaseFirestore) {
                        if (!a10.f15022c) {
                            a10.f15021b.add(new le.c(iVar, l.f24227c));
                        } else {
                            throw new IllegalStateException("A write batch can no longer be used after commit() has been called.");
                        }
                    } else {
                        throw new IllegalArgumentException("Provided document reference is from a different Cloud Firestore instance.");
                    }
                }
                arrayList.add(a10);
            }
            v.H(kotlin.jvm.internal.h.c(o0.f23642c), null, 0, new C0171a(arrayList, dVar, this.f11855b, null), 3);
            return;
        }
        dVar.resumeWith(Boolean.FALSE);
    }
}
