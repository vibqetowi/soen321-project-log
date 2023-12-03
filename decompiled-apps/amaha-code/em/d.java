package em;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.firebase.firestore.FirebaseFirestore;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.components.goals.model.NotificationGoal;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.model.GoalNotificationContent;
import com.theinnerhour.b2b.persistence.GoalsNotificationPersistence;
import com.theinnerhour.b2b.receiver.InnerHourBroadCastReceiver;
import com.theinnerhour.b2b.receiver.V3ActivityNotificationReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import fe.q;
import fe.r;
import gv.n;
import hs.f;
import hs.k;
import is.u;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import ls.h;
import ns.i;
import ss.p;
import ya.v;
/* compiled from: GoalsNotificationUtils.kt */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f14407a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14408b;

    /* compiled from: GoalsNotificationUtils.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.goals.utils.GoalsNotificationUtils$getNotificationsForIndividualGoal$2$1", f = "GoalsNotificationUtils.kt", l = {370, 404, 445}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f14409u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ FirestoreGoal f14410v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ls.d<NotificationGoal> f14411w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ d f14412x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(FirestoreGoal firestoreGoal, ls.d<? super NotificationGoal> dVar, d dVar2, ls.d<? super a> dVar3) {
            super(2, dVar3);
            this.f14410v = firestoreGoal;
            this.f14411w = dVar;
            this.f14412x = dVar2;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f14410v, this.f14411w, this.f14412x, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        /* JADX WARN: Removed duplicated region for block: B:120:0x0299  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0164  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01da  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x021d  */
        @Override // ns.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            GoalNotificationContent goalNotificationContent;
            Object a10;
            String str;
            String str2;
            String str3;
            Object g5;
            Object a11;
            String str4;
            String str5;
            String str6;
            f fVar;
            String str7;
            String str8;
            String str9;
            r rVar;
            RecommendedActivityModel recommendedActivityModel;
            String str10;
            String str11;
            String str12;
            q qVar;
            f fVar2;
            String str13;
            String str14;
            String str15;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f14409u;
            ls.d<NotificationGoal> dVar = this.f14411w;
            FirestoreGoal firestoreGoal = this.f14410v;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 == 3) {
                            sp.b.d0(obj);
                            a10 = obj;
                            fVar2 = (f) a10;
                            if (fVar2 != null) {
                                String goalId = firestoreGoal.getGoalId();
                                kotlin.jvm.internal.i.d(goalId);
                                String goalName = firestoreGoal.getGoalName();
                                if (goalName == null) {
                                    str13 = "";
                                } else {
                                    str13 = goalName;
                                }
                                String type = firestoreGoal.getType();
                                if (type == null) {
                                    str14 = "";
                                } else {
                                    str14 = type;
                                }
                                String courseName = firestoreGoal.getCourseName();
                                if (courseName == null) {
                                    str15 = "";
                                } else {
                                    str15 = courseName;
                                }
                                dVar.resumeWith(new NotificationGoal(goalId, str13, str14, str15, (String) fVar2.f19464u, (String) fVar2.f19465v, firestoreGoal.getScheduledDate().getTime() * 1000, GoalsNotificationPersistence.GOALS_NOTIF_ACTIVITY));
                                return k.f19476a;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        sp.b.d0(obj);
                        g5 = obj;
                        rVar = (r) g5;
                        if (rVar == null && (qVar = (q) u.h2(rVar)) != null) {
                            recommendedActivityModel = (RecommendedActivityModel) qVar.d(RecommendedActivityModel.class);
                        } else {
                            recommendedActivityModel = null;
                        }
                        if (recommendedActivityModel == null) {
                            String goalId2 = firestoreGoal.getGoalId();
                            kotlin.jvm.internal.i.d(goalId2);
                            String goalName2 = firestoreGoal.getGoalName();
                            if (goalName2 == null) {
                                str10 = "";
                            } else {
                                str10 = goalName2;
                            }
                            String type2 = firestoreGoal.getType();
                            if (type2 == null) {
                                str11 = "";
                            } else {
                                str11 = type2;
                            }
                            String courseName2 = firestoreGoal.getCourseName();
                            if (courseName2 == null) {
                                str12 = "";
                            } else {
                                str12 = courseName2;
                            }
                            dVar.resumeWith(new NotificationGoal(goalId2, str10, str11, str12, recommendedActivityModel.getReminderTitle(), recommendedActivityModel.getReminderDescription(), firestoreGoal.getScheduledDate().getTime() * 1000, GoalsNotificationPersistence.GOALS_NOTIF_DYNAMIC_RA));
                            return k.f19476a;
                        }
                        dVar.resumeWith(null);
                        return k.f19476a;
                    }
                } else {
                    sp.b.d0(obj);
                    a11 = obj;
                    fVar = (f) a11;
                    if (fVar == null) {
                        String goalId3 = firestoreGoal.getGoalId();
                        kotlin.jvm.internal.i.d(goalId3);
                        String goalName3 = firestoreGoal.getGoalName();
                        if (goalName3 == null) {
                            str7 = "";
                        } else {
                            str7 = goalName3;
                        }
                        String type3 = firestoreGoal.getType();
                        if (type3 == null) {
                            str8 = "";
                        } else {
                            str8 = type3;
                        }
                        String courseName3 = firestoreGoal.getCourseName();
                        if (courseName3 == null) {
                            str9 = "";
                        } else {
                            str9 = courseName3;
                        }
                        dVar.resumeWith(new NotificationGoal(goalId3, str7, str8, str9, (String) fVar.f19464u, (String) fVar.f19465v, firestoreGoal.getScheduledDate().getTime() * 1000, GoalsNotificationPersistence.GOALS_NOTIF_ACTIVITY));
                        return k.f19476a;
                    }
                    dVar.resumeWith(null);
                    return k.f19476a;
                }
            } else {
                sp.b.d0(obj);
                if (firestoreGoal.getGoalId() == null) {
                    dVar.resumeWith(null);
                    return k.f19476a;
                }
                boolean b10 = kotlin.jvm.internal.i.b(firestoreGoal.getCourseId(), "independent");
                d dVar2 = this.f14412x;
                if (b10) {
                    String goalId4 = firestoreGoal.getGoalId();
                    kotlin.jvm.internal.i.d(goalId4);
                    String substring = goalId4.substring(0, 7);
                    kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    if (kotlin.jvm.internal.i.b(substring, "custom_")) {
                        if (firestoreGoal.getScheduledDate().getTime() != 0) {
                            String goalId5 = firestoreGoal.getGoalId();
                            kotlin.jvm.internal.i.d(goalId5);
                            String goalName4 = firestoreGoal.getGoalName();
                            if (goalName4 == null) {
                                str4 = "";
                            } else {
                                str4 = goalName4;
                            }
                            String type4 = firestoreGoal.getType();
                            if (type4 == null) {
                                str5 = "";
                            } else {
                                str5 = type4;
                            }
                            String courseName4 = firestoreGoal.getCourseName();
                            if (courseName4 == null) {
                                str6 = "";
                            } else {
                                str6 = courseName4;
                            }
                            String string = dVar2.f14407a.getString(R.string.customGoalNotifiationHeader);
                            kotlin.jvm.internal.i.f(string, "context.getString(R.stri…tomGoalNotifiationHeader)");
                            String goalName5 = firestoreGoal.getGoalName();
                            kotlin.jvm.internal.i.d(goalName5);
                            String string2 = dVar2.f14407a.getString(R.string.customGoalNotifiationBody, goalName5);
                            kotlin.jvm.internal.i.f(string2, "context.getString(R.stri…ionBody, goal.goalName!!)");
                            dVar.resumeWith(new NotificationGoal(goalId5, str4, str5, str6, string, string2, firestoreGoal.getScheduledDate().getTime() * 1000, GoalsNotificationPersistence.GOALS_NOTIF_ACTIVITY));
                            return k.f19476a;
                        }
                        dVar.resumeWith(null);
                    }
                }
                if (is.k.Q1(firestoreGoal.getType(), new String[]{Constants.GOAL_TYPE_ACTIVITY_WEEKLY, Constants.GOAL_TYPE_ACTIVITY_ONCE})) {
                    if (firestoreGoal.getScheduledDate().getTime() != 0) {
                        String goalId6 = firestoreGoal.getGoalId();
                        kotlin.jvm.internal.i.d(goalId6);
                        this.f14409u = 1;
                        a11 = d.a(dVar2, goalId6, this);
                        if (a11 == aVar) {
                            return aVar;
                        }
                        fVar = (f) a11;
                        if (fVar == null) {
                        }
                    } else {
                        dVar.resumeWith(null);
                        return k.f19476a;
                    }
                } else if (!is.k.Q1(firestoreGoal.getType(), new String[]{Constants.GOAL_TYPE_ACTIVITY_WEEKLY, Constants.GOAL_TYPE_ACTIVITY_ONCE}) && firestoreGoal.getScheduledDate().getTime() != 0) {
                    if (is.k.Q1(firestoreGoal.getType(), new String[]{Constants.GOAL_TYPE_RELAXATION_ACTIVITY, "physical_activity"})) {
                        v a12 = FirebaseFirestore.d().b("recommended_activity_data").m(firestoreGoal.getGoalId(), Constants.GOAL_ID).a();
                        kotlin.jvm.internal.i.f(a12, "getInstance().collection…                   .get()");
                        this.f14409u = 2;
                        g5 = tr.r.g(a12, this);
                        if (g5 == aVar) {
                            return aVar;
                        }
                        rVar = (r) g5;
                        if (rVar == null) {
                        }
                        recommendedActivityModel = null;
                        if (recommendedActivityModel == null) {
                        }
                    } else {
                        if (firestoreGoal.getGoalId() != null) {
                            Utils utils = Utils.INSTANCE;
                            String goalId7 = firestoreGoal.getGoalId();
                            kotlin.jvm.internal.i.d(goalId7);
                            goalNotificationContent = utils.getGoalNotificationContent(goalId7);
                        } else {
                            goalNotificationContent = null;
                        }
                        if (goalNotificationContent != null) {
                            String goalId8 = firestoreGoal.getGoalId();
                            kotlin.jvm.internal.i.d(goalId8);
                            String goalName6 = firestoreGoal.getGoalName();
                            if (goalName6 == null) {
                                str = "";
                            } else {
                                str = goalName6;
                            }
                            String type5 = firestoreGoal.getType();
                            if (type5 == null) {
                                str2 = "";
                            } else {
                                str2 = type5;
                            }
                            String courseName5 = firestoreGoal.getCourseName();
                            if (courseName5 == null) {
                                str3 = "";
                            } else {
                                str3 = courseName5;
                            }
                            dVar.resumeWith(new NotificationGoal(goalId8, str, str2, str3, goalNotificationContent.getTitle(), goalNotificationContent.getBody(), firestoreGoal.getScheduledDate().getTime() * 1000, GoalsNotificationPersistence.GOALS_NOTIF_RA));
                            return k.f19476a;
                        }
                        String goalId9 = firestoreGoal.getGoalId();
                        kotlin.jvm.internal.i.d(goalId9);
                        this.f14409u = 3;
                        a10 = d.a(dVar2, goalId9, this);
                        if (a10 == aVar) {
                            return aVar;
                        }
                        fVar2 = (f) a10;
                        if (fVar2 != null) {
                        }
                    }
                }
            }
            dVar.resumeWith(null);
            return k.f19476a;
        }
    }

    public d(Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        this.f14407a = context;
        this.f14408b = LogHelper.INSTANCE.makeLogTag("GoalsNotificationUtils");
    }

    public static final Object a(d dVar, String str, ls.d dVar2) {
        dVar.getClass();
        h hVar = new h(ca.a.G0(dVar2));
        ta.v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new b(str, hVar, null), 3);
        return hVar.b();
    }

    public static Calendar d() {
        Calendar calendar = Calendar.getInstance();
        calendar.clear(11);
        calendar.clear(9);
        calendar.clear(12);
        calendar.clear(10);
        calendar.clear(13);
        calendar.clear(14);
        return calendar;
    }

    public final int b(String str) {
        try {
            char[] charArray = str.toCharArray();
            kotlin.jvm.internal.i.f(charArray, "this as java.lang.String).toCharArray()");
            int i6 = 0;
            for (char c10 : charArray) {
                i6 += c10;
            }
            return i6;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f14408b, "exception", e10);
            return 0;
        }
    }

    public final Object c(FirestoreGoal firestoreGoal, ls.d<? super NotificationGoal> dVar) {
        h hVar = new h(ca.a.G0(dVar));
        ta.v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new a(firestoreGoal, hVar, this, null), 3);
        return hVar.b();
    }

    public final Object e(NotificationGoal notificationGoal, boolean z10, ls.d<? super Boolean> dVar) {
        int i6;
        h hVar = new h(ca.a.G0(dVar));
        if (!n.B0(notificationGoal.getGoalId()) && !n.B0(notificationGoal.getTitle()) && !n.B0(notificationGoal.getBody())) {
            if (notificationGoal.getGoalScheduleTime() <= 0) {
                hVar.resumeWith(Boolean.FALSE);
            } else {
                Calendar d10 = d();
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(notificationGoal.getGoalScheduleTime());
                long convert = TimeUnit.DAYS.convert(d10.getTimeInMillis() - calendar.getTimeInMillis(), TimeUnit.MILLISECONDS);
                if (kotlin.jvm.internal.i.b(notificationGoal.getGoalType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                    if (convert > 0) {
                        int i10 = (int) ((convert + 1) / 7);
                        if (i10 == 0) {
                            calendar.add(5, 7);
                        } else {
                            calendar.add(5, (i10 * 7) + 7);
                        }
                    } else if (Calendar.getInstance().getTimeInMillis() > calendar.getTimeInMillis()) {
                        calendar.add(5, 7);
                    }
                } else if (!kotlin.jvm.internal.i.b(notificationGoal.getGoalType(), Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                    if (convert > 0 || convert < -1) {
                        calendar.add(5, ((int) convert) + 1);
                    }
                    if (calendar.getTimeInMillis() < Calendar.getInstance().getTimeInMillis()) {
                        calendar.add(5, 1);
                        if (Calendar.getInstance().getTimeInMillis() > calendar.getTimeInMillis()) {
                            calendar.add(5, 1);
                        }
                    }
                }
                MyApplication.a aVar = MyApplication.V;
                Intent intent = new Intent(aVar.a().getApplicationContext(), V3ActivityNotificationReceiver.class);
                intent.addFlags(268435456);
                intent.setAction("android.intent.action.VIEW");
                intent.putExtra(Constants.GOAL_ID, notificationGoal.getGoalId());
                intent.putExtra(Constants.GOAL_NAME, notificationGoal.getGoalName());
                intent.putExtra(Constants.GOAL_SCEHDULE_TIME, calendar.getTimeInMillis());
                intent.putExtra(Constants.GOAL_TYPE, notificationGoal.getGoalType());
                intent.putExtra(Constants.COURSE_NAME, notificationGoal.getCourseName());
                intent.putExtra(Constants.NOTIFICATION_TITLE, notificationGoal.getTitle());
                intent.putExtra(Constants.NOTIFICATION_BODY, notificationGoal.getBody());
                intent.putExtra("model", notificationGoal);
                Context applicationContext = aVar.a().getApplicationContext();
                int b10 = b(notificationGoal.getGoalId() + notificationGoal.getCourseName());
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 23) {
                    i6 = 335544320;
                } else {
                    i6 = 134217728;
                }
                PendingIntent broadcast = PendingIntent.getBroadcast(applicationContext, b10, intent, i6);
                Object systemService = aVar.a().getApplicationContext().getSystemService("alarm");
                kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
                AlarmManager alarmManager = (AlarmManager) systemService;
                if (z10) {
                    alarmManager.cancel(broadcast);
                } else if (i11 >= 23) {
                    alarmManager.setExactAndAllowWhileIdle(0, calendar.getTimeInMillis(), broadcast);
                } else {
                    alarmManager.set(0, calendar.getTimeInMillis(), broadcast);
                }
                hVar.resumeWith(Boolean.TRUE);
            }
        } else {
            hVar.resumeWith(Boolean.FALSE);
        }
        return hVar.b();
    }

    public final Object f(NotificationGoal notificationGoal, boolean z10, ls.d<? super Boolean> dVar) {
        int i6;
        h hVar = new h(ca.a.G0(dVar));
        long goalScheduleTime = notificationGoal.getGoalScheduleTime();
        if (goalScheduleTime <= 0) {
            hVar.resumeWith(Boolean.FALSE);
        } else {
            Calendar d10 = d();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(goalScheduleTime);
            long convert = TimeUnit.DAYS.convert(d10.getTimeInMillis() - calendar.getTimeInMillis(), TimeUnit.MILLISECONDS);
            if (convert > 0 || convert < -1) {
                calendar.add(5, ((int) convert) + 1);
                goalScheduleTime = calendar.getTimeInMillis();
            }
            if (goalScheduleTime < Calendar.getInstance().getTimeInMillis()) {
                Calendar calendar2 = Calendar.getInstance();
                long j10 = 86400000;
                calendar.setTimeInMillis(calendar.getTimeInMillis() + (((int) Math.floor((calendar2.getTimeInMillis() - calendar.getTimeInMillis()) / j10)) * 86400000));
                while (calendar.getTimeInMillis() < calendar2.getTimeInMillis()) {
                    calendar.setTimeInMillis(calendar.getTimeInMillis() + j10);
                }
                goalScheduleTime = calendar.getTimeInMillis();
            }
            MyApplication.a aVar = MyApplication.V;
            Object systemService = aVar.a().getSystemService("alarm");
            kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
            AlarmManager alarmManager = (AlarmManager) systemService;
            Intent intent = new Intent(aVar.a(), InnerHourBroadCastReceiver.class);
            intent.addFlags(268435456);
            intent.setAction(String.valueOf(calendar.get(6)));
            intent.putExtra(Constants.GOAL_NAME, notificationGoal.getTitle());
            intent.putExtra(Constants.GOAL_DESC, notificationGoal.getBody());
            intent.putExtra(Constants.GOAL_ID, notificationGoal.getGoalId());
            intent.putExtra(Constants.GOAL_SCEHDULE_TIME, goalScheduleTime);
            intent.putExtra(Constants.GOAL_TYPE, notificationGoal.getGoalType());
            intent.putExtra(Constants.COURSE_NAME, notificationGoal.getCourseName());
            intent.putExtra("model", notificationGoal);
            MyApplication a10 = aVar.a();
            int b10 = b(notificationGoal.getGoalId() + notificationGoal.getCourseName());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23) {
                i6 = 201326592;
            } else {
                i6 = 134217728;
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(a10, b10, intent, i6);
            if (z10) {
                alarmManager.cancel(broadcast);
            } else if (i10 >= 23) {
                alarmManager.setExactAndAllowWhileIdle(0, goalScheduleTime, broadcast);
            } else {
                alarmManager.setExact(0, goalScheduleTime, broadcast);
            }
            hVar.resumeWith(Boolean.TRUE);
        }
        return hVar.b();
    }
}
