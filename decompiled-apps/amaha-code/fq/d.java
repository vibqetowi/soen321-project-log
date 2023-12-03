package fq;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewpager.widget.ViewPager;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResult10Model;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
/* compiled from: StaticNotify21Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lfq/d;", "Lrr/b;", "<init>", "()V", "a", Constants.ONBOARDING_VARIANT, "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class d extends rr.b {
    public static final /* synthetic */ int C = 0;

    /* renamed from: v  reason: collision with root package name */
    public e f15680v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f15681w;

    /* renamed from: y  reason: collision with root package name */
    public fm.a f15683y;

    /* renamed from: z  reason: collision with root package name */
    public List<? extends HashMap<?, ?>> f15684z;
    public final LinkedHashMap B = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f15679u = LogHelper.INSTANCE.makeLogTag(d.class);

    /* renamed from: x  reason: collision with root package name */
    public long f15682x = 1200000;
    public final int[] A = {R.attr.state_zero, R.attr.state_one, R.attr.state_two, R.attr.state_three, R.attr.state_four, R.attr.state_five, R.attr.state_six, R.attr.state_seven, R.attr.state_eight, R.attr.state_nine};

    /* compiled from: StaticNotify21Fragment.kt */
    /* loaded from: classes2.dex */
    public final class a extends k2.a {

        /* renamed from: c  reason: collision with root package name */
        public final Context f15685c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList<String> f15686d;

        public a(androidx.fragment.app.p pVar, ArrayList arrayList) {
            this.f15685c = pVar;
            this.f15686d = new ArrayList<>();
            this.f15686d = arrayList;
        }

        @Override // k2.a
        public final void e(ViewGroup collection, int i6, Object view) {
            kotlin.jvm.internal.i.g(collection, "collection");
            kotlin.jvm.internal.i.g(view, "view");
            collection.removeView((View) view);
        }

        @Override // k2.a
        public final int g() {
            return this.f15686d.size();
        }

        @Override // k2.a
        public final CharSequence h() {
            return "";
        }

        @Override // k2.a
        public final Object i(int i6, ViewGroup collection) {
            kotlin.jvm.internal.i.g(collection, "collection");
            View inflate = LayoutInflater.from(this.f15685c).inflate(R.layout.row_activity_pager, collection, false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout = (LinearLayout) inflate;
            View findViewById = linearLayout.findViewById(R.id.activityTips);
            kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
            ((RobertoTextView) findViewById).setText(this.f15686d.get(i6));
            collection.addView(linearLayout);
            return linearLayout;
        }

        @Override // k2.a
        public final boolean j(View view, Object object) {
            kotlin.jvm.internal.i.g(view, "view");
            kotlin.jvm.internal.i.g(object, "object");
            if (view == object) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: StaticNotify21Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<List<? extends HashMap<String, Object>>, hs.k> {
        public c() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(List<? extends HashMap<String, Object>> list) {
            d dVar = d.this;
            dVar.f15684z = list;
            dVar.P();
            return hs.k.f19476a;
        }
    }

    public static ScreenResult10Model M(List list) {
        if (sp.b.K()) {
            return (ScreenResult10Model) is.u.o2(UtilFunKt.result10MapToObject(list));
        }
        Goal goalById = FirebasePersistence.getInstance().getGoalById("wRiML8ebB1zu56mdNwmN", "db992ff7-a994-499c-a05b-3c3cb44fdfb5");
        if (goalById != null) {
            return (ScreenResult10Model) is.u.o2(UtilFunKt.result10MapToObject(goalById.getData().get("result_10")));
        }
        return null;
    }

    public final void J(int i6, int i10) {
        try {
            ((LinearLayout) _$_findCachedViewById(R.id.layoutDots)).removeAllViews();
            for (int i11 = 0; i11 < i10; i11++) {
                TextView textView = new TextView(getActivity());
                textView.setText(Html.fromHtml("&#x25cf;"));
                textView.setPadding(0, 0, 6, 0);
                textView.setTextSize(2, (int) getResources().getDimension(R.dimen.dotslayout_dots));
                if (i6 == i11) {
                    textView.setTextColor(g0.a.b(((LinearLayout) _$_findCachedViewById(R.id.layoutDots)).getContext(), R.color.sea));
                } else {
                    textView.setTextColor(g0.a.b(((LinearLayout) _$_findCachedViewById(R.id.layoutDots)).getContext(), R.color.grey_1));
                }
                ((LinearLayout) _$_findCachedViewById(R.id.layoutDots)).addView(textView);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15679u, "exception", e10);
        }
    }

    public final void K() {
        try {
            if (this.f15681w) {
                e eVar = new e(this, this.f15682x);
                this.f15680v = eVar;
                eVar.start();
                ((AppCompatImageView) _$_findCachedViewById(R.id.img_play_pause)).setImageResource(R.drawable.anim_play_to_pause);
            } else {
                e eVar2 = this.f15680v;
                kotlin.jvm.internal.i.d(eVar2);
                eVar2.cancel();
                ((AppCompatImageView) _$_findCachedViewById(R.id.img_play_pause)).setImageResource(R.drawable.anim_pause_to_play);
            }
            if (((AppCompatImageView) _$_findCachedViewById(R.id.img_play_pause)).getDrawable() instanceof Animatable) {
                Drawable drawable = ((AppCompatImageView) _$_findCachedViewById(R.id.img_play_pause)).getDrawable();
                kotlin.jvm.internal.i.e(drawable, "null cannot be cast to non-null type android.graphics.drawable.Animatable");
                ((Animatable) drawable).start();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15679u, "exception in change count down state", e10);
        }
    }

    public final void O(AppCompatImageView appCompatImageView, int i6) {
        int[] iArr = this.A;
        try {
            int length = iArr.length;
            int[] iArr2 = new int[length];
            for (int i10 = 0; i10 < length; i10++) {
                if (i10 == i6) {
                    iArr2[i10] = iArr[i6];
                } else {
                    iArr2[i10] = -iArr[i6];
                }
            }
            appCompatImageView.setImageState(iArr2, true);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15679u, "exception in set state", e10);
        }
    }

    public final void P() {
        boolean z10;
        Long l2;
        ScreenResult10Model M;
        Intent intent;
        Course courseById = FirebasePersistence.getInstance().getCourseById(defpackage.c.n());
        String string = requireArguments().getString(Constants.API_COURSE_LINK);
        ArrayList arrayList = new ArrayList();
        ((RobertoTextView) _$_findCachedViewById(R.id.tvNotifyDescription)).setText(requireActivity().getIntent().getStringExtra("msg"));
        if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(string, Constants.NOTIFICATION_WORRY)) {
            ((RobertoTextView) _$_findCachedViewById(R.id.tvNotifyHeader1)).setText("You were worried about");
            defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.tvNotifyHeader2), "Take steps to feel better", arrayList, "Limit the time you spend worrying to 20 minutes.", "You can try writing about what's on your mind.");
            defpackage.d.p(arrayList, "Think of different ways to deal with your worry.", "Decide on a step that can help solve the problem.", "You could also try deep breathing to feel calmer.", "Once worry time is over, let go of your worries!");
            arrayList.add("Stop engaging with worry by distracting yourself.");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(string, Constants.NOTIFICATION_WORRY)) {
            ((RobertoTextView) _$_findCachedViewById(R.id.tvNotifyHeader1)).setText("You were worried about");
            defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.tvNotifyHeader2), "Take steps to feel better", arrayList, "Limit the time you spend worrying to 20 minutes.", "You can try writing about what's on your mind.");
            defpackage.d.p(arrayList, "Think of different ways to deal with your worry.", "Decide on a step that can help solve the problem.", "You could also try deep breathing to feel calmer.", "Once worry time is over, let go of your worries!");
            arrayList.add("Stop engaging with worry by distracting yourself.");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION) && kotlin.jvm.internal.i.b(string, Constants.NOTIFICATION_WORRY)) {
            ((RobertoTextView) _$_findCachedViewById(R.id.tvNotifyHeader1)).setText("You were worried about");
            defpackage.c.z((RobertoTextView) _$_findCachedViewById(R.id.tvNotifyHeader2), "Take steps to feel better", arrayList, "Limit the time you spend worrying to 20 minutes.", "You can try writing about what's on your mind.");
            defpackage.d.p(arrayList, "Think of different ways to deal with your worry.", "Decide on a step that can help solve the problem.", "You could also try deep breathing to feel calmer.", "Once worry time is over, let go of your worries!");
            arrayList.add("Stop engaging with worry by distracting yourself.");
        }
        ((RobertoButton) _$_findCachedViewById(R.id.btnNotifyButton)).setText("DONE");
        ((RobertoTextView) _$_findCachedViewById(R.id.tvNotifyReadMore)).setText("Read more");
        androidx.fragment.app.p activity = getActivity();
        if (activity != null && (intent = activity.getIntent()) != null && intent.hasExtra("source")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            List<? extends HashMap<?, ?>> list = this.f15684z;
            Long l10 = null;
            if (list != null && (M = M(list)) != null) {
                l2 = Long.valueOf(M.getDate() * 1000);
            } else {
                l2 = null;
            }
            if (l2 != null) {
                l10 = Long.valueOf(TimeUnit.MINUTES.toMillis(30L) + l2.longValue());
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm a");
            if (l2 == null || l2.longValue() != -1) {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvNotifyHeader1)).setVisibility(8);
                ((RobertoTextView) _$_findCachedViewById(R.id.tvNotifyGoalInfo)).setVisibility(0);
                ((RobertoTextView) _$_findCachedViewById(R.id.tvNotifyGoalInfo)).setText("Your worry time is scheduled for " + simpleDateFormat.format(l2) + ". You can start your worry time anytime between " + simpleDateFormat.format(l2) + " to " + simpleDateFormat.format(l10) + '.');
            }
        }
        ((AppCompatImageView) _$_findCachedViewById(R.id.img_play_pause)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.c

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ d f15673v;

            {
                this.f15673v = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:58:0x0133, code lost:
                if (r11 != null) goto L53;
             */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x016b  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(View view) {
                boolean z11;
                ScreenResult10Model screenResult10Model;
                boolean z12;
                String str;
                long j10;
                boolean z13;
                Intent intent2;
                Intent intent3;
                int i6 = r2;
                d this$0 = this.f15673v;
                boolean z14 = false;
                switch (i6) {
                    case 0:
                        int i10 = d.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity2 = this$0.getActivity();
                        if (activity2 != null && (intent2 = activity2.getIntent()) != null && intent2.hasExtra("source")) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            List<? extends HashMap<?, ?>> list2 = this$0.f15684z;
                            if (list2 != null) {
                                screenResult10Model = d.M(list2);
                            } else {
                                screenResult10Model = null;
                            }
                            if (screenResult10Model != null) {
                                Calendar calendar = Calendar.getInstance();
                                Calendar calendar2 = Calendar.getInstance();
                                List<? extends HashMap<?, ?>> list3 = this$0.f15684z;
                                kotlin.jvm.internal.i.d(list3);
                                ScreenResult10Model M2 = d.M(list3);
                                if (M2 != null) {
                                    j10 = M2.getDate() * 1000;
                                } else {
                                    j10 = 0;
                                }
                                calendar2.setTimeInMillis(j10);
                                calendar2.set(6, calendar.get(6));
                                calendar2.set(1, calendar.get(1));
                                calendar2.set(2, calendar.get(2));
                                long timeInMillis = (calendar.getTimeInMillis() - calendar2.getTimeInMillis()) / 60000;
                                if (timeInMillis >= 0) {
                                    if (0 <= timeInMillis && timeInMillis < 31) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        z12 = true;
                                        if (!z12) {
                                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyHeader1)).setText("You were worried about");
                                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyHeader1)).setVisibility(0);
                                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyGoalInfo)).setVisibility(8);
                                            RobertoTextView robertoTextView = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyDescription);
                                            List<? extends HashMap<?, ?>> list4 = this$0.f15684z;
                                            if (list4 != null) {
                                                ScreenResult10Model M3 = d.M(list4);
                                                if (M3 != null) {
                                                    str = M3.getText();
                                                    break;
                                                } else {
                                                    str = null;
                                                    break;
                                                }
                                            }
                                            str = "";
                                            robertoTextView.setText(str);
                                            ((RobertoButton) this$0._$_findCachedViewById(R.id.btnNotifyButton)).setVisibility(0);
                                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyHeader2)).setVisibility(0);
                                            ((ViewPager) this$0._$_findCachedViewById(R.id.viewPager)).setVisibility(0);
                                            ((LinearLayout) this$0._$_findCachedViewById(R.id.layoutDots)).setVisibility(0);
                                            this$0.f15681w = !this$0.f15681w;
                                            this$0.K();
                                            return;
                                        }
                                        Utils.INSTANCE.showCustomToast(this$0.requireActivity(), "You can only start worrying during worry time.");
                                        return;
                                    }
                                }
                            }
                            z12 = false;
                            if (!z12) {
                            }
                        } else {
                            ((RobertoButton) this$0._$_findCachedViewById(R.id.btnNotifyButton)).setVisibility(0);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyHeader2)).setVisibility(0);
                            ((ViewPager) this$0._$_findCachedViewById(R.id.viewPager)).setVisibility(0);
                            ((LinearLayout) this$0._$_findCachedViewById(R.id.layoutDots)).setVisibility(0);
                            this$0.f15681w = !this$0.f15681w;
                            this$0.K();
                            return;
                        }
                        break;
                    case 1:
                        int i11 = d.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyDescription)).setMaxLines(25);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyReadMore)).setVisibility(8);
                        return;
                    case 2:
                        int i12 = d.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity3 = this$0.getActivity();
                        if (activity3 != null && (intent3 = activity3.getIntent()) != null && intent3.hasExtra("source")) {
                            z14 = true;
                        }
                        if (z14) {
                            androidx.fragment.app.p activity4 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity4).n0();
                            return;
                        }
                        androidx.fragment.app.p activity5 = this$0.getActivity();
                        if (activity5 != null) {
                            activity5.finish();
                            return;
                        }
                        return;
                    default:
                        int i13 = d.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity6 = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                        ((rr.a) activity6).finish();
                        return;
                }
            }
        });
        AppCompatImageView img_secs_tens = (AppCompatImageView) _$_findCachedViewById(R.id.img_secs_tens);
        kotlin.jvm.internal.i.f(img_secs_tens, "img_secs_tens");
        img_secs_tens.setImageResource(R.drawable.asl_pathmorph_digits);
        AppCompatImageView img_secs_units = (AppCompatImageView) _$_findCachedViewById(R.id.img_secs_units);
        kotlin.jvm.internal.i.f(img_secs_units, "img_secs_units");
        img_secs_units.setImageResource(R.drawable.asl_pathmorph_digits);
        AppCompatImageView img_mins_tens = (AppCompatImageView) _$_findCachedViewById(R.id.img_mins_tens);
        kotlin.jvm.internal.i.f(img_mins_tens, "img_mins_tens");
        img_mins_tens.setImageResource(R.drawable.asl_pathmorph_digits);
        AppCompatImageView img_mins_units = (AppCompatImageView) _$_findCachedViewById(R.id.img_mins_units);
        kotlin.jvm.internal.i.f(img_mins_units, "img_mins_units");
        img_mins_units.setImageResource(R.drawable.asl_pathmorph_digits);
        ((RobertoTextView) _$_findCachedViewById(R.id.tvNotifyDescription)).post(new nn.f(this, 4, arrayList));
        ((RobertoTextView) _$_findCachedViewById(R.id.tvNotifyReadMore)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.c

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ d f15673v;

            {
                this.f15673v = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:58:0x0133, code lost:
                if (r11 != null) goto L53;
             */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x016b  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(View view) {
                boolean z11;
                ScreenResult10Model screenResult10Model;
                boolean z12;
                String str;
                long j10;
                boolean z13;
                Intent intent2;
                Intent intent3;
                int i6 = r2;
                d this$0 = this.f15673v;
                boolean z14 = false;
                switch (i6) {
                    case 0:
                        int i10 = d.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity2 = this$0.getActivity();
                        if (activity2 != null && (intent2 = activity2.getIntent()) != null && intent2.hasExtra("source")) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            List<? extends HashMap<?, ?>> list2 = this$0.f15684z;
                            if (list2 != null) {
                                screenResult10Model = d.M(list2);
                            } else {
                                screenResult10Model = null;
                            }
                            if (screenResult10Model != null) {
                                Calendar calendar = Calendar.getInstance();
                                Calendar calendar2 = Calendar.getInstance();
                                List<? extends HashMap<?, ?>> list3 = this$0.f15684z;
                                kotlin.jvm.internal.i.d(list3);
                                ScreenResult10Model M2 = d.M(list3);
                                if (M2 != null) {
                                    j10 = M2.getDate() * 1000;
                                } else {
                                    j10 = 0;
                                }
                                calendar2.setTimeInMillis(j10);
                                calendar2.set(6, calendar.get(6));
                                calendar2.set(1, calendar.get(1));
                                calendar2.set(2, calendar.get(2));
                                long timeInMillis = (calendar.getTimeInMillis() - calendar2.getTimeInMillis()) / 60000;
                                if (timeInMillis >= 0) {
                                    if (0 <= timeInMillis && timeInMillis < 31) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        z12 = true;
                                        if (!z12) {
                                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyHeader1)).setText("You were worried about");
                                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyHeader1)).setVisibility(0);
                                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyGoalInfo)).setVisibility(8);
                                            RobertoTextView robertoTextView = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyDescription);
                                            List<? extends HashMap<?, ?>> list4 = this$0.f15684z;
                                            if (list4 != null) {
                                                ScreenResult10Model M3 = d.M(list4);
                                                if (M3 != null) {
                                                    str = M3.getText();
                                                    break;
                                                } else {
                                                    str = null;
                                                    break;
                                                }
                                            }
                                            str = "";
                                            robertoTextView.setText(str);
                                            ((RobertoButton) this$0._$_findCachedViewById(R.id.btnNotifyButton)).setVisibility(0);
                                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyHeader2)).setVisibility(0);
                                            ((ViewPager) this$0._$_findCachedViewById(R.id.viewPager)).setVisibility(0);
                                            ((LinearLayout) this$0._$_findCachedViewById(R.id.layoutDots)).setVisibility(0);
                                            this$0.f15681w = !this$0.f15681w;
                                            this$0.K();
                                            return;
                                        }
                                        Utils.INSTANCE.showCustomToast(this$0.requireActivity(), "You can only start worrying during worry time.");
                                        return;
                                    }
                                }
                            }
                            z12 = false;
                            if (!z12) {
                            }
                        } else {
                            ((RobertoButton) this$0._$_findCachedViewById(R.id.btnNotifyButton)).setVisibility(0);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyHeader2)).setVisibility(0);
                            ((ViewPager) this$0._$_findCachedViewById(R.id.viewPager)).setVisibility(0);
                            ((LinearLayout) this$0._$_findCachedViewById(R.id.layoutDots)).setVisibility(0);
                            this$0.f15681w = !this$0.f15681w;
                            this$0.K();
                            return;
                        }
                        break;
                    case 1:
                        int i11 = d.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyDescription)).setMaxLines(25);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyReadMore)).setVisibility(8);
                        return;
                    case 2:
                        int i12 = d.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity3 = this$0.getActivity();
                        if (activity3 != null && (intent3 = activity3.getIntent()) != null && intent3.hasExtra("source")) {
                            z14 = true;
                        }
                        if (z14) {
                            androidx.fragment.app.p activity4 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity4).n0();
                            return;
                        }
                        androidx.fragment.app.p activity5 = this$0.getActivity();
                        if (activity5 != null) {
                            activity5.finish();
                            return;
                        }
                        return;
                    default:
                        int i13 = d.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity6 = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                        ((rr.a) activity6).finish();
                        return;
                }
            }
        });
        Q();
        ((RobertoButton) _$_findCachedViewById(R.id.btnNotifyButton)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.c

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ d f15673v;

            {
                this.f15673v = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:58:0x0133, code lost:
                if (r11 != null) goto L53;
             */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x016b  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(View view) {
                boolean z11;
                ScreenResult10Model screenResult10Model;
                boolean z12;
                String str;
                long j10;
                boolean z13;
                Intent intent2;
                Intent intent3;
                int i6 = r2;
                d this$0 = this.f15673v;
                boolean z14 = false;
                switch (i6) {
                    case 0:
                        int i10 = d.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity2 = this$0.getActivity();
                        if (activity2 != null && (intent2 = activity2.getIntent()) != null && intent2.hasExtra("source")) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            List<? extends HashMap<?, ?>> list2 = this$0.f15684z;
                            if (list2 != null) {
                                screenResult10Model = d.M(list2);
                            } else {
                                screenResult10Model = null;
                            }
                            if (screenResult10Model != null) {
                                Calendar calendar = Calendar.getInstance();
                                Calendar calendar2 = Calendar.getInstance();
                                List<? extends HashMap<?, ?>> list3 = this$0.f15684z;
                                kotlin.jvm.internal.i.d(list3);
                                ScreenResult10Model M2 = d.M(list3);
                                if (M2 != null) {
                                    j10 = M2.getDate() * 1000;
                                } else {
                                    j10 = 0;
                                }
                                calendar2.setTimeInMillis(j10);
                                calendar2.set(6, calendar.get(6));
                                calendar2.set(1, calendar.get(1));
                                calendar2.set(2, calendar.get(2));
                                long timeInMillis = (calendar.getTimeInMillis() - calendar2.getTimeInMillis()) / 60000;
                                if (timeInMillis >= 0) {
                                    if (0 <= timeInMillis && timeInMillis < 31) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        z12 = true;
                                        if (!z12) {
                                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyHeader1)).setText("You were worried about");
                                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyHeader1)).setVisibility(0);
                                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyGoalInfo)).setVisibility(8);
                                            RobertoTextView robertoTextView = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyDescription);
                                            List<? extends HashMap<?, ?>> list4 = this$0.f15684z;
                                            if (list4 != null) {
                                                ScreenResult10Model M3 = d.M(list4);
                                                if (M3 != null) {
                                                    str = M3.getText();
                                                    break;
                                                } else {
                                                    str = null;
                                                    break;
                                                }
                                            }
                                            str = "";
                                            robertoTextView.setText(str);
                                            ((RobertoButton) this$0._$_findCachedViewById(R.id.btnNotifyButton)).setVisibility(0);
                                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyHeader2)).setVisibility(0);
                                            ((ViewPager) this$0._$_findCachedViewById(R.id.viewPager)).setVisibility(0);
                                            ((LinearLayout) this$0._$_findCachedViewById(R.id.layoutDots)).setVisibility(0);
                                            this$0.f15681w = !this$0.f15681w;
                                            this$0.K();
                                            return;
                                        }
                                        Utils.INSTANCE.showCustomToast(this$0.requireActivity(), "You can only start worrying during worry time.");
                                        return;
                                    }
                                }
                            }
                            z12 = false;
                            if (!z12) {
                            }
                        } else {
                            ((RobertoButton) this$0._$_findCachedViewById(R.id.btnNotifyButton)).setVisibility(0);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyHeader2)).setVisibility(0);
                            ((ViewPager) this$0._$_findCachedViewById(R.id.viewPager)).setVisibility(0);
                            ((LinearLayout) this$0._$_findCachedViewById(R.id.layoutDots)).setVisibility(0);
                            this$0.f15681w = !this$0.f15681w;
                            this$0.K();
                            return;
                        }
                        break;
                    case 1:
                        int i11 = d.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyDescription)).setMaxLines(25);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyReadMore)).setVisibility(8);
                        return;
                    case 2:
                        int i12 = d.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity3 = this$0.getActivity();
                        if (activity3 != null && (intent3 = activity3.getIntent()) != null && intent3.hasExtra("source")) {
                            z14 = true;
                        }
                        if (z14) {
                            androidx.fragment.app.p activity4 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity4).n0();
                            return;
                        }
                        androidx.fragment.app.p activity5 = this$0.getActivity();
                        if (activity5 != null) {
                            activity5.finish();
                            return;
                        }
                        return;
                    default:
                        int i13 = d.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity6 = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                        ((rr.a) activity6).finish();
                        return;
                }
            }
        });
        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.c

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ d f15673v;

            {
                this.f15673v = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:58:0x0133, code lost:
                if (r11 != null) goto L53;
             */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x016b  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(View view) {
                boolean z11;
                ScreenResult10Model screenResult10Model;
                boolean z12;
                String str;
                long j10;
                boolean z13;
                Intent intent2;
                Intent intent3;
                int i6 = r2;
                d this$0 = this.f15673v;
                boolean z14 = false;
                switch (i6) {
                    case 0:
                        int i10 = d.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity2 = this$0.getActivity();
                        if (activity2 != null && (intent2 = activity2.getIntent()) != null && intent2.hasExtra("source")) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            List<? extends HashMap<?, ?>> list2 = this$0.f15684z;
                            if (list2 != null) {
                                screenResult10Model = d.M(list2);
                            } else {
                                screenResult10Model = null;
                            }
                            if (screenResult10Model != null) {
                                Calendar calendar = Calendar.getInstance();
                                Calendar calendar2 = Calendar.getInstance();
                                List<? extends HashMap<?, ?>> list3 = this$0.f15684z;
                                kotlin.jvm.internal.i.d(list3);
                                ScreenResult10Model M2 = d.M(list3);
                                if (M2 != null) {
                                    j10 = M2.getDate() * 1000;
                                } else {
                                    j10 = 0;
                                }
                                calendar2.setTimeInMillis(j10);
                                calendar2.set(6, calendar.get(6));
                                calendar2.set(1, calendar.get(1));
                                calendar2.set(2, calendar.get(2));
                                long timeInMillis = (calendar.getTimeInMillis() - calendar2.getTimeInMillis()) / 60000;
                                if (timeInMillis >= 0) {
                                    if (0 <= timeInMillis && timeInMillis < 31) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        z12 = true;
                                        if (!z12) {
                                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyHeader1)).setText("You were worried about");
                                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyHeader1)).setVisibility(0);
                                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyGoalInfo)).setVisibility(8);
                                            RobertoTextView robertoTextView = (RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyDescription);
                                            List<? extends HashMap<?, ?>> list4 = this$0.f15684z;
                                            if (list4 != null) {
                                                ScreenResult10Model M3 = d.M(list4);
                                                if (M3 != null) {
                                                    str = M3.getText();
                                                    break;
                                                } else {
                                                    str = null;
                                                    break;
                                                }
                                            }
                                            str = "";
                                            robertoTextView.setText(str);
                                            ((RobertoButton) this$0._$_findCachedViewById(R.id.btnNotifyButton)).setVisibility(0);
                                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyHeader2)).setVisibility(0);
                                            ((ViewPager) this$0._$_findCachedViewById(R.id.viewPager)).setVisibility(0);
                                            ((LinearLayout) this$0._$_findCachedViewById(R.id.layoutDots)).setVisibility(0);
                                            this$0.f15681w = !this$0.f15681w;
                                            this$0.K();
                                            return;
                                        }
                                        Utils.INSTANCE.showCustomToast(this$0.requireActivity(), "You can only start worrying during worry time.");
                                        return;
                                    }
                                }
                            }
                            z12 = false;
                            if (!z12) {
                            }
                        } else {
                            ((RobertoButton) this$0._$_findCachedViewById(R.id.btnNotifyButton)).setVisibility(0);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyHeader2)).setVisibility(0);
                            ((ViewPager) this$0._$_findCachedViewById(R.id.viewPager)).setVisibility(0);
                            ((LinearLayout) this$0._$_findCachedViewById(R.id.layoutDots)).setVisibility(0);
                            this$0.f15681w = !this$0.f15681w;
                            this$0.K();
                            return;
                        }
                        break;
                    case 1:
                        int i11 = d.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyDescription)).setMaxLines(25);
                        ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvNotifyReadMore)).setVisibility(8);
                        return;
                    case 2:
                        int i12 = d.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity3 = this$0.getActivity();
                        if (activity3 != null && (intent3 = activity3.getIntent()) != null && intent3.hasExtra("source")) {
                            z14 = true;
                        }
                        if (z14) {
                            androidx.fragment.app.p activity4 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                            ((rr.a) activity4).n0();
                            return;
                        }
                        androidx.fragment.app.p activity5 = this$0.getActivity();
                        if (activity5 != null) {
                            activity5.finish();
                            return;
                        }
                        return;
                    default:
                        int i13 = d.C;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity6 = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                        ((rr.a) activity6).finish();
                        return;
                }
            }
        });
    }

    public final void Q() {
        try {
            if (isAdded()) {
                long j10 = (this.f15682x / 1000) % 60;
                AppCompatImageView img_secs_units = (AppCompatImageView) _$_findCachedViewById(R.id.img_secs_units);
                kotlin.jvm.internal.i.f(img_secs_units, "img_secs_units");
                long j11 = 10;
                O(img_secs_units, (int) (j10 % j11));
                AppCompatImageView img_secs_tens = (AppCompatImageView) _$_findCachedViewById(R.id.img_secs_tens);
                kotlin.jvm.internal.i.f(img_secs_tens, "img_secs_tens");
                O(img_secs_tens, (int) (j10 / j11));
                long j12 = this.f15682x / 60000;
                AppCompatImageView img_mins_units = (AppCompatImageView) _$_findCachedViewById(R.id.img_mins_units);
                kotlin.jvm.internal.i.f(img_mins_units, "img_mins_units");
                O(img_mins_units, (int) (j12 % j11));
                AppCompatImageView img_mins_tens = (AppCompatImageView) _$_findCachedViewById(R.id.img_mins_tens);
                kotlin.jvm.internal.i.f(img_mins_tens, "img_mins_tens");
                O(img_mins_tens, (int) (j12 / j11));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15679u, "exception in update time", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.B;
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
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (sp.b.K()) {
            androidx.fragment.app.p requireActivity = requireActivity();
            kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
            fm.a aVar = (fm.a) new androidx.lifecycle.o0(requireActivity, new kk.c(MyApplication.V.a(), new fm.j0())).a(fm.a.class);
            this.f15683y = aVar;
            if (aVar != null) {
                aVar.n("wRiML8ebB1zu56mdNwmN");
            } else {
                kotlin.jvm.internal.i.q("fireStoreGoalsViewModel");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_static_notify21, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.B.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        if (sp.b.K()) {
            fm.a aVar = this.f15683y;
            if (aVar != null) {
                aVar.f15180n0.e(getViewLifecycleOwner(), new pp.b(5, new c()));
                return;
            } else {
                kotlin.jvm.internal.i.q("fireStoreGoalsViewModel");
                throw null;
            }
        }
        P();
    }

    /* compiled from: StaticNotify21Fragment.kt */
    /* loaded from: classes2.dex */
    public final class b implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        public final int f15687a;

        public b(int i6) {
            this.f15687a = i6;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i6) {
            int i10 = d.C;
            d.this.J(i6, this.f15687a);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i6) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(float f, int i6) {
        }
    }
}
