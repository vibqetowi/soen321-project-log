package cn;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: FetchLibraryOnDbViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final String f5777a = LogHelper.INSTANCE.makeLogTag("FetchLibraryOnDbViewModelRepository");

    /* renamed from: b  reason: collision with root package name */
    public final FirebaseFirestore f5778b = FirebaseFirestore.d();

    /* compiled from: FetchLibraryOnDbViewModelRepository.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.FetchLibraryOnDbViewModelRepository", f = "FetchLibraryOnDbViewModelRepository.kt", l = {154}, m = "removeUserLibraryProgress")
    /* loaded from: classes2.dex */
    public static final class a extends ns.c {

        /* renamed from: u  reason: collision with root package name */
        public t f5779u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f5780v;

        /* renamed from: x  reason: collision with root package name */
        public int f5782x;

        public a(ls.d<? super a> dVar) {
            super(dVar);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            this.f5780v = obj;
            this.f5782x |= LinearLayoutManager.INVALID_OFFSET;
            return t.this.c(null, this);
        }
    }

    /* compiled from: FetchLibraryOnDbViewModelRepository.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.FetchLibraryOnDbViewModelRepository$removeUserLibraryProgress$2", f = "FetchLibraryOnDbViewModelRepository.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ String f5783u;

        /* compiled from: FetchLibraryOnDbViewModelRepository.kt */
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
            this.f5783u = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new b(this.f5783u, dVar);
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
                reference.orderByChild("id").equalTo(this.f5783u).addListenerForSingleValueEvent(new a());
                return hs.k.f19476a;
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FetchLibraryOnDbViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class c implements ya.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ss.l f5784a;

        public c(ss.l lVar) {
            this.f5784a = lVar;
        }

        @Override // ya.f
        public final /* synthetic */ void onSuccess(Object obj) {
            this.f5784a.invoke(obj);
        }
    }

    public static q a(t tVar, String str, String variant) {
        tVar.getClass();
        kotlin.jvm.internal.i.g(variant, "variant");
        return new q(new kotlinx.coroutines.flow.r(new s(-1L, tVar.f5778b.b("library_collection").m(str, "collectionType").m(Boolean.TRUE, "published").m("en", "language").l(variant, "config").n(1L, Constants.DAYMODEL_POSITION).c(Constants.DAYMODEL_POSITION), null)));
    }

    public final r b(String str) {
        com.google.firebase.firestore.d m10 = this.f5778b.b("content_posts_new").m(str, "programme");
        Boolean bool = Boolean.TRUE;
        return new r(new kotlinx.coroutines.flow.r(new s(6L, m10.m(bool, "published").m(bool, "status").m("en", "language").c("day"), null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ls.d<? super hs.k> dVar) {
        a aVar;
        int i6;
        Exception e10;
        t tVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f5782x;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f5782x = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f5780v;
                ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
                i6 = aVar.f5782x;
                if (i6 == 0) {
                    if (i6 == 1) {
                        tVar = aVar.f5779u;
                        try {
                            sp.b.d0(obj);
                        } catch (Exception e11) {
                            e10 = e11;
                            LogHelper.INSTANCE.e(tVar.f5777a, e10);
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
                        aVar.f5779u = this;
                        aVar.f5782x = 1;
                        if (ta.v.S(bVar, bVar2, aVar) == aVar2) {
                            return aVar2;
                        }
                    } catch (Exception e12) {
                        e10 = e12;
                        tVar = this;
                        LogHelper.INSTANCE.e(tVar.f5777a, e10);
                        return hs.k.f19476a;
                    }
                }
                return hs.k.f19476a;
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f5780v;
        ms.a aVar22 = ms.a.COROUTINE_SUSPENDED;
        i6 = aVar.f5782x;
        if (i6 == 0) {
        }
        return hs.k.f19476a;
    }
}
