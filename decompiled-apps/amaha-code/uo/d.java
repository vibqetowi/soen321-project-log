package uo;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.Toast;
import com.google.firebase.database.core.ValidationPath;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlinx.coroutines.o0;
import ta.v;
import wo.y;
import wo.z;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements DatePickerDialog.OnDateSetListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f34269u = 0;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Calendar f34270v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ k f34271w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ RobertoTextView f34272x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Object f34273y;

    public /* synthetic */ d(FirestoreGoal firestoreGoal, k kVar, RobertoTextView robertoTextView, Calendar calendar) {
        this.f34270v = calendar;
        this.f34271w = kVar;
        this.f34272x = robertoTextView;
        this.f34273y = firestoreGoal;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00fb, code lost:
        if (java.lang.Math.abs((r13.getTimeInMillis() / 1000) - r6.getScheduledDate().getTime()) > 59) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0155, code lost:
        if (r3 == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0205, code lost:
        if (java.lang.Math.abs((r13.getTimeInMillis() / 1000) - r6.getScheduledDate().getTime()) > 59) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0253, code lost:
        if (r0 == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0256, code lost:
        r0 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0440  */
    @Override // android.app.DatePickerDialog.OnDateSetListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDateSet(DatePicker datePicker, int i6, int i10, int i11) {
        String str;
        long j10;
        boolean z10;
        String str2;
        String str3;
        String str4;
        boolean z11;
        boolean z12;
        boolean z13;
        String str5;
        String str6;
        int i12 = this.f34269u;
        RobertoTextView tv2 = this.f34272x;
        k this$0 = this.f34271w;
        Calendar calendar = this.f34270v;
        Object obj = this.f34273y;
        boolean z14 = false;
        switch (i12) {
            case 0:
                FirestoreGoal goal = (FirestoreGoal) obj;
                int i13 = k.E;
                kotlin.jvm.internal.i.g(calendar, "$calendar");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(tv2, "$tv");
                kotlin.jvm.internal.i.g(goal, "$goal");
                calendar.set(i6, i10, i11);
                this$0.C = tv2;
                y yVar = this$0.A;
                if (yVar != null) {
                    long timeInMillis = calendar.getTimeInMillis();
                    Iterator<FirestoreGoal> it = this$0.B.iterator();
                    while (it.hasNext()) {
                        FirestoreGoal next = it.next();
                        if (kotlin.jvm.internal.i.b(next.getGoalId(), goal.getGoalId())) {
                            v.H(kc.f.H(yVar), null, 0, new z(yVar, next, timeInMillis, null), 3);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                String goalId = goal.getGoalId();
                if (goalId != null) {
                    str = goalId.substring(0, 7);
                    kotlin.jvm.internal.i.f(str, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    str = null;
                }
                boolean b10 = kotlin.jvm.internal.i.b(str, "custom_");
                if (kotlin.jvm.internal.i.b(goal.getType(), Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                    break;
                } else {
                    SimpleDateFormat simpleDateFormat = this$0.f34313w;
                    Date date = new Date();
                    date.setTime(goal.getScheduledDate().getTime() * 1000);
                    String format = simpleDateFormat.format(date);
                    Date date2 = new Date();
                    date2.setTime(calendar.getTimeInMillis());
                    boolean z15 = !kotlin.jvm.internal.i.b(format, simpleDateFormat.format(date2));
                    if (Math.abs((calendar.getTimeInMillis() / j10) - goal.getScheduledDate().getTime()) % 86400 > 59.0d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z15) {
                    }
                    z14 = true;
                }
                String str7 = gk.a.f16573a;
                Bundle bundle = new Bundle();
                bundle.putString("course", goal.getCourseName());
                bundle.putString(Constants.GOAL_ID, goal.getGoalId());
                bundle.putString("variant", "new");
                bundle.putBoolean("time_updated", z14);
                if (b10) {
                    str2 = "custom";
                } else {
                    str2 = "regular";
                }
                bundle.putString("reminder_type", str2);
                if (kotlin.jvm.internal.i.b(goal.getType(), Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                    str3 = "one_time";
                } else {
                    str3 = "weekly";
                }
                bundle.putString("frequency", str3);
                hs.k kVar = hs.k.f19476a;
                gk.a.b(bundle, "profile_goal_time_update");
                return;
            default:
                Goal goal2 = (Goal) obj;
                int i14 = k.E;
                kotlin.jvm.internal.i.g(calendar, "$calendar");
                kotlin.jvm.internal.i.g(goal2, "$goal");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(tv2, "$tv");
                calendar.set(i6, i10, i11);
                boolean notificationScheduled = FirebasePersistence.getInstance().getGoalById(goal2.getGoalId(), goal2.getCourseId()).getNotificationScheduled();
                String goalId2 = goal2.getGoalId();
                if (goalId2 != null) {
                    str4 = goalId2.substring(0, 7);
                    kotlin.jvm.internal.i.f(str4, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    str4 = null;
                }
                boolean b11 = kotlin.jvm.internal.i.b(str4, "custom_");
                if (kotlin.jvm.internal.i.b(goal2.getType(), Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                    z11 = notificationScheduled;
                    break;
                } else {
                    SimpleDateFormat simpleDateFormat2 = this$0.f34313w;
                    String format2 = simpleDateFormat2.format(goal2.getmScheduleDate());
                    Date date3 = new Date();
                    date3.setTime(calendar.getTimeInMillis());
                    boolean z16 = !kotlin.jvm.internal.i.b(format2, simpleDateFormat2.format(date3));
                    z11 = notificationScheduled;
                    if (Math.abs((calendar.getTimeInMillis() / 1000) - goal2.getScheduledDate().getTime()) % 86400 > 59.0d) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z16) {
                    }
                    z13 = true;
                }
                if (goal2.getGoalId() != null) {
                    String goalId3 = goal2.getGoalId();
                    kotlin.jvm.internal.i.d(goalId3);
                    if (goalId3.length() >= 7 && b11) {
                        ProgressDialog progressDialog = this$0.f34316z;
                        if (progressDialog != null) {
                            progressDialog.show();
                            if (kotlin.jvm.internal.i.b(goal2.getType(), Constants.GOAL_TYPE_ACTIVITY_ONCE) && calendar.getTimeInMillis() < Calendar.getInstance().getTimeInMillis()) {
                                if (this$0.isAdded()) {
                                    ProgressDialog progressDialog2 = this$0.f34316z;
                                    if (progressDialog2 != null) {
                                        progressDialog2.dismiss();
                                        Toast.makeText(this$0.getContext(), "Can't set notification for the past!", 0).show();
                                    } else {
                                        kotlin.jvm.internal.i.q("progressDialog");
                                        throw null;
                                    }
                                }
                            } else {
                                v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new q(this$0, goal2, calendar, tv2, null), 3);
                            }
                            String str8 = gk.a.f16573a;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("course", goal2.getCourseName());
                            bundle2.putString(Constants.GOAL_ID, goal2.getGoalId());
                            bundle2.putString("variant", "new");
                            bundle2.putBoolean("time_updated", z13);
                            if (!b11) {
                                str5 = "custom";
                            } else {
                                str5 = "regular";
                            }
                            bundle2.putString("reminder_type", str5);
                            if (!kotlin.jvm.internal.i.b(goal2.getType(), Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                                str6 = "one_time";
                            } else {
                                str6 = "weekly";
                            }
                            bundle2.putString("frequency", str6);
                            hs.k kVar2 = hs.k.f19476a;
                            gk.a.b(bundle2, "profile_goal_time_update");
                            return;
                        }
                        kotlin.jvm.internal.i.q("progressDialog");
                        throw null;
                    }
                }
                Utils utils = Utils.INSTANCE;
                String goalId4 = goal2.getGoalId();
                kotlin.jvm.internal.i.d(goalId4);
                if (utils.getGoalNotificationContent(goalId4) != null) {
                    if (z11) {
                        Context applicationContext = this$0.requireContext().getApplicationContext();
                        kotlin.jvm.internal.i.f(applicationContext, "requireContext().applicationContext");
                        long time = goal2.getmStartDate().getTime();
                        long time2 = goal2.getmScheduleDate().getTime();
                        String type = goal2.getType();
                        kotlin.jvm.internal.i.d(type);
                        String goalId5 = goal2.getGoalId();
                        kotlin.jvm.internal.i.d(goalId5);
                        String courseName = goal2.getCourseName();
                        kotlin.jvm.internal.i.d(courseName);
                        String goalName = goal2.getGoalName();
                        kotlin.jvm.internal.i.d(goalName);
                        Utils.updateActivityNotification$default(utils, applicationContext, false, time, time2, type, goalId5, courseName, goalName, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                        Context applicationContext2 = this$0.requireContext().getApplicationContext();
                        kotlin.jvm.internal.i.f(applicationContext2, "requireContext().applicationContext");
                        long time3 = goal2.getmStartDate().getTime();
                        long time4 = goal2.getmScheduleDate().getTime();
                        String type2 = goal2.getType();
                        kotlin.jvm.internal.i.d(type2);
                        String goalId6 = goal2.getGoalId();
                        kotlin.jvm.internal.i.d(goalId6);
                        String courseName2 = goal2.getCourseName();
                        kotlin.jvm.internal.i.d(courseName2);
                        String goalName2 = goal2.getGoalName();
                        kotlin.jvm.internal.i.d(goalName2);
                        Utils.updateActivityNotification$default(utils, applicationContext2, true, time3, time4, type2, goalId6, courseName2, goalName2, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                    } else {
                        Context applicationContext3 = this$0.requireContext().getApplicationContext();
                        kotlin.jvm.internal.i.f(applicationContext3, "requireContext().applicationContext");
                        long time5 = goal2.getmStartDate().getTime();
                        long time6 = goal2.getmScheduleDate().getTime();
                        String type3 = goal2.getType();
                        kotlin.jvm.internal.i.d(type3);
                        String goalId7 = goal2.getGoalId();
                        kotlin.jvm.internal.i.d(goalId7);
                        String courseName3 = goal2.getCourseName();
                        kotlin.jvm.internal.i.d(courseName3);
                        String goalName3 = goal2.getGoalName();
                        kotlin.jvm.internal.i.d(goalName3);
                        Utils.updateActivityNotification$default(utils, applicationContext3, false, time5, time6, type3, goalId7, courseName3, goalName3, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                    }
                    Date time7 = calendar.getTime();
                    kotlin.jvm.internal.i.f(time7, "calendar.time");
                    goal2.setmScheduleDate(time7);
                    FirebasePersistence.getInstance().updateGoal(goal2, Boolean.TRUE);
                    this$0.U(tv2, goal2);
                } else {
                    ProgressDialog progressDialog3 = this$0.f34316z;
                    if (progressDialog3 != null) {
                        progressDialog3.show();
                        v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new r(this$0, goal2, calendar, tv2, null), 3);
                    } else {
                        kotlin.jvm.internal.i.q("progressDialog");
                        throw null;
                    }
                }
                String str82 = gk.a.f16573a;
                Bundle bundle22 = new Bundle();
                bundle22.putString("course", goal2.getCourseName());
                bundle22.putString(Constants.GOAL_ID, goal2.getGoalId());
                bundle22.putString("variant", "new");
                bundle22.putBoolean("time_updated", z13);
                if (!b11) {
                }
                bundle22.putString("reminder_type", str5);
                if (!kotlin.jvm.internal.i.b(goal2.getType(), Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                }
                bundle22.putString("frequency", str6);
                hs.k kVar22 = hs.k.f19476a;
                gk.a.b(bundle22, "profile_goal_time_update");
                return;
        }
    }

    public /* synthetic */ d(k kVar, Goal goal, RobertoTextView robertoTextView, Calendar calendar) {
        this.f34270v = calendar;
        this.f34273y = goal;
        this.f34271w = kVar;
        this.f34272x = robertoTextView;
    }
}
