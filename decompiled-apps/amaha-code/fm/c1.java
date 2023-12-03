package fm;

import android.os.Bundle;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.components.goals.model.NotificationGoal;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.model.GoalDateObj;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.UtilsKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: GoalMigrationViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.GoalMigrationViewModel$migrateFirestoreRA$1", f = "GoalMigrationViewModel.kt", l = {481, 483, 485, 491}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c1 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
    public Iterator A;
    public Object B;
    public int C;
    public final /* synthetic */ ArrayList<RecommendedActivityModel> D;
    public final /* synthetic */ a1 E;
    public final /* synthetic */ List<FirestoreGoal> F;

    /* renamed from: u  reason: collision with root package name */
    public a1 f15293u;

    /* renamed from: v  reason: collision with root package name */
    public List f15294v;

    /* renamed from: w  reason: collision with root package name */
    public Iterator f15295w;

    /* renamed from: x  reason: collision with root package name */
    public ArrayList f15296x;

    /* renamed from: y  reason: collision with root package name */
    public kotlin.jvm.internal.x f15297y;

    /* renamed from: z  reason: collision with root package name */
    public kotlin.jvm.internal.x f15298z;

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            return sp.b.g(Long.valueOf(((GoalDateObj) t3).getDate().getTime()), Long.valueOf(((GoalDateObj) t10).getDate().getTime()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(ArrayList<RecommendedActivityModel> arrayList, a1 a1Var, List<FirestoreGoal> list, ls.d<? super c1> dVar) {
        super(2, dVar);
        this.D = arrayList;
        this.E = a1Var;
        this.F = list;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new c1(this.D, this.E, this.F, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((c1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1 A[Catch: Exception -> 0x021f, TryCatch #0 {Exception -> 0x021f, blocks: (B:25:0x0099, B:27:0x00a1, B:29:0x00ad, B:31:0x00b0, B:34:0x00b9, B:45:0x0176, B:47:0x017a, B:49:0x0186, B:51:0x0192, B:72:0x0268), top: B:80:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0206 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0221 A[Catch: Exception -> 0x0218, TRY_LEAVE, TryCatch #3 {Exception -> 0x0218, blocks: (B:36:0x012a, B:38:0x0130, B:40:0x0145, B:41:0x0148, B:59:0x0210, B:66:0x0221), top: B:84:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0268 A[Catch: Exception -> 0x021f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x021f, blocks: (B:25:0x0099, B:27:0x00a1, B:29:0x00ad, B:31:0x00b0, B:34:0x00b9, B:45:0x0176, B:47:0x017a, B:49:0x0186, B:51:0x0192, B:72:0x0268), top: B:80:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v5, types: [T, com.theinnerhour.b2b.components.goals.model.FirestoreGoal] */
    /* JADX WARN: Type inference failed for: r5v7, types: [T, com.theinnerhour.b2b.components.goals.model.FirestoreGoal] */
    /* JADX WARN: Type inference failed for: r5v8, types: [T, java.util.HashMap] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00b6 -> B:71:0x0263). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0210 -> B:36:0x012a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x025b -> B:70:0x025e). Please submit an issue!!! */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c1 c1Var;
        a1 a1Var;
        List<FirestoreGoal> list;
        Iterator it;
        c1 c1Var2;
        Iterator it2;
        ArrayList arrayList;
        c1 c1Var3;
        kotlin.jvm.internal.x xVar;
        Iterator it3;
        T t3;
        a1 a1Var2;
        kotlin.jvm.internal.x xVar2;
        kotlin.jvm.internal.x xVar3;
        ArrayList arrayList2;
        Iterator it4;
        List<FirestoreGoal> list2;
        a1 a1Var3;
        FirestoreGoal firestoreGoal;
        kotlin.jvm.internal.x xVar4;
        Iterator it5;
        Object b10;
        Object obj2;
        List<FirestoreGoal> list3;
        Iterator it6;
        ArrayList arrayList3;
        c1 c1Var4;
        kotlin.jvm.internal.x xVar5;
        kotlin.jvm.internal.x xVar6;
        FirestoreGoal firestoreGoal2;
        NotificationGoal notificationGoal;
        em.d f;
        a1 a1Var4;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.C;
        int i10 = 2;
        boolean z10 = true;
        z10 = true;
        try {
        } catch (Exception e10) {
            e = e10;
            c1Var = this;
        }
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 == 4) {
                            it = this.f15295w;
                            List<FirestoreGoal> list4 = this.f15294v;
                            a1 a1Var5 = this.f15293u;
                            sp.b.d0(obj);
                            c1Var2 = this;
                            try {
                                a1 a1Var6 = a1Var5;
                                list = list4;
                                a1Var = a1Var6;
                                a1Var4 = c1Var2.E;
                            } catch (Exception e11) {
                                e = e11;
                                c1Var = c1Var2;
                                LogHelper logHelper = LogHelper.INSTANCE;
                                a1 a1Var7 = c1Var.E;
                                logHelper.e(a1Var7.f15260z, e);
                                UtilsKt.fireAnalytics("old_ra_to_new_ra_migration_fail", new Bundle());
                                a1Var7.B.i(new SingleUseEvent<>(y0.MIGRATION_FAILURE));
                                return hs.k.f19476a;
                            }
                            i10 = 2;
                            z10 = true;
                            if (it.hasNext()) {
                                RecommendedActivityModel recommendedActivityModel = (RecommendedActivityModel) it.next();
                                ArrayList g5 = a1.g(a1Var, list, recommendedActivityModel);
                                if (g5 == null) {
                                    return hs.k.f19476a;
                                }
                                if (!g5.isEmpty()) {
                                    arrayList = new ArrayList();
                                    kotlin.jvm.internal.x xVar7 = new kotlin.jvm.internal.x();
                                    ?? firestoreGoal3 = new FirestoreGoal(null, null, null, null, null, null, null, null, null, false, null, null, false, null, 16383, null);
                                    firestoreGoal3.setGoalId(recommendedActivityModel.getGoalId());
                                    firestoreGoal3.setType(recommendedActivityModel.getGoalType());
                                    firestoreGoal3.setCourseId(UtilsKt.getCourseId(recommendedActivityModel.getDomain()));
                                    firestoreGoal3.setCourseName(recommendedActivityModel.getDomain());
                                    firestoreGoal3.setGoalName(recommendedActivityModel.getTitle());
                                    xVar7.f23469u = firestoreGoal3;
                                    xVar2 = new kotlin.jvm.internal.x();
                                    xVar2.f23469u = new HashMap();
                                    c1Var3 = c1Var2;
                                    xVar = xVar7;
                                    a1 a1Var8 = a1Var;
                                    it3 = g5.iterator();
                                    a1Var2 = a1Var8;
                                    if (it3.hasNext()) {
                                        try {
                                            FirestoreGoal firestoreGoal4 = (FirestoreGoal) it3.next();
                                            ?? r15 = (FirestoreGoal) xVar.f23469u;
                                            a1.j(a1Var2, r15, firestoreGoal4);
                                            xVar.f23469u = r15;
                                            String goalId = firestoreGoal4.getGoalId();
                                            if (goalId != null) {
                                                arrayList.add(goalId);
                                            }
                                            c1Var3.f15293u = a1Var2;
                                            c1Var3.f15294v = list;
                                            c1Var3.f15295w = it;
                                            c1Var3.f15296x = arrayList;
                                            c1Var3.f15297y = xVar;
                                            c1Var3.f15298z = xVar2;
                                            c1Var3.A = it3;
                                            c1Var3.B = firestoreGoal4;
                                            c1Var3.C = z10 ? 1 : 0;
                                            obj2 = ((em.d) a1Var2.F.getValue()).c(firestoreGoal4, c1Var3);
                                            if (obj2 == aVar) {
                                                return aVar;
                                            }
                                            try {
                                                it6 = it;
                                                firestoreGoal2 = firestoreGoal4;
                                                List<FirestoreGoal> list5 = list;
                                                xVar5 = xVar2;
                                                xVar6 = xVar;
                                                c1Var4 = c1Var3;
                                                arrayList3 = arrayList;
                                                list3 = list5;
                                                notificationGoal = (NotificationGoal) obj2;
                                                if (notificationGoal != null && (!gv.n.B0(notificationGoal.getTitle())) && (!gv.n.B0(notificationGoal.getBody()))) {
                                                    f = a1.f(a1Var2);
                                                    c1Var4.f15293u = a1Var2;
                                                    c1Var4.f15294v = list3;
                                                    c1Var4.f15295w = it6;
                                                    c1Var4.f15296x = arrayList3;
                                                    c1Var4.f15297y = xVar6;
                                                    c1Var4.f15298z = xVar5;
                                                    c1Var4.A = it3;
                                                    c1Var4.B = firestoreGoal2;
                                                    c1Var4.C = i10;
                                                    if (f.f(notificationGoal, z10, c1Var4) == aVar) {
                                                        return aVar;
                                                    }
                                                }
                                                HashMap hashMap = (HashMap) xVar3.f23469u;
                                                c1Var.f15293u = a1Var3;
                                                c1Var.f15294v = list2;
                                                c1Var.f15295w = it4;
                                                c1Var.f15296x = arrayList2;
                                                c1Var.f15297y = xVar4;
                                                c1Var.f15298z = xVar3;
                                                c1Var.A = it5;
                                                c1Var.B = xVar3;
                                                c1Var.C = 3;
                                                a1Var3.getClass();
                                                ls.h hVar = new ls.h(ca.a.G0(c1Var));
                                                a1 a1Var9 = a1Var3;
                                                List<FirestoreGoal> list6 = list2;
                                                it2 = it4;
                                                ta.v.H(kc.f.H(a1Var3), null, 0, new z0(a1Var3, firestoreGoal, hVar, hashMap, null), 3);
                                                b10 = hVar.b();
                                                if (b10 == aVar) {
                                                    return aVar;
                                                }
                                                it3 = it5;
                                                c1Var3 = c1Var;
                                                xVar = xVar4;
                                                arrayList = arrayList2;
                                                a1Var2 = a1Var9;
                                                list = list6;
                                                xVar2 = xVar3;
                                                t3 = b10;
                                                xVar3.f23469u = t3;
                                                it = it2;
                                                i10 = 2;
                                                z10 = true;
                                                if (it3.hasNext()) {
                                                    ArrayList arrayList4 = new ArrayList(is.u.D2(new ArrayList(((HashMap) xVar2.f23469u).values()), new a()));
                                                    c1Var3.f15293u = a1Var2;
                                                    c1Var3.f15294v = list;
                                                    c1Var3.f15295w = it;
                                                    c1Var3.f15296x = null;
                                                    c1Var3.f15297y = null;
                                                    c1Var3.f15298z = null;
                                                    c1Var3.A = null;
                                                    c1Var3.B = null;
                                                    c1Var3.C = 4;
                                                    if (a1.i(a1Var2, (FirestoreGoal) xVar.f23469u, arrayList, arrayList4, c1Var3) == aVar) {
                                                        return aVar;
                                                    }
                                                    list4 = list;
                                                    c1Var2 = c1Var3;
                                                    a1Var5 = a1Var2;
                                                    a1 a1Var62 = a1Var5;
                                                    list = list4;
                                                    a1Var = a1Var62;
                                                    i10 = 2;
                                                    z10 = true;
                                                    a1Var4 = c1Var2.E;
                                                    if (it.hasNext()) {
                                                    }
                                                }
                                            } catch (Exception e12) {
                                                e = e12;
                                                LogHelper logHelper2 = LogHelper.INSTANCE;
                                                a1 a1Var72 = c1Var.E;
                                                logHelper2.e(a1Var72.f15260z, e);
                                                UtilsKt.fireAnalytics("old_ra_to_new_ra_migration_fail", new Bundle());
                                                a1Var72.B.i(new SingleUseEvent<>(y0.MIGRATION_FAILURE));
                                                return hs.k.f19476a;
                                            }
                                            c1Var = c1Var4;
                                            arrayList2 = arrayList3;
                                            firestoreGoal = firestoreGoal2;
                                            a1Var3 = a1Var2;
                                            xVar3 = xVar5;
                                            xVar4 = xVar6;
                                            it5 = it3;
                                            List<FirestoreGoal> list7 = list3;
                                            it4 = it6;
                                            list2 = list7;
                                        } catch (Exception e13) {
                                            e = e13;
                                            c1Var2 = c1Var3;
                                            c1Var = c1Var2;
                                            LogHelper logHelper22 = LogHelper.INSTANCE;
                                            a1 a1Var722 = c1Var.E;
                                            logHelper22.e(a1Var722.f15260z, e);
                                            UtilsKt.fireAnalytics("old_ra_to_new_ra_migration_fail", new Bundle());
                                            a1Var722.B.i(new SingleUseEvent<>(y0.MIGRATION_FAILURE));
                                            return hs.k.f19476a;
                                        }
                                    }
                                } else {
                                    i10 = 2;
                                    z10 = true;
                                    a1Var4 = c1Var2.E;
                                    if (it.hasNext()) {
                                    }
                                }
                            } else {
                                a1Var4.p(null, c1Var2.F);
                                a1Var4.r(false);
                                UtilsKt.fireAnalytics("old_ra_to_new_ra_migration_success", new Bundle());
                                a1Var4.B.i(new SingleUseEvent<>(y0.MIGRATION_SUCCESS));
                                return hs.k.f19476a;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        xVar3 = (kotlin.jvm.internal.x) this.B;
                        it3 = this.A;
                        kotlin.jvm.internal.x xVar8 = this.f15298z;
                        xVar = this.f15297y;
                        ArrayList arrayList5 = this.f15296x;
                        Iterator it7 = this.f15295w;
                        List<FirestoreGoal> list8 = this.f15294v;
                        a1 a1Var10 = this.f15293u;
                        sp.b.d0(obj);
                        t3 = obj;
                        xVar2 = xVar8;
                        it2 = it7;
                        list = list8;
                        a1Var2 = a1Var10;
                        arrayList = arrayList5;
                        c1Var3 = this;
                        xVar3.f23469u = t3;
                        it = it2;
                        i10 = 2;
                        z10 = true;
                        if (it3.hasNext()) {
                        }
                    }
                } else {
                    FirestoreGoal firestoreGoal5 = (FirestoreGoal) this.B;
                    Iterator it8 = this.A;
                    kotlin.jvm.internal.x xVar9 = this.f15298z;
                    kotlin.jvm.internal.x xVar10 = this.f15297y;
                    ArrayList arrayList6 = this.f15296x;
                    Iterator it9 = this.f15295w;
                    List<FirestoreGoal> list9 = this.f15294v;
                    a1 a1Var11 = this.f15293u;
                    sp.b.d0(obj);
                    c1Var = this;
                    it5 = it8;
                    xVar4 = xVar10;
                    firestoreGoal = firestoreGoal5;
                    xVar3 = xVar9;
                    arrayList2 = arrayList6;
                    a1Var3 = a1Var11;
                    it4 = it9;
                    list2 = list9;
                    HashMap hashMap2 = (HashMap) xVar3.f23469u;
                    c1Var.f15293u = a1Var3;
                    c1Var.f15294v = list2;
                    c1Var.f15295w = it4;
                    c1Var.f15296x = arrayList2;
                    c1Var.f15297y = xVar4;
                    c1Var.f15298z = xVar3;
                    c1Var.A = it5;
                    c1Var.B = xVar3;
                    c1Var.C = 3;
                    a1Var3.getClass();
                    ls.h hVar2 = new ls.h(ca.a.G0(c1Var));
                    a1 a1Var92 = a1Var3;
                    List<FirestoreGoal> list62 = list2;
                    it2 = it4;
                    ta.v.H(kc.f.H(a1Var3), null, 0, new z0(a1Var3, firestoreGoal, hVar2, hashMap2, null), 3);
                    b10 = hVar2.b();
                    if (b10 == aVar) {
                    }
                }
            } else {
                firestoreGoal2 = (FirestoreGoal) this.B;
                it3 = this.A;
                xVar5 = this.f15298z;
                kotlin.jvm.internal.x xVar11 = this.f15297y;
                arrayList3 = this.f15296x;
                it6 = this.f15295w;
                list3 = this.f15294v;
                a1 a1Var12 = this.f15293u;
                sp.b.d0(obj);
                xVar6 = xVar11;
                a1Var2 = a1Var12;
                obj2 = obj;
                c1Var4 = this;
                notificationGoal = (NotificationGoal) obj2;
                if (notificationGoal != null) {
                    f = a1.f(a1Var2);
                    c1Var4.f15293u = a1Var2;
                    c1Var4.f15294v = list3;
                    c1Var4.f15295w = it6;
                    c1Var4.f15296x = arrayList3;
                    c1Var4.f15297y = xVar6;
                    c1Var4.f15298z = xVar5;
                    c1Var4.A = it3;
                    c1Var4.B = firestoreGoal2;
                    c1Var4.C = i10;
                    if (f.f(notificationGoal, z10, c1Var4) == aVar) {
                    }
                }
                c1Var = c1Var4;
                arrayList2 = arrayList3;
                firestoreGoal = firestoreGoal2;
                a1Var3 = a1Var2;
                xVar3 = xVar5;
                xVar4 = xVar6;
                it5 = it3;
                List<FirestoreGoal> list72 = list3;
                it4 = it6;
                list2 = list72;
                HashMap hashMap22 = (HashMap) xVar3.f23469u;
                c1Var.f15293u = a1Var3;
                c1Var.f15294v = list2;
                c1Var.f15295w = it4;
                c1Var.f15296x = arrayList2;
                c1Var.f15297y = xVar4;
                c1Var.f15298z = xVar3;
                c1Var.A = it5;
                c1Var.B = xVar3;
                c1Var.C = 3;
                a1Var3.getClass();
                ls.h hVar22 = new ls.h(ca.a.G0(c1Var));
                a1 a1Var922 = a1Var3;
                List<FirestoreGoal> list622 = list2;
                it2 = it4;
                ta.v.H(kc.f.H(a1Var3), null, 0, new z0(a1Var3, firestoreGoal, hVar22, hashMap22, null), 3);
                b10 = hVar22.b();
                if (b10 == aVar) {
                }
            }
        } else {
            sp.b.d0(obj);
            ArrayList<RecommendedActivityModel> arrayList7 = this.D;
            a1Var = this.E;
            list = this.F;
            it = arrayList7.iterator();
            c1Var2 = this;
            a1Var4 = c1Var2.E;
            if (it.hasNext()) {
            }
        }
    }
}
