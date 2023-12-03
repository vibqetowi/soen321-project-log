package wn;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerModel;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import fe.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.d0;
import ta.v;
/* compiled from: MultiTrackerMigrationViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.multiTracker.utils.MultiTrackerMigrationViewModel$performMoodNodeMigration$2$1", f = "MultiTrackerMigrationViewModel.kt", l = {177}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class o extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f36819u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f36820v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f36821w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ k f36822x;

    /* compiled from: MultiTrackerMigrationViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.multiTracker.utils.MultiTrackerMigrationViewModel$performMoodNodeMigration$2$1$1$1", f = "MultiTrackerMigrationViewModel.kt", l = {176}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<d0, ls.d<? super Boolean>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f36823u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ k f36824v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ y f36825w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, y yVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f36824v = kVar;
            this.f36825w = yVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f36824v, this.f36825w, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super Boolean> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f36823u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                this.f36823u = 1;
                k kVar = this.f36824v;
                kVar.getClass();
                ls.h hVar = new ls.h(ca.a.G0(this));
                v.H(kc.f.H(kVar), null, 0, new n(this.f36825w, kVar, hVar, null), 3);
                obj = hVar.b();
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(k kVar, ls.d dVar, ls.d dVar2) {
        super(2, dVar2);
        this.f36821w = dVar;
        this.f36822x = kVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        o oVar = new o(this.f36822x, this.f36821w, dVar);
        oVar.f36820v = obj;
        return oVar;
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((o) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8 A[Catch: Exception -> 0x00e5, TryCatch #0 {Exception -> 0x00e5, blocks: (B:5:0x0010, B:40:0x00f0, B:42:0x00f6, B:52:0x0115, B:45:0x00fd, B:46:0x0101, B:48:0x0107, B:10:0x0026, B:12:0x0033, B:14:0x0039, B:15:0x004c, B:17:0x0052, B:18:0x0064, B:20:0x006a, B:21:0x00a5, B:24:0x00ac, B:30:0x00b8, B:31:0x00be, B:32:0x00cb, B:34:0x00d1, B:37:0x00e7), top: B:57:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be A[Catch: Exception -> 0x00e5, TryCatch #0 {Exception -> 0x00e5, blocks: (B:5:0x0010, B:40:0x00f0, B:42:0x00f6, B:52:0x0115, B:45:0x00fd, B:46:0x0101, B:48:0x0107, B:10:0x0026, B:12:0x0033, B:14:0x0039, B:15:0x004c, B:17:0x0052, B:18:0x0064, B:20:0x006a, B:21:0x00a5, B:24:0x00ac, B:30:0x00b8, B:31:0x00be, B:32:0x00cb, B:34:0x00d1, B:37:0x00e7), top: B:57:0x000c }] */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList<y> arrayList;
        boolean z10;
        Object n10;
        ArrayList<MultiTrackerModel> userMoodListV3;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f36819u;
        boolean z11 = false;
        ls.d<Boolean> dVar = this.f36821w;
        k kVar = this.f36822x;
        try {
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(kVar.f36803x, e10);
        }
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
                n10 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            d0 d0Var = (d0) this.f36820v;
            User user = FirebasePersistence.getInstance().getUser();
            if (user != null && (userMoodListV3 = user.getUserMoodListV3()) != null) {
                ArrayList<List> Y1 = is.u.Y1(userMoodListV3, 499);
                arrayList = new ArrayList(is.i.H1(Y1, 10));
                for (List<MultiTrackerModel> list : Y1) {
                    y a10 = FirebaseFirestore.d().a();
                    for (MultiTrackerModel multiTrackerModel : list) {
                        fe.c b10 = FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION);
                        fd.f fVar = FirebaseAuth.getInstance().f;
                        kotlin.jvm.internal.i.d(fVar);
                        a10.b(b10.q(fVar.j0()).b(Constants.USER_MULTITRACKER_TRACKED_DATA).q(String.valueOf(multiTrackerModel.getDate().getTime())), multiTrackerModel);
                    }
                    arrayList.add(a10);
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                z10 = false;
                if (!z10) {
                    dVar.resumeWith(Boolean.TRUE);
                    return hs.k.f19476a;
                }
                ArrayList arrayList2 = new ArrayList(is.i.H1(arrayList, 10));
                for (y yVar : arrayList) {
                    arrayList2.add(v.g(d0Var, null, new a(kVar, yVar, null), 3));
                }
                this.f36819u = 1;
                n10 = ca.a.n(arrayList2, this);
                if (n10 == aVar) {
                    return aVar;
                }
            }
            z10 = true;
            if (!z10) {
            }
        }
        List<Boolean> list2 = (List) n10;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (Boolean bool : list2) {
                if (!bool.booleanValue()) {
                    break;
                }
            }
        }
        z11 = true;
        dVar.resumeWith(Boolean.valueOf(z11));
        return hs.k.f19476a;
    }
}
