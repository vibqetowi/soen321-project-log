package fm;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.GoalDateObj;
import com.theinnerhour.b2b.model.UserStatisticsDetail;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.StatPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilsKt;
import fe.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import lv.c0;
import lv.v;
import org.json.JSONObject;
/* compiled from: FirestoreGoalsViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f15374a = LogHelper.INSTANCE.makeLogTag("FirestoreGoalsVMRepository");

    /* compiled from: FirestoreGoalsViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class a<TResult> implements ya.d {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ FirestoreGoal f15376b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f15377c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.j<Boolean> f15378d;

        /* compiled from: FirestoreGoalsViewModelRepository.kt */
        /* renamed from: fm.j0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0237a extends kotlin.jvm.internal.k implements ss.a<hs.k> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ ya.h<Void> f15379u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ FirestoreGoal f15380v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ boolean f15381w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.j<Boolean> f15382x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0237a(ya.h<Void> hVar, FirestoreGoal firestoreGoal, boolean z10, kotlinx.coroutines.j<? super Boolean> jVar) {
                super(0);
                this.f15379u = hVar;
                this.f15380v = firestoreGoal;
                this.f15381w = z10;
                this.f15382x = jVar;
            }

            @Override // ss.a
            public final hs.k invoke() {
                boolean isSuccessful = this.f15379u.isSuccessful();
                kotlinx.coroutines.j<Boolean> jVar = this.f15382x;
                if (isSuccessful) {
                    FirestoreGoal firestoreGoal = this.f15380v;
                    if (firestoreGoal.isVisible() && this.f15381w) {
                        FirebasePersistence.getInstance().checkAndUpdateGamificationScore(firestoreGoal.getGoalId());
                    }
                    if (jVar.a()) {
                        jVar.resumeWith(Boolean.TRUE);
                    }
                } else if (jVar.a()) {
                    jVar.resumeWith(Boolean.FALSE);
                }
                return hs.k.f19476a;
            }
        }

        public a(FirestoreGoal firestoreGoal, boolean z10, kotlinx.coroutines.k kVar) {
            this.f15376b = firestoreGoal;
            this.f15377c = z10;
            this.f15378d = kVar;
        }

        @Override // ya.d
        public final void a(ya.h<Void> it) {
            kotlin.jvm.internal.i.g(it, "it");
            UtilsKt.logError$default(j0.this.f15374a, null, new C0237a(it, this.f15376b, this.f15377c, this.f15378d), 2, null);
        }
    }

    /* compiled from: FirestoreGoalsViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class b implements ValueEventListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ String f15383u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.j<Boolean> f15384v;

        public b(String str, kotlinx.coroutines.k kVar) {
            this.f15383u = str;
            this.f15384v = kVar;
        }

        @Override // com.google.firebase.database.ValueEventListener
        public final void onCancelled(DatabaseError error) {
            kotlin.jvm.internal.i.g(error, "error");
            kotlinx.coroutines.j<Boolean> jVar = this.f15384v;
            if (jVar.a()) {
                jVar.resumeWith(Boolean.FALSE);
            }
        }

        @Override // com.google.firebase.database.ValueEventListener
        public final void onDataChange(DataSnapshot snapshot) {
            kotlin.jvm.internal.i.g(snapshot, "snapshot");
            boolean exists = snapshot.exists();
            kotlinx.coroutines.j<Boolean> jVar = this.f15384v;
            if (exists) {
                UserStatisticsDetail userStatisticsDetail = (UserStatisticsDetail) snapshot.getValue(UserStatisticsDetail.class);
                if (userStatisticsDetail == null) {
                    userStatisticsDetail = new UserStatisticsDetail();
                }
                StatPersistence.updateGoalTrackCountByCourse$default(StatPersistence.INSTANCE, userStatisticsDetail, this.f15383u, true, null, 8, null);
                if (jVar.a()) {
                    jVar.resumeWith(Boolean.TRUE);
                    return;
                }
                return;
            }
            StatPersistence.updateGoalTrackCountByCourse$default(StatPersistence.INSTANCE, new UserStatisticsDetail(), this.f15383u, true, null, 8, null);
            if (jVar.a()) {
                jVar.resumeWith(Boolean.TRUE);
            }
        }
    }

    /* compiled from: FirestoreGoalsViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class c<TResult> implements ya.d {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.j<Boolean> f15386b;

        /* compiled from: FirestoreGoalsViewModelRepository.kt */
        /* loaded from: classes2.dex */
        public static final class a extends kotlin.jvm.internal.k implements ss.a<hs.k> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ ya.h<Void> f15387u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.j<Boolean> f15388v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(ya.h<Void> hVar, kotlinx.coroutines.j<? super Boolean> jVar) {
                super(0);
                this.f15387u = hVar;
                this.f15388v = jVar;
            }

            @Override // ss.a
            public final hs.k invoke() {
                boolean isSuccessful = this.f15387u.isSuccessful();
                kotlinx.coroutines.j<Boolean> jVar = this.f15388v;
                if (isSuccessful) {
                    if (jVar.a()) {
                        jVar.resumeWith(Boolean.TRUE);
                    }
                } else if (jVar.a()) {
                    jVar.resumeWith(Boolean.FALSE);
                }
                return hs.k.f19476a;
            }
        }

        public c(kotlinx.coroutines.k kVar) {
            this.f15386b = kVar;
        }

        @Override // ya.d
        public final void a(ya.h<Void> it) {
            kotlin.jvm.internal.i.g(it, "it");
            UtilsKt.logError$default(j0.this.f15374a, null, new a(it, this.f15386b), 2, null);
        }
    }

    /* compiled from: FirestoreGoalsViewModelRepository.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModelRepository$addTrackList$2$1$1", f = "FirestoreGoalsViewModelRepository.kt", l = {403}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f15389u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f15390v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ List<fe.y> f15391w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ j0 f15392x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.j<Boolean> f15393y;

        /* compiled from: FirestoreGoalsViewModelRepository.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.FirestoreGoalsViewModelRepository$addTrackList$2$1$1$1$1", f = "FirestoreGoalsViewModelRepository.kt", l = {402}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Boolean>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f15394u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ j0 f15395v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ fe.y f15396w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(j0 j0Var, fe.y yVar, ls.d<? super a> dVar) {
                super(2, dVar);
                this.f15395v = j0Var;
                this.f15396w = yVar;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new a(this.f15395v, this.f15396w, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Boolean> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f15394u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    fe.y yVar = this.f15396w;
                    this.f15394u = 1;
                    j0 j0Var = this.f15395v;
                    j0Var.getClass();
                    ls.h hVar = new ls.h(ca.a.G0(this));
                    try {
                        yVar.a().addOnCompleteListener(new w0(hVar));
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(j0Var.f15374a, e10);
                    }
                    obj = hVar.b();
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(List<? extends fe.y> list, j0 j0Var, kotlinx.coroutines.j<? super Boolean> jVar, ls.d<? super d> dVar) {
            super(2, dVar);
            this.f15391w = list;
            this.f15392x = j0Var;
            this.f15393y = jVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            d dVar2 = new d(this.f15391w, this.f15392x, this.f15393y, dVar);
            dVar2.f15390v = obj;
            return dVar2;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((d) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f15389u;
            boolean z10 = true;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f15390v;
                List<fe.y> list = this.f15391w;
                ArrayList arrayList = new ArrayList(is.i.H1(list, 10));
                for (fe.y yVar : list) {
                    arrayList.add(ta.v.g(d0Var, null, new a(this.f15392x, yVar, null), 3));
                }
                this.f15389u = 1;
                obj = ca.a.n(arrayList, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            List list2 = (List) obj;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((Boolean) it.next()).booleanValue()) {
                            z10 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            kotlinx.coroutines.j<Boolean> jVar = this.f15393y;
            if (z10) {
                if (jVar.a()) {
                    jVar.resumeWith(Boolean.TRUE);
                }
            } else if (jVar.a()) {
                jVar.resumeWith(Boolean.FALSE);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FirestoreGoalsViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class e<TResult> implements ya.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ls.d<GoalDateObj> f15397a;

        public e(ls.h hVar) {
            this.f15397a = hVar;
        }

        @Override // ya.d
        public final void a(ya.h<fe.r> it) {
            fe.q qVar;
            kotlin.jvm.internal.i.g(it, "it");
            boolean isSuccessful = it.isSuccessful();
            GoalDateObj goalDateObj = null;
            ls.d<GoalDateObj> dVar = this.f15397a;
            if (isSuccessful) {
                fe.r result = it.getResult();
                if (result != null && (qVar = (fe.q) is.u.h2(result)) != null) {
                    goalDateObj = (GoalDateObj) qVar.d(GoalDateObj.class);
                }
                dVar.resumeWith(goalDateObj);
                return;
            }
            dVar.resumeWith(null);
        }
    }

    /* compiled from: FirestoreGoalsViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class f<TResult> implements ya.d {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.j<FirestoreGoal> f15399b;

        /* compiled from: FirestoreGoalsViewModelRepository.kt */
        /* loaded from: classes2.dex */
        public static final class a extends kotlin.jvm.internal.k implements ss.a<hs.k> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ ya.h<fe.r> f15400u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.j<FirestoreGoal> f15401v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(ya.h<fe.r> hVar, kotlinx.coroutines.j<? super FirestoreGoal> jVar) {
                super(0);
                this.f15400u = hVar;
                this.f15401v = jVar;
            }

            @Override // ss.a
            public final hs.k invoke() {
                ya.h<fe.r> hVar = this.f15400u;
                boolean isSuccessful = hVar.isSuccessful();
                kotlinx.coroutines.j<FirestoreGoal> jVar = this.f15401v;
                if (isSuccessful) {
                    if (hVar.getResult().e().size() == 1) {
                        FirestoreGoal firestoreGoal = (FirestoreGoal) ((fe.g) hVar.getResult().e().get(0)).d(FirestoreGoal.class);
                        if (jVar.a()) {
                            jVar.resumeWith(firestoreGoal);
                        }
                    } else if (jVar.a()) {
                        jVar.resumeWith(null);
                    }
                } else if (jVar.a()) {
                    jVar.resumeWith(null);
                }
                return hs.k.f19476a;
            }
        }

        public f(kotlinx.coroutines.k kVar) {
            this.f15399b = kVar;
        }

        @Override // ya.d
        public final void a(ya.h<fe.r> it) {
            kotlin.jvm.internal.i.g(it, "it");
            UtilsKt.logError$default(j0.this.f15374a, null, new a(it, this.f15399b), 2, null);
        }
    }

    /* compiled from: FirestoreGoalsViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class g implements ya.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.j<FirestoreGoal> f15402a;

        public g(kotlinx.coroutines.k kVar) {
            this.f15402a = kVar;
        }

        @Override // ya.e
        public final void onFailure(Exception it) {
            kotlin.jvm.internal.i.g(it, "it");
            kotlinx.coroutines.j<FirestoreGoal> jVar = this.f15402a;
            if (jVar.a()) {
                jVar.resumeWith(null);
            }
        }
    }

    /* compiled from: FirestoreGoalsViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class h<TResult> implements ya.d {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.j<FirestoreGoal> f15404b;

        /* compiled from: FirestoreGoalsViewModelRepository.kt */
        /* loaded from: classes2.dex */
        public static final class a extends kotlin.jvm.internal.k implements ss.a<hs.k> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ ya.h<fe.g> f15405u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.j<FirestoreGoal> f15406v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(ya.h<fe.g> hVar, kotlinx.coroutines.j<? super FirestoreGoal> jVar) {
                super(0);
                this.f15405u = hVar;
                this.f15406v = jVar;
            }

            @Override // ss.a
            public final hs.k invoke() {
                ya.h<fe.g> hVar = this.f15405u;
                boolean isSuccessful = hVar.isSuccessful();
                FirestoreGoal firestoreGoal = null;
                kotlinx.coroutines.j<FirestoreGoal> jVar = this.f15406v;
                if (isSuccessful) {
                    fe.g result = hVar.getResult();
                    if (result != null) {
                        firestoreGoal = (FirestoreGoal) result.d(FirestoreGoal.class);
                    }
                    if (jVar.a()) {
                        jVar.resumeWith(firestoreGoal);
                    }
                } else if (jVar.a()) {
                    jVar.resumeWith(null);
                }
                return hs.k.f19476a;
            }
        }

        public h(kotlinx.coroutines.k kVar) {
            this.f15404b = kVar;
        }

        @Override // ya.d
        public final void a(ya.h<fe.g> it) {
            kotlin.jvm.internal.i.g(it, "it");
            UtilsKt.logError$default(j0.this.f15374a, null, new a(it, this.f15404b), 2, null);
        }
    }

    /* compiled from: FirestoreGoalsViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class i<TResult> implements ya.d {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ls.d<List<? extends HashMap<String, Object>>> f15408b;

        /* compiled from: FirestoreGoalsViewModelRepository.kt */
        /* loaded from: classes2.dex */
        public static final class a extends kotlin.jvm.internal.k implements ss.a<hs.k> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ ya.h<fe.r> f15409u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ ls.d<List<? extends HashMap<String, Object>>> f15410v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(ya.h<fe.r> hVar, ls.d<? super List<? extends HashMap<String, Object>>> dVar) {
                super(0);
                this.f15409u = hVar;
                this.f15410v = dVar;
            }

            @Override // ss.a
            public final hs.k invoke() {
                ya.h<fe.r> hVar = this.f15409u;
                boolean isSuccessful = hVar.isSuccessful();
                ls.d<List<? extends HashMap<String, Object>>> dVar = this.f15410v;
                if (isSuccessful) {
                    fe.r<fe.q> result = hVar.getResult();
                    kotlin.jvm.internal.i.f(result, "it.result");
                    ArrayList arrayList = new ArrayList();
                    for (fe.q qVar : result) {
                        arrayList.add(new HashMap(qVar.f()));
                    }
                    dVar.resumeWith(arrayList);
                } else {
                    dVar.resumeWith(null);
                }
                return hs.k.f19476a;
            }
        }

        public i(ls.h hVar) {
            this.f15408b = hVar;
        }

        @Override // ya.d
        public final void a(ya.h<fe.r> it) {
            kotlin.jvm.internal.i.g(it, "it");
            UtilsKt.logError$default(j0.this.f15374a, null, new a(it, this.f15408b), 2, null);
        }
    }

    /* compiled from: FirestoreGoalsViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class j<TResult> implements ya.d {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.j<List<FirestoreGoal>> f15412b;

        /* compiled from: FirestoreGoalsViewModelRepository.kt */
        /* loaded from: classes2.dex */
        public static final class a extends kotlin.jvm.internal.k implements ss.a<hs.k> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ ya.h<fe.r> f15413u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.j<List<FirestoreGoal>> f15414v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(ya.h<fe.r> hVar, kotlinx.coroutines.j<? super List<FirestoreGoal>> jVar) {
                super(0);
                this.f15413u = hVar;
                this.f15414v = jVar;
            }

            @Override // ss.a
            public final hs.k invoke() {
                ya.h<fe.r> hVar = this.f15413u;
                boolean isSuccessful = hVar.isSuccessful();
                ArrayList arrayList = null;
                kotlinx.coroutines.j<List<FirestoreGoal>> jVar = this.f15414v;
                if (isSuccessful) {
                    fe.r result = hVar.getResult();
                    if (result != null) {
                        arrayList = new ArrayList();
                        Iterator<fe.q> it = result.iterator();
                        while (true) {
                            r.a aVar = (r.a) it;
                            if (!aVar.hasNext()) {
                                break;
                            }
                            FirestoreGoal firestoreGoal = (FirestoreGoal) ((fe.q) aVar.next()).d(FirestoreGoal.class);
                            if (firestoreGoal != null) {
                                arrayList.add(firestoreGoal);
                            }
                        }
                    }
                    if (jVar.a()) {
                        jVar.resumeWith(arrayList);
                    }
                } else if (jVar.a()) {
                    jVar.resumeWith(null);
                }
                return hs.k.f19476a;
            }
        }

        public j(kotlinx.coroutines.k kVar) {
            this.f15412b = kVar;
        }

        @Override // ya.d
        public final void a(ya.h<fe.r> it) {
            kotlin.jvm.internal.i.g(it, "it");
            UtilsKt.logError$default(j0.this.f15374a, null, new a(it, this.f15412b), 2, null);
        }
    }

    /* compiled from: FirestoreGoalsViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class k implements ya.f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ss.l f15415a;

        public k(ss.l lVar) {
            this.f15415a = lVar;
        }

        @Override // ya.f
        public final /* synthetic */ void onSuccess(Object obj) {
            this.f15415a.invoke(obj);
        }
    }

    /* compiled from: FirestoreGoalsViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class l<TResult> implements ya.d {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.j<Boolean> f15417b;

        /* compiled from: FirestoreGoalsViewModelRepository.kt */
        /* loaded from: classes2.dex */
        public static final class a extends kotlin.jvm.internal.k implements ss.a<hs.k> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ ya.h<Void> f15418u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.j<Boolean> f15419v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(ya.h<Void> hVar, kotlinx.coroutines.j<? super Boolean> jVar) {
                super(0);
                this.f15418u = hVar;
                this.f15419v = jVar;
            }

            @Override // ss.a
            public final hs.k invoke() {
                boolean isSuccessful = this.f15418u.isSuccessful();
                kotlinx.coroutines.j<Boolean> jVar = this.f15419v;
                if (isSuccessful) {
                    if (jVar.a()) {
                        jVar.resumeWith(Boolean.TRUE);
                    }
                } else if (jVar.a()) {
                    jVar.resumeWith(Boolean.FALSE);
                }
                return hs.k.f19476a;
            }
        }

        public l(kotlinx.coroutines.k kVar) {
            this.f15417b = kVar;
        }

        @Override // ya.d
        public final void a(ya.h<Void> it) {
            kotlin.jvm.internal.i.g(it, "it");
            UtilsKt.logError$default(j0.this.f15374a, null, new a(it, this.f15417b), 2, null);
        }
    }

    /* compiled from: FirestoreGoalsViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class m implements ya.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.j<Boolean> f15420a;

        public m(kotlinx.coroutines.k kVar) {
            this.f15420a = kVar;
        }

        @Override // ya.e
        public final void onFailure(Exception it) {
            kotlin.jvm.internal.i.g(it, "it");
            kotlinx.coroutines.j<Boolean> jVar = this.f15420a;
            if (jVar.a()) {
                jVar.resumeWith(Boolean.FALSE);
            }
        }
    }

    public static final kotlinx.coroutines.flow.r a(j0 j0Var, com.google.firebase.firestore.d dVar, kotlinx.coroutines.flow.d dVar2) {
        j0Var.getClass();
        return new kotlinx.coroutines.flow.r(new v0(dVar2, dVar, 10000L, j0Var, null));
    }

    public static Object c(String str, ls.d dVar) {
        String str2;
        kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(dVar));
        kVar.u();
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        StringBuilder sb2 = new StringBuilder("userStatistics/");
        fd.f fVar = FirebaseAuth.getInstance().f;
        if (fVar != null) {
            str2 = fVar.j0();
        } else {
            str2 = null;
        }
        sb2.append(str2);
        firebaseDatabase.getReference(sb2.toString()).child("uniqueGoalTracks").addListenerForSingleValueEvent(new b(str, kVar));
        return kVar.s();
    }

    public static Object g(Integer num, String str, ls.d dVar) {
        String str2;
        kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(dVar));
        kVar.u();
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        StringBuilder sb2 = new StringBuilder("userStatistics/");
        fd.f fVar = FirebaseAuth.getInstance().f;
        if (fVar != null) {
            str2 = fVar.j0();
        } else {
            str2 = null;
        }
        sb2.append(str2);
        firebaseDatabase.getReference(sb2.toString()).child("uniqueGoalTracks").addListenerForSingleValueEvent(new l0(str, num, kVar));
        return kVar.s();
    }

    public static Object h(String str, String str2, ls.d dVar, boolean z10) {
        ls.h hVar = new ls.h(ca.a.G0(dVar));
        com.google.firebase.firestore.d b10 = FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION).q(str).b(Constants.USER_GOALS_DATA).q(str2).b(Constants.USER_GOALS_LOGS_DATA);
        if (!z10) {
            b10 = b10.d("date").b(1L);
        }
        b10.a().addOnCompleteListener(new p0(hVar));
        return hVar.b();
    }

    public static Object i(String str, String str2, ls.d dVar) {
        ls.h hVar = new ls.h(ca.a.G0(dVar));
        FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION).q(str2).b(Constants.USER_GOALS_DATA).q(str).b(Constants.USER_GOALS_TRACK_DATA).d("date.time").b(1L).a().addOnCompleteListener(new e(hVar));
        return hVar.b();
    }

    public final Object b(FirestoreGoal firestoreGoal, String str, boolean z10, ls.d<? super Boolean> dVar) {
        kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(dVar));
        kVar.u();
        String goalId = firestoreGoal.getGoalId();
        if (goalId != null) {
            FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION).q(str).b(Constants.USER_GOALS_DATA).q(goalId).e(firestoreGoal).addOnCompleteListener(new a(firestoreGoal, z10, kVar));
        }
        return kVar.s();
    }

    public final Object d(String str, Object obj, String str2, String str3, ls.d<? super Boolean> dVar) {
        kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(dVar));
        kVar.u();
        FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION).q(str2).b(Constants.USER_GOALS_DATA).q(str).b(Constants.USER_GOALS_LOGS_DATA).q(str3).e(obj).addOnCompleteListener(new c(kVar));
        return kVar.s();
    }

    public final Object e(String str, ArrayList<GoalDateObj> arrayList, String str2, ls.d<? super Boolean> dVar) {
        kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(dVar));
        kVar.u();
        if (str != null) {
            ArrayList<List> Y1 = is.u.Y1(arrayList, 499);
            ArrayList arrayList2 = new ArrayList(is.i.H1(Y1, 10));
            for (List<GoalDateObj> list : Y1) {
                fe.y a10 = FirebaseFirestore.d().a();
                for (GoalDateObj goalDateObj : list) {
                    a10.b(FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION).q(str2).b(Constants.USER_GOALS_DATA).q(str).b(Constants.USER_GOALS_TRACK_DATA).q(String.valueOf(goalDateObj.getDate().getTime())), goalDateObj);
                }
                arrayList2.add(a10);
            }
            if (arrayList2.isEmpty()) {
                if (kVar.a()) {
                    kVar.resumeWith(Boolean.TRUE);
                }
            } else {
                ta.v.H(kotlin.jvm.internal.h.c(kotlinx.coroutines.o0.f23642c), null, 0, new d(arrayList2, this, kVar, null), 3);
            }
        }
        return kVar.s();
    }

    public final Object f(String str, ls.d dVar) {
        kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(dVar));
        kVar.u();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.GOAL_ID, str);
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.i.f(jSONObject2, "jsonObject.toString()");
        Pattern pattern = lv.v.f24702d;
        ((or.k) nr.b.a(or.k.class)).e("https://api.theinnerhour.com/v1/goaltransform", c0.a.a(jSONObject2, v.a.b("application/json; charset=utf-8"))).I(new k0(this, kVar));
        return kVar.s();
    }

    public final Object j(String str, String str2, ls.d<? super FirestoreGoal> dVar) {
        kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(dVar));
        kVar.u();
        ya.v a10 = FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION).q(str2).b(Constants.USER_GOALS_DATA).m(str, "goalName").b(1L).a();
        a10.addOnCompleteListener(new f(kVar));
        a10.addOnFailureListener(new g(kVar));
        return kVar.s();
    }

    public final Object k(String str, String str2, ls.d<? super FirestoreGoal> dVar) {
        kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(dVar));
        kVar.u();
        FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION).q(str2).b(Constants.USER_GOALS_DATA).q(str).d().addOnCompleteListener(new h(kVar));
        return kVar.s();
    }

    public final Object l(String str, String str2, ls.d<? super List<? extends HashMap<String, Object>>> dVar) {
        ls.h hVar = new ls.h(ca.a.G0(dVar));
        FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION).q(str2).b(Constants.USER_GOALS_DATA).q(str).b(Constants.USER_GOALS_LOGS_DATA).a().addOnCompleteListener(new i(hVar));
        return hVar.b();
    }

    public final kotlinx.coroutines.flow.r m(kotlinx.coroutines.flow.x xVar, String str, String str2, Long l2, Long l10) {
        return new kotlinx.coroutines.flow.r(new r0(str2, str, l2, l10, this, xVar, null));
    }

    public final kotlinx.coroutines.flow.r n(kotlinx.coroutines.flow.x xVar, String str, long j10) {
        return new kotlinx.coroutines.flow.r(new s0(this, str, j10, xVar, null));
    }

    public final Object o(String str, ls.d<? super List<FirestoreGoal>> dVar) {
        kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(dVar));
        kVar.u();
        FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION).q(str).b(Constants.USER_GOALS_DATA).o("type", ca.a.P0(Constants.GOAL_TYPE_RELAXATION_ACTIVITY, "physical_activity")).a().addOnCompleteListener(new j(kVar));
        return kVar.s();
    }

    public final Object p(String str, GoalDateObj goalDateObj, String str2, String str3, ls.d<? super Boolean> dVar) {
        kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(dVar));
        kVar.u();
        if (str != null) {
            fe.c b10 = FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION).q(str2).b(Constants.USER_GOALS_DATA).q(str).b(Constants.USER_GOALS_TRACK_DATA);
            if (str3 == null) {
                str3 = String.valueOf(goalDateObj.getDate().getTime());
            }
            b10.q(str3).e(goalDateObj).addOnCompleteListener(new l(kVar)).addOnFailureListener(new m(kVar));
        }
        return kVar.s();
    }
}
