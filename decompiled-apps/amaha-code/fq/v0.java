package fq;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.T6Activity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.NotificationUtil;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: StaticS41Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/v0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class v0 extends rr.b {
    public static final /* synthetic */ int D = 0;
    public T6Activity A;

    /* renamed from: w  reason: collision with root package name */
    public u0 f15813w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f15814x;
    public final LinkedHashMap C = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f15811u = LogHelper.INSTANCE.makeLogTag(v0.class);

    /* renamed from: v  reason: collision with root package name */
    public int f15812v = 8;

    /* renamed from: y  reason: collision with root package name */
    public long f15815y = 1200000;

    /* renamed from: z  reason: collision with root package name */
    public long f15816z = 1200000;
    public final int[] B = {R.attr.state_zero, R.attr.state_one, R.attr.state_two, R.attr.state_three, R.attr.state_four, R.attr.state_five, R.attr.state_six, R.attr.state_seven, R.attr.state_eight, R.attr.state_nine};

    public final void J() {
        try {
            if (this.f15814x) {
                u0 u0Var = new u0(this, this.f15815y);
                this.f15813w = u0Var;
                u0Var.start();
                ((AppCompatImageView) _$_findCachedViewById(R.id.img_play_pause)).setImageResource(R.drawable.anim_play_to_pause);
            } else {
                u0 u0Var2 = this.f15813w;
                kotlin.jvm.internal.i.d(u0Var2);
                u0Var2.cancel();
                ((AppCompatImageView) _$_findCachedViewById(R.id.img_play_pause)).setImageResource(R.drawable.anim_pause_to_play);
            }
            if (((AppCompatImageView) _$_findCachedViewById(R.id.img_play_pause)).getDrawable() instanceof Animatable) {
                Drawable drawable = ((AppCompatImageView) _$_findCachedViewById(R.id.img_play_pause)).getDrawable();
                kotlin.jvm.internal.i.e(drawable, "null cannot be cast to non-null type android.graphics.drawable.Animatable");
                ((Animatable) drawable).start();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15811u, "exception in change count down state", e10);
        }
    }

    public final void K(AppCompatImageView appCompatImageView) {
        appCompatImageView.setImageResource(R.drawable.asl_pathmorph_digits);
        appCompatImageView.setOnClickListener(new t0(this, 4));
    }

    public final void M(AppCompatImageView appCompatImageView, int i6) {
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
            LogHelper.INSTANCE.e(this.f15811u, "exception in set state", e10);
        }
    }

    public final void O() {
        try {
            if (this.f15812v % 2 == 0) {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS41HelpLabel)).setText("Focus period");
                ((AppCompatImageView) _$_findCachedViewById(R.id.centerImage)).setImageResource(R.drawable.ic_work_black_24dp);
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.tvS41HelpLabel)).setText("Break period");
                ((AppCompatImageView) _$_findCachedViewById(R.id.centerImage)).setImageResource(R.drawable.ic_free_breakfast_black_24dp);
            }
        } catch (Exception unused) {
            LogHelper.INSTANCE.e(this.f15811u, "exception in setting tint");
        }
    }

    public final void P() {
        try {
            long j10 = (this.f15815y / 1000) % 60;
            AppCompatImageView img_secs_units = (AppCompatImageView) _$_findCachedViewById(R.id.img_secs_units);
            kotlin.jvm.internal.i.f(img_secs_units, "img_secs_units");
            long j11 = 10;
            M(img_secs_units, (int) (j10 % j11));
            AppCompatImageView img_secs_tens = (AppCompatImageView) _$_findCachedViewById(R.id.img_secs_tens);
            kotlin.jvm.internal.i.f(img_secs_tens, "img_secs_tens");
            M(img_secs_tens, (int) (j10 / j11));
            long j12 = this.f15815y / 60000;
            AppCompatImageView img_mins_units = (AppCompatImageView) _$_findCachedViewById(R.id.img_mins_units);
            kotlin.jvm.internal.i.f(img_mins_units, "img_mins_units");
            M(img_mins_units, (int) (j12 % j11));
            AppCompatImageView img_mins_tens = (AppCompatImageView) _$_findCachedViewById(R.id.img_mins_tens);
            kotlin.jvm.internal.i.f(img_mins_tens, "img_mins_tens");
            M(img_mins_tens, (int) (j12 / j11));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15811u, "exception in update time", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.C;
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
        return inflater.inflate(R.layout.fragment_static_s41, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        boolean z10 = this.f15814x;
        if (z10) {
            this.f15814x = !z10;
            J();
        }
        super.onDestroyView();
        this.C.clear();
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
        ((AppCompatImageView) _$_findCachedViewById(R.id.img_play_pause)).setOnClickListener(new t0(this, 0));
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T6Activity");
        T6Activity t6Activity = (T6Activity) activity;
        this.A = t6Activity;
        if (kotlin.jvm.internal.i.b(t6Activity.C, "s41")) {
            ((RobertoTextView) _$_findCachedViewById(R.id.tvS41HelpLabel)).setText("Focus period");
            ((RobertoButton) _$_findCachedViewById(R.id.btnS41Button)).setText("DONE");
        }
        T6Activity t6Activity2 = this.A;
        if (t6Activity2 != null) {
            if (t6Activity2.B) {
                ((RobertoButton) _$_findCachedViewById(R.id.btnS41Button)).setVisibility(0);
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btnS41Button)).setOnClickListener(new t0(this, 1));
            new NotificationUtil();
            AppCompatImageView img_secs_tens = (AppCompatImageView) _$_findCachedViewById(R.id.img_secs_tens);
            kotlin.jvm.internal.i.f(img_secs_tens, "img_secs_tens");
            K(img_secs_tens);
            AppCompatImageView img_secs_units = (AppCompatImageView) _$_findCachedViewById(R.id.img_secs_units);
            kotlin.jvm.internal.i.f(img_secs_units, "img_secs_units");
            K(img_secs_units);
            AppCompatImageView img_mins_tens = (AppCompatImageView) _$_findCachedViewById(R.id.img_mins_tens);
            kotlin.jvm.internal.i.f(img_mins_tens, "img_mins_tens");
            K(img_mins_tens);
            AppCompatImageView img_mins_units = (AppCompatImageView) _$_findCachedViewById(R.id.img_mins_units);
            kotlin.jvm.internal.i.f(img_mins_units, "img_mins_units");
            K(img_mins_units);
            O();
            P();
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setOnClickListener(new t0(this, 2));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new t0(this, 3));
            return;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }
}
