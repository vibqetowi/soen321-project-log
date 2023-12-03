package cn;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.b;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollection;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollectionItem;
import com.theinnerhour.b2b.utils.LogHelper;
import he.k;
import java.util.ArrayList;
/* compiled from: LibraryViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModel$fetchIndividualCollection$1", f = "LibraryViewModel.kt", l = {181}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class q0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f5721u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ k0 f5722v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f5723w;

    /* compiled from: LibraryViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModel$fetchIndividualCollection$1$1", f = "LibraryViewModel.kt", l = {183}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f5724u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f5725v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ k0 f5726w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f5727x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k0 k0Var, String str, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f5726w = k0Var;
            this.f5727x = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f5726w, this.f5727x, dVar);
            aVar.f5725v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            hs.k kVar;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f5724u;
            k0 k0Var = this.f5726w;
            if (i6 != 0) {
                if (i6 == 1) {
                    kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f5725v;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                k0Var.p().i(Boolean.TRUE);
                String str = this.f5727x;
                this.f5725v = (kotlinx.coroutines.d0) this.f5725v;
                this.f5724u = 1;
                e1 e1Var = k0Var.f5597z;
                e1Var.getClass();
                ls.h hVar = new ls.h(ca.a.G0(this));
                try {
                    ya.v a10 = FirebaseFirestore.d().b("library_collection").k(new b.a(fe.j.f14995c, k.a.EQUAL, str)).a();
                    a10.addOnCompleteListener(new f1(hVar));
                    a10.addOnFailureListener(new g1(e1Var, hVar));
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(e1Var.f5468b, e10);
                }
                obj = hVar.b();
                if (obj == aVar) {
                    return aVar;
                }
            }
            LibraryCollection libraryCollection = (LibraryCollection) obj;
            if (libraryCollection != null) {
                k0Var.Q = libraryCollection;
                ArrayList<LibraryCollectionItem> itemList = libraryCollection.getItemList();
                ArrayList arrayList = new ArrayList(is.i.H1(itemList, 10));
                for (LibraryCollectionItem libraryCollectionItem : itemList) {
                    arrayList.add(libraryCollectionItem.getId());
                }
                k0Var.k(arrayList, true, true);
                kVar = hs.k.f19476a;
            } else {
                kVar = null;
            }
            if (kVar == null) {
                k0Var.Q = null;
                k0Var.p().i(Boolean.FALSE);
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(k0 k0Var, String str, ls.d<? super q0> dVar) {
        super(2, dVar);
        this.f5722v = k0Var;
        this.f5723w = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new q0(this.f5722v, this.f5723w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((q0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f5721u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f5722v, this.f5723w, null);
            this.f5721u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
