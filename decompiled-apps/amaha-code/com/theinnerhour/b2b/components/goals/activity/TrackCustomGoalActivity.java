package com.theinnerhour.b2b.components.goals.activity;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewpager.widget.ViewPager;
import com.airbnb.lottie.LottieAnimationView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.activity.TrackCustomGoalActivity;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import f0.t;
import g0.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import tl.o;
/* compiled from: TrackCustomGoalActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/theinnerhour/b2b/components/goals/activity/TrackCustomGoalActivity;", "Lrr/a;", "<init>", "()V", "a", Constants.ONBOARDING_VARIANT, "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class TrackCustomGoalActivity extends rr.a {
    public static final /* synthetic */ int H = 0;
    public long A;
    public boolean B;
    public t C;

    /* renamed from: x  reason: collision with root package name */
    public boolean f11164x;

    /* renamed from: y  reason: collision with root package name */
    public Timer f11165y;

    /* renamed from: z  reason: collision with root package name */
    public long f11166z;
    public final LinkedHashMap G = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f11163w = LogHelper.INSTANCE.makeLogTag(TrackCustomGoalActivity.class);
    public final int D = Constants.TIMEOUT_MS;
    public final Handler E = new Handler();
    public final d F = new d();

    /* compiled from: TrackCustomGoalActivity.kt */
    /* loaded from: classes2.dex */
    public final class a extends k2.a {

        /* renamed from: c  reason: collision with root package name */
        public final Context f11167c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList<String> f11168d;

        public a(Context mContext, ArrayList arrayList) {
            i.g(mContext, "mContext");
            this.f11167c = mContext;
            this.f11168d = new ArrayList<>();
            this.f11168d = arrayList;
        }

        @Override // k2.a
        public final void e(ViewGroup collection, int i6, Object view) {
            i.g(collection, "collection");
            i.g(view, "view");
            collection.removeView((View) view);
        }

        @Override // k2.a
        public final int g() {
            return this.f11168d.size();
        }

        @Override // k2.a
        public final CharSequence h() {
            return "";
        }

        @Override // k2.a
        public final Object i(int i6, ViewGroup collection) {
            i.g(collection, "collection");
            View inflate = LayoutInflater.from(this.f11167c).inflate(R.layout.row_custom_goal_pager, collection, false);
            i.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) inflate;
            View findViewById = viewGroup.findViewById(R.id.activityTips);
            i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
            ((RobertoTextView) findViewById).setText(this.f11168d.get(i6));
            collection.addView(viewGroup);
            return viewGroup;
        }

        @Override // k2.a
        public final boolean j(View view, Object object) {
            i.g(view, "view");
            i.g(object, "object");
            if (view == object) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: TrackCustomGoalActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends TimerTask {

        /* renamed from: v  reason: collision with root package name */
        public static final /* synthetic */ int f11170v = 0;

        public c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            TrackCustomGoalActivity trackCustomGoalActivity = TrackCustomGoalActivity.this;
            long j10 = trackCustomGoalActivity.A + 1;
            trackCustomGoalActivity.A = j10;
            if (j10 == 60) {
                trackCustomGoalActivity.A = 0L;
                trackCustomGoalActivity.f11166z++;
            }
            trackCustomGoalActivity.runOnUiThread(new o(1, trackCustomGoalActivity));
        }
    }

    /* compiled from: TrackCustomGoalActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d implements Runnable {
        public d() {
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0030 A[Catch: Exception -> 0x005d, TryCatch #0 {Exception -> 0x005d, blocks: (B:3:0x0005, B:5:0x000f, B:7:0x001b, B:9:0x0021, B:14:0x0030, B:16:0x0038, B:23:0x0054, B:17:0x003c, B:19:0x0044, B:21:0x004c, B:22:0x0050), top: B:28:0x0005 }] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[Catch: Exception -> 0x005d, TryCatch #0 {Exception -> 0x005d, blocks: (B:3:0x0005, B:5:0x000f, B:7:0x001b, B:9:0x0021, B:14:0x0030, B:16:0x0038, B:23:0x0054, B:17:0x003c, B:19:0x0044, B:21:0x004c, B:22:0x0050), top: B:28:0x0005 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            boolean z10;
            k2.a aVar;
            TrackCustomGoalActivity trackCustomGoalActivity = TrackCustomGoalActivity.this;
            try {
                ViewPager viewPager = (ViewPager) trackCustomGoalActivity.u0(R.id.viewPager);
                int i6 = 0;
                if (viewPager != null) {
                    int currentItem = viewPager.getCurrentItem();
                    ViewPager viewPager2 = (ViewPager) trackCustomGoalActivity.u0(R.id.viewPager);
                    if (viewPager2 != null) {
                        aVar = viewPager2.getAdapter();
                    } else {
                        aVar = null;
                    }
                    i.d(aVar);
                    if (currentItem == aVar.g() - 1) {
                        z10 = true;
                        if (!z10) {
                            ViewPager viewPager3 = (ViewPager) trackCustomGoalActivity.u0(R.id.viewPager);
                            if (viewPager3 != null) {
                                viewPager3.v(0);
                            }
                        } else {
                            ViewPager viewPager4 = (ViewPager) trackCustomGoalActivity.u0(R.id.viewPager);
                            if (viewPager4 != null) {
                                ViewPager viewPager5 = (ViewPager) trackCustomGoalActivity.u0(R.id.viewPager);
                                if (viewPager5 != null) {
                                    i6 = viewPager5.getCurrentItem();
                                }
                                viewPager4.v(i6 + 1);
                            }
                        }
                        trackCustomGoalActivity.E.postDelayed(this, trackCustomGoalActivity.D);
                    }
                }
                z10 = false;
                if (!z10) {
                }
                trackCustomGoalActivity.E.postDelayed(this, trackCustomGoalActivity.D);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(trackCustomGoalActivity.f11163w, e10);
            }
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(R.layout.activity_track_custom_goal);
        try {
            w0();
            RobertoTextView robertoTextView = (RobertoTextView) u0(R.id.goalTitle);
            if (robertoTextView != null) {
                Intent intent = getIntent();
                if (intent == null || (str = intent.getStringExtra("goalName")) == null) {
                    str = "Custom goal task";
                }
                robertoTextView.setText(str);
            }
            String string = getString(R.string.customGoalSupport1);
            i.f(string, "getString(R.string.customGoalSupport1)");
            String string2 = getString(R.string.customGoalSupport2);
            i.f(string2, "getString(R.string.customGoalSupport2)");
            String string3 = getString(R.string.customGoalSupport3);
            i.f(string3, "getString(R.string.customGoalSupport3)");
            ((ViewPager) u0(R.id.viewPager)).setAdapter(new a(this, ca.a.k(string, string2, string3)));
            ((ViewPager) u0(R.id.viewPager)).b(new b());
            if (Build.VERSION.SDK_INT < 25) {
                LottieAnimationView lottieAnimationView = (LottieAnimationView) u0(R.id.trackAnim);
                if (lottieAnimationView != null) {
                    lottieAnimationView.setRenderMode(a3.t.SOFTWARE);
                }
            } else {
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) u0(R.id.trackAnim);
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setRenderMode(a3.t.HARDWARE);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11163w, e10);
        }
        ((RobertoButton) u0(R.id.btnStartGoal)).setOnClickListener(new View.OnClickListener(this) { // from class: am.s

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ TrackCustomGoalActivity f663v;

            {
                this.f663v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r2;
                TrackCustomGoalActivity this$0 = this.f663v;
                switch (i6) {
                    case 0:
                        int i10 = TrackCustomGoalActivity.H;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            if (this$0.f11164x) {
                                this$0.f11164x = false;
                                RobertoButton robertoButton = (RobertoButton) this$0.u0(R.id.btnStartGoal);
                                if (robertoButton != null) {
                                    robertoButton.setClickable(false);
                                }
                                ((LottieAnimationView) this$0.u0(R.id.trackAnim)).g();
                                Timer timer = this$0.f11165y;
                                if (timer != null) {
                                    timer.cancel();
                                }
                                long j10 = (this$0.f11166z * 60) + this$0.A;
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("completion_time", j10);
                                gk.a.b(bundle2, "custom_goal_timer_end");
                                Intent intent2 = new Intent();
                                intent2.putExtra("task_completion_seconds", j10);
                                this$0.setResult(-1, intent2);
                                this$0.finish();
                                return;
                            }
                            this$0.f11164x = true;
                            this$0.E.postDelayed(this$0.F, this$0.D);
                            ((ViewPager) this$0.u0(R.id.viewPager)).setVisibility(0);
                            RobertoButton robertoButton2 = (RobertoButton) this$0.u0(R.id.btnStartGoal);
                            if (robertoButton2 != null) {
                                robertoButton2.setText(this$0.getString(R.string.customGoalEndCta));
                            }
                            this$0.v0(0, 3);
                            this$0.x0();
                            Timer timer2 = new Timer();
                            this$0.f11165y = timer2;
                            timer2.scheduleAtFixedRate(new TrackCustomGoalActivity.c(), 0L, 1000L);
                            ((LottieAnimationView) this$0.u0(R.id.trackAnim)).h();
                            gk.a.b(null, "custom_goal_timer_start");
                            return;
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(this$0.f11163w, e11);
                            return;
                        }
                    default:
                        int i11 = TrackCustomGoalActivity.H;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.finish();
                        return;
                }
            }
        });
        ((AppCompatImageView) u0(R.id.header_arrow_back)).setOnClickListener(new View.OnClickListener(this) { // from class: am.s

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ TrackCustomGoalActivity f663v;

            {
                this.f663v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i6 = r2;
                TrackCustomGoalActivity this$0 = this.f663v;
                switch (i6) {
                    case 0:
                        int i10 = TrackCustomGoalActivity.H;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        try {
                            if (this$0.f11164x) {
                                this$0.f11164x = false;
                                RobertoButton robertoButton = (RobertoButton) this$0.u0(R.id.btnStartGoal);
                                if (robertoButton != null) {
                                    robertoButton.setClickable(false);
                                }
                                ((LottieAnimationView) this$0.u0(R.id.trackAnim)).g();
                                Timer timer = this$0.f11165y;
                                if (timer != null) {
                                    timer.cancel();
                                }
                                long j10 = (this$0.f11166z * 60) + this$0.A;
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("completion_time", j10);
                                gk.a.b(bundle2, "custom_goal_timer_end");
                                Intent intent2 = new Intent();
                                intent2.putExtra("task_completion_seconds", j10);
                                this$0.setResult(-1, intent2);
                                this$0.finish();
                                return;
                            }
                            this$0.f11164x = true;
                            this$0.E.postDelayed(this$0.F, this$0.D);
                            ((ViewPager) this$0.u0(R.id.viewPager)).setVisibility(0);
                            RobertoButton robertoButton2 = (RobertoButton) this$0.u0(R.id.btnStartGoal);
                            if (robertoButton2 != null) {
                                robertoButton2.setText(this$0.getString(R.string.customGoalEndCta));
                            }
                            this$0.v0(0, 3);
                            this$0.x0();
                            Timer timer2 = new Timer();
                            this$0.f11165y = timer2;
                            timer2.scheduleAtFixedRate(new TrackCustomGoalActivity.c(), 0L, 1000L);
                            ((LottieAnimationView) this$0.u0(R.id.trackAnim)).h();
                            gk.a.b(null, "custom_goal_timer_start");
                            return;
                        } catch (Exception e11) {
                            LogHelper.INSTANCE.e(this$0.f11163w, e11);
                            return;
                        }
                    default:
                        int i11 = TrackCustomGoalActivity.H;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.finish();
                        return;
                }
            }
        });
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        try {
            Timer timer = this.f11165y;
            if (timer != null) {
                timer.cancel();
            }
            Object systemService = getSystemService("notification");
            i.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).cancel(Constants.CUSTOM_TRACK_NOTIFICATION_ID);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11163w, e10);
        }
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onPause() {
        super.onPause();
        try {
            this.B = true;
            ((LottieAnimationView) u0(R.id.trackAnim)).g();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11163w, e10);
        }
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            if (this.B && (this.f11166z > 0 || this.A > 0)) {
                ((LottieAnimationView) u0(R.id.trackAnim)).j();
            }
            this.B = false;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11163w, e10);
        }
    }

    public final View u0(int i6) {
        LinkedHashMap linkedHashMap = this.G;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View findViewById = findViewById(i6);
            if (findViewById != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    public final void v0(int i6, int i10) {
        try {
            View[] viewArr = new View[3];
            ((LinearLayout) u0(R.id.layoutDots)).removeAllViews();
            for (int i11 = 0; i11 < 3; i11++) {
                View inflate = getLayoutInflater().inflate(R.layout.navigation_dot, (ViewGroup) ((LinearLayout) u0(R.id.layoutDots)), false);
                viewArr[i11] = inflate;
                i.d(inflate);
                Object obj = g0.a.f16164a;
                inflate.setBackground(a.c.b(this, R.drawable.circle_filled_white));
                ((LinearLayout) u0(R.id.layoutDots)).addView(viewArr[i11]);
            }
            View view = viewArr[i6];
            i.d(view);
            Object obj2 = g0.a.f16164a;
            view.setBackground(a.c.b(this, R.drawable.thumb));
            View view2 = viewArr[i6];
            i.d(view2);
            view2.setBackgroundTintList(g0.a.c(R.color.title_high_contrast, this));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    public final void w0() {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 8192);
                getWindow().setStatusBarColor(g0.a.b(this, R.color.customGoalTrackStatusbar));
            } else {
                getWindow().setStatusBarColor(g0.a.b(this, R.color.status_bar_grey));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11163w, "Error in setting custom status bar", e10);
        }
    }

    public final void x0() {
        int i6;
        int i10;
        Object systemService = getSystemService("notification");
        i.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            i6 = 4;
            NotificationChannel notificationChannel = new NotificationChannel("custom_track_channel", "Audio", 4);
            notificationChannel.setSound(null, null);
            notificationManager.createNotificationChannel(notificationChannel);
        } else {
            i6 = 2;
        }
        Intent putExtra = new Intent(this, TrackCustomGoalActivity.class).putExtra("custom_track", true).putExtra("track_custom", true);
        i.f(putExtra, "Intent(this, TrackCustom…tra(\"track_custom\", true)");
        putExtra.setFlags(4194304);
        if (i11 >= 23) {
            i10 = 201326592;
        } else {
            i10 = 134217728;
        }
        PendingIntent activity = PendingIntent.getActivity(this, 0, putExtra, i10);
        t tVar = new t(getApplicationContext(), "custom_track_channel");
        tVar.f14677w = 1;
        tVar.D.icon = R.drawable.ic_stat_notification_amaha;
        tVar.h(BitmapFactory.decodeResource(getResources(), R.drawable.ic_amaha_logo));
        Intent intent = getIntent();
        tVar.e((intent == null || (r3 = intent.getStringExtra("goalName")) == null) ? "Custom goal task" : "Custom goal task");
        tVar.d("00:00");
        tVar.f(2);
        tVar.f14665j = i6;
        tVar.g(8, true);
        tVar.f14662g = activity;
        tVar.g(2, true);
        this.C = tVar;
        notificationManager.notify(Constants.CUSTOM_TRACK_NOTIFICATION_ID, tVar.b());
    }

    /* compiled from: TrackCustomGoalActivity.kt */
    /* loaded from: classes2.dex */
    public final class b implements ViewPager.i {
        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i6) {
            int i10 = TrackCustomGoalActivity.H;
            TrackCustomGoalActivity.this.v0(i6, 3);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i6) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(float f, int i6) {
        }
    }
}
