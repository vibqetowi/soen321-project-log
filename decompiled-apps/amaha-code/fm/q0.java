package fm;

import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.utils.UtilsKt;
import fe.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: FirestoreGoalsViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class q0<TResult> implements ya.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j0 f15512a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ls.d<List<FirestoreGoal>> f15513b;

    /* compiled from: FirestoreGoalsViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ya.h<fe.r> f15514u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ ls.d<List<FirestoreGoal>> f15515v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ya.h<fe.r> hVar, ls.d<? super List<FirestoreGoal>> dVar) {
            super(0);
            this.f15514u = hVar;
            this.f15515v = dVar;
        }

        @Override // ss.a
        public final hs.k invoke() {
            ya.h<fe.r> hVar = this.f15514u;
            boolean isSuccessful = hVar.isSuccessful();
            ArrayList arrayList = null;
            ls.d<List<FirestoreGoal>> dVar = this.f15515v;
            if (isSuccessful) {
                fe.r result = hVar.getResult();
                if (result != null) {
                    arrayList = new ArrayList();
                    Iterator<fe.q> it = result.iterator();
                    while (true) {
                        r.a aVar = (r.a) it;
                        if (!aVar.hasNext()) {
                            break;
                        }
                        FirestoreGoal firestoreGoal = (FirestoreGoal) ((fe.q) aVar.next()).d(FirestoreGoal.class);
                        if (firestoreGoal != null) {
                            arrayList.add(firestoreGoal);
                        }
                    }
                }
                dVar.resumeWith(arrayList);
            } else {
                dVar.resumeWith(null);
            }
            return hs.k.f19476a;
        }
    }

    public q0(j0 j0Var, ls.h hVar) {
        this.f15512a = j0Var;
        this.f15513b = hVar;
    }

    @Override // ya.d
    public final void a(ya.h<fe.r> it) {
        kotlin.jvm.internal.i.g(it, "it");
        UtilsKt.logError$default(this.f15512a.f15374a, null, new a(it, this.f15513b), 2, null);
    }
}
