package hr;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.NotificationUtil;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS41Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/w7;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class w7 extends rr.b {
    public static final /* synthetic */ int F = 0;
    public TemplateActivity A;

    /* renamed from: w  reason: collision with root package name */
    public v7 f19354w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f19355x;
    public final LinkedHashMap E = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f19352u = LogHelper.INSTANCE.makeLogTag(w7.class);

    /* renamed from: v  reason: collision with root package name */
    public int f19353v = 8;

    /* renamed from: y  reason: collision with root package name */
    public long f19356y = 1200000;

    /* renamed from: z  reason: collision with root package name */
    public long f19357z = 1200000;
    public final int[] B = {R.attr.state_zero, R.attr.state_one, R.attr.state_two, R.attr.state_three, R.attr.state_four, R.attr.state_five, R.attr.state_six, R.attr.state_seven, R.attr.state_eight, R.attr.state_nine};
    public String C = "";
    public String D = "";

    public final void J() {
        try {
            if (this.f19355x) {
                v7 v7Var = new v7(this, this.f19356y);
                this.f19354w = v7Var;
                v7Var.start();
                ((AppCompatImageView) _$_findCachedViewById(R.id.img_play_pause)).setImageResource(R.drawable.anim_play_to_pause);
            } else {
                v7 v7Var2 = this.f19354w;
                if (v7Var2 != null) {
                    v7Var2.cancel();
                }
                ((AppCompatImageView) _$_findCachedViewById(R.id.img_play_pause)).setImageResource(R.drawable.anim_pause_to_play);
            }
            if (((AppCompatImageView) _$_findCachedViewById(R.id.img_play_pause)).getDrawable() instanceof Animatable) {
                Drawable drawable = ((AppCompatImageView) _$_findCachedViewById(R.id.img_play_pause)).getDrawable();
                kotlin.jvm.internal.i.e(drawable, "null cannot be cast to non-null type android.graphics.drawable.Animatable");
                ((Animatable) drawable).start();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19352u, "exception in change count down state", e10);
        }
    }

    public final TemplateActivity K() {
        TemplateActivity templateActivity = this.A;
        if (templateActivity != null) {
            return templateActivity;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    public final void M(AppCompatImageView appCompatImageView) {
        appCompatImageView.setImageResource(R.drawable.asl_pathmorph_digits);
        appCompatImageView.setOnClickListener(new u7(this, 4));
    }

    public final void O(AppCompatImageView appCompatImageView, int i6) {
        int[] iArr = this.B;
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
            LogHelper.INSTANCE.e(this.f19352u, "exception in set state", e10);
        }
    }

    public final void P() {
        try {
            if (this.f19353v % 2 == 0) {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS41HelpLabel)).setText(UtilFunKt.paramsMapToString(K().A0().get("s41_work_label")));
                ((AppCompatImageView) _$_findCachedViewById(R.id.centerImage)).setImageResource(R.drawable.ic_work_black_24dp);
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS41HelpLabel)).setText(UtilFunKt.paramsMapToString(K().A0().get("s41_break_label")));
                ((AppCompatImageView) _$_findCachedViewById(R.id.centerImage)).setImageResource(R.drawable.ic_free_breakfast_black_24dp);
            }
        } catch (Exception unused) {
            LogHelper.INSTANCE.e(this.f19352u, "exception in setting tint");
        }
    }

    public final void Q() {
        try {
            long j10 = (this.f19356y / 1000) % 60;
            AppCompatImageView img_secs_units = (AppCompatImageView) _$_findCachedViewById(R.id.img_secs_units);
            kotlin.jvm.internal.i.f(img_secs_units, "img_secs_units");
            long j11 = 10;
            O(img_secs_units, (int) (j10 % j11));
            AppCompatImageView img_secs_tens = (AppCompatImageView) _$_findCachedViewById(R.id.img_secs_tens);
            kotlin.jvm.internal.i.f(img_secs_tens, "img_secs_tens");
            O(img_secs_tens, (int) (j10 / j11));
            long j12 = this.f19356y / 60000;
            AppCompatImageView img_mins_units = (AppCompatImageView) _$_findCachedViewById(R.id.img_mins_units);
            kotlin.jvm.internal.i.f(img_mins_units, "img_mins_units");
            O(img_mins_units, (int) (j12 % j11));
            AppCompatImageView img_mins_tens = (AppCompatImageView) _$_findCachedViewById(R.id.img_mins_tens);
            kotlin.jvm.internal.i.f(img_mins_tens, "img_mins_tens");
            O(img_mins_tens, (int) (j12 / j11));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f19352u, "exception in update time", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.E;
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
        return inflater.inflate(R.layout.fragment_screen_s41, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        boolean z10 = this.f19355x;
        if (z10) {
            this.f19355x = !z10;
            J();
        }
        super.onDestroyView();
        this.E.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        ((AppCompatImageView) _$_findCachedViewById(R.id.img_play_pause)).setOnClickListener(new u7(this, 0));
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        this.A = (TemplateActivity) activity;
        HashMap<String, Object> A0 = K().A0();
        if (kotlin.jvm.internal.i.b(K().B0(), "s41")) {
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS41HelpLabel)).setText(UtilFunKt.paramsMapToString(A0.get("s41_work_label")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS41Button)).setText(UtilFunKt.paramsMapToString(A0.get("s41_btn_text")));
            this.C = UtilFunKt.paramsMapToString(A0.get("s41_error_1"));
            this.D = UtilFunKt.paramsMapToString(A0.get("s41_error_2"));
        }
        if (K().J) {
            ((RobertoButton) _$_findCachedViewById(R.id.btnS41Button)).setVisibility(0);
        }
        ((RobertoButton) _$_findCachedViewById(R.id.btnS41Button)).setOnClickListener(new u7(this, 1));
        new NotificationUtil();
        AppCompatImageView img_secs_tens = (AppCompatImageView) _$_findCachedViewById(R.id.img_secs_tens);
        kotlin.jvm.internal.i.f(img_secs_tens, "img_secs_tens");
        M(img_secs_tens);
        AppCompatImageView img_secs_units = (AppCompatImageView) _$_findCachedViewById(R.id.img_secs_units);
        kotlin.jvm.internal.i.f(img_secs_units, "img_secs_units");
        M(img_secs_units);
        AppCompatImageView img_mins_tens = (AppCompatImageView) _$_findCachedViewById(R.id.img_mins_tens);
        kotlin.jvm.internal.i.f(img_mins_tens, "img_mins_tens");
        M(img_mins_tens);
        AppCompatImageView img_mins_units = (AppCompatImageView) _$_findCachedViewById(R.id.img_mins_units);
        kotlin.jvm.internal.i.f(img_mins_units, "img_mins_units");
        M(img_mins_units);
        P();
        Q();
        ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
        ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(0);
        ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setOnClickListener(new u7(this, 2));
        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new u7(this, 3));
    }
}
