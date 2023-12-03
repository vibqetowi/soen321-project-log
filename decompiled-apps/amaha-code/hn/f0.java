package hn;

import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.components.login.model.InitFirebaseResponses;
import com.theinnerhour.b2b.utils.Utils;
import kotlinx.coroutines.o0;
/* compiled from: LoginSignupReworkViewModel.kt */
/* loaded from: classes2.dex */
public final class f0<TResult> implements ya.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f17853a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f17854b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q f17855c;

    /* compiled from: LoginSignupReworkViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a<TResult> implements ya.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ q f17856a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f17857b;

        /* compiled from: LoginSignupReworkViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkViewModel$updateEmailAndLogin$2$1$1$1", f = "LoginSignupReworkViewModel.kt", l = {1038}, m = "invokeSuspend")
        /* renamed from: hn.f0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0287a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f17858u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ q f17859v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ls.d<Boolean> f17860w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0287a(q qVar, ls.d<? super Boolean> dVar, ls.d<? super C0287a> dVar2) {
                super(2, dVar2);
                this.f17859v = qVar;
                this.f17860w = dVar;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new C0287a(this.f17859v, this.f17860w, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((C0287a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f17858u;
                boolean z10 = true;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    kotlinx.coroutines.flow.b bVar = this.f17859v.C.f17792d;
                    this.f17858u = 1;
                    obj = ta.v.M(bVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                if (((InitFirebaseResponses) obj) != InitFirebaseResponses.INITIALISE_COMPLETE) {
                    z10 = false;
                }
                this.f17860w.resumeWith(Boolean.valueOf(z10));
                return hs.k.f19476a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(q qVar, ls.d<? super Boolean> dVar) {
            this.f17856a = qVar;
            this.f17857b = dVar;
        }

        @Override // ya.d
        public final void a(ya.h<fd.c> loginTask) {
            kotlin.jvm.internal.i.g(loginTask, "loginTask");
            boolean isSuccessful = loginTask.isSuccessful();
            ls.d<Boolean> dVar = this.f17857b;
            if (isSuccessful) {
                q qVar = this.f17856a;
                ta.v.H(kc.f.H(qVar), o0.f23642c, 0, new C0287a(qVar, dVar, null), 2);
                return;
            }
            Utils.INSTANCE.clearPersistence();
            dVar.resumeWith(Boolean.FALSE);
        }
    }

    public f0(q qVar, String str, ls.h hVar) {
        this.f17853a = str;
        this.f17854b = hVar;
        this.f17855c = qVar;
    }

    @Override // ya.d
    public final void a(ya.h<Void> task) {
        kotlin.jvm.internal.i.g(task, "task");
        boolean isSuccessful = task.isSuccessful();
        ls.d<Boolean> dVar = this.f17854b;
        if (isSuccessful) {
            FirebaseAuth.getInstance().e(this.f17853a).addOnCompleteListener(new a(this.f17855c, dVar));
            return;
        }
        Utils.INSTANCE.clearPersistence();
        dVar.resumeWith(Boolean.FALSE);
    }
}
