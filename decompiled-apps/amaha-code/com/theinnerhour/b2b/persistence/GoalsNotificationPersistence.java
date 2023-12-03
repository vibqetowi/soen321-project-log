package com.theinnerhour.b2b.persistence;

import android.content.SharedPreferences;
import com.appsflyer.R;
import com.google.gson.reflect.TypeToken;
import com.theinnerhour.b2b.components.goals.model.NotificationGoal;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import gv.n;
import is.q;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import sf.i;
/* compiled from: GoalsNotificationPersistence.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007JF\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0006\u0010\u0011\u001a\u00020\u0004R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0017j\b\u0012\u0004\u0012\u00020\u0002`\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/theinnerhour/b2b/persistence/GoalsNotificationPersistence;", "", "Lcom/theinnerhour/b2b/components/goals/model/NotificationGoal;", Constants.GOAL, "Lhs/k;", "addGoal", "", "goalId", "goalName", "goalType", "courseName", "title", "body", "", "goalScheduleTime", "notificationType", "removeGoal", "clearPersistence", "Landroid/content/SharedPreferences;", "goalNotifPrefs", "Landroid/content/SharedPreferences;", "TAG", "Ljava/lang/String;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "cachedList", "Ljava/util/ArrayList;", "Lsf/i;", "gson", "Lsf/i;", "<init>", "(Landroid/content/SharedPreferences;)V", "Companion", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class GoalsNotificationPersistence {
    public static final Companion Companion = new Companion(null);
    public static final String GOALS_NOTIF_ACTIVITY = "activity_notification";
    public static final String GOALS_NOTIF_DYNAMIC_RA = "ra_dynamic";
    public static final String GOALS_NOTIF_JSON_KEY = "goal_notif_list";
    public static final String GOALS_NOTIF_PERSISTENCE_KEY = "goals_notif_persistence";
    public static final String GOALS_NOTIF_RA = "ra_notification";
    private final String TAG;
    private ArrayList<NotificationGoal> cachedList;
    private final SharedPreferences goalNotifPrefs;
    private final i gson;

    /* compiled from: GoalsNotificationPersistence.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/theinnerhour/b2b/persistence/GoalsNotificationPersistence$Companion;", "", "()V", "GOALS_NOTIF_ACTIVITY", "", "GOALS_NOTIF_DYNAMIC_RA", "GOALS_NOTIF_JSON_KEY", "GOALS_NOTIF_PERSISTENCE_KEY", "GOALS_NOTIF_RA", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }
    }

    public GoalsNotificationPersistence(SharedPreferences goalNotifPrefs) {
        kotlin.jvm.internal.i.g(goalNotifPrefs, "goalNotifPrefs");
        this.goalNotifPrefs = goalNotifPrefs;
        this.TAG = "GoalsNotificationPersistence";
        this.gson = new i();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006a A[Catch: Exception -> 0x00eb, TRY_LEAVE, TryCatch #1 {Exception -> 0x00eb, blocks: (B:3:0x0005, B:7:0x0014, B:8:0x0018, B:10:0x001e, B:16:0x0039, B:18:0x003d, B:19:0x0041, B:20:0x0044, B:21:0x0045, B:23:0x0049, B:58:0x00cb, B:60:0x00d1, B:61:0x00e3, B:62:0x00e6, B:24:0x004e, B:25:0x0051, B:13:0x0033, B:26:0x0052, B:27:0x0055, B:28:0x0056, B:30:0x005e, B:36:0x006a, B:41:0x0091, B:42:0x0097, B:44:0x009d, B:50:0x00b8, B:52:0x00bc, B:53:0x00c0, B:54:0x00c3, B:55:0x00c4, B:57:0x00c8, B:63:0x00e7, B:64:0x00ea, B:47:0x00b2, B:40:0x008c, B:38:0x0075), top: B:70:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void addGoal(NotificationGoal goal) {
        boolean z10;
        ArrayList<NotificationGoal> arrayList;
        kotlin.jvm.internal.i.g(goal, "goal");
        try {
            SharedPreferences sharedPreferences = this.goalNotifPrefs;
            ArrayList<NotificationGoal> arrayList2 = this.cachedList;
            int i6 = 0;
            if (arrayList2 == null) {
                String string = sharedPreferences.getString(GOALS_NOTIF_JSON_KEY, "");
                if (string != null && !n.B0(string)) {
                    z10 = false;
                    if (!z10) {
                        ArrayList<NotificationGoal> arrayList3 = new ArrayList<>();
                        arrayList3.add(goal);
                        this.cachedList = arrayList3;
                    } else {
                        try {
                            Object c10 = this.gson.c(string, new TypeToken<ArrayList<NotificationGoal>>() { // from class: com.theinnerhour.b2b.persistence.GoalsNotificationPersistence$addGoal$1$goalNotificationList$typeToken$1
                            }.getType());
                            kotlin.jvm.internal.i.f(c10, "{\n                      …                        }");
                            arrayList = (ArrayList) c10;
                        } catch (Exception unused) {
                            arrayList = new ArrayList<>();
                        }
                        this.cachedList = arrayList;
                        Iterator<NotificationGoal> it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                i6 = -1;
                                break;
                            } else if (kotlin.jvm.internal.i.b(it.next().getGoalId(), goal.getGoalId())) {
                                break;
                            } else {
                                i6++;
                            }
                        }
                        if (i6 != -1) {
                            ArrayList<NotificationGoal> arrayList4 = this.cachedList;
                            if (arrayList4 == null) {
                                kotlin.jvm.internal.i.q("cachedList");
                                throw null;
                            }
                            arrayList4.remove(i6);
                        }
                        ArrayList<NotificationGoal> arrayList5 = this.cachedList;
                        if (arrayList5 == null) {
                            kotlin.jvm.internal.i.q("cachedList");
                            throw null;
                        }
                        arrayList5.add(goal);
                    }
                }
                z10 = true;
                if (!z10) {
                }
            } else if (arrayList2 != null) {
                Iterator<NotificationGoal> it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        i6 = -1;
                        break;
                    } else if (kotlin.jvm.internal.i.b(it2.next().getGoalId(), goal.getGoalId())) {
                        break;
                    } else {
                        i6++;
                    }
                }
                if (i6 != -1) {
                    ArrayList<NotificationGoal> arrayList6 = this.cachedList;
                    if (arrayList6 == null) {
                        kotlin.jvm.internal.i.q("cachedList");
                        throw null;
                    }
                    arrayList6.remove(i6);
                }
                ArrayList<NotificationGoal> arrayList7 = this.cachedList;
                if (arrayList7 == null) {
                    kotlin.jvm.internal.i.q("cachedList");
                    throw null;
                }
                arrayList7.add(goal);
            } else {
                kotlin.jvm.internal.i.q("cachedList");
                throw null;
            }
            i iVar = this.gson;
            ArrayList<NotificationGoal> arrayList8 = this.cachedList;
            if (arrayList8 != null) {
                this.goalNotifPrefs.edit().putString(GOALS_NOTIF_JSON_KEY, iVar.g(arrayList8)).commit();
                return;
            }
            kotlin.jvm.internal.i.q("cachedList");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, e10);
        }
    }

    public final void clearPersistence() {
        this.goalNotifPrefs.edit().clear().apply();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: Exception -> 0x0077, TRY_LEAVE, TryCatch #1 {Exception -> 0x0077, blocks: (B:3:0x0005, B:6:0x000f, B:21:0x005a, B:23:0x0060, B:24:0x0072, B:25:0x0076, B:7:0x0018, B:9:0x0020, B:15:0x002c, B:20:0x0050, B:19:0x004b, B:17:0x0034), top: B:31:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void removeGoal(String goalId) {
        boolean z10;
        ArrayList<NotificationGoal> arrayList;
        kotlin.jvm.internal.i.g(goalId, "goalId");
        try {
            SharedPreferences sharedPreferences = this.goalNotifPrefs;
            ArrayList<NotificationGoal> arrayList2 = this.cachedList;
            if (arrayList2 != null) {
                q.U1(arrayList2, new GoalsNotificationPersistence$removeGoal$1$2(goalId));
            } else {
                String string = sharedPreferences.getString(GOALS_NOTIF_JSON_KEY, "");
                if (string != null && !n.B0(string)) {
                    z10 = false;
                    if (!z10) {
                        this.cachedList = new ArrayList<>();
                    } else {
                        try {
                            Object c10 = this.gson.c(string, new TypeToken<ArrayList<NotificationGoal>>() { // from class: com.theinnerhour.b2b.persistence.GoalsNotificationPersistence$removeGoal$1$goalNotificationList$typeToken$1
                            }.getType());
                            kotlin.jvm.internal.i.f(c10, "{\n                      …                        }");
                            arrayList = (ArrayList) c10;
                        } catch (Exception unused) {
                            arrayList = new ArrayList<>();
                        }
                        this.cachedList = arrayList;
                        q.U1(arrayList, new GoalsNotificationPersistence$removeGoal$1$3(goalId));
                    }
                }
                z10 = true;
                if (!z10) {
                }
            }
            i iVar = this.gson;
            ArrayList<NotificationGoal> arrayList3 = this.cachedList;
            if (arrayList3 != null) {
                this.goalNotifPrefs.edit().putString(GOALS_NOTIF_JSON_KEY, iVar.g(arrayList3)).commit();
                return;
            }
            kotlin.jvm.internal.i.q("cachedList");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, e10);
        }
    }

    public final void addGoal(String goalId, String goalName, String goalType, String courseName, String title, String body, long j10, String notificationType) {
        kotlin.jvm.internal.i.g(goalId, "goalId");
        kotlin.jvm.internal.i.g(goalName, "goalName");
        kotlin.jvm.internal.i.g(goalType, "goalType");
        kotlin.jvm.internal.i.g(courseName, "courseName");
        kotlin.jvm.internal.i.g(title, "title");
        kotlin.jvm.internal.i.g(body, "body");
        kotlin.jvm.internal.i.g(notificationType, "notificationType");
        addGoal(new NotificationGoal(goalId, goalName, goalType, courseName, title, body, j10, notificationType));
    }
}
