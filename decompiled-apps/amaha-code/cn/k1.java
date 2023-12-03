package cn;

import cn.e1;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: LibraryViewModelRepository.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.LibraryViewModelRepository$fetchOnce$1", f = "LibraryViewModelRepository.kt", l = {173, SubsamplingScaleImageView.ORIENTATION_180}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class k1 extends ns.i implements ss.p<kotlinx.coroutines.flow.e<? super List<? extends fe.g>>, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public ArrayList f5620u;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList f5621v;

    /* renamed from: w  reason: collision with root package name */
    public int f5622w;

    /* renamed from: x  reason: collision with root package name */
    public /* synthetic */ Object f5623x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ long f5624y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.firestore.d f5625z;

    /* compiled from: LibraryViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<fe.r, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ls.d<Collection<? extends fe.g>> f5626u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ls.h hVar) {
            super(1);
            this.f5626u = hVar;
        }

        @Override // ss.l
        public final hs.k invoke(fe.r rVar) {
            this.f5626u.resumeWith(rVar.e());
            return hs.k.f19476a;
        }
    }

    /* compiled from: LibraryViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<fe.r, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ls.d<Collection<? extends fe.g>> f5627u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ls.h hVar) {
            super(1);
            this.f5627u = hVar;
        }

        @Override // ss.l
        public final hs.k invoke(fe.r rVar) {
            this.f5627u.resumeWith(rVar.e());
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(long j10, com.google.firebase.firestore.d dVar, ls.d<? super k1> dVar2) {
        super(2, dVar2);
        this.f5624y = j10;
        this.f5625z = dVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        k1 k1Var = new k1(this.f5624y, this.f5625z, dVar);
        k1Var.f5623x = obj;
        return k1Var;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.flow.e<? super List<? extends fe.g>> eVar, ls.d<? super hs.k> dVar) {
        return ((k1) create(eVar, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.flow.e eVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f5622w;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    sp.b.d0(obj);
                    return hs.k.f19476a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = this.f5621v;
            arrayList2 = this.f5620u;
            eVar = (kotlinx.coroutines.flow.e) this.f5623x;
            sp.b.d0(obj);
        } else {
            sp.b.d0(obj);
            eVar = (kotlinx.coroutines.flow.e) this.f5623x;
            arrayList = new ArrayList();
            this.f5623x = eVar;
            this.f5620u = arrayList;
            com.google.firebase.firestore.d dVar = this.f5625z;
            this.f5621v = arrayList;
            this.f5622w = 1;
            ls.h hVar = new ls.h(ca.a.G0(this));
            long j10 = this.f5624y;
            if (j10 == -1) {
                dVar.a().addOnSuccessListener(new e1.i(new a(hVar)));
            } else {
                dVar.b(j10).a().addOnSuccessListener(new e1.i(new b(hVar)));
            }
            obj = hVar.b();
            if (obj == aVar) {
                return aVar;
            }
            arrayList2 = arrayList;
        }
        arrayList.addAll((Collection) obj);
        this.f5623x = null;
        this.f5620u = null;
        this.f5621v = null;
        this.f5622w = 2;
        if (eVar.b(arrayList2, this) == aVar) {
            return aVar;
        }
        return hs.k.f19476a;
    }
}
