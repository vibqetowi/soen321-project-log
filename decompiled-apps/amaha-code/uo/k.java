package uo;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.l0;
import com.google.firebase.database.core.ValidationPath;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentProfileActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.FireStoreUtilsKt;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import fm.j0;
import hr.r9;
import is.w;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import so.b0;
import ta.v;
import uo.k;
import wo.y;
import wo.z;
/* compiled from: ExperimentNotificationsFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luo/k;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class k extends rr.b {
    public static final /* synthetic */ int E = 0;
    public y A;
    public final ArrayList<FirestoreGoal> B;
    public RobertoTextView C;
    public final LinkedHashMap D = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f34311u = LogHelper.INSTANCE.makeLogTag(k.class);

    /* renamed from: v  reason: collision with root package name */
    public final SimpleDateFormat f34312v = new SimpleDateFormat("hh:mm a");

    /* renamed from: w  reason: collision with root package name */
    public final SimpleDateFormat f34313w = new SimpleDateFormat("EEEE");

    /* renamed from: x  reason: collision with root package name */
    public final SimpleDateFormat f34314x = new SimpleDateFormat("dd MMMM yyyy");

    /* renamed from: y  reason: collision with root package name */
    public final boolean f34315y;

    /* renamed from: z  reason: collision with root package name */
    public ProgressDialog f34316z;

    /* compiled from: ExperimentNotificationsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<List<? extends FirestoreGoal>, hs.k> {
        public a() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:214:0x01ab A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:215:0x01f9 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:218:0x01b9 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01a8  */
        @Override // ss.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final hs.k invoke(List<? extends FirestoreGoal> list) {
            boolean z10;
            Iterator<FirestoreGoal> it;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            final k kVar = k.this;
            kVar.B.addAll(list);
            String currentCourse = FirebasePersistence.getInstance().getUser().getCurrentCourse();
            ArrayList<FirestoreGoal> arrayList = kVar.B;
            ArrayList arrayList2 = new ArrayList();
            Iterator<FirestoreGoal> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                FirestoreGoal next = it2.next();
                FirestoreGoal firestoreGoal = next;
                if (firestoreGoal.isVisible() && kotlin.jvm.internal.i.b(firestoreGoal.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY) && ((kotlin.jvm.internal.i.b(firestoreGoal.getCourseId(), currentCourse) || kotlin.jvm.internal.i.b(firestoreGoal.getCourseId(), Constants.LIBRARY_GOAL_COURSE_ID)) && firestoreGoal.getScheduledDate().getTime() != 0)) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (z15) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator<FirestoreGoal> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                FirestoreGoal next2 = it3.next();
                FirestoreGoal firestoreGoal2 = next2;
                if (firestoreGoal2.isVisible() && kotlin.jvm.internal.i.b(firestoreGoal2.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY) && kotlin.jvm.internal.i.b(firestoreGoal2.getCourseId(), "independent") && firestoreGoal2.getScheduledDate().getTime() != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14) {
                    arrayList3.add(next2);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator<FirestoreGoal> it4 = arrayList.iterator();
            while (it4.hasNext()) {
                FirestoreGoal next3 = it4.next();
                FirestoreGoal firestoreGoal3 = next3;
                if (firestoreGoal3.isVisible() && kotlin.jvm.internal.i.b(firestoreGoal3.getType(), Constants.GOAL_TYPE_ACTIVITY_ONCE) && ((kotlin.jvm.internal.i.b(firestoreGoal3.getCourseId(), currentCourse) || kotlin.jvm.internal.i.b(firestoreGoal3.getCourseId(), Constants.LIBRARY_GOAL_COURSE_ID)) && firestoreGoal3.getScheduledDate().getTime() != 0)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    arrayList4.add(next3);
                }
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator<FirestoreGoal> it5 = arrayList.iterator();
            while (it5.hasNext()) {
                FirestoreGoal next4 = it5.next();
                FirestoreGoal firestoreGoal4 = next4;
                if (firestoreGoal4.isVisible() && kotlin.jvm.internal.i.b(firestoreGoal4.getType(), Constants.GOAL_TYPE_ACTIVITY_ONCE) && kotlin.jvm.internal.i.b(firestoreGoal4.getCourseId(), "independent") && firestoreGoal4.getScheduledDate().getTime() != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    arrayList5.add(next4);
                }
            }
            ArrayList arrayList6 = new ArrayList();
            Iterator<FirestoreGoal> it6 = arrayList.iterator();
            while (it6.hasNext()) {
                FirestoreGoal next5 = it6.next();
                FirestoreGoal firestoreGoal5 = next5;
                if (firestoreGoal5.isVisible()) {
                    it = it6;
                    if (!is.k.Q1(firestoreGoal5.getType(), new String[]{Constants.GOAL_TYPE_ACTIVITY_WEEKLY, Constants.GOAL_TYPE_ACTIVITY_ONCE}) && ((kotlin.jvm.internal.i.b(firestoreGoal5.getCourseId(), currentCourse) || kotlin.jvm.internal.i.b(firestoreGoal5.getCourseId(), Constants.LIBRARY_GOAL_COURSE_ID)) && firestoreGoal5.getScheduledDate().getTime() != 0)) {
                        z11 = true;
                        if (!z11) {
                            arrayList6.add(next5);
                        }
                        it6 = it;
                    }
                } else {
                    it = it6;
                }
                z11 = false;
                if (!z11) {
                }
                it6 = it;
            }
            ArrayList arrayList7 = new ArrayList();
            Iterator<FirestoreGoal> it7 = arrayList.iterator();
            while (it7.hasNext()) {
                FirestoreGoal next6 = it7.next();
                FirestoreGoal firestoreGoal6 = next6;
                if (firestoreGoal6.isVisible()) {
                    if (!is.k.Q1(firestoreGoal6.getType(), new String[]{Constants.GOAL_TYPE_ACTIVITY_WEEKLY, Constants.GOAL_TYPE_ACTIVITY_ONCE}) && kotlin.jvm.internal.i.b(firestoreGoal6.getCourseId(), "independent")) {
                        if (firestoreGoal6.getScheduledDate().getTime() != 0) {
                            z10 = true;
                            if (z10) {
                                arrayList7.add(next6);
                            }
                        }
                        z10 = false;
                        if (z10) {
                        }
                    }
                }
                z10 = false;
                if (z10) {
                }
            }
            boolean z16 = !arrayList6.isEmpty();
            int i6 = R.id.activityReminderHeaderDailyContainer;
            int i10 = R.layout.row_notification_new;
            int i11 = R.id.tvRowGoalName;
            int i12 = R.id.tvRowGoalTime;
            if (z16) {
                Iterator it8 = arrayList6.iterator();
                while (it8.hasNext()) {
                    final FirestoreGoal firestoreGoal7 = (FirestoreGoal) it8.next();
                    View inflate = kVar.getLayoutInflater().inflate(R.layout.row_notification_new, (ViewGroup) ((LinearLayout) kVar._$_findCachedViewById(i6)), false);
                    RobertoTextView robertoTextView = (RobertoTextView) inflate.findViewById(R.id.tvRowGoalTime);
                    kotlin.jvm.internal.i.f(robertoTextView, "row.tvRowGoalTime");
                    kVar.X(robertoTextView, firestoreGoal7);
                    RobertoTextView robertoTextView2 = (RobertoTextView) inflate.findViewById(i11);
                    if (robertoTextView2 != null) {
                        robertoTextView2.setText(firestoreGoal7.getGoalName());
                    }
                    ((SwitchCompat) inflate.findViewById(R.id.switchRowGoalScheduleNotification)).setChecked(firestoreGoal7.getNotificationScheduled());
                    ((SwitchCompat) inflate.findViewById(R.id.switchRowGoalScheduleNotification)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: uo.b
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z17) {
                            String str;
                            String str2;
                            int i13 = r3;
                            FirestoreGoal goal = firestoreGoal7;
                            k this$0 = kVar;
                            switch (i13) {
                                case 0:
                                    String str3 = "profile_goal_toggle";
                                    int i14 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$goal");
                                    y yVar = this$0.A;
                                    if (yVar != null) {
                                        Iterator<FirestoreGoal> it9 = this$0.B.iterator();
                                        while (it9.hasNext()) {
                                            FirestoreGoal next7 = it9.next();
                                            Iterator<FirestoreGoal> it10 = it9;
                                            str = str3;
                                            if (kotlin.jvm.internal.i.b(next7.getGoalId(), goal.getGoalId())) {
                                                yVar.f(next7, z17);
                                            } else {
                                                it9 = it10;
                                                str3 = str;
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    str = str3;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("course", goal.getCourseName());
                                    bundle.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle.putBoolean("toggle", z17);
                                    bundle.putString("variant", "new");
                                    bundle.putString("reminder_type", "regular");
                                    bundle.putString("frequency", "daily");
                                    gk.a.b(bundle, str);
                                    return;
                                case 1:
                                    int i15 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$goal");
                                    y yVar2 = this$0.A;
                                    if (yVar2 != null) {
                                        Iterator<FirestoreGoal> it11 = this$0.B.iterator();
                                        while (it11.hasNext()) {
                                            FirestoreGoal next8 = it11.next();
                                            Iterator<FirestoreGoal> it12 = it11;
                                            if (kotlin.jvm.internal.i.b(next8.getGoalId(), goal.getGoalId())) {
                                                yVar2.f(next8, z17);
                                            } else {
                                                it11 = it12;
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("course", goal.getCourseName());
                                    bundle2.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle2.putBoolean("toggle", z17);
                                    bundle2.putString("variant", "new");
                                    bundle2.putString("reminder_type", "custom");
                                    bundle2.putString("frequency", "daily");
                                    gk.a.b(bundle2, "profile_goal_toggle");
                                    return;
                                case 2:
                                    String str4 = "profile_goal_toggle";
                                    int i16 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$weeklyGoal");
                                    y yVar3 = this$0.A;
                                    if (yVar3 != null) {
                                        Iterator<FirestoreGoal> it13 = this$0.B.iterator();
                                        while (it13.hasNext()) {
                                            FirestoreGoal next9 = it13.next();
                                            Iterator<FirestoreGoal> it14 = it13;
                                            str2 = str4;
                                            if (kotlin.jvm.internal.i.b(next9.getGoalId(), goal.getGoalId())) {
                                                yVar3.f(next9, z17);
                                            } else {
                                                it13 = it14;
                                                str4 = str2;
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    str2 = str4;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("course", goal.getCourseName());
                                    bundle3.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle3.putBoolean("toggle", z17);
                                    bundle3.putString("variant", "new");
                                    bundle3.putString("reminder_type", "regular");
                                    bundle3.putString("frequency", "weekly");
                                    gk.a.b(bundle3, str2);
                                    return;
                                case 3:
                                    int i17 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$weeklyGoal");
                                    y yVar4 = this$0.A;
                                    if (yVar4 != null) {
                                        Iterator<FirestoreGoal> it15 = this$0.B.iterator();
                                        while (it15.hasNext()) {
                                            FirestoreGoal next10 = it15.next();
                                            if (kotlin.jvm.internal.i.b(next10.getGoalId(), goal.getGoalId())) {
                                                yVar4.f(next10, z17);
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putString("course", goal.getCourseName());
                                    bundle4.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle4.putBoolean("toggle", z17);
                                    bundle4.putString("variant", "new");
                                    bundle4.putString("reminder_type", "custom");
                                    bundle4.putString("frequency", "weekly");
                                    gk.a.b(bundle4, "profile_goal_toggle");
                                    return;
                                case 4:
                                    int i18 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$oneTimeGoal");
                                    y yVar5 = this$0.A;
                                    if (yVar5 != null) {
                                        Iterator<FirestoreGoal> it16 = this$0.B.iterator();
                                        while (it16.hasNext()) {
                                            FirestoreGoal next11 = it16.next();
                                            Iterator<FirestoreGoal> it17 = it16;
                                            if (kotlin.jvm.internal.i.b(next11.getGoalId(), goal.getGoalId())) {
                                                yVar5.f(next11, z17);
                                            } else {
                                                it16 = it17;
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putString("course", goal.getCourseName());
                                    bundle5.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle5.putBoolean("toggle", z17);
                                    bundle5.putString("variant", "new");
                                    bundle5.putString("reminder_type", "regular");
                                    bundle5.putString("frequency", "one_time");
                                    gk.a.b(bundle5, "profile_goal_toggle");
                                    return;
                                default:
                                    int i19 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$oneTimeGoal");
                                    y yVar6 = this$0.A;
                                    if (yVar6 != null) {
                                        yVar6.f(goal, z17);
                                    }
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putString("course", goal.getCourseName());
                                    bundle6.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle6.putBoolean("toggle", z17);
                                    bundle6.putString("variant", "new");
                                    bundle6.putString("reminder_type", "custom");
                                    bundle6.putString("frequency", "one_time");
                                    gk.a.b(bundle6, "profile_goal_toggle");
                                    return;
                            }
                        }
                    });
                    ((LinearLayout) kVar._$_findCachedViewById(R.id.activityReminderHeaderDailyContainer)).addView(inflate);
                    i6 = R.id.activityReminderHeaderDailyContainer;
                    i11 = R.id.tvRowGoalName;
                }
            } else {
                ((LinearLayout) kVar._$_findCachedViewById(R.id.activityReminderHeaderDailyContainer)).setVisibility(8);
                ((RobertoTextView) kVar._$_findCachedViewById(R.id.activityReminderHeaderDaily)).setVisibility(8);
            }
            if (!arrayList7.isEmpty()) {
                Iterator it9 = arrayList7.iterator();
                while (it9.hasNext()) {
                    final FirestoreGoal firestoreGoal8 = (FirestoreGoal) it9.next();
                    View inflate2 = kVar.getLayoutInflater().inflate(R.layout.row_notification_new, (ViewGroup) ((LinearLayout) kVar._$_findCachedViewById(R.id.customReminderHeaderDailyContainer)), false);
                    RobertoTextView robertoTextView3 = (RobertoTextView) inflate2.findViewById(i12);
                    kotlin.jvm.internal.i.f(robertoTextView3, "row.tvRowGoalTime");
                    kVar.X(robertoTextView3, firestoreGoal8);
                    RobertoTextView robertoTextView4 = (RobertoTextView) inflate2.findViewById(R.id.tvRowGoalName);
                    if (robertoTextView4 != null) {
                        robertoTextView4.setText(firestoreGoal8.getGoalName());
                    }
                    ((SwitchCompat) inflate2.findViewById(R.id.switchRowGoalScheduleNotification)).setChecked(firestoreGoal8.getNotificationScheduled());
                    ((SwitchCompat) inflate2.findViewById(R.id.switchRowGoalScheduleNotification)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: uo.b
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z17) {
                            String str;
                            String str2;
                            int i13 = r3;
                            FirestoreGoal goal = firestoreGoal8;
                            k this$0 = kVar;
                            switch (i13) {
                                case 0:
                                    String str3 = "profile_goal_toggle";
                                    int i14 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$goal");
                                    y yVar = this$0.A;
                                    if (yVar != null) {
                                        Iterator<FirestoreGoal> it92 = this$0.B.iterator();
                                        while (it92.hasNext()) {
                                            FirestoreGoal next7 = it92.next();
                                            Iterator<FirestoreGoal> it10 = it92;
                                            str = str3;
                                            if (kotlin.jvm.internal.i.b(next7.getGoalId(), goal.getGoalId())) {
                                                yVar.f(next7, z17);
                                            } else {
                                                it92 = it10;
                                                str3 = str;
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    str = str3;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("course", goal.getCourseName());
                                    bundle.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle.putBoolean("toggle", z17);
                                    bundle.putString("variant", "new");
                                    bundle.putString("reminder_type", "regular");
                                    bundle.putString("frequency", "daily");
                                    gk.a.b(bundle, str);
                                    return;
                                case 1:
                                    int i15 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$goal");
                                    y yVar2 = this$0.A;
                                    if (yVar2 != null) {
                                        Iterator<FirestoreGoal> it11 = this$0.B.iterator();
                                        while (it11.hasNext()) {
                                            FirestoreGoal next8 = it11.next();
                                            Iterator<FirestoreGoal> it12 = it11;
                                            if (kotlin.jvm.internal.i.b(next8.getGoalId(), goal.getGoalId())) {
                                                yVar2.f(next8, z17);
                                            } else {
                                                it11 = it12;
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("course", goal.getCourseName());
                                    bundle2.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle2.putBoolean("toggle", z17);
                                    bundle2.putString("variant", "new");
                                    bundle2.putString("reminder_type", "custom");
                                    bundle2.putString("frequency", "daily");
                                    gk.a.b(bundle2, "profile_goal_toggle");
                                    return;
                                case 2:
                                    String str4 = "profile_goal_toggle";
                                    int i16 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$weeklyGoal");
                                    y yVar3 = this$0.A;
                                    if (yVar3 != null) {
                                        Iterator<FirestoreGoal> it13 = this$0.B.iterator();
                                        while (it13.hasNext()) {
                                            FirestoreGoal next9 = it13.next();
                                            Iterator<FirestoreGoal> it14 = it13;
                                            str2 = str4;
                                            if (kotlin.jvm.internal.i.b(next9.getGoalId(), goal.getGoalId())) {
                                                yVar3.f(next9, z17);
                                            } else {
                                                it13 = it14;
                                                str4 = str2;
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    str2 = str4;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("course", goal.getCourseName());
                                    bundle3.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle3.putBoolean("toggle", z17);
                                    bundle3.putString("variant", "new");
                                    bundle3.putString("reminder_type", "regular");
                                    bundle3.putString("frequency", "weekly");
                                    gk.a.b(bundle3, str2);
                                    return;
                                case 3:
                                    int i17 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$weeklyGoal");
                                    y yVar4 = this$0.A;
                                    if (yVar4 != null) {
                                        Iterator<FirestoreGoal> it15 = this$0.B.iterator();
                                        while (it15.hasNext()) {
                                            FirestoreGoal next10 = it15.next();
                                            if (kotlin.jvm.internal.i.b(next10.getGoalId(), goal.getGoalId())) {
                                                yVar4.f(next10, z17);
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putString("course", goal.getCourseName());
                                    bundle4.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle4.putBoolean("toggle", z17);
                                    bundle4.putString("variant", "new");
                                    bundle4.putString("reminder_type", "custom");
                                    bundle4.putString("frequency", "weekly");
                                    gk.a.b(bundle4, "profile_goal_toggle");
                                    return;
                                case 4:
                                    int i18 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$oneTimeGoal");
                                    y yVar5 = this$0.A;
                                    if (yVar5 != null) {
                                        Iterator<FirestoreGoal> it16 = this$0.B.iterator();
                                        while (it16.hasNext()) {
                                            FirestoreGoal next11 = it16.next();
                                            Iterator<FirestoreGoal> it17 = it16;
                                            if (kotlin.jvm.internal.i.b(next11.getGoalId(), goal.getGoalId())) {
                                                yVar5.f(next11, z17);
                                            } else {
                                                it16 = it17;
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putString("course", goal.getCourseName());
                                    bundle5.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle5.putBoolean("toggle", z17);
                                    bundle5.putString("variant", "new");
                                    bundle5.putString("reminder_type", "regular");
                                    bundle5.putString("frequency", "one_time");
                                    gk.a.b(bundle5, "profile_goal_toggle");
                                    return;
                                default:
                                    int i19 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$oneTimeGoal");
                                    y yVar6 = this$0.A;
                                    if (yVar6 != null) {
                                        yVar6.f(goal, z17);
                                    }
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putString("course", goal.getCourseName());
                                    bundle6.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle6.putBoolean("toggle", z17);
                                    bundle6.putString("variant", "new");
                                    bundle6.putString("reminder_type", "custom");
                                    bundle6.putString("frequency", "one_time");
                                    gk.a.b(bundle6, "profile_goal_toggle");
                                    return;
                            }
                        }
                    });
                    ((LinearLayout) kVar._$_findCachedViewById(R.id.customReminderHeaderDailyContainer)).addView(inflate2);
                    i12 = R.id.tvRowGoalTime;
                }
            } else {
                ((LinearLayout) kVar._$_findCachedViewById(R.id.customReminderHeaderDailyContainer)).setVisibility(8);
                ((RobertoTextView) kVar._$_findCachedViewById(R.id.customReminderHeaderDaily)).setVisibility(8);
            }
            if (!arrayList2.isEmpty()) {
                boolean z17 = false;
                ((LinearLayout) kVar._$_findCachedViewById(R.id.activityReminderHeaderWeeklyContainer)).setVisibility(0);
                ((RobertoTextView) kVar._$_findCachedViewById(R.id.activityReminderHeaderWeekly)).setVisibility(0);
                Iterator it10 = arrayList2.iterator();
                while (it10.hasNext()) {
                    final FirestoreGoal firestoreGoal9 = (FirestoreGoal) it10.next();
                    View inflate3 = kVar.getLayoutInflater().inflate(R.layout.row_notification_new, (LinearLayout) kVar._$_findCachedViewById(R.id.activityReminderHeaderWeeklyContainer), z17);
                    RobertoTextView robertoTextView5 = (RobertoTextView) inflate3.findViewById(R.id.tvRowGoalTime);
                    kotlin.jvm.internal.i.f(robertoTextView5, "row.tvRowGoalTime");
                    kVar.X(robertoTextView5, firestoreGoal9);
                    RobertoTextView robertoTextView6 = (RobertoTextView) inflate3.findViewById(R.id.tvRowGoalName);
                    if (robertoTextView6 != null) {
                        robertoTextView6.setText(firestoreGoal9.getGoalName());
                    }
                    ((SwitchCompat) inflate3.findViewById(R.id.switchRowGoalScheduleNotification)).setChecked(firestoreGoal9.getNotificationScheduled());
                    ((SwitchCompat) inflate3.findViewById(R.id.switchRowGoalScheduleNotification)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: uo.b
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z172) {
                            String str;
                            String str2;
                            int i13 = r3;
                            FirestoreGoal goal = firestoreGoal9;
                            k this$0 = kVar;
                            switch (i13) {
                                case 0:
                                    String str3 = "profile_goal_toggle";
                                    int i14 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$goal");
                                    y yVar = this$0.A;
                                    if (yVar != null) {
                                        Iterator<FirestoreGoal> it92 = this$0.B.iterator();
                                        while (it92.hasNext()) {
                                            FirestoreGoal next7 = it92.next();
                                            Iterator<FirestoreGoal> it102 = it92;
                                            str = str3;
                                            if (kotlin.jvm.internal.i.b(next7.getGoalId(), goal.getGoalId())) {
                                                yVar.f(next7, z172);
                                            } else {
                                                it92 = it102;
                                                str3 = str;
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    str = str3;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("course", goal.getCourseName());
                                    bundle.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle.putBoolean("toggle", z172);
                                    bundle.putString("variant", "new");
                                    bundle.putString("reminder_type", "regular");
                                    bundle.putString("frequency", "daily");
                                    gk.a.b(bundle, str);
                                    return;
                                case 1:
                                    int i15 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$goal");
                                    y yVar2 = this$0.A;
                                    if (yVar2 != null) {
                                        Iterator<FirestoreGoal> it11 = this$0.B.iterator();
                                        while (it11.hasNext()) {
                                            FirestoreGoal next8 = it11.next();
                                            Iterator<FirestoreGoal> it12 = it11;
                                            if (kotlin.jvm.internal.i.b(next8.getGoalId(), goal.getGoalId())) {
                                                yVar2.f(next8, z172);
                                            } else {
                                                it11 = it12;
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("course", goal.getCourseName());
                                    bundle2.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle2.putBoolean("toggle", z172);
                                    bundle2.putString("variant", "new");
                                    bundle2.putString("reminder_type", "custom");
                                    bundle2.putString("frequency", "daily");
                                    gk.a.b(bundle2, "profile_goal_toggle");
                                    return;
                                case 2:
                                    String str4 = "profile_goal_toggle";
                                    int i16 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$weeklyGoal");
                                    y yVar3 = this$0.A;
                                    if (yVar3 != null) {
                                        Iterator<FirestoreGoal> it13 = this$0.B.iterator();
                                        while (it13.hasNext()) {
                                            FirestoreGoal next9 = it13.next();
                                            Iterator<FirestoreGoal> it14 = it13;
                                            str2 = str4;
                                            if (kotlin.jvm.internal.i.b(next9.getGoalId(), goal.getGoalId())) {
                                                yVar3.f(next9, z172);
                                            } else {
                                                it13 = it14;
                                                str4 = str2;
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    str2 = str4;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("course", goal.getCourseName());
                                    bundle3.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle3.putBoolean("toggle", z172);
                                    bundle3.putString("variant", "new");
                                    bundle3.putString("reminder_type", "regular");
                                    bundle3.putString("frequency", "weekly");
                                    gk.a.b(bundle3, str2);
                                    return;
                                case 3:
                                    int i17 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$weeklyGoal");
                                    y yVar4 = this$0.A;
                                    if (yVar4 != null) {
                                        Iterator<FirestoreGoal> it15 = this$0.B.iterator();
                                        while (it15.hasNext()) {
                                            FirestoreGoal next10 = it15.next();
                                            if (kotlin.jvm.internal.i.b(next10.getGoalId(), goal.getGoalId())) {
                                                yVar4.f(next10, z172);
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putString("course", goal.getCourseName());
                                    bundle4.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle4.putBoolean("toggle", z172);
                                    bundle4.putString("variant", "new");
                                    bundle4.putString("reminder_type", "custom");
                                    bundle4.putString("frequency", "weekly");
                                    gk.a.b(bundle4, "profile_goal_toggle");
                                    return;
                                case 4:
                                    int i18 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$oneTimeGoal");
                                    y yVar5 = this$0.A;
                                    if (yVar5 != null) {
                                        Iterator<FirestoreGoal> it16 = this$0.B.iterator();
                                        while (it16.hasNext()) {
                                            FirestoreGoal next11 = it16.next();
                                            Iterator<FirestoreGoal> it17 = it16;
                                            if (kotlin.jvm.internal.i.b(next11.getGoalId(), goal.getGoalId())) {
                                                yVar5.f(next11, z172);
                                            } else {
                                                it16 = it17;
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putString("course", goal.getCourseName());
                                    bundle5.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle5.putBoolean("toggle", z172);
                                    bundle5.putString("variant", "new");
                                    bundle5.putString("reminder_type", "regular");
                                    bundle5.putString("frequency", "one_time");
                                    gk.a.b(bundle5, "profile_goal_toggle");
                                    return;
                                default:
                                    int i19 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$oneTimeGoal");
                                    y yVar6 = this$0.A;
                                    if (yVar6 != null) {
                                        yVar6.f(goal, z172);
                                    }
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putString("course", goal.getCourseName());
                                    bundle6.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle6.putBoolean("toggle", z172);
                                    bundle6.putString("variant", "new");
                                    bundle6.putString("reminder_type", "custom");
                                    bundle6.putString("frequency", "one_time");
                                    gk.a.b(bundle6, "profile_goal_toggle");
                                    return;
                            }
                        }
                    });
                    ((LinearLayout) kVar._$_findCachedViewById(R.id.activityReminderHeaderWeeklyContainer)).addView(inflate3);
                    z17 = false;
                }
            } else {
                ((LinearLayout) kVar._$_findCachedViewById(R.id.activityReminderHeaderWeeklyContainer)).setVisibility(8);
                ((RobertoTextView) kVar._$_findCachedViewById(R.id.activityReminderHeaderWeekly)).setVisibility(8);
            }
            if (!arrayList3.isEmpty()) {
                boolean z18 = false;
                ((LinearLayout) kVar._$_findCachedViewById(R.id.customReminderHeaderWeeklyContainer)).setVisibility(0);
                ((RobertoTextView) kVar._$_findCachedViewById(R.id.customReminderHeaderWeekly)).setVisibility(0);
                Iterator it11 = arrayList3.iterator();
                while (it11.hasNext()) {
                    final FirestoreGoal firestoreGoal10 = (FirestoreGoal) it11.next();
                    View inflate4 = kVar.getLayoutInflater().inflate(R.layout.row_notification_new, (LinearLayout) kVar._$_findCachedViewById(R.id.customReminderHeaderWeeklyContainer), z18);
                    RobertoTextView robertoTextView7 = (RobertoTextView) inflate4.findViewById(R.id.tvRowGoalTime);
                    kotlin.jvm.internal.i.f(robertoTextView7, "row.tvRowGoalTime");
                    kVar.X(robertoTextView7, firestoreGoal10);
                    RobertoTextView robertoTextView8 = (RobertoTextView) inflate4.findViewById(R.id.tvRowGoalName);
                    if (robertoTextView8 != null) {
                        robertoTextView8.setText(firestoreGoal10.getGoalName());
                    }
                    ((SwitchCompat) inflate4.findViewById(R.id.switchRowGoalScheduleNotification)).setChecked(firestoreGoal10.getNotificationScheduled());
                    ((SwitchCompat) inflate4.findViewById(R.id.switchRowGoalScheduleNotification)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: uo.b
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z172) {
                            String str;
                            String str2;
                            int i13 = r3;
                            FirestoreGoal goal = firestoreGoal10;
                            k this$0 = kVar;
                            switch (i13) {
                                case 0:
                                    String str3 = "profile_goal_toggle";
                                    int i14 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$goal");
                                    y yVar = this$0.A;
                                    if (yVar != null) {
                                        Iterator<FirestoreGoal> it92 = this$0.B.iterator();
                                        while (it92.hasNext()) {
                                            FirestoreGoal next7 = it92.next();
                                            Iterator<FirestoreGoal> it102 = it92;
                                            str = str3;
                                            if (kotlin.jvm.internal.i.b(next7.getGoalId(), goal.getGoalId())) {
                                                yVar.f(next7, z172);
                                            } else {
                                                it92 = it102;
                                                str3 = str;
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    str = str3;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("course", goal.getCourseName());
                                    bundle.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle.putBoolean("toggle", z172);
                                    bundle.putString("variant", "new");
                                    bundle.putString("reminder_type", "regular");
                                    bundle.putString("frequency", "daily");
                                    gk.a.b(bundle, str);
                                    return;
                                case 1:
                                    int i15 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$goal");
                                    y yVar2 = this$0.A;
                                    if (yVar2 != null) {
                                        Iterator<FirestoreGoal> it112 = this$0.B.iterator();
                                        while (it112.hasNext()) {
                                            FirestoreGoal next8 = it112.next();
                                            Iterator<FirestoreGoal> it12 = it112;
                                            if (kotlin.jvm.internal.i.b(next8.getGoalId(), goal.getGoalId())) {
                                                yVar2.f(next8, z172);
                                            } else {
                                                it112 = it12;
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("course", goal.getCourseName());
                                    bundle2.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle2.putBoolean("toggle", z172);
                                    bundle2.putString("variant", "new");
                                    bundle2.putString("reminder_type", "custom");
                                    bundle2.putString("frequency", "daily");
                                    gk.a.b(bundle2, "profile_goal_toggle");
                                    return;
                                case 2:
                                    String str4 = "profile_goal_toggle";
                                    int i16 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$weeklyGoal");
                                    y yVar3 = this$0.A;
                                    if (yVar3 != null) {
                                        Iterator<FirestoreGoal> it13 = this$0.B.iterator();
                                        while (it13.hasNext()) {
                                            FirestoreGoal next9 = it13.next();
                                            Iterator<FirestoreGoal> it14 = it13;
                                            str2 = str4;
                                            if (kotlin.jvm.internal.i.b(next9.getGoalId(), goal.getGoalId())) {
                                                yVar3.f(next9, z172);
                                            } else {
                                                it13 = it14;
                                                str4 = str2;
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    str2 = str4;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("course", goal.getCourseName());
                                    bundle3.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle3.putBoolean("toggle", z172);
                                    bundle3.putString("variant", "new");
                                    bundle3.putString("reminder_type", "regular");
                                    bundle3.putString("frequency", "weekly");
                                    gk.a.b(bundle3, str2);
                                    return;
                                case 3:
                                    int i17 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$weeklyGoal");
                                    y yVar4 = this$0.A;
                                    if (yVar4 != null) {
                                        Iterator<FirestoreGoal> it15 = this$0.B.iterator();
                                        while (it15.hasNext()) {
                                            FirestoreGoal next10 = it15.next();
                                            if (kotlin.jvm.internal.i.b(next10.getGoalId(), goal.getGoalId())) {
                                                yVar4.f(next10, z172);
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putString("course", goal.getCourseName());
                                    bundle4.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle4.putBoolean("toggle", z172);
                                    bundle4.putString("variant", "new");
                                    bundle4.putString("reminder_type", "custom");
                                    bundle4.putString("frequency", "weekly");
                                    gk.a.b(bundle4, "profile_goal_toggle");
                                    return;
                                case 4:
                                    int i18 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$oneTimeGoal");
                                    y yVar5 = this$0.A;
                                    if (yVar5 != null) {
                                        Iterator<FirestoreGoal> it16 = this$0.B.iterator();
                                        while (it16.hasNext()) {
                                            FirestoreGoal next11 = it16.next();
                                            Iterator<FirestoreGoal> it17 = it16;
                                            if (kotlin.jvm.internal.i.b(next11.getGoalId(), goal.getGoalId())) {
                                                yVar5.f(next11, z172);
                                            } else {
                                                it16 = it17;
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putString("course", goal.getCourseName());
                                    bundle5.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle5.putBoolean("toggle", z172);
                                    bundle5.putString("variant", "new");
                                    bundle5.putString("reminder_type", "regular");
                                    bundle5.putString("frequency", "one_time");
                                    gk.a.b(bundle5, "profile_goal_toggle");
                                    return;
                                default:
                                    int i19 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$oneTimeGoal");
                                    y yVar6 = this$0.A;
                                    if (yVar6 != null) {
                                        yVar6.f(goal, z172);
                                    }
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putString("course", goal.getCourseName());
                                    bundle6.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle6.putBoolean("toggle", z172);
                                    bundle6.putString("variant", "new");
                                    bundle6.putString("reminder_type", "custom");
                                    bundle6.putString("frequency", "one_time");
                                    gk.a.b(bundle6, "profile_goal_toggle");
                                    return;
                            }
                        }
                    });
                    ((LinearLayout) kVar._$_findCachedViewById(R.id.customReminderHeaderWeeklyContainer)).addView(inflate4);
                    z18 = false;
                }
            } else {
                ((LinearLayout) kVar._$_findCachedViewById(R.id.customReminderHeaderWeeklyContainer)).setVisibility(8);
                ((RobertoTextView) kVar._$_findCachedViewById(R.id.customReminderHeaderWeekly)).setVisibility(8);
            }
            if (!arrayList4.isEmpty()) {
                boolean z19 = false;
                ((LinearLayout) kVar._$_findCachedViewById(R.id.activityReminderHeaderOnetimeContainer)).setVisibility(0);
                ((RobertoTextView) kVar._$_findCachedViewById(R.id.activityReminderHeaderOnetime)).setVisibility(0);
                Iterator it12 = arrayList4.iterator();
                while (it12.hasNext()) {
                    final FirestoreGoal firestoreGoal11 = (FirestoreGoal) it12.next();
                    View inflate5 = kVar.getLayoutInflater().inflate(i10, (LinearLayout) kVar._$_findCachedViewById(R.id.activityReminderHeaderOnetimeContainer), z19);
                    RobertoTextView robertoTextView9 = (RobertoTextView) inflate5.findViewById(R.id.tvRowGoalTime);
                    kotlin.jvm.internal.i.f(robertoTextView9, "row.tvRowGoalTime");
                    kVar.X(robertoTextView9, firestoreGoal11);
                    RobertoTextView robertoTextView10 = (RobertoTextView) inflate5.findViewById(R.id.tvRowGoalName);
                    if (robertoTextView10 != null) {
                        robertoTextView10.setText(firestoreGoal11.getGoalName());
                    }
                    ((SwitchCompat) inflate5.findViewById(R.id.switchRowGoalScheduleNotification)).setChecked(firestoreGoal11.getNotificationScheduled());
                    ((SwitchCompat) inflate5.findViewById(R.id.switchRowGoalScheduleNotification)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: uo.b
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z172) {
                            String str;
                            String str2;
                            int i13 = r3;
                            FirestoreGoal goal = firestoreGoal11;
                            k this$0 = kVar;
                            switch (i13) {
                                case 0:
                                    String str3 = "profile_goal_toggle";
                                    int i14 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$goal");
                                    y yVar = this$0.A;
                                    if (yVar != null) {
                                        Iterator<FirestoreGoal> it92 = this$0.B.iterator();
                                        while (it92.hasNext()) {
                                            FirestoreGoal next7 = it92.next();
                                            Iterator<FirestoreGoal> it102 = it92;
                                            str = str3;
                                            if (kotlin.jvm.internal.i.b(next7.getGoalId(), goal.getGoalId())) {
                                                yVar.f(next7, z172);
                                            } else {
                                                it92 = it102;
                                                str3 = str;
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    str = str3;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("course", goal.getCourseName());
                                    bundle.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle.putBoolean("toggle", z172);
                                    bundle.putString("variant", "new");
                                    bundle.putString("reminder_type", "regular");
                                    bundle.putString("frequency", "daily");
                                    gk.a.b(bundle, str);
                                    return;
                                case 1:
                                    int i15 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$goal");
                                    y yVar2 = this$0.A;
                                    if (yVar2 != null) {
                                        Iterator<FirestoreGoal> it112 = this$0.B.iterator();
                                        while (it112.hasNext()) {
                                            FirestoreGoal next8 = it112.next();
                                            Iterator<FirestoreGoal> it122 = it112;
                                            if (kotlin.jvm.internal.i.b(next8.getGoalId(), goal.getGoalId())) {
                                                yVar2.f(next8, z172);
                                            } else {
                                                it112 = it122;
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("course", goal.getCourseName());
                                    bundle2.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle2.putBoolean("toggle", z172);
                                    bundle2.putString("variant", "new");
                                    bundle2.putString("reminder_type", "custom");
                                    bundle2.putString("frequency", "daily");
                                    gk.a.b(bundle2, "profile_goal_toggle");
                                    return;
                                case 2:
                                    String str4 = "profile_goal_toggle";
                                    int i16 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$weeklyGoal");
                                    y yVar3 = this$0.A;
                                    if (yVar3 != null) {
                                        Iterator<FirestoreGoal> it13 = this$0.B.iterator();
                                        while (it13.hasNext()) {
                                            FirestoreGoal next9 = it13.next();
                                            Iterator<FirestoreGoal> it14 = it13;
                                            str2 = str4;
                                            if (kotlin.jvm.internal.i.b(next9.getGoalId(), goal.getGoalId())) {
                                                yVar3.f(next9, z172);
                                            } else {
                                                it13 = it14;
                                                str4 = str2;
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    str2 = str4;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("course", goal.getCourseName());
                                    bundle3.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle3.putBoolean("toggle", z172);
                                    bundle3.putString("variant", "new");
                                    bundle3.putString("reminder_type", "regular");
                                    bundle3.putString("frequency", "weekly");
                                    gk.a.b(bundle3, str2);
                                    return;
                                case 3:
                                    int i17 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$weeklyGoal");
                                    y yVar4 = this$0.A;
                                    if (yVar4 != null) {
                                        Iterator<FirestoreGoal> it15 = this$0.B.iterator();
                                        while (it15.hasNext()) {
                                            FirestoreGoal next10 = it15.next();
                                            if (kotlin.jvm.internal.i.b(next10.getGoalId(), goal.getGoalId())) {
                                                yVar4.f(next10, z172);
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putString("course", goal.getCourseName());
                                    bundle4.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle4.putBoolean("toggle", z172);
                                    bundle4.putString("variant", "new");
                                    bundle4.putString("reminder_type", "custom");
                                    bundle4.putString("frequency", "weekly");
                                    gk.a.b(bundle4, "profile_goal_toggle");
                                    return;
                                case 4:
                                    int i18 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$oneTimeGoal");
                                    y yVar5 = this$0.A;
                                    if (yVar5 != null) {
                                        Iterator<FirestoreGoal> it16 = this$0.B.iterator();
                                        while (it16.hasNext()) {
                                            FirestoreGoal next11 = it16.next();
                                            Iterator<FirestoreGoal> it17 = it16;
                                            if (kotlin.jvm.internal.i.b(next11.getGoalId(), goal.getGoalId())) {
                                                yVar5.f(next11, z172);
                                            } else {
                                                it16 = it17;
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putString("course", goal.getCourseName());
                                    bundle5.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle5.putBoolean("toggle", z172);
                                    bundle5.putString("variant", "new");
                                    bundle5.putString("reminder_type", "regular");
                                    bundle5.putString("frequency", "one_time");
                                    gk.a.b(bundle5, "profile_goal_toggle");
                                    return;
                                default:
                                    int i19 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$oneTimeGoal");
                                    y yVar6 = this$0.A;
                                    if (yVar6 != null) {
                                        yVar6.f(goal, z172);
                                    }
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putString("course", goal.getCourseName());
                                    bundle6.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle6.putBoolean("toggle", z172);
                                    bundle6.putString("variant", "new");
                                    bundle6.putString("reminder_type", "custom");
                                    bundle6.putString("frequency", "one_time");
                                    gk.a.b(bundle6, "profile_goal_toggle");
                                    return;
                            }
                        }
                    });
                    ((LinearLayout) kVar._$_findCachedViewById(R.id.activityReminderHeaderOnetimeContainer)).addView(inflate5);
                    i10 = R.layout.row_notification_new;
                    z19 = false;
                }
            } else {
                ((LinearLayout) kVar._$_findCachedViewById(R.id.activityReminderHeaderOnetimeContainer)).setVisibility(8);
                ((RobertoTextView) kVar._$_findCachedViewById(R.id.activityReminderHeaderOnetime)).setVisibility(8);
            }
            if (!arrayList5.isEmpty()) {
                boolean z20 = false;
                ((LinearLayout) kVar._$_findCachedViewById(R.id.customReminderHeaderOnetimeContainer)).setVisibility(0);
                ((RobertoTextView) kVar._$_findCachedViewById(R.id.customReminderHeaderOnetime)).setVisibility(0);
                Iterator it13 = arrayList5.iterator();
                while (it13.hasNext()) {
                    final FirestoreGoal firestoreGoal12 = (FirestoreGoal) it13.next();
                    View inflate6 = kVar.getLayoutInflater().inflate(R.layout.row_notification_new, (LinearLayout) kVar._$_findCachedViewById(R.id.customReminderHeaderOnetimeContainer), z20);
                    RobertoTextView robertoTextView11 = (RobertoTextView) inflate6.findViewById(R.id.tvRowGoalTime);
                    kotlin.jvm.internal.i.f(robertoTextView11, "row.tvRowGoalTime");
                    kVar.X(robertoTextView11, firestoreGoal12);
                    RobertoTextView robertoTextView12 = (RobertoTextView) inflate6.findViewById(R.id.tvRowGoalName);
                    if (robertoTextView12 != null) {
                        robertoTextView12.setText(firestoreGoal12.getGoalName());
                    }
                    ((SwitchCompat) inflate6.findViewById(R.id.switchRowGoalScheduleNotification)).setChecked(firestoreGoal12.getNotificationScheduled());
                    ((SwitchCompat) inflate6.findViewById(R.id.switchRowGoalScheduleNotification)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: uo.b
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z172) {
                            String str;
                            String str2;
                            int i13 = r3;
                            FirestoreGoal goal = firestoreGoal12;
                            k this$0 = kVar;
                            switch (i13) {
                                case 0:
                                    String str3 = "profile_goal_toggle";
                                    int i14 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$goal");
                                    y yVar = this$0.A;
                                    if (yVar != null) {
                                        Iterator<FirestoreGoal> it92 = this$0.B.iterator();
                                        while (it92.hasNext()) {
                                            FirestoreGoal next7 = it92.next();
                                            Iterator<FirestoreGoal> it102 = it92;
                                            str = str3;
                                            if (kotlin.jvm.internal.i.b(next7.getGoalId(), goal.getGoalId())) {
                                                yVar.f(next7, z172);
                                            } else {
                                                it92 = it102;
                                                str3 = str;
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    str = str3;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("course", goal.getCourseName());
                                    bundle.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle.putBoolean("toggle", z172);
                                    bundle.putString("variant", "new");
                                    bundle.putString("reminder_type", "regular");
                                    bundle.putString("frequency", "daily");
                                    gk.a.b(bundle, str);
                                    return;
                                case 1:
                                    int i15 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$goal");
                                    y yVar2 = this$0.A;
                                    if (yVar2 != null) {
                                        Iterator<FirestoreGoal> it112 = this$0.B.iterator();
                                        while (it112.hasNext()) {
                                            FirestoreGoal next8 = it112.next();
                                            Iterator<FirestoreGoal> it122 = it112;
                                            if (kotlin.jvm.internal.i.b(next8.getGoalId(), goal.getGoalId())) {
                                                yVar2.f(next8, z172);
                                            } else {
                                                it112 = it122;
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("course", goal.getCourseName());
                                    bundle2.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle2.putBoolean("toggle", z172);
                                    bundle2.putString("variant", "new");
                                    bundle2.putString("reminder_type", "custom");
                                    bundle2.putString("frequency", "daily");
                                    gk.a.b(bundle2, "profile_goal_toggle");
                                    return;
                                case 2:
                                    String str4 = "profile_goal_toggle";
                                    int i16 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$weeklyGoal");
                                    y yVar3 = this$0.A;
                                    if (yVar3 != null) {
                                        Iterator<FirestoreGoal> it132 = this$0.B.iterator();
                                        while (it132.hasNext()) {
                                            FirestoreGoal next9 = it132.next();
                                            Iterator<FirestoreGoal> it14 = it132;
                                            str2 = str4;
                                            if (kotlin.jvm.internal.i.b(next9.getGoalId(), goal.getGoalId())) {
                                                yVar3.f(next9, z172);
                                            } else {
                                                it132 = it14;
                                                str4 = str2;
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    str2 = str4;
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("course", goal.getCourseName());
                                    bundle3.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle3.putBoolean("toggle", z172);
                                    bundle3.putString("variant", "new");
                                    bundle3.putString("reminder_type", "regular");
                                    bundle3.putString("frequency", "weekly");
                                    gk.a.b(bundle3, str2);
                                    return;
                                case 3:
                                    int i17 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$weeklyGoal");
                                    y yVar4 = this$0.A;
                                    if (yVar4 != null) {
                                        Iterator<FirestoreGoal> it15 = this$0.B.iterator();
                                        while (it15.hasNext()) {
                                            FirestoreGoal next10 = it15.next();
                                            if (kotlin.jvm.internal.i.b(next10.getGoalId(), goal.getGoalId())) {
                                                yVar4.f(next10, z172);
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putString("course", goal.getCourseName());
                                    bundle4.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle4.putBoolean("toggle", z172);
                                    bundle4.putString("variant", "new");
                                    bundle4.putString("reminder_type", "custom");
                                    bundle4.putString("frequency", "weekly");
                                    gk.a.b(bundle4, "profile_goal_toggle");
                                    return;
                                case 4:
                                    int i18 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$oneTimeGoal");
                                    y yVar5 = this$0.A;
                                    if (yVar5 != null) {
                                        Iterator<FirestoreGoal> it16 = this$0.B.iterator();
                                        while (it16.hasNext()) {
                                            FirestoreGoal next11 = it16.next();
                                            Iterator<FirestoreGoal> it17 = it16;
                                            if (kotlin.jvm.internal.i.b(next11.getGoalId(), goal.getGoalId())) {
                                                yVar5.f(next11, z172);
                                            } else {
                                                it16 = it17;
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putString("course", goal.getCourseName());
                                    bundle5.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle5.putBoolean("toggle", z172);
                                    bundle5.putString("variant", "new");
                                    bundle5.putString("reminder_type", "regular");
                                    bundle5.putString("frequency", "one_time");
                                    gk.a.b(bundle5, "profile_goal_toggle");
                                    return;
                                default:
                                    int i19 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(goal, "$oneTimeGoal");
                                    y yVar6 = this$0.A;
                                    if (yVar6 != null) {
                                        yVar6.f(goal, z172);
                                    }
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putString("course", goal.getCourseName());
                                    bundle6.putString(Constants.GOAL_ID, goal.getGoalId());
                                    bundle6.putBoolean("toggle", z172);
                                    bundle6.putString("variant", "new");
                                    bundle6.putString("reminder_type", "custom");
                                    bundle6.putString("frequency", "one_time");
                                    gk.a.b(bundle6, "profile_goal_toggle");
                                    return;
                            }
                        }
                    });
                    ((LinearLayout) kVar._$_findCachedViewById(R.id.customReminderHeaderOnetimeContainer)).addView(inflate6);
                    z20 = false;
                }
            } else {
                ((LinearLayout) kVar._$_findCachedViewById(R.id.customReminderHeaderOnetimeContainer)).setVisibility(8);
                ((RobertoTextView) kVar._$_findCachedViewById(R.id.customReminderHeaderOnetime)).setVisibility(8);
            }
            if (arrayList6.isEmpty() && arrayList2.isEmpty() && arrayList4.isEmpty()) {
                ((AppCompatImageView) kVar._$_findCachedViewById(R.id.regularNullAsset)).setVisibility(0);
                ((RobertoTextView) kVar._$_findCachedViewById(R.id.regularNullText)).setVisibility(0);
            }
            if (arrayList7.isEmpty() && arrayList3.isEmpty() && arrayList5.isEmpty()) {
                ((AppCompatImageView) kVar._$_findCachedViewById(R.id.customNullAsset)).setVisibility(0);
                ((RobertoTextView) kVar._$_findCachedViewById(R.id.customNullText)).setVisibility(0);
            }
            if (kVar.f34315y) {
                if (arrayList7.isEmpty() && arrayList3.isEmpty() && arrayList5.isEmpty()) {
                    ((AppCompatImageView) kVar._$_findCachedViewById(R.id.customNullAsset)).setVisibility(0);
                    ((RobertoTextView) kVar._$_findCachedViewById(R.id.customNullText)).setVisibility(0);
                }
            } else {
                ((ConstraintLayout) kVar._$_findCachedViewById(R.id.activityReminderLayout)).setVisibility(0);
                ((AppCompatImageView) kVar._$_findCachedViewById(R.id.activityReminderArrow)).setVisibility(4);
                ((RobertoTextView) kVar._$_findCachedViewById(R.id.customReminderHeader)).setVisibility(8);
                ((AppCompatImageView) kVar._$_findCachedViewById(R.id.customReminderArrow)).setVisibility(8);
                ((ConstraintLayout) kVar._$_findCachedViewById(R.id.customReminderLayout)).setVisibility(8);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentNotificationsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean it = bool;
            kotlin.jvm.internal.i.f(it, "it");
            boolean booleanValue = it.booleanValue();
            k kVar = k.this;
            if (booleanValue) {
                ProgressDialog progressDialog = kVar.f34316z;
                if (progressDialog != null) {
                    progressDialog.show();
                } else {
                    kotlin.jvm.internal.i.q("progressDialog");
                    throw null;
                }
            } else {
                ProgressDialog progressDialog2 = kVar.f34316z;
                if (progressDialog2 != null) {
                    progressDialog2.hide();
                } else {
                    kotlin.jvm.internal.i.q("progressDialog");
                    throw null;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentNotificationsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<FirestoreGoal, hs.k> {
        public c() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(FirestoreGoal firestoreGoal) {
            FirestoreGoal firestoreGoal2 = firestoreGoal;
            k kVar = k.this;
            Iterator<FirestoreGoal> it = kVar.B.iterator();
            int i6 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (kotlin.jvm.internal.i.b(it.next().getGoalId(), firestoreGoal2.getGoalId())) {
                        break;
                    }
                    i6++;
                } else {
                    i6 = -1;
                    break;
                }
            }
            ArrayList<FirestoreGoal> arrayList = kVar.B;
            if (i6 != -1) {
                arrayList.remove(i6);
            }
            arrayList.add(firestoreGoal2);
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentNotificationsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.l<FirestoreGoal, hs.k> {
        public d() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(FirestoreGoal firestoreGoal) {
            FirestoreGoal it = firestoreGoal;
            k kVar = k.this;
            Iterator<FirestoreGoal> it2 = kVar.B.iterator();
            int i6 = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (kotlin.jvm.internal.i.b(it2.next().getGoalId(), it.getGoalId())) {
                        break;
                    }
                    i6++;
                } else {
                    i6 = -1;
                    break;
                }
            }
            ArrayList<FirestoreGoal> arrayList = kVar.B;
            if (i6 != -1) {
                arrayList.remove(i6);
            }
            arrayList.add(it);
            RobertoTextView robertoTextView = kVar.C;
            if (robertoTextView != null) {
                kotlin.jvm.internal.i.f(it, "it");
                kVar.X(robertoTextView, it);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentNotificationsFragment.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.fragment.ExperimentNotificationsFragment$setGoalsNotificationsData$10$1", f = "ExperimentNotificationsFragment.kt", l = {905}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f34321u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Goal f34323w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f34324x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Goal goal, ls.d dVar, boolean z10) {
            super(2, dVar);
            this.f34323w = goal;
            this.f34324x = z10;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new e(this.f34323w, dVar, this.f34324x);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((e) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f34321u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                Goal instanceGoal = this.f34323w;
                kotlin.jvm.internal.i.f(instanceGoal, "instanceGoal");
                this.f34321u = 1;
                if (k.J(k.this, instanceGoal, this, this.f34324x) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentNotificationsFragment.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.fragment.ExperimentNotificationsFragment$setGoalsNotificationsData$10$2", f = "ExperimentNotificationsFragment.kt", l = {914}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f34325u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Goal f34327w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f34328x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Goal goal, ls.d dVar, boolean z10) {
            super(2, dVar);
            this.f34327w = goal;
            this.f34328x = z10;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new f(this.f34327w, dVar, this.f34328x);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((f) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f34325u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                Goal instanceGoal = this.f34327w;
                kotlin.jvm.internal.i.f(instanceGoal, "instanceGoal");
                this.f34325u = 1;
                if (k.K(k.this, instanceGoal, this, this.f34328x) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentNotificationsFragment.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.fragment.ExperimentNotificationsFragment$setGoalsNotificationsData$11$1", f = "ExperimentNotificationsFragment.kt", l = {947}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f34329u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Goal f34331w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f34332x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Goal goal, ls.d dVar, boolean z10) {
            super(2, dVar);
            this.f34331w = goal;
            this.f34332x = z10;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new g(this.f34331w, dVar, this.f34332x);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((g) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f34329u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                Goal instanceGoal = this.f34331w;
                kotlin.jvm.internal.i.f(instanceGoal, "instanceGoal");
                this.f34329u = 1;
                if (k.J(k.this, instanceGoal, this, this.f34332x) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentNotificationsFragment.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.fragment.ExperimentNotificationsFragment$setGoalsNotificationsData$11$2", f = "ExperimentNotificationsFragment.kt", l = {956}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f34333u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Goal f34335w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f34336x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Goal goal, ls.d dVar, boolean z10) {
            super(2, dVar);
            this.f34335w = goal;
            this.f34336x = z10;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new h(this.f34335w, dVar, this.f34336x);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((h) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f34333u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                Goal instanceGoal = this.f34335w;
                kotlin.jvm.internal.i.f(instanceGoal, "instanceGoal");
                this.f34333u = 1;
                if (k.K(k.this, instanceGoal, this, this.f34336x) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentNotificationsFragment.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.fragment.ExperimentNotificationsFragment$setGoalsNotificationsData$12$1", f = "ExperimentNotificationsFragment.kt", l = {990}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f34337u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Goal f34339w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f34340x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Goal goal, ls.d dVar, boolean z10) {
            super(2, dVar);
            this.f34339w = goal;
            this.f34340x = z10;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new i(this.f34339w, dVar, this.f34340x);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((i) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f34337u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                Goal instanceGoal = this.f34339w;
                kotlin.jvm.internal.i.f(instanceGoal, "instanceGoal");
                this.f34337u = 1;
                if (k.J(k.this, instanceGoal, this, this.f34340x) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentNotificationsFragment.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.fragment.ExperimentNotificationsFragment$setGoalsNotificationsData$12$2", f = "ExperimentNotificationsFragment.kt", l = {999}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f34341u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Goal f34343w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f34344x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Goal goal, ls.d dVar, boolean z10) {
            super(2, dVar);
            this.f34343w = goal;
            this.f34344x = z10;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new j(this.f34343w, dVar, this.f34344x);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((j) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f34341u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                Goal instanceGoal = this.f34343w;
                kotlin.jvm.internal.i.f(instanceGoal, "instanceGoal");
                this.f34341u = 1;
                if (k.K(k.this, instanceGoal, this, this.f34344x) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentNotificationsFragment.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.fragment.ExperimentNotificationsFragment$setGoalsNotificationsData$13$1", f = "ExperimentNotificationsFragment.kt", l = {1032}, m = "invokeSuspend")
    /* renamed from: uo.k$k  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0577k extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f34345u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Goal f34347w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f34348x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0577k(Goal goal, ls.d dVar, boolean z10) {
            super(2, dVar);
            this.f34347w = goal;
            this.f34348x = z10;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new C0577k(this.f34347w, dVar, this.f34348x);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((C0577k) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f34345u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                Goal instanceGoal = this.f34347w;
                kotlin.jvm.internal.i.f(instanceGoal, "instanceGoal");
                this.f34345u = 1;
                if (k.J(k.this, instanceGoal, this, this.f34348x) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentNotificationsFragment.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.fragment.ExperimentNotificationsFragment$setGoalsNotificationsData$13$2", f = "ExperimentNotificationsFragment.kt", l = {1041}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f34349u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Goal f34351w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f34352x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Goal goal, ls.d dVar, boolean z10) {
            super(2, dVar);
            this.f34351w = goal;
            this.f34352x = z10;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new l(this.f34351w, dVar, this.f34352x);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((l) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f34349u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                Goal instanceGoal = this.f34351w;
                kotlin.jvm.internal.i.f(instanceGoal, "instanceGoal");
                this.f34349u = 1;
                if (k.K(k.this, instanceGoal, this, this.f34352x) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentNotificationsFragment.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.fragment.ExperimentNotificationsFragment$setGoalsNotificationsData$8$1", f = "ExperimentNotificationsFragment.kt", l = {819}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class m extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f34353u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Goal f34355w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f34356x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Goal goal, ls.d dVar, boolean z10) {
            super(2, dVar);
            this.f34355w = goal;
            this.f34356x = z10;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new m(this.f34355w, dVar, this.f34356x);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((m) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f34353u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                Goal instanceGoal = this.f34355w;
                kotlin.jvm.internal.i.f(instanceGoal, "instanceGoal");
                this.f34353u = 1;
                if (k.J(k.this, instanceGoal, this, this.f34356x) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentNotificationsFragment.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.fragment.ExperimentNotificationsFragment$setGoalsNotificationsData$8$2", f = "ExperimentNotificationsFragment.kt", l = {831}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f34357u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Goal f34359w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f34360x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Goal goal, ls.d dVar, boolean z10) {
            super(2, dVar);
            this.f34359w = goal;
            this.f34360x = z10;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new n(this.f34359w, dVar, this.f34360x);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((n) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f34357u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                Goal instanceGoal = this.f34359w;
                kotlin.jvm.internal.i.f(instanceGoal, "instanceGoal");
                this.f34357u = 1;
                if (k.K(k.this, instanceGoal, this, this.f34360x) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentNotificationsFragment.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.fragment.ExperimentNotificationsFragment$setGoalsNotificationsData$9$1", f = "ExperimentNotificationsFragment.kt", l = {862}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class o extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f34361u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Goal f34363w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f34364x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Goal goal, ls.d dVar, boolean z10) {
            super(2, dVar);
            this.f34363w = goal;
            this.f34364x = z10;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new o(this.f34363w, dVar, this.f34364x);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((o) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f34361u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                Goal instanceGoal = this.f34363w;
                kotlin.jvm.internal.i.f(instanceGoal, "instanceGoal");
                this.f34361u = 1;
                if (k.J(k.this, instanceGoal, this, this.f34364x) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentNotificationsFragment.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.fragment.ExperimentNotificationsFragment$setGoalsNotificationsData$9$2", f = "ExperimentNotificationsFragment.kt", l = {871}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class p extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f34365u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Goal f34367w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f34368x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Goal goal, ls.d dVar, boolean z10) {
            super(2, dVar);
            this.f34367w = goal;
            this.f34368x = z10;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new p(this.f34367w, dVar, this.f34368x);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((p) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f34365u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                Goal instanceGoal = this.f34367w;
                kotlin.jvm.internal.i.f(instanceGoal, "instanceGoal");
                this.f34365u = 1;
                if (k.K(k.this, instanceGoal, this, this.f34368x) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: ExperimentNotificationsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class q extends ClickableSpan {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Calendar f34370v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ RobertoTextView f34371w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Goal f34372x;

        public q(Goal goal, RobertoTextView robertoTextView, Calendar calendar) {
            this.f34370v = calendar;
            this.f34371w = robertoTextView;
            this.f34372x = goal;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View widget) {
            Calendar calendar = this.f34370v;
            k kVar = k.this;
            kotlin.jvm.internal.i.g(widget, "widget");
            try {
                androidx.fragment.app.p activity = kVar.getActivity();
                kotlin.jvm.internal.i.d(activity);
                TimePickerDialog timePickerDialog = new TimePickerDialog(activity, new uo.m(kVar, this.f34371w, this.f34372x, 0), calendar.get(11), calendar.get(12), false);
                timePickerDialog.setTitle("Select Date");
                timePickerDialog.show();
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(kVar.f34311u, e10);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint ds2) {
            k kVar = k.this;
            kotlin.jvm.internal.i.g(ds2, "ds");
            try {
                super.updateDrawState(ds2);
                ds2.setUnderlineText(true);
                ds2.setColor(g0.a.b(kVar.requireContext(), R.color.sea));
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(kVar.f34311u, e10);
            }
        }
    }

    /* compiled from: ExperimentNotificationsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class r extends ClickableSpan {

        /* renamed from: y  reason: collision with root package name */
        public static final /* synthetic */ int f34373y = 0;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Calendar f34375v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ RobertoTextView f34376w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Goal f34377x;

        public r(Goal goal, RobertoTextView robertoTextView, Calendar calendar) {
            this.f34375v = calendar;
            this.f34376w = robertoTextView;
            this.f34377x = goal;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View widget) {
            Calendar calendar = this.f34375v;
            k kVar = k.this;
            kotlin.jvm.internal.i.g(widget, "widget");
            try {
                androidx.fragment.app.p activity = kVar.getActivity();
                kotlin.jvm.internal.i.d(activity);
                TimePickerDialog timePickerDialog = new TimePickerDialog(activity, new uo.m(kVar, this.f34376w, this.f34377x, 1), calendar.get(11), calendar.get(12), false);
                timePickerDialog.setTitle("Select Date");
                timePickerDialog.show();
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(kVar.f34311u, e10);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint ds2) {
            k kVar = k.this;
            kotlin.jvm.internal.i.g(ds2, "ds");
            try {
                super.updateDrawState(ds2);
                ds2.setUnderlineText(true);
                ds2.setColor(g0.a.b(kVar.requireContext(), R.color.sea));
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(kVar.f34311u, e10);
            }
        }
    }

    /* compiled from: ExperimentNotificationsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class s extends ClickableSpan {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Goal f34379v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ RobertoTextView f34380w;

        /* compiled from: ExperimentNotificationsFragment.kt */
        /* loaded from: classes2.dex */
        public static final class a extends kotlin.jvm.internal.k implements ss.l<Long, hs.k> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ Goal f34381u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ k f34382v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ RobertoTextView f34383w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k kVar, Goal goal, RobertoTextView robertoTextView) {
                super(1);
                this.f34381u = goal;
                this.f34382v = kVar;
                this.f34383w = robertoTextView;
            }

            /* JADX WARN: Removed duplicated region for block: B:51:0x0280  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x0283  */
            @Override // ss.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final hs.k invoke(Long l2) {
                Calendar calendar;
                boolean z10;
                String str;
                boolean b10;
                boolean notificationScheduled;
                boolean z11;
                String str2;
                long longValue = l2.longValue();
                k kVar = this.f34382v;
                Goal goal = this.f34381u;
                try {
                    calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(longValue);
                    if (((longValue / 1000) - goal.getScheduledDate().getTime()) % 86400 > 59.0d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    String goalId = goal.getGoalId();
                    if (goalId != null) {
                        str = goalId.substring(0, 7);
                        kotlin.jvm.internal.i.f(str, "this as java.lang.String…ing(startIndex, endIndex)");
                    } else {
                        str = null;
                    }
                    b10 = kotlin.jvm.internal.i.b(str, "custom_");
                    notificationScheduled = FirebasePersistence.getInstance().getGoalById(goal.getGoalId(), goal.getCourseId()).getNotificationScheduled();
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(kVar.f34311u, "exception", e10);
                }
                if (goal.getGoalId() != null) {
                    String goalId2 = goal.getGoalId();
                    kotlin.jvm.internal.i.d(goalId2);
                    if (goalId2.length() >= 7) {
                        String goalId3 = goal.getGoalId();
                        kotlin.jvm.internal.i.d(goalId3);
                        String substring = goalId3.substring(0, 7);
                        kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        if (kotlin.jvm.internal.i.b(substring, "custom_")) {
                            ProgressDialog progressDialog = kVar.f34316z;
                            if (progressDialog != null) {
                                progressDialog.show();
                                if (kotlin.jvm.internal.i.b(goal.getType(), Constants.GOAL_TYPE_ACTIVITY_ONCE) && longValue < Calendar.getInstance().getTimeInMillis()) {
                                    if (kVar.isAdded()) {
                                        ProgressDialog progressDialog2 = kVar.f34316z;
                                        if (progressDialog2 != null) {
                                            progressDialog2.dismiss();
                                            Toast.makeText(kVar.getContext(), "Can't set notification for the past!", 0).show();
                                        } else {
                                            kotlin.jvm.internal.i.q("progressDialog");
                                            throw null;
                                        }
                                    }
                                    z11 = b10;
                                } else {
                                    z11 = b10;
                                    ta.v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new uo.n(longValue, this.f34382v, this.f34381u, this.f34383w, null), 3);
                                }
                                String str3 = gk.a.f16573a;
                                Bundle bundle = new Bundle();
                                bundle.putString("course", goal.getCourseName());
                                bundle.putString(Constants.GOAL_ID, goal.getGoalId());
                                bundle.putString("variant", "new");
                                bundle.putBoolean("time_updated", z10);
                                if (!z11) {
                                    str2 = "custom";
                                } else {
                                    str2 = "regular";
                                }
                                bundle.putString("reminder_type", str2);
                                bundle.putString("frequency", "daily");
                                hs.k kVar2 = hs.k.f19476a;
                                gk.a.b(bundle, "profile_goal_time_update");
                                return hs.k.f19476a;
                            }
                            kotlin.jvm.internal.i.q("progressDialog");
                            throw null;
                        }
                    }
                }
                z11 = b10;
                if (is.k.Q1(goal.getType(), new String[]{Constants.GOAL_TYPE_RELAXATION_ACTIVITY, "physical_activity"})) {
                    RobertoTextView robertoTextView = this.f34383w;
                    int i6 = k.E;
                    kVar.getClass();
                    FireStoreUtilsKt.fetchSingleRecommendedActivity(goal.getGoalId(), new uo.s(kVar, goal, longValue, robertoTextView));
                } else {
                    Utils utils = Utils.INSTANCE;
                    String goalId4 = goal.getGoalId();
                    kotlin.jvm.internal.i.d(goalId4);
                    if (utils.getGoalNotificationContent(goalId4) != null) {
                        if (notificationScheduled) {
                            androidx.fragment.app.p activity = kVar.getActivity();
                            kotlin.jvm.internal.i.d(activity);
                            Context applicationContext = activity.getApplicationContext();
                            kotlin.jvm.internal.i.f(applicationContext, "activity!!.applicationContext");
                            long time = goal.getmStartDate().getTime();
                            long time2 = goal.getmScheduleDate().getTime();
                            String type = goal.getType();
                            kotlin.jvm.internal.i.d(type);
                            String goalId5 = goal.getGoalId();
                            kotlin.jvm.internal.i.d(goalId5);
                            String courseName = goal.getCourseName();
                            kotlin.jvm.internal.i.d(courseName);
                            String goalName = goal.getGoalName();
                            kotlin.jvm.internal.i.d(goalName);
                            Utils.updateActivityNotification$default(utils, applicationContext, false, time, time2, type, goalId5, courseName, goalName, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                            androidx.fragment.app.p activity2 = kVar.getActivity();
                            kotlin.jvm.internal.i.d(activity2);
                            Context applicationContext2 = activity2.getApplicationContext();
                            kotlin.jvm.internal.i.f(applicationContext2, "activity!!.applicationContext");
                            long time3 = goal.getmStartDate().getTime();
                            long time4 = goal.getmScheduleDate().getTime();
                            String type2 = goal.getType();
                            kotlin.jvm.internal.i.d(type2);
                            String goalId6 = goal.getGoalId();
                            kotlin.jvm.internal.i.d(goalId6);
                            String courseName2 = goal.getCourseName();
                            kotlin.jvm.internal.i.d(courseName2);
                            String goalName2 = goal.getGoalName();
                            kotlin.jvm.internal.i.d(goalName2);
                            Utils.updateActivityNotification$default(utils, applicationContext2, true, time3, time4, type2, goalId6, courseName2, goalName2, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                        } else {
                            androidx.fragment.app.p activity3 = kVar.getActivity();
                            kotlin.jvm.internal.i.d(activity3);
                            Context applicationContext3 = activity3.getApplicationContext();
                            kotlin.jvm.internal.i.f(applicationContext3, "activity!!.applicationContext");
                            long time5 = goal.getmStartDate().getTime();
                            long time6 = goal.getmScheduleDate().getTime();
                            String type3 = goal.getType();
                            kotlin.jvm.internal.i.d(type3);
                            String goalId7 = goal.getGoalId();
                            kotlin.jvm.internal.i.d(goalId7);
                            String courseName3 = goal.getCourseName();
                            kotlin.jvm.internal.i.d(courseName3);
                            String goalName3 = goal.getGoalName();
                            kotlin.jvm.internal.i.d(goalName3);
                            Utils.updateActivityNotification$default(utils, applicationContext3, false, time5, time6, type3, goalId7, courseName3, goalName3, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                        }
                        Date time7 = calendar.getTime();
                        kotlin.jvm.internal.i.f(time7, "calendar.time");
                        goal.setmScheduleDate(time7);
                        FirebasePersistence.getInstance().updateGoal(goal, Boolean.TRUE);
                        RobertoTextView robertoTextView2 = this.f34383w;
                        int i10 = k.E;
                        kVar.U(robertoTextView2, goal);
                    } else {
                        ProgressDialog progressDialog3 = kVar.f34316z;
                        if (progressDialog3 != null) {
                            progressDialog3.show();
                            ta.v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new uo.o(longValue, this.f34382v, this.f34381u, this.f34383w, null), 3);
                        } else {
                            kotlin.jvm.internal.i.q("progressDialog");
                            throw null;
                        }
                    }
                }
                String str32 = gk.a.f16573a;
                Bundle bundle2 = new Bundle();
                bundle2.putString("course", goal.getCourseName());
                bundle2.putString(Constants.GOAL_ID, goal.getGoalId());
                bundle2.putString("variant", "new");
                bundle2.putBoolean("time_updated", z10);
                if (!z11) {
                }
                bundle2.putString("reminder_type", str2);
                bundle2.putString("frequency", "daily");
                hs.k kVar22 = hs.k.f19476a;
                gk.a.b(bundle2, "profile_goal_time_update");
                return hs.k.f19476a;
            }
        }

        public s(Goal goal, RobertoTextView robertoTextView) {
            this.f34379v = goal;
            this.f34380w = robertoTextView;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View widget) {
            Goal goal = this.f34379v;
            k kVar = k.this;
            kotlin.jvm.internal.i.g(widget, "widget");
            try {
                k.M(kVar, goal.getmScheduleDate().getTime(), new a(kVar, goal, this.f34380w));
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(kVar.f34311u, e10);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint ds2) {
            k kVar = k.this;
            kotlin.jvm.internal.i.g(ds2, "ds");
            try {
                super.updateDrawState(ds2);
                ds2.setUnderlineText(true);
                ds2.setColor(g0.a.b(kVar.requireContext(), R.color.sea));
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(kVar.f34311u, e10);
            }
        }
    }

    /* compiled from: ExperimentNotificationsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class t extends ClickableSpan {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ k f34384u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Calendar f34385v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ RobertoTextView f34386w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ FirestoreGoal f34387x;

        public t(FirestoreGoal firestoreGoal, k kVar, RobertoTextView robertoTextView, Calendar calendar) {
            this.f34384u = kVar;
            this.f34385v = calendar;
            this.f34386w = robertoTextView;
            this.f34387x = firestoreGoal;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View widget) {
            Calendar calendar = this.f34385v;
            k kVar = this.f34384u;
            kotlin.jvm.internal.i.g(widget, "widget");
            try {
                androidx.fragment.app.p activity = kVar.getActivity();
                kotlin.jvm.internal.i.d(activity);
                TimePickerDialog timePickerDialog = new TimePickerDialog(activity, new uo.p(kVar, this.f34386w, this.f34387x, 0), calendar.get(11), calendar.get(12), false);
                timePickerDialog.setTitle("Select Date");
                timePickerDialog.show();
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(kVar.f34311u, e10);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint ds2) {
            k kVar = this.f34384u;
            kotlin.jvm.internal.i.g(ds2, "ds");
            try {
                super.updateDrawState(ds2);
                ds2.setUnderlineText(true);
                ds2.setColor(g0.a.b(kVar.requireContext(), R.color.sea));
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(kVar.f34311u, e10);
            }
        }
    }

    /* compiled from: ExperimentNotificationsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class u extends ClickableSpan {

        /* renamed from: y  reason: collision with root package name */
        public static final /* synthetic */ int f34388y = 0;

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ k f34389u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Calendar f34390v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ RobertoTextView f34391w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ FirestoreGoal f34392x;

        public u(FirestoreGoal firestoreGoal, k kVar, RobertoTextView robertoTextView, Calendar calendar) {
            this.f34389u = kVar;
            this.f34390v = calendar;
            this.f34391w = robertoTextView;
            this.f34392x = firestoreGoal;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View widget) {
            Calendar calendar = this.f34390v;
            k kVar = this.f34389u;
            kotlin.jvm.internal.i.g(widget, "widget");
            try {
                androidx.fragment.app.p activity = kVar.getActivity();
                kotlin.jvm.internal.i.d(activity);
                TimePickerDialog timePickerDialog = new TimePickerDialog(activity, new uo.p(kVar, this.f34391w, this.f34392x, 1), calendar.get(11), calendar.get(12), false);
                timePickerDialog.setTitle("Select Date");
                timePickerDialog.show();
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(kVar.f34311u, e10);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint ds2) {
            k kVar = this.f34389u;
            kotlin.jvm.internal.i.g(ds2, "ds");
            try {
                super.updateDrawState(ds2);
                ds2.setUnderlineText(true);
                ds2.setColor(g0.a.b(kVar.requireContext(), R.color.sea));
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(kVar.f34311u, e10);
            }
        }
    }

    /* compiled from: ExperimentNotificationsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class v extends ClickableSpan {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ k f34393u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ FirestoreGoal f34394v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ RobertoTextView f34395w;

        /* compiled from: ExperimentNotificationsFragment.kt */
        /* loaded from: classes2.dex */
        public static final class a extends kotlin.jvm.internal.k implements ss.l<Long, hs.k> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ k f34396u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ RobertoTextView f34397v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ FirestoreGoal f34398w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(FirestoreGoal firestoreGoal, k kVar, RobertoTextView robertoTextView) {
                super(1);
                this.f34396u = kVar;
                this.f34397v = robertoTextView;
                this.f34398w = firestoreGoal;
            }

            @Override // ss.l
            public final hs.k invoke(Long l2) {
                boolean z10;
                String str;
                long longValue = l2.longValue();
                k kVar = this.f34396u;
                try {
                    kVar.C = this.f34397v;
                    y yVar = kVar.A;
                    String str2 = null;
                    FirestoreGoal firestoreGoal = this.f34398w;
                    if (yVar != null) {
                        Iterator<FirestoreGoal> it = kVar.B.iterator();
                        while (it.hasNext()) {
                            FirestoreGoal next = it.next();
                            if (kotlin.jvm.internal.i.b(next.getGoalId(), firestoreGoal.getGoalId())) {
                                FirestoreGoal firestoreGoal2 = next;
                                kotlin.jvm.internal.i.g(firestoreGoal2, "firestoreGoal");
                                ta.v.H(kc.f.H(yVar), null, 0, new z(yVar, firestoreGoal2, longValue, null), 3);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    if (((longValue / 1000) - firestoreGoal.getScheduledDate().getTime()) % 86400 > 59.0d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    String goalId = firestoreGoal.getGoalId();
                    if (goalId != null) {
                        str2 = goalId.substring(0, 7);
                        kotlin.jvm.internal.i.f(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                    }
                    boolean b10 = kotlin.jvm.internal.i.b(str2, "custom_");
                    String str3 = gk.a.f16573a;
                    Bundle bundle = new Bundle();
                    bundle.putString("course", firestoreGoal.getCourseName());
                    bundle.putString(Constants.GOAL_ID, firestoreGoal.getGoalId());
                    bundle.putString("variant", "new");
                    bundle.putBoolean("time_updated", z10);
                    if (b10) {
                        str = "custom";
                    } else {
                        str = "regular";
                    }
                    bundle.putString("reminder_type", str);
                    bundle.putString("frequency", "daily");
                    hs.k kVar2 = hs.k.f19476a;
                    gk.a.b(bundle, "profile_goal_time_update");
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(kVar.f34311u, "exception", e10);
                }
                return hs.k.f19476a;
            }
        }

        public v(FirestoreGoal firestoreGoal, k kVar, RobertoTextView robertoTextView) {
            this.f34393u = kVar;
            this.f34394v = firestoreGoal;
            this.f34395w = robertoTextView;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View widget) {
            FirestoreGoal firestoreGoal = this.f34394v;
            k kVar = this.f34393u;
            kotlin.jvm.internal.i.g(widget, "widget");
            try {
                k.M(kVar, firestoreGoal.getScheduledDate().getTime() * 1000, new a(firestoreGoal, kVar, this.f34395w));
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(kVar.f34311u, e10);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint ds2) {
            k kVar = this.f34393u;
            kotlin.jvm.internal.i.g(ds2, "ds");
            try {
                super.updateDrawState(ds2);
                ds2.setUnderlineText(true);
                ds2.setColor(g0.a.b(kVar.requireContext(), R.color.sea));
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(kVar.f34311u, e10);
            }
        }
    }

    public k() {
        String str;
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null) {
            str = user.getVersion();
        } else {
            str = null;
        }
        this.f34315y = kotlin.jvm.internal.i.b(str, Constants.USER_VERSION);
        this.B = new ArrayList<>();
    }

    public static final Object J(k kVar, Goal goal, ls.d dVar, boolean z10) {
        kVar.getClass();
        Object S = ta.v.S(o0.f23642c, new uo.e(kVar, goal, null, z10), dVar);
        if (S != ms.a.COROUTINE_SUSPENDED) {
            return hs.k.f19476a;
        }
        return S;
    }

    public static final Object K(k kVar, Goal goal, ls.d dVar, boolean z10) {
        kVar.getClass();
        Object S = ta.v.S(o0.f23642c, new uo.g(kVar, goal, null, z10), dVar);
        if (S != ms.a.COROUTINE_SUSPENDED) {
            return hs.k.f19476a;
        }
        return S;
    }

    public static final void M(k kVar, long j10, ss.l lVar) {
        kVar.getClass();
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j10);
            TimePickerDialog timePickerDialog = new TimePickerDialog(kVar.requireContext(), new r9(calendar, lVar, 3), calendar.get(11), calendar.get(12), false);
            timePickerDialog.setTitle("Select Time");
            timePickerDialog.show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(kVar.f34311u, e10);
        }
    }

    public static final void O(k kVar, Goal goal, RobertoTextView robertoTextView, Calendar calendar) {
        try {
            DatePickerDialog datePickerDialog = new DatePickerDialog(kVar.requireContext(), new uo.d(kVar, goal, robertoTextView, calendar), calendar.get(1), calendar.get(2), calendar.get(5));
            DatePicker datePicker = datePickerDialog.getDatePicker();
            Utils utils = Utils.INSTANCE;
            long j10 = 1000;
            datePicker.setMinDate(utils.getTodayTimeInSeconds() * j10);
            if (kotlin.jvm.internal.i.b(goal.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                datePickerDialog.getDatePicker().setMaxDate((utils.getTodayTimeInSeconds() + 604800) * j10);
            }
            datePickerDialog.setTitle("Select Day");
            datePickerDialog.show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(kVar.f34311u, e10);
        }
    }

    public static final void P(FirestoreGoal firestoreGoal, k kVar, RobertoTextView robertoTextView, Calendar calendar) {
        DatePickerDialog datePickerDialog = new DatePickerDialog(kVar.requireContext(), new uo.d(firestoreGoal, kVar, robertoTextView, calendar), calendar.get(1), calendar.get(2), calendar.get(5));
        DatePicker datePicker = datePickerDialog.getDatePicker();
        Utils utils = Utils.INSTANCE;
        long j10 = 1000;
        datePicker.setMinDate(utils.getTodayTimeInSeconds() * j10);
        if (kotlin.jvm.internal.i.b(firestoreGoal.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
            datePickerDialog.getDatePicker().setMaxDate((utils.getTodayTimeInSeconds() + 604800) * j10);
        }
        datePickerDialog.setTitle("Select Day");
        datePickerDialog.show();
    }

    public final void Q(boolean z10, boolean z11) {
        try {
            if (z10) {
                if (z11) {
                    AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.activityReminderArrow);
                    if (appCompatImageView != null) {
                        appCompatImageView.startAnimation(Utils.INSTANCE.rotateBy180(0.0f, 180.0f));
                    }
                } else {
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.activityReminderArrow);
                    if (appCompatImageView2 != null) {
                        appCompatImageView2.startAnimation(Utils.INSTANCE.rotateBy180(180.0f, 360.0f));
                    }
                }
            } else if (z11) {
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) _$_findCachedViewById(R.id.customReminderArrow);
                if (appCompatImageView3 != null) {
                    appCompatImageView3.startAnimation(Utils.INSTANCE.rotateBy180(0.0f, 180.0f));
                }
            } else {
                AppCompatImageView appCompatImageView4 = (AppCompatImageView) _$_findCachedViewById(R.id.customReminderArrow);
                if (appCompatImageView4 != null) {
                    appCompatImageView4.startAnimation(Utils.INSTANCE.rotateBy180(180.0f, 360.0f));
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f34311u, "exception", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:261:0x01ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0267 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b7 A[Catch: Exception -> 0x070a, TryCatch #0 {Exception -> 0x070a, blocks: (B:3:0x0002, B:6:0x0036, B:7:0x0042, B:9:0x0048, B:11:0x0055, B:13:0x005f, B:15:0x0069, B:17:0x0073, B:22:0x0084, B:23:0x0088, B:24:0x0091, B:26:0x0097, B:28:0x00a4, B:30:0x00ae, B:32:0x00b8, B:37:0x00c9, B:38:0x00cd, B:39:0x00d6, B:42:0x00de, B:44:0x00ec, B:46:0x00f6, B:48:0x0100, B:50:0x010a, B:55:0x011b, B:56:0x011f, B:57:0x0128, B:59:0x012e, B:61:0x013c, B:63:0x0146, B:65:0x0150, B:70:0x0161, B:71:0x0165, B:72:0x016e, B:74:0x0174, B:76:0x0182, B:78:0x0190, B:80:0x019a, B:82:0x01a4, B:87:0x01b7, B:89:0x01bd, B:90:0x01c6, B:92:0x01cc, B:94:0x01d9, B:96:0x01e7, B:98:0x01f1, B:103:0x0204, B:126:0x026f, B:129:0x0285, B:130:0x0289, B:132:0x028f, B:136:0x02c2, B:135:0x02bb, B:138:0x0311, B:140:0x031c, B:141:0x0320, B:143:0x0326, B:147:0x035a, B:146:0x0353, B:150:0x03a3, B:156:0x03b4, B:157:0x03cb, B:159:0x03d1, B:163:0x0408, B:162:0x0401, B:165:0x0449, B:171:0x045a, B:172:0x0471, B:174:0x0477, B:178:0x04ae, B:177:0x04a7, B:180:0x04ee, B:186:0x04fc, B:187:0x0516, B:189:0x051c, B:193:0x0553, B:192:0x054c, B:195:0x0596, B:201:0x05a6, B:202:0x05c0, B:204:0x05c6, B:208:0x05fd, B:207:0x05f6, B:210:0x0643, B:212:0x0649, B:214:0x064f, B:216:0x0655, B:217:0x066e, B:219:0x0674, B:221:0x067a, B:223:0x0680, B:224:0x0699, B:226:0x069d, B:228:0x06a3, B:230:0x06a9, B:232:0x06af, B:233:0x06c9, B:209:0x062c, B:194:0x057f, B:179:0x04da, B:164:0x0435, B:149:0x038b, B:137:0x02f7, B:105:0x020b, B:106:0x0217, B:108:0x021d, B:110:0x022a, B:112:0x0234, B:114:0x023e, B:116:0x0248, B:118:0x0252, B:124:0x0267), top: B:238:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S() {
        ArrayList<Goal> arrayList;
        List<Goal> list;
        List<Goal> list2;
        List<Goal> list3;
        List<Goal> list4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        try {
            List<Goal> goals = FirebasePersistence.getInstance().getUserGoals();
            List<Goal> list5 = w.f20676u;
            String currentCourse = FirebasePersistence.getInstance().getUser().getCurrentCourse();
            if (kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getVersion(), Constants.USER_VERSION)) {
                kotlin.jvm.internal.i.f(goals, "goals");
                List arrayList2 = new ArrayList();
                for (Object obj : goals) {
                    Goal goal = (Goal) obj;
                    if (goal.isVisible() && kotlin.jvm.internal.i.b(goal.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY) && ((kotlin.jvm.internal.i.b(goal.getCourseId(), currentCourse) || kotlin.jvm.internal.i.b(goal.getCourseId(), Constants.LIBRARY_GOAL_COURSE_ID)) && goal.getScheduledDate().getTime() != 0)) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    if (z20) {
                        arrayList2.add(obj);
                    }
                }
                list2 = new ArrayList();
                for (Object obj2 : goals) {
                    Goal goal2 = (Goal) obj2;
                    if (goal2.isVisible() && kotlin.jvm.internal.i.b(goal2.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY) && kotlin.jvm.internal.i.b(goal2.getCourseId(), "independent") && goal2.getScheduledDate().getTime() != 0) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (z19) {
                        list2.add(obj2);
                    }
                }
                list3 = new ArrayList();
                for (Object obj3 : goals) {
                    Goal goal3 = (Goal) obj3;
                    if (goal3.isVisible() && kotlin.jvm.internal.i.b(goal3.getType(), Constants.GOAL_TYPE_ACTIVITY_ONCE) && ((kotlin.jvm.internal.i.b(goal3.getCourseId(), currentCourse) || kotlin.jvm.internal.i.b(goal3.getCourseId(), Constants.LIBRARY_GOAL_COURSE_ID)) && goal3.getScheduledDate().getTime() != 0)) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        list3.add(obj3);
                    }
                }
                list4 = new ArrayList();
                for (Object obj4 : goals) {
                    Goal goal4 = (Goal) obj4;
                    if (goal4.isVisible() && kotlin.jvm.internal.i.b(goal4.getType(), Constants.GOAL_TYPE_ACTIVITY_ONCE) && kotlin.jvm.internal.i.b(goal4.getCourseId(), "independent") && goal4.getScheduledDate().getTime() != 0) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        list4.add(obj4);
                    }
                }
                arrayList = new ArrayList();
                for (Object obj5 : goals) {
                    Goal goal5 = (Goal) obj5;
                    if (goal5.isVisible()) {
                        if (!is.k.Q1(goal5.getType(), new String[]{Constants.GOAL_TYPE_ACTIVITY_WEEKLY, Constants.GOAL_TYPE_ACTIVITY_ONCE}) && ((kotlin.jvm.internal.i.b(goal5.getCourseId(), currentCourse) || kotlin.jvm.internal.i.b(goal5.getCourseId(), Constants.LIBRARY_GOAL_COURSE_ID)) && goal5.getScheduledDate().getTime() != 0)) {
                            z16 = true;
                            if (!z16) {
                                arrayList.add(obj5);
                            }
                        }
                    }
                    z16 = false;
                    if (!z16) {
                    }
                }
                List arrayList3 = new ArrayList();
                for (Object obj6 : goals) {
                    Goal goal6 = (Goal) obj6;
                    if (goal6.isVisible()) {
                        if (!is.k.Q1(goal6.getType(), new String[]{Constants.GOAL_TYPE_ACTIVITY_WEEKLY, Constants.GOAL_TYPE_ACTIVITY_ONCE}) && kotlin.jvm.internal.i.b(goal6.getCourseId(), "independent") && goal6.getScheduledDate().getTime() != 0) {
                            z15 = true;
                            if (!z15) {
                                arrayList3.add(obj6);
                            }
                        }
                    }
                    z15 = false;
                    if (!z15) {
                    }
                }
                list = arrayList2;
                list5 = arrayList3;
            } else {
                kotlin.jvm.internal.i.f(goals, "goals");
                arrayList = new ArrayList();
                for (Object obj7 : goals) {
                    Goal goal7 = (Goal) obj7;
                    if (goal7.isVisible() && !kotlin.jvm.internal.i.b(goal7.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY) && (kotlin.jvm.internal.i.b(goal7.getCourseId(), currentCourse) || kotlin.jvm.internal.i.b(goal7.getCourseId(), "independent") || kotlin.jvm.internal.i.b(goal7.getCourseId(), Constants.LIBRARY_GOAL_COURSE_ID))) {
                        if (goal7.getScheduledDate().getTime() != 0) {
                            z10 = true;
                            if (!z10) {
                                arrayList.add(obj7);
                            }
                        }
                    }
                    z10 = false;
                    if (!z10) {
                    }
                }
                list = list5;
                list2 = list;
                list3 = list2;
                list4 = list3;
            }
            boolean z21 = !arrayList.isEmpty();
            int i6 = R.id.activityReminderHeaderDailyContainer;
            int i10 = R.id.tvRowGoalName;
            int i11 = R.id.tvRowGoalTime;
            int i12 = R.layout.row_notification_new;
            if (z21) {
                for (final Goal goal8 : arrayList) {
                    View inflate = getLayoutInflater().inflate(R.layout.row_notification_new, (ViewGroup) ((LinearLayout) _$_findCachedViewById(i6)), false);
                    RobertoTextView robertoTextView = (RobertoTextView) inflate.findViewById(R.id.tvRowGoalTime);
                    kotlin.jvm.internal.i.f(robertoTextView, "row.tvRowGoalTime");
                    U(robertoTextView, goal8);
                    RobertoTextView robertoTextView2 = (RobertoTextView) inflate.findViewById(i10);
                    if (robertoTextView2 != null) {
                        robertoTextView2.setText(goal8.getGoalName());
                    }
                    ((SwitchCompat) inflate.findViewById(R.id.switchRowGoalScheduleNotification)).setChecked(goal8.getNotificationScheduled());
                    ((SwitchCompat) inflate.findViewById(R.id.switchRowGoalScheduleNotification)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: uo.c
                        /* JADX WARN: Removed duplicated region for block: B:107:0x06ae  */
                        /* JADX WARN: Removed duplicated region for block: B:108:0x072b  */
                        /* JADX WARN: Removed duplicated region for block: B:136:0x0840  */
                        /* JADX WARN: Removed duplicated region for block: B:137:0x08ba  */
                        /* JADX WARN: Removed duplicated region for block: B:41:0x024d  */
                        /* JADX WARN: Removed duplicated region for block: B:42:0x02c4  */
                        /* JADX WARN: Removed duplicated region for block: B:63:0x03bf  */
                        /* JADX WARN: Removed duplicated region for block: B:64:0x0439  */
                        /* JADX WARN: Removed duplicated region for block: B:85:0x0534  */
                        /* JADX WARN: Removed duplicated region for block: B:86:0x05b1  */
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z22) {
                            String str;
                            Utils utils;
                            String goalId;
                            String str2;
                            String str3;
                            String str4;
                            String str5;
                            String str6;
                            boolean z23;
                            String str7;
                            String str8;
                            String str9;
                            String str10;
                            Utils utils2;
                            String goalId2;
                            String str11;
                            String str12;
                            String str13;
                            String str14;
                            String str15;
                            String str16;
                            String str17;
                            String str18;
                            String str19;
                            Utils utils3;
                            String goalId3;
                            String str20;
                            String str21;
                            String str22;
                            String str23;
                            String str24;
                            String str25;
                            String str26;
                            String str27;
                            String str28;
                            Utils utils4;
                            String goalId4;
                            String str29;
                            String str30;
                            String str31;
                            String str32;
                            String str33;
                            String str34;
                            boolean z24;
                            String str35;
                            String str36;
                            String str37;
                            Goal goal9;
                            String str38;
                            String str39;
                            String str40;
                            String str41;
                            String str42;
                            String str43;
                            String str44;
                            String str45;
                            String str46;
                            Utils utils5;
                            String goalId5;
                            String str47;
                            String str48;
                            String str49;
                            String str50;
                            boolean z25;
                            String str51;
                            String str52;
                            String str53;
                            String str54;
                            boolean z26 = z22;
                            int i13 = r3;
                            k this$0 = this;
                            Goal goal10 = goal8;
                            switch (i13) {
                                case 0:
                                    int i14 = k.E;
                                    kotlin.jvm.internal.i.g(goal10, "$goal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById = FirebasePersistence.getInstance().getGoalById(goal10.getGoalId(), goal10.getCourseId());
                                    if (goal10.getGoalId() != null) {
                                        String goalId6 = goal10.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId6);
                                        if (goalId6.length() >= 7) {
                                            String goalId7 = goal10.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId7);
                                            str = "reminder_type";
                                            String substring = goalId7.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring, "custom_")) {
                                                ProgressDialog progressDialog = this$0.f34316z;
                                                if (progressDialog != null) {
                                                    progressDialog.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.m(goalById, null, z26), 3);
                                                    str2 = "variant";
                                                    str3 = "new";
                                                    str4 = "toggle";
                                                    str5 = Constants.GOAL_ID;
                                                    str6 = "course";
                                                    z23 = z26;
                                                    str7 = "regular";
                                                    str8 = str;
                                                    str9 = "daily";
                                                    Bundle bundle = new Bundle();
                                                    bundle.putString(str6, goal10.getCourseName());
                                                    bundle.putString(str5, goal10.getGoalId());
                                                    bundle.putBoolean(str4, z23);
                                                    bundle.putString(str2, str3);
                                                    bundle.putString(str8, str7);
                                                    bundle.putString("frequency", str9);
                                                    gk.a.b(bundle, "profile_goal_toggle");
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                            utils = Utils.INSTANCE;
                                            goalId = goal10.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId);
                                            if (utils.getGoalNotificationContent(goalId) != null) {
                                                str2 = "variant";
                                                str3 = "new";
                                                str4 = "toggle";
                                                str5 = Constants.GOAL_ID;
                                                str6 = "course";
                                                z23 = z26;
                                                str7 = "regular";
                                                str8 = str;
                                                str9 = "daily";
                                                if (is.k.Q1(goal10.getType(), new String[]{Constants.GOAL_TYPE_RELAXATION_ACTIVITY, "physical_activity"})) {
                                                    ProgressDialog progressDialog2 = this$0.f34316z;
                                                    if (progressDialog2 != null) {
                                                        progressDialog2.show();
                                                        FireStoreUtilsKt.fetchSingleRecommendedActivity(goal10.getGoalId(), new l(this$0, z23, goal10));
                                                    } else {
                                                        kotlin.jvm.internal.i.q("progressDialog");
                                                        throw null;
                                                    }
                                                } else {
                                                    ProgressDialog progressDialog3 = this$0.f34316z;
                                                    if (progressDialog3 != null) {
                                                        progressDialog3.show();
                                                        v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.n(goalById, null, z23), 3);
                                                    } else {
                                                        kotlin.jvm.internal.i.q("progressDialog");
                                                        throw null;
                                                    }
                                                }
                                            } else {
                                                Context applicationContext = this$0.requireContext().getApplicationContext();
                                                kotlin.jvm.internal.i.f(applicationContext, "requireContext().applicationContext");
                                                long time = goalById.getmStartDate().getTime();
                                                long time2 = goalById.getmScheduleDate().getTime();
                                                String type = goalById.getType();
                                                kotlin.jvm.internal.i.d(type);
                                                String goalId8 = goalById.getGoalId();
                                                kotlin.jvm.internal.i.d(goalId8);
                                                String courseName = goalById.getCourseName();
                                                kotlin.jvm.internal.i.d(courseName);
                                                String goalName = goalById.getGoalName();
                                                kotlin.jvm.internal.i.d(goalName);
                                                str8 = str;
                                                str9 = "daily";
                                                str2 = "variant";
                                                str3 = "new";
                                                str4 = "toggle";
                                                str5 = Constants.GOAL_ID;
                                                str6 = "course";
                                                str7 = "regular";
                                                Utils.updateActivityNotification$default(utils, applicationContext, z22, time, time2, type, goalId8, courseName, goalName, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                                z23 = z22;
                                                goal10.setNotificationScheduled(z23);
                                                FirebasePersistence.getInstance().updateGoal(goal10, Boolean.TRUE);
                                            }
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putString(str6, goal10.getCourseName());
                                            bundle2.putString(str5, goal10.getGoalId());
                                            bundle2.putBoolean(str4, z23);
                                            bundle2.putString(str2, str3);
                                            bundle2.putString(str8, str7);
                                            bundle2.putString("frequency", str9);
                                            gk.a.b(bundle2, "profile_goal_toggle");
                                            return;
                                        }
                                    }
                                    str = "reminder_type";
                                    utils = Utils.INSTANCE;
                                    goalId = goal10.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId);
                                    if (utils.getGoalNotificationContent(goalId) != null) {
                                    }
                                    Bundle bundle22 = new Bundle();
                                    bundle22.putString(str6, goal10.getCourseName());
                                    bundle22.putString(str5, goal10.getGoalId());
                                    bundle22.putBoolean(str4, z23);
                                    bundle22.putString(str2, str3);
                                    bundle22.putString(str8, str7);
                                    bundle22.putString("frequency", str9);
                                    gk.a.b(bundle22, "profile_goal_toggle");
                                    return;
                                case 1:
                                    boolean z27 = z26;
                                    int i15 = k.E;
                                    kotlin.jvm.internal.i.g(goal10, "$goal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById2 = FirebasePersistence.getInstance().getGoalById(goal10.getGoalId(), goal10.getCourseId());
                                    if (goal10.getGoalId() != null) {
                                        String goalId9 = goal10.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId9);
                                        if (goalId9.length() >= 7) {
                                            String goalId10 = goal10.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId10);
                                            str10 = "variant";
                                            String substring2 = goalId10.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring2, "custom_")) {
                                                ProgressDialog progressDialog4 = this$0.f34316z;
                                                if (progressDialog4 != null) {
                                                    progressDialog4.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.o(goalById2, null, z27), 3);
                                                    str11 = "new";
                                                    str12 = "toggle";
                                                    str13 = Constants.GOAL_ID;
                                                    str14 = "daily";
                                                    str15 = "course";
                                                    str16 = "custom";
                                                    str17 = "profile_goal_toggle";
                                                    str18 = str10;
                                                    Bundle bundle3 = new Bundle();
                                                    bundle3.putString(str15, goal10.getCourseName());
                                                    bundle3.putString(str13, goal10.getGoalId());
                                                    bundle3.putBoolean(str12, z27);
                                                    bundle3.putString(str18, str11);
                                                    bundle3.putString("reminder_type", str16);
                                                    bundle3.putString("frequency", str14);
                                                    gk.a.b(bundle3, str17);
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                            utils2 = Utils.INSTANCE;
                                            goalId2 = goal10.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId2);
                                            if (utils2.getGoalNotificationContent(goalId2) != null) {
                                                str11 = "new";
                                                str12 = "toggle";
                                                str13 = Constants.GOAL_ID;
                                                str14 = "daily";
                                                str15 = "course";
                                                str16 = "custom";
                                                str17 = "profile_goal_toggle";
                                                str18 = str10;
                                                ProgressDialog progressDialog5 = this$0.f34316z;
                                                if (progressDialog5 != null) {
                                                    progressDialog5.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.p(goalById2, null, z27), 3);
                                                } else {
                                                    kotlin.jvm.internal.i.q("progressDialog");
                                                    throw null;
                                                }
                                            } else {
                                                Context applicationContext2 = this$0.requireContext().getApplicationContext();
                                                kotlin.jvm.internal.i.f(applicationContext2, "requireContext().applicationContext");
                                                long time3 = goalById2.getmStartDate().getTime();
                                                long time4 = goalById2.getmScheduleDate().getTime();
                                                String type2 = goalById2.getType();
                                                kotlin.jvm.internal.i.d(type2);
                                                String goalId11 = goalById2.getGoalId();
                                                kotlin.jvm.internal.i.d(goalId11);
                                                String courseName2 = goalById2.getCourseName();
                                                kotlin.jvm.internal.i.d(courseName2);
                                                String goalName2 = goalById2.getGoalName();
                                                kotlin.jvm.internal.i.d(goalName2);
                                                str18 = str10;
                                                str17 = "profile_goal_toggle";
                                                str11 = "new";
                                                str12 = "toggle";
                                                str13 = Constants.GOAL_ID;
                                                str14 = "daily";
                                                str15 = "course";
                                                str16 = "custom";
                                                Utils.updateActivityNotification$default(utils2, applicationContext2, z22, time3, time4, type2, goalId11, courseName2, goalName2, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                                z27 = z22;
                                                goal10.setNotificationScheduled(z27);
                                                FirebasePersistence.getInstance().updateGoal(goal10, Boolean.TRUE);
                                            }
                                            Bundle bundle32 = new Bundle();
                                            bundle32.putString(str15, goal10.getCourseName());
                                            bundle32.putString(str13, goal10.getGoalId());
                                            bundle32.putBoolean(str12, z27);
                                            bundle32.putString(str18, str11);
                                            bundle32.putString("reminder_type", str16);
                                            bundle32.putString("frequency", str14);
                                            gk.a.b(bundle32, str17);
                                            return;
                                        }
                                    }
                                    str10 = "variant";
                                    utils2 = Utils.INSTANCE;
                                    goalId2 = goal10.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId2);
                                    if (utils2.getGoalNotificationContent(goalId2) != null) {
                                    }
                                    Bundle bundle322 = new Bundle();
                                    bundle322.putString(str15, goal10.getCourseName());
                                    bundle322.putString(str13, goal10.getGoalId());
                                    bundle322.putBoolean(str12, z27);
                                    bundle322.putString(str18, str11);
                                    bundle322.putString("reminder_type", str16);
                                    bundle322.putString("frequency", str14);
                                    gk.a.b(bundle322, str17);
                                    return;
                                case 2:
                                    boolean z28 = z26;
                                    int i16 = k.E;
                                    kotlin.jvm.internal.i.g(goal10, "$weeklyGoal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById3 = FirebasePersistence.getInstance().getGoalById(goal10.getGoalId(), goal10.getCourseId());
                                    if (goalById3.getGoalId() != null) {
                                        String goalId12 = goalById3.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId12);
                                        if (goalId12.length() >= 7) {
                                            String goalId13 = goalById3.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId13);
                                            str19 = "variant";
                                            String substring3 = goalId13.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring3, "custom_")) {
                                                ProgressDialog progressDialog6 = this$0.f34316z;
                                                if (progressDialog6 != null) {
                                                    progressDialog6.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.e(goalById3, null, z28), 3);
                                                    str20 = "reminder_type";
                                                    str21 = "new";
                                                    str22 = "toggle";
                                                    str23 = Constants.GOAL_ID;
                                                    str24 = "course";
                                                    str25 = "regular";
                                                    str26 = str19;
                                                    str27 = "weekly";
                                                    Bundle bundle4 = new Bundle();
                                                    bundle4.putString(str24, goal10.getCourseName());
                                                    bundle4.putString(str23, goal10.getGoalId());
                                                    bundle4.putBoolean(str22, z28);
                                                    bundle4.putString(str26, str21);
                                                    bundle4.putString(str20, str25);
                                                    bundle4.putString("frequency", str27);
                                                    gk.a.b(bundle4, "profile_goal_toggle");
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                            utils3 = Utils.INSTANCE;
                                            goalId3 = goalById3.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId3);
                                            if (utils3.getGoalNotificationContent(goalId3) != null) {
                                                str20 = "reminder_type";
                                                str21 = "new";
                                                str22 = "toggle";
                                                str23 = Constants.GOAL_ID;
                                                str24 = "course";
                                                str25 = "regular";
                                                str26 = str19;
                                                str27 = "weekly";
                                                ProgressDialog progressDialog7 = this$0.f34316z;
                                                if (progressDialog7 != null) {
                                                    progressDialog7.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.f(goalById3, null, z28), 3);
                                                } else {
                                                    kotlin.jvm.internal.i.q("progressDialog");
                                                    throw null;
                                                }
                                            } else {
                                                Context applicationContext3 = this$0.requireContext().getApplicationContext();
                                                kotlin.jvm.internal.i.f(applicationContext3, "requireContext().applicationContext");
                                                long time5 = goalById3.getmStartDate().getTime();
                                                long time6 = goalById3.getmScheduleDate().getTime();
                                                String type3 = goalById3.getType();
                                                kotlin.jvm.internal.i.d(type3);
                                                String goalId14 = goalById3.getGoalId();
                                                kotlin.jvm.internal.i.d(goalId14);
                                                String courseName3 = goalById3.getCourseName();
                                                kotlin.jvm.internal.i.d(courseName3);
                                                String goalName3 = goalById3.getGoalName();
                                                kotlin.jvm.internal.i.d(goalName3);
                                                str27 = "weekly";
                                                str20 = "reminder_type";
                                                str26 = str19;
                                                str21 = "new";
                                                str22 = "toggle";
                                                str23 = Constants.GOAL_ID;
                                                str24 = "course";
                                                str25 = "regular";
                                                Utils.updateActivityNotification$default(utils3, applicationContext3, z22, time5, time6, type3, goalId14, courseName3, goalName3, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                                z28 = z22;
                                                goal10.setNotificationScheduled(z28);
                                                FirebasePersistence.getInstance().updateGoal(goal10, Boolean.TRUE);
                                            }
                                            Bundle bundle42 = new Bundle();
                                            bundle42.putString(str24, goal10.getCourseName());
                                            bundle42.putString(str23, goal10.getGoalId());
                                            bundle42.putBoolean(str22, z28);
                                            bundle42.putString(str26, str21);
                                            bundle42.putString(str20, str25);
                                            bundle42.putString("frequency", str27);
                                            gk.a.b(bundle42, "profile_goal_toggle");
                                            return;
                                        }
                                    }
                                    str19 = "variant";
                                    utils3 = Utils.INSTANCE;
                                    goalId3 = goalById3.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId3);
                                    if (utils3.getGoalNotificationContent(goalId3) != null) {
                                    }
                                    Bundle bundle422 = new Bundle();
                                    bundle422.putString(str24, goal10.getCourseName());
                                    bundle422.putString(str23, goal10.getGoalId());
                                    bundle422.putBoolean(str22, z28);
                                    bundle422.putString(str26, str21);
                                    bundle422.putString(str20, str25);
                                    bundle422.putString("frequency", str27);
                                    gk.a.b(bundle422, "profile_goal_toggle");
                                    return;
                                case 3:
                                    int i17 = k.E;
                                    kotlin.jvm.internal.i.g(goal10, "$weeklyGoal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById4 = FirebasePersistence.getInstance().getGoalById(goal10.getGoalId(), goal10.getCourseId());
                                    if (goalById4.getGoalId() != null) {
                                        String goalId15 = goalById4.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId15);
                                        if (goalId15.length() >= 7) {
                                            String goalId16 = goalById4.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId16);
                                            str28 = "profile_goal_toggle";
                                            String substring4 = goalId16.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring4, "custom_")) {
                                                ProgressDialog progressDialog8 = this$0.f34316z;
                                                if (progressDialog8 != null) {
                                                    progressDialog8.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.g(goalById4, null, z26), 3);
                                                    str29 = "toggle";
                                                    str30 = Constants.GOAL_ID;
                                                    str31 = "custom";
                                                    str32 = "course";
                                                    str33 = "weekly";
                                                    str34 = "frequency";
                                                    z24 = z26;
                                                    str35 = str28;
                                                    Bundle bundle5 = new Bundle();
                                                    bundle5.putString(str32, goal10.getCourseName());
                                                    bundle5.putString(str30, goal10.getGoalId());
                                                    bundle5.putBoolean(str29, z24);
                                                    bundle5.putString("variant", "new");
                                                    bundle5.putString("reminder_type", str31);
                                                    bundle5.putString(str34, str33);
                                                    gk.a.b(bundle5, str35);
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                            utils4 = Utils.INSTANCE;
                                            goalId4 = goalById4.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId4);
                                            if (utils4.getGoalNotificationContent(goalId4) != null) {
                                                str29 = "toggle";
                                                str30 = Constants.GOAL_ID;
                                                str31 = "custom";
                                                str32 = "course";
                                                str33 = "weekly";
                                                str34 = "frequency";
                                                z24 = z26;
                                                str35 = str28;
                                                ProgressDialog progressDialog9 = this$0.f34316z;
                                                if (progressDialog9 != null) {
                                                    progressDialog9.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.h(goalById4, null, z24), 3);
                                                } else {
                                                    kotlin.jvm.internal.i.q("progressDialog");
                                                    throw null;
                                                }
                                            } else {
                                                Context applicationContext4 = this$0.requireContext().getApplicationContext();
                                                kotlin.jvm.internal.i.f(applicationContext4, "requireContext().applicationContext");
                                                long time7 = goalById4.getmStartDate().getTime();
                                                long time8 = goalById4.getmScheduleDate().getTime();
                                                String type4 = goalById4.getType();
                                                kotlin.jvm.internal.i.d(type4);
                                                String goalId17 = goalById4.getGoalId();
                                                kotlin.jvm.internal.i.d(goalId17);
                                                String courseName4 = goalById4.getCourseName();
                                                kotlin.jvm.internal.i.d(courseName4);
                                                String goalName4 = goalById4.getGoalName();
                                                kotlin.jvm.internal.i.d(goalName4);
                                                str35 = str28;
                                                str29 = "toggle";
                                                str30 = Constants.GOAL_ID;
                                                str31 = "custom";
                                                str32 = "course";
                                                str33 = "weekly";
                                                str34 = "frequency";
                                                Utils.updateActivityNotification$default(utils4, applicationContext4, z22, time7, time8, type4, goalId17, courseName4, goalName4, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                                z24 = z22;
                                                goal10.setNotificationScheduled(z24);
                                                FirebasePersistence.getInstance().updateGoal(goal10, Boolean.TRUE);
                                            }
                                            Bundle bundle52 = new Bundle();
                                            bundle52.putString(str32, goal10.getCourseName());
                                            bundle52.putString(str30, goal10.getGoalId());
                                            bundle52.putBoolean(str29, z24);
                                            bundle52.putString("variant", "new");
                                            bundle52.putString("reminder_type", str31);
                                            bundle52.putString(str34, str33);
                                            gk.a.b(bundle52, str35);
                                            return;
                                        }
                                    }
                                    str28 = "profile_goal_toggle";
                                    utils4 = Utils.INSTANCE;
                                    goalId4 = goalById4.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId4);
                                    if (utils4.getGoalNotificationContent(goalId4) != null) {
                                    }
                                    Bundle bundle522 = new Bundle();
                                    bundle522.putString(str32, goal10.getCourseName());
                                    bundle522.putString(str30, goal10.getGoalId());
                                    bundle522.putBoolean(str29, z24);
                                    bundle522.putString("variant", "new");
                                    bundle522.putString("reminder_type", str31);
                                    bundle522.putString(str34, str33);
                                    gk.a.b(bundle522, str35);
                                    return;
                                case 4:
                                    int i18 = k.E;
                                    kotlin.jvm.internal.i.g(goal10, "$oneTimeGoal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById5 = FirebasePersistence.getInstance().getGoalById(goal10.getGoalId(), goal10.getCourseId());
                                    if (goalById5.getGoalId() != null) {
                                        String goalId18 = goalById5.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId18);
                                        if (goalId18.length() >= 7) {
                                            String goalId19 = goalById5.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId19);
                                            String substring5 = goalId19.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring5, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring5, "custom_")) {
                                                ProgressDialog progressDialog10 = this$0.f34316z;
                                                if (progressDialog10 != null) {
                                                    progressDialog10.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.i(goalById5, null, z26), 3);
                                                    str36 = "one_time";
                                                    str37 = "regular";
                                                    goal9 = goal10;
                                                    str38 = "reminder_type";
                                                    str39 = "new";
                                                    str40 = "variant";
                                                    str41 = "toggle";
                                                    str42 = Constants.GOAL_ID;
                                                    str44 = "profile_goal_toggle";
                                                    str45 = "course";
                                                    str43 = "frequency";
                                                    Bundle bundle6 = new Bundle();
                                                    bundle6.putString(str45, goal9.getCourseName());
                                                    bundle6.putString(str42, goal9.getGoalId());
                                                    bundle6.putBoolean(str41, z26);
                                                    bundle6.putString(str40, str39);
                                                    bundle6.putString(str38, str37);
                                                    bundle6.putString(str43, str36);
                                                    gk.a.b(bundle6, str44);
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                        }
                                    }
                                    Utils utils6 = Utils.INSTANCE;
                                    String goalId20 = goalById5.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId20);
                                    if (utils6.getGoalNotificationContent(goalId20) == null) {
                                        str36 = "one_time";
                                        str37 = "regular";
                                        goal9 = goal10;
                                        str38 = "reminder_type";
                                        str39 = "new";
                                        str40 = "variant";
                                        str41 = "toggle";
                                        str42 = Constants.GOAL_ID;
                                        str43 = "frequency";
                                        str44 = "profile_goal_toggle";
                                        str45 = "course";
                                        ProgressDialog progressDialog11 = this$0.f34316z;
                                        if (progressDialog11 != null) {
                                            progressDialog11.show();
                                            v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.j(goalById5, null, z26), 3);
                                            Bundle bundle62 = new Bundle();
                                            bundle62.putString(str45, goal9.getCourseName());
                                            bundle62.putString(str42, goal9.getGoalId());
                                            bundle62.putBoolean(str41, z26);
                                            bundle62.putString(str40, str39);
                                            bundle62.putString(str38, str37);
                                            bundle62.putString(str43, str36);
                                            gk.a.b(bundle62, str44);
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("progressDialog");
                                        throw null;
                                    }
                                    Context applicationContext5 = this$0.requireContext().getApplicationContext();
                                    kotlin.jvm.internal.i.f(applicationContext5, "requireContext().applicationContext");
                                    long time9 = goalById5.getmStartDate().getTime();
                                    long time10 = goalById5.getmScheduleDate().getTime();
                                    String type5 = goalById5.getType();
                                    kotlin.jvm.internal.i.d(type5);
                                    String goalId21 = goalById5.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId21);
                                    String courseName5 = goalById5.getCourseName();
                                    kotlin.jvm.internal.i.d(courseName5);
                                    String goalName5 = goalById5.getGoalName();
                                    kotlin.jvm.internal.i.d(goalName5);
                                    str44 = "profile_goal_toggle";
                                    str37 = "regular";
                                    str36 = "one_time";
                                    goal9 = goal10;
                                    str38 = "reminder_type";
                                    str39 = "new";
                                    str40 = "variant";
                                    str41 = "toggle";
                                    str42 = Constants.GOAL_ID;
                                    str45 = "course";
                                    Utils.updateActivityNotification$default(utils6, applicationContext5, z22, time9, time10, type5, goalId21, courseName5, goalName5, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                    z26 = z22;
                                    goal9.setNotificationScheduled(z26);
                                    FirebasePersistence.getInstance().updateGoal(goal9, Boolean.TRUE);
                                    str43 = "frequency";
                                    Bundle bundle622 = new Bundle();
                                    bundle622.putString(str45, goal9.getCourseName());
                                    bundle622.putString(str42, goal9.getGoalId());
                                    bundle622.putBoolean(str41, z26);
                                    bundle622.putString(str40, str39);
                                    bundle622.putString(str38, str37);
                                    bundle622.putString(str43, str36);
                                    gk.a.b(bundle622, str44);
                                    return;
                                default:
                                    int i19 = k.E;
                                    kotlin.jvm.internal.i.g(goal10, "$oneTimeGoal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById6 = FirebasePersistence.getInstance().getGoalById(goal10.getGoalId(), goal10.getCourseId());
                                    if (goalById6.getGoalId() != null) {
                                        String goalId22 = goalById6.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId22);
                                        if (goalId22.length() >= 7) {
                                            String goalId23 = goalById6.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId23);
                                            str46 = "new";
                                            String substring6 = goalId23.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring6, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring6, "custom_")) {
                                                ProgressDialog progressDialog12 = this$0.f34316z;
                                                if (progressDialog12 != null) {
                                                    progressDialog12.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.C0577k(goalById6, null, z26), 3);
                                                    str47 = "variant";
                                                    str48 = "toggle";
                                                    str49 = Constants.GOAL_ID;
                                                    str50 = "course";
                                                    z25 = z26;
                                                    str51 = "custom";
                                                    str52 = "one_time";
                                                    str53 = "reminder_type";
                                                    str54 = str46;
                                                    Bundle bundle7 = new Bundle();
                                                    bundle7.putString(str50, goal10.getCourseName());
                                                    bundle7.putString(str49, goal10.getGoalId());
                                                    bundle7.putBoolean(str48, z25);
                                                    bundle7.putString(str47, str54);
                                                    bundle7.putString(str53, str51);
                                                    bundle7.putString("frequency", str52);
                                                    gk.a.b(bundle7, "profile_goal_toggle");
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                            utils5 = Utils.INSTANCE;
                                            goalId5 = goalById6.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId5);
                                            if (utils5.getGoalNotificationContent(goalId5) != null) {
                                                str47 = "variant";
                                                str48 = "toggle";
                                                str49 = Constants.GOAL_ID;
                                                str50 = "course";
                                                z25 = z26;
                                                str51 = "custom";
                                                str52 = "one_time";
                                                str53 = "reminder_type";
                                                str54 = str46;
                                                ProgressDialog progressDialog13 = this$0.f34316z;
                                                if (progressDialog13 != null) {
                                                    progressDialog13.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.l(goalById6, null, z25), 3);
                                                } else {
                                                    kotlin.jvm.internal.i.q("progressDialog");
                                                    throw null;
                                                }
                                            } else {
                                                Context applicationContext6 = this$0.requireContext().getApplicationContext();
                                                kotlin.jvm.internal.i.f(applicationContext6, "requireContext().applicationContext");
                                                long time11 = goalById6.getmStartDate().getTime();
                                                long time12 = goalById6.getmScheduleDate().getTime();
                                                String type6 = goalById6.getType();
                                                kotlin.jvm.internal.i.d(type6);
                                                String goalId24 = goalById6.getGoalId();
                                                kotlin.jvm.internal.i.d(goalId24);
                                                String courseName6 = goalById6.getCourseName();
                                                kotlin.jvm.internal.i.d(courseName6);
                                                String goalName6 = goalById6.getGoalName();
                                                kotlin.jvm.internal.i.d(goalName6);
                                                str53 = "reminder_type";
                                                str47 = "variant";
                                                str54 = str46;
                                                str48 = "toggle";
                                                str49 = Constants.GOAL_ID;
                                                str50 = "course";
                                                str51 = "custom";
                                                str52 = "one_time";
                                                Utils.updateActivityNotification$default(utils5, applicationContext6, z22, time11, time12, type6, goalId24, courseName6, goalName6, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                                z25 = z22;
                                                goal10.setNotificationScheduled(z25);
                                                FirebasePersistence.getInstance().updateGoal(goal10, Boolean.TRUE);
                                            }
                                            Bundle bundle72 = new Bundle();
                                            bundle72.putString(str50, goal10.getCourseName());
                                            bundle72.putString(str49, goal10.getGoalId());
                                            bundle72.putBoolean(str48, z25);
                                            bundle72.putString(str47, str54);
                                            bundle72.putString(str53, str51);
                                            bundle72.putString("frequency", str52);
                                            gk.a.b(bundle72, "profile_goal_toggle");
                                            return;
                                        }
                                    }
                                    str46 = "new";
                                    utils5 = Utils.INSTANCE;
                                    goalId5 = goalById6.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId5);
                                    if (utils5.getGoalNotificationContent(goalId5) != null) {
                                    }
                                    Bundle bundle722 = new Bundle();
                                    bundle722.putString(str50, goal10.getCourseName());
                                    bundle722.putString(str49, goal10.getGoalId());
                                    bundle722.putBoolean(str48, z25);
                                    bundle722.putString(str47, str54);
                                    bundle722.putString(str53, str51);
                                    bundle722.putString("frequency", str52);
                                    gk.a.b(bundle722, "profile_goal_toggle");
                                    return;
                            }
                        }
                    });
                    ((LinearLayout) _$_findCachedViewById(R.id.activityReminderHeaderDailyContainer)).addView(inflate);
                    i6 = R.id.activityReminderHeaderDailyContainer;
                    i10 = R.id.tvRowGoalName;
                }
            } else {
                ((LinearLayout) _$_findCachedViewById(R.id.activityReminderHeaderDailyContainer)).setVisibility(8);
                ((RobertoTextView) _$_findCachedViewById(R.id.activityReminderHeaderDaily)).setVisibility(8);
            }
            if (!list5.isEmpty()) {
                for (final Goal goal9 : list5) {
                    View inflate2 = getLayoutInflater().inflate(R.layout.row_notification_new, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.customReminderHeaderDailyContainer)), false);
                    RobertoTextView robertoTextView3 = (RobertoTextView) inflate2.findViewById(i11);
                    kotlin.jvm.internal.i.f(robertoTextView3, "row.tvRowGoalTime");
                    U(robertoTextView3, goal9);
                    RobertoTextView robertoTextView4 = (RobertoTextView) inflate2.findViewById(R.id.tvRowGoalName);
                    if (robertoTextView4 != null) {
                        robertoTextView4.setText(goal9.getGoalName());
                    }
                    ((SwitchCompat) inflate2.findViewById(R.id.switchRowGoalScheduleNotification)).setChecked(goal9.getNotificationScheduled());
                    ((SwitchCompat) inflate2.findViewById(R.id.switchRowGoalScheduleNotification)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: uo.c
                        /* JADX WARN: Removed duplicated region for block: B:107:0x06ae  */
                        /* JADX WARN: Removed duplicated region for block: B:108:0x072b  */
                        /* JADX WARN: Removed duplicated region for block: B:136:0x0840  */
                        /* JADX WARN: Removed duplicated region for block: B:137:0x08ba  */
                        /* JADX WARN: Removed duplicated region for block: B:41:0x024d  */
                        /* JADX WARN: Removed duplicated region for block: B:42:0x02c4  */
                        /* JADX WARN: Removed duplicated region for block: B:63:0x03bf  */
                        /* JADX WARN: Removed duplicated region for block: B:64:0x0439  */
                        /* JADX WARN: Removed duplicated region for block: B:85:0x0534  */
                        /* JADX WARN: Removed duplicated region for block: B:86:0x05b1  */
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z22) {
                            String str;
                            Utils utils;
                            String goalId;
                            String str2;
                            String str3;
                            String str4;
                            String str5;
                            String str6;
                            boolean z23;
                            String str7;
                            String str8;
                            String str9;
                            String str10;
                            Utils utils2;
                            String goalId2;
                            String str11;
                            String str12;
                            String str13;
                            String str14;
                            String str15;
                            String str16;
                            String str17;
                            String str18;
                            String str19;
                            Utils utils3;
                            String goalId3;
                            String str20;
                            String str21;
                            String str22;
                            String str23;
                            String str24;
                            String str25;
                            String str26;
                            String str27;
                            String str28;
                            Utils utils4;
                            String goalId4;
                            String str29;
                            String str30;
                            String str31;
                            String str32;
                            String str33;
                            String str34;
                            boolean z24;
                            String str35;
                            String str36;
                            String str37;
                            Goal goal92;
                            String str38;
                            String str39;
                            String str40;
                            String str41;
                            String str42;
                            String str43;
                            String str44;
                            String str45;
                            String str46;
                            Utils utils5;
                            String goalId5;
                            String str47;
                            String str48;
                            String str49;
                            String str50;
                            boolean z25;
                            String str51;
                            String str52;
                            String str53;
                            String str54;
                            boolean z26 = z22;
                            int i13 = r3;
                            k this$0 = this;
                            Goal goal10 = goal9;
                            switch (i13) {
                                case 0:
                                    int i14 = k.E;
                                    kotlin.jvm.internal.i.g(goal10, "$goal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById = FirebasePersistence.getInstance().getGoalById(goal10.getGoalId(), goal10.getCourseId());
                                    if (goal10.getGoalId() != null) {
                                        String goalId6 = goal10.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId6);
                                        if (goalId6.length() >= 7) {
                                            String goalId7 = goal10.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId7);
                                            str = "reminder_type";
                                            String substring = goalId7.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring, "custom_")) {
                                                ProgressDialog progressDialog = this$0.f34316z;
                                                if (progressDialog != null) {
                                                    progressDialog.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.m(goalById, null, z26), 3);
                                                    str2 = "variant";
                                                    str3 = "new";
                                                    str4 = "toggle";
                                                    str5 = Constants.GOAL_ID;
                                                    str6 = "course";
                                                    z23 = z26;
                                                    str7 = "regular";
                                                    str8 = str;
                                                    str9 = "daily";
                                                    Bundle bundle22 = new Bundle();
                                                    bundle22.putString(str6, goal10.getCourseName());
                                                    bundle22.putString(str5, goal10.getGoalId());
                                                    bundle22.putBoolean(str4, z23);
                                                    bundle22.putString(str2, str3);
                                                    bundle22.putString(str8, str7);
                                                    bundle22.putString("frequency", str9);
                                                    gk.a.b(bundle22, "profile_goal_toggle");
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                            utils = Utils.INSTANCE;
                                            goalId = goal10.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId);
                                            if (utils.getGoalNotificationContent(goalId) != null) {
                                                str2 = "variant";
                                                str3 = "new";
                                                str4 = "toggle";
                                                str5 = Constants.GOAL_ID;
                                                str6 = "course";
                                                z23 = z26;
                                                str7 = "regular";
                                                str8 = str;
                                                str9 = "daily";
                                                if (is.k.Q1(goal10.getType(), new String[]{Constants.GOAL_TYPE_RELAXATION_ACTIVITY, "physical_activity"})) {
                                                    ProgressDialog progressDialog2 = this$0.f34316z;
                                                    if (progressDialog2 != null) {
                                                        progressDialog2.show();
                                                        FireStoreUtilsKt.fetchSingleRecommendedActivity(goal10.getGoalId(), new l(this$0, z23, goal10));
                                                    } else {
                                                        kotlin.jvm.internal.i.q("progressDialog");
                                                        throw null;
                                                    }
                                                } else {
                                                    ProgressDialog progressDialog3 = this$0.f34316z;
                                                    if (progressDialog3 != null) {
                                                        progressDialog3.show();
                                                        v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.n(goalById, null, z23), 3);
                                                    } else {
                                                        kotlin.jvm.internal.i.q("progressDialog");
                                                        throw null;
                                                    }
                                                }
                                            } else {
                                                Context applicationContext = this$0.requireContext().getApplicationContext();
                                                kotlin.jvm.internal.i.f(applicationContext, "requireContext().applicationContext");
                                                long time = goalById.getmStartDate().getTime();
                                                long time2 = goalById.getmScheduleDate().getTime();
                                                String type = goalById.getType();
                                                kotlin.jvm.internal.i.d(type);
                                                String goalId8 = goalById.getGoalId();
                                                kotlin.jvm.internal.i.d(goalId8);
                                                String courseName = goalById.getCourseName();
                                                kotlin.jvm.internal.i.d(courseName);
                                                String goalName = goalById.getGoalName();
                                                kotlin.jvm.internal.i.d(goalName);
                                                str8 = str;
                                                str9 = "daily";
                                                str2 = "variant";
                                                str3 = "new";
                                                str4 = "toggle";
                                                str5 = Constants.GOAL_ID;
                                                str6 = "course";
                                                str7 = "regular";
                                                Utils.updateActivityNotification$default(utils, applicationContext, z22, time, time2, type, goalId8, courseName, goalName, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                                z23 = z22;
                                                goal10.setNotificationScheduled(z23);
                                                FirebasePersistence.getInstance().updateGoal(goal10, Boolean.TRUE);
                                            }
                                            Bundle bundle222 = new Bundle();
                                            bundle222.putString(str6, goal10.getCourseName());
                                            bundle222.putString(str5, goal10.getGoalId());
                                            bundle222.putBoolean(str4, z23);
                                            bundle222.putString(str2, str3);
                                            bundle222.putString(str8, str7);
                                            bundle222.putString("frequency", str9);
                                            gk.a.b(bundle222, "profile_goal_toggle");
                                            return;
                                        }
                                    }
                                    str = "reminder_type";
                                    utils = Utils.INSTANCE;
                                    goalId = goal10.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId);
                                    if (utils.getGoalNotificationContent(goalId) != null) {
                                    }
                                    Bundle bundle2222 = new Bundle();
                                    bundle2222.putString(str6, goal10.getCourseName());
                                    bundle2222.putString(str5, goal10.getGoalId());
                                    bundle2222.putBoolean(str4, z23);
                                    bundle2222.putString(str2, str3);
                                    bundle2222.putString(str8, str7);
                                    bundle2222.putString("frequency", str9);
                                    gk.a.b(bundle2222, "profile_goal_toggle");
                                    return;
                                case 1:
                                    boolean z27 = z26;
                                    int i15 = k.E;
                                    kotlin.jvm.internal.i.g(goal10, "$goal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById2 = FirebasePersistence.getInstance().getGoalById(goal10.getGoalId(), goal10.getCourseId());
                                    if (goal10.getGoalId() != null) {
                                        String goalId9 = goal10.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId9);
                                        if (goalId9.length() >= 7) {
                                            String goalId10 = goal10.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId10);
                                            str10 = "variant";
                                            String substring2 = goalId10.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring2, "custom_")) {
                                                ProgressDialog progressDialog4 = this$0.f34316z;
                                                if (progressDialog4 != null) {
                                                    progressDialog4.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.o(goalById2, null, z27), 3);
                                                    str11 = "new";
                                                    str12 = "toggle";
                                                    str13 = Constants.GOAL_ID;
                                                    str14 = "daily";
                                                    str15 = "course";
                                                    str16 = "custom";
                                                    str17 = "profile_goal_toggle";
                                                    str18 = str10;
                                                    Bundle bundle322 = new Bundle();
                                                    bundle322.putString(str15, goal10.getCourseName());
                                                    bundle322.putString(str13, goal10.getGoalId());
                                                    bundle322.putBoolean(str12, z27);
                                                    bundle322.putString(str18, str11);
                                                    bundle322.putString("reminder_type", str16);
                                                    bundle322.putString("frequency", str14);
                                                    gk.a.b(bundle322, str17);
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                            utils2 = Utils.INSTANCE;
                                            goalId2 = goal10.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId2);
                                            if (utils2.getGoalNotificationContent(goalId2) != null) {
                                                str11 = "new";
                                                str12 = "toggle";
                                                str13 = Constants.GOAL_ID;
                                                str14 = "daily";
                                                str15 = "course";
                                                str16 = "custom";
                                                str17 = "profile_goal_toggle";
                                                str18 = str10;
                                                ProgressDialog progressDialog5 = this$0.f34316z;
                                                if (progressDialog5 != null) {
                                                    progressDialog5.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.p(goalById2, null, z27), 3);
                                                } else {
                                                    kotlin.jvm.internal.i.q("progressDialog");
                                                    throw null;
                                                }
                                            } else {
                                                Context applicationContext2 = this$0.requireContext().getApplicationContext();
                                                kotlin.jvm.internal.i.f(applicationContext2, "requireContext().applicationContext");
                                                long time3 = goalById2.getmStartDate().getTime();
                                                long time4 = goalById2.getmScheduleDate().getTime();
                                                String type2 = goalById2.getType();
                                                kotlin.jvm.internal.i.d(type2);
                                                String goalId11 = goalById2.getGoalId();
                                                kotlin.jvm.internal.i.d(goalId11);
                                                String courseName2 = goalById2.getCourseName();
                                                kotlin.jvm.internal.i.d(courseName2);
                                                String goalName2 = goalById2.getGoalName();
                                                kotlin.jvm.internal.i.d(goalName2);
                                                str18 = str10;
                                                str17 = "profile_goal_toggle";
                                                str11 = "new";
                                                str12 = "toggle";
                                                str13 = Constants.GOAL_ID;
                                                str14 = "daily";
                                                str15 = "course";
                                                str16 = "custom";
                                                Utils.updateActivityNotification$default(utils2, applicationContext2, z22, time3, time4, type2, goalId11, courseName2, goalName2, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                                z27 = z22;
                                                goal10.setNotificationScheduled(z27);
                                                FirebasePersistence.getInstance().updateGoal(goal10, Boolean.TRUE);
                                            }
                                            Bundle bundle3222 = new Bundle();
                                            bundle3222.putString(str15, goal10.getCourseName());
                                            bundle3222.putString(str13, goal10.getGoalId());
                                            bundle3222.putBoolean(str12, z27);
                                            bundle3222.putString(str18, str11);
                                            bundle3222.putString("reminder_type", str16);
                                            bundle3222.putString("frequency", str14);
                                            gk.a.b(bundle3222, str17);
                                            return;
                                        }
                                    }
                                    str10 = "variant";
                                    utils2 = Utils.INSTANCE;
                                    goalId2 = goal10.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId2);
                                    if (utils2.getGoalNotificationContent(goalId2) != null) {
                                    }
                                    Bundle bundle32222 = new Bundle();
                                    bundle32222.putString(str15, goal10.getCourseName());
                                    bundle32222.putString(str13, goal10.getGoalId());
                                    bundle32222.putBoolean(str12, z27);
                                    bundle32222.putString(str18, str11);
                                    bundle32222.putString("reminder_type", str16);
                                    bundle32222.putString("frequency", str14);
                                    gk.a.b(bundle32222, str17);
                                    return;
                                case 2:
                                    boolean z28 = z26;
                                    int i16 = k.E;
                                    kotlin.jvm.internal.i.g(goal10, "$weeklyGoal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById3 = FirebasePersistence.getInstance().getGoalById(goal10.getGoalId(), goal10.getCourseId());
                                    if (goalById3.getGoalId() != null) {
                                        String goalId12 = goalById3.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId12);
                                        if (goalId12.length() >= 7) {
                                            String goalId13 = goalById3.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId13);
                                            str19 = "variant";
                                            String substring3 = goalId13.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring3, "custom_")) {
                                                ProgressDialog progressDialog6 = this$0.f34316z;
                                                if (progressDialog6 != null) {
                                                    progressDialog6.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.e(goalById3, null, z28), 3);
                                                    str20 = "reminder_type";
                                                    str21 = "new";
                                                    str22 = "toggle";
                                                    str23 = Constants.GOAL_ID;
                                                    str24 = "course";
                                                    str25 = "regular";
                                                    str26 = str19;
                                                    str27 = "weekly";
                                                    Bundle bundle422 = new Bundle();
                                                    bundle422.putString(str24, goal10.getCourseName());
                                                    bundle422.putString(str23, goal10.getGoalId());
                                                    bundle422.putBoolean(str22, z28);
                                                    bundle422.putString(str26, str21);
                                                    bundle422.putString(str20, str25);
                                                    bundle422.putString("frequency", str27);
                                                    gk.a.b(bundle422, "profile_goal_toggle");
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                            utils3 = Utils.INSTANCE;
                                            goalId3 = goalById3.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId3);
                                            if (utils3.getGoalNotificationContent(goalId3) != null) {
                                                str20 = "reminder_type";
                                                str21 = "new";
                                                str22 = "toggle";
                                                str23 = Constants.GOAL_ID;
                                                str24 = "course";
                                                str25 = "regular";
                                                str26 = str19;
                                                str27 = "weekly";
                                                ProgressDialog progressDialog7 = this$0.f34316z;
                                                if (progressDialog7 != null) {
                                                    progressDialog7.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.f(goalById3, null, z28), 3);
                                                } else {
                                                    kotlin.jvm.internal.i.q("progressDialog");
                                                    throw null;
                                                }
                                            } else {
                                                Context applicationContext3 = this$0.requireContext().getApplicationContext();
                                                kotlin.jvm.internal.i.f(applicationContext3, "requireContext().applicationContext");
                                                long time5 = goalById3.getmStartDate().getTime();
                                                long time6 = goalById3.getmScheduleDate().getTime();
                                                String type3 = goalById3.getType();
                                                kotlin.jvm.internal.i.d(type3);
                                                String goalId14 = goalById3.getGoalId();
                                                kotlin.jvm.internal.i.d(goalId14);
                                                String courseName3 = goalById3.getCourseName();
                                                kotlin.jvm.internal.i.d(courseName3);
                                                String goalName3 = goalById3.getGoalName();
                                                kotlin.jvm.internal.i.d(goalName3);
                                                str27 = "weekly";
                                                str20 = "reminder_type";
                                                str26 = str19;
                                                str21 = "new";
                                                str22 = "toggle";
                                                str23 = Constants.GOAL_ID;
                                                str24 = "course";
                                                str25 = "regular";
                                                Utils.updateActivityNotification$default(utils3, applicationContext3, z22, time5, time6, type3, goalId14, courseName3, goalName3, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                                z28 = z22;
                                                goal10.setNotificationScheduled(z28);
                                                FirebasePersistence.getInstance().updateGoal(goal10, Boolean.TRUE);
                                            }
                                            Bundle bundle4222 = new Bundle();
                                            bundle4222.putString(str24, goal10.getCourseName());
                                            bundle4222.putString(str23, goal10.getGoalId());
                                            bundle4222.putBoolean(str22, z28);
                                            bundle4222.putString(str26, str21);
                                            bundle4222.putString(str20, str25);
                                            bundle4222.putString("frequency", str27);
                                            gk.a.b(bundle4222, "profile_goal_toggle");
                                            return;
                                        }
                                    }
                                    str19 = "variant";
                                    utils3 = Utils.INSTANCE;
                                    goalId3 = goalById3.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId3);
                                    if (utils3.getGoalNotificationContent(goalId3) != null) {
                                    }
                                    Bundle bundle42222 = new Bundle();
                                    bundle42222.putString(str24, goal10.getCourseName());
                                    bundle42222.putString(str23, goal10.getGoalId());
                                    bundle42222.putBoolean(str22, z28);
                                    bundle42222.putString(str26, str21);
                                    bundle42222.putString(str20, str25);
                                    bundle42222.putString("frequency", str27);
                                    gk.a.b(bundle42222, "profile_goal_toggle");
                                    return;
                                case 3:
                                    int i17 = k.E;
                                    kotlin.jvm.internal.i.g(goal10, "$weeklyGoal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById4 = FirebasePersistence.getInstance().getGoalById(goal10.getGoalId(), goal10.getCourseId());
                                    if (goalById4.getGoalId() != null) {
                                        String goalId15 = goalById4.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId15);
                                        if (goalId15.length() >= 7) {
                                            String goalId16 = goalById4.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId16);
                                            str28 = "profile_goal_toggle";
                                            String substring4 = goalId16.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring4, "custom_")) {
                                                ProgressDialog progressDialog8 = this$0.f34316z;
                                                if (progressDialog8 != null) {
                                                    progressDialog8.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.g(goalById4, null, z26), 3);
                                                    str29 = "toggle";
                                                    str30 = Constants.GOAL_ID;
                                                    str31 = "custom";
                                                    str32 = "course";
                                                    str33 = "weekly";
                                                    str34 = "frequency";
                                                    z24 = z26;
                                                    str35 = str28;
                                                    Bundle bundle522 = new Bundle();
                                                    bundle522.putString(str32, goal10.getCourseName());
                                                    bundle522.putString(str30, goal10.getGoalId());
                                                    bundle522.putBoolean(str29, z24);
                                                    bundle522.putString("variant", "new");
                                                    bundle522.putString("reminder_type", str31);
                                                    bundle522.putString(str34, str33);
                                                    gk.a.b(bundle522, str35);
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                            utils4 = Utils.INSTANCE;
                                            goalId4 = goalById4.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId4);
                                            if (utils4.getGoalNotificationContent(goalId4) != null) {
                                                str29 = "toggle";
                                                str30 = Constants.GOAL_ID;
                                                str31 = "custom";
                                                str32 = "course";
                                                str33 = "weekly";
                                                str34 = "frequency";
                                                z24 = z26;
                                                str35 = str28;
                                                ProgressDialog progressDialog9 = this$0.f34316z;
                                                if (progressDialog9 != null) {
                                                    progressDialog9.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.h(goalById4, null, z24), 3);
                                                } else {
                                                    kotlin.jvm.internal.i.q("progressDialog");
                                                    throw null;
                                                }
                                            } else {
                                                Context applicationContext4 = this$0.requireContext().getApplicationContext();
                                                kotlin.jvm.internal.i.f(applicationContext4, "requireContext().applicationContext");
                                                long time7 = goalById4.getmStartDate().getTime();
                                                long time8 = goalById4.getmScheduleDate().getTime();
                                                String type4 = goalById4.getType();
                                                kotlin.jvm.internal.i.d(type4);
                                                String goalId17 = goalById4.getGoalId();
                                                kotlin.jvm.internal.i.d(goalId17);
                                                String courseName4 = goalById4.getCourseName();
                                                kotlin.jvm.internal.i.d(courseName4);
                                                String goalName4 = goalById4.getGoalName();
                                                kotlin.jvm.internal.i.d(goalName4);
                                                str35 = str28;
                                                str29 = "toggle";
                                                str30 = Constants.GOAL_ID;
                                                str31 = "custom";
                                                str32 = "course";
                                                str33 = "weekly";
                                                str34 = "frequency";
                                                Utils.updateActivityNotification$default(utils4, applicationContext4, z22, time7, time8, type4, goalId17, courseName4, goalName4, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                                z24 = z22;
                                                goal10.setNotificationScheduled(z24);
                                                FirebasePersistence.getInstance().updateGoal(goal10, Boolean.TRUE);
                                            }
                                            Bundle bundle5222 = new Bundle();
                                            bundle5222.putString(str32, goal10.getCourseName());
                                            bundle5222.putString(str30, goal10.getGoalId());
                                            bundle5222.putBoolean(str29, z24);
                                            bundle5222.putString("variant", "new");
                                            bundle5222.putString("reminder_type", str31);
                                            bundle5222.putString(str34, str33);
                                            gk.a.b(bundle5222, str35);
                                            return;
                                        }
                                    }
                                    str28 = "profile_goal_toggle";
                                    utils4 = Utils.INSTANCE;
                                    goalId4 = goalById4.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId4);
                                    if (utils4.getGoalNotificationContent(goalId4) != null) {
                                    }
                                    Bundle bundle52222 = new Bundle();
                                    bundle52222.putString(str32, goal10.getCourseName());
                                    bundle52222.putString(str30, goal10.getGoalId());
                                    bundle52222.putBoolean(str29, z24);
                                    bundle52222.putString("variant", "new");
                                    bundle52222.putString("reminder_type", str31);
                                    bundle52222.putString(str34, str33);
                                    gk.a.b(bundle52222, str35);
                                    return;
                                case 4:
                                    int i18 = k.E;
                                    kotlin.jvm.internal.i.g(goal10, "$oneTimeGoal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById5 = FirebasePersistence.getInstance().getGoalById(goal10.getGoalId(), goal10.getCourseId());
                                    if (goalById5.getGoalId() != null) {
                                        String goalId18 = goalById5.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId18);
                                        if (goalId18.length() >= 7) {
                                            String goalId19 = goalById5.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId19);
                                            String substring5 = goalId19.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring5, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring5, "custom_")) {
                                                ProgressDialog progressDialog10 = this$0.f34316z;
                                                if (progressDialog10 != null) {
                                                    progressDialog10.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.i(goalById5, null, z26), 3);
                                                    str36 = "one_time";
                                                    str37 = "regular";
                                                    goal92 = goal10;
                                                    str38 = "reminder_type";
                                                    str39 = "new";
                                                    str40 = "variant";
                                                    str41 = "toggle";
                                                    str42 = Constants.GOAL_ID;
                                                    str44 = "profile_goal_toggle";
                                                    str45 = "course";
                                                    str43 = "frequency";
                                                    Bundle bundle622 = new Bundle();
                                                    bundle622.putString(str45, goal92.getCourseName());
                                                    bundle622.putString(str42, goal92.getGoalId());
                                                    bundle622.putBoolean(str41, z26);
                                                    bundle622.putString(str40, str39);
                                                    bundle622.putString(str38, str37);
                                                    bundle622.putString(str43, str36);
                                                    gk.a.b(bundle622, str44);
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                        }
                                    }
                                    Utils utils6 = Utils.INSTANCE;
                                    String goalId20 = goalById5.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId20);
                                    if (utils6.getGoalNotificationContent(goalId20) == null) {
                                        str36 = "one_time";
                                        str37 = "regular";
                                        goal92 = goal10;
                                        str38 = "reminder_type";
                                        str39 = "new";
                                        str40 = "variant";
                                        str41 = "toggle";
                                        str42 = Constants.GOAL_ID;
                                        str43 = "frequency";
                                        str44 = "profile_goal_toggle";
                                        str45 = "course";
                                        ProgressDialog progressDialog11 = this$0.f34316z;
                                        if (progressDialog11 != null) {
                                            progressDialog11.show();
                                            v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.j(goalById5, null, z26), 3);
                                            Bundle bundle6222 = new Bundle();
                                            bundle6222.putString(str45, goal92.getCourseName());
                                            bundle6222.putString(str42, goal92.getGoalId());
                                            bundle6222.putBoolean(str41, z26);
                                            bundle6222.putString(str40, str39);
                                            bundle6222.putString(str38, str37);
                                            bundle6222.putString(str43, str36);
                                            gk.a.b(bundle6222, str44);
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("progressDialog");
                                        throw null;
                                    }
                                    Context applicationContext5 = this$0.requireContext().getApplicationContext();
                                    kotlin.jvm.internal.i.f(applicationContext5, "requireContext().applicationContext");
                                    long time9 = goalById5.getmStartDate().getTime();
                                    long time10 = goalById5.getmScheduleDate().getTime();
                                    String type5 = goalById5.getType();
                                    kotlin.jvm.internal.i.d(type5);
                                    String goalId21 = goalById5.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId21);
                                    String courseName5 = goalById5.getCourseName();
                                    kotlin.jvm.internal.i.d(courseName5);
                                    String goalName5 = goalById5.getGoalName();
                                    kotlin.jvm.internal.i.d(goalName5);
                                    str44 = "profile_goal_toggle";
                                    str37 = "regular";
                                    str36 = "one_time";
                                    goal92 = goal10;
                                    str38 = "reminder_type";
                                    str39 = "new";
                                    str40 = "variant";
                                    str41 = "toggle";
                                    str42 = Constants.GOAL_ID;
                                    str45 = "course";
                                    Utils.updateActivityNotification$default(utils6, applicationContext5, z22, time9, time10, type5, goalId21, courseName5, goalName5, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                    z26 = z22;
                                    goal92.setNotificationScheduled(z26);
                                    FirebasePersistence.getInstance().updateGoal(goal92, Boolean.TRUE);
                                    str43 = "frequency";
                                    Bundle bundle62222 = new Bundle();
                                    bundle62222.putString(str45, goal92.getCourseName());
                                    bundle62222.putString(str42, goal92.getGoalId());
                                    bundle62222.putBoolean(str41, z26);
                                    bundle62222.putString(str40, str39);
                                    bundle62222.putString(str38, str37);
                                    bundle62222.putString(str43, str36);
                                    gk.a.b(bundle62222, str44);
                                    return;
                                default:
                                    int i19 = k.E;
                                    kotlin.jvm.internal.i.g(goal10, "$oneTimeGoal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById6 = FirebasePersistence.getInstance().getGoalById(goal10.getGoalId(), goal10.getCourseId());
                                    if (goalById6.getGoalId() != null) {
                                        String goalId22 = goalById6.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId22);
                                        if (goalId22.length() >= 7) {
                                            String goalId23 = goalById6.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId23);
                                            str46 = "new";
                                            String substring6 = goalId23.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring6, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring6, "custom_")) {
                                                ProgressDialog progressDialog12 = this$0.f34316z;
                                                if (progressDialog12 != null) {
                                                    progressDialog12.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.C0577k(goalById6, null, z26), 3);
                                                    str47 = "variant";
                                                    str48 = "toggle";
                                                    str49 = Constants.GOAL_ID;
                                                    str50 = "course";
                                                    z25 = z26;
                                                    str51 = "custom";
                                                    str52 = "one_time";
                                                    str53 = "reminder_type";
                                                    str54 = str46;
                                                    Bundle bundle722 = new Bundle();
                                                    bundle722.putString(str50, goal10.getCourseName());
                                                    bundle722.putString(str49, goal10.getGoalId());
                                                    bundle722.putBoolean(str48, z25);
                                                    bundle722.putString(str47, str54);
                                                    bundle722.putString(str53, str51);
                                                    bundle722.putString("frequency", str52);
                                                    gk.a.b(bundle722, "profile_goal_toggle");
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                            utils5 = Utils.INSTANCE;
                                            goalId5 = goalById6.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId5);
                                            if (utils5.getGoalNotificationContent(goalId5) != null) {
                                                str47 = "variant";
                                                str48 = "toggle";
                                                str49 = Constants.GOAL_ID;
                                                str50 = "course";
                                                z25 = z26;
                                                str51 = "custom";
                                                str52 = "one_time";
                                                str53 = "reminder_type";
                                                str54 = str46;
                                                ProgressDialog progressDialog13 = this$0.f34316z;
                                                if (progressDialog13 != null) {
                                                    progressDialog13.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.l(goalById6, null, z25), 3);
                                                } else {
                                                    kotlin.jvm.internal.i.q("progressDialog");
                                                    throw null;
                                                }
                                            } else {
                                                Context applicationContext6 = this$0.requireContext().getApplicationContext();
                                                kotlin.jvm.internal.i.f(applicationContext6, "requireContext().applicationContext");
                                                long time11 = goalById6.getmStartDate().getTime();
                                                long time12 = goalById6.getmScheduleDate().getTime();
                                                String type6 = goalById6.getType();
                                                kotlin.jvm.internal.i.d(type6);
                                                String goalId24 = goalById6.getGoalId();
                                                kotlin.jvm.internal.i.d(goalId24);
                                                String courseName6 = goalById6.getCourseName();
                                                kotlin.jvm.internal.i.d(courseName6);
                                                String goalName6 = goalById6.getGoalName();
                                                kotlin.jvm.internal.i.d(goalName6);
                                                str53 = "reminder_type";
                                                str47 = "variant";
                                                str54 = str46;
                                                str48 = "toggle";
                                                str49 = Constants.GOAL_ID;
                                                str50 = "course";
                                                str51 = "custom";
                                                str52 = "one_time";
                                                Utils.updateActivityNotification$default(utils5, applicationContext6, z22, time11, time12, type6, goalId24, courseName6, goalName6, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                                z25 = z22;
                                                goal10.setNotificationScheduled(z25);
                                                FirebasePersistence.getInstance().updateGoal(goal10, Boolean.TRUE);
                                            }
                                            Bundle bundle7222 = new Bundle();
                                            bundle7222.putString(str50, goal10.getCourseName());
                                            bundle7222.putString(str49, goal10.getGoalId());
                                            bundle7222.putBoolean(str48, z25);
                                            bundle7222.putString(str47, str54);
                                            bundle7222.putString(str53, str51);
                                            bundle7222.putString("frequency", str52);
                                            gk.a.b(bundle7222, "profile_goal_toggle");
                                            return;
                                        }
                                    }
                                    str46 = "new";
                                    utils5 = Utils.INSTANCE;
                                    goalId5 = goalById6.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId5);
                                    if (utils5.getGoalNotificationContent(goalId5) != null) {
                                    }
                                    Bundle bundle72222 = new Bundle();
                                    bundle72222.putString(str50, goal10.getCourseName());
                                    bundle72222.putString(str49, goal10.getGoalId());
                                    bundle72222.putBoolean(str48, z25);
                                    bundle72222.putString(str47, str54);
                                    bundle72222.putString(str53, str51);
                                    bundle72222.putString("frequency", str52);
                                    gk.a.b(bundle72222, "profile_goal_toggle");
                                    return;
                            }
                        }
                    });
                    ((LinearLayout) _$_findCachedViewById(R.id.customReminderHeaderDailyContainer)).addView(inflate2);
                    i11 = R.id.tvRowGoalTime;
                }
            } else {
                ((LinearLayout) _$_findCachedViewById(R.id.customReminderHeaderDailyContainer)).setVisibility(8);
                ((RobertoTextView) _$_findCachedViewById(R.id.customReminderHeaderDaily)).setVisibility(8);
            }
            if (list.isEmpty()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                ((LinearLayout) _$_findCachedViewById(R.id.activityReminderHeaderWeeklyContainer)).setVisibility(0);
                ((RobertoTextView) _$_findCachedViewById(R.id.activityReminderHeaderWeekly)).setVisibility(0);
                for (final Goal goal10 : list) {
                    View inflate3 = getLayoutInflater().inflate(R.layout.row_notification_new, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.activityReminderHeaderWeeklyContainer)), false);
                    RobertoTextView robertoTextView5 = (RobertoTextView) inflate3.findViewById(R.id.tvRowGoalTime);
                    kotlin.jvm.internal.i.f(robertoTextView5, "row.tvRowGoalTime");
                    U(robertoTextView5, goal10);
                    RobertoTextView robertoTextView6 = (RobertoTextView) inflate3.findViewById(R.id.tvRowGoalName);
                    if (robertoTextView6 != null) {
                        robertoTextView6.setText(goal10.getGoalName());
                    }
                    ((SwitchCompat) inflate3.findViewById(R.id.switchRowGoalScheduleNotification)).setChecked(goal10.getNotificationScheduled());
                    ((SwitchCompat) inflate3.findViewById(R.id.switchRowGoalScheduleNotification)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: uo.c
                        /* JADX WARN: Removed duplicated region for block: B:107:0x06ae  */
                        /* JADX WARN: Removed duplicated region for block: B:108:0x072b  */
                        /* JADX WARN: Removed duplicated region for block: B:136:0x0840  */
                        /* JADX WARN: Removed duplicated region for block: B:137:0x08ba  */
                        /* JADX WARN: Removed duplicated region for block: B:41:0x024d  */
                        /* JADX WARN: Removed duplicated region for block: B:42:0x02c4  */
                        /* JADX WARN: Removed duplicated region for block: B:63:0x03bf  */
                        /* JADX WARN: Removed duplicated region for block: B:64:0x0439  */
                        /* JADX WARN: Removed duplicated region for block: B:85:0x0534  */
                        /* JADX WARN: Removed duplicated region for block: B:86:0x05b1  */
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z22) {
                            String str;
                            Utils utils;
                            String goalId;
                            String str2;
                            String str3;
                            String str4;
                            String str5;
                            String str6;
                            boolean z23;
                            String str7;
                            String str8;
                            String str9;
                            String str10;
                            Utils utils2;
                            String goalId2;
                            String str11;
                            String str12;
                            String str13;
                            String str14;
                            String str15;
                            String str16;
                            String str17;
                            String str18;
                            String str19;
                            Utils utils3;
                            String goalId3;
                            String str20;
                            String str21;
                            String str22;
                            String str23;
                            String str24;
                            String str25;
                            String str26;
                            String str27;
                            String str28;
                            Utils utils4;
                            String goalId4;
                            String str29;
                            String str30;
                            String str31;
                            String str32;
                            String str33;
                            String str34;
                            boolean z24;
                            String str35;
                            String str36;
                            String str37;
                            Goal goal92;
                            String str38;
                            String str39;
                            String str40;
                            String str41;
                            String str42;
                            String str43;
                            String str44;
                            String str45;
                            String str46;
                            Utils utils5;
                            String goalId5;
                            String str47;
                            String str48;
                            String str49;
                            String str50;
                            boolean z25;
                            String str51;
                            String str52;
                            String str53;
                            String str54;
                            boolean z26 = z22;
                            int i13 = r3;
                            k this$0 = this;
                            Goal goal102 = goal10;
                            switch (i13) {
                                case 0:
                                    int i14 = k.E;
                                    kotlin.jvm.internal.i.g(goal102, "$goal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById = FirebasePersistence.getInstance().getGoalById(goal102.getGoalId(), goal102.getCourseId());
                                    if (goal102.getGoalId() != null) {
                                        String goalId6 = goal102.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId6);
                                        if (goalId6.length() >= 7) {
                                            String goalId7 = goal102.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId7);
                                            str = "reminder_type";
                                            String substring = goalId7.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring, "custom_")) {
                                                ProgressDialog progressDialog = this$0.f34316z;
                                                if (progressDialog != null) {
                                                    progressDialog.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.m(goalById, null, z26), 3);
                                                    str2 = "variant";
                                                    str3 = "new";
                                                    str4 = "toggle";
                                                    str5 = Constants.GOAL_ID;
                                                    str6 = "course";
                                                    z23 = z26;
                                                    str7 = "regular";
                                                    str8 = str;
                                                    str9 = "daily";
                                                    Bundle bundle2222 = new Bundle();
                                                    bundle2222.putString(str6, goal102.getCourseName());
                                                    bundle2222.putString(str5, goal102.getGoalId());
                                                    bundle2222.putBoolean(str4, z23);
                                                    bundle2222.putString(str2, str3);
                                                    bundle2222.putString(str8, str7);
                                                    bundle2222.putString("frequency", str9);
                                                    gk.a.b(bundle2222, "profile_goal_toggle");
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                            utils = Utils.INSTANCE;
                                            goalId = goal102.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId);
                                            if (utils.getGoalNotificationContent(goalId) != null) {
                                                str2 = "variant";
                                                str3 = "new";
                                                str4 = "toggle";
                                                str5 = Constants.GOAL_ID;
                                                str6 = "course";
                                                z23 = z26;
                                                str7 = "regular";
                                                str8 = str;
                                                str9 = "daily";
                                                if (is.k.Q1(goal102.getType(), new String[]{Constants.GOAL_TYPE_RELAXATION_ACTIVITY, "physical_activity"})) {
                                                    ProgressDialog progressDialog2 = this$0.f34316z;
                                                    if (progressDialog2 != null) {
                                                        progressDialog2.show();
                                                        FireStoreUtilsKt.fetchSingleRecommendedActivity(goal102.getGoalId(), new l(this$0, z23, goal102));
                                                    } else {
                                                        kotlin.jvm.internal.i.q("progressDialog");
                                                        throw null;
                                                    }
                                                } else {
                                                    ProgressDialog progressDialog3 = this$0.f34316z;
                                                    if (progressDialog3 != null) {
                                                        progressDialog3.show();
                                                        v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.n(goalById, null, z23), 3);
                                                    } else {
                                                        kotlin.jvm.internal.i.q("progressDialog");
                                                        throw null;
                                                    }
                                                }
                                            } else {
                                                Context applicationContext = this$0.requireContext().getApplicationContext();
                                                kotlin.jvm.internal.i.f(applicationContext, "requireContext().applicationContext");
                                                long time = goalById.getmStartDate().getTime();
                                                long time2 = goalById.getmScheduleDate().getTime();
                                                String type = goalById.getType();
                                                kotlin.jvm.internal.i.d(type);
                                                String goalId8 = goalById.getGoalId();
                                                kotlin.jvm.internal.i.d(goalId8);
                                                String courseName = goalById.getCourseName();
                                                kotlin.jvm.internal.i.d(courseName);
                                                String goalName = goalById.getGoalName();
                                                kotlin.jvm.internal.i.d(goalName);
                                                str8 = str;
                                                str9 = "daily";
                                                str2 = "variant";
                                                str3 = "new";
                                                str4 = "toggle";
                                                str5 = Constants.GOAL_ID;
                                                str6 = "course";
                                                str7 = "regular";
                                                Utils.updateActivityNotification$default(utils, applicationContext, z22, time, time2, type, goalId8, courseName, goalName, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                                z23 = z22;
                                                goal102.setNotificationScheduled(z23);
                                                FirebasePersistence.getInstance().updateGoal(goal102, Boolean.TRUE);
                                            }
                                            Bundle bundle22222 = new Bundle();
                                            bundle22222.putString(str6, goal102.getCourseName());
                                            bundle22222.putString(str5, goal102.getGoalId());
                                            bundle22222.putBoolean(str4, z23);
                                            bundle22222.putString(str2, str3);
                                            bundle22222.putString(str8, str7);
                                            bundle22222.putString("frequency", str9);
                                            gk.a.b(bundle22222, "profile_goal_toggle");
                                            return;
                                        }
                                    }
                                    str = "reminder_type";
                                    utils = Utils.INSTANCE;
                                    goalId = goal102.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId);
                                    if (utils.getGoalNotificationContent(goalId) != null) {
                                    }
                                    Bundle bundle222222 = new Bundle();
                                    bundle222222.putString(str6, goal102.getCourseName());
                                    bundle222222.putString(str5, goal102.getGoalId());
                                    bundle222222.putBoolean(str4, z23);
                                    bundle222222.putString(str2, str3);
                                    bundle222222.putString(str8, str7);
                                    bundle222222.putString("frequency", str9);
                                    gk.a.b(bundle222222, "profile_goal_toggle");
                                    return;
                                case 1:
                                    boolean z27 = z26;
                                    int i15 = k.E;
                                    kotlin.jvm.internal.i.g(goal102, "$goal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById2 = FirebasePersistence.getInstance().getGoalById(goal102.getGoalId(), goal102.getCourseId());
                                    if (goal102.getGoalId() != null) {
                                        String goalId9 = goal102.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId9);
                                        if (goalId9.length() >= 7) {
                                            String goalId10 = goal102.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId10);
                                            str10 = "variant";
                                            String substring2 = goalId10.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring2, "custom_")) {
                                                ProgressDialog progressDialog4 = this$0.f34316z;
                                                if (progressDialog4 != null) {
                                                    progressDialog4.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.o(goalById2, null, z27), 3);
                                                    str11 = "new";
                                                    str12 = "toggle";
                                                    str13 = Constants.GOAL_ID;
                                                    str14 = "daily";
                                                    str15 = "course";
                                                    str16 = "custom";
                                                    str17 = "profile_goal_toggle";
                                                    str18 = str10;
                                                    Bundle bundle32222 = new Bundle();
                                                    bundle32222.putString(str15, goal102.getCourseName());
                                                    bundle32222.putString(str13, goal102.getGoalId());
                                                    bundle32222.putBoolean(str12, z27);
                                                    bundle32222.putString(str18, str11);
                                                    bundle32222.putString("reminder_type", str16);
                                                    bundle32222.putString("frequency", str14);
                                                    gk.a.b(bundle32222, str17);
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                            utils2 = Utils.INSTANCE;
                                            goalId2 = goal102.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId2);
                                            if (utils2.getGoalNotificationContent(goalId2) != null) {
                                                str11 = "new";
                                                str12 = "toggle";
                                                str13 = Constants.GOAL_ID;
                                                str14 = "daily";
                                                str15 = "course";
                                                str16 = "custom";
                                                str17 = "profile_goal_toggle";
                                                str18 = str10;
                                                ProgressDialog progressDialog5 = this$0.f34316z;
                                                if (progressDialog5 != null) {
                                                    progressDialog5.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.p(goalById2, null, z27), 3);
                                                } else {
                                                    kotlin.jvm.internal.i.q("progressDialog");
                                                    throw null;
                                                }
                                            } else {
                                                Context applicationContext2 = this$0.requireContext().getApplicationContext();
                                                kotlin.jvm.internal.i.f(applicationContext2, "requireContext().applicationContext");
                                                long time3 = goalById2.getmStartDate().getTime();
                                                long time4 = goalById2.getmScheduleDate().getTime();
                                                String type2 = goalById2.getType();
                                                kotlin.jvm.internal.i.d(type2);
                                                String goalId11 = goalById2.getGoalId();
                                                kotlin.jvm.internal.i.d(goalId11);
                                                String courseName2 = goalById2.getCourseName();
                                                kotlin.jvm.internal.i.d(courseName2);
                                                String goalName2 = goalById2.getGoalName();
                                                kotlin.jvm.internal.i.d(goalName2);
                                                str18 = str10;
                                                str17 = "profile_goal_toggle";
                                                str11 = "new";
                                                str12 = "toggle";
                                                str13 = Constants.GOAL_ID;
                                                str14 = "daily";
                                                str15 = "course";
                                                str16 = "custom";
                                                Utils.updateActivityNotification$default(utils2, applicationContext2, z22, time3, time4, type2, goalId11, courseName2, goalName2, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                                z27 = z22;
                                                goal102.setNotificationScheduled(z27);
                                                FirebasePersistence.getInstance().updateGoal(goal102, Boolean.TRUE);
                                            }
                                            Bundle bundle322222 = new Bundle();
                                            bundle322222.putString(str15, goal102.getCourseName());
                                            bundle322222.putString(str13, goal102.getGoalId());
                                            bundle322222.putBoolean(str12, z27);
                                            bundle322222.putString(str18, str11);
                                            bundle322222.putString("reminder_type", str16);
                                            bundle322222.putString("frequency", str14);
                                            gk.a.b(bundle322222, str17);
                                            return;
                                        }
                                    }
                                    str10 = "variant";
                                    utils2 = Utils.INSTANCE;
                                    goalId2 = goal102.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId2);
                                    if (utils2.getGoalNotificationContent(goalId2) != null) {
                                    }
                                    Bundle bundle3222222 = new Bundle();
                                    bundle3222222.putString(str15, goal102.getCourseName());
                                    bundle3222222.putString(str13, goal102.getGoalId());
                                    bundle3222222.putBoolean(str12, z27);
                                    bundle3222222.putString(str18, str11);
                                    bundle3222222.putString("reminder_type", str16);
                                    bundle3222222.putString("frequency", str14);
                                    gk.a.b(bundle3222222, str17);
                                    return;
                                case 2:
                                    boolean z28 = z26;
                                    int i16 = k.E;
                                    kotlin.jvm.internal.i.g(goal102, "$weeklyGoal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById3 = FirebasePersistence.getInstance().getGoalById(goal102.getGoalId(), goal102.getCourseId());
                                    if (goalById3.getGoalId() != null) {
                                        String goalId12 = goalById3.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId12);
                                        if (goalId12.length() >= 7) {
                                            String goalId13 = goalById3.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId13);
                                            str19 = "variant";
                                            String substring3 = goalId13.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring3, "custom_")) {
                                                ProgressDialog progressDialog6 = this$0.f34316z;
                                                if (progressDialog6 != null) {
                                                    progressDialog6.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.e(goalById3, null, z28), 3);
                                                    str20 = "reminder_type";
                                                    str21 = "new";
                                                    str22 = "toggle";
                                                    str23 = Constants.GOAL_ID;
                                                    str24 = "course";
                                                    str25 = "regular";
                                                    str26 = str19;
                                                    str27 = "weekly";
                                                    Bundle bundle42222 = new Bundle();
                                                    bundle42222.putString(str24, goal102.getCourseName());
                                                    bundle42222.putString(str23, goal102.getGoalId());
                                                    bundle42222.putBoolean(str22, z28);
                                                    bundle42222.putString(str26, str21);
                                                    bundle42222.putString(str20, str25);
                                                    bundle42222.putString("frequency", str27);
                                                    gk.a.b(bundle42222, "profile_goal_toggle");
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                            utils3 = Utils.INSTANCE;
                                            goalId3 = goalById3.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId3);
                                            if (utils3.getGoalNotificationContent(goalId3) != null) {
                                                str20 = "reminder_type";
                                                str21 = "new";
                                                str22 = "toggle";
                                                str23 = Constants.GOAL_ID;
                                                str24 = "course";
                                                str25 = "regular";
                                                str26 = str19;
                                                str27 = "weekly";
                                                ProgressDialog progressDialog7 = this$0.f34316z;
                                                if (progressDialog7 != null) {
                                                    progressDialog7.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.f(goalById3, null, z28), 3);
                                                } else {
                                                    kotlin.jvm.internal.i.q("progressDialog");
                                                    throw null;
                                                }
                                            } else {
                                                Context applicationContext3 = this$0.requireContext().getApplicationContext();
                                                kotlin.jvm.internal.i.f(applicationContext3, "requireContext().applicationContext");
                                                long time5 = goalById3.getmStartDate().getTime();
                                                long time6 = goalById3.getmScheduleDate().getTime();
                                                String type3 = goalById3.getType();
                                                kotlin.jvm.internal.i.d(type3);
                                                String goalId14 = goalById3.getGoalId();
                                                kotlin.jvm.internal.i.d(goalId14);
                                                String courseName3 = goalById3.getCourseName();
                                                kotlin.jvm.internal.i.d(courseName3);
                                                String goalName3 = goalById3.getGoalName();
                                                kotlin.jvm.internal.i.d(goalName3);
                                                str27 = "weekly";
                                                str20 = "reminder_type";
                                                str26 = str19;
                                                str21 = "new";
                                                str22 = "toggle";
                                                str23 = Constants.GOAL_ID;
                                                str24 = "course";
                                                str25 = "regular";
                                                Utils.updateActivityNotification$default(utils3, applicationContext3, z22, time5, time6, type3, goalId14, courseName3, goalName3, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                                z28 = z22;
                                                goal102.setNotificationScheduled(z28);
                                                FirebasePersistence.getInstance().updateGoal(goal102, Boolean.TRUE);
                                            }
                                            Bundle bundle422222 = new Bundle();
                                            bundle422222.putString(str24, goal102.getCourseName());
                                            bundle422222.putString(str23, goal102.getGoalId());
                                            bundle422222.putBoolean(str22, z28);
                                            bundle422222.putString(str26, str21);
                                            bundle422222.putString(str20, str25);
                                            bundle422222.putString("frequency", str27);
                                            gk.a.b(bundle422222, "profile_goal_toggle");
                                            return;
                                        }
                                    }
                                    str19 = "variant";
                                    utils3 = Utils.INSTANCE;
                                    goalId3 = goalById3.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId3);
                                    if (utils3.getGoalNotificationContent(goalId3) != null) {
                                    }
                                    Bundle bundle4222222 = new Bundle();
                                    bundle4222222.putString(str24, goal102.getCourseName());
                                    bundle4222222.putString(str23, goal102.getGoalId());
                                    bundle4222222.putBoolean(str22, z28);
                                    bundle4222222.putString(str26, str21);
                                    bundle4222222.putString(str20, str25);
                                    bundle4222222.putString("frequency", str27);
                                    gk.a.b(bundle4222222, "profile_goal_toggle");
                                    return;
                                case 3:
                                    int i17 = k.E;
                                    kotlin.jvm.internal.i.g(goal102, "$weeklyGoal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById4 = FirebasePersistence.getInstance().getGoalById(goal102.getGoalId(), goal102.getCourseId());
                                    if (goalById4.getGoalId() != null) {
                                        String goalId15 = goalById4.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId15);
                                        if (goalId15.length() >= 7) {
                                            String goalId16 = goalById4.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId16);
                                            str28 = "profile_goal_toggle";
                                            String substring4 = goalId16.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring4, "custom_")) {
                                                ProgressDialog progressDialog8 = this$0.f34316z;
                                                if (progressDialog8 != null) {
                                                    progressDialog8.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.g(goalById4, null, z26), 3);
                                                    str29 = "toggle";
                                                    str30 = Constants.GOAL_ID;
                                                    str31 = "custom";
                                                    str32 = "course";
                                                    str33 = "weekly";
                                                    str34 = "frequency";
                                                    z24 = z26;
                                                    str35 = str28;
                                                    Bundle bundle52222 = new Bundle();
                                                    bundle52222.putString(str32, goal102.getCourseName());
                                                    bundle52222.putString(str30, goal102.getGoalId());
                                                    bundle52222.putBoolean(str29, z24);
                                                    bundle52222.putString("variant", "new");
                                                    bundle52222.putString("reminder_type", str31);
                                                    bundle52222.putString(str34, str33);
                                                    gk.a.b(bundle52222, str35);
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                            utils4 = Utils.INSTANCE;
                                            goalId4 = goalById4.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId4);
                                            if (utils4.getGoalNotificationContent(goalId4) != null) {
                                                str29 = "toggle";
                                                str30 = Constants.GOAL_ID;
                                                str31 = "custom";
                                                str32 = "course";
                                                str33 = "weekly";
                                                str34 = "frequency";
                                                z24 = z26;
                                                str35 = str28;
                                                ProgressDialog progressDialog9 = this$0.f34316z;
                                                if (progressDialog9 != null) {
                                                    progressDialog9.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.h(goalById4, null, z24), 3);
                                                } else {
                                                    kotlin.jvm.internal.i.q("progressDialog");
                                                    throw null;
                                                }
                                            } else {
                                                Context applicationContext4 = this$0.requireContext().getApplicationContext();
                                                kotlin.jvm.internal.i.f(applicationContext4, "requireContext().applicationContext");
                                                long time7 = goalById4.getmStartDate().getTime();
                                                long time8 = goalById4.getmScheduleDate().getTime();
                                                String type4 = goalById4.getType();
                                                kotlin.jvm.internal.i.d(type4);
                                                String goalId17 = goalById4.getGoalId();
                                                kotlin.jvm.internal.i.d(goalId17);
                                                String courseName4 = goalById4.getCourseName();
                                                kotlin.jvm.internal.i.d(courseName4);
                                                String goalName4 = goalById4.getGoalName();
                                                kotlin.jvm.internal.i.d(goalName4);
                                                str35 = str28;
                                                str29 = "toggle";
                                                str30 = Constants.GOAL_ID;
                                                str31 = "custom";
                                                str32 = "course";
                                                str33 = "weekly";
                                                str34 = "frequency";
                                                Utils.updateActivityNotification$default(utils4, applicationContext4, z22, time7, time8, type4, goalId17, courseName4, goalName4, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                                z24 = z22;
                                                goal102.setNotificationScheduled(z24);
                                                FirebasePersistence.getInstance().updateGoal(goal102, Boolean.TRUE);
                                            }
                                            Bundle bundle522222 = new Bundle();
                                            bundle522222.putString(str32, goal102.getCourseName());
                                            bundle522222.putString(str30, goal102.getGoalId());
                                            bundle522222.putBoolean(str29, z24);
                                            bundle522222.putString("variant", "new");
                                            bundle522222.putString("reminder_type", str31);
                                            bundle522222.putString(str34, str33);
                                            gk.a.b(bundle522222, str35);
                                            return;
                                        }
                                    }
                                    str28 = "profile_goal_toggle";
                                    utils4 = Utils.INSTANCE;
                                    goalId4 = goalById4.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId4);
                                    if (utils4.getGoalNotificationContent(goalId4) != null) {
                                    }
                                    Bundle bundle5222222 = new Bundle();
                                    bundle5222222.putString(str32, goal102.getCourseName());
                                    bundle5222222.putString(str30, goal102.getGoalId());
                                    bundle5222222.putBoolean(str29, z24);
                                    bundle5222222.putString("variant", "new");
                                    bundle5222222.putString("reminder_type", str31);
                                    bundle5222222.putString(str34, str33);
                                    gk.a.b(bundle5222222, str35);
                                    return;
                                case 4:
                                    int i18 = k.E;
                                    kotlin.jvm.internal.i.g(goal102, "$oneTimeGoal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById5 = FirebasePersistence.getInstance().getGoalById(goal102.getGoalId(), goal102.getCourseId());
                                    if (goalById5.getGoalId() != null) {
                                        String goalId18 = goalById5.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId18);
                                        if (goalId18.length() >= 7) {
                                            String goalId19 = goalById5.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId19);
                                            String substring5 = goalId19.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring5, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring5, "custom_")) {
                                                ProgressDialog progressDialog10 = this$0.f34316z;
                                                if (progressDialog10 != null) {
                                                    progressDialog10.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.i(goalById5, null, z26), 3);
                                                    str36 = "one_time";
                                                    str37 = "regular";
                                                    goal92 = goal102;
                                                    str38 = "reminder_type";
                                                    str39 = "new";
                                                    str40 = "variant";
                                                    str41 = "toggle";
                                                    str42 = Constants.GOAL_ID;
                                                    str44 = "profile_goal_toggle";
                                                    str45 = "course";
                                                    str43 = "frequency";
                                                    Bundle bundle62222 = new Bundle();
                                                    bundle62222.putString(str45, goal92.getCourseName());
                                                    bundle62222.putString(str42, goal92.getGoalId());
                                                    bundle62222.putBoolean(str41, z26);
                                                    bundle62222.putString(str40, str39);
                                                    bundle62222.putString(str38, str37);
                                                    bundle62222.putString(str43, str36);
                                                    gk.a.b(bundle62222, str44);
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                        }
                                    }
                                    Utils utils6 = Utils.INSTANCE;
                                    String goalId20 = goalById5.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId20);
                                    if (utils6.getGoalNotificationContent(goalId20) == null) {
                                        str36 = "one_time";
                                        str37 = "regular";
                                        goal92 = goal102;
                                        str38 = "reminder_type";
                                        str39 = "new";
                                        str40 = "variant";
                                        str41 = "toggle";
                                        str42 = Constants.GOAL_ID;
                                        str43 = "frequency";
                                        str44 = "profile_goal_toggle";
                                        str45 = "course";
                                        ProgressDialog progressDialog11 = this$0.f34316z;
                                        if (progressDialog11 != null) {
                                            progressDialog11.show();
                                            v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.j(goalById5, null, z26), 3);
                                            Bundle bundle622222 = new Bundle();
                                            bundle622222.putString(str45, goal92.getCourseName());
                                            bundle622222.putString(str42, goal92.getGoalId());
                                            bundle622222.putBoolean(str41, z26);
                                            bundle622222.putString(str40, str39);
                                            bundle622222.putString(str38, str37);
                                            bundle622222.putString(str43, str36);
                                            gk.a.b(bundle622222, str44);
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("progressDialog");
                                        throw null;
                                    }
                                    Context applicationContext5 = this$0.requireContext().getApplicationContext();
                                    kotlin.jvm.internal.i.f(applicationContext5, "requireContext().applicationContext");
                                    long time9 = goalById5.getmStartDate().getTime();
                                    long time10 = goalById5.getmScheduleDate().getTime();
                                    String type5 = goalById5.getType();
                                    kotlin.jvm.internal.i.d(type5);
                                    String goalId21 = goalById5.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId21);
                                    String courseName5 = goalById5.getCourseName();
                                    kotlin.jvm.internal.i.d(courseName5);
                                    String goalName5 = goalById5.getGoalName();
                                    kotlin.jvm.internal.i.d(goalName5);
                                    str44 = "profile_goal_toggle";
                                    str37 = "regular";
                                    str36 = "one_time";
                                    goal92 = goal102;
                                    str38 = "reminder_type";
                                    str39 = "new";
                                    str40 = "variant";
                                    str41 = "toggle";
                                    str42 = Constants.GOAL_ID;
                                    str45 = "course";
                                    Utils.updateActivityNotification$default(utils6, applicationContext5, z22, time9, time10, type5, goalId21, courseName5, goalName5, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                    z26 = z22;
                                    goal92.setNotificationScheduled(z26);
                                    FirebasePersistence.getInstance().updateGoal(goal92, Boolean.TRUE);
                                    str43 = "frequency";
                                    Bundle bundle6222222 = new Bundle();
                                    bundle6222222.putString(str45, goal92.getCourseName());
                                    bundle6222222.putString(str42, goal92.getGoalId());
                                    bundle6222222.putBoolean(str41, z26);
                                    bundle6222222.putString(str40, str39);
                                    bundle6222222.putString(str38, str37);
                                    bundle6222222.putString(str43, str36);
                                    gk.a.b(bundle6222222, str44);
                                    return;
                                default:
                                    int i19 = k.E;
                                    kotlin.jvm.internal.i.g(goal102, "$oneTimeGoal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById6 = FirebasePersistence.getInstance().getGoalById(goal102.getGoalId(), goal102.getCourseId());
                                    if (goalById6.getGoalId() != null) {
                                        String goalId22 = goalById6.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId22);
                                        if (goalId22.length() >= 7) {
                                            String goalId23 = goalById6.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId23);
                                            str46 = "new";
                                            String substring6 = goalId23.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring6, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring6, "custom_")) {
                                                ProgressDialog progressDialog12 = this$0.f34316z;
                                                if (progressDialog12 != null) {
                                                    progressDialog12.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.C0577k(goalById6, null, z26), 3);
                                                    str47 = "variant";
                                                    str48 = "toggle";
                                                    str49 = Constants.GOAL_ID;
                                                    str50 = "course";
                                                    z25 = z26;
                                                    str51 = "custom";
                                                    str52 = "one_time";
                                                    str53 = "reminder_type";
                                                    str54 = str46;
                                                    Bundle bundle72222 = new Bundle();
                                                    bundle72222.putString(str50, goal102.getCourseName());
                                                    bundle72222.putString(str49, goal102.getGoalId());
                                                    bundle72222.putBoolean(str48, z25);
                                                    bundle72222.putString(str47, str54);
                                                    bundle72222.putString(str53, str51);
                                                    bundle72222.putString("frequency", str52);
                                                    gk.a.b(bundle72222, "profile_goal_toggle");
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                            utils5 = Utils.INSTANCE;
                                            goalId5 = goalById6.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId5);
                                            if (utils5.getGoalNotificationContent(goalId5) != null) {
                                                str47 = "variant";
                                                str48 = "toggle";
                                                str49 = Constants.GOAL_ID;
                                                str50 = "course";
                                                z25 = z26;
                                                str51 = "custom";
                                                str52 = "one_time";
                                                str53 = "reminder_type";
                                                str54 = str46;
                                                ProgressDialog progressDialog13 = this$0.f34316z;
                                                if (progressDialog13 != null) {
                                                    progressDialog13.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.l(goalById6, null, z25), 3);
                                                } else {
                                                    kotlin.jvm.internal.i.q("progressDialog");
                                                    throw null;
                                                }
                                            } else {
                                                Context applicationContext6 = this$0.requireContext().getApplicationContext();
                                                kotlin.jvm.internal.i.f(applicationContext6, "requireContext().applicationContext");
                                                long time11 = goalById6.getmStartDate().getTime();
                                                long time12 = goalById6.getmScheduleDate().getTime();
                                                String type6 = goalById6.getType();
                                                kotlin.jvm.internal.i.d(type6);
                                                String goalId24 = goalById6.getGoalId();
                                                kotlin.jvm.internal.i.d(goalId24);
                                                String courseName6 = goalById6.getCourseName();
                                                kotlin.jvm.internal.i.d(courseName6);
                                                String goalName6 = goalById6.getGoalName();
                                                kotlin.jvm.internal.i.d(goalName6);
                                                str53 = "reminder_type";
                                                str47 = "variant";
                                                str54 = str46;
                                                str48 = "toggle";
                                                str49 = Constants.GOAL_ID;
                                                str50 = "course";
                                                str51 = "custom";
                                                str52 = "one_time";
                                                Utils.updateActivityNotification$default(utils5, applicationContext6, z22, time11, time12, type6, goalId24, courseName6, goalName6, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                                z25 = z22;
                                                goal102.setNotificationScheduled(z25);
                                                FirebasePersistence.getInstance().updateGoal(goal102, Boolean.TRUE);
                                            }
                                            Bundle bundle722222 = new Bundle();
                                            bundle722222.putString(str50, goal102.getCourseName());
                                            bundle722222.putString(str49, goal102.getGoalId());
                                            bundle722222.putBoolean(str48, z25);
                                            bundle722222.putString(str47, str54);
                                            bundle722222.putString(str53, str51);
                                            bundle722222.putString("frequency", str52);
                                            gk.a.b(bundle722222, "profile_goal_toggle");
                                            return;
                                        }
                                    }
                                    str46 = "new";
                                    utils5 = Utils.INSTANCE;
                                    goalId5 = goalById6.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId5);
                                    if (utils5.getGoalNotificationContent(goalId5) != null) {
                                    }
                                    Bundle bundle7222222 = new Bundle();
                                    bundle7222222.putString(str50, goal102.getCourseName());
                                    bundle7222222.putString(str49, goal102.getGoalId());
                                    bundle7222222.putBoolean(str48, z25);
                                    bundle7222222.putString(str47, str54);
                                    bundle7222222.putString(str53, str51);
                                    bundle7222222.putString("frequency", str52);
                                    gk.a.b(bundle7222222, "profile_goal_toggle");
                                    return;
                            }
                        }
                    });
                    ((LinearLayout) _$_findCachedViewById(R.id.activityReminderHeaderWeeklyContainer)).addView(inflate3);
                }
            } else {
                ((LinearLayout) _$_findCachedViewById(R.id.activityReminderHeaderWeeklyContainer)).setVisibility(8);
                ((RobertoTextView) _$_findCachedViewById(R.id.activityReminderHeaderWeekly)).setVisibility(8);
            }
            if (list2.isEmpty()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12) {
                ((LinearLayout) _$_findCachedViewById(R.id.customReminderHeaderWeeklyContainer)).setVisibility(0);
                ((RobertoTextView) _$_findCachedViewById(R.id.customReminderHeaderWeekly)).setVisibility(0);
                for (final Goal goal11 : list2) {
                    View inflate4 = getLayoutInflater().inflate(R.layout.row_notification_new, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.customReminderHeaderWeeklyContainer)), false);
                    RobertoTextView robertoTextView7 = (RobertoTextView) inflate4.findViewById(R.id.tvRowGoalTime);
                    kotlin.jvm.internal.i.f(robertoTextView7, "row.tvRowGoalTime");
                    U(robertoTextView7, goal11);
                    RobertoTextView robertoTextView8 = (RobertoTextView) inflate4.findViewById(R.id.tvRowGoalName);
                    if (robertoTextView8 != null) {
                        robertoTextView8.setText(goal11.getGoalName());
                    }
                    ((SwitchCompat) inflate4.findViewById(R.id.switchRowGoalScheduleNotification)).setChecked(goal11.getNotificationScheduled());
                    ((SwitchCompat) inflate4.findViewById(R.id.switchRowGoalScheduleNotification)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: uo.c
                        /* JADX WARN: Removed duplicated region for block: B:107:0x06ae  */
                        /* JADX WARN: Removed duplicated region for block: B:108:0x072b  */
                        /* JADX WARN: Removed duplicated region for block: B:136:0x0840  */
                        /* JADX WARN: Removed duplicated region for block: B:137:0x08ba  */
                        /* JADX WARN: Removed duplicated region for block: B:41:0x024d  */
                        /* JADX WARN: Removed duplicated region for block: B:42:0x02c4  */
                        /* JADX WARN: Removed duplicated region for block: B:63:0x03bf  */
                        /* JADX WARN: Removed duplicated region for block: B:64:0x0439  */
                        /* JADX WARN: Removed duplicated region for block: B:85:0x0534  */
                        /* JADX WARN: Removed duplicated region for block: B:86:0x05b1  */
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z22) {
                            String str;
                            Utils utils;
                            String goalId;
                            String str2;
                            String str3;
                            String str4;
                            String str5;
                            String str6;
                            boolean z23;
                            String str7;
                            String str8;
                            String str9;
                            String str10;
                            Utils utils2;
                            String goalId2;
                            String str11;
                            String str12;
                            String str13;
                            String str14;
                            String str15;
                            String str16;
                            String str17;
                            String str18;
                            String str19;
                            Utils utils3;
                            String goalId3;
                            String str20;
                            String str21;
                            String str22;
                            String str23;
                            String str24;
                            String str25;
                            String str26;
                            String str27;
                            String str28;
                            Utils utils4;
                            String goalId4;
                            String str29;
                            String str30;
                            String str31;
                            String str32;
                            String str33;
                            String str34;
                            boolean z24;
                            String str35;
                            String str36;
                            String str37;
                            Goal goal92;
                            String str38;
                            String str39;
                            String str40;
                            String str41;
                            String str42;
                            String str43;
                            String str44;
                            String str45;
                            String str46;
                            Utils utils5;
                            String goalId5;
                            String str47;
                            String str48;
                            String str49;
                            String str50;
                            boolean z25;
                            String str51;
                            String str52;
                            String str53;
                            String str54;
                            boolean z26 = z22;
                            int i13 = r3;
                            k this$0 = this;
                            Goal goal102 = goal11;
                            switch (i13) {
                                case 0:
                                    int i14 = k.E;
                                    kotlin.jvm.internal.i.g(goal102, "$goal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById = FirebasePersistence.getInstance().getGoalById(goal102.getGoalId(), goal102.getCourseId());
                                    if (goal102.getGoalId() != null) {
                                        String goalId6 = goal102.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId6);
                                        if (goalId6.length() >= 7) {
                                            String goalId7 = goal102.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId7);
                                            str = "reminder_type";
                                            String substring = goalId7.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring, "custom_")) {
                                                ProgressDialog progressDialog = this$0.f34316z;
                                                if (progressDialog != null) {
                                                    progressDialog.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.m(goalById, null, z26), 3);
                                                    str2 = "variant";
                                                    str3 = "new";
                                                    str4 = "toggle";
                                                    str5 = Constants.GOAL_ID;
                                                    str6 = "course";
                                                    z23 = z26;
                                                    str7 = "regular";
                                                    str8 = str;
                                                    str9 = "daily";
                                                    Bundle bundle222222 = new Bundle();
                                                    bundle222222.putString(str6, goal102.getCourseName());
                                                    bundle222222.putString(str5, goal102.getGoalId());
                                                    bundle222222.putBoolean(str4, z23);
                                                    bundle222222.putString(str2, str3);
                                                    bundle222222.putString(str8, str7);
                                                    bundle222222.putString("frequency", str9);
                                                    gk.a.b(bundle222222, "profile_goal_toggle");
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                            utils = Utils.INSTANCE;
                                            goalId = goal102.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId);
                                            if (utils.getGoalNotificationContent(goalId) != null) {
                                                str2 = "variant";
                                                str3 = "new";
                                                str4 = "toggle";
                                                str5 = Constants.GOAL_ID;
                                                str6 = "course";
                                                z23 = z26;
                                                str7 = "regular";
                                                str8 = str;
                                                str9 = "daily";
                                                if (is.k.Q1(goal102.getType(), new String[]{Constants.GOAL_TYPE_RELAXATION_ACTIVITY, "physical_activity"})) {
                                                    ProgressDialog progressDialog2 = this$0.f34316z;
                                                    if (progressDialog2 != null) {
                                                        progressDialog2.show();
                                                        FireStoreUtilsKt.fetchSingleRecommendedActivity(goal102.getGoalId(), new l(this$0, z23, goal102));
                                                    } else {
                                                        kotlin.jvm.internal.i.q("progressDialog");
                                                        throw null;
                                                    }
                                                } else {
                                                    ProgressDialog progressDialog3 = this$0.f34316z;
                                                    if (progressDialog3 != null) {
                                                        progressDialog3.show();
                                                        v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.n(goalById, null, z23), 3);
                                                    } else {
                                                        kotlin.jvm.internal.i.q("progressDialog");
                                                        throw null;
                                                    }
                                                }
                                            } else {
                                                Context applicationContext = this$0.requireContext().getApplicationContext();
                                                kotlin.jvm.internal.i.f(applicationContext, "requireContext().applicationContext");
                                                long time = goalById.getmStartDate().getTime();
                                                long time2 = goalById.getmScheduleDate().getTime();
                                                String type = goalById.getType();
                                                kotlin.jvm.internal.i.d(type);
                                                String goalId8 = goalById.getGoalId();
                                                kotlin.jvm.internal.i.d(goalId8);
                                                String courseName = goalById.getCourseName();
                                                kotlin.jvm.internal.i.d(courseName);
                                                String goalName = goalById.getGoalName();
                                                kotlin.jvm.internal.i.d(goalName);
                                                str8 = str;
                                                str9 = "daily";
                                                str2 = "variant";
                                                str3 = "new";
                                                str4 = "toggle";
                                                str5 = Constants.GOAL_ID;
                                                str6 = "course";
                                                str7 = "regular";
                                                Utils.updateActivityNotification$default(utils, applicationContext, z22, time, time2, type, goalId8, courseName, goalName, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                                z23 = z22;
                                                goal102.setNotificationScheduled(z23);
                                                FirebasePersistence.getInstance().updateGoal(goal102, Boolean.TRUE);
                                            }
                                            Bundle bundle2222222 = new Bundle();
                                            bundle2222222.putString(str6, goal102.getCourseName());
                                            bundle2222222.putString(str5, goal102.getGoalId());
                                            bundle2222222.putBoolean(str4, z23);
                                            bundle2222222.putString(str2, str3);
                                            bundle2222222.putString(str8, str7);
                                            bundle2222222.putString("frequency", str9);
                                            gk.a.b(bundle2222222, "profile_goal_toggle");
                                            return;
                                        }
                                    }
                                    str = "reminder_type";
                                    utils = Utils.INSTANCE;
                                    goalId = goal102.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId);
                                    if (utils.getGoalNotificationContent(goalId) != null) {
                                    }
                                    Bundle bundle22222222 = new Bundle();
                                    bundle22222222.putString(str6, goal102.getCourseName());
                                    bundle22222222.putString(str5, goal102.getGoalId());
                                    bundle22222222.putBoolean(str4, z23);
                                    bundle22222222.putString(str2, str3);
                                    bundle22222222.putString(str8, str7);
                                    bundle22222222.putString("frequency", str9);
                                    gk.a.b(bundle22222222, "profile_goal_toggle");
                                    return;
                                case 1:
                                    boolean z27 = z26;
                                    int i15 = k.E;
                                    kotlin.jvm.internal.i.g(goal102, "$goal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById2 = FirebasePersistence.getInstance().getGoalById(goal102.getGoalId(), goal102.getCourseId());
                                    if (goal102.getGoalId() != null) {
                                        String goalId9 = goal102.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId9);
                                        if (goalId9.length() >= 7) {
                                            String goalId10 = goal102.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId10);
                                            str10 = "variant";
                                            String substring2 = goalId10.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring2, "custom_")) {
                                                ProgressDialog progressDialog4 = this$0.f34316z;
                                                if (progressDialog4 != null) {
                                                    progressDialog4.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.o(goalById2, null, z27), 3);
                                                    str11 = "new";
                                                    str12 = "toggle";
                                                    str13 = Constants.GOAL_ID;
                                                    str14 = "daily";
                                                    str15 = "course";
                                                    str16 = "custom";
                                                    str17 = "profile_goal_toggle";
                                                    str18 = str10;
                                                    Bundle bundle3222222 = new Bundle();
                                                    bundle3222222.putString(str15, goal102.getCourseName());
                                                    bundle3222222.putString(str13, goal102.getGoalId());
                                                    bundle3222222.putBoolean(str12, z27);
                                                    bundle3222222.putString(str18, str11);
                                                    bundle3222222.putString("reminder_type", str16);
                                                    bundle3222222.putString("frequency", str14);
                                                    gk.a.b(bundle3222222, str17);
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                            utils2 = Utils.INSTANCE;
                                            goalId2 = goal102.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId2);
                                            if (utils2.getGoalNotificationContent(goalId2) != null) {
                                                str11 = "new";
                                                str12 = "toggle";
                                                str13 = Constants.GOAL_ID;
                                                str14 = "daily";
                                                str15 = "course";
                                                str16 = "custom";
                                                str17 = "profile_goal_toggle";
                                                str18 = str10;
                                                ProgressDialog progressDialog5 = this$0.f34316z;
                                                if (progressDialog5 != null) {
                                                    progressDialog5.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.p(goalById2, null, z27), 3);
                                                } else {
                                                    kotlin.jvm.internal.i.q("progressDialog");
                                                    throw null;
                                                }
                                            } else {
                                                Context applicationContext2 = this$0.requireContext().getApplicationContext();
                                                kotlin.jvm.internal.i.f(applicationContext2, "requireContext().applicationContext");
                                                long time3 = goalById2.getmStartDate().getTime();
                                                long time4 = goalById2.getmScheduleDate().getTime();
                                                String type2 = goalById2.getType();
                                                kotlin.jvm.internal.i.d(type2);
                                                String goalId11 = goalById2.getGoalId();
                                                kotlin.jvm.internal.i.d(goalId11);
                                                String courseName2 = goalById2.getCourseName();
                                                kotlin.jvm.internal.i.d(courseName2);
                                                String goalName2 = goalById2.getGoalName();
                                                kotlin.jvm.internal.i.d(goalName2);
                                                str18 = str10;
                                                str17 = "profile_goal_toggle";
                                                str11 = "new";
                                                str12 = "toggle";
                                                str13 = Constants.GOAL_ID;
                                                str14 = "daily";
                                                str15 = "course";
                                                str16 = "custom";
                                                Utils.updateActivityNotification$default(utils2, applicationContext2, z22, time3, time4, type2, goalId11, courseName2, goalName2, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                                z27 = z22;
                                                goal102.setNotificationScheduled(z27);
                                                FirebasePersistence.getInstance().updateGoal(goal102, Boolean.TRUE);
                                            }
                                            Bundle bundle32222222 = new Bundle();
                                            bundle32222222.putString(str15, goal102.getCourseName());
                                            bundle32222222.putString(str13, goal102.getGoalId());
                                            bundle32222222.putBoolean(str12, z27);
                                            bundle32222222.putString(str18, str11);
                                            bundle32222222.putString("reminder_type", str16);
                                            bundle32222222.putString("frequency", str14);
                                            gk.a.b(bundle32222222, str17);
                                            return;
                                        }
                                    }
                                    str10 = "variant";
                                    utils2 = Utils.INSTANCE;
                                    goalId2 = goal102.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId2);
                                    if (utils2.getGoalNotificationContent(goalId2) != null) {
                                    }
                                    Bundle bundle322222222 = new Bundle();
                                    bundle322222222.putString(str15, goal102.getCourseName());
                                    bundle322222222.putString(str13, goal102.getGoalId());
                                    bundle322222222.putBoolean(str12, z27);
                                    bundle322222222.putString(str18, str11);
                                    bundle322222222.putString("reminder_type", str16);
                                    bundle322222222.putString("frequency", str14);
                                    gk.a.b(bundle322222222, str17);
                                    return;
                                case 2:
                                    boolean z28 = z26;
                                    int i16 = k.E;
                                    kotlin.jvm.internal.i.g(goal102, "$weeklyGoal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById3 = FirebasePersistence.getInstance().getGoalById(goal102.getGoalId(), goal102.getCourseId());
                                    if (goalById3.getGoalId() != null) {
                                        String goalId12 = goalById3.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId12);
                                        if (goalId12.length() >= 7) {
                                            String goalId13 = goalById3.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId13);
                                            str19 = "variant";
                                            String substring3 = goalId13.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring3, "custom_")) {
                                                ProgressDialog progressDialog6 = this$0.f34316z;
                                                if (progressDialog6 != null) {
                                                    progressDialog6.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.e(goalById3, null, z28), 3);
                                                    str20 = "reminder_type";
                                                    str21 = "new";
                                                    str22 = "toggle";
                                                    str23 = Constants.GOAL_ID;
                                                    str24 = "course";
                                                    str25 = "regular";
                                                    str26 = str19;
                                                    str27 = "weekly";
                                                    Bundle bundle4222222 = new Bundle();
                                                    bundle4222222.putString(str24, goal102.getCourseName());
                                                    bundle4222222.putString(str23, goal102.getGoalId());
                                                    bundle4222222.putBoolean(str22, z28);
                                                    bundle4222222.putString(str26, str21);
                                                    bundle4222222.putString(str20, str25);
                                                    bundle4222222.putString("frequency", str27);
                                                    gk.a.b(bundle4222222, "profile_goal_toggle");
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                            utils3 = Utils.INSTANCE;
                                            goalId3 = goalById3.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId3);
                                            if (utils3.getGoalNotificationContent(goalId3) != null) {
                                                str20 = "reminder_type";
                                                str21 = "new";
                                                str22 = "toggle";
                                                str23 = Constants.GOAL_ID;
                                                str24 = "course";
                                                str25 = "regular";
                                                str26 = str19;
                                                str27 = "weekly";
                                                ProgressDialog progressDialog7 = this$0.f34316z;
                                                if (progressDialog7 != null) {
                                                    progressDialog7.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.f(goalById3, null, z28), 3);
                                                } else {
                                                    kotlin.jvm.internal.i.q("progressDialog");
                                                    throw null;
                                                }
                                            } else {
                                                Context applicationContext3 = this$0.requireContext().getApplicationContext();
                                                kotlin.jvm.internal.i.f(applicationContext3, "requireContext().applicationContext");
                                                long time5 = goalById3.getmStartDate().getTime();
                                                long time6 = goalById3.getmScheduleDate().getTime();
                                                String type3 = goalById3.getType();
                                                kotlin.jvm.internal.i.d(type3);
                                                String goalId14 = goalById3.getGoalId();
                                                kotlin.jvm.internal.i.d(goalId14);
                                                String courseName3 = goalById3.getCourseName();
                                                kotlin.jvm.internal.i.d(courseName3);
                                                String goalName3 = goalById3.getGoalName();
                                                kotlin.jvm.internal.i.d(goalName3);
                                                str27 = "weekly";
                                                str20 = "reminder_type";
                                                str26 = str19;
                                                str21 = "new";
                                                str22 = "toggle";
                                                str23 = Constants.GOAL_ID;
                                                str24 = "course";
                                                str25 = "regular";
                                                Utils.updateActivityNotification$default(utils3, applicationContext3, z22, time5, time6, type3, goalId14, courseName3, goalName3, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                                z28 = z22;
                                                goal102.setNotificationScheduled(z28);
                                                FirebasePersistence.getInstance().updateGoal(goal102, Boolean.TRUE);
                                            }
                                            Bundle bundle42222222 = new Bundle();
                                            bundle42222222.putString(str24, goal102.getCourseName());
                                            bundle42222222.putString(str23, goal102.getGoalId());
                                            bundle42222222.putBoolean(str22, z28);
                                            bundle42222222.putString(str26, str21);
                                            bundle42222222.putString(str20, str25);
                                            bundle42222222.putString("frequency", str27);
                                            gk.a.b(bundle42222222, "profile_goal_toggle");
                                            return;
                                        }
                                    }
                                    str19 = "variant";
                                    utils3 = Utils.INSTANCE;
                                    goalId3 = goalById3.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId3);
                                    if (utils3.getGoalNotificationContent(goalId3) != null) {
                                    }
                                    Bundle bundle422222222 = new Bundle();
                                    bundle422222222.putString(str24, goal102.getCourseName());
                                    bundle422222222.putString(str23, goal102.getGoalId());
                                    bundle422222222.putBoolean(str22, z28);
                                    bundle422222222.putString(str26, str21);
                                    bundle422222222.putString(str20, str25);
                                    bundle422222222.putString("frequency", str27);
                                    gk.a.b(bundle422222222, "profile_goal_toggle");
                                    return;
                                case 3:
                                    int i17 = k.E;
                                    kotlin.jvm.internal.i.g(goal102, "$weeklyGoal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById4 = FirebasePersistence.getInstance().getGoalById(goal102.getGoalId(), goal102.getCourseId());
                                    if (goalById4.getGoalId() != null) {
                                        String goalId15 = goalById4.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId15);
                                        if (goalId15.length() >= 7) {
                                            String goalId16 = goalById4.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId16);
                                            str28 = "profile_goal_toggle";
                                            String substring4 = goalId16.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring4, "custom_")) {
                                                ProgressDialog progressDialog8 = this$0.f34316z;
                                                if (progressDialog8 != null) {
                                                    progressDialog8.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.g(goalById4, null, z26), 3);
                                                    str29 = "toggle";
                                                    str30 = Constants.GOAL_ID;
                                                    str31 = "custom";
                                                    str32 = "course";
                                                    str33 = "weekly";
                                                    str34 = "frequency";
                                                    z24 = z26;
                                                    str35 = str28;
                                                    Bundle bundle5222222 = new Bundle();
                                                    bundle5222222.putString(str32, goal102.getCourseName());
                                                    bundle5222222.putString(str30, goal102.getGoalId());
                                                    bundle5222222.putBoolean(str29, z24);
                                                    bundle5222222.putString("variant", "new");
                                                    bundle5222222.putString("reminder_type", str31);
                                                    bundle5222222.putString(str34, str33);
                                                    gk.a.b(bundle5222222, str35);
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                            utils4 = Utils.INSTANCE;
                                            goalId4 = goalById4.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId4);
                                            if (utils4.getGoalNotificationContent(goalId4) != null) {
                                                str29 = "toggle";
                                                str30 = Constants.GOAL_ID;
                                                str31 = "custom";
                                                str32 = "course";
                                                str33 = "weekly";
                                                str34 = "frequency";
                                                z24 = z26;
                                                str35 = str28;
                                                ProgressDialog progressDialog9 = this$0.f34316z;
                                                if (progressDialog9 != null) {
                                                    progressDialog9.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.h(goalById4, null, z24), 3);
                                                } else {
                                                    kotlin.jvm.internal.i.q("progressDialog");
                                                    throw null;
                                                }
                                            } else {
                                                Context applicationContext4 = this$0.requireContext().getApplicationContext();
                                                kotlin.jvm.internal.i.f(applicationContext4, "requireContext().applicationContext");
                                                long time7 = goalById4.getmStartDate().getTime();
                                                long time8 = goalById4.getmScheduleDate().getTime();
                                                String type4 = goalById4.getType();
                                                kotlin.jvm.internal.i.d(type4);
                                                String goalId17 = goalById4.getGoalId();
                                                kotlin.jvm.internal.i.d(goalId17);
                                                String courseName4 = goalById4.getCourseName();
                                                kotlin.jvm.internal.i.d(courseName4);
                                                String goalName4 = goalById4.getGoalName();
                                                kotlin.jvm.internal.i.d(goalName4);
                                                str35 = str28;
                                                str29 = "toggle";
                                                str30 = Constants.GOAL_ID;
                                                str31 = "custom";
                                                str32 = "course";
                                                str33 = "weekly";
                                                str34 = "frequency";
                                                Utils.updateActivityNotification$default(utils4, applicationContext4, z22, time7, time8, type4, goalId17, courseName4, goalName4, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                                z24 = z22;
                                                goal102.setNotificationScheduled(z24);
                                                FirebasePersistence.getInstance().updateGoal(goal102, Boolean.TRUE);
                                            }
                                            Bundle bundle52222222 = new Bundle();
                                            bundle52222222.putString(str32, goal102.getCourseName());
                                            bundle52222222.putString(str30, goal102.getGoalId());
                                            bundle52222222.putBoolean(str29, z24);
                                            bundle52222222.putString("variant", "new");
                                            bundle52222222.putString("reminder_type", str31);
                                            bundle52222222.putString(str34, str33);
                                            gk.a.b(bundle52222222, str35);
                                            return;
                                        }
                                    }
                                    str28 = "profile_goal_toggle";
                                    utils4 = Utils.INSTANCE;
                                    goalId4 = goalById4.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId4);
                                    if (utils4.getGoalNotificationContent(goalId4) != null) {
                                    }
                                    Bundle bundle522222222 = new Bundle();
                                    bundle522222222.putString(str32, goal102.getCourseName());
                                    bundle522222222.putString(str30, goal102.getGoalId());
                                    bundle522222222.putBoolean(str29, z24);
                                    bundle522222222.putString("variant", "new");
                                    bundle522222222.putString("reminder_type", str31);
                                    bundle522222222.putString(str34, str33);
                                    gk.a.b(bundle522222222, str35);
                                    return;
                                case 4:
                                    int i18 = k.E;
                                    kotlin.jvm.internal.i.g(goal102, "$oneTimeGoal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById5 = FirebasePersistence.getInstance().getGoalById(goal102.getGoalId(), goal102.getCourseId());
                                    if (goalById5.getGoalId() != null) {
                                        String goalId18 = goalById5.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId18);
                                        if (goalId18.length() >= 7) {
                                            String goalId19 = goalById5.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId19);
                                            String substring5 = goalId19.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring5, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring5, "custom_")) {
                                                ProgressDialog progressDialog10 = this$0.f34316z;
                                                if (progressDialog10 != null) {
                                                    progressDialog10.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.i(goalById5, null, z26), 3);
                                                    str36 = "one_time";
                                                    str37 = "regular";
                                                    goal92 = goal102;
                                                    str38 = "reminder_type";
                                                    str39 = "new";
                                                    str40 = "variant";
                                                    str41 = "toggle";
                                                    str42 = Constants.GOAL_ID;
                                                    str44 = "profile_goal_toggle";
                                                    str45 = "course";
                                                    str43 = "frequency";
                                                    Bundle bundle6222222 = new Bundle();
                                                    bundle6222222.putString(str45, goal92.getCourseName());
                                                    bundle6222222.putString(str42, goal92.getGoalId());
                                                    bundle6222222.putBoolean(str41, z26);
                                                    bundle6222222.putString(str40, str39);
                                                    bundle6222222.putString(str38, str37);
                                                    bundle6222222.putString(str43, str36);
                                                    gk.a.b(bundle6222222, str44);
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                        }
                                    }
                                    Utils utils6 = Utils.INSTANCE;
                                    String goalId20 = goalById5.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId20);
                                    if (utils6.getGoalNotificationContent(goalId20) == null) {
                                        str36 = "one_time";
                                        str37 = "regular";
                                        goal92 = goal102;
                                        str38 = "reminder_type";
                                        str39 = "new";
                                        str40 = "variant";
                                        str41 = "toggle";
                                        str42 = Constants.GOAL_ID;
                                        str43 = "frequency";
                                        str44 = "profile_goal_toggle";
                                        str45 = "course";
                                        ProgressDialog progressDialog11 = this$0.f34316z;
                                        if (progressDialog11 != null) {
                                            progressDialog11.show();
                                            v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.j(goalById5, null, z26), 3);
                                            Bundle bundle62222222 = new Bundle();
                                            bundle62222222.putString(str45, goal92.getCourseName());
                                            bundle62222222.putString(str42, goal92.getGoalId());
                                            bundle62222222.putBoolean(str41, z26);
                                            bundle62222222.putString(str40, str39);
                                            bundle62222222.putString(str38, str37);
                                            bundle62222222.putString(str43, str36);
                                            gk.a.b(bundle62222222, str44);
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("progressDialog");
                                        throw null;
                                    }
                                    Context applicationContext5 = this$0.requireContext().getApplicationContext();
                                    kotlin.jvm.internal.i.f(applicationContext5, "requireContext().applicationContext");
                                    long time9 = goalById5.getmStartDate().getTime();
                                    long time10 = goalById5.getmScheduleDate().getTime();
                                    String type5 = goalById5.getType();
                                    kotlin.jvm.internal.i.d(type5);
                                    String goalId21 = goalById5.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId21);
                                    String courseName5 = goalById5.getCourseName();
                                    kotlin.jvm.internal.i.d(courseName5);
                                    String goalName5 = goalById5.getGoalName();
                                    kotlin.jvm.internal.i.d(goalName5);
                                    str44 = "profile_goal_toggle";
                                    str37 = "regular";
                                    str36 = "one_time";
                                    goal92 = goal102;
                                    str38 = "reminder_type";
                                    str39 = "new";
                                    str40 = "variant";
                                    str41 = "toggle";
                                    str42 = Constants.GOAL_ID;
                                    str45 = "course";
                                    Utils.updateActivityNotification$default(utils6, applicationContext5, z22, time9, time10, type5, goalId21, courseName5, goalName5, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                    z26 = z22;
                                    goal92.setNotificationScheduled(z26);
                                    FirebasePersistence.getInstance().updateGoal(goal92, Boolean.TRUE);
                                    str43 = "frequency";
                                    Bundle bundle622222222 = new Bundle();
                                    bundle622222222.putString(str45, goal92.getCourseName());
                                    bundle622222222.putString(str42, goal92.getGoalId());
                                    bundle622222222.putBoolean(str41, z26);
                                    bundle622222222.putString(str40, str39);
                                    bundle622222222.putString(str38, str37);
                                    bundle622222222.putString(str43, str36);
                                    gk.a.b(bundle622222222, str44);
                                    return;
                                default:
                                    int i19 = k.E;
                                    kotlin.jvm.internal.i.g(goal102, "$oneTimeGoal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById6 = FirebasePersistence.getInstance().getGoalById(goal102.getGoalId(), goal102.getCourseId());
                                    if (goalById6.getGoalId() != null) {
                                        String goalId22 = goalById6.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId22);
                                        if (goalId22.length() >= 7) {
                                            String goalId23 = goalById6.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId23);
                                            str46 = "new";
                                            String substring6 = goalId23.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring6, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring6, "custom_")) {
                                                ProgressDialog progressDialog12 = this$0.f34316z;
                                                if (progressDialog12 != null) {
                                                    progressDialog12.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.C0577k(goalById6, null, z26), 3);
                                                    str47 = "variant";
                                                    str48 = "toggle";
                                                    str49 = Constants.GOAL_ID;
                                                    str50 = "course";
                                                    z25 = z26;
                                                    str51 = "custom";
                                                    str52 = "one_time";
                                                    str53 = "reminder_type";
                                                    str54 = str46;
                                                    Bundle bundle7222222 = new Bundle();
                                                    bundle7222222.putString(str50, goal102.getCourseName());
                                                    bundle7222222.putString(str49, goal102.getGoalId());
                                                    bundle7222222.putBoolean(str48, z25);
                                                    bundle7222222.putString(str47, str54);
                                                    bundle7222222.putString(str53, str51);
                                                    bundle7222222.putString("frequency", str52);
                                                    gk.a.b(bundle7222222, "profile_goal_toggle");
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                            utils5 = Utils.INSTANCE;
                                            goalId5 = goalById6.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId5);
                                            if (utils5.getGoalNotificationContent(goalId5) != null) {
                                                str47 = "variant";
                                                str48 = "toggle";
                                                str49 = Constants.GOAL_ID;
                                                str50 = "course";
                                                z25 = z26;
                                                str51 = "custom";
                                                str52 = "one_time";
                                                str53 = "reminder_type";
                                                str54 = str46;
                                                ProgressDialog progressDialog13 = this$0.f34316z;
                                                if (progressDialog13 != null) {
                                                    progressDialog13.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.l(goalById6, null, z25), 3);
                                                } else {
                                                    kotlin.jvm.internal.i.q("progressDialog");
                                                    throw null;
                                                }
                                            } else {
                                                Context applicationContext6 = this$0.requireContext().getApplicationContext();
                                                kotlin.jvm.internal.i.f(applicationContext6, "requireContext().applicationContext");
                                                long time11 = goalById6.getmStartDate().getTime();
                                                long time12 = goalById6.getmScheduleDate().getTime();
                                                String type6 = goalById6.getType();
                                                kotlin.jvm.internal.i.d(type6);
                                                String goalId24 = goalById6.getGoalId();
                                                kotlin.jvm.internal.i.d(goalId24);
                                                String courseName6 = goalById6.getCourseName();
                                                kotlin.jvm.internal.i.d(courseName6);
                                                String goalName6 = goalById6.getGoalName();
                                                kotlin.jvm.internal.i.d(goalName6);
                                                str53 = "reminder_type";
                                                str47 = "variant";
                                                str54 = str46;
                                                str48 = "toggle";
                                                str49 = Constants.GOAL_ID;
                                                str50 = "course";
                                                str51 = "custom";
                                                str52 = "one_time";
                                                Utils.updateActivityNotification$default(utils5, applicationContext6, z22, time11, time12, type6, goalId24, courseName6, goalName6, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                                z25 = z22;
                                                goal102.setNotificationScheduled(z25);
                                                FirebasePersistence.getInstance().updateGoal(goal102, Boolean.TRUE);
                                            }
                                            Bundle bundle72222222 = new Bundle();
                                            bundle72222222.putString(str50, goal102.getCourseName());
                                            bundle72222222.putString(str49, goal102.getGoalId());
                                            bundle72222222.putBoolean(str48, z25);
                                            bundle72222222.putString(str47, str54);
                                            bundle72222222.putString(str53, str51);
                                            bundle72222222.putString("frequency", str52);
                                            gk.a.b(bundle72222222, "profile_goal_toggle");
                                            return;
                                        }
                                    }
                                    str46 = "new";
                                    utils5 = Utils.INSTANCE;
                                    goalId5 = goalById6.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId5);
                                    if (utils5.getGoalNotificationContent(goalId5) != null) {
                                    }
                                    Bundle bundle722222222 = new Bundle();
                                    bundle722222222.putString(str50, goal102.getCourseName());
                                    bundle722222222.putString(str49, goal102.getGoalId());
                                    bundle722222222.putBoolean(str48, z25);
                                    bundle722222222.putString(str47, str54);
                                    bundle722222222.putString(str53, str51);
                                    bundle722222222.putString("frequency", str52);
                                    gk.a.b(bundle722222222, "profile_goal_toggle");
                                    return;
                            }
                        }
                    });
                    ((LinearLayout) _$_findCachedViewById(R.id.customReminderHeaderWeeklyContainer)).addView(inflate4);
                }
            } else {
                ((LinearLayout) _$_findCachedViewById(R.id.customReminderHeaderWeeklyContainer)).setVisibility(8);
                ((RobertoTextView) _$_findCachedViewById(R.id.customReminderHeaderWeekly)).setVisibility(8);
            }
            if (list3.isEmpty()) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z13) {
                ((LinearLayout) _$_findCachedViewById(R.id.activityReminderHeaderOnetimeContainer)).setVisibility(0);
                ((RobertoTextView) _$_findCachedViewById(R.id.activityReminderHeaderOnetime)).setVisibility(0);
                for (final Goal goal12 : list3) {
                    View inflate5 = getLayoutInflater().inflate(R.layout.row_notification_new, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.activityReminderHeaderOnetimeContainer)), false);
                    RobertoTextView robertoTextView9 = (RobertoTextView) inflate5.findViewById(R.id.tvRowGoalTime);
                    kotlin.jvm.internal.i.f(robertoTextView9, "row.tvRowGoalTime");
                    U(robertoTextView9, goal12);
                    RobertoTextView robertoTextView10 = (RobertoTextView) inflate5.findViewById(R.id.tvRowGoalName);
                    if (robertoTextView10 != null) {
                        robertoTextView10.setText(goal12.getGoalName());
                    }
                    ((SwitchCompat) inflate5.findViewById(R.id.switchRowGoalScheduleNotification)).setChecked(goal12.getNotificationScheduled());
                    ((SwitchCompat) inflate5.findViewById(R.id.switchRowGoalScheduleNotification)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: uo.c
                        /* JADX WARN: Removed duplicated region for block: B:107:0x06ae  */
                        /* JADX WARN: Removed duplicated region for block: B:108:0x072b  */
                        /* JADX WARN: Removed duplicated region for block: B:136:0x0840  */
                        /* JADX WARN: Removed duplicated region for block: B:137:0x08ba  */
                        /* JADX WARN: Removed duplicated region for block: B:41:0x024d  */
                        /* JADX WARN: Removed duplicated region for block: B:42:0x02c4  */
                        /* JADX WARN: Removed duplicated region for block: B:63:0x03bf  */
                        /* JADX WARN: Removed duplicated region for block: B:64:0x0439  */
                        /* JADX WARN: Removed duplicated region for block: B:85:0x0534  */
                        /* JADX WARN: Removed duplicated region for block: B:86:0x05b1  */
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z22) {
                            String str;
                            Utils utils;
                            String goalId;
                            String str2;
                            String str3;
                            String str4;
                            String str5;
                            String str6;
                            boolean z23;
                            String str7;
                            String str8;
                            String str9;
                            String str10;
                            Utils utils2;
                            String goalId2;
                            String str11;
                            String str12;
                            String str13;
                            String str14;
                            String str15;
                            String str16;
                            String str17;
                            String str18;
                            String str19;
                            Utils utils3;
                            String goalId3;
                            String str20;
                            String str21;
                            String str22;
                            String str23;
                            String str24;
                            String str25;
                            String str26;
                            String str27;
                            String str28;
                            Utils utils4;
                            String goalId4;
                            String str29;
                            String str30;
                            String str31;
                            String str32;
                            String str33;
                            String str34;
                            boolean z24;
                            String str35;
                            String str36;
                            String str37;
                            Goal goal92;
                            String str38;
                            String str39;
                            String str40;
                            String str41;
                            String str42;
                            String str43;
                            String str44;
                            String str45;
                            String str46;
                            Utils utils5;
                            String goalId5;
                            String str47;
                            String str48;
                            String str49;
                            String str50;
                            boolean z25;
                            String str51;
                            String str52;
                            String str53;
                            String str54;
                            boolean z26 = z22;
                            int i13 = r3;
                            k this$0 = this;
                            Goal goal102 = goal12;
                            switch (i13) {
                                case 0:
                                    int i14 = k.E;
                                    kotlin.jvm.internal.i.g(goal102, "$goal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById = FirebasePersistence.getInstance().getGoalById(goal102.getGoalId(), goal102.getCourseId());
                                    if (goal102.getGoalId() != null) {
                                        String goalId6 = goal102.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId6);
                                        if (goalId6.length() >= 7) {
                                            String goalId7 = goal102.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId7);
                                            str = "reminder_type";
                                            String substring = goalId7.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring, "custom_")) {
                                                ProgressDialog progressDialog = this$0.f34316z;
                                                if (progressDialog != null) {
                                                    progressDialog.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.m(goalById, null, z26), 3);
                                                    str2 = "variant";
                                                    str3 = "new";
                                                    str4 = "toggle";
                                                    str5 = Constants.GOAL_ID;
                                                    str6 = "course";
                                                    z23 = z26;
                                                    str7 = "regular";
                                                    str8 = str;
                                                    str9 = "daily";
                                                    Bundle bundle22222222 = new Bundle();
                                                    bundle22222222.putString(str6, goal102.getCourseName());
                                                    bundle22222222.putString(str5, goal102.getGoalId());
                                                    bundle22222222.putBoolean(str4, z23);
                                                    bundle22222222.putString(str2, str3);
                                                    bundle22222222.putString(str8, str7);
                                                    bundle22222222.putString("frequency", str9);
                                                    gk.a.b(bundle22222222, "profile_goal_toggle");
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                            utils = Utils.INSTANCE;
                                            goalId = goal102.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId);
                                            if (utils.getGoalNotificationContent(goalId) != null) {
                                                str2 = "variant";
                                                str3 = "new";
                                                str4 = "toggle";
                                                str5 = Constants.GOAL_ID;
                                                str6 = "course";
                                                z23 = z26;
                                                str7 = "regular";
                                                str8 = str;
                                                str9 = "daily";
                                                if (is.k.Q1(goal102.getType(), new String[]{Constants.GOAL_TYPE_RELAXATION_ACTIVITY, "physical_activity"})) {
                                                    ProgressDialog progressDialog2 = this$0.f34316z;
                                                    if (progressDialog2 != null) {
                                                        progressDialog2.show();
                                                        FireStoreUtilsKt.fetchSingleRecommendedActivity(goal102.getGoalId(), new l(this$0, z23, goal102));
                                                    } else {
                                                        kotlin.jvm.internal.i.q("progressDialog");
                                                        throw null;
                                                    }
                                                } else {
                                                    ProgressDialog progressDialog3 = this$0.f34316z;
                                                    if (progressDialog3 != null) {
                                                        progressDialog3.show();
                                                        v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.n(goalById, null, z23), 3);
                                                    } else {
                                                        kotlin.jvm.internal.i.q("progressDialog");
                                                        throw null;
                                                    }
                                                }
                                            } else {
                                                Context applicationContext = this$0.requireContext().getApplicationContext();
                                                kotlin.jvm.internal.i.f(applicationContext, "requireContext().applicationContext");
                                                long time = goalById.getmStartDate().getTime();
                                                long time2 = goalById.getmScheduleDate().getTime();
                                                String type = goalById.getType();
                                                kotlin.jvm.internal.i.d(type);
                                                String goalId8 = goalById.getGoalId();
                                                kotlin.jvm.internal.i.d(goalId8);
                                                String courseName = goalById.getCourseName();
                                                kotlin.jvm.internal.i.d(courseName);
                                                String goalName = goalById.getGoalName();
                                                kotlin.jvm.internal.i.d(goalName);
                                                str8 = str;
                                                str9 = "daily";
                                                str2 = "variant";
                                                str3 = "new";
                                                str4 = "toggle";
                                                str5 = Constants.GOAL_ID;
                                                str6 = "course";
                                                str7 = "regular";
                                                Utils.updateActivityNotification$default(utils, applicationContext, z22, time, time2, type, goalId8, courseName, goalName, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                                z23 = z22;
                                                goal102.setNotificationScheduled(z23);
                                                FirebasePersistence.getInstance().updateGoal(goal102, Boolean.TRUE);
                                            }
                                            Bundle bundle222222222 = new Bundle();
                                            bundle222222222.putString(str6, goal102.getCourseName());
                                            bundle222222222.putString(str5, goal102.getGoalId());
                                            bundle222222222.putBoolean(str4, z23);
                                            bundle222222222.putString(str2, str3);
                                            bundle222222222.putString(str8, str7);
                                            bundle222222222.putString("frequency", str9);
                                            gk.a.b(bundle222222222, "profile_goal_toggle");
                                            return;
                                        }
                                    }
                                    str = "reminder_type";
                                    utils = Utils.INSTANCE;
                                    goalId = goal102.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId);
                                    if (utils.getGoalNotificationContent(goalId) != null) {
                                    }
                                    Bundle bundle2222222222 = new Bundle();
                                    bundle2222222222.putString(str6, goal102.getCourseName());
                                    bundle2222222222.putString(str5, goal102.getGoalId());
                                    bundle2222222222.putBoolean(str4, z23);
                                    bundle2222222222.putString(str2, str3);
                                    bundle2222222222.putString(str8, str7);
                                    bundle2222222222.putString("frequency", str9);
                                    gk.a.b(bundle2222222222, "profile_goal_toggle");
                                    return;
                                case 1:
                                    boolean z27 = z26;
                                    int i15 = k.E;
                                    kotlin.jvm.internal.i.g(goal102, "$goal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById2 = FirebasePersistence.getInstance().getGoalById(goal102.getGoalId(), goal102.getCourseId());
                                    if (goal102.getGoalId() != null) {
                                        String goalId9 = goal102.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId9);
                                        if (goalId9.length() >= 7) {
                                            String goalId10 = goal102.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId10);
                                            str10 = "variant";
                                            String substring2 = goalId10.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring2, "custom_")) {
                                                ProgressDialog progressDialog4 = this$0.f34316z;
                                                if (progressDialog4 != null) {
                                                    progressDialog4.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.o(goalById2, null, z27), 3);
                                                    str11 = "new";
                                                    str12 = "toggle";
                                                    str13 = Constants.GOAL_ID;
                                                    str14 = "daily";
                                                    str15 = "course";
                                                    str16 = "custom";
                                                    str17 = "profile_goal_toggle";
                                                    str18 = str10;
                                                    Bundle bundle322222222 = new Bundle();
                                                    bundle322222222.putString(str15, goal102.getCourseName());
                                                    bundle322222222.putString(str13, goal102.getGoalId());
                                                    bundle322222222.putBoolean(str12, z27);
                                                    bundle322222222.putString(str18, str11);
                                                    bundle322222222.putString("reminder_type", str16);
                                                    bundle322222222.putString("frequency", str14);
                                                    gk.a.b(bundle322222222, str17);
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                            utils2 = Utils.INSTANCE;
                                            goalId2 = goal102.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId2);
                                            if (utils2.getGoalNotificationContent(goalId2) != null) {
                                                str11 = "new";
                                                str12 = "toggle";
                                                str13 = Constants.GOAL_ID;
                                                str14 = "daily";
                                                str15 = "course";
                                                str16 = "custom";
                                                str17 = "profile_goal_toggle";
                                                str18 = str10;
                                                ProgressDialog progressDialog5 = this$0.f34316z;
                                                if (progressDialog5 != null) {
                                                    progressDialog5.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.p(goalById2, null, z27), 3);
                                                } else {
                                                    kotlin.jvm.internal.i.q("progressDialog");
                                                    throw null;
                                                }
                                            } else {
                                                Context applicationContext2 = this$0.requireContext().getApplicationContext();
                                                kotlin.jvm.internal.i.f(applicationContext2, "requireContext().applicationContext");
                                                long time3 = goalById2.getmStartDate().getTime();
                                                long time4 = goalById2.getmScheduleDate().getTime();
                                                String type2 = goalById2.getType();
                                                kotlin.jvm.internal.i.d(type2);
                                                String goalId11 = goalById2.getGoalId();
                                                kotlin.jvm.internal.i.d(goalId11);
                                                String courseName2 = goalById2.getCourseName();
                                                kotlin.jvm.internal.i.d(courseName2);
                                                String goalName2 = goalById2.getGoalName();
                                                kotlin.jvm.internal.i.d(goalName2);
                                                str18 = str10;
                                                str17 = "profile_goal_toggle";
                                                str11 = "new";
                                                str12 = "toggle";
                                                str13 = Constants.GOAL_ID;
                                                str14 = "daily";
                                                str15 = "course";
                                                str16 = "custom";
                                                Utils.updateActivityNotification$default(utils2, applicationContext2, z22, time3, time4, type2, goalId11, courseName2, goalName2, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                                z27 = z22;
                                                goal102.setNotificationScheduled(z27);
                                                FirebasePersistence.getInstance().updateGoal(goal102, Boolean.TRUE);
                                            }
                                            Bundle bundle3222222222 = new Bundle();
                                            bundle3222222222.putString(str15, goal102.getCourseName());
                                            bundle3222222222.putString(str13, goal102.getGoalId());
                                            bundle3222222222.putBoolean(str12, z27);
                                            bundle3222222222.putString(str18, str11);
                                            bundle3222222222.putString("reminder_type", str16);
                                            bundle3222222222.putString("frequency", str14);
                                            gk.a.b(bundle3222222222, str17);
                                            return;
                                        }
                                    }
                                    str10 = "variant";
                                    utils2 = Utils.INSTANCE;
                                    goalId2 = goal102.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId2);
                                    if (utils2.getGoalNotificationContent(goalId2) != null) {
                                    }
                                    Bundle bundle32222222222 = new Bundle();
                                    bundle32222222222.putString(str15, goal102.getCourseName());
                                    bundle32222222222.putString(str13, goal102.getGoalId());
                                    bundle32222222222.putBoolean(str12, z27);
                                    bundle32222222222.putString(str18, str11);
                                    bundle32222222222.putString("reminder_type", str16);
                                    bundle32222222222.putString("frequency", str14);
                                    gk.a.b(bundle32222222222, str17);
                                    return;
                                case 2:
                                    boolean z28 = z26;
                                    int i16 = k.E;
                                    kotlin.jvm.internal.i.g(goal102, "$weeklyGoal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById3 = FirebasePersistence.getInstance().getGoalById(goal102.getGoalId(), goal102.getCourseId());
                                    if (goalById3.getGoalId() != null) {
                                        String goalId12 = goalById3.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId12);
                                        if (goalId12.length() >= 7) {
                                            String goalId13 = goalById3.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId13);
                                            str19 = "variant";
                                            String substring3 = goalId13.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring3, "custom_")) {
                                                ProgressDialog progressDialog6 = this$0.f34316z;
                                                if (progressDialog6 != null) {
                                                    progressDialog6.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.e(goalById3, null, z28), 3);
                                                    str20 = "reminder_type";
                                                    str21 = "new";
                                                    str22 = "toggle";
                                                    str23 = Constants.GOAL_ID;
                                                    str24 = "course";
                                                    str25 = "regular";
                                                    str26 = str19;
                                                    str27 = "weekly";
                                                    Bundle bundle422222222 = new Bundle();
                                                    bundle422222222.putString(str24, goal102.getCourseName());
                                                    bundle422222222.putString(str23, goal102.getGoalId());
                                                    bundle422222222.putBoolean(str22, z28);
                                                    bundle422222222.putString(str26, str21);
                                                    bundle422222222.putString(str20, str25);
                                                    bundle422222222.putString("frequency", str27);
                                                    gk.a.b(bundle422222222, "profile_goal_toggle");
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                            utils3 = Utils.INSTANCE;
                                            goalId3 = goalById3.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId3);
                                            if (utils3.getGoalNotificationContent(goalId3) != null) {
                                                str20 = "reminder_type";
                                                str21 = "new";
                                                str22 = "toggle";
                                                str23 = Constants.GOAL_ID;
                                                str24 = "course";
                                                str25 = "regular";
                                                str26 = str19;
                                                str27 = "weekly";
                                                ProgressDialog progressDialog7 = this$0.f34316z;
                                                if (progressDialog7 != null) {
                                                    progressDialog7.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.f(goalById3, null, z28), 3);
                                                } else {
                                                    kotlin.jvm.internal.i.q("progressDialog");
                                                    throw null;
                                                }
                                            } else {
                                                Context applicationContext3 = this$0.requireContext().getApplicationContext();
                                                kotlin.jvm.internal.i.f(applicationContext3, "requireContext().applicationContext");
                                                long time5 = goalById3.getmStartDate().getTime();
                                                long time6 = goalById3.getmScheduleDate().getTime();
                                                String type3 = goalById3.getType();
                                                kotlin.jvm.internal.i.d(type3);
                                                String goalId14 = goalById3.getGoalId();
                                                kotlin.jvm.internal.i.d(goalId14);
                                                String courseName3 = goalById3.getCourseName();
                                                kotlin.jvm.internal.i.d(courseName3);
                                                String goalName3 = goalById3.getGoalName();
                                                kotlin.jvm.internal.i.d(goalName3);
                                                str27 = "weekly";
                                                str20 = "reminder_type";
                                                str26 = str19;
                                                str21 = "new";
                                                str22 = "toggle";
                                                str23 = Constants.GOAL_ID;
                                                str24 = "course";
                                                str25 = "regular";
                                                Utils.updateActivityNotification$default(utils3, applicationContext3, z22, time5, time6, type3, goalId14, courseName3, goalName3, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                                z28 = z22;
                                                goal102.setNotificationScheduled(z28);
                                                FirebasePersistence.getInstance().updateGoal(goal102, Boolean.TRUE);
                                            }
                                            Bundle bundle4222222222 = new Bundle();
                                            bundle4222222222.putString(str24, goal102.getCourseName());
                                            bundle4222222222.putString(str23, goal102.getGoalId());
                                            bundle4222222222.putBoolean(str22, z28);
                                            bundle4222222222.putString(str26, str21);
                                            bundle4222222222.putString(str20, str25);
                                            bundle4222222222.putString("frequency", str27);
                                            gk.a.b(bundle4222222222, "profile_goal_toggle");
                                            return;
                                        }
                                    }
                                    str19 = "variant";
                                    utils3 = Utils.INSTANCE;
                                    goalId3 = goalById3.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId3);
                                    if (utils3.getGoalNotificationContent(goalId3) != null) {
                                    }
                                    Bundle bundle42222222222 = new Bundle();
                                    bundle42222222222.putString(str24, goal102.getCourseName());
                                    bundle42222222222.putString(str23, goal102.getGoalId());
                                    bundle42222222222.putBoolean(str22, z28);
                                    bundle42222222222.putString(str26, str21);
                                    bundle42222222222.putString(str20, str25);
                                    bundle42222222222.putString("frequency", str27);
                                    gk.a.b(bundle42222222222, "profile_goal_toggle");
                                    return;
                                case 3:
                                    int i17 = k.E;
                                    kotlin.jvm.internal.i.g(goal102, "$weeklyGoal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById4 = FirebasePersistence.getInstance().getGoalById(goal102.getGoalId(), goal102.getCourseId());
                                    if (goalById4.getGoalId() != null) {
                                        String goalId15 = goalById4.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId15);
                                        if (goalId15.length() >= 7) {
                                            String goalId16 = goalById4.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId16);
                                            str28 = "profile_goal_toggle";
                                            String substring4 = goalId16.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring4, "custom_")) {
                                                ProgressDialog progressDialog8 = this$0.f34316z;
                                                if (progressDialog8 != null) {
                                                    progressDialog8.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.g(goalById4, null, z26), 3);
                                                    str29 = "toggle";
                                                    str30 = Constants.GOAL_ID;
                                                    str31 = "custom";
                                                    str32 = "course";
                                                    str33 = "weekly";
                                                    str34 = "frequency";
                                                    z24 = z26;
                                                    str35 = str28;
                                                    Bundle bundle522222222 = new Bundle();
                                                    bundle522222222.putString(str32, goal102.getCourseName());
                                                    bundle522222222.putString(str30, goal102.getGoalId());
                                                    bundle522222222.putBoolean(str29, z24);
                                                    bundle522222222.putString("variant", "new");
                                                    bundle522222222.putString("reminder_type", str31);
                                                    bundle522222222.putString(str34, str33);
                                                    gk.a.b(bundle522222222, str35);
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                            utils4 = Utils.INSTANCE;
                                            goalId4 = goalById4.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId4);
                                            if (utils4.getGoalNotificationContent(goalId4) != null) {
                                                str29 = "toggle";
                                                str30 = Constants.GOAL_ID;
                                                str31 = "custom";
                                                str32 = "course";
                                                str33 = "weekly";
                                                str34 = "frequency";
                                                z24 = z26;
                                                str35 = str28;
                                                ProgressDialog progressDialog9 = this$0.f34316z;
                                                if (progressDialog9 != null) {
                                                    progressDialog9.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.h(goalById4, null, z24), 3);
                                                } else {
                                                    kotlin.jvm.internal.i.q("progressDialog");
                                                    throw null;
                                                }
                                            } else {
                                                Context applicationContext4 = this$0.requireContext().getApplicationContext();
                                                kotlin.jvm.internal.i.f(applicationContext4, "requireContext().applicationContext");
                                                long time7 = goalById4.getmStartDate().getTime();
                                                long time8 = goalById4.getmScheduleDate().getTime();
                                                String type4 = goalById4.getType();
                                                kotlin.jvm.internal.i.d(type4);
                                                String goalId17 = goalById4.getGoalId();
                                                kotlin.jvm.internal.i.d(goalId17);
                                                String courseName4 = goalById4.getCourseName();
                                                kotlin.jvm.internal.i.d(courseName4);
                                                String goalName4 = goalById4.getGoalName();
                                                kotlin.jvm.internal.i.d(goalName4);
                                                str35 = str28;
                                                str29 = "toggle";
                                                str30 = Constants.GOAL_ID;
                                                str31 = "custom";
                                                str32 = "course";
                                                str33 = "weekly";
                                                str34 = "frequency";
                                                Utils.updateActivityNotification$default(utils4, applicationContext4, z22, time7, time8, type4, goalId17, courseName4, goalName4, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                                z24 = z22;
                                                goal102.setNotificationScheduled(z24);
                                                FirebasePersistence.getInstance().updateGoal(goal102, Boolean.TRUE);
                                            }
                                            Bundle bundle5222222222 = new Bundle();
                                            bundle5222222222.putString(str32, goal102.getCourseName());
                                            bundle5222222222.putString(str30, goal102.getGoalId());
                                            bundle5222222222.putBoolean(str29, z24);
                                            bundle5222222222.putString("variant", "new");
                                            bundle5222222222.putString("reminder_type", str31);
                                            bundle5222222222.putString(str34, str33);
                                            gk.a.b(bundle5222222222, str35);
                                            return;
                                        }
                                    }
                                    str28 = "profile_goal_toggle";
                                    utils4 = Utils.INSTANCE;
                                    goalId4 = goalById4.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId4);
                                    if (utils4.getGoalNotificationContent(goalId4) != null) {
                                    }
                                    Bundle bundle52222222222 = new Bundle();
                                    bundle52222222222.putString(str32, goal102.getCourseName());
                                    bundle52222222222.putString(str30, goal102.getGoalId());
                                    bundle52222222222.putBoolean(str29, z24);
                                    bundle52222222222.putString("variant", "new");
                                    bundle52222222222.putString("reminder_type", str31);
                                    bundle52222222222.putString(str34, str33);
                                    gk.a.b(bundle52222222222, str35);
                                    return;
                                case 4:
                                    int i18 = k.E;
                                    kotlin.jvm.internal.i.g(goal102, "$oneTimeGoal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById5 = FirebasePersistence.getInstance().getGoalById(goal102.getGoalId(), goal102.getCourseId());
                                    if (goalById5.getGoalId() != null) {
                                        String goalId18 = goalById5.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId18);
                                        if (goalId18.length() >= 7) {
                                            String goalId19 = goalById5.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId19);
                                            String substring5 = goalId19.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring5, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring5, "custom_")) {
                                                ProgressDialog progressDialog10 = this$0.f34316z;
                                                if (progressDialog10 != null) {
                                                    progressDialog10.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.i(goalById5, null, z26), 3);
                                                    str36 = "one_time";
                                                    str37 = "regular";
                                                    goal92 = goal102;
                                                    str38 = "reminder_type";
                                                    str39 = "new";
                                                    str40 = "variant";
                                                    str41 = "toggle";
                                                    str42 = Constants.GOAL_ID;
                                                    str44 = "profile_goal_toggle";
                                                    str45 = "course";
                                                    str43 = "frequency";
                                                    Bundle bundle622222222 = new Bundle();
                                                    bundle622222222.putString(str45, goal92.getCourseName());
                                                    bundle622222222.putString(str42, goal92.getGoalId());
                                                    bundle622222222.putBoolean(str41, z26);
                                                    bundle622222222.putString(str40, str39);
                                                    bundle622222222.putString(str38, str37);
                                                    bundle622222222.putString(str43, str36);
                                                    gk.a.b(bundle622222222, str44);
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                        }
                                    }
                                    Utils utils6 = Utils.INSTANCE;
                                    String goalId20 = goalById5.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId20);
                                    if (utils6.getGoalNotificationContent(goalId20) == null) {
                                        str36 = "one_time";
                                        str37 = "regular";
                                        goal92 = goal102;
                                        str38 = "reminder_type";
                                        str39 = "new";
                                        str40 = "variant";
                                        str41 = "toggle";
                                        str42 = Constants.GOAL_ID;
                                        str43 = "frequency";
                                        str44 = "profile_goal_toggle";
                                        str45 = "course";
                                        ProgressDialog progressDialog11 = this$0.f34316z;
                                        if (progressDialog11 != null) {
                                            progressDialog11.show();
                                            v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.j(goalById5, null, z26), 3);
                                            Bundle bundle6222222222 = new Bundle();
                                            bundle6222222222.putString(str45, goal92.getCourseName());
                                            bundle6222222222.putString(str42, goal92.getGoalId());
                                            bundle6222222222.putBoolean(str41, z26);
                                            bundle6222222222.putString(str40, str39);
                                            bundle6222222222.putString(str38, str37);
                                            bundle6222222222.putString(str43, str36);
                                            gk.a.b(bundle6222222222, str44);
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("progressDialog");
                                        throw null;
                                    }
                                    Context applicationContext5 = this$0.requireContext().getApplicationContext();
                                    kotlin.jvm.internal.i.f(applicationContext5, "requireContext().applicationContext");
                                    long time9 = goalById5.getmStartDate().getTime();
                                    long time10 = goalById5.getmScheduleDate().getTime();
                                    String type5 = goalById5.getType();
                                    kotlin.jvm.internal.i.d(type5);
                                    String goalId21 = goalById5.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId21);
                                    String courseName5 = goalById5.getCourseName();
                                    kotlin.jvm.internal.i.d(courseName5);
                                    String goalName5 = goalById5.getGoalName();
                                    kotlin.jvm.internal.i.d(goalName5);
                                    str44 = "profile_goal_toggle";
                                    str37 = "regular";
                                    str36 = "one_time";
                                    goal92 = goal102;
                                    str38 = "reminder_type";
                                    str39 = "new";
                                    str40 = "variant";
                                    str41 = "toggle";
                                    str42 = Constants.GOAL_ID;
                                    str45 = "course";
                                    Utils.updateActivityNotification$default(utils6, applicationContext5, z22, time9, time10, type5, goalId21, courseName5, goalName5, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                    z26 = z22;
                                    goal92.setNotificationScheduled(z26);
                                    FirebasePersistence.getInstance().updateGoal(goal92, Boolean.TRUE);
                                    str43 = "frequency";
                                    Bundle bundle62222222222 = new Bundle();
                                    bundle62222222222.putString(str45, goal92.getCourseName());
                                    bundle62222222222.putString(str42, goal92.getGoalId());
                                    bundle62222222222.putBoolean(str41, z26);
                                    bundle62222222222.putString(str40, str39);
                                    bundle62222222222.putString(str38, str37);
                                    bundle62222222222.putString(str43, str36);
                                    gk.a.b(bundle62222222222, str44);
                                    return;
                                default:
                                    int i19 = k.E;
                                    kotlin.jvm.internal.i.g(goal102, "$oneTimeGoal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById6 = FirebasePersistence.getInstance().getGoalById(goal102.getGoalId(), goal102.getCourseId());
                                    if (goalById6.getGoalId() != null) {
                                        String goalId22 = goalById6.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId22);
                                        if (goalId22.length() >= 7) {
                                            String goalId23 = goalById6.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId23);
                                            str46 = "new";
                                            String substring6 = goalId23.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring6, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring6, "custom_")) {
                                                ProgressDialog progressDialog12 = this$0.f34316z;
                                                if (progressDialog12 != null) {
                                                    progressDialog12.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.C0577k(goalById6, null, z26), 3);
                                                    str47 = "variant";
                                                    str48 = "toggle";
                                                    str49 = Constants.GOAL_ID;
                                                    str50 = "course";
                                                    z25 = z26;
                                                    str51 = "custom";
                                                    str52 = "one_time";
                                                    str53 = "reminder_type";
                                                    str54 = str46;
                                                    Bundle bundle722222222 = new Bundle();
                                                    bundle722222222.putString(str50, goal102.getCourseName());
                                                    bundle722222222.putString(str49, goal102.getGoalId());
                                                    bundle722222222.putBoolean(str48, z25);
                                                    bundle722222222.putString(str47, str54);
                                                    bundle722222222.putString(str53, str51);
                                                    bundle722222222.putString("frequency", str52);
                                                    gk.a.b(bundle722222222, "profile_goal_toggle");
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                            utils5 = Utils.INSTANCE;
                                            goalId5 = goalById6.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId5);
                                            if (utils5.getGoalNotificationContent(goalId5) != null) {
                                                str47 = "variant";
                                                str48 = "toggle";
                                                str49 = Constants.GOAL_ID;
                                                str50 = "course";
                                                z25 = z26;
                                                str51 = "custom";
                                                str52 = "one_time";
                                                str53 = "reminder_type";
                                                str54 = str46;
                                                ProgressDialog progressDialog13 = this$0.f34316z;
                                                if (progressDialog13 != null) {
                                                    progressDialog13.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.l(goalById6, null, z25), 3);
                                                } else {
                                                    kotlin.jvm.internal.i.q("progressDialog");
                                                    throw null;
                                                }
                                            } else {
                                                Context applicationContext6 = this$0.requireContext().getApplicationContext();
                                                kotlin.jvm.internal.i.f(applicationContext6, "requireContext().applicationContext");
                                                long time11 = goalById6.getmStartDate().getTime();
                                                long time12 = goalById6.getmScheduleDate().getTime();
                                                String type6 = goalById6.getType();
                                                kotlin.jvm.internal.i.d(type6);
                                                String goalId24 = goalById6.getGoalId();
                                                kotlin.jvm.internal.i.d(goalId24);
                                                String courseName6 = goalById6.getCourseName();
                                                kotlin.jvm.internal.i.d(courseName6);
                                                String goalName6 = goalById6.getGoalName();
                                                kotlin.jvm.internal.i.d(goalName6);
                                                str53 = "reminder_type";
                                                str47 = "variant";
                                                str54 = str46;
                                                str48 = "toggle";
                                                str49 = Constants.GOAL_ID;
                                                str50 = "course";
                                                str51 = "custom";
                                                str52 = "one_time";
                                                Utils.updateActivityNotification$default(utils5, applicationContext6, z22, time11, time12, type6, goalId24, courseName6, goalName6, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                                z25 = z22;
                                                goal102.setNotificationScheduled(z25);
                                                FirebasePersistence.getInstance().updateGoal(goal102, Boolean.TRUE);
                                            }
                                            Bundle bundle7222222222 = new Bundle();
                                            bundle7222222222.putString(str50, goal102.getCourseName());
                                            bundle7222222222.putString(str49, goal102.getGoalId());
                                            bundle7222222222.putBoolean(str48, z25);
                                            bundle7222222222.putString(str47, str54);
                                            bundle7222222222.putString(str53, str51);
                                            bundle7222222222.putString("frequency", str52);
                                            gk.a.b(bundle7222222222, "profile_goal_toggle");
                                            return;
                                        }
                                    }
                                    str46 = "new";
                                    utils5 = Utils.INSTANCE;
                                    goalId5 = goalById6.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId5);
                                    if (utils5.getGoalNotificationContent(goalId5) != null) {
                                    }
                                    Bundle bundle72222222222 = new Bundle();
                                    bundle72222222222.putString(str50, goal102.getCourseName());
                                    bundle72222222222.putString(str49, goal102.getGoalId());
                                    bundle72222222222.putBoolean(str48, z25);
                                    bundle72222222222.putString(str47, str54);
                                    bundle72222222222.putString(str53, str51);
                                    bundle72222222222.putString("frequency", str52);
                                    gk.a.b(bundle72222222222, "profile_goal_toggle");
                                    return;
                            }
                        }
                    });
                    ((LinearLayout) _$_findCachedViewById(R.id.activityReminderHeaderOnetimeContainer)).addView(inflate5);
                }
            } else {
                ((LinearLayout) _$_findCachedViewById(R.id.activityReminderHeaderOnetimeContainer)).setVisibility(8);
                ((RobertoTextView) _$_findCachedViewById(R.id.activityReminderHeaderOnetime)).setVisibility(8);
            }
            if (list4.isEmpty()) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14) {
                ((LinearLayout) _$_findCachedViewById(R.id.customReminderHeaderOnetimeContainer)).setVisibility(0);
                ((RobertoTextView) _$_findCachedViewById(R.id.customReminderHeaderOnetime)).setVisibility(0);
                for (final Goal goal13 : list4) {
                    View inflate6 = getLayoutInflater().inflate(i12, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.customReminderHeaderOnetimeContainer)), false);
                    RobertoTextView robertoTextView11 = (RobertoTextView) inflate6.findViewById(R.id.tvRowGoalTime);
                    kotlin.jvm.internal.i.f(robertoTextView11, "row.tvRowGoalTime");
                    U(robertoTextView11, goal13);
                    RobertoTextView robertoTextView12 = (RobertoTextView) inflate6.findViewById(R.id.tvRowGoalName);
                    if (robertoTextView12 != null) {
                        robertoTextView12.setText(goal13.getGoalName());
                    }
                    ((SwitchCompat) inflate6.findViewById(R.id.switchRowGoalScheduleNotification)).setChecked(goal13.getNotificationScheduled());
                    ((SwitchCompat) inflate6.findViewById(R.id.switchRowGoalScheduleNotification)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: uo.c
                        /* JADX WARN: Removed duplicated region for block: B:107:0x06ae  */
                        /* JADX WARN: Removed duplicated region for block: B:108:0x072b  */
                        /* JADX WARN: Removed duplicated region for block: B:136:0x0840  */
                        /* JADX WARN: Removed duplicated region for block: B:137:0x08ba  */
                        /* JADX WARN: Removed duplicated region for block: B:41:0x024d  */
                        /* JADX WARN: Removed duplicated region for block: B:42:0x02c4  */
                        /* JADX WARN: Removed duplicated region for block: B:63:0x03bf  */
                        /* JADX WARN: Removed duplicated region for block: B:64:0x0439  */
                        /* JADX WARN: Removed duplicated region for block: B:85:0x0534  */
                        /* JADX WARN: Removed duplicated region for block: B:86:0x05b1  */
                        @Override // android.widget.CompoundButton.OnCheckedChangeListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void onCheckedChanged(CompoundButton compoundButton, boolean z22) {
                            String str;
                            Utils utils;
                            String goalId;
                            String str2;
                            String str3;
                            String str4;
                            String str5;
                            String str6;
                            boolean z23;
                            String str7;
                            String str8;
                            String str9;
                            String str10;
                            Utils utils2;
                            String goalId2;
                            String str11;
                            String str12;
                            String str13;
                            String str14;
                            String str15;
                            String str16;
                            String str17;
                            String str18;
                            String str19;
                            Utils utils3;
                            String goalId3;
                            String str20;
                            String str21;
                            String str22;
                            String str23;
                            String str24;
                            String str25;
                            String str26;
                            String str27;
                            String str28;
                            Utils utils4;
                            String goalId4;
                            String str29;
                            String str30;
                            String str31;
                            String str32;
                            String str33;
                            String str34;
                            boolean z24;
                            String str35;
                            String str36;
                            String str37;
                            Goal goal92;
                            String str38;
                            String str39;
                            String str40;
                            String str41;
                            String str42;
                            String str43;
                            String str44;
                            String str45;
                            String str46;
                            Utils utils5;
                            String goalId5;
                            String str47;
                            String str48;
                            String str49;
                            String str50;
                            boolean z25;
                            String str51;
                            String str52;
                            String str53;
                            String str54;
                            boolean z26 = z22;
                            int i13 = r3;
                            k this$0 = this;
                            Goal goal102 = goal13;
                            switch (i13) {
                                case 0:
                                    int i14 = k.E;
                                    kotlin.jvm.internal.i.g(goal102, "$goal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById = FirebasePersistence.getInstance().getGoalById(goal102.getGoalId(), goal102.getCourseId());
                                    if (goal102.getGoalId() != null) {
                                        String goalId6 = goal102.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId6);
                                        if (goalId6.length() >= 7) {
                                            String goalId7 = goal102.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId7);
                                            str = "reminder_type";
                                            String substring = goalId7.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring, "custom_")) {
                                                ProgressDialog progressDialog = this$0.f34316z;
                                                if (progressDialog != null) {
                                                    progressDialog.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.m(goalById, null, z26), 3);
                                                    str2 = "variant";
                                                    str3 = "new";
                                                    str4 = "toggle";
                                                    str5 = Constants.GOAL_ID;
                                                    str6 = "course";
                                                    z23 = z26;
                                                    str7 = "regular";
                                                    str8 = str;
                                                    str9 = "daily";
                                                    Bundle bundle2222222222 = new Bundle();
                                                    bundle2222222222.putString(str6, goal102.getCourseName());
                                                    bundle2222222222.putString(str5, goal102.getGoalId());
                                                    bundle2222222222.putBoolean(str4, z23);
                                                    bundle2222222222.putString(str2, str3);
                                                    bundle2222222222.putString(str8, str7);
                                                    bundle2222222222.putString("frequency", str9);
                                                    gk.a.b(bundle2222222222, "profile_goal_toggle");
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                            utils = Utils.INSTANCE;
                                            goalId = goal102.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId);
                                            if (utils.getGoalNotificationContent(goalId) != null) {
                                                str2 = "variant";
                                                str3 = "new";
                                                str4 = "toggle";
                                                str5 = Constants.GOAL_ID;
                                                str6 = "course";
                                                z23 = z26;
                                                str7 = "regular";
                                                str8 = str;
                                                str9 = "daily";
                                                if (is.k.Q1(goal102.getType(), new String[]{Constants.GOAL_TYPE_RELAXATION_ACTIVITY, "physical_activity"})) {
                                                    ProgressDialog progressDialog2 = this$0.f34316z;
                                                    if (progressDialog2 != null) {
                                                        progressDialog2.show();
                                                        FireStoreUtilsKt.fetchSingleRecommendedActivity(goal102.getGoalId(), new l(this$0, z23, goal102));
                                                    } else {
                                                        kotlin.jvm.internal.i.q("progressDialog");
                                                        throw null;
                                                    }
                                                } else {
                                                    ProgressDialog progressDialog3 = this$0.f34316z;
                                                    if (progressDialog3 != null) {
                                                        progressDialog3.show();
                                                        v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.n(goalById, null, z23), 3);
                                                    } else {
                                                        kotlin.jvm.internal.i.q("progressDialog");
                                                        throw null;
                                                    }
                                                }
                                            } else {
                                                Context applicationContext = this$0.requireContext().getApplicationContext();
                                                kotlin.jvm.internal.i.f(applicationContext, "requireContext().applicationContext");
                                                long time = goalById.getmStartDate().getTime();
                                                long time2 = goalById.getmScheduleDate().getTime();
                                                String type = goalById.getType();
                                                kotlin.jvm.internal.i.d(type);
                                                String goalId8 = goalById.getGoalId();
                                                kotlin.jvm.internal.i.d(goalId8);
                                                String courseName = goalById.getCourseName();
                                                kotlin.jvm.internal.i.d(courseName);
                                                String goalName = goalById.getGoalName();
                                                kotlin.jvm.internal.i.d(goalName);
                                                str8 = str;
                                                str9 = "daily";
                                                str2 = "variant";
                                                str3 = "new";
                                                str4 = "toggle";
                                                str5 = Constants.GOAL_ID;
                                                str6 = "course";
                                                str7 = "regular";
                                                Utils.updateActivityNotification$default(utils, applicationContext, z22, time, time2, type, goalId8, courseName, goalName, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                                z23 = z22;
                                                goal102.setNotificationScheduled(z23);
                                                FirebasePersistence.getInstance().updateGoal(goal102, Boolean.TRUE);
                                            }
                                            Bundle bundle22222222222 = new Bundle();
                                            bundle22222222222.putString(str6, goal102.getCourseName());
                                            bundle22222222222.putString(str5, goal102.getGoalId());
                                            bundle22222222222.putBoolean(str4, z23);
                                            bundle22222222222.putString(str2, str3);
                                            bundle22222222222.putString(str8, str7);
                                            bundle22222222222.putString("frequency", str9);
                                            gk.a.b(bundle22222222222, "profile_goal_toggle");
                                            return;
                                        }
                                    }
                                    str = "reminder_type";
                                    utils = Utils.INSTANCE;
                                    goalId = goal102.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId);
                                    if (utils.getGoalNotificationContent(goalId) != null) {
                                    }
                                    Bundle bundle222222222222 = new Bundle();
                                    bundle222222222222.putString(str6, goal102.getCourseName());
                                    bundle222222222222.putString(str5, goal102.getGoalId());
                                    bundle222222222222.putBoolean(str4, z23);
                                    bundle222222222222.putString(str2, str3);
                                    bundle222222222222.putString(str8, str7);
                                    bundle222222222222.putString("frequency", str9);
                                    gk.a.b(bundle222222222222, "profile_goal_toggle");
                                    return;
                                case 1:
                                    boolean z27 = z26;
                                    int i15 = k.E;
                                    kotlin.jvm.internal.i.g(goal102, "$goal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById2 = FirebasePersistence.getInstance().getGoalById(goal102.getGoalId(), goal102.getCourseId());
                                    if (goal102.getGoalId() != null) {
                                        String goalId9 = goal102.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId9);
                                        if (goalId9.length() >= 7) {
                                            String goalId10 = goal102.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId10);
                                            str10 = "variant";
                                            String substring2 = goalId10.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring2, "custom_")) {
                                                ProgressDialog progressDialog4 = this$0.f34316z;
                                                if (progressDialog4 != null) {
                                                    progressDialog4.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.o(goalById2, null, z27), 3);
                                                    str11 = "new";
                                                    str12 = "toggle";
                                                    str13 = Constants.GOAL_ID;
                                                    str14 = "daily";
                                                    str15 = "course";
                                                    str16 = "custom";
                                                    str17 = "profile_goal_toggle";
                                                    str18 = str10;
                                                    Bundle bundle32222222222 = new Bundle();
                                                    bundle32222222222.putString(str15, goal102.getCourseName());
                                                    bundle32222222222.putString(str13, goal102.getGoalId());
                                                    bundle32222222222.putBoolean(str12, z27);
                                                    bundle32222222222.putString(str18, str11);
                                                    bundle32222222222.putString("reminder_type", str16);
                                                    bundle32222222222.putString("frequency", str14);
                                                    gk.a.b(bundle32222222222, str17);
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                            utils2 = Utils.INSTANCE;
                                            goalId2 = goal102.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId2);
                                            if (utils2.getGoalNotificationContent(goalId2) != null) {
                                                str11 = "new";
                                                str12 = "toggle";
                                                str13 = Constants.GOAL_ID;
                                                str14 = "daily";
                                                str15 = "course";
                                                str16 = "custom";
                                                str17 = "profile_goal_toggle";
                                                str18 = str10;
                                                ProgressDialog progressDialog5 = this$0.f34316z;
                                                if (progressDialog5 != null) {
                                                    progressDialog5.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.p(goalById2, null, z27), 3);
                                                } else {
                                                    kotlin.jvm.internal.i.q("progressDialog");
                                                    throw null;
                                                }
                                            } else {
                                                Context applicationContext2 = this$0.requireContext().getApplicationContext();
                                                kotlin.jvm.internal.i.f(applicationContext2, "requireContext().applicationContext");
                                                long time3 = goalById2.getmStartDate().getTime();
                                                long time4 = goalById2.getmScheduleDate().getTime();
                                                String type2 = goalById2.getType();
                                                kotlin.jvm.internal.i.d(type2);
                                                String goalId11 = goalById2.getGoalId();
                                                kotlin.jvm.internal.i.d(goalId11);
                                                String courseName2 = goalById2.getCourseName();
                                                kotlin.jvm.internal.i.d(courseName2);
                                                String goalName2 = goalById2.getGoalName();
                                                kotlin.jvm.internal.i.d(goalName2);
                                                str18 = str10;
                                                str17 = "profile_goal_toggle";
                                                str11 = "new";
                                                str12 = "toggle";
                                                str13 = Constants.GOAL_ID;
                                                str14 = "daily";
                                                str15 = "course";
                                                str16 = "custom";
                                                Utils.updateActivityNotification$default(utils2, applicationContext2, z22, time3, time4, type2, goalId11, courseName2, goalName2, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                                z27 = z22;
                                                goal102.setNotificationScheduled(z27);
                                                FirebasePersistence.getInstance().updateGoal(goal102, Boolean.TRUE);
                                            }
                                            Bundle bundle322222222222 = new Bundle();
                                            bundle322222222222.putString(str15, goal102.getCourseName());
                                            bundle322222222222.putString(str13, goal102.getGoalId());
                                            bundle322222222222.putBoolean(str12, z27);
                                            bundle322222222222.putString(str18, str11);
                                            bundle322222222222.putString("reminder_type", str16);
                                            bundle322222222222.putString("frequency", str14);
                                            gk.a.b(bundle322222222222, str17);
                                            return;
                                        }
                                    }
                                    str10 = "variant";
                                    utils2 = Utils.INSTANCE;
                                    goalId2 = goal102.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId2);
                                    if (utils2.getGoalNotificationContent(goalId2) != null) {
                                    }
                                    Bundle bundle3222222222222 = new Bundle();
                                    bundle3222222222222.putString(str15, goal102.getCourseName());
                                    bundle3222222222222.putString(str13, goal102.getGoalId());
                                    bundle3222222222222.putBoolean(str12, z27);
                                    bundle3222222222222.putString(str18, str11);
                                    bundle3222222222222.putString("reminder_type", str16);
                                    bundle3222222222222.putString("frequency", str14);
                                    gk.a.b(bundle3222222222222, str17);
                                    return;
                                case 2:
                                    boolean z28 = z26;
                                    int i16 = k.E;
                                    kotlin.jvm.internal.i.g(goal102, "$weeklyGoal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById3 = FirebasePersistence.getInstance().getGoalById(goal102.getGoalId(), goal102.getCourseId());
                                    if (goalById3.getGoalId() != null) {
                                        String goalId12 = goalById3.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId12);
                                        if (goalId12.length() >= 7) {
                                            String goalId13 = goalById3.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId13);
                                            str19 = "variant";
                                            String substring3 = goalId13.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring3, "custom_")) {
                                                ProgressDialog progressDialog6 = this$0.f34316z;
                                                if (progressDialog6 != null) {
                                                    progressDialog6.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.e(goalById3, null, z28), 3);
                                                    str20 = "reminder_type";
                                                    str21 = "new";
                                                    str22 = "toggle";
                                                    str23 = Constants.GOAL_ID;
                                                    str24 = "course";
                                                    str25 = "regular";
                                                    str26 = str19;
                                                    str27 = "weekly";
                                                    Bundle bundle42222222222 = new Bundle();
                                                    bundle42222222222.putString(str24, goal102.getCourseName());
                                                    bundle42222222222.putString(str23, goal102.getGoalId());
                                                    bundle42222222222.putBoolean(str22, z28);
                                                    bundle42222222222.putString(str26, str21);
                                                    bundle42222222222.putString(str20, str25);
                                                    bundle42222222222.putString("frequency", str27);
                                                    gk.a.b(bundle42222222222, "profile_goal_toggle");
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                            utils3 = Utils.INSTANCE;
                                            goalId3 = goalById3.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId3);
                                            if (utils3.getGoalNotificationContent(goalId3) != null) {
                                                str20 = "reminder_type";
                                                str21 = "new";
                                                str22 = "toggle";
                                                str23 = Constants.GOAL_ID;
                                                str24 = "course";
                                                str25 = "regular";
                                                str26 = str19;
                                                str27 = "weekly";
                                                ProgressDialog progressDialog7 = this$0.f34316z;
                                                if (progressDialog7 != null) {
                                                    progressDialog7.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.f(goalById3, null, z28), 3);
                                                } else {
                                                    kotlin.jvm.internal.i.q("progressDialog");
                                                    throw null;
                                                }
                                            } else {
                                                Context applicationContext3 = this$0.requireContext().getApplicationContext();
                                                kotlin.jvm.internal.i.f(applicationContext3, "requireContext().applicationContext");
                                                long time5 = goalById3.getmStartDate().getTime();
                                                long time6 = goalById3.getmScheduleDate().getTime();
                                                String type3 = goalById3.getType();
                                                kotlin.jvm.internal.i.d(type3);
                                                String goalId14 = goalById3.getGoalId();
                                                kotlin.jvm.internal.i.d(goalId14);
                                                String courseName3 = goalById3.getCourseName();
                                                kotlin.jvm.internal.i.d(courseName3);
                                                String goalName3 = goalById3.getGoalName();
                                                kotlin.jvm.internal.i.d(goalName3);
                                                str27 = "weekly";
                                                str20 = "reminder_type";
                                                str26 = str19;
                                                str21 = "new";
                                                str22 = "toggle";
                                                str23 = Constants.GOAL_ID;
                                                str24 = "course";
                                                str25 = "regular";
                                                Utils.updateActivityNotification$default(utils3, applicationContext3, z22, time5, time6, type3, goalId14, courseName3, goalName3, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                                z28 = z22;
                                                goal102.setNotificationScheduled(z28);
                                                FirebasePersistence.getInstance().updateGoal(goal102, Boolean.TRUE);
                                            }
                                            Bundle bundle422222222222 = new Bundle();
                                            bundle422222222222.putString(str24, goal102.getCourseName());
                                            bundle422222222222.putString(str23, goal102.getGoalId());
                                            bundle422222222222.putBoolean(str22, z28);
                                            bundle422222222222.putString(str26, str21);
                                            bundle422222222222.putString(str20, str25);
                                            bundle422222222222.putString("frequency", str27);
                                            gk.a.b(bundle422222222222, "profile_goal_toggle");
                                            return;
                                        }
                                    }
                                    str19 = "variant";
                                    utils3 = Utils.INSTANCE;
                                    goalId3 = goalById3.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId3);
                                    if (utils3.getGoalNotificationContent(goalId3) != null) {
                                    }
                                    Bundle bundle4222222222222 = new Bundle();
                                    bundle4222222222222.putString(str24, goal102.getCourseName());
                                    bundle4222222222222.putString(str23, goal102.getGoalId());
                                    bundle4222222222222.putBoolean(str22, z28);
                                    bundle4222222222222.putString(str26, str21);
                                    bundle4222222222222.putString(str20, str25);
                                    bundle4222222222222.putString("frequency", str27);
                                    gk.a.b(bundle4222222222222, "profile_goal_toggle");
                                    return;
                                case 3:
                                    int i17 = k.E;
                                    kotlin.jvm.internal.i.g(goal102, "$weeklyGoal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById4 = FirebasePersistence.getInstance().getGoalById(goal102.getGoalId(), goal102.getCourseId());
                                    if (goalById4.getGoalId() != null) {
                                        String goalId15 = goalById4.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId15);
                                        if (goalId15.length() >= 7) {
                                            String goalId16 = goalById4.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId16);
                                            str28 = "profile_goal_toggle";
                                            String substring4 = goalId16.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring4, "custom_")) {
                                                ProgressDialog progressDialog8 = this$0.f34316z;
                                                if (progressDialog8 != null) {
                                                    progressDialog8.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.g(goalById4, null, z26), 3);
                                                    str29 = "toggle";
                                                    str30 = Constants.GOAL_ID;
                                                    str31 = "custom";
                                                    str32 = "course";
                                                    str33 = "weekly";
                                                    str34 = "frequency";
                                                    z24 = z26;
                                                    str35 = str28;
                                                    Bundle bundle52222222222 = new Bundle();
                                                    bundle52222222222.putString(str32, goal102.getCourseName());
                                                    bundle52222222222.putString(str30, goal102.getGoalId());
                                                    bundle52222222222.putBoolean(str29, z24);
                                                    bundle52222222222.putString("variant", "new");
                                                    bundle52222222222.putString("reminder_type", str31);
                                                    bundle52222222222.putString(str34, str33);
                                                    gk.a.b(bundle52222222222, str35);
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                            utils4 = Utils.INSTANCE;
                                            goalId4 = goalById4.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId4);
                                            if (utils4.getGoalNotificationContent(goalId4) != null) {
                                                str29 = "toggle";
                                                str30 = Constants.GOAL_ID;
                                                str31 = "custom";
                                                str32 = "course";
                                                str33 = "weekly";
                                                str34 = "frequency";
                                                z24 = z26;
                                                str35 = str28;
                                                ProgressDialog progressDialog9 = this$0.f34316z;
                                                if (progressDialog9 != null) {
                                                    progressDialog9.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.h(goalById4, null, z24), 3);
                                                } else {
                                                    kotlin.jvm.internal.i.q("progressDialog");
                                                    throw null;
                                                }
                                            } else {
                                                Context applicationContext4 = this$0.requireContext().getApplicationContext();
                                                kotlin.jvm.internal.i.f(applicationContext4, "requireContext().applicationContext");
                                                long time7 = goalById4.getmStartDate().getTime();
                                                long time8 = goalById4.getmScheduleDate().getTime();
                                                String type4 = goalById4.getType();
                                                kotlin.jvm.internal.i.d(type4);
                                                String goalId17 = goalById4.getGoalId();
                                                kotlin.jvm.internal.i.d(goalId17);
                                                String courseName4 = goalById4.getCourseName();
                                                kotlin.jvm.internal.i.d(courseName4);
                                                String goalName4 = goalById4.getGoalName();
                                                kotlin.jvm.internal.i.d(goalName4);
                                                str35 = str28;
                                                str29 = "toggle";
                                                str30 = Constants.GOAL_ID;
                                                str31 = "custom";
                                                str32 = "course";
                                                str33 = "weekly";
                                                str34 = "frequency";
                                                Utils.updateActivityNotification$default(utils4, applicationContext4, z22, time7, time8, type4, goalId17, courseName4, goalName4, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                                z24 = z22;
                                                goal102.setNotificationScheduled(z24);
                                                FirebasePersistence.getInstance().updateGoal(goal102, Boolean.TRUE);
                                            }
                                            Bundle bundle522222222222 = new Bundle();
                                            bundle522222222222.putString(str32, goal102.getCourseName());
                                            bundle522222222222.putString(str30, goal102.getGoalId());
                                            bundle522222222222.putBoolean(str29, z24);
                                            bundle522222222222.putString("variant", "new");
                                            bundle522222222222.putString("reminder_type", str31);
                                            bundle522222222222.putString(str34, str33);
                                            gk.a.b(bundle522222222222, str35);
                                            return;
                                        }
                                    }
                                    str28 = "profile_goal_toggle";
                                    utils4 = Utils.INSTANCE;
                                    goalId4 = goalById4.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId4);
                                    if (utils4.getGoalNotificationContent(goalId4) != null) {
                                    }
                                    Bundle bundle5222222222222 = new Bundle();
                                    bundle5222222222222.putString(str32, goal102.getCourseName());
                                    bundle5222222222222.putString(str30, goal102.getGoalId());
                                    bundle5222222222222.putBoolean(str29, z24);
                                    bundle5222222222222.putString("variant", "new");
                                    bundle5222222222222.putString("reminder_type", str31);
                                    bundle5222222222222.putString(str34, str33);
                                    gk.a.b(bundle5222222222222, str35);
                                    return;
                                case 4:
                                    int i18 = k.E;
                                    kotlin.jvm.internal.i.g(goal102, "$oneTimeGoal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById5 = FirebasePersistence.getInstance().getGoalById(goal102.getGoalId(), goal102.getCourseId());
                                    if (goalById5.getGoalId() != null) {
                                        String goalId18 = goalById5.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId18);
                                        if (goalId18.length() >= 7) {
                                            String goalId19 = goalById5.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId19);
                                            String substring5 = goalId19.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring5, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring5, "custom_")) {
                                                ProgressDialog progressDialog10 = this$0.f34316z;
                                                if (progressDialog10 != null) {
                                                    progressDialog10.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.i(goalById5, null, z26), 3);
                                                    str36 = "one_time";
                                                    str37 = "regular";
                                                    goal92 = goal102;
                                                    str38 = "reminder_type";
                                                    str39 = "new";
                                                    str40 = "variant";
                                                    str41 = "toggle";
                                                    str42 = Constants.GOAL_ID;
                                                    str44 = "profile_goal_toggle";
                                                    str45 = "course";
                                                    str43 = "frequency";
                                                    Bundle bundle62222222222 = new Bundle();
                                                    bundle62222222222.putString(str45, goal92.getCourseName());
                                                    bundle62222222222.putString(str42, goal92.getGoalId());
                                                    bundle62222222222.putBoolean(str41, z26);
                                                    bundle62222222222.putString(str40, str39);
                                                    bundle62222222222.putString(str38, str37);
                                                    bundle62222222222.putString(str43, str36);
                                                    gk.a.b(bundle62222222222, str44);
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                        }
                                    }
                                    Utils utils6 = Utils.INSTANCE;
                                    String goalId20 = goalById5.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId20);
                                    if (utils6.getGoalNotificationContent(goalId20) == null) {
                                        str36 = "one_time";
                                        str37 = "regular";
                                        goal92 = goal102;
                                        str38 = "reminder_type";
                                        str39 = "new";
                                        str40 = "variant";
                                        str41 = "toggle";
                                        str42 = Constants.GOAL_ID;
                                        str43 = "frequency";
                                        str44 = "profile_goal_toggle";
                                        str45 = "course";
                                        ProgressDialog progressDialog11 = this$0.f34316z;
                                        if (progressDialog11 != null) {
                                            progressDialog11.show();
                                            v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.j(goalById5, null, z26), 3);
                                            Bundle bundle622222222222 = new Bundle();
                                            bundle622222222222.putString(str45, goal92.getCourseName());
                                            bundle622222222222.putString(str42, goal92.getGoalId());
                                            bundle622222222222.putBoolean(str41, z26);
                                            bundle622222222222.putString(str40, str39);
                                            bundle622222222222.putString(str38, str37);
                                            bundle622222222222.putString(str43, str36);
                                            gk.a.b(bundle622222222222, str44);
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("progressDialog");
                                        throw null;
                                    }
                                    Context applicationContext5 = this$0.requireContext().getApplicationContext();
                                    kotlin.jvm.internal.i.f(applicationContext5, "requireContext().applicationContext");
                                    long time9 = goalById5.getmStartDate().getTime();
                                    long time10 = goalById5.getmScheduleDate().getTime();
                                    String type5 = goalById5.getType();
                                    kotlin.jvm.internal.i.d(type5);
                                    String goalId21 = goalById5.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId21);
                                    String courseName5 = goalById5.getCourseName();
                                    kotlin.jvm.internal.i.d(courseName5);
                                    String goalName5 = goalById5.getGoalName();
                                    kotlin.jvm.internal.i.d(goalName5);
                                    str44 = "profile_goal_toggle";
                                    str37 = "regular";
                                    str36 = "one_time";
                                    goal92 = goal102;
                                    str38 = "reminder_type";
                                    str39 = "new";
                                    str40 = "variant";
                                    str41 = "toggle";
                                    str42 = Constants.GOAL_ID;
                                    str45 = "course";
                                    Utils.updateActivityNotification$default(utils6, applicationContext5, z22, time9, time10, type5, goalId21, courseName5, goalName5, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                    z26 = z22;
                                    goal92.setNotificationScheduled(z26);
                                    FirebasePersistence.getInstance().updateGoal(goal92, Boolean.TRUE);
                                    str43 = "frequency";
                                    Bundle bundle6222222222222 = new Bundle();
                                    bundle6222222222222.putString(str45, goal92.getCourseName());
                                    bundle6222222222222.putString(str42, goal92.getGoalId());
                                    bundle6222222222222.putBoolean(str41, z26);
                                    bundle6222222222222.putString(str40, str39);
                                    bundle6222222222222.putString(str38, str37);
                                    bundle6222222222222.putString(str43, str36);
                                    gk.a.b(bundle6222222222222, str44);
                                    return;
                                default:
                                    int i19 = k.E;
                                    kotlin.jvm.internal.i.g(goal102, "$oneTimeGoal");
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Goal goalById6 = FirebasePersistence.getInstance().getGoalById(goal102.getGoalId(), goal102.getCourseId());
                                    if (goalById6.getGoalId() != null) {
                                        String goalId22 = goalById6.getGoalId();
                                        kotlin.jvm.internal.i.d(goalId22);
                                        if (goalId22.length() >= 7) {
                                            String goalId23 = goalById6.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId23);
                                            str46 = "new";
                                            String substring6 = goalId23.substring(0, 7);
                                            kotlin.jvm.internal.i.f(substring6, "this as java.lang.String…ing(startIndex, endIndex)");
                                            if (kotlin.jvm.internal.i.b(substring6, "custom_")) {
                                                ProgressDialog progressDialog12 = this$0.f34316z;
                                                if (progressDialog12 != null) {
                                                    progressDialog12.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.C0577k(goalById6, null, z26), 3);
                                                    str47 = "variant";
                                                    str48 = "toggle";
                                                    str49 = Constants.GOAL_ID;
                                                    str50 = "course";
                                                    z25 = z26;
                                                    str51 = "custom";
                                                    str52 = "one_time";
                                                    str53 = "reminder_type";
                                                    str54 = str46;
                                                    Bundle bundle72222222222 = new Bundle();
                                                    bundle72222222222.putString(str50, goal102.getCourseName());
                                                    bundle72222222222.putString(str49, goal102.getGoalId());
                                                    bundle72222222222.putBoolean(str48, z25);
                                                    bundle72222222222.putString(str47, str54);
                                                    bundle72222222222.putString(str53, str51);
                                                    bundle72222222222.putString("frequency", str52);
                                                    gk.a.b(bundle72222222222, "profile_goal_toggle");
                                                    return;
                                                }
                                                kotlin.jvm.internal.i.q("progressDialog");
                                                throw null;
                                            }
                                            utils5 = Utils.INSTANCE;
                                            goalId5 = goalById6.getGoalId();
                                            kotlin.jvm.internal.i.d(goalId5);
                                            if (utils5.getGoalNotificationContent(goalId5) != null) {
                                                str47 = "variant";
                                                str48 = "toggle";
                                                str49 = Constants.GOAL_ID;
                                                str50 = "course";
                                                z25 = z26;
                                                str51 = "custom";
                                                str52 = "one_time";
                                                str53 = "reminder_type";
                                                str54 = str46;
                                                ProgressDialog progressDialog13 = this$0.f34316z;
                                                if (progressDialog13 != null) {
                                                    progressDialog13.show();
                                                    v.H(kotlin.jvm.internal.h.c(o0.f23640a), null, 0, new k.l(goalById6, null, z25), 3);
                                                } else {
                                                    kotlin.jvm.internal.i.q("progressDialog");
                                                    throw null;
                                                }
                                            } else {
                                                Context applicationContext6 = this$0.requireContext().getApplicationContext();
                                                kotlin.jvm.internal.i.f(applicationContext6, "requireContext().applicationContext");
                                                long time11 = goalById6.getmStartDate().getTime();
                                                long time12 = goalById6.getmScheduleDate().getTime();
                                                String type6 = goalById6.getType();
                                                kotlin.jvm.internal.i.d(type6);
                                                String goalId24 = goalById6.getGoalId();
                                                kotlin.jvm.internal.i.d(goalId24);
                                                String courseName6 = goalById6.getCourseName();
                                                kotlin.jvm.internal.i.d(courseName6);
                                                String goalName6 = goalById6.getGoalName();
                                                kotlin.jvm.internal.i.d(goalName6);
                                                str53 = "reminder_type";
                                                str47 = "variant";
                                                str54 = str46;
                                                str48 = "toggle";
                                                str49 = Constants.GOAL_ID;
                                                str50 = "course";
                                                str51 = "custom";
                                                str52 = "one_time";
                                                Utils.updateActivityNotification$default(utils5, applicationContext6, z22, time11, time12, type6, goalId24, courseName6, goalName6, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                                                z25 = z22;
                                                goal102.setNotificationScheduled(z25);
                                                FirebasePersistence.getInstance().updateGoal(goal102, Boolean.TRUE);
                                            }
                                            Bundle bundle722222222222 = new Bundle();
                                            bundle722222222222.putString(str50, goal102.getCourseName());
                                            bundle722222222222.putString(str49, goal102.getGoalId());
                                            bundle722222222222.putBoolean(str48, z25);
                                            bundle722222222222.putString(str47, str54);
                                            bundle722222222222.putString(str53, str51);
                                            bundle722222222222.putString("frequency", str52);
                                            gk.a.b(bundle722222222222, "profile_goal_toggle");
                                            return;
                                        }
                                    }
                                    str46 = "new";
                                    utils5 = Utils.INSTANCE;
                                    goalId5 = goalById6.getGoalId();
                                    kotlin.jvm.internal.i.d(goalId5);
                                    if (utils5.getGoalNotificationContent(goalId5) != null) {
                                    }
                                    Bundle bundle7222222222222 = new Bundle();
                                    bundle7222222222222.putString(str50, goal102.getCourseName());
                                    bundle7222222222222.putString(str49, goal102.getGoalId());
                                    bundle7222222222222.putBoolean(str48, z25);
                                    bundle7222222222222.putString(str47, str54);
                                    bundle7222222222222.putString(str53, str51);
                                    bundle7222222222222.putString("frequency", str52);
                                    gk.a.b(bundle7222222222222, "profile_goal_toggle");
                                    return;
                            }
                        }
                    });
                    ((LinearLayout) _$_findCachedViewById(R.id.customReminderHeaderOnetimeContainer)).addView(inflate6);
                    i12 = R.layout.row_notification_new;
                }
            } else {
                ((LinearLayout) _$_findCachedViewById(R.id.customReminderHeaderOnetimeContainer)).setVisibility(8);
                ((RobertoTextView) _$_findCachedViewById(R.id.customReminderHeaderOnetime)).setVisibility(8);
            }
            if (arrayList.isEmpty() && list.isEmpty() && list3.isEmpty()) {
                ((AppCompatImageView) _$_findCachedViewById(R.id.regularNullAsset)).setVisibility(0);
                ((RobertoTextView) _$_findCachedViewById(R.id.regularNullText)).setVisibility(0);
            }
            if (list5.isEmpty() && list2.isEmpty() && list4.isEmpty()) {
                ((AppCompatImageView) _$_findCachedViewById(R.id.customNullAsset)).setVisibility(0);
                ((RobertoTextView) _$_findCachedViewById(R.id.customNullText)).setVisibility(0);
            }
            if (this.f34315y) {
                if (list5.isEmpty() && list2.isEmpty() && list4.isEmpty()) {
                    ((AppCompatImageView) _$_findCachedViewById(R.id.customNullAsset)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.customNullText)).setVisibility(0);
                    return;
                }
                return;
            }
            ((ConstraintLayout) _$_findCachedViewById(R.id.activityReminderLayout)).setVisibility(0);
            ((AppCompatImageView) _$_findCachedViewById(R.id.activityReminderArrow)).setVisibility(4);
            ((RobertoTextView) _$_findCachedViewById(R.id.customReminderHeader)).setVisibility(8);
            ((AppCompatImageView) _$_findCachedViewById(R.id.customReminderArrow)).setVisibility(8);
            ((ConstraintLayout) _$_findCachedViewById(R.id.customReminderLayout)).setVisibility(8);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f34311u, "exception", e10);
        }
    }

    public final void U(RobertoTextView robertoTextView, Goal goal) {
        try {
            String type = goal.getType();
            boolean b10 = kotlin.jvm.internal.i.b(type, Constants.GOAL_TYPE_ACTIVITY_ONCE);
            SimpleDateFormat simpleDateFormat = this.f34312v;
            if (b10) {
                SpannableString spannableString = new SpannableString("On " + (this.f34314x.format(goal.getmScheduleDate()) + " at " + simpleDateFormat.format(goal.getmScheduleDate())));
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(goal.getmScheduleDate());
                spannableString.setSpan(new q(goal, robertoTextView, calendar), 0, spannableString.length(), 33);
                robertoTextView.setText(spannableString);
                robertoTextView.setMovementMethod(LinkMovementMethod.getInstance());
            } else if (kotlin.jvm.internal.i.b(type, Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                String format = this.f34313w.format(goal.getmScheduleDate());
                kotlin.jvm.internal.i.f(format, "dayFormat.format(goal.getmScheduleDate())");
                String substring = format.substring(0, 3);
                kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                SpannableString spannableString2 = new SpannableString("Every " + (substring + "\nat " + simpleDateFormat.format(goal.getmScheduleDate())));
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTime(goal.getmScheduleDate());
                spannableString2.setSpan(new r(goal, robertoTextView, calendar2), 0, spannableString2.length(), 33);
                robertoTextView.setText(spannableString2);
                robertoTextView.setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                SpannableString spannableString3 = new SpannableString("at " + simpleDateFormat.format(goal.getmScheduleDate()));
                spannableString3.setSpan(new s(goal, robertoTextView), 0, spannableString3.length(), 33);
                robertoTextView.setText(spannableString3);
                robertoTextView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f34311u, e10);
        }
    }

    public final void X(RobertoTextView robertoTextView, FirestoreGoal firestoreGoal) {
        try {
            String type = firestoreGoal.getType();
            boolean b10 = kotlin.jvm.internal.i.b(type, Constants.GOAL_TYPE_ACTIVITY_ONCE);
            SimpleDateFormat simpleDateFormat = this.f34312v;
            if (b10) {
                long j10 = 1000;
                SpannableString spannableString = new SpannableString("On " + (this.f34314x.format(Long.valueOf(firestoreGoal.getScheduledDate().getTime() * j10)) + " at " + simpleDateFormat.format(Long.valueOf(firestoreGoal.getScheduledDate().getTime() * j10))));
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(firestoreGoal.getScheduledDate().getTime() * j10);
                spannableString.setSpan(new t(firestoreGoal, this, robertoTextView, calendar), 0, spannableString.length(), 33);
                robertoTextView.setText(spannableString);
                robertoTextView.setMovementMethod(LinkMovementMethod.getInstance());
            } else if (kotlin.jvm.internal.i.b(type, Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                long j11 = 1000;
                String format = this.f34313w.format(Long.valueOf(firestoreGoal.getScheduledDate().getTime() * j11));
                kotlin.jvm.internal.i.f(format, "dayFormat.format(goal.scheduledDate.time * 1000)");
                String substring = format.substring(0, 3);
                kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                SpannableString spannableString2 = new SpannableString("Every " + (substring + "\nat " + simpleDateFormat.format(Long.valueOf(firestoreGoal.getScheduledDate().getTime() * j11))));
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(firestoreGoal.getScheduledDate().getTime() * j11);
                spannableString2.setSpan(new u(firestoreGoal, this, robertoTextView, calendar2), 0, spannableString2.length(), 33);
                robertoTextView.setText(spannableString2);
                robertoTextView.setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                SpannableString spannableString3 = new SpannableString("at " + simpleDateFormat.format(Long.valueOf(firestoreGoal.getScheduledDate().getTime() * 1000)));
                spannableString3.setSpan(new v(firestoreGoal, this, robertoTextView), 0, spannableString3.length(), 33);
                robertoTextView.setText(spannableString3);
                robertoTextView.setMovementMethod(LinkMovementMethod.getInstance());
            }
            this.C = null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f34311u, e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.D;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_notifications_fragment_new, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.D.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            ProgressDialog progressDialog = new ProgressDialog(requireContext());
            this.f34316z = progressDialog;
            progressDialog.setMessage("Loading...");
            ProgressDialog progressDialog2 = this.f34316z;
            if (progressDialog2 != null) {
                progressDialog2.setCancelable(false);
                ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.activityReminderLayout);
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(8);
                }
                ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(R.id.customReminderLayout);
                if (constraintLayout2 != null) {
                    constraintLayout2.setVisibility(8);
                }
                RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.activityReminderHeader);
                if (robertoTextView != null) {
                    robertoTextView.setOnClickListener(new View.OnClickListener(this) { // from class: uo.a

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ k f34262v;

                        {
                            this.f34262v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            boolean z10;
                            boolean z11;
                            int i6 = r2;
                            k this$0 = this.f34262v;
                            switch (i6) {
                                case 0:
                                    int i10 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    try {
                                        if (this$0.f34315y) {
                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.activityReminderLayout);
                                            if (constraintLayout3 != null && constraintLayout3.getVisibility() == 0) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            if (z10) {
                                                ConstraintLayout constraintLayout4 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.activityReminderLayout);
                                                if (constraintLayout4 != null) {
                                                    constraintLayout4.setVisibility(8);
                                                }
                                                this$0.Q(true, false);
                                                return;
                                            }
                                            ConstraintLayout constraintLayout5 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.activityReminderLayout);
                                            if (constraintLayout5 != null) {
                                                constraintLayout5.setVisibility(0);
                                            }
                                            this$0.Q(true, true);
                                            return;
                                        }
                                        return;
                                    } catch (Exception e10) {
                                        LogHelper.INSTANCE.e(this$0.f34311u, e10);
                                        return;
                                    }
                                case 1:
                                    int i11 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    try {
                                        ConstraintLayout constraintLayout6 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.customReminderLayout);
                                        if (constraintLayout6 != null && constraintLayout6.getVisibility() == 0) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11) {
                                            ConstraintLayout constraintLayout7 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.customReminderLayout);
                                            if (constraintLayout7 != null) {
                                                constraintLayout7.setVisibility(8);
                                            }
                                            this$0.Q(false, false);
                                            return;
                                        }
                                        ConstraintLayout constraintLayout8 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.customReminderLayout);
                                        if (constraintLayout8 != null) {
                                            constraintLayout8.setVisibility(0);
                                        }
                                        this$0.Q(false, true);
                                        return;
                                    } catch (Exception e11) {
                                        LogHelper.INSTANCE.e(this$0.f34311u, e11);
                                        return;
                                    }
                                default:
                                    int i12 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    try {
                                        androidx.fragment.app.p requireActivity = this$0.requireActivity();
                                        kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentProfileActivity");
                                        ((ExperimentProfileActivity) requireActivity).x0();
                                        return;
                                    } catch (Exception e12) {
                                        LogHelper.INSTANCE.e(this$0.f34311u, e12);
                                        return;
                                    }
                            }
                        }
                    });
                }
                RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.customReminderHeader);
                if (robertoTextView2 != null) {
                    robertoTextView2.setOnClickListener(new View.OnClickListener(this) { // from class: uo.a

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ k f34262v;

                        {
                            this.f34262v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            boolean z10;
                            boolean z11;
                            int i6 = r2;
                            k this$0 = this.f34262v;
                            switch (i6) {
                                case 0:
                                    int i10 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    try {
                                        if (this$0.f34315y) {
                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.activityReminderLayout);
                                            if (constraintLayout3 != null && constraintLayout3.getVisibility() == 0) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            if (z10) {
                                                ConstraintLayout constraintLayout4 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.activityReminderLayout);
                                                if (constraintLayout4 != null) {
                                                    constraintLayout4.setVisibility(8);
                                                }
                                                this$0.Q(true, false);
                                                return;
                                            }
                                            ConstraintLayout constraintLayout5 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.activityReminderLayout);
                                            if (constraintLayout5 != null) {
                                                constraintLayout5.setVisibility(0);
                                            }
                                            this$0.Q(true, true);
                                            return;
                                        }
                                        return;
                                    } catch (Exception e10) {
                                        LogHelper.INSTANCE.e(this$0.f34311u, e10);
                                        return;
                                    }
                                case 1:
                                    int i11 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    try {
                                        ConstraintLayout constraintLayout6 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.customReminderLayout);
                                        if (constraintLayout6 != null && constraintLayout6.getVisibility() == 0) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11) {
                                            ConstraintLayout constraintLayout7 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.customReminderLayout);
                                            if (constraintLayout7 != null) {
                                                constraintLayout7.setVisibility(8);
                                            }
                                            this$0.Q(false, false);
                                            return;
                                        }
                                        ConstraintLayout constraintLayout8 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.customReminderLayout);
                                        if (constraintLayout8 != null) {
                                            constraintLayout8.setVisibility(0);
                                        }
                                        this$0.Q(false, true);
                                        return;
                                    } catch (Exception e11) {
                                        LogHelper.INSTANCE.e(this$0.f34311u, e11);
                                        return;
                                    }
                                default:
                                    int i12 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    try {
                                        androidx.fragment.app.p requireActivity = this$0.requireActivity();
                                        kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentProfileActivity");
                                        ((ExperimentProfileActivity) requireActivity).x0();
                                        return;
                                    } catch (Exception e12) {
                                        LogHelper.INSTANCE.e(this$0.f34311u, e12);
                                        return;
                                    }
                            }
                        }
                    });
                }
                AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.topBarBtnBack);
                if (appCompatImageView != null) {
                    appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: uo.a

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ k f34262v;

                        {
                            this.f34262v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            boolean z10;
                            boolean z11;
                            int i6 = r2;
                            k this$0 = this.f34262v;
                            switch (i6) {
                                case 0:
                                    int i10 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    try {
                                        if (this$0.f34315y) {
                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.activityReminderLayout);
                                            if (constraintLayout3 != null && constraintLayout3.getVisibility() == 0) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            if (z10) {
                                                ConstraintLayout constraintLayout4 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.activityReminderLayout);
                                                if (constraintLayout4 != null) {
                                                    constraintLayout4.setVisibility(8);
                                                }
                                                this$0.Q(true, false);
                                                return;
                                            }
                                            ConstraintLayout constraintLayout5 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.activityReminderLayout);
                                            if (constraintLayout5 != null) {
                                                constraintLayout5.setVisibility(0);
                                            }
                                            this$0.Q(true, true);
                                            return;
                                        }
                                        return;
                                    } catch (Exception e10) {
                                        LogHelper.INSTANCE.e(this$0.f34311u, e10);
                                        return;
                                    }
                                case 1:
                                    int i11 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    try {
                                        ConstraintLayout constraintLayout6 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.customReminderLayout);
                                        if (constraintLayout6 != null && constraintLayout6.getVisibility() == 0) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11) {
                                            ConstraintLayout constraintLayout7 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.customReminderLayout);
                                            if (constraintLayout7 != null) {
                                                constraintLayout7.setVisibility(8);
                                            }
                                            this$0.Q(false, false);
                                            return;
                                        }
                                        ConstraintLayout constraintLayout8 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.customReminderLayout);
                                        if (constraintLayout8 != null) {
                                            constraintLayout8.setVisibility(0);
                                        }
                                        this$0.Q(false, true);
                                        return;
                                    } catch (Exception e11) {
                                        LogHelper.INSTANCE.e(this$0.f34311u, e11);
                                        return;
                                    }
                                default:
                                    int i12 = k.E;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    try {
                                        androidx.fragment.app.p requireActivity = this$0.requireActivity();
                                        kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentProfileActivity");
                                        ((ExperimentProfileActivity) requireActivity).x0();
                                        return;
                                    } catch (Exception e12) {
                                        LogHelper.INSTANCE.e(this$0.f34311u, e12);
                                        return;
                                    }
                            }
                        }
                    });
                }
                if (sp.b.K()) {
                    l0 a10 = new androidx.lifecycle.o0(this, new kk.c(MyApplication.V.a(), new j0())).a(fm.a.class);
                    fm.a aVar = (fm.a) a10;
                    aVar.p();
                    aVar.E.e(getViewLifecycleOwner(), new b0(3, new a()));
                    fm.a aVar2 = (fm.a) a10;
                    l0 a11 = new androidx.lifecycle.o0(this).a(y.class);
                    y yVar = (y) a11;
                    yVar.C.e(getViewLifecycleOwner(), new b0(4, new b()));
                    yVar.D.e(getViewLifecycleOwner(), new b0(5, new c()));
                    yVar.E.e(getViewLifecycleOwner(), new b0(6, new d()));
                    this.A = (y) a11;
                    return;
                }
                S();
                return;
            }
            kotlin.jvm.internal.i.q("progressDialog");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f34311u, e10);
        }
    }
}
