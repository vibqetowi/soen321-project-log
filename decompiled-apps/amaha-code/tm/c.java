package tm;

import com.google.firebase.storage.StorageReference;
import hs.k;
import java.util.ArrayList;
import java.util.HashSet;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import ss.p;
import ta.v;
/* compiled from: JournalParentViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.journal.utils.JournalParentViewModel$deleteAllUploadedImagesOfCurrentTemplate$1", f = "JournalParentViewModel.kt", l = {321}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends ns.i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f33291u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ e f33292v;

    /* compiled from: JournalParentViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.journal.utils.JournalParentViewModel$deleteAllUploadedImagesOfCurrentTemplate$1$1", f = "JournalParentViewModel.kt", l = {322}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f33293u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f33294v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ e f33295w;

        /* compiled from: JournalParentViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.journal.utils.JournalParentViewModel$deleteAllUploadedImagesOfCurrentTemplate$1$1$1$1", f = "JournalParentViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: tm.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0551a extends ns.i implements p<d0, ls.d<? super ya.h<Void>>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ StorageReference f33296u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0551a(StorageReference storageReference, ls.d<? super C0551a> dVar) {
                super(2, dVar);
                this.f33296u = storageReference;
            }

            @Override // ns.a
            public final ls.d<k> create(Object obj, ls.d<?> dVar) {
                return new C0551a(this.f33296u, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super ya.h<Void>> dVar) {
                return ((C0551a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                sp.b.d0(obj);
                return this.f33296u.delete();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f33295w = eVar;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f33295w, dVar);
            aVar.f33294v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f33293u;
            e eVar = this.f33295w;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                d0 d0Var = (d0) this.f33294v;
                tm.a aVar2 = eVar.A;
                HashSet<StorageReference> hashSet = aVar2.f33283c[aVar2.f33281a];
                ArrayList arrayList = new ArrayList(is.i.H1(hashSet, 10));
                for (StorageReference storageReference : hashSet) {
                    arrayList.add(v.g(d0Var, null, new C0551a(storageReference, null), 3));
                }
                this.f33293u = 1;
                if (ca.a.n(arrayList, this) == aVar) {
                    return aVar;
                }
            }
            tm.a aVar3 = eVar.A;
            aVar3.f33283c[aVar3.f33281a].clear();
            return k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, ls.d<? super c> dVar) {
        super(2, dVar);
        this.f33292v = eVar;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new c(this.f33292v, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((c) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f33291u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
            a aVar2 = new a(this.f33292v, null);
            this.f33291u = 1;
            if (v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return k.f19476a;
    }
}
