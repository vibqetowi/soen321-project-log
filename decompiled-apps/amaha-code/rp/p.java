package rp;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
/* compiled from: ProviderDashboardViewModelRepository.kt */
@ns.e(c = "com.theinnerhour.b2b.components.telecommunications.viewmodel.ProviderDashboardViewModelRepository$setUnreadListener$1", f = "ProviderDashboardViewModelRepository.kt", l = {286}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class p extends ns.i implements ss.p<iv.q<? super Boolean>, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f30889u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f30890v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f30891w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f30892x;

    /* compiled from: ProviderDashboardViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ DatabaseReference f30893u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ b f30894v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DatabaseReference databaseReference, b bVar) {
            super(0);
            this.f30893u = databaseReference;
            this.f30894v = bVar;
        }

        @Override // ss.a
        public final hs.k invoke() {
            this.f30893u.removeEventListener(this.f30894v);
            return hs.k.f19476a;
        }
    }

    /* compiled from: ProviderDashboardViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class b implements ValueEventListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ iv.q<Boolean> f30895u;

        /* JADX WARN: Multi-variable type inference failed */
        public b(iv.q<? super Boolean> qVar) {
            this.f30895u = qVar;
        }

        @Override // com.google.firebase.database.ValueEventListener
        public final void onCancelled(DatabaseError error) {
            kotlin.jvm.internal.i.g(error, "error");
            sp.b.j0(this.f30895u, Boolean.FALSE);
        }

        @Override // com.google.firebase.database.ValueEventListener
        public final void onDataChange(DataSnapshot snapshot) {
            kotlin.jvm.internal.i.g(snapshot, "snapshot");
            boolean exists = snapshot.exists();
            iv.q<Boolean> qVar = this.f30895u;
            if (exists && snapshot.hasChildren()) {
                sp.b.j0(qVar, Boolean.TRUE);
            } else {
                sp.b.j0(qVar, Boolean.FALSE);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, String str2, ls.d<? super p> dVar) {
        super(2, dVar);
        this.f30891w = str;
        this.f30892x = str2;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        p pVar = new p(this.f30891w, this.f30892x, dVar);
        pVar.f30890v = obj;
        return pVar;
    }

    @Override // ss.p
    public final Object invoke(iv.q<? super Boolean> qVar, ls.d<? super hs.k> dVar) {
        return ((p) create(qVar, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f30889u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            iv.q qVar = (iv.q) this.f30890v;
            FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
            DatabaseReference reference = firebaseDatabase.getReference("user_friend_map/" + this.f30891w + '/' + this.f30892x + "/unread_messages");
            kotlin.jvm.internal.i.f(reference, "getInstance().getReferen…ndKey}/unread_messages\" )");
            b bVar = new b(qVar);
            reference.addValueEventListener(bVar);
            a aVar2 = new a(reference, bVar);
            this.f30889u = 1;
            if (iv.n.a(qVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
