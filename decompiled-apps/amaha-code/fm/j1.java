package fm;

import at.l;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.CustomDate;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: GoalMigrationViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class j1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f15421a = LogHelper.INSTANCE.makeLogTag("GoalMigrationViewModelRepository");

    /* renamed from: b  reason: collision with root package name */
    public Long[] f15422b;

    /* compiled from: GoalMigrationViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends kotlin.jvm.internal.g implements ss.f<String, String, String, String, String, CustomDate, CustomDate, CustomDate, CustomDate, Boolean, String, String, Boolean, String, FirestoreGoal> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f15423u = new a();

        public a() {
            super(14, FirestoreGoal.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/theinnerhour/b2b/model/CustomDate;Lcom/theinnerhour/b2b/model/CustomDate;Lcom/theinnerhour/b2b/model/CustomDate;Lcom/theinnerhour/b2b/model/CustomDate;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", 0);
        }
    }

    public j1() {
        Long[] lArr = new Long[8];
        for (int i6 = 0; i6 < 8; i6++) {
            lArr[i6] = 0L;
        }
        this.f15422b = lArr;
    }

    public static final Object a(j1 j1Var, fe.y yVar, ls.d dVar) {
        j1Var.getClass();
        ls.h hVar = new ls.h(ca.a.G0(dVar));
        try {
            yVar.a().addOnCompleteListener(new e1(hVar));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(j1Var.f15421a, e10);
        }
        return hVar.b();
    }

    public static FirestoreGoal b(Goal goal) {
        Object obj;
        boolean z10;
        a aVar = a.f15423u;
        ys.d a10 = kotlin.jvm.internal.y.a(Goal.class);
        kotlin.jvm.internal.i.g(a10, "<this>");
        at.l<T>.a invoke = ((at.l) a10).f3542w.invoke();
        invoke.getClass();
        ys.m<Object> mVar = l.a.f3543l[14];
        Object invoke2 = invoke.f3550j.invoke();
        kotlin.jvm.internal.i.f(invoke2, "<get-allNonStaticMembers>(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Collection) invoke2) {
            at.e eVar = (at.e) obj2;
            boolean z11 = false;
            if (eVar.t().k0() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((!z10) && (eVar instanceof ys.l)) {
                z11 = true;
            }
            if (z11) {
                arrayList.add(obj2);
            }
        }
        int P = sp.b.P(is.i.H1(arrayList, 10));
        int i6 = 16;
        if (P < 16) {
            P = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(P);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(((ys.l) next).getName(), next);
        }
        List<ys.j> parameters = aVar.getParameters();
        int P2 = sp.b.P(is.i.H1(parameters, 10));
        if (P2 >= 16) {
            i6 = P2;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i6);
        for (Object obj3 : parameters) {
            ys.l lVar = (ys.l) linkedHashMap.get(((ys.j) obj3).getName());
            if (lVar != null) {
                obj = lVar.get(goal);
            } else {
                obj = null;
            }
            linkedHashMap2.put(obj3, obj);
        }
        return (FirestoreGoal) aVar.callBy(linkedHashMap2);
    }
}
