package hn;

import com.bugsnag.android.Bugsnag;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.components.login.model.InitFirebaseResponses;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Utils;
import kotlinx.coroutines.o0;
/* compiled from: LoginSignupReworkViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkViewModel$signInFirebaseWithToken$2$1", f = "LoginSignupReworkViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f17825u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f17826v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ q f17827w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f17828x;

    /* compiled from: LoginSignupReworkViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a<TResult> implements ya.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f17829a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ q f17830b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f17831c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f17832d;

        /* compiled from: LoginSignupReworkViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkViewModel$signInFirebaseWithToken$2$1$1$1", f = "LoginSignupReworkViewModel.kt", l = {1012}, m = "invokeSuspend")
        /* renamed from: hn.c0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0286a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f17833u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ q f17834v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ls.d<Boolean> f17835w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0286a(q qVar, ls.d<? super Boolean> dVar, ls.d<? super C0286a> dVar2) {
                super(2, dVar2);
                this.f17834v = qVar;
                this.f17835w = dVar;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new C0286a(this.f17834v, this.f17835w, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((C0286a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f17833u;
                boolean z10 = true;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    kotlinx.coroutines.flow.b bVar = this.f17834v.C.f17792d;
                    this.f17833u = 1;
                    obj = ta.v.M(bVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                if (((InitFirebaseResponses) obj) != InitFirebaseResponses.INITIALISE_COMPLETE) {
                    z10 = false;
                }
                this.f17835w.resumeWith(Boolean.valueOf(z10));
                return hs.k.f19476a;
            }
        }

        /* compiled from: LoginSignupReworkViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkViewModel$signInFirebaseWithToken$2$1$1$2", f = "LoginSignupReworkViewModel.kt", l = {1017}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
            public final /* synthetic */ fd.f A;

            /* renamed from: u  reason: collision with root package name */
            public ls.d f17836u;

            /* renamed from: v  reason: collision with root package name */
            public int f17837v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ls.d<Boolean> f17838w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ q f17839x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ String f17840y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ String f17841z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(ls.d<? super Boolean> dVar, q qVar, String str, String str2, fd.f fVar, ls.d<? super b> dVar2) {
                super(2, dVar2);
                this.f17838w = dVar;
                this.f17839x = qVar;
                this.f17840y = str;
                this.f17841z = str2;
                this.A = fVar;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new b(this.f17838w, this.f17839x, this.f17840y, this.f17841z, this.A, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ls.d<Boolean> dVar;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f17837v;
                if (i6 != 0) {
                    if (i6 == 1) {
                        dVar = this.f17836u;
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    ls.d<Boolean> dVar2 = this.f17838w;
                    this.f17836u = dVar2;
                    this.f17837v = 1;
                    q qVar = this.f17839x;
                    qVar.getClass();
                    ls.h hVar = new ls.h(ca.a.G0(this));
                    this.A.l0(this.f17841z).addOnCompleteListener(new f0(qVar, this.f17840y, hVar));
                    Object b10 = hVar.b();
                    if (b10 == aVar) {
                        return aVar;
                    }
                    dVar = dVar2;
                    obj = b10;
                }
                dVar.resumeWith(obj);
                return hs.k.f19476a;
            }
        }

        public a(q qVar, String str, String str2, ls.d dVar) {
            this.f17829a = dVar;
            this.f17830b = qVar;
            this.f17831c = str;
            this.f17832d = str2;
        }

        @Override // ya.d
        public final void a(ya.h<fd.c> task) {
            kotlin.jvm.internal.i.g(task, "task");
            boolean isSuccessful = task.isSuccessful();
            ls.d<Boolean> dVar = this.f17829a;
            if (!isSuccessful) {
                Utils.INSTANCE.clearPersistence();
                dVar.resumeWith(Boolean.FALSE);
                return;
            }
            fd.f fVar = FirebaseAuth.getInstance().f;
            if (fVar != null) {
                MyApplication.a aVar = MyApplication.V;
                lg.f d10 = aVar.a().d();
                d10.i(fVar.j0());
                d10.f.c(fVar.j0());
                o3.a aVar2 = (o3.a) aVar.a().J.getValue();
                String j02 = fVar.j0();
                aVar2.getClass();
                ta.v.H(aVar2.f33768c, aVar2.f33769d, 0, new u3.d(aVar2, j02, null), 2);
                Bugsnag.setUser(fVar.j0(), "null", "null");
                FirebasePersistence.getInstance().updateMoEngageUserProperties();
                String f02 = fVar.f0();
                q qVar = this.f17830b;
                if (f02 != null) {
                    ta.v.H(kc.f.H(qVar), o0.f23642c, 0, new C0286a(qVar, dVar, null), 2);
                    return;
                } else {
                    ta.v.H(kc.f.H(qVar), o0.f23642c, 0, new b(this.f17829a, this.f17830b, this.f17831c, this.f17832d, fVar, null), 2);
                    return;
                }
            }
            dVar.resumeWith(Boolean.FALSE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c0(String str, ls.d<? super Boolean> dVar, q qVar, String str2, ls.d<? super c0> dVar2) {
        super(2, dVar2);
        this.f17825u = str;
        this.f17826v = dVar;
        this.f17827w = qVar;
        this.f17828x = str2;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new c0(this.f17825u, this.f17826v, this.f17827w, this.f17828x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((c0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        sp.b.d0(obj);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        String str = this.f17825u;
        firebaseAuth.e(str).addOnCompleteListener(new a(this.f17827w, str, this.f17828x, this.f17826v));
        return hs.k.f19476a;
    }
}
