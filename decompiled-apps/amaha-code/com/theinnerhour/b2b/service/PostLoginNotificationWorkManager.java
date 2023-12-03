package com.theinnerhour.b2b.service;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.p;
import ca.a;
import com.appsflyer.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.components.goals.model.NotificationGoal;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.GoalsNotificationPersistence;
import com.theinnerhour.b2b.persistence.GoalsPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import dw.z;
import em.c;
import em.d;
import em.e;
import is.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.o0;
import ls.h;
import nr.b;
import or.f;
import sf.m;
import ta.v;
/* compiled from: PostLoginNotificationWorkManager.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0013\u0010\t\u001a\u00020\bH\u0097@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/theinnerhour/b2b/service/PostLoginNotificationWorkManager;", "Landroidx/work/CoroutineWorker;", "", SessionManager.KEY_UID, "fetchOldRAJson", "(Ljava/lang/String;Lls/d;)Ljava/lang/Object;", "Lhs/k;", "checkAndUpdateRetryCount", "Landroidx/work/p$a;", "doWork", "(Lls/d;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lem/d;", "utils", "Lem/d;", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class PostLoginNotificationWorkManager extends CoroutineWorker {
    public static final Companion Companion = new Companion(null);
    public static final String POST_LOGIN_NOTIFICATION_ATTEMPT = "login_notif_attempt";
    private final Context context;
    private final d utils;

    /* compiled from: PostLoginNotificationWorkManager.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/service/PostLoginNotificationWorkManager$Companion;", "", "()V", "POST_LOGIN_NOTIFICATION_ATTEMPT", "", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.d dVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostLoginNotificationWorkManager(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        i.g(context, "context");
        i.g(workerParams, "workerParams");
        this.context = context;
        this.utils = new d(context);
    }

    private final void checkAndUpdateRetryCount() {
        int intValue = ApplicationPersistence.getInstance().getIntValue(POST_LOGIN_NOTIFICATION_ATTEMPT, 0) + 1;
        if (intValue >= 3) {
            ApplicationPersistence.getInstance().deleteKey(POST_LOGIN_NOTIFICATION_ATTEMPT);
        } else {
            ApplicationPersistence.getInstance().setIntValue(POST_LOGIN_NOTIFICATION_ATTEMPT, intValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchOldRAJson(String str, ls.d<? super String> dVar) {
        m mVar;
        h hVar = new h(a.G0(dVar));
        z<m> g5 = ((f) b.a(f.class)).a("https://notify.theinnerhour.com/recommendedactivities", str).g();
        String str2 = null;
        if (!g5.a()) {
            g5 = null;
        }
        if (g5 != null && (mVar = g5.f13696b) != null) {
            str2 = mVar.toString();
        }
        hVar.resumeWith(str2);
        return hVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(ls.d<? super p.a> dVar) {
        PostLoginNotificationWorkManager$doWork$1 postLoginNotificationWorkManager$doWork$1;
        int i6;
        String str;
        PostLoginNotificationWorkManager postLoginNotificationWorkManager;
        PostLoginNotificationWorkManager postLoginNotificationWorkManager2;
        List list;
        List<NotificationGoal> list2;
        GoalsPersistence.Companion.GoalTypePrefix goalTypePrefix;
        if (dVar instanceof PostLoginNotificationWorkManager$doWork$1) {
            postLoginNotificationWorkManager$doWork$1 = (PostLoginNotificationWorkManager$doWork$1) dVar;
            int i10 = postLoginNotificationWorkManager$doWork$1.label;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                postLoginNotificationWorkManager$doWork$1.label = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = postLoginNotificationWorkManager$doWork$1.result;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                i6 = postLoginNotificationWorkManager$doWork$1.label;
                ArrayList<Goal> arrayList = null;
                if (i6 == 0) {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 == 3) {
                                postLoginNotificationWorkManager = (PostLoginNotificationWorkManager) postLoginNotificationWorkManager$doWork$1.L$0;
                                sp.b.d0(obj);
                                list2 = (List) obj;
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            postLoginNotificationWorkManager = (PostLoginNotificationWorkManager) postLoginNotificationWorkManager$doWork$1.L$0;
                            sp.b.d0(obj);
                            list2 = (List) obj;
                        }
                    } else {
                        postLoginNotificationWorkManager2 = (PostLoginNotificationWorkManager) postLoginNotificationWorkManager$doWork$1.L$0;
                        sp.b.d0(obj);
                        list = (List) obj;
                        if (list != null) {
                            postLoginNotificationWorkManager2.checkAndUpdateRetryCount();
                            return new p.a.C0043a();
                        }
                        d dVar2 = postLoginNotificationWorkManager2.utils;
                        postLoginNotificationWorkManager$doWork$1.L$0 = postLoginNotificationWorkManager2;
                        postLoginNotificationWorkManager$doWork$1.label = 2;
                        dVar2.getClass();
                        h hVar = new h(a.G0(postLoginNotificationWorkManager$doWork$1));
                        v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new c(list, dVar2, hVar, null), 3);
                        obj = hVar.b();
                        if (obj == aVar) {
                            return aVar;
                        }
                        postLoginNotificationWorkManager = postLoginNotificationWorkManager2;
                        list2 = (List) obj;
                    }
                } else {
                    sp.b.d0(obj);
                    fd.f fVar = FirebaseAuth.getInstance().f;
                    if (fVar != null) {
                        str = fVar.j0();
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        checkAndUpdateRetryCount();
                        return new p.a.C0043a();
                    } else if (sp.b.K()) {
                        d dVar3 = this.utils;
                        postLoginNotificationWorkManager$doWork$1.L$0 = this;
                        postLoginNotificationWorkManager$doWork$1.label = 1;
                        dVar3.getClass();
                        h hVar2 = new h(a.G0(postLoginNotificationWorkManager$doWork$1));
                        fe.c b10 = FirebaseFirestore.d().b(Constants.USER_DATA_COLLECTION).q(str).b(Constants.USER_GOALS_DATA);
                        Boolean bool = Boolean.TRUE;
                        b10.m(bool, "visible").m(bool, "notificationScheduled").a().addOnCompleteListener(new em.a(hVar2));
                        obj = hVar2.b();
                        if (obj == aVar) {
                            return aVar;
                        }
                        postLoginNotificationWorkManager2 = this;
                        list = (List) obj;
                        if (list != null) {
                        }
                    } else {
                        d dVar4 = this.utils;
                        User user = FirebasePersistence.getInstance().getUser();
                        if (user != null) {
                            arrayList = user.getUserGoals();
                        }
                        postLoginNotificationWorkManager$doWork$1.L$0 = this;
                        postLoginNotificationWorkManager$doWork$1.label = 3;
                        dVar4.getClass();
                        h hVar3 = new h(a.G0(postLoginNotificationWorkManager$doWork$1));
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        String n10 = c.n();
                        if (arrayList != null) {
                            ArrayList arrayList8 = new ArrayList();
                            for (Object obj2 : arrayList) {
                                if (((Goal) obj2).isVisible()) {
                                    arrayList8.add(obj2);
                                }
                            }
                            Iterator it = arrayList8.iterator();
                            while (it.hasNext()) {
                                Goal goal = (Goal) it.next();
                                if (i.b(goal.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY) && ((i.b(goal.getCourseId(), n10) || i.b(goal.getCourseId(), Constants.LIBRARY_GOAL_COURSE_ID)) && goal.getScheduledDate().getTime() != 0)) {
                                    arrayList2.add(goal);
                                }
                                Iterator it2 = it;
                                if (i.b(goal.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY) && i.b(goal.getCourseId(), "independent") && goal.getScheduledDate().getTime() != 0) {
                                    arrayList3.add(goal);
                                }
                                if (i.b(goal.getType(), Constants.GOAL_TYPE_ACTIVITY_ONCE) && ((i.b(goal.getCourseId(), n10) || i.b(goal.getCourseId(), Constants.LIBRARY_GOAL_COURSE_ID)) && goal.getScheduledDate().getTime() != 0)) {
                                    arrayList4.add(goal);
                                }
                                if (i.b(goal.getType(), Constants.GOAL_TYPE_ACTIVITY_ONCE) && i.b(goal.getCourseId(), "independent") && goal.getScheduledDate().getTime() != 0) {
                                    arrayList5.add(goal);
                                }
                                ms.a aVar2 = aVar;
                                if (!k.Q1(goal.getType(), new String[]{Constants.GOAL_TYPE_ACTIVITY_WEEKLY, Constants.GOAL_TYPE_ACTIVITY_ONCE}) && ((i.b(goal.getCourseId(), n10) || i.b(goal.getCourseId(), Constants.LIBRARY_GOAL_COURSE_ID)) && goal.getScheduledDate().getTime() != 0)) {
                                    arrayList6.add(goal);
                                }
                                if (!k.Q1(goal.getType(), new String[]{Constants.GOAL_TYPE_ACTIVITY_WEEKLY, Constants.GOAL_TYPE_ACTIVITY_ONCE}) && i.b(goal.getCourseId(), "independent") && goal.getScheduledDate().getTime() != 0) {
                                    arrayList7.add(goal);
                                }
                                it = it2;
                                aVar = aVar2;
                            }
                        }
                        ms.a aVar3 = aVar;
                        v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new e(arrayList6, arrayList7, arrayList2, arrayList3, arrayList4, arrayList5, hVar3, dVar4, null), 3);
                        obj = hVar3.b();
                        if (obj == aVar3) {
                            return aVar3;
                        }
                        postLoginNotificationWorkManager = this;
                        list2 = (List) obj;
                    }
                }
                if (!list2.isEmpty()) {
                    postLoginNotificationWorkManager.context.getSharedPreferences(GoalsNotificationPersistence.GOALS_NOTIF_PERSISTENCE_KEY, 0).edit().putString(GoalsNotificationPersistence.GOALS_NOTIF_JSON_KEY, new sf.i().g(list2)).commit();
                    for (NotificationGoal notificationGoal : list2) {
                        String goalType = notificationGoal.getGoalType();
                        if (i.b(goalType, Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                            goalTypePrefix = GoalsPersistence.Companion.GoalTypePrefix.ONE_TIME;
                        } else if (i.b(goalType, Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                            goalTypePrefix = GoalsPersistence.Companion.GoalTypePrefix.WEEKLY;
                        } else {
                            goalTypePrefix = GoalsPersistence.Companion.GoalTypePrefix.DAILY;
                        }
                        MyApplication.V.a().c().setGoalScheduled(notificationGoal.getGoalId(), goalTypePrefix, true);
                    }
                }
                return new p.a.c();
            }
        }
        postLoginNotificationWorkManager$doWork$1 = new PostLoginNotificationWorkManager$doWork$1(this, dVar);
        Object obj3 = postLoginNotificationWorkManager$doWork$1.result;
        ms.a aVar4 = ms.a.COROUTINE_SUSPENDED;
        i6 = postLoginNotificationWorkManager$doWork$1.label;
        ArrayList<Goal> arrayList9 = null;
        if (i6 == 0) {
        }
        if (!list2.isEmpty()) {
        }
        return new p.a.c();
    }

    public final Context getContext() {
        return this.context;
    }
}
