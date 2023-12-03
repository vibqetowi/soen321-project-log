package hn;

import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.login.model.LoginLoading;
import com.theinnerhour.b2b.components.login.model.LoginSignupFlow;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import gd.k0;
/* compiled from: LoginSignupReworkViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkViewModel$loginWithToken$1", f = "LoginSignupReworkViewModel.kt", l = {654, 659, 660, 661, 672, 673, 677, 684, 686}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class y extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
    public final /* synthetic */ String A;
    public final /* synthetic */ LoginSignupFlow B;
    public final /* synthetic */ String C;

    /* renamed from: u  reason: collision with root package name */
    public Object f17953u;

    /* renamed from: v  reason: collision with root package name */
    public q f17954v;

    /* renamed from: w  reason: collision with root package name */
    public String f17955w;

    /* renamed from: x  reason: collision with root package name */
    public int f17956x;

    /* renamed from: y  reason: collision with root package name */
    public /* synthetic */ Object f17957y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ q f17958z;

    /* compiled from: LoginSignupReworkViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17959a;

        static {
            int[] iArr = new int[LoginSignupFlow.values().length];
            try {
                iArr[LoginSignupFlow.SIGN_UP_GOOGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoginSignupFlow.SIGN_UP_FACEBOOK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoginSignupFlow.SIGN_IN_GOOGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LoginSignupFlow.SIGN_IN_FACEBOOK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LoginSignupFlow.SSO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LoginSignupFlow.SIGN_UP_EMAIL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LoginSignupFlow.SIGN_UP_PHONE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[LoginSignupFlow.SIGN_IN_PHONE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f17959a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(q qVar, String str, LoginSignupFlow loginSignupFlow, String str2, ls.d<? super y> dVar) {
        super(2, dVar);
        this.f17958z = qVar;
        this.A = str;
        this.B = loginSignupFlow;
        this.C = str2;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        y yVar = new y(this.f17958z, this.A, this.B, this.C, dVar);
        yVar.f17957y = obj;
        return yVar;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((y) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018d  */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.d0 d0Var;
        fd.c cVar;
        String str;
        boolean z10;
        LoginSignupFlow loginSignupFlow;
        q qVar;
        kotlinx.coroutines.d0 d0Var2;
        q qVar2;
        kotlinx.coroutines.d0 d0Var3;
        q qVar3;
        LoginSignupFlow loginSignupFlow2;
        q qVar4;
        LoginSignupFlow loginSignupFlow3;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f17956x;
        String str2 = this.A;
        q qVar5 = this.f17958z;
        hs.k kVar = null;
        switch (i6) {
            case 0:
                sp.b.d0(obj);
                kotlinx.coroutines.d0 d0Var4 = (kotlinx.coroutines.d0) this.f17957y;
                b bVar = qVar5.C;
                this.f17957y = d0Var4;
                this.f17956x = 1;
                Object b10 = bVar.b(str2, this);
                if (b10 == aVar) {
                    return aVar;
                }
                d0Var = d0Var4;
                obj = b10;
                cVar = (fd.c) obj;
                if (cVar != null) {
                    k0 user = cVar.getUser();
                    if (user != null) {
                        str = user.f16426v.f16419y;
                    } else {
                        str = null;
                    }
                    if (str != null && !gv.n.B0(str)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    loginSignupFlow = this.B;
                    if (z10) {
                        int i10 = a.f17959a[loginSignupFlow.ordinal()];
                        String str3 = this.C;
                        switch (i10) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                b bVar2 = qVar5.C;
                                this.f17957y = d0Var;
                                this.f17953u = loginSignupFlow;
                                this.f17954v = qVar5;
                                this.f17955w = str2;
                                this.f17956x = 2;
                                if (bVar2.e(str3, user, this) == aVar) {
                                    return aVar;
                                }
                                d0Var2 = d0Var;
                                qVar2 = qVar5;
                                b bVar3 = qVar2.C;
                                this.f17957y = d0Var2;
                                this.f17953u = loginSignupFlow;
                                this.f17954v = qVar2;
                                this.f17955w = null;
                                this.f17956x = 3;
                                obj = bVar3.b(str2, this);
                                if (obj != aVar) {
                                    return aVar;
                                }
                                loginSignupFlow2 = loginSignupFlow;
                                if (((fd.c) obj) != null) {
                                    this.f17957y = d0Var2;
                                    this.f17953u = loginSignupFlow2;
                                    this.f17954v = qVar2;
                                    this.f17956x = 4;
                                    if (q.f(qVar2, this) == aVar) {
                                        return aVar;
                                    }
                                    qVar4 = qVar2;
                                    loginSignupFlow3 = loginSignupFlow2;
                                    if (is.k.Q1(loginSignupFlow3, new LoginSignupFlow[]{LoginSignupFlow.SIGN_UP_GOOGLE, LoginSignupFlow.SIGN_UP_FACEBOOK})) {
                                        qVar4.D = null;
                                    }
                                    kVar = hs.k.f19476a;
                                    qVar2 = qVar4;
                                }
                                if (kVar == null) {
                                    qVar2.H.i(qVar2.f2382x.getApplicationContext().getString(R.string.loginSomethingWentWrong));
                                    qVar2.F.i(LoginLoading.HIDE_LOADING);
                                    ApplicationPersistence.getInstance().clearData();
                                    break;
                                }
                                break;
                            case 6:
                                b bVar4 = qVar5.C;
                                this.f17957y = d0Var;
                                this.f17953u = qVar5;
                                this.f17956x = 5;
                                if (bVar4.e(str3, user, this) == aVar) {
                                    return aVar;
                                }
                                d0Var3 = d0Var;
                                qVar3 = qVar5;
                                this.f17957y = d0Var3;
                                this.f17953u = null;
                                this.f17956x = 6;
                                if (q.f(qVar3, this) == aVar) {
                                    return aVar;
                                }
                                break;
                            case 7:
                            case 8:
                                this.f17957y = d0Var;
                                this.f17956x = 7;
                                if (q.f(qVar5, this) == aVar) {
                                    return aVar;
                                }
                                break;
                        }
                    } else {
                        switch (a.f17959a[loginSignupFlow.ordinal()]) {
                            case 1:
                            case 2:
                                this.f17957y = d0Var;
                                this.f17953u = qVar5;
                                this.f17956x = 9;
                                if (q.f(qVar5, this) == aVar) {
                                    return aVar;
                                }
                                qVar = qVar5;
                                qVar.D = null;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                this.f17957y = d0Var;
                                this.f17956x = 8;
                                if (q.f(qVar5, this) == aVar) {
                                    return aVar;
                                }
                                break;
                        }
                    }
                    kVar = hs.k.f19476a;
                }
                if (kVar == null) {
                    qVar5.F.i(LoginLoading.HIDE_LOADING);
                    qVar5.H.i(qVar5.f2382x.getApplicationContext().getString(R.string.loginSomethingWentWrong));
                }
                return hs.k.f19476a;
            case 1:
                d0Var = (kotlinx.coroutines.d0) this.f17957y;
                sp.b.d0(obj);
                cVar = (fd.c) obj;
                if (cVar != null) {
                }
                if (kVar == null) {
                }
                return hs.k.f19476a;
            case 2:
                str2 = this.f17955w;
                qVar2 = this.f17954v;
                kotlinx.coroutines.d0 d0Var5 = (kotlinx.coroutines.d0) this.f17957y;
                sp.b.d0(obj);
                loginSignupFlow = (LoginSignupFlow) this.f17953u;
                d0Var2 = d0Var5;
                b bVar32 = qVar2.C;
                this.f17957y = d0Var2;
                this.f17953u = loginSignupFlow;
                this.f17954v = qVar2;
                this.f17955w = null;
                this.f17956x = 3;
                obj = bVar32.b(str2, this);
                if (obj != aVar) {
                }
                break;
            case 3:
                qVar2 = this.f17954v;
                loginSignupFlow2 = (LoginSignupFlow) this.f17953u;
                d0Var2 = (kotlinx.coroutines.d0) this.f17957y;
                sp.b.d0(obj);
                if (((fd.c) obj) != null) {
                }
                if (kVar == null) {
                }
                kVar = hs.k.f19476a;
                if (kVar == null) {
                }
                return hs.k.f19476a;
            case 4:
                qVar4 = this.f17954v;
                loginSignupFlow3 = (LoginSignupFlow) this.f17953u;
                kotlinx.coroutines.d0 d0Var6 = (kotlinx.coroutines.d0) this.f17957y;
                sp.b.d0(obj);
                if (is.k.Q1(loginSignupFlow3, new LoginSignupFlow[]{LoginSignupFlow.SIGN_UP_GOOGLE, LoginSignupFlow.SIGN_UP_FACEBOOK})) {
                }
                kVar = hs.k.f19476a;
                qVar2 = qVar4;
                if (kVar == null) {
                }
                kVar = hs.k.f19476a;
                if (kVar == null) {
                }
                return hs.k.f19476a;
            case 5:
                qVar3 = (q) this.f17953u;
                d0Var3 = (kotlinx.coroutines.d0) this.f17957y;
                sp.b.d0(obj);
                this.f17957y = d0Var3;
                this.f17953u = null;
                this.f17956x = 6;
                if (q.f(qVar3, this) == aVar) {
                }
                kVar = hs.k.f19476a;
                if (kVar == null) {
                }
                return hs.k.f19476a;
            case 6:
            case 7:
            case 8:
                kotlinx.coroutines.d0 d0Var7 = (kotlinx.coroutines.d0) this.f17957y;
                sp.b.d0(obj);
                kVar = hs.k.f19476a;
                if (kVar == null) {
                }
                return hs.k.f19476a;
            case 9:
                qVar = (q) this.f17953u;
                kotlinx.coroutines.d0 d0Var8 = (kotlinx.coroutines.d0) this.f17957y;
                sp.b.d0(obj);
                qVar.D = null;
                kVar = hs.k.f19476a;
                if (kVar == null) {
                }
                return hs.k.f19476a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
