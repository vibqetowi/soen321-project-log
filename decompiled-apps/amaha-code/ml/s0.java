package ml;

import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerFirestoreStatsModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.PostsRead;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: V3DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V3DashboardViewModel$setIsDayElementsCompleted$1", f = "V3DashboardViewModel.kt", l = {732}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class s0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public c0 f25579u;

    /* renamed from: v  reason: collision with root package name */
    public int f25580v;

    /* renamed from: w  reason: collision with root package name */
    public /* synthetic */ Object f25581w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ c0 f25582x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ ArrayList<LearningHubModel> f25583y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(c0 c0Var, ArrayList<LearningHubModel> arrayList, ls.d<? super s0> dVar) {
        super(2, dVar);
        this.f25582x = c0Var;
        this.f25583y = arrayList;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        s0 s0Var = new s0(this.f25582x, this.f25583y, dVar);
        s0Var.f25581w = obj;
        return s0Var;
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((s0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0129  */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        hs.k kVar;
        boolean z10;
        c0 c0Var;
        Boolean bool;
        boolean z11;
        boolean z12;
        boolean z13;
        long j10;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f25580v;
        c0 c0Var2 = this.f25582x;
        boolean z14 = false;
        if (i6 != 0) {
            if (i6 == 1) {
                c0Var = this.f25579u;
                kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f25581w;
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.d0 d0Var2 = (kotlinx.coroutines.d0) this.f25581w;
            User user = FirebasePersistence.getInstance().getUser();
            kVar = null;
            if (user != null) {
                long courseOpenDay = FirebasePersistence.getInstance().getCourseById(user.getCurrentCourse()).getCourseOpenDay();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : this.f25583y) {
                    if (((LearningHubModel) obj2).getDay() == ((int) courseOpenDay)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        arrayList.add(obj2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        LearningHubModel learningHubModel = (LearningHubModel) it.next();
                        ArrayList<PostsRead> postsRead = user.getPostsRead();
                        kotlin.jvm.internal.i.f(postsRead, "it.postsRead");
                        if (!postsRead.isEmpty()) {
                            for (PostsRead postsRead2 : postsRead) {
                                if (kotlin.jvm.internal.i.b(postsRead2.getPostId(), learningHubModel.getId())) {
                                    z11 = false;
                                    continue;
                                    break;
                                }
                            }
                        }
                        z11 = true;
                        continue;
                        if (z11) {
                            z10 = true;
                            break;
                        }
                    }
                }
                z10 = false;
                if (z10) {
                    bool = Boolean.FALSE;
                    c0Var = c0Var2;
                    c0Var.c0 = bool;
                    kVar = hs.k.f19476a;
                } else {
                    this.f25581w = d0Var2;
                    this.f25579u = c0Var2;
                    this.f25580v = 1;
                    c0Var2.getClass();
                    ls.h hVar = new ls.h(ca.a.G0(this));
                    ta.v.H(kc.f.H(c0Var2), null, 0, new l0(hVar, c0Var2, null), 3);
                    obj = hVar.b();
                    if (obj == aVar) {
                        return aVar;
                    }
                    c0Var = c0Var2;
                }
            }
            if (kVar == null) {
                c0Var2.c0 = Boolean.FALSE;
            }
            return hs.k.f19476a;
        }
        hs.f fVar = (hs.f) obj;
        if (fVar != null && (!((Boolean) fVar.f19465v).booleanValue() || ((Boolean) fVar.f19464u).booleanValue())) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z13) {
            bool = Boolean.FALSE;
        } else {
            wn.b.f36765a.getClass();
            MultiTrackerFirestoreStatsModel multiTrackerFirestoreStatsModel = wn.b.f36767c;
            if (multiTrackerFirestoreStatsModel != null) {
                j10 = multiTrackerFirestoreStatsModel.getLatestTrackedDateInSeconds();
            } else {
                j10 = -1;
            }
            if (j10 >= Utils.INSTANCE.getTodayTimeInSeconds()) {
                z14 = true;
            }
            bool = Boolean.valueOf(z14);
        }
        c0Var.c0 = bool;
        kVar = hs.k.f19476a;
        if (kVar == null) {
        }
        return hs.k.f19476a;
    }
}
