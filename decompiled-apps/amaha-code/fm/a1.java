package fm;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.appsflyer.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.core.ValidationPath;
import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.components.goals.model.NotificationGoal;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GoalDateObj;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.StatPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
/* compiled from: GoalMigrationViewModel.kt */
/* loaded from: classes2.dex */
public final class a1 extends androidx.lifecycle.b {
    public final androidx.lifecycle.w<y0> A;
    public final androidx.lifecycle.w<SingleUseEvent<y0>> B;
    public final hs.i C;
    public final hs.i D;
    public ArrayList<Goal> E;
    public final hs.i F;

    /* renamed from: y  reason: collision with root package name */
    public final j1 f15259y;

    /* renamed from: z  reason: collision with root package name */
    public final String f15260z;

    /* compiled from: GoalMigrationViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.GoalMigrationViewModel$checkAndMigrateGoals$1", f = "GoalMigrationViewModel.kt", l = {R.styleable.AppCompatTheme_listPreferredItemHeightLarge, R.styleable.AppCompatTheme_listPreferredItemPaddingLeft}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f15261u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.u f15263w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.u f15264x;

        /* compiled from: GoalMigrationViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.GoalMigrationViewModel$checkAndMigrateGoals$1$1", f = "GoalMigrationViewModel.kt", l = {R.styleable.AppCompatTheme_listPreferredItemPaddingStart, R.styleable.AppCompatTheme_ratingBarStyleIndicator}, m = "invokeSuspend")
        /* renamed from: fm.a1$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0236a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public kotlin.jvm.internal.u f15265u;

            /* renamed from: v  reason: collision with root package name */
            public int f15266v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.u f15267w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ a1 f15268x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.u f15269y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0236a(a1 a1Var, ls.d dVar, kotlin.jvm.internal.u uVar, kotlin.jvm.internal.u uVar2) {
                super(2, dVar);
                this.f15267w = uVar;
                this.f15268x = a1Var;
                this.f15269y = uVar2;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new C0236a(this.f15268x, dVar, this.f15267w, this.f15269y);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((C0236a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            /* JADX WARN: Removed duplicated region for block: B:146:0x0526  */
            /* JADX WARN: Removed duplicated region for block: B:147:0x052d  */
            @Override // ns.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                kotlinx.coroutines.k kVar;
                hs.k kVar2;
                Object s10;
                kotlin.jvm.internal.u uVar;
                ArrayList<Goal> userGoals;
                kotlinx.coroutines.k kVar3;
                String courseName;
                Bundle bundle;
                ms.a aVar;
                kotlin.jvm.internal.u uVar2;
                hs.k kVar4;
                Object s11;
                kotlin.jvm.internal.u uVar3;
                ArrayList<Goal> userGoals2;
                ms.a aVar2;
                Iterator it;
                kotlin.jvm.internal.u uVar4;
                HashMap hashMap;
                ms.a aVar3 = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f15266v;
                int i10 = 499;
                int i11 = 10;
                kotlin.jvm.internal.u uVar5 = this.f15269y;
                a1 a1Var = this.f15268x;
                kotlin.jvm.internal.u uVar6 = this.f15267w;
                int i12 = 2;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            uVar3 = this.f15265u;
                            sp.b.d0(obj);
                            s11 = obj;
                            uVar2 = uVar5;
                            uVar3.f23466u = ((Boolean) s11).booleanValue();
                            if (!uVar2.f23466u) {
                                gk.a.b(null, "goal_migrate_logs_success");
                            } else {
                                gk.a.b(null, "goal_migrate_logs_failure");
                            }
                            return hs.k.f19476a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.jvm.internal.u uVar7 = this.f15265u;
                    sp.b.d0(obj);
                    uVar = uVar7;
                    s10 = obj;
                } else {
                    sp.b.d0(obj);
                    gk.a.b(null, "goal_migrate_tracks_start");
                    j1 j1Var = a1Var.f15259y;
                    this.f15265u = uVar6;
                    this.f15266v = 1;
                    j1Var.getClass();
                    kotlinx.coroutines.k kVar5 = new kotlinx.coroutines.k(1, ca.a.G0(this));
                    kVar5.u();
                    kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
                    User user = FirebasePersistence.getInstance().getUser();
                    if (user != null && (userGoals = user.getUserGoals()) != null) {
                        for (Goal goal : userGoals) {
                            if (!goal.getTrackList().isEmpty()) {
                                ArrayList Y1 = is.u.Y1(goal.getTrackList(), i10);
                                ArrayList arrayList = new ArrayList(is.i.H1(Y1, i11));
                                Iterator it2 = Y1.iterator();
                                while (it2.hasNext()) {
                                    fe.y a10 = FirebaseFirestore.d().a();
                                    for (GoalDateObj goalDateObj : (List) it2.next()) {
                                        Iterator it3 = it2;
                                        if (goal.isVisible() && goalDateObj.getVal() == i12 && (courseName = goal.getCourseName()) != null) {
                                            switch (courseName.hashCode()) {
                                                case -2114782937:
                                                    if (courseName.equals(Constants.COURSE_HAPPINESS)) {
                                                        Long[] lArr = j1Var.f15422b;
                                                        lArr[2] = Long.valueOf(lArr[2].longValue() + 1);
                                                        break;
                                                    } else {
                                                        break;
                                                    }
                                                case -1617042330:
                                                    if (courseName.equals(Constants.COURSE_DEPRESSION)) {
                                                        Long[] lArr2 = j1Var.f15422b;
                                                        lArr2[1] = Long.valueOf(lArr2[1].longValue() + 1);
                                                        break;
                                                    } else {
                                                        break;
                                                    }
                                                case -952207494:
                                                    if (courseName.equals("independent")) {
                                                        Long[] lArr3 = j1Var.f15422b;
                                                        lArr3[6] = Long.valueOf(lArr3[6].longValue() + 1);
                                                        break;
                                                    } else {
                                                        break;
                                                    }
                                                case -891989580:
                                                    if (courseName.equals(Constants.COURSE_STRESS)) {
                                                        Long[] lArr4 = j1Var.f15422b;
                                                        lArr4[4] = Long.valueOf(lArr4[4].longValue() + 1);
                                                        break;
                                                    } else {
                                                        break;
                                                    }
                                                case 92960775:
                                                    if (courseName.equals(Constants.COURSE_ANGER)) {
                                                        Long[] lArr5 = j1Var.f15422b;
                                                        lArr5[0] = Long.valueOf(lArr5[0].longValue() + 1);
                                                        break;
                                                    } else {
                                                        break;
                                                    }
                                                case 109522647:
                                                    if (courseName.equals(Constants.COURSE_SLEEP)) {
                                                        Long[] lArr6 = j1Var.f15422b;
                                                        lArr6[3] = Long.valueOf(lArr6[3].longValue() + 1);
                                                        break;
                                                    } else {
                                                        break;
                                                    }
                                                case 113319009:
                                                    if (courseName.equals(Constants.COURSE_WORRY)) {
                                                        Long[] lArr7 = j1Var.f15422b;
                                                        lArr7[5] = Long.valueOf(lArr7[5].longValue() + 1);
                                                        break;
                                                    } else {
                                                        break;
                                                    }
                                                case 907087443:
                                                    if (courseName.equals(Constants.LIBRARY_GOAL_COURSE)) {
                                                        Long[] lArr8 = j1Var.f15422b;
                                                        lArr8[7] = Long.valueOf(lArr8[7].longValue() + 1);
                                                        break;
                                                    } else {
                                                        break;
                                                    }
                                            }
                                        }
                                        fe.c b10 = FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION);
                                        fd.f fVar = FirebaseAuth.getInstance().f;
                                        kotlin.jvm.internal.i.d(fVar);
                                        a10.b(b10.q(fVar.j0()).b(Constants.USER_GOALS_DATA).q(String.valueOf(goal.getGoalId())).b(Constants.USER_GOALS_TRACK_DATA).q(String.valueOf(goalDateObj.getDate().getTime())), goalDateObj);
                                        it2 = it3;
                                        i12 = 2;
                                    }
                                    arrayList.add(a10);
                                    i12 = 2;
                                }
                                if (arrayList.isEmpty()) {
                                    int i13 = vVar.f23467u + 1;
                                    vVar.f23467u = i13;
                                    if (i13 >= userGoals.size()) {
                                        kVar5.resumeWith(Boolean.TRUE);
                                    }
                                    kVar3 = kVar5;
                                } else {
                                    kVar3 = kVar5;
                                    ta.v.H(kotlin.jvm.internal.h.c(kotlinx.coroutines.o0.f23642c), null, 0, new i1(arrayList, j1Var, vVar, userGoals, kVar3, null), 3);
                                }
                            } else {
                                kVar3 = kVar5;
                                int i14 = vVar.f23467u + 1;
                                vVar.f23467u = i14;
                                if (i14 >= userGoals.size()) {
                                    StatPersistence.INSTANCE.updateGoalTrackCount(j1Var.f15422b);
                                    kVar3.resumeWith(Boolean.TRUE);
                                }
                            }
                            kVar5 = kVar3;
                            i10 = 499;
                            i11 = 10;
                            i12 = 2;
                        }
                        kVar = kVar5;
                        kVar2 = hs.k.f19476a;
                    } else {
                        kVar = kVar5;
                        kVar2 = null;
                    }
                    if (kVar2 == null) {
                        StatPersistence.INSTANCE.updateGoalTrackCount(j1Var.f15422b);
                        kVar.resumeWith(Boolean.TRUE);
                    }
                    s10 = kVar.s();
                    if (s10 == aVar3) {
                        return aVar3;
                    }
                    uVar = uVar6;
                }
                uVar.f23466u = ((Boolean) s10).booleanValue();
                if (uVar6.f23466u) {
                    bundle = null;
                    gk.a.b(null, "goal_migrate_tracks_success");
                } else {
                    bundle = null;
                    gk.a.b(null, "goal_migrate_tracks_failure");
                }
                gk.a.b(bundle, "goal_migrate_logs_start");
                j1 j1Var2 = a1Var.f15259y;
                this.f15265u = uVar5;
                this.f15266v = 2;
                j1Var2.getClass();
                kotlinx.coroutines.k kVar6 = new kotlinx.coroutines.k(1, ca.a.G0(this));
                kVar6.u();
                kotlin.jvm.internal.v vVar2 = new kotlin.jvm.internal.v();
                User user2 = FirebasePersistence.getInstance().getUser();
                if (user2 != null && (userGoals2 = user2.getUserGoals()) != null) {
                    Iterator it4 = userGoals2.iterator();
                    while (it4.hasNext()) {
                        Goal goal2 = (Goal) it4.next();
                        if (!goal2.getData().isEmpty()) {
                            if (goal2.getData().keySet().size() == 1) {
                                Set<String> keySet = goal2.getData().keySet();
                                kotlin.jvm.internal.i.f(keySet, "goal.data.keys");
                                Object f2 = is.u.f2(keySet);
                                kotlin.jvm.internal.i.f(f2, "goal.data.keys.first()");
                                String str = (String) f2;
                                boolean z10 = goal2.getData().get(str) instanceof ArrayList;
                                String str2 = Constants.USER_GOALS_LOGS_DATA;
                                it = it4;
                                if (z10 && !kotlin.jvm.internal.i.b(str, "result_23")) {
                                    Object obj2 = goal2.getData().get(str);
                                    kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                                    ArrayList Y12 = is.u.Y1((ArrayList) obj2, 499);
                                    ArrayList arrayList2 = new ArrayList(is.i.H1(Y12, 10));
                                    Iterator it5 = Y12.iterator();
                                    int i15 = 0;
                                    while (it5.hasNext()) {
                                        fe.y a11 = FirebaseFirestore.d().a();
                                        for (Object obj3 : (List) it5.next()) {
                                            Iterator it6 = it5;
                                            kotlin.jvm.internal.u uVar8 = uVar5;
                                            fe.c b11 = FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION);
                                            ms.a aVar4 = aVar3;
                                            fd.f fVar2 = FirebaseAuth.getInstance().f;
                                            kotlin.jvm.internal.i.d(fVar2);
                                            fe.c b12 = b11.q(fVar2.j0()).b(Constants.USER_GOALS_DATA).q(String.valueOf(goal2.getGoalId())).b(str2);
                                            String str3 = str2;
                                            String format = String.format("%09d", Arrays.copyOf(new Object[]{new Integer(i15)}, 1));
                                            kotlin.jvm.internal.i.f(format, "format(this, *args)");
                                            com.google.firebase.firestore.a q10 = b12.q(format);
                                            i15++;
                                            if (obj3 instanceof String) {
                                                HashMap hashMap2 = new HashMap();
                                                hashMap2.put("value", obj3);
                                                hs.k kVar7 = hs.k.f19476a;
                                                a11.b(q10, hashMap2);
                                            } else {
                                                a11.b(q10, obj3);
                                            }
                                            it5 = it6;
                                            uVar5 = uVar8;
                                            aVar3 = aVar4;
                                            str2 = str3;
                                        }
                                        arrayList2.add(a11);
                                    }
                                    aVar2 = aVar3;
                                    uVar4 = uVar5;
                                    if (arrayList2.isEmpty()) {
                                        int i16 = vVar2.f23467u + 1;
                                        vVar2.f23467u = i16;
                                        if (i16 >= userGoals2.size()) {
                                            kVar6.resumeWith(Boolean.TRUE);
                                        }
                                    } else {
                                        ta.v.H(kotlin.jvm.internal.h.c(kotlinx.coroutines.o0.f23642c), null, 0, new f1(arrayList2, j1Var2, vVar2, userGoals2, kVar6, null), 3);
                                    }
                                } else {
                                    aVar2 = aVar3;
                                    uVar4 = uVar5;
                                    if (kotlin.jvm.internal.i.b(str, "result_23")) {
                                        hashMap = new HashMap();
                                        Object obj4 = goal2.getData().get(str);
                                        kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                                        hashMap.put("list", (ArrayList) obj4);
                                    } else {
                                        Object obj5 = goal2.getData().get(str);
                                        kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type java.util.HashMap<*, *>{ kotlin.collections.TypeAliasesKt.HashMap<*, *> }");
                                        hashMap = (HashMap) obj5;
                                    }
                                    fe.c b13 = FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION);
                                    fd.f fVar3 = FirebaseAuth.getInstance().f;
                                    kotlin.jvm.internal.i.d(fVar3);
                                    fe.c b14 = b13.q(fVar3.j0()).b(Constants.USER_GOALS_DATA).q(String.valueOf(goal2.getGoalId())).b(Constants.USER_GOALS_LOGS_DATA);
                                    String format2 = String.format("%09d", Arrays.copyOf(new Object[]{new Integer(0)}, 1));
                                    kotlin.jvm.internal.i.f(format2, "format(this, *args)");
                                    b14.q(format2).e(hashMap).addOnCompleteListener(new g1(vVar2, userGoals2, kVar6));
                                }
                            } else {
                                aVar2 = aVar3;
                                it = it4;
                                uVar4 = uVar5;
                                kVar6.resumeWith(Boolean.FALSE);
                            }
                        } else {
                            aVar2 = aVar3;
                            it = it4;
                            uVar4 = uVar5;
                            int i17 = vVar2.f23467u + 1;
                            vVar2.f23467u = i17;
                            if (i17 >= userGoals2.size()) {
                                kVar6.resumeWith(Boolean.TRUE);
                            }
                        }
                        it4 = it;
                        uVar5 = uVar4;
                        aVar3 = aVar2;
                    }
                    aVar = aVar3;
                    uVar2 = uVar5;
                    kVar4 = hs.k.f19476a;
                } else {
                    aVar = aVar3;
                    uVar2 = uVar5;
                    kVar4 = null;
                }
                if (kVar4 == null) {
                    kVar6.resumeWith(Boolean.TRUE);
                }
                s11 = kVar6.s();
                ms.a aVar5 = aVar;
                if (s11 == aVar5) {
                    return aVar5;
                }
                uVar3 = uVar2;
                uVar3.f23466u = ((Boolean) s11).booleanValue();
                if (!uVar2.f23466u) {
                }
                return hs.k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ls.d dVar, kotlin.jvm.internal.u uVar, kotlin.jvm.internal.u uVar2) {
            super(2, dVar);
            this.f15263w = uVar;
            this.f15264x = uVar2;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(dVar, this.f15263w, this.f15264x);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x010c A[Catch: Exception -> 0x0123, TryCatch #0 {Exception -> 0x0123, blocks: (B:11:0x0046, B:13:0x004b, B:14:0x005b, B:16:0x0067, B:18:0x006d, B:19:0x0082, B:21:0x0088, B:22:0x009a, B:24:0x00a0, B:27:0x00ee, B:28:0x00f7, B:31:0x0100, B:37:0x010c, B:38:0x0112), top: B:59:0x0046 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0112 A[Catch: Exception -> 0x0123, TRY_LEAVE, TryCatch #0 {Exception -> 0x0123, blocks: (B:11:0x0046, B:13:0x004b, B:14:0x005b, B:16:0x0067, B:18:0x006d, B:19:0x0082, B:21:0x0088, B:22:0x009a, B:24:0x00a0, B:27:0x00ee, B:28:0x00f7, B:31:0x0100, B:37:0x010c, B:38:0x0112), top: B:59:0x0046 }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0136 A[RETURN] */
        @Override // ns.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object b10;
            ArrayList arrayList;
            boolean z10;
            ArrayList<Goal> userGoals;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f15261u;
            y0 y0Var = y0.MIGRATION_FAILURE;
            kotlin.jvm.internal.u uVar = this.f15264x;
            kotlin.jvm.internal.u uVar2 = this.f15263w;
            a1 a1Var = a1.this;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        sp.b.d0(obj);
                        hs.k kVar = hs.k.f19476a;
                        if (!uVar2.f23466u && uVar.f23466u) {
                            wn.b.f36765a.getClass();
                            a1Var.A.i(y0.MIGRATION_SUCCESS);
                            FirebasePersistence.getInstance().getUser().setUserGoals(null);
                            FirebasePersistence.getInstance().updateUserOnFirebase();
                            gk.a.b(null, "goal_migrate_fullprocess_success");
                        } else {
                            wn.b.f36765a.getClass();
                            a1Var.A.i(y0Var);
                        }
                        return hs.k.f19476a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sp.b.d0(obj);
                b10 = obj;
            } else {
                sp.b.d0(obj);
                gk.a.b(null, "goal_migrate_meta_start");
                j1 j1Var = a1Var.f15259y;
                this.f15261u = 1;
                j1Var.getClass();
                ls.h hVar = new ls.h(ca.a.G0(this));
                try {
                    Long[] lArr = new Long[8];
                    int i10 = 0;
                    for (int i11 = 8; i10 < i11; i11 = 8) {
                        lArr[i10] = new Long(0L);
                        i10++;
                    }
                    j1Var.f15422b = lArr;
                    User user = FirebasePersistence.getInstance().getUser();
                    if (user != null && (userGoals = user.getUserGoals()) != null) {
                        ArrayList<List> Y1 = is.u.Y1(userGoals, 499);
                        arrayList = new ArrayList(is.i.H1(Y1, 10));
                        for (List<Goal> list : Y1) {
                            fe.y a10 = FirebaseFirestore.d().a();
                            for (Goal goal : list) {
                                fe.c b11 = FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION);
                                fd.f fVar = FirebaseAuth.getInstance().f;
                                kotlin.jvm.internal.i.d(fVar);
                                com.google.firebase.firestore.a q10 = b11.q(fVar.j0()).b(Constants.USER_GOALS_DATA).q(String.valueOf(goal.getGoalId()));
                                FirestoreGoal b12 = j1.b(goal);
                                Set<String> keySet = goal.getData().keySet();
                                kotlin.jvm.internal.i.f(keySet, "goal.data.keys");
                                String str = (String) is.u.h2(keySet);
                                if (str == null) {
                                    str = "";
                                }
                                b12.setDataTypeKey(str);
                                a10.b(q10, b12);
                            }
                            arrayList.add(a10);
                        }
                    } else {
                        arrayList = null;
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(j1Var.f15421a, e10);
                    hVar.resumeWith(Boolean.FALSE);
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    z10 = false;
                    if (!z10) {
                        hVar.resumeWith(Boolean.TRUE);
                    } else {
                        ta.v.H(kotlin.jvm.internal.h.c(kotlinx.coroutines.o0.f23642c), null, 0, new h1(arrayList, j1Var, hVar, null), 3);
                    }
                    b10 = hVar.b();
                    if (b10 == aVar) {
                        return aVar;
                    }
                }
                z10 = true;
                if (!z10) {
                }
                b10 = hVar.b();
                if (b10 == aVar) {
                }
            }
            if (((Boolean) b10).booleanValue()) {
                gk.a.b(null, "goal_migrate_meta_success");
                ls.f f02 = kc.f.H(a1Var).f0();
                C0236a c0236a = new C0236a(a1Var, null, uVar2, uVar);
                this.f15261u = 2;
                if (ta.v.S(f02, c0236a, this) == aVar) {
                    return aVar;
                }
                hs.k kVar2 = hs.k.f19476a;
                if (!uVar2.f23466u) {
                }
                wn.b.f36765a.getClass();
                a1Var.A.i(y0Var);
                return hs.k.f19476a;
            }
            gk.a.b(null, "goal_migrate_meta_failure");
            wn.b.f36765a.getClass();
            a1Var.A.i(y0Var);
            return hs.k.f19476a;
        }
    }

    /* compiled from: GoalMigrationViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.GoalMigrationViewModel$checkForOldRAMigration$1", f = "GoalMigrationViewModel.kt", l = {165, 174, 184}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public a1 f15270u;

        /* renamed from: v  reason: collision with root package name */
        public List f15271v;

        /* renamed from: w  reason: collision with root package name */
        public int f15272w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f15273x;

        public b(ls.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f15273x = obj;
            return bVar;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        /* JADX WARN: Removed duplicated region for block: B:51:0x0118 A[Catch: Exception -> 0x0139, TryCatch #0 {Exception -> 0x0139, blocks: (B:8:0x0024, B:94:0x01e1, B:96:0x01e5, B:99:0x0201, B:106:0x0249, B:109:0x0250, B:13:0x0039, B:80:0x019f, B:82:0x01a3, B:88:0x01af, B:90:0x01c7, B:16:0x0049, B:49:0x0114, B:51:0x0118, B:54:0x0125, B:19:0x0057, B:21:0x006d, B:23:0x0073, B:30:0x0085, B:32:0x008f, B:34:0x009f, B:35:0x00b9, B:37:0x00bf, B:39:0x00d8, B:41:0x00dd, B:43:0x00e3, B:45:0x00f9, B:57:0x013c, B:59:0x0143, B:61:0x0149, B:67:0x0155, B:69:0x015f, B:71:0x016f, B:73:0x0187, B:76:0x018f, B:100:0x0214, B:102:0x021e, B:105:0x0241, B:104:0x022e), top: B:114:0x0014 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0125 A[Catch: Exception -> 0x0139, TryCatch #0 {Exception -> 0x0139, blocks: (B:8:0x0024, B:94:0x01e1, B:96:0x01e5, B:99:0x0201, B:106:0x0249, B:109:0x0250, B:13:0x0039, B:80:0x019f, B:82:0x01a3, B:88:0x01af, B:90:0x01c7, B:16:0x0049, B:49:0x0114, B:51:0x0118, B:54:0x0125, B:19:0x0057, B:21:0x006d, B:23:0x0073, B:30:0x0085, B:32:0x008f, B:34:0x009f, B:35:0x00b9, B:37:0x00bf, B:39:0x00d8, B:41:0x00dd, B:43:0x00e3, B:45:0x00f9, B:57:0x013c, B:59:0x0143, B:61:0x0149, B:67:0x0155, B:69:0x015f, B:71:0x016f, B:73:0x0187, B:76:0x018f, B:100:0x0214, B:102:0x021e, B:105:0x0241, B:104:0x022e), top: B:114:0x0014 }] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x019c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x019d  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01af A[Catch: Exception -> 0x0139, TryCatch #0 {Exception -> 0x0139, blocks: (B:8:0x0024, B:94:0x01e1, B:96:0x01e5, B:99:0x0201, B:106:0x0249, B:109:0x0250, B:13:0x0039, B:80:0x019f, B:82:0x01a3, B:88:0x01af, B:90:0x01c7, B:16:0x0049, B:49:0x0114, B:51:0x0118, B:54:0x0125, B:19:0x0057, B:21:0x006d, B:23:0x0073, B:30:0x0085, B:32:0x008f, B:34:0x009f, B:35:0x00b9, B:37:0x00bf, B:39:0x00d8, B:41:0x00dd, B:43:0x00e3, B:45:0x00f9, B:57:0x013c, B:59:0x0143, B:61:0x0149, B:67:0x0155, B:69:0x015f, B:71:0x016f, B:73:0x0187, B:76:0x018f, B:100:0x0214, B:102:0x021e, B:105:0x0241, B:104:0x022e), top: B:114:0x0014 }] */
        /* JADX WARN: Removed duplicated region for block: B:90:0x01c7 A[Catch: Exception -> 0x0139, TryCatch #0 {Exception -> 0x0139, blocks: (B:8:0x0024, B:94:0x01e1, B:96:0x01e5, B:99:0x0201, B:106:0x0249, B:109:0x0250, B:13:0x0039, B:80:0x019f, B:82:0x01a3, B:88:0x01af, B:90:0x01c7, B:16:0x0049, B:49:0x0114, B:51:0x0118, B:54:0x0125, B:19:0x0057, B:21:0x006d, B:23:0x0073, B:30:0x0085, B:32:0x008f, B:34:0x009f, B:35:0x00b9, B:37:0x00bf, B:39:0x00d8, B:41:0x00dd, B:43:0x00e3, B:45:0x00f9, B:57:0x013c, B:59:0x0143, B:61:0x0149, B:67:0x0155, B:69:0x015f, B:71:0x016f, B:73:0x0187, B:76:0x018f, B:100:0x0214, B:102:0x021e, B:105:0x0241, B:104:0x022e), top: B:114:0x0014 }] */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01e5 A[Catch: Exception -> 0x0139, TryCatch #0 {Exception -> 0x0139, blocks: (B:8:0x0024, B:94:0x01e1, B:96:0x01e5, B:99:0x0201, B:106:0x0249, B:109:0x0250, B:13:0x0039, B:80:0x019f, B:82:0x01a3, B:88:0x01af, B:90:0x01c7, B:16:0x0049, B:49:0x0114, B:51:0x0118, B:54:0x0125, B:19:0x0057, B:21:0x006d, B:23:0x0073, B:30:0x0085, B:32:0x008f, B:34:0x009f, B:35:0x00b9, B:37:0x00bf, B:39:0x00d8, B:41:0x00dd, B:43:0x00e3, B:45:0x00f9, B:57:0x013c, B:59:0x0143, B:61:0x0149, B:67:0x0155, B:69:0x015f, B:71:0x016f, B:73:0x0187, B:76:0x018f, B:100:0x0214, B:102:0x021e, B:105:0x0241, B:104:0x022e), top: B:114:0x0014 }] */
        /* JADX WARN: Removed duplicated region for block: B:97:0x01fd  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0201 A[Catch: Exception -> 0x0139, TryCatch #0 {Exception -> 0x0139, blocks: (B:8:0x0024, B:94:0x01e1, B:96:0x01e5, B:99:0x0201, B:106:0x0249, B:109:0x0250, B:13:0x0039, B:80:0x019f, B:82:0x01a3, B:88:0x01af, B:90:0x01c7, B:16:0x0049, B:49:0x0114, B:51:0x0118, B:54:0x0125, B:19:0x0057, B:21:0x006d, B:23:0x0073, B:30:0x0085, B:32:0x008f, B:34:0x009f, B:35:0x00b9, B:37:0x00bf, B:39:0x00d8, B:41:0x00dd, B:43:0x00e3, B:45:0x00f9, B:57:0x013c, B:59:0x0143, B:61:0x0149, B:67:0x0155, B:69:0x015f, B:71:0x016f, B:73:0x0187, B:76:0x018f, B:100:0x0214, B:102:0x021e, B:105:0x0241, B:104:0x022e), top: B:114:0x0014 }] */
        @Override // ns.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            hs.k kVar;
            boolean z10;
            boolean z11;
            Object o10;
            kotlinx.coroutines.d0 d0Var;
            a1 a1Var;
            Object b10;
            List list;
            a1 a1Var2;
            hs.f fVar;
            hs.k kVar2;
            List list2;
            boolean z12;
            Object b11;
            List list3;
            hs.f fVar2;
            hs.k kVar3;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f15272w;
            y0 y0Var = y0.MIGRATION_SUCCESS;
            y0 y0Var2 = y0.MIGRATION_FAILURE;
            a1 a1Var3 = a1.this;
            try {
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 == 3) {
                                list3 = this.f15271v;
                                a1Var = this.f15270u;
                                kotlinx.coroutines.d0 d0Var2 = (kotlinx.coroutines.d0) this.f15273x;
                                sp.b.d0(obj);
                                b11 = obj;
                                fVar2 = (hs.f) b11;
                                if (fVar2 == null) {
                                    a1Var.getClass();
                                    ta.v.H(kc.f.H(a1Var), null, 0, new c1((ArrayList) fVar2.f19464u, a1Var, list3, null), 3);
                                    kVar3 = hs.k.f19476a;
                                } else {
                                    kVar3 = null;
                                }
                                if (kVar3 == null) {
                                    UtilsKt.fireAnalytics("old_ra_to_new_ra_migration_fail", new Bundle());
                                    a1Var.B.i(new SingleUseEvent<>(y0Var2));
                                }
                                kVar = hs.k.f19476a;
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            a1Var = this.f15270u;
                            d0Var = (kotlinx.coroutines.d0) this.f15273x;
                            sp.b.d0(obj);
                            o10 = obj;
                            list2 = (List) o10;
                            if (list2 != null && !list2.isEmpty()) {
                                z12 = false;
                                if (!z12) {
                                    a1Var.r(false);
                                    UtilsKt.fireAnalytics("old_ra_to_new_ra_migration_success", new Bundle());
                                    a1Var.B.i(new SingleUseEvent<>(y0Var));
                                    return hs.k.f19476a;
                                }
                                this.f15273x = d0Var;
                                this.f15270u = a1Var;
                                this.f15271v = list2;
                                this.f15272w = 3;
                                b11 = ((dm.f) a1Var.C.getValue()).b(null, this);
                                if (b11 == aVar) {
                                    return aVar;
                                }
                                list3 = list2;
                                fVar2 = (hs.f) b11;
                                if (fVar2 == null) {
                                }
                                if (kVar3 == null) {
                                }
                                kVar = hs.k.f19476a;
                            }
                            z12 = true;
                            if (!z12) {
                            }
                        }
                    } else {
                        list = this.f15271v;
                        a1Var2 = this.f15270u;
                        kotlinx.coroutines.d0 d0Var3 = (kotlinx.coroutines.d0) this.f15273x;
                        sp.b.d0(obj);
                        b10 = obj;
                        fVar = (hs.f) b10;
                        if (fVar == null) {
                            a1.h(a1Var2, (ArrayList) fVar.f19464u, list);
                            kVar2 = hs.k.f19476a;
                        } else {
                            kVar2 = null;
                        }
                        if (kVar2 == null) {
                            UtilsKt.fireAnalytics("old_ra_to_new_ra_migration_fail", new Bundle());
                            a1Var2.B.i(new SingleUseEvent<>(y0Var2));
                        }
                        kVar = hs.k.f19476a;
                    }
                } else {
                    sp.b.d0(obj);
                    kotlinx.coroutines.d0 d0Var4 = (kotlinx.coroutines.d0) this.f15273x;
                    a1Var3.B.i(new SingleUseEvent<>(y0.MIGRATION_IN_PROGRESS));
                    User user = FirebasePersistence.getInstance().getUser();
                    if (user != null) {
                        ArrayList<Goal> userGoals = user.getUserGoals();
                        if (userGoals != null && !userGoals.isEmpty()) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        androidx.lifecycle.w<SingleUseEvent<y0>> wVar = a1Var3.B;
                        if (!z10 && (!user.getAppConfig().containsKey(Constants.DASHBOARD_RA_EXPERIMENT) || kotlin.jvm.internal.i.b(user.getAppConfig().get(Constants.DASHBOARD_RA_EXPERIMENT), Boolean.FALSE))) {
                            UtilsKt.fireAnalytics("old_ra_to_new_ra_migration_start", new Bundle());
                            ArrayList<Goal> userGoals2 = user.getUserGoals();
                            kotlin.jvm.internal.i.f(userGoals2, "user.userGoals");
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : userGoals2) {
                                if (is.k.Q1(((Goal) obj2).getType(), new String[]{"physical_activity", Constants.GOAL_TYPE_RELAXATION_ACTIVITY})) {
                                    arrayList.add(obj2);
                                }
                            }
                            if (arrayList.isEmpty()) {
                                a1Var3.r(false);
                                UtilsKt.fireAnalytics("old_ra_to_new_ra_migration_success", new Bundle());
                                wVar.i(new SingleUseEvent<>(y0Var));
                                return hs.k.f19476a;
                            }
                            this.f15273x = d0Var4;
                            this.f15270u = a1Var3;
                            this.f15271v = arrayList;
                            this.f15272w = 1;
                            b10 = ((dm.f) a1Var3.C.getValue()).b(null, this);
                            if (b10 == aVar) {
                                return aVar;
                            }
                            list = arrayList;
                            a1Var2 = a1Var3;
                            fVar = (hs.f) b10;
                            if (fVar == null) {
                            }
                            if (kVar2 == null) {
                            }
                            kVar = hs.k.f19476a;
                        } else {
                            if (sp.b.K()) {
                                ArrayList<Goal> userGoals3 = user.getUserGoals();
                                if (userGoals3 != null && !userGoals3.isEmpty()) {
                                    z11 = false;
                                    if (z11 && (!user.getAppConfig().containsKey(Constants.DASHBOARD_RA_EXPERIMENT) || kotlin.jvm.internal.i.b(user.getAppConfig().get(Constants.DASHBOARD_RA_EXPERIMENT), Boolean.FALSE))) {
                                        UtilsKt.fireAnalytics("old_ra_to_new_ra_migration_start", new Bundle());
                                        j0 j0Var = (j0) a1Var3.D.getValue();
                                        fd.f fVar3 = FirebaseAuth.getInstance().f;
                                        String str = (fVar3 != null || (str = fVar3.j0()) == null) ? "" : "";
                                        this.f15273x = d0Var4;
                                        this.f15270u = a1Var3;
                                        this.f15272w = 2;
                                        o10 = j0Var.o(str, this);
                                        if (o10 != aVar) {
                                            return aVar;
                                        }
                                        d0Var = d0Var4;
                                        a1Var = a1Var3;
                                        list2 = (List) o10;
                                        if (list2 != null) {
                                            z12 = false;
                                            if (!z12) {
                                            }
                                        }
                                        z12 = true;
                                        if (!z12) {
                                        }
                                    }
                                }
                                z11 = true;
                                if (z11) {
                                    UtilsKt.fireAnalytics("old_ra_to_new_ra_migration_start", new Bundle());
                                    j0 j0Var2 = (j0) a1Var3.D.getValue();
                                    fd.f fVar32 = FirebaseAuth.getInstance().f;
                                    if (fVar32 != null) {
                                    }
                                    this.f15273x = d0Var4;
                                    this.f15270u = a1Var3;
                                    this.f15272w = 2;
                                    o10 = j0Var2.o(str, this);
                                    if (o10 != aVar) {
                                    }
                                }
                            }
                            if (!user.getAppConfig().containsKey(Constants.DASHBOARD_RA_EXPERIMENT) || kotlin.jvm.internal.i.b(user.getAppConfig().get(Constants.DASHBOARD_RA_EXPERIMENT), Boolean.FALSE)) {
                                UtilsKt.fireAnalytics("old_ra_to_new_ra_migration_start", new Bundle());
                                a1Var3.r(false);
                                UtilsKt.fireAnalytics("old_ra_to_new_ra_migration_success", new Bundle());
                            }
                            wVar.i(new SingleUseEvent<>(y0Var));
                            kVar = hs.k.f19476a;
                        }
                    } else {
                        kVar = null;
                    }
                }
                if (kVar == null) {
                    a1Var3.B.i(new SingleUseEvent<>(y0Var2));
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(a1Var3.f15260z, e10);
                UtilsKt.fireAnalytics("old_ra_to_new_ra_migration_fail", new Bundle());
                a1Var3.B.i(new SingleUseEvent<>(y0Var2));
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: GoalMigrationViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<j0> {

        /* renamed from: u  reason: collision with root package name */
        public static final c f15275u = new c();

        public c() {
            super(0);
        }

        @Override // ss.a
        public final j0 invoke() {
            return new j0();
        }
    }

    /* compiled from: GoalMigrationViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<em.d> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Application f15276u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Application application) {
            super(0);
            this.f15276u = application;
        }

        @Override // ss.a
        public final em.d invoke() {
            return new em.d(this.f15276u);
        }
    }

    /* compiled from: GoalMigrationViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.GoalMigrationViewModel$handleSkippingRopeGoals$2$1$2", f = "GoalMigrationViewModel.kt", l = {724, 726}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f15277u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ FirestoreGoal f15279w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(FirestoreGoal firestoreGoal, ls.d<? super e> dVar) {
            super(2, dVar);
            this.f15279w = firestoreGoal;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new e(this.f15279w, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((e) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f15277u;
            a1 a1Var = a1.this;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        sp.b.d0(obj);
                        return hs.k.f19476a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sp.b.d0(obj);
            } else {
                sp.b.d0(obj);
                em.d f = a1.f(a1Var);
                this.f15277u = 1;
                obj = f.c(this.f15279w, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            NotificationGoal notificationGoal = (NotificationGoal) obj;
            if (notificationGoal != null && (!gv.n.B0(notificationGoal.getTitle())) && (!gv.n.B0(notificationGoal.getBody()))) {
                em.d f2 = a1.f(a1Var);
                this.f15277u = 2;
                if (f2.f(notificationGoal, true, this) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: GoalMigrationViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.viewmodel.GoalMigrationViewModel$handleSkippingRopeGoals$2$2", f = "GoalMigrationViewModel.kt", l = {731}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f15280u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ArrayList<String> f15282w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ArrayList<String> arrayList, ls.d<? super f> dVar) {
            super(2, dVar);
            this.f15282w = arrayList;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new f(this.f15282w, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((f) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f15280u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                this.f15280u = 1;
                if (a1.i(a1.this, null, this.f15282w, null, this) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: GoalMigrationViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.a<dm.f> {

        /* renamed from: u  reason: collision with root package name */
        public static final g f15283u = new g();

        public g() {
            super(0);
        }

        @Override // ss.a
        public final dm.f invoke() {
            return new dm.f();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(j1 repository, Application application) {
        super(application);
        kotlin.jvm.internal.i.g(repository, "repository");
        kotlin.jvm.internal.i.g(application, "application");
        this.f15259y = repository;
        this.f15260z = LogHelper.INSTANCE.makeLogTag("GoalMigrationViewModel");
        this.A = new androidx.lifecycle.w<>();
        this.B = new androidx.lifecycle.w<>();
        this.C = sp.b.O(g.f15283u);
        this.D = sp.b.O(c.f15275u);
        this.E = new ArrayList<>();
        this.F = sp.b.O(new d(application));
    }

    public static final j0 e(a1 a1Var) {
        return (j0) a1Var.D.getValue();
    }

    public static final em.d f(a1 a1Var) {
        return (em.d) a1Var.F.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8 A[Catch: Exception -> 0x0100, TryCatch #0 {Exception -> 0x0100, blocks: (B:3:0x0003, B:11:0x001f, B:14:0x0029, B:15:0x003b, B:17:0x0041, B:19:0x004e, B:22:0x005a, B:37:0x0099, B:38:0x00a2, B:40:0x00a8, B:42:0x00b5, B:45:0x00c5, B:23:0x005e, B:26:0x0067, B:27:0x0070, B:29:0x0076, B:31:0x0083, B:34:0x008d, B:35:0x0091, B:46:0x00c9, B:47:0x00db, B:49:0x00e1, B:51:0x00ee, B:54:0x00fa), top: B:60:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList g(a1 a1Var, List list, RecommendedActivityModel recommendedActivityModel) {
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        a1Var.getClass();
        try {
            String goalId = recommendedActivityModel.getGoalId();
            int hashCode = goalId.hashCode();
            if (hashCode != -1670022663) {
                if (hashCode != 294812383) {
                    if (hashCode == 1537088836 && goalId.equals(Constants.ACTIVITY_ID_DEPRESSION_GUIDED_IMAGERY)) {
                        Pattern compile = Pattern.compile("guided-imaery|guided-imagery");
                        kotlin.jvm.internal.i.f(compile, "compile(pattern)");
                        arrayList = new ArrayList();
                        for (Object obj : list) {
                            String goalId2 = ((FirestoreGoal) obj).getGoalId();
                            if (goalId2 != null) {
                                z13 = compile.matcher(goalId2).find();
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                arrayList.add(obj);
                            }
                        }
                    }
                } else if (goalId.equals("stress-guided-massage")) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        String goalId3 = ((FirestoreGoal) obj2).getGoalId();
                        if (goalId3 != null) {
                            z12 = gv.r.J0(goalId3, "gentle-massage");
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            arrayList2.add(obj2);
                        }
                    }
                    return arrayList2;
                }
                arrayList = new ArrayList();
                for (Object obj3 : list) {
                    String goalId4 = ((FirestoreGoal) obj3).getGoalId();
                    if (goalId4 != null) {
                        z11 = gv.r.J0(recommendedActivityModel.getGoalId(), n(goalId4));
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        arrayList.add(obj3);
                    }
                }
            } else {
                if (goalId.equals(Constants.ACTIVITY_ID_ANGER_RUNNING)) {
                    Pattern compile2 = Pattern.compile("running|jogging");
                    kotlin.jvm.internal.i.f(compile2, "compile(pattern)");
                    arrayList = new ArrayList();
                    for (Object obj4 : list) {
                        String goalId5 = ((FirestoreGoal) obj4).getGoalId();
                        if (goalId5 != null) {
                            z10 = compile2.matcher(goalId5).find();
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            arrayList.add(obj4);
                        }
                    }
                }
                arrayList = new ArrayList();
                while (r6.hasNext()) {
                }
            }
            return arrayList;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(a1Var.f15260z, e10);
            UtilsKt.fireAnalytics("old_ra_to_new_ra_migration_fail", new Bundle());
            a1Var.B.i(new SingleUseEvent<>(y0.MIGRATION_FAILURE));
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, com.theinnerhour.b2b.model.Goal] */
    /* JADX WARN: Type inference failed for: r6v6, types: [T, com.theinnerhour.b2b.model.Goal] */
    public static final void h(a1 a1Var, ArrayList arrayList, List list) {
        androidx.lifecycle.w<SingleUseEvent<y0>> wVar = a1Var.B;
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                RecommendedActivityModel recommendedActivityModel = (RecommendedActivityModel) it.next();
                ArrayList<Goal> o10 = a1Var.o(list, recommendedActivityModel);
                if (o10 != null) {
                    if (!o10.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList();
                        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                        ?? goal = new Goal();
                        goal.setGoalId(recommendedActivityModel.getGoalId());
                        goal.setType(recommendedActivityModel.getGoalType());
                        goal.setCourseId(UtilsKt.getCourseId(recommendedActivityModel.getDomain()));
                        goal.setCourseName(recommendedActivityModel.getDomain());
                        goal.setGoalName(recommendedActivityModel.getTitle());
                        xVar.f23469u = goal;
                        HashMap hashMap = new HashMap();
                        for (Goal goal2 : o10) {
                            ?? r62 = (Goal) xVar.f23469u;
                            a1Var.s(r62, goal2);
                            xVar.f23469u = r62;
                            String goalId = goal2.getGoalId();
                            if (goalId != null) {
                                arrayList2.add(goalId);
                            }
                            a1Var.k(goal2.getTrackList(), hashMap);
                        }
                        ((Goal) xVar.f23469u).setTrackList(new ArrayList<>(is.u.D2(new ArrayList(hashMap.values()), new b1())));
                        a1Var.q((Goal) xVar.f23469u, arrayList2);
                    }
                } else {
                    return;
                }
            }
            a1Var.p(list, null);
            a1Var.r(true);
            UtilsKt.fireAnalytics("old_ra_to_new_ra_migration_success", new Bundle());
            wVar.i(new SingleUseEvent<>(y0.MIGRATION_SUCCESS));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(a1Var.f15260z, e10);
            UtilsKt.fireAnalytics("old_ra_to_new_ra_migration_fail", new Bundle());
            wVar.i(new SingleUseEvent<>(y0.MIGRATION_FAILURE));
        }
    }

    public static final Object i(a1 a1Var, FirestoreGoal firestoreGoal, ArrayList arrayList, ArrayList arrayList2, ls.d dVar) {
        String j02;
        a1Var.getClass();
        kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(dVar));
        kVar.u();
        fd.f fVar = FirebaseAuth.getInstance().f;
        if (fVar != null && (j02 = fVar.j0()) != null) {
            ta.v.H(kc.f.H(a1Var), null, 0, new d1(arrayList, firestoreGoal, kVar, a1Var, j02, arrayList2, null), 3);
        } else {
            if (kVar.a()) {
                kVar.resumeWith(Boolean.FALSE);
            }
            hs.k kVar2 = hs.k.f19476a;
        }
        return kVar.s();
    }

    public static final void j(a1 a1Var, FirestoreGoal firestoreGoal, FirestoreGoal firestoreGoal2) {
        a1Var.getClass();
        if (firestoreGoal2 != null) {
            try {
                firestoreGoal.setEndDate(firestoreGoal2.getEndDate());
                firestoreGoal.setSource(firestoreGoal2.getSource());
                if (firestoreGoal.getStartDate().getTime() > firestoreGoal2.getStartDate().getTime()) {
                    firestoreGoal.setStartDate(firestoreGoal2.getStartDate());
                }
                firestoreGoal.setScheduledDate(firestoreGoal2.getScheduledDate());
                if (firestoreGoal2.isVisible()) {
                    firestoreGoal.setVisible(true);
                }
                if (firestoreGoal2.getNotificationScheduled()) {
                    firestoreGoal.setNotificationScheduled(true);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(a1Var.f15260z, e10);
            }
        }
    }

    public static String n(String str) {
        if (gv.n.H0(str, "sleep-")) {
            return gv.r.V0("sleep-", str);
        }
        if (gv.n.H0(str, "happiness-")) {
            return gv.r.V0("happiness-", str);
        }
        if (gv.n.H0(str, "anger-")) {
            return gv.r.V0("anger-", str);
        }
        if (gv.n.H0(str, "stress-")) {
            return gv.r.V0("stress-", str);
        }
        if (gv.n.H0(str, "depression-")) {
            return gv.r.V0("depression-", str);
        }
        return gv.r.V0("worry-", str);
    }

    public final void k(ArrayList arrayList, HashMap hashMap) {
        boolean z10;
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                GoalDateObj goalDateObj = (GoalDateObj) it.next();
                if (!hashMap.containsKey(Long.valueOf(goalDateObj.getDate().getTime()))) {
                    hashMap.put(Long.valueOf(goalDateObj.getDate().getTime()), goalDateObj);
                } else {
                    GoalDateObj goalDateObj2 = (GoalDateObj) hashMap.get(Long.valueOf(goalDateObj.getDate().getTime()));
                    if (goalDateObj2 != null && goalDateObj2.getVal() == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10 && goalDateObj.getVal() == 2) {
                        hashMap.put(Long.valueOf(goalDateObj.getDate().getTime()), goalDateObj);
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15260z, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: Exception -> 0x0057, TryCatch #0 {Exception -> 0x0057, blocks: (B:3:0x0003, B:5:0x0010, B:7:0x0014, B:9:0x0023, B:15:0x002f, B:16:0x0051), top: B:21:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[Catch: Exception -> 0x0057, TRY_LEAVE, TryCatch #0 {Exception -> 0x0057, blocks: (B:3:0x0003, B:5:0x0010, B:7:0x0014, B:9:0x0023, B:15:0x002f, B:16:0x0051), top: B:21:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        boolean z10;
        androidx.lifecycle.w<y0> wVar = this.A;
        try {
            wn.b.f36765a.getClass();
            y0 b10 = wn.b.b();
            y0 y0Var = y0.MIGRATION_IN_PROGRESS;
            if (b10 == y0Var) {
                wVar.l(y0Var);
                return;
            }
            ArrayList<Goal> userGoals = FirebasePersistence.getInstance().getUser().getUserGoals();
            if (userGoals != null && !userGoals.isEmpty()) {
                z10 = false;
                if (z10) {
                    gk.a.b(null, "goal_migrate_fullprocess_start");
                    wVar.l(y0Var);
                    ta.v.H(kc.f.H(this), kotlinx.coroutines.o0.f23642c, 0, new a(null, new kotlin.jvm.internal.u(), new kotlin.jvm.internal.u()), 2);
                    return;
                }
                wVar.l(y0.MIGRATION_SUCCESS);
                return;
            }
            z10 = true;
            if (z10) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15260z, e10);
            gk.a.b(null, "goal_migrate_meta_failure");
            wn.b.f36765a.getClass();
            wVar.i(y0.MIGRATION_FAILURE);
        }
    }

    public final void m() {
        ta.v.H(kc.f.H(this), null, 0, new b(null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5 A[Catch: Exception -> 0x00fc, TryCatch #0 {Exception -> 0x00fc, blocks: (B:2:0x0000, B:10:0x001c, B:13:0x0026, B:14:0x0038, B:16:0x003e, B:18:0x004b, B:21:0x0057, B:36:0x0096, B:37:0x009f, B:39:0x00a5, B:41:0x00b2, B:44:0x00c2, B:22:0x005b, B:25:0x0064, B:26:0x006d, B:28:0x0073, B:30:0x0080, B:33:0x008a, B:34:0x008e, B:45:0x00c6, B:46:0x00d8, B:48:0x00de, B:50:0x00eb, B:53:0x00f7), top: B:59:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList o(List list, RecommendedActivityModel recommendedActivityModel) {
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        try {
            String goalId = recommendedActivityModel.getGoalId();
            int hashCode = goalId.hashCode();
            if (hashCode != -1670022663) {
                if (hashCode != 294812383) {
                    if (hashCode == 1537088836 && goalId.equals(Constants.ACTIVITY_ID_DEPRESSION_GUIDED_IMAGERY)) {
                        Pattern compile = Pattern.compile("guided-imaery|guided-imagery");
                        kotlin.jvm.internal.i.f(compile, "compile(pattern)");
                        arrayList = new ArrayList();
                        for (Object obj : list) {
                            String goalId2 = ((Goal) obj).getGoalId();
                            if (goalId2 != null) {
                                z13 = compile.matcher(goalId2).find();
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                arrayList.add(obj);
                            }
                        }
                    }
                    arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        String goalId3 = ((Goal) obj2).getGoalId();
                        if (goalId3 != null) {
                            z11 = gv.r.J0(recommendedActivityModel.getGoalId(), n(goalId3));
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            arrayList.add(obj2);
                        }
                    }
                } else if (goalId.equals("stress-guided-massage")) {
                    arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        String goalId4 = ((Goal) obj3).getGoalId();
                        if (goalId4 != null) {
                            z12 = gv.r.J0(goalId4, "gentle-massage");
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            arrayList.add(obj3);
                        }
                    }
                } else {
                    arrayList = new ArrayList();
                    while (r6.hasNext()) {
                    }
                }
            } else {
                if (goalId.equals(Constants.ACTIVITY_ID_ANGER_RUNNING)) {
                    Pattern compile2 = Pattern.compile("running|jogging");
                    kotlin.jvm.internal.i.f(compile2, "compile(pattern)");
                    arrayList = new ArrayList();
                    for (Object obj4 : list) {
                        String goalId5 = ((Goal) obj4).getGoalId();
                        if (goalId5 != null) {
                            z10 = compile2.matcher(goalId5).find();
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            arrayList.add(obj4);
                        }
                    }
                }
                arrayList = new ArrayList();
                while (r6.hasNext()) {
                }
            }
            return arrayList;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15260z, e10);
            UtilsKt.fireAnalytics("old_ra_to_new_ra_migration_fail", new Bundle());
            this.B.i(new SingleUseEvent<>(y0.MIGRATION_FAILURE));
            return null;
        }
    }

    public final void p(List<Goal> list, List<FirestoreGoal> list2) {
        boolean z10;
        boolean z11;
        if (list != null) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    String goalId = ((Goal) obj).getGoalId();
                    if (goalId != null) {
                        z10 = gv.r.J0(goalId, "skipping-rope");
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        arrayList.add(obj);
                    }
                }
                ArrayList<String> arrayList2 = new ArrayList<>();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Goal goal = (Goal) it.next();
                    String goalId2 = goal.getGoalId();
                    if (goalId2 != null) {
                        arrayList2.add(goalId2);
                    }
                    Utils utils = Utils.INSTANCE;
                    Context applicationContext = this.f2382x.getApplicationContext();
                    kotlin.jvm.internal.i.f(applicationContext, "getApplication<Application>().applicationContext");
                    long time = goal.getmStartDate().getTime();
                    long time2 = goal.getmScheduleDate().getTime();
                    String type = goal.getType();
                    kotlin.jvm.internal.i.d(type);
                    String goalId3 = goal.getGoalId();
                    kotlin.jvm.internal.i.d(goalId3);
                    String courseName = goal.getCourseName();
                    kotlin.jvm.internal.i.d(courseName);
                    String goalName = goal.getGoalName();
                    kotlin.jvm.internal.i.d(goalName);
                    Utils.updateActivityNotification$default(utils, applicationContext, false, time, time2, type, goalId3, courseName, goalName, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                }
                q(null, arrayList2);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f15260z, e10);
                return;
            }
        }
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list2) {
                String goalId4 = ((FirestoreGoal) obj2).getGoalId();
                if (goalId4 != null) {
                    z11 = gv.r.J0(goalId4, "skipping-rope");
                } else {
                    z11 = false;
                }
                if (z11) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                FirestoreGoal firestoreGoal = (FirestoreGoal) it2.next();
                String goalId5 = firestoreGoal.getGoalId();
                if (goalId5 != null) {
                    arrayList4.add(goalId5);
                }
                ta.v.H(kc.f.H(this), null, 0, new e(firestoreGoal, null), 3);
            }
            ta.v.H(kc.f.H(this), null, 0, new f(arrayList4, null), 3);
        }
    }

    public final void q(Goal goal, ArrayList<String> arrayList) {
        ArrayList<Goal> arrayList2;
        try {
            if (this.E.size() == 0) {
                ArrayList<Goal> userGoals = FirebasePersistence.getInstance().getUser().getUserGoals();
                kotlin.jvm.internal.i.f(userGoals, "getInstance().user.userGoals");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : userGoals) {
                    if (!is.u.Z1(arrayList, ((Goal) obj).getGoalId())) {
                        arrayList3.add(obj);
                    }
                }
                arrayList2 = new ArrayList<>(arrayList3);
            } else {
                ArrayList<Goal> arrayList4 = this.E;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : arrayList4) {
                    if (!is.u.Z1(arrayList, ((Goal) obj2).getGoalId())) {
                        arrayList5.add(obj2);
                    }
                }
                arrayList2 = new ArrayList<>(arrayList5);
            }
            this.E = arrayList2;
            if (goal != null) {
                arrayList2.add(goal);
                Utils utils = Utils.INSTANCE;
                Context applicationContext = this.f2382x.getApplicationContext();
                kotlin.jvm.internal.i.f(applicationContext, "getApplication<Application>().applicationContext");
                boolean notificationScheduled = goal.getNotificationScheduled();
                long time = goal.getmStartDate().getTime();
                long time2 = goal.getmScheduleDate().getTime();
                String type = goal.getType();
                kotlin.jvm.internal.i.d(type);
                String goalId = goal.getGoalId();
                kotlin.jvm.internal.i.d(goalId);
                String courseName = goal.getCourseName();
                kotlin.jvm.internal.i.d(courseName);
                String goalName = goal.getGoalName();
                kotlin.jvm.internal.i.d(goalName);
                Utils.updateActivityNotification$default(utils, applicationContext, notificationScheduled, time, time2, type, goalId, courseName, goalName, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15260z, e10);
        }
    }

    public final void r(boolean z10) {
        HashMap<String, Object> appConfig = FirebasePersistence.getInstance().getUser().getAppConfig();
        kotlin.jvm.internal.i.f(appConfig, "getInstance().user.appConfig");
        appConfig.put(Constants.DASHBOARD_RA_EXPERIMENT, Boolean.TRUE);
        if (z10) {
            FirebasePersistence.getInstance().getUser().setUserGoals(this.E);
        }
        FirebasePersistence.getInstance().updateUserOnFirebase();
    }

    public final void s(Goal goal, Goal goal2) {
        if (goal2 != null) {
            try {
                goal.setEndDate(goal2.getEndDate());
                goal.setSource(goal2.getSource());
                if (goal.getStartDate().getTime() > goal2.getStartDate().getTime()) {
                    goal.setStartDate(goal2.getStartDate());
                }
                goal.setScheduledDate(goal2.getScheduledDate());
                if (goal2.isVisible()) {
                    goal.setVisible(true);
                }
                if (goal.getGoalgamificationList().size() > 0) {
                    goal.setGoalgamificationList(goal2.getGoalgamificationList());
                }
                if (goal2.getNotificationScheduled()) {
                    goal.setNotificationScheduled(true);
                }
                Utils utils = Utils.INSTANCE;
                Context applicationContext = this.f2382x.getApplicationContext();
                kotlin.jvm.internal.i.f(applicationContext, "getApplication<Application>().applicationContext");
                long time = goal2.getmStartDate().getTime();
                long time2 = goal2.getmScheduleDate().getTime();
                String type = goal2.getType();
                kotlin.jvm.internal.i.d(type);
                String goalId = goal2.getGoalId();
                kotlin.jvm.internal.i.d(goalId);
                String courseName = goal2.getCourseName();
                kotlin.jvm.internal.i.d(courseName);
                String goalName = goal2.getGoalName();
                kotlin.jvm.internal.i.d(goalName);
                Utils.updateActivityNotification$default(utils, applicationContext, false, time, time2, type, goalId, courseName, goalName, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f15260z, e10);
            }
        }
    }
}
