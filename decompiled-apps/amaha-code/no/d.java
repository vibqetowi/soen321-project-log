package no;

import com.appsflyer.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;
import com.theinnerhour.b2b.components.chat.model.ChatUser;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import fd.f;
import hs.k;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import ns.e;
import ns.i;
import ss.p;
import ta.v;
/* compiled from: ProDashboardViewModel.kt */
@e(c = "com.theinnerhour.b2b.components.pro.dashboard.viewmodel.ProDashboardViewModel$fetchUnreadMessageCount$1", f = "ProDashboardViewModel.kt", l = {R.styleable.AppCompatTheme_listDividerAlertDialog}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f26701u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ no.a f26702v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ChatUser f26703w;

    /* compiled from: ProDashboardViewModel.kt */
    @e(c = "com.theinnerhour.b2b.components.pro.dashboard.viewmodel.ProDashboardViewModel$fetchUnreadMessageCount$1$1", f = "ProDashboardViewModel.kt", l = {R.styleable.AppCompatTheme_listDividerAlertDialog}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<d0, ls.d<? super Integer>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f26704u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ no.a f26705v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ChatUser f26706w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(no.a aVar, ChatUser chatUser, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f26705v = aVar;
            this.f26706w = chatUser;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f26705v, this.f26706w, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super Integer> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f26704u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                mo.a aVar2 = this.f26705v.f26677x;
                this.f26704u = 1;
                aVar2.getClass();
                kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(this));
                kVar.u();
                if (FirebasePersistence.getInstance().getUser() != null) {
                    FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
                    StringBuilder sb2 = new StringBuilder("user_friend_map/");
                    f fVar = FirebaseAuth.getInstance().f;
                    kotlin.jvm.internal.i.d(fVar);
                    sb2.append(fVar.j0());
                    sb2.append('/');
                    sb2.append(this.f26706w.getKey());
                    sb2.append("/unread_messages");
                    firebaseDatabase.getReference(sb2.toString()).addValueEventListener(new mo.b(kVar));
                } else if (kVar.a()) {
                    kVar.resumeWith(null);
                }
                obj = kVar.s();
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(no.a aVar, ChatUser chatUser, ls.d<? super d> dVar) {
        super(2, dVar);
        this.f26702v = aVar;
        this.f26703w = chatUser;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new d(this.f26702v, this.f26703w, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((d) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f26701u;
        no.a aVar2 = this.f26702v;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
            a aVar3 = new a(aVar2, this.f26703w, null);
            this.f26701u = 1;
            obj = v.S(cVar, aVar3, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        aVar2.f26679z.i((Integer) obj);
        return k.f19476a;
    }
}
