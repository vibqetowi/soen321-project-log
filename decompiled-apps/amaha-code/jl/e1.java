package jl;

import com.theinnerhour.b2b.components.dashboard.experiment.model.NotV4RecentModel;
import com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: NotV4DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel$fetchRecent$1", f = "NotV4DashboardViewModel.kt", l = {291, 298}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e1 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public il.r f22158u;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList f22159v;

    /* renamed from: w  reason: collision with root package name */
    public Iterator f22160w;

    /* renamed from: x  reason: collision with root package name */
    public NotV4RecentModel f22161x;

    /* renamed from: y  reason: collision with root package name */
    public int f22162y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ NotV4DashboardViewModel f22163z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(NotV4DashboardViewModel notV4DashboardViewModel, ls.d<? super e1> dVar) {
        super(2, dVar);
        this.f22163z = notV4DashboardViewModel;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new e1(this.f22163z, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((e1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
        r7 = r7.f10867y;
        r8 = r1.getId();
        kotlin.jvm.internal.i.d(r8);
        r15.f22158u = r6;
        r15.f22159v = r5;
        r15.f22160w = r4;
        r15.f22161x = r1;
        r15.f22162y = 2;
        r7 = r7.b(r8, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a8, code lost:
        if (r7 != r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
        r13 = r0;
        r0 = r15;
        r15 = r7;
        r7 = r6;
        r6 = r5;
        r5 = r4;
        r4 = r1;
        r1 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011b A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00ab -> B:30:0x00b3). Please submit an issue!!! */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        il.r rVar;
        ArrayList arrayList;
        Iterator it;
        e1 e1Var;
        boolean hasNext;
        Long lastAccessedDate;
        String str;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22162y;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    NotV4RecentModel notV4RecentModel = this.f22161x;
                    Iterator it2 = this.f22160w;
                    ArrayList arrayList2 = this.f22159v;
                    il.r rVar2 = this.f22158u;
                    sp.b.d0(obj);
                    il.r rVar3 = rVar2;
                    ArrayList arrayList3 = arrayList2;
                    Iterator it3 = it2;
                    NotV4RecentModel notV4RecentModel2 = notV4RecentModel;
                    ms.a aVar2 = aVar;
                    e1 e1Var2 = this;
                    LearningHubModel learningHubModel = (LearningHubModel) obj;
                    StringBuilder sb2 = new StringBuilder();
                    String str2 = null;
                    if (learningHubModel != null) {
                        str = learningHubModel.getPost_type();
                    } else {
                        str = null;
                    }
                    sb2.append(rVar3.a(str));
                    sb2.append(" • ");
                    if (learningHubModel != null) {
                        str2 = learningHubModel.getDuration();
                    }
                    sb2.append(str2);
                    notV4RecentModel2.setSubText(sb2.toString());
                    arrayList3.add(notV4RecentModel2);
                    e1Var = e1Var2;
                    aVar = aVar2;
                    it = it3;
                    arrayList = arrayList3;
                    rVar = rVar3;
                    while (true) {
                        hasNext = it.hasNext();
                        NotV4DashboardViewModel notV4DashboardViewModel = e1Var.f22163z;
                        if (!hasNext) {
                            NotV4RecentModel notV4RecentModel3 = (NotV4RecentModel) it.next();
                            if (!kotlin.jvm.internal.i.b(notV4RecentModel3.getParentType(), "suggested_activity") && ((lastAccessedDate = notV4RecentModel3.getLastAccessedDate()) == null || lastAccessedDate.longValue() != 0)) {
                                if (kotlin.jvm.internal.i.b(notV4RecentModel3.getItemType(), "resource")) {
                                    break;
                                }
                                notV4RecentModel3.setSubText("Activity");
                                if (kotlin.jvm.internal.i.b(notV4RecentModel3.getItemType(), "mini_course") && kotlin.jvm.internal.i.b(notV4RecentModel3.getParentType(), "top_picks")) {
                                    LogHelper.INSTANCE.i("TAG", "skip");
                                } else {
                                    arrayList.add(notV4RecentModel3);
                                }
                            }
                        } else {
                            ((androidx.lifecycle.w) notV4DashboardViewModel.J.getValue()).i(arrayList);
                            return hs.k.f19476a;
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
            }
        } else {
            sp.b.d0(obj);
            NotV4DashboardViewModel notV4DashboardViewModel2 = this.f22163z;
            notV4DashboardViewModel2.f10867y.getClass();
            kotlinx.coroutines.flow.r c10 = u0.c(notV4DashboardViewModel2.I, 6);
            this.f22162y = 1;
            obj = ta.v.s(c10, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        rVar = new il.r();
        arrayList = new ArrayList();
        it = ((List) obj).iterator();
        e1Var = this;
        while (true) {
            hasNext = it.hasNext();
            NotV4DashboardViewModel notV4DashboardViewModel3 = e1Var.f22163z;
            if (!hasNext) {
            }
        }
    }
}
