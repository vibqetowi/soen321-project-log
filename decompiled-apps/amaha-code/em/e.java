package em;

import com.appsflyer.R;
import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.components.goals.model.NotificationGoal;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GoalNotificationContent;
import com.theinnerhour.b2b.persistence.GoalsNotificationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Utils;
import fe.q;
import fe.r;
import hs.f;
import hs.k;
import is.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.d0;
import ns.i;
import ss.p;
import ya.v;
/* compiled from: GoalsNotificationUtils.kt */
@ns.e(c = "com.theinnerhour.b2b.components.goals.utils.GoalsNotificationUtils$getNotificationsForUserGoals$2$3", f = "GoalsNotificationUtils.kt", l = {R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 141, 181, 224}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class e extends i implements p<d0, ls.d<? super k>, Object> {
    public final /* synthetic */ ArrayList<Goal> A;
    public final /* synthetic */ ArrayList<Goal> B;
    public final /* synthetic */ ArrayList<Goal> C;
    public final /* synthetic */ ArrayList<Goal> D;
    public final /* synthetic */ ArrayList<Goal> E;
    public final /* synthetic */ ls.d<List<NotificationGoal>> F;
    public final /* synthetic */ d G;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList f14413u;

    /* renamed from: v  reason: collision with root package name */
    public d f14414v;

    /* renamed from: w  reason: collision with root package name */
    public Iterator f14415w;

    /* renamed from: x  reason: collision with root package name */
    public Goal f14416x;

    /* renamed from: y  reason: collision with root package name */
    public int f14417y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ArrayList<Goal> f14418z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(ArrayList<Goal> arrayList, ArrayList<Goal> arrayList2, ArrayList<Goal> arrayList3, ArrayList<Goal> arrayList4, ArrayList<Goal> arrayList5, ArrayList<Goal> arrayList6, ls.d<? super List<NotificationGoal>> dVar, d dVar2, ls.d<? super e> dVar3) {
        super(2, dVar3);
        this.f14418z = arrayList;
        this.A = arrayList2;
        this.B = arrayList3;
        this.C = arrayList4;
        this.D = arrayList5;
        this.E = arrayList6;
        this.F = dVar;
        this.G = dVar2;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new e(this.f14418z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((e) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0405 A[EDGE_INSN: B:227:0x0405->B:161:0x0405 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0220  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x0305 -> B:122:0x030a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:170:0x043a -> B:171:0x043f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0093 -> B:87:0x021c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0141 -> B:48:0x0143). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0187 -> B:87:0x021c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01c0 -> B:71:0x01c6). Please submit an issue!!! */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d dVar;
        Iterator it;
        ArrayList arrayList;
        e eVar;
        Object obj2;
        ArrayList arrayList2;
        e eVar2;
        Goal goal;
        r rVar;
        RecommendedActivityModel recommendedActivityModel;
        e eVar3;
        String str;
        String str2;
        String str3;
        q qVar;
        d dVar2;
        Iterator it2;
        d dVar3;
        ArrayList arrayList3;
        ms.a aVar;
        String str4;
        String str5;
        String str6;
        GoalNotificationContent goalNotificationContent;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        Iterator<T> it3;
        boolean hasNext;
        d dVar4;
        d dVar5;
        ArrayList arrayList4;
        Iterator it4;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        e eVar4 = this;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        int i6 = eVar4.f14417y;
        int i10 = 1;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 == 4) {
                            Goal goal2 = eVar4.f14416x;
                            it4 = eVar4.f14415w;
                            dVar5 = eVar4.f14414v;
                            arrayList4 = eVar4.f14413u;
                            sp.b.d0(obj);
                            Object a10 = obj;
                            f fVar = (f) a10;
                            if (fVar != null) {
                                String goalId = goal2.getGoalId();
                                kotlin.jvm.internal.i.d(goalId);
                                String goalName = goal2.getGoalName();
                                if (goalName == null) {
                                    str22 = "";
                                } else {
                                    str22 = goalName;
                                }
                                String type = goal2.getType();
                                if (type == null) {
                                    str23 = "";
                                } else {
                                    str23 = type;
                                }
                                String courseName = goal2.getCourseName();
                                if (courseName == null) {
                                    str24 = "";
                                } else {
                                    str24 = courseName;
                                }
                                arrayList4.add(new NotificationGoal(goalId, str22, str23, str24, (String) fVar.f19464u, (String) fVar.f19465v, goal2.getScheduledDate().getTime() * 1000, GoalsNotificationPersistence.GOALS_NOTIF_ACTIVITY));
                            }
                            eVar = eVar4;
                            while (it4.hasNext()) {
                                Goal goal3 = (Goal) it4.next();
                                if (goal3.getGoalId() != null) {
                                    String goalId2 = goal3.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId2);
                                    eVar.f14413u = arrayList4;
                                    eVar.f14414v = dVar5;
                                    eVar.f14415w = it4;
                                    eVar.f14416x = goal3;
                                    eVar.f14417y = 4;
                                    a10 = d.a(dVar5, goalId2, eVar);
                                    if (a10 == aVar2) {
                                        return aVar2;
                                    }
                                    e eVar5 = eVar;
                                    goal2 = goal3;
                                    eVar4 = eVar5;
                                    f fVar2 = (f) a10;
                                    if (fVar2 != null) {
                                    }
                                    eVar = eVar4;
                                    while (it4.hasNext()) {
                                    }
                                }
                            }
                            for (Goal goal4 : eVar.E) {
                                if (goal4.getGoalId() != null) {
                                    String goalId3 = goal4.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId3);
                                    if (goalId3.length() >= 7) {
                                        String goalId4 = goal4.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId4);
                                        String substring = goalId4.substring(0, 7);
                                        kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                        if (kotlin.jvm.internal.i.b(substring, "custom_")) {
                                            String goalId5 = goal4.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId5);
                                            String goalName2 = goal4.getGoalName();
                                            if (goalName2 == null) {
                                                str19 = "";
                                            } else {
                                                str19 = goalName2;
                                            }
                                            String type2 = goal4.getType();
                                            if (type2 == null) {
                                                str20 = "";
                                            } else {
                                                str20 = type2;
                                            }
                                            String courseName2 = goal4.getCourseName();
                                            if (courseName2 == null) {
                                                str21 = "";
                                            } else {
                                                str21 = courseName2;
                                            }
                                            d dVar6 = eVar.G;
                                            String string = dVar6.f14407a.getString(com.theinnerhour.b2b.R.string.customGoalNotifiationHeader);
                                            kotlin.jvm.internal.i.f(string, "context.getString(R.stri…tomGoalNotifiationHeader)");
                                            String goalName3 = goal4.getGoalName();
                                            kotlin.jvm.internal.i.d(goalName3);
                                            String string2 = dVar6.f14407a.getString(com.theinnerhour.b2b.R.string.customGoalNotifiationBody, goalName3);
                                            kotlin.jvm.internal.i.f(string2, "context.getString(R.stri…ionBody, goal.goalName!!)");
                                            arrayList4.add(new NotificationGoal(goalId5, str19, str20, str21, string, string2, goal4.getScheduledDate().getTime() * 1000, GoalsNotificationPersistence.GOALS_NOTIF_RA));
                                        }
                                    }
                                }
                            }
                            eVar.F.resumeWith(arrayList4);
                            return k.f19476a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Goal goal5 = eVar4.f14416x;
                    it2 = eVar4.f14415w;
                    dVar3 = eVar4.f14414v;
                    arrayList3 = eVar4.f14413u;
                    sp.b.d0(obj);
                    Object a11 = obj;
                    f fVar3 = (f) a11;
                    if (fVar3 != null) {
                        String goalId6 = goal5.getGoalId();
                        kotlin.jvm.internal.i.d(goalId6);
                        String goalName4 = goal5.getGoalName();
                        if (goalName4 == null) {
                            str16 = "";
                        } else {
                            str16 = goalName4;
                        }
                        String type3 = goal5.getType();
                        if (type3 == null) {
                            str17 = "";
                        } else {
                            str17 = type3;
                        }
                        String courseName3 = goal5.getCourseName();
                        if (courseName3 == null) {
                            str18 = "";
                        } else {
                            str18 = courseName3;
                        }
                        arrayList3.add(new NotificationGoal(goalId6, str16, str17, str18, (String) fVar3.f19464u, (String) fVar3.f19465v, goal5.getScheduledDate().getTime() * 1000, GoalsNotificationPersistence.GOALS_NOTIF_ACTIVITY));
                    }
                    eVar = eVar4;
                    while (it2.hasNext()) {
                        Goal goal6 = (Goal) it2.next();
                        if (goal6.getGoalId() != null) {
                            String goalId7 = goal6.getGoalId();
                            kotlin.jvm.internal.i.d(goalId7);
                            eVar.f14413u = arrayList3;
                            eVar.f14414v = dVar3;
                            eVar.f14415w = it2;
                            eVar.f14416x = goal6;
                            eVar.f14417y = 3;
                            a11 = d.a(dVar3, goalId7, eVar);
                            if (a11 == aVar2) {
                                return aVar2;
                            }
                            e eVar6 = eVar;
                            goal5 = goal6;
                            eVar4 = eVar6;
                            f fVar32 = (f) a11;
                            if (fVar32 != null) {
                            }
                            eVar = eVar4;
                            while (it2.hasNext()) {
                            }
                        }
                    }
                    it3 = eVar.C.iterator();
                    while (true) {
                        hasNext = it3.hasNext();
                        dVar4 = eVar.G;
                        if (hasNext) {
                            break;
                        }
                        Goal goal7 = (Goal) it3.next();
                        if (goal7.getGoalId() != null) {
                            String goalId8 = goal7.getGoalId();
                            kotlin.jvm.internal.i.d(goalId8);
                            if (goalId8.length() >= 7) {
                                String goalId9 = goal7.getGoalId();
                                kotlin.jvm.internal.i.d(goalId9);
                                String substring2 = goalId9.substring(0, 7);
                                kotlin.jvm.internal.i.f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                if (kotlin.jvm.internal.i.b(substring2, "custom_")) {
                                    String goalId10 = goal7.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId10);
                                    String goalName5 = goal7.getGoalName();
                                    if (goalName5 == null) {
                                        str13 = "";
                                    } else {
                                        str13 = goalName5;
                                    }
                                    String type4 = goal7.getType();
                                    if (type4 == null) {
                                        str14 = "";
                                    } else {
                                        str14 = type4;
                                    }
                                    String courseName4 = goal7.getCourseName();
                                    if (courseName4 == null) {
                                        str15 = "";
                                    } else {
                                        str15 = courseName4;
                                    }
                                    String string3 = dVar4.f14407a.getString(com.theinnerhour.b2b.R.string.customGoalNotifiationHeader);
                                    kotlin.jvm.internal.i.f(string3, "context.getString(R.stri…tomGoalNotifiationHeader)");
                                    String goalName6 = goal7.getGoalName();
                                    kotlin.jvm.internal.i.d(goalName6);
                                    String string4 = dVar4.f14407a.getString(com.theinnerhour.b2b.R.string.customGoalNotifiationBody, goalName6);
                                    kotlin.jvm.internal.i.f(string4, "context.getString(R.stri…ionBody, goal.goalName!!)");
                                    arrayList3.add(new NotificationGoal(goalId10, str13, str14, str15, string3, string4, goal7.getScheduledDate().getTime() * 1000, GoalsNotificationPersistence.GOALS_NOTIF_RA));
                                }
                            }
                        }
                    }
                    dVar5 = dVar4;
                    arrayList4 = arrayList3;
                    it4 = eVar.D.iterator();
                    while (it4.hasNext()) {
                    }
                    while (r0.hasNext()) {
                    }
                    eVar.F.resumeWith(arrayList4);
                    return k.f19476a;
                }
                Goal goal8 = eVar4.f14416x;
                it = eVar4.f14415w;
                dVar = eVar4.f14414v;
                ArrayList arrayList5 = eVar4.f14413u;
                sp.b.d0(obj);
                Object a12 = obj;
                arrayList2 = arrayList5;
                e eVar7 = eVar4;
                f fVar4 = (f) a12;
                if (fVar4 != null) {
                    String goalId11 = goal8.getGoalId();
                    kotlin.jvm.internal.i.d(goalId11);
                    String goalName7 = goal8.getGoalName();
                    if (goalName7 == null) {
                        str10 = "";
                    } else {
                        str10 = goalName7;
                    }
                    String type5 = goal8.getType();
                    if (type5 == null) {
                        str11 = "";
                    } else {
                        str11 = type5;
                    }
                    String courseName5 = goal8.getCourseName();
                    if (courseName5 == null) {
                        str12 = "";
                    } else {
                        str12 = courseName5;
                    }
                    arrayList2.add(new NotificationGoal(goalId11, str10, str11, str12, (String) fVar4.f19464u, (String) fVar4.f19465v, goal8.getScheduledDate().getTime() * 1000, GoalsNotificationPersistence.GOALS_NOTIF_ACTIVITY));
                }
                eVar = eVar7;
                arrayList = arrayList2;
                i10 = 1;
                if (!it.hasNext()) {
                    Goal goal9 = (Goal) it.next();
                    if (goal9.getGoalId() != null) {
                        if (is.k.Q1(goal9.getType(), new String[]{Constants.GOAL_TYPE_RELAXATION_ACTIVITY, "physical_activity"})) {
                            v a13 = FirebaseFirestore.d().b("recommended_activity_data").m(goal9.getGoalId(), Constants.GOAL_ID).a();
                            kotlin.jvm.internal.i.f(a13, "getInstance().collection…                   .get()");
                            eVar.f14413u = arrayList;
                            eVar.f14414v = dVar;
                            eVar.f14415w = it;
                            eVar.f14416x = goal9;
                            eVar.f14417y = i10;
                            obj2 = tr.r.g(a13, eVar);
                            if (obj2 == aVar2) {
                                return aVar2;
                            }
                            ArrayList arrayList6 = arrayList;
                            eVar2 = eVar;
                            goal = goal9;
                            arrayList2 = arrayList6;
                            rVar = (r) obj2;
                            if (rVar == null && (qVar = (q) u.h2(rVar)) != null) {
                                recommendedActivityModel = (RecommendedActivityModel) qVar.d(RecommendedActivityModel.class);
                            } else {
                                recommendedActivityModel = null;
                            }
                            if (recommendedActivityModel == null) {
                                String goalId12 = goal.getGoalId();
                                kotlin.jvm.internal.i.d(goalId12);
                                String goalName8 = goal.getGoalName();
                                if (goalName8 == null) {
                                    str = "";
                                } else {
                                    str = goalName8;
                                }
                                String type6 = goal.getType();
                                if (type6 == null) {
                                    str2 = "";
                                } else {
                                    str2 = type6;
                                }
                                String courseName6 = goal.getCourseName();
                                if (courseName6 == null) {
                                    str3 = "";
                                } else {
                                    str3 = courseName6;
                                }
                                eVar3 = eVar2;
                                arrayList2.add(new NotificationGoal(goalId12, str, str2, str3, recommendedActivityModel.getReminderTitle(), recommendedActivityModel.getReminderDescription(), goal.getScheduledDate().getTime() * 1000, GoalsNotificationPersistence.GOALS_NOTIF_DYNAMIC_RA));
                            } else {
                                eVar3 = eVar2;
                            }
                            eVar = eVar3;
                            arrayList = arrayList2;
                        } else {
                            if (goal9.getGoalId() != null) {
                                Utils utils = Utils.INSTANCE;
                                String goalId13 = goal9.getGoalId();
                                kotlin.jvm.internal.i.d(goalId13);
                                goalNotificationContent = utils.getGoalNotificationContent(goalId13);
                            } else {
                                goalNotificationContent = null;
                            }
                            if (goalNotificationContent != null) {
                                String goalId14 = goal9.getGoalId();
                                kotlin.jvm.internal.i.d(goalId14);
                                String goalName9 = goal9.getGoalName();
                                if (goalName9 == null) {
                                    str7 = "";
                                } else {
                                    str7 = goalName9;
                                }
                                String type7 = goal9.getType();
                                if (type7 == null) {
                                    str8 = "";
                                } else {
                                    str8 = type7;
                                }
                                String courseName7 = goal9.getCourseName();
                                if (courseName7 == null) {
                                    str9 = "";
                                } else {
                                    str9 = courseName7;
                                }
                                arrayList.add(new NotificationGoal(goalId14, str7, str8, str9, goalNotificationContent.getTitle(), goalNotificationContent.getBody(), goal9.getScheduledDate().getTime() * 1000, GoalsNotificationPersistence.GOALS_NOTIF_RA));
                            } else {
                                String goalId15 = goal9.getGoalId();
                                kotlin.jvm.internal.i.d(goalId15);
                                eVar.f14413u = arrayList;
                                eVar.f14414v = dVar;
                                eVar.f14415w = it;
                                eVar.f14416x = goal9;
                                eVar.f14417y = 2;
                                a12 = d.a(dVar, goalId15, eVar);
                                if (a12 == aVar2) {
                                    return aVar2;
                                }
                                ArrayList arrayList7 = arrayList;
                                eVar7 = eVar;
                                goal8 = goal9;
                                arrayList2 = arrayList7;
                                f fVar42 = (f) a12;
                                if (fVar42 != null) {
                                }
                                eVar = eVar7;
                                arrayList = arrayList2;
                            }
                        }
                    }
                    i10 = 1;
                    if (!it.hasNext()) {
                        Iterator<T> it5 = eVar.A.iterator();
                        while (true) {
                            boolean hasNext2 = it5.hasNext();
                            dVar2 = eVar.G;
                            if (!hasNext2) {
                                break;
                            }
                            Goal goal10 = (Goal) it5.next();
                            if (goal10.getGoalId() != null) {
                                String goalId16 = goal10.getGoalId();
                                kotlin.jvm.internal.i.d(goalId16);
                                if (goalId16.length() >= 7) {
                                    String goalId17 = goal10.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId17);
                                    String substring3 = goalId17.substring(0, 7);
                                    kotlin.jvm.internal.i.f(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                    if (kotlin.jvm.internal.i.b(substring3, "custom_")) {
                                        String goalId18 = goal10.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId18);
                                        String goalName10 = goal10.getGoalName();
                                        if (goalName10 == null) {
                                            str4 = "";
                                        } else {
                                            str4 = goalName10;
                                        }
                                        String type8 = goal10.getType();
                                        if (type8 == null) {
                                            str5 = "";
                                        } else {
                                            str5 = type8;
                                        }
                                        String courseName8 = goal10.getCourseName();
                                        if (courseName8 == null) {
                                            str6 = "";
                                        } else {
                                            str6 = courseName8;
                                        }
                                        String string5 = dVar2.f14407a.getString(com.theinnerhour.b2b.R.string.customGoalNotifiationHeader);
                                        kotlin.jvm.internal.i.f(string5, "context.getString(R.stri…tomGoalNotifiationHeader)");
                                        String goalName11 = goal10.getGoalName();
                                        kotlin.jvm.internal.i.d(goalName11);
                                        String string6 = dVar2.f14407a.getString(com.theinnerhour.b2b.R.string.customGoalNotifiationBody, goalName11);
                                        kotlin.jvm.internal.i.f(string6, "context.getString(R.stri…ionBody, goal.goalName!!)");
                                        aVar = aVar2;
                                        arrayList.add(new NotificationGoal(goalId18, str4, str5, str6, string5, string6, goal10.getScheduledDate().getTime() * 1000, GoalsNotificationPersistence.GOALS_NOTIF_ACTIVITY));
                                        aVar2 = aVar;
                                    }
                                }
                            }
                            aVar = aVar2;
                            aVar2 = aVar;
                        }
                        it2 = eVar.B.iterator();
                        dVar3 = dVar2;
                        arrayList3 = arrayList;
                        while (it2.hasNext()) {
                        }
                        it3 = eVar.C.iterator();
                        while (true) {
                            hasNext = it3.hasNext();
                            dVar4 = eVar.G;
                            if (hasNext) {
                            }
                        }
                        dVar5 = dVar4;
                        arrayList4 = arrayList3;
                        it4 = eVar.D.iterator();
                        while (it4.hasNext()) {
                        }
                        while (r0.hasNext()) {
                        }
                        eVar.F.resumeWith(arrayList4);
                        return k.f19476a;
                    }
                }
            } else {
                goal = eVar4.f14416x;
                Iterator it6 = eVar4.f14415w;
                d dVar7 = eVar4.f14414v;
                ArrayList arrayList8 = eVar4.f14413u;
                sp.b.d0(obj);
                obj2 = obj;
                arrayList2 = arrayList8;
                dVar = dVar7;
                it = it6;
                eVar2 = eVar4;
                rVar = (r) obj2;
                if (rVar == null) {
                }
                recommendedActivityModel = null;
                if (recommendedActivityModel == null) {
                }
                eVar = eVar3;
                arrayList = arrayList2;
                i10 = 1;
                if (!it.hasNext()) {
                }
            }
        } else {
            sp.b.d0(obj);
            ArrayList arrayList9 = new ArrayList();
            Iterator it7 = eVar4.f14418z.iterator();
            dVar = eVar4.G;
            it = it7;
            arrayList = arrayList9;
            eVar = eVar4;
            if (!it.hasNext()) {
            }
        }
    }
}
