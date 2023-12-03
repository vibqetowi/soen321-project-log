package fm;

import com.google.firebase.auth.FirebaseAuth;
/* compiled from: FirestoreGoalsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$addLog$1", f = "FirestoreGoalsViewModel.kt", l = {876, 885, 889}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
    public final /* synthetic */ String A;
    public final /* synthetic */ Object B;

    /* renamed from: u  reason: collision with root package name */
    public a f15284u;

    /* renamed from: v  reason: collision with root package name */
    public String f15285v;

    /* renamed from: w  reason: collision with root package name */
    public Object f15286w;

    /* renamed from: x  reason: collision with root package name */
    public String f15287x;

    /* renamed from: y  reason: collision with root package name */
    public int f15288y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ a f15289z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, String str, Object obj, ls.d<? super b> dVar) {
        super(2, dVar);
        this.f15289z = aVar;
        this.A = str;
        this.B = obj;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new b(this.f15289z, this.A, this.B, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        String j02;
        Object obj2;
        Object h10;
        String uid;
        a aVar;
        String str;
        String str2;
        Object d10;
        String o10;
        Object d11;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f15288y;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        a aVar3 = this.f15284u;
                        sp.b.d0(obj);
                        aVar = aVar3;
                        d10 = obj;
                        ((Boolean) d10).booleanValue();
                        aVar.f15177k0.i(Boolean.TRUE);
                        return hs.k.f19476a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a aVar4 = this.f15284u;
                sp.b.d0(obj);
                aVar = aVar4;
                d11 = obj;
                ((Boolean) d11).booleanValue();
                aVar.f15177k0.i(Boolean.TRUE);
                return hs.k.f19476a;
            }
            String str3 = this.f15287x;
            Object obj3 = this.f15286w;
            String str4 = this.f15285v;
            aVar = this.f15284u;
            sp.b.d0(obj);
            uid = str3;
            obj2 = obj3;
            str = str4;
            h10 = obj;
        } else {
            sp.b.d0(obj);
            fd.f fVar = FirebaseAuth.getInstance().f;
            if (fVar != null && (j02 = fVar.j0()) != null) {
                a aVar5 = this.f15289z;
                j0 j0Var = aVar5.f15183y;
                this.f15284u = aVar5;
                String str5 = this.A;
                this.f15285v = str5;
                obj2 = this.B;
                this.f15286w = obj2;
                this.f15287x = j02;
                this.f15288y = 1;
                j0Var.getClass();
                h10 = j0.h(j02, str5, this, false);
                if (h10 == aVar2) {
                    return aVar2;
                }
                uid = j02;
                aVar = aVar5;
                str = str5;
            }
            return hs.k.f19476a;
        }
        fe.q qVar = (fe.q) h10;
        if (qVar != null) {
            str2 = qVar.b();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            Integer w02 = gv.m.w0(str2);
            if (w02 != null) {
                o10 = defpackage.b.o(new Object[]{new Integer(w02.intValue() + 1)}, 1, "%09d", "format(this, *args)");
            } else {
                o10 = defpackage.b.o(new Object[]{new Integer(0)}, 1, "%09d", "format(this, *args)");
            }
            String str6 = o10;
            j0 j0Var2 = aVar.f15183y;
            kotlin.jvm.internal.i.f(uid, "uid");
            this.f15284u = aVar;
            this.f15285v = null;
            this.f15286w = null;
            this.f15287x = null;
            this.f15288y = 2;
            d11 = j0Var2.d(str, obj2, uid, str6, this);
            if (d11 == aVar2) {
                return aVar2;
            }
            ((Boolean) d11).booleanValue();
            aVar.f15177k0.i(Boolean.TRUE);
            return hs.k.f19476a;
        }
        j0 j0Var3 = aVar.f15183y;
        kotlin.jvm.internal.i.f(uid, "uid");
        String o11 = defpackage.b.o(new Object[]{new Integer(0)}, 1, "%09d", "format(this, *args)");
        this.f15284u = aVar;
        this.f15285v = null;
        this.f15286w = null;
        this.f15287x = null;
        this.f15288y = 3;
        d10 = j0Var3.d(str, obj2, uid, o11, this);
        if (d10 == aVar2) {
            return aVar2;
        }
        ((Boolean) d10).booleanValue();
        aVar.f15177k0.i(Boolean.TRUE);
        return hs.k.f19476a;
    }
}
