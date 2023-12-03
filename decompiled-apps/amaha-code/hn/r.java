package hn;
/* compiled from: LoginSignupReworkViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkViewModel$checkConnect$2", f = "LoginSignupReworkViewModel.kt", l = {1451, 1456, 1458}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class r extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Boolean>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f17932u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f17933v;

    /* renamed from: w  reason: collision with root package name */
    public int f17934w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ q f17935x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q qVar, ls.d<? super r> dVar) {
        super(2, dVar);
        this.f17935x = qVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new r(this.f17935x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Boolean> dVar) {
        return ((r) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0076 -> B:28:0x0079). Please submit an issue!!! */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        r rVar;
        int i6;
        kotlinx.coroutines.flow.b bVar;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i10 = this.f17934w;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        i6 = this.f17932u;
                        boolean z11 = this.f17933v;
                        sp.b.d0(obj);
                        z10 = z11;
                        rVar = this;
                        i6++;
                        if (i6 < 4) {
                            kotlinx.coroutines.flow.b bVar2 = rVar.f17935x.C.f17790b;
                            rVar.f17932u = i6;
                            rVar.f17934w = 1;
                            obj = ta.v.M(bVar2, rVar);
                            if (obj == aVar) {
                                return aVar;
                            }
                            z10 = ((Boolean) obj).booleanValue();
                            if (!z10) {
                                if (i6 > 0) {
                                    rVar.f17933v = z10;
                                    rVar.f17932u = i6;
                                    rVar.f17934w = 2;
                                    if (ca.a.P(1000L, rVar) == aVar) {
                                        return aVar;
                                    }
                                }
                                bVar = rVar.f17935x.C.f17791c;
                                rVar.f17933v = z10;
                                rVar.f17932u = i6;
                                rVar.f17934w = 3;
                                if (ta.v.M(bVar, rVar) == aVar) {
                                    return aVar;
                                }
                                i6++;
                                if (i6 < 4) {
                                }
                            }
                        }
                        return Boolean.valueOf(z10);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i6 = this.f17932u;
                boolean z12 = this.f17933v;
                sp.b.d0(obj);
                z10 = z12;
                rVar = this;
                bVar = rVar.f17935x.C.f17791c;
                rVar.f17933v = z10;
                rVar.f17932u = i6;
                rVar.f17934w = 3;
                if (ta.v.M(bVar, rVar) == aVar) {
                }
                i6++;
                if (i6 < 4) {
                }
                return Boolean.valueOf(z10);
            }
            i6 = this.f17932u;
            sp.b.d0(obj);
            rVar = this;
            z10 = ((Boolean) obj).booleanValue();
            if (!z10) {
            }
            return Boolean.valueOf(z10);
        }
        sp.b.d0(obj);
        z10 = false;
        rVar = this;
        i6 = 0;
        if (i6 < 4) {
        }
        return Boolean.valueOf(z10);
    }
}
