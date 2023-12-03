package fm;

import com.google.firebase.auth.FirebaseAuth;
/* compiled from: FirestoreGoalsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModel$deleteLastLogEntryIfExistsAndAddLog$1", f = "FirestoreGoalsViewModel.kt", l = {815, 817, 821}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
    public final /* synthetic */ String A;
    public final /* synthetic */ Object B;

    /* renamed from: u  reason: collision with root package name */
    public a f15311u;

    /* renamed from: v  reason: collision with root package name */
    public String f15312v;

    /* renamed from: w  reason: collision with root package name */
    public Object f15313w;

    /* renamed from: x  reason: collision with root package name */
    public String f15314x;

    /* renamed from: y  reason: collision with root package name */
    public int f15315y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ a f15316z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, String str, Object obj, ls.d<? super e> dVar) {
        super(2, dVar);
        this.f15316z = aVar;
        this.A = str;
        this.B = obj;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new e(this.f15316z, this.A, this.B, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((e) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
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
        Object d11;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f15315y;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        a aVar3 = this.f15311u;
                        sp.b.d0(obj);
                        aVar = aVar3;
                        d10 = obj;
                        aVar.f15174h0.i(Boolean.valueOf(((Boolean) d10).booleanValue()));
                        return hs.k.f19476a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a aVar4 = this.f15311u;
                sp.b.d0(obj);
                aVar = aVar4;
                d11 = obj;
                aVar.f15174h0.i(Boolean.valueOf(((Boolean) d11).booleanValue()));
                return hs.k.f19476a;
            }
            String str3 = this.f15314x;
            Object obj3 = this.f15313w;
            String str4 = this.f15312v;
            aVar = this.f15311u;
            sp.b.d0(obj);
            uid = str3;
            obj2 = obj3;
            str = str4;
            h10 = obj;
        } else {
            sp.b.d0(obj);
            fd.f fVar = FirebaseAuth.getInstance().f;
            if (fVar != null && (j02 = fVar.j0()) != null) {
                a aVar5 = this.f15316z;
                j0 j0Var = aVar5.f15183y;
                this.f15311u = aVar5;
                String str5 = this.A;
                this.f15312v = str5;
                obj2 = this.B;
                this.f15313w = obj2;
                this.f15314x = j02;
                this.f15315y = 1;
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
            j0 j0Var2 = aVar.f15183y;
            kotlin.jvm.internal.i.f(uid, "uid");
            this.f15311u = aVar;
            this.f15312v = null;
            this.f15313w = null;
            this.f15314x = null;
            this.f15315y = 2;
            d11 = j0Var2.d(str, obj2, uid, str2, this);
            if (d11 == aVar2) {
                return aVar2;
            }
            aVar.f15174h0.i(Boolean.valueOf(((Boolean) d11).booleanValue()));
            return hs.k.f19476a;
        }
        j0 j0Var3 = aVar.f15183y;
        kotlin.jvm.internal.i.f(uid, "uid");
        String o10 = defpackage.b.o(new Object[]{new Integer(0)}, 1, "%09d", "format(this, *args)");
        this.f15311u = aVar;
        this.f15312v = null;
        this.f15313w = null;
        this.f15314x = null;
        this.f15315y = 3;
        d10 = j0Var3.d(str, obj2, uid, o10, this);
        if (d10 == aVar2) {
            return aVar2;
        }
        aVar.f15174h0.i(Boolean.valueOf(((Boolean) d10).booleanValue()));
        return hs.k.f19476a;
    }
}
