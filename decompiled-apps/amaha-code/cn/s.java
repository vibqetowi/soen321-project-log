package cn;

import cn.t;
import com.appsflyer.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: FetchLibraryOnDbViewModelRepository.kt */
@ns.e(c = "com.theinnerhour.b2b.components.libraryExperiment.viewmodel.FetchLibraryOnDbViewModelRepository$fetchOnce$1", f = "FetchLibraryOnDbViewModelRepository.kt", l = {R.styleable.AppCompatTheme_selectableItemBackground, R.styleable.AppCompatTheme_textAppearanceListItemSecondary}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class s extends ns.i implements ss.p<kotlinx.coroutines.flow.e<? super List<? extends fe.g>>, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public ArrayList f5766u;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList f5767v;

    /* renamed from: w  reason: collision with root package name */
    public int f5768w;

    /* renamed from: x  reason: collision with root package name */
    public /* synthetic */ Object f5769x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ long f5770y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.firestore.d f5771z;

    /* compiled from: FetchLibraryOnDbViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<fe.r, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ls.d<Collection<? extends fe.g>> f5772u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ls.h hVar) {
            super(1);
            this.f5772u = hVar;
        }

        @Override // ss.l
        public final hs.k invoke(fe.r rVar) {
            this.f5772u.resumeWith(rVar.e());
            return hs.k.f19476a;
        }
    }

    /* compiled from: FetchLibraryOnDbViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<fe.r, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ls.d<Collection<? extends fe.g>> f5773u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ls.h hVar) {
            super(1);
            this.f5773u = hVar;
        }

        @Override // ss.l
        public final hs.k invoke(fe.r rVar) {
            this.f5773u.resumeWith(rVar.e());
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(long j10, com.google.firebase.firestore.d dVar, ls.d<? super s> dVar2) {
        super(2, dVar2);
        this.f5770y = j10;
        this.f5771z = dVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        s sVar = new s(this.f5770y, this.f5771z, dVar);
        sVar.f5769x = obj;
        return sVar;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.flow.e<? super List<? extends fe.g>> eVar, ls.d<? super hs.k> dVar) {
        return ((s) create(eVar, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.flow.e eVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f5768w;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    sp.b.d0(obj);
                    return hs.k.f19476a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = this.f5767v;
            arrayList2 = this.f5766u;
            eVar = (kotlinx.coroutines.flow.e) this.f5769x;
            sp.b.d0(obj);
        } else {
            sp.b.d0(obj);
            eVar = (kotlinx.coroutines.flow.e) this.f5769x;
            arrayList = new ArrayList();
            this.f5769x = eVar;
            this.f5766u = arrayList;
            com.google.firebase.firestore.d dVar = this.f5771z;
            this.f5767v = arrayList;
            this.f5768w = 1;
            ls.h hVar = new ls.h(ca.a.G0(this));
            long j10 = this.f5770y;
            if (j10 == -1) {
                dVar.a().addOnSuccessListener(new t.c(new a(hVar)));
            } else {
                dVar.b(j10).a().addOnSuccessListener(new t.c(new b(hVar)));
            }
            obj = hVar.b();
            if (obj == aVar) {
                return aVar;
            }
            arrayList2 = arrayList;
        }
        arrayList.addAll((Collection) obj);
        this.f5769x = null;
        this.f5766u = null;
        this.f5767v = null;
        this.f5768w = 2;
        if (eVar.b(arrayList2, this) == aVar) {
            return aVar;
        }
        return hs.k.f19476a;
    }
}
