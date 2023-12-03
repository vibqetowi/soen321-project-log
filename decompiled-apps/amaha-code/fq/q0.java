package fq;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewpager.widget.ViewPager;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.T5Activity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResult10Model;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.receiver.WorryTimeReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Random;
import kotlin.Metadata;
/* compiled from: StaticS38Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/q0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class q0 extends rr.b {
    public static final /* synthetic */ int K = 0;
    public ek.i A;
    public boolean G;
    public T5Activity H;

    /* renamed from: z  reason: collision with root package name */
    public int f15788z;
    public final LinkedHashMap J = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f15783u = LogHelper.INSTANCE.makeLogTag(q0.class);

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList<String> f15784v = new ArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    public final SimpleDateFormat f15785w = new SimpleDateFormat("hh:mm a");

    /* renamed from: x  reason: collision with root package name */
    public final SimpleDateFormat f15786x = new SimpleDateFormat("hh:mm");

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<String> f15787y = new ArrayList<>();
    public String B = "s38";
    public final Calendar C = Calendar.getInstance();
    public String D = "";
    public String E = "";
    public final ScreenResult10Model F = new ScreenResult10Model();
    public String I = "";

    @Override // rr.b
    public final boolean I() {
        int i6 = this.f15788z;
        if (i6 > 0) {
            this.f15788z = i6 - 1;
            O();
            return false;
        }
        return true;
    }

    public final T5Activity J() {
        T5Activity t5Activity = this.H;
        if (t5Activity != null) {
            return t5Activity;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    public final void K() {
        int i6;
        int i10;
        Calendar calendar = this.C;
        try {
            if (calendar.getTimeInMillis() < Calendar.getInstance().getTimeInMillis()) {
                calendar.add(5, 1);
            }
            Intent intent = new Intent(getActivity(), WorryTimeReceiver.class);
            intent.putExtra("msg", String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).getText()));
            intent.putExtra(Constants.API_COURSE_LINK, Constants.NOTIFICATION_WORRY);
            HashMap<String, Object> hashMap = J().B;
            if (hashMap.containsKey("s38_notification_id")) {
                Object obj = hashMap.get("s38_notification_id");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.Int");
                i6 = ((Integer) obj).intValue();
            } else {
                int nextInt = new Random().nextInt();
                hashMap.put("s38_notification_id", Integer.valueOf(nextInt));
                i6 = nextInt;
            }
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.d(activity);
            Context applicationContext = activity.getApplicationContext();
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23) {
                i10 = 201326592;
            } else {
                i10 = 134217728;
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(applicationContext, i6, intent, i10);
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.d(activity2);
            Object systemService = activity2.getSystemService("alarm");
            kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
            AlarmManager alarmManager = (AlarmManager) systemService;
            if (i11 >= 23) {
                alarmManager.setExactAndAllowWhileIdle(0, calendar.getTimeInMillis(), broadcast);
            } else {
                alarmManager.setExact(0, calendar.getTimeInMillis(), broadcast);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15783u, "Exception", e10);
        }
    }

    public final void M() {
        try {
            ((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.llTextView)).setVisibility(0);
            ((RobertoTextView) _$_findCachedViewById(R.id.llTextView)).setOnClickListener(new p0(this, 4));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15783u, "Exception", e10);
        }
    }

    public final void O() {
        boolean z10;
        boolean z11;
        int i6 = this.f15788z;
        ScreenResult10Model screenResult10Model = this.F;
        if (i6 != 0) {
            Goal goal = null;
            if (i6 != 1) {
                if (i6 == 2) {
                    ((AppCompatImageView) _$_findCachedViewById(R.id.chevronLeftButton)).setVisibility(0);
                    ((AppCompatImageView) _$_findCachedViewById(R.id.chevronRightButton)).setVisibility(4);
                    if (this.G) {
                        this.G = false;
                    }
                    try {
                        for (Goal goal2 : FirebasePersistence.getInstance().getUserGoals()) {
                            if ((kotlin.jvm.internal.i.b(Constants.DAILY_ACTIVITY_GOAL_ID_WORRY_WORRY_TIME, goal2.getGoalId()) && kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getCurrentCourseName(), goal2.getCourseName())) || (kotlin.jvm.internal.i.b(Constants.DAILY_ACTIVITY_GOAL_ID_SLEEP_WORRY_TIME, goal2.getGoalId()) && kotlin.jvm.internal.i.b(FirebasePersistence.getInstance().getUser().getCurrentCourseName(), goal2.getCourseName()))) {
                                goal = goal2;
                                break;
                            }
                        }
                        if (!J().D) {
                            J().D = true;
                            if (goal != null) {
                                goal.setSource("daily_plan");
                                Date time = Calendar.getInstance().getTime();
                                kotlin.jvm.internal.i.f(time, "getInstance().time");
                                goal.setmLastAdded(time);
                                if (!goal.getData().containsKey(this.I)) {
                                    goal.getData().put(this.I, new ArrayList());
                                }
                                screenResult10Model.setDate(Utils.INSTANCE.getTimeInSeconds());
                                J().B.put("s38_time", Long.valueOf(this.C.getTimeInMillis() / 1000));
                                Object obj = goal.getData().get(this.I);
                                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult10Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult10Model> }");
                                ((ArrayList) obj).add(screenResult10Model);
                            } else {
                                if (kotlin.jvm.internal.i.b(this.I, "result_worry_time_anxiety")) {
                                    goal = new Goal(FirebasePersistence.getInstance().getUser().getCurrentCourse(), Constants.DAILY_ACTIVITY_GOAL_ID_WORRY_WORRY_TIME);
                                    goal.setType(Constants.getGoalType(Constants.DAILY_ACTIVITY_GOAL_ID_WORRY_WORRY_TIME).getType());
                                    goal.setVisible(false);
                                } else if (kotlin.jvm.internal.i.b(this.I, "result_worry_time_sleep")) {
                                    goal = new Goal(FirebasePersistence.getInstance().getUser().getCurrentCourse(), Constants.DAILY_ACTIVITY_GOAL_ID_SLEEP_WORRY_TIME);
                                    goal.setType(Constants.getGoalType(Constants.DAILY_ACTIVITY_GOAL_ID_SLEEP_WORRY_TIME).getType());
                                    goal.setVisible(false);
                                }
                                kotlin.jvm.internal.i.d(goal);
                                goal.setNotificationScheduled(false);
                                goal.setSource("daily_plan");
                                goal.getData().put(this.I, new ArrayList());
                                Object obj2 = goal.getData().get(this.I);
                                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult10Model>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResult10Model> }");
                                ((ArrayList) obj2).add(screenResult10Model);
                                FirebasePersistence.getInstance().getUserGoals().add(goal);
                            }
                            FirebasePersistence.getInstance().updateUserOnFirebase();
                        }
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(this.f15783u, "exception", e10);
                    }
                    this.f15788z++;
                }
            } else {
                String str = this.B;
                if (kotlin.jvm.internal.i.b(str, "s38")) {
                    if (this.G) {
                        this.G = false;
                        K();
                        ((RobertoTextView) _$_findCachedViewById(R.id.llTextView)).setText(this.E);
                        ((RobertoTextView) _$_findCachedViewById(R.id.llTextView)).setOnClickListener(null);
                        this.f15788z++;
                        ((AppCompatImageView) _$_findCachedViewById(R.id.chevronLeftButton)).setVisibility(0);
                        ((AppCompatImageView) _$_findCachedViewById(R.id.chevronRightButton)).setVisibility(4);
                    } else {
                        P();
                        M();
                    }
                } else if (kotlin.jvm.internal.i.b(str, "s39")) {
                    if (this.G) {
                        this.G = false;
                        if (String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).getText()).length() == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            Utils.INSTANCE.showCustomToast(getActivity(), "Please note down your worry to proceed");
                        } else {
                            screenResult10Model.setText(String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).getText()));
                            J().B.put("s39_text", String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).getText()));
                            ((RobertoTextView) _$_findCachedViewById(R.id.llTextView)).setText(this.E);
                            ((RobertoTextView) _$_findCachedViewById(R.id.llTextView)).setOnClickListener(null);
                            ((RobertoTextView) _$_findCachedViewById(R.id.llTextView)).setVisibility(0);
                            ((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).setVisibility(8);
                            K();
                            this.f15788z++;
                            ((AppCompatImageView) _$_findCachedViewById(R.id.chevronLeftButton)).setVisibility(0);
                            ((AppCompatImageView) _$_findCachedViewById(R.id.chevronRightButton)).setVisibility(4);
                        }
                    } else {
                        ((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).setVisibility(0);
                        ((RobertoTextView) _$_findCachedViewById(R.id.llTextView)).setVisibility(8);
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setVisibility(8);
                    }
                }
            }
        } else {
            String str2 = this.B;
            if (kotlin.jvm.internal.i.b(str2, "s38")) {
                if (this.G) {
                    this.G = false;
                    if (String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).getText()).length() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        Utils.INSTANCE.showCustomToast(getActivity(), "Enter Message");
                    } else {
                        ((AppCompatImageView) _$_findCachedViewById(R.id.chevronLeftButton)).setVisibility(0);
                        ((AppCompatImageView) _$_findCachedViewById(R.id.chevronRightButton)).setVisibility(0);
                        ((RobertoButton) _$_findCachedViewById(R.id.button1)).setVisibility(8);
                        screenResult10Model.setText(String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).getText()));
                        J().B.put("s38_text", String.valueOf(((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).getText()));
                        M();
                        this.f15788z++;
                    }
                } else {
                    ((AppCompatImageView) _$_findCachedViewById(R.id.chevronLeftButton)).setVisibility(4);
                    ((AppCompatImageView) _$_findCachedViewById(R.id.chevronRightButton)).setVisibility(0);
                    ((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.llTextView)).setVisibility(8);
                    ((RobertoButton) _$_findCachedViewById(R.id.button1)).setVisibility(0);
                }
            } else if (kotlin.jvm.internal.i.b(str2, "s39")) {
                if (this.G) {
                    this.G = false;
                    this.f15788z++;
                    ((AppCompatImageView) _$_findCachedViewById(R.id.chevronLeftButton)).setVisibility(0);
                    ((AppCompatImageView) _$_findCachedViewById(R.id.chevronRightButton)).setVisibility(0);
                    ((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.llTextView)).setVisibility(8);
                    ((RobertoButton) _$_findCachedViewById(R.id.button1)).setVisibility(8);
                } else {
                    ((AppCompatImageView) _$_findCachedViewById(R.id.chevronLeftButton)).setVisibility(4);
                    ((AppCompatImageView) _$_findCachedViewById(R.id.chevronRightButton)).setVisibility(0);
                    P();
                    M();
                    ((RobertoButton) _$_findCachedViewById(R.id.button1)).setVisibility(0);
                    ((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).setVisibility(8);
                    ((RobertoTextView) _$_findCachedViewById(R.id.llTextView)).setVisibility(0);
                    ((RobertoButton) _$_findCachedViewById(R.id.button1)).setVisibility(0);
                }
            }
        }
        if (this.f15788z < 3) {
            ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(this.f15784v.get(this.f15788z));
            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText(this.f15787y.get(this.f15788z));
            ((ViewPager) _$_findCachedViewById(R.id.stepsViewPager)).post(new tl.o(18, this));
            return;
        }
        this.f15788z = 0;
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T5Activity");
        ((T5Activity) activity).t0();
    }

    public final void P() {
        try {
            String format = this.f15785w.format(this.C.getTime());
            SpannableString spannableString = new SpannableString(this.D + '\n' + format);
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.d(activity);
            spannableString.setSpan(new ForegroundColorSpan(g0.a.b(activity.getBaseContext(), R.color.sea)), this.D.length(), this.D.length() + format.length() + 1, 33);
            ((RobertoTextView) _$_findCachedViewById(R.id.llTextView)).setText(spannableString);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15783u, "exception", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.J;
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
        return inflater.inflate(R.layout.fragment_static_s38, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.J.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Calendar calendar = this.C;
        String str2 = this.f15783u;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            this.F.setDate(Utils.INSTANCE.getTimeInSeconds());
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T5Activity");
            this.H = (T5Activity) activity;
            String str3 = J().C;
            this.B = str3;
            if (kotlin.jvm.internal.i.b(str3, "s39")) {
                str = "result_worry_time_anxiety";
            } else {
                str = "result_worry_time_sleep";
            }
            this.I = str;
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            Bundle arguments = getArguments();
            kotlin.jvm.internal.i.d(arguments);
            String string = arguments.getString(Constants.API_COURSE_LINK);
            Bundle arguments2 = getArguments();
            kotlin.jvm.internal.i.d(arguments2);
            arguments2.getInt(Constants.DAYMODEL_POSITION);
            ((AppCompatImageView) _$_findCachedViewById(R.id.chevronLeftButton)).setVisibility(4);
            ((AppCompatImageView) _$_findCachedViewById(R.id.chevronRightButton)).setVisibility(0);
            boolean b10 = kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY);
            ArrayList<String> arrayList = this.f15787y;
            ArrayList<String> arrayList2 = this.f15784v;
            if (b10 && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T5B)) {
                arrayList2.clear();
                arrayList.clear();
                arrayList2.add("Now pick your worry time");
                arrayList2.add("Identify what is worrying you");
                arrayList2.add("Finally, re-center yourself");
                arrayList.add("Choose a time for you to worry each day. Avoid picking a time late in the night.");
                arrayList.add("If any worrying thoughts are on your mind right now, write them down.");
                arrayList.add("Get your attention back to the present moment by breathing deeply or distracting yourself.");
                ((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).setHint("Note them here");
                this.E = "If your worries pop up in your head, that's okay. Remind yourself that you will only worry at the scheduled time.";
                ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText("SKIP");
                ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText("NEXT");
                this.D = "Set worry time to";
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(string, Constants.SCREEN_T5A)) {
                arrayList2.clear();
                arrayList.clear();
                arrayList2.add("First, identify your worry");
                arrayList2.add("Now, pick another time to worry");
                arrayList2.add("Finally, re-center yourself");
                arrayList.add("Write down whatever worrying thoughts are on your mind.");
                arrayList.add("Choose a time - preferably the next morning or afternoon - to worry about what you have noted.");
                arrayList.add("To get your attention back to the present, you could try breathing deeply or distracting yourself.");
                ((RobertoEditText) _$_findCachedViewById(R.id.llEditText)).setHint("Note them here");
                this.E = "If your worries pop up in your head, that's okay. Remind yourself that you will only worry at the scheduled time.";
                ((RobertoButton) _$_findCachedViewById(R.id.button1)).setText("SKIP");
                ((RobertoButton) _$_findCachedViewById(R.id.button2)).setText("NEXT");
                this.D = "Set worry time to";
            }
            try {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTime(this.f15786x.parse("15:00"));
                calendar.set(11, calendar2.get(11));
                calendar.set(12, calendar2.get(12));
                calendar.set(13, 0);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str2, "exception", e10);
            }
            this.A = new ek.i(this, 3);
            ((ViewPager) _$_findCachedViewById(R.id.stepsViewPager)).setAdapter(this.A);
            ek.i iVar = this.A;
            if (iVar != null) {
                iVar.k();
            }
            ek.i iVar2 = this.A;
            kotlin.jvm.internal.i.d(iVar2);
            ((ViewPager) _$_findCachedViewById(R.id.stepsViewPager)).b(iVar2);
            ((ViewPager) _$_findCachedViewById(R.id.stepsViewPager)).setOnTouchListener(new w5.h0(13));
            try {
                J();
            } catch (Exception e11) {
                LogHelper.INSTANCE.e(str2, "exception", e11);
            }
            O();
            ((RobertoButton) _$_findCachedViewById(R.id.button1)).setOnClickListener(new p0(this, 0));
            ((RobertoButton) _$_findCachedViewById(R.id.button2)).setOnClickListener(new p0(this, 1));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new p0(this, 2));
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new p0(this, 3));
            P();
        } catch (Exception e12) {
            LogHelper.INSTANCE.e(str2, "exception in on view created", e12);
        }
    }
}
