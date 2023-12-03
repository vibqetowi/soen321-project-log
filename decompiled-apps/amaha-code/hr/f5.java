package hr;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewpager.widget.ViewPager;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.NotificationUtil;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS125Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lhr/f5;", "Lrr/b;", "<init>", "()V", "a", Constants.ONBOARDING_VARIANT, "c", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class f5 extends rr.b {
    public static final /* synthetic */ int E = 0;
    public c C;

    /* renamed from: v  reason: collision with root package name */
    public g5 f18372v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f18373w;

    /* renamed from: y  reason: collision with root package name */
    public NotificationUtil f18375y;
    public final LinkedHashMap D = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18371u = LogHelper.INSTANCE.makeLogTag(f5.class);

    /* renamed from: x  reason: collision with root package name */
    public long f18374x = 120000;

    /* renamed from: z  reason: collision with root package name */
    public final int f18376z = 4352;
    public final int[] A = {R.attr.state_zero, R.attr.state_one, R.attr.state_two, R.attr.state_three, R.attr.state_four, R.attr.state_five, R.attr.state_six, R.attr.state_seven, R.attr.state_eight, R.attr.state_nine};
    public final Handler B = new Handler();

    /* compiled from: ScreenS125Fragment.kt */
    /* loaded from: classes2.dex */
    public final class a extends k2.a {

        /* renamed from: c  reason: collision with root package name */
        public final Context f18377c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList<String> f18378d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ f5 f18379e;

        public a(f5 f5Var, androidx.fragment.app.p pVar, ArrayList tipsList) {
            kotlin.jvm.internal.i.g(tipsList, "tipsList");
            this.f18379e = f5Var;
            this.f18377c = pVar;
            this.f18378d = new ArrayList<>();
            this.f18378d = tipsList;
        }

        @Override // k2.a
        public final void e(ViewGroup collection, int i6, Object view) {
            kotlin.jvm.internal.i.g(collection, "collection");
            kotlin.jvm.internal.i.g(view, "view");
            collection.removeView((View) view);
        }

        @Override // k2.a
        public final int g() {
            return this.f18378d.size();
        }

        @Override // k2.a
        public final CharSequence h() {
            return "";
        }

        @Override // k2.a
        public final Object i(int i6, ViewGroup collection) {
            kotlin.jvm.internal.i.g(collection, "collection");
            View inflate = LayoutInflater.from(this.f18377c).inflate(R.layout.row_relaxation_activity_pager, collection, false);
            kotlin.jvm.internal.i.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) inflate;
            View findViewById = viewGroup.findViewById(R.id.activityTips);
            kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
            RobertoTextView robertoTextView = (RobertoTextView) findViewById;
            robertoTextView.setText(this.f18378d.get(i6));
            robertoTextView.setTextColor(g0.a.b(this.f18379e.requireContext(), R.color.title_high_contrast));
            collection.addView(viewGroup);
            return viewGroup;
        }

        @Override // k2.a
        public final boolean j(View view, Object temp) {
            kotlin.jvm.internal.i.g(view, "view");
            kotlin.jvm.internal.i.g(temp, "temp");
            if (view == temp) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: ScreenS125Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class c implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final String f18382u;

        /* renamed from: v  reason: collision with root package name */
        public final WeakReference<ViewPager> f18383v;

        /* renamed from: w  reason: collision with root package name */
        public final WeakReference<Handler> f18384w;

        public c(ViewPager viewPager, Handler handler) {
            kotlin.jvm.internal.i.g(handler, "handler");
            this.f18382u = LogHelper.INSTANCE.makeLogTag(c.class);
            this.f18383v = new WeakReference<>(viewPager);
            this.f18384w = new WeakReference<>(handler);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003f A[Catch: Exception -> 0x0045, TRY_LEAVE, TryCatch #0 {Exception -> 0x0045, blocks: (B:2:0x0000, B:4:0x000a, B:6:0x0011, B:11:0x0029, B:13:0x0035, B:15:0x003f, B:12:0x002d), top: B:20:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            Handler handler;
            boolean z10;
            try {
                ViewPager viewPager = this.f18383v.get();
                if (viewPager != null) {
                    if (viewPager.getAdapter() != null) {
                        int currentItem = viewPager.getCurrentItem();
                        k2.a adapter = viewPager.getAdapter();
                        kotlin.jvm.internal.i.d(adapter);
                        if (currentItem == adapter.g() - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            viewPager.v(0);
                            handler = this.f18384w.get();
                            if (handler == null) {
                                handler.postDelayed(this, 5000L);
                                return;
                            }
                            return;
                        }
                    }
                    viewPager.v(viewPager.getCurrentItem() + 1);
                    handler = this.f18384w.get();
                    if (handler == null) {
                    }
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f18382u, "exception", e10);
            }
        }
    }

    public final void J(int i6, int i10) {
        try {
            Utils utils = Utils.INSTANCE;
            Context requireContext = requireContext();
            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
            int checkBuildBeforesetColor = utils.checkBuildBeforesetColor(R.color.taupeGray, requireContext);
            Context requireContext2 = requireContext();
            kotlin.jvm.internal.i.f(requireContext2, "requireContext()");
            int checkBuildBeforesetColor2 = utils.checkBuildBeforesetColor(R.color.gray_background, requireContext2);
            ((LinearLayout) _$_findCachedViewById(R.id.dotsLayout)).removeAllViews();
            for (int i11 = 0; i11 < i10; i11++) {
                TextView textView = new TextView(getContext());
                textView.setText(UtilFunKt.fromHtml("&#x25cf;"));
                textView.setPadding(0, 0, 6, 0);
                textView.setTextSize(2, (int) getResources().getDimension(R.dimen.dotslayout_dots));
                textView.setTextColor(checkBuildBeforesetColor2);
                if (i11 == i6) {
                    textView.setTextColor(checkBuildBeforesetColor);
                    textView.setAlpha(0.8f);
                    textView.setPadding(0, 0, 6, 0);
                }
                ((LinearLayout) _$_findCachedViewById(R.id.dotsLayout)).addView(textView);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18371u, e10);
        }
    }

    public final void K(AppCompatImageView appCompatImageView, int i6) {
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
            LogHelper.INSTANCE.e(this.f18371u, "exception in set state", e10);
        }
    }

    public final void M() {
        try {
            long j10 = (this.f18374x / 1000) % 60;
            if (((AppCompatImageView) _$_findCachedViewById(R.id.img_secs_units)) != null) {
                AppCompatImageView img_secs_units = (AppCompatImageView) _$_findCachedViewById(R.id.img_secs_units);
                kotlin.jvm.internal.i.f(img_secs_units, "img_secs_units");
                K(img_secs_units, (int) (j10 % 10));
            }
            if (((AppCompatImageView) _$_findCachedViewById(R.id.img_secs_tens)) != null) {
                AppCompatImageView img_secs_tens = (AppCompatImageView) _$_findCachedViewById(R.id.img_secs_tens);
                kotlin.jvm.internal.i.f(img_secs_tens, "img_secs_tens");
                K(img_secs_tens, (int) (j10 / 10));
            }
            long j11 = this.f18374x / 60000;
            if (((AppCompatImageView) _$_findCachedViewById(R.id.img_mins_units)) != null) {
                AppCompatImageView img_mins_units = (AppCompatImageView) _$_findCachedViewById(R.id.img_mins_units);
                kotlin.jvm.internal.i.f(img_mins_units, "img_mins_units");
                K(img_mins_units, (int) (j11 % 10));
            }
            if (((AppCompatImageView) _$_findCachedViewById(R.id.img_mins_tens)) != null) {
                AppCompatImageView img_mins_tens = (AppCompatImageView) _$_findCachedViewById(R.id.img_mins_tens);
                kotlin.jvm.internal.i.f(img_mins_tens, "img_mins_tens");
                K(img_mins_tens, (int) (j11 / 10));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18371u, "exception in update time", e10);
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
        return inflater.inflate(R.layout.fragment_screen_s125, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        NotificationUtil notificationUtil = this.f18375y;
        if (notificationUtil != null) {
            androidx.fragment.app.p requireActivity = requireActivity();
            kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
            notificationUtil.cancelNotification(requireActivity, this.f18376z);
        }
        super.onDestroyView();
        this.D.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        if (this.C != null) {
            this.B.removeCallbacksAndMessages(null);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        NotificationUtil notificationUtil = this.f18375y;
        if (notificationUtil != null) {
            androidx.fragment.app.p requireActivity = requireActivity();
            kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
            notificationUtil.cancelNotification(requireActivity, this.f18376z);
        }
        c cVar = this.C;
        if (cVar != null) {
            this.B.postDelayed(cVar, 5000L);
        }
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String paramsMapToString;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        TemplateActivity templateActivity = (TemplateActivity) activity;
        if (templateActivity.J && templateActivity.getIntent().hasExtra("source") && r1.b0.c(templateActivity, "source", "goals")) {
            templateActivity.onBackPressed();
            return;
        }
        HashMap<String, Object> A0 = templateActivity.A0();
        ViewPager viewpager = (ViewPager) _$_findCachedViewById(R.id.viewpager);
        kotlin.jvm.internal.i.f(viewpager, "viewpager");
        this.C = new c(viewpager, this.B);
        String B0 = templateActivity.B0();
        if (kotlin.jvm.internal.i.b(B0, "s125")) {
            ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText(UtilFunKt.paramsMapToString(A0.get("s125_strategy_title")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS125Button)).setText(UtilFunKt.paramsMapToString(A0.get("s125_btn_text")));
        } else if (kotlin.jvm.internal.i.b(B0, "s146")) {
            ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setVisibility(8);
            RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.btnS125Button);
            if (templateActivity.getIntent().hasExtra("source") && r1.b0.c(templateActivity, "source", "goals")) {
                paramsMapToString = "FINISH";
            } else {
                paramsMapToString = UtilFunKt.paramsMapToString(A0.get("s146_help_btn_text"));
            }
            robertoButton.setText(paramsMapToString);
            this.f18374x = 60000L;
        }
        ((RobertoButton) _$_findCachedViewById(R.id.btnS125Button)).setOnClickListener(new sq.p(templateActivity, 16, this));
        ((AppCompatImageView) _$_findCachedViewById(R.id.img_play_pause)).setOnClickListener(new z0(this, 18));
        this.f18375y = new NotificationUtil();
        if (!templateActivity.getIntent().hasExtra("source") || !r1.b0.c(templateActivity, "source", "goals")) {
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setImageResource(R.drawable.ic_arrow_back);
        }
        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new i4(templateActivity, 9));
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
        M();
        if (kotlin.jvm.internal.i.b(templateActivity.B0(), "s125")) {
            ArrayList<String> paramsMapToList = UtilFunKt.paramsMapToList(A0.get("s125_strategy_list"));
            androidx.fragment.app.p requireActivity = requireActivity();
            kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
            ((ViewPager) _$_findCachedViewById(R.id.viewpager)).setAdapter(new a(this, requireActivity, paramsMapToList));
            ((ViewPager) _$_findCachedViewById(R.id.viewpager)).b(new b(paramsMapToList.size()));
            J(0, paramsMapToList.size());
            return;
        }
        ((ViewPager) _$_findCachedViewById(R.id.viewpager)).setVisibility(8);
        ((LinearLayout) _$_findCachedViewById(R.id.dotsLayout)).setVisibility(8);
    }

    /* compiled from: ScreenS125Fragment.kt */
    /* loaded from: classes2.dex */
    public final class b implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        public final int f18380a;

        public b(int i6) {
            this.f18380a = i6;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i6) {
            int i10 = f5.E;
            f5.this.J(i6, this.f18380a);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i6) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(float f, int i6) {
        }
    }
}
