package jl;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: CustomDashboardViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final String f22353a = LogHelper.INSTANCE.makeLogTag("ActivityFetchingViewModelRepository");

    /* compiled from: CustomDashboardViewModelRepository.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.CustomDashboardViewModelRepository", f = "CustomDashboardViewModelRepository.kt", l = {181}, m = "removeUserLibraryProgress")
    /* loaded from: classes2.dex */
    public static final class a extends ns.c {

        /* renamed from: u  reason: collision with root package name */
        public u f22354u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f22355v;

        /* renamed from: x  reason: collision with root package name */
        public int f22357x;

        public a(ls.d<? super a> dVar) {
            super(dVar);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            this.f22355v = obj;
            this.f22357x |= LinearLayoutManager.INVALID_OFFSET;
            return u.this.a(null, this);
        }
    }

    /* compiled from: CustomDashboardViewModelRepository.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.CustomDashboardViewModelRepository$removeUserLibraryProgress$2", f = "CustomDashboardViewModelRepository.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ String f22358u;

        /* compiled from: CustomDashboardViewModelRepository.kt */
        /* loaded from: classes2.dex */
        public static final class a implements ValueEventListener {
            @Override // com.google.firebase.database.ValueEventListener
            public final void onCancelled(DatabaseError error) {
                kotlin.jvm.internal.i.g(error, "error");
            }

            @Override // com.google.firebase.database.ValueEventListener
            public final void onDataChange(DataSnapshot snapshot) {
                DatabaseReference ref;
                kotlin.jvm.internal.i.g(snapshot, "snapshot");
                if (snapshot.exists() && snapshot.hasChildren()) {
                    Iterable<DataSnapshot> children = snapshot.getChildren();
                    kotlin.jvm.internal.i.f(children, "snapshot.children");
                    DataSnapshot dataSnapshot = (DataSnapshot) is.u.h2(children);
                    if (dataSnapshot != null && (ref = dataSnapshot.getRef()) != null) {
                        ref.removeValue();
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, ls.d<? super b> dVar) {
            super(2, dVar);
            this.f22358u = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new b(this.f22358u, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            String j02;
            sp.b.d0(obj);
            fd.f fVar = FirebaseAuth.getInstance().f;
            if (fVar != null && (j02 = fVar.j0()) != null) {
                DatabaseReference reference = FirebaseDatabase.getInstance().getReference("userLibraryProgress/".concat(j02));
                kotlin.jvm.internal.i.f(reference, "getInstance().getReferen…serLibraryProgress/$uid\")");
                reference.orderByChild("id").equalTo(this.f22358u).addListenerForSingleValueEvent(new a());
                return hs.k.f19476a;
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ls.d<? super hs.k> dVar) {
        a aVar;
        int i6;
        Exception e10;
        u uVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f22357x;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f22357x = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f22355v;
                ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
                i6 = aVar.f22357x;
                if (i6 == 0) {
                    if (i6 == 1) {
                        uVar = aVar.f22354u;
                        try {
                            sp.b.d0(obj);
                        } catch (Exception e11) {
                            e10 = e11;
                            LogHelper.INSTANCE.e(uVar.f22353a, e10);
                            return hs.k.f19476a;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    try {
                        kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
                        b bVar2 = new b(str, null);
                        aVar.f22354u = this;
                        aVar.f22357x = 1;
                        if (ta.v.S(bVar, bVar2, aVar) == aVar2) {
                            return aVar2;
                        }
                    } catch (Exception e12) {
                        e10 = e12;
                        uVar = this;
                        LogHelper.INSTANCE.e(uVar.f22353a, e10);
                        return hs.k.f19476a;
                    }
                }
                return hs.k.f19476a;
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f22355v;
        ms.a aVar22 = ms.a.COROUTINE_SUSPENDED;
        i6 = aVar.f22357x;
        if (i6 == 0) {
        }
        return hs.k.f19476a;
    }
}
