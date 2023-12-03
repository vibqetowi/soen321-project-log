package fq;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewpager.widget.ViewPager;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TAActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.NotificationUtil;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: StaticS125Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/z;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class z extends rr.b {
    public static final /* synthetic */ int A = 0;

    /* renamed from: v  reason: collision with root package name */
    public y f15834v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f15835w;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f15838z = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f15833u = LogHelper.INSTANCE.makeLogTag(z.class);

    /* renamed from: x  reason: collision with root package name */
    public long f15836x = 120000;

    /* renamed from: y  reason: collision with root package name */
    public final int[] f15837y = {R.attr.state_zero, R.attr.state_one, R.attr.state_two, R.attr.state_three, R.attr.state_four, R.attr.state_five, R.attr.state_six, R.attr.state_seven, R.attr.state_eight, R.attr.state_nine};

    public final void J(AppCompatImageView appCompatImageView, int i6) {
        int[] iArr = this.f15837y;
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
            LogHelper.INSTANCE.e(this.f15833u, "exception in set state", e10);
        }
    }

    public final void K() {
        try {
            if (isAdded()) {
                long j10 = (this.f15836x / 1000) % 60;
                AppCompatImageView img_secs_units = (AppCompatImageView) _$_findCachedViewById(R.id.img_secs_units);
                kotlin.jvm.internal.i.f(img_secs_units, "img_secs_units");
                long j11 = 10;
                J(img_secs_units, (int) (j10 % j11));
                AppCompatImageView img_secs_tens = (AppCompatImageView) _$_findCachedViewById(R.id.img_secs_tens);
                kotlin.jvm.internal.i.f(img_secs_tens, "img_secs_tens");
                J(img_secs_tens, (int) (j10 / j11));
                long j12 = this.f15836x / 60000;
                AppCompatImageView img_mins_units = (AppCompatImageView) _$_findCachedViewById(R.id.img_mins_units);
                kotlin.jvm.internal.i.f(img_mins_units, "img_mins_units");
                J(img_mins_units, (int) (j12 % j11));
                AppCompatImageView img_mins_tens = (AppCompatImageView) _$_findCachedViewById(R.id.img_mins_tens);
                kotlin.jvm.internal.i.f(img_mins_tens, "img_mins_tens");
                J(img_mins_tens, (int) (j12 / j11));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15833u, "exception in update time", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f15838z;
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
        return inflater.inflate(R.layout.fragment_static_s125, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f15838z.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        if (this.f15836x == 0) {
            ((RobertoButton) _$_findCachedViewById(R.id.btnS125Button)).setVisibility(0);
        }
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TAActivity");
        TAActivity tAActivity = (TAActivity) activity;
        String str = tAActivity.B;
        if (kotlin.jvm.internal.i.b(str, "s125")) {
            ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setText("");
            ((RobertoButton) _$_findCachedViewById(R.id.btnS125Button)).setText("");
        } else if (kotlin.jvm.internal.i.b(str, "s146")) {
            ((RobertoTextView) _$_findCachedViewById(R.id.textView1)).setVisibility(8);
            ((RobertoButton) _$_findCachedViewById(R.id.btnS125Button)).setText("DONE");
            this.f15836x = 60000L;
        }
        ((RobertoButton) _$_findCachedViewById(R.id.btnS125Button)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.w

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ z f15818v;

            {
                this.f15818v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                z this$0 = this.f15818v;
                switch (i6) {
                    case 0:
                        int i10 = z.A;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity2 = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                        ((rr.a) activity2).t0();
                        return;
                    default:
                        int i11 = z.A;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        boolean z10 = !this$0.f15835w;
                        this$0.f15835w = z10;
                        try {
                            if (z10) {
                                y yVar = new y(this$0, this$0.f15836x);
                                this$0.f15834v = yVar;
                                yVar.start();
                                ((AppCompatImageView) this$0._$_findCachedViewById(R.id.img_play_pause)).setImageResource(R.drawable.anim_play_to_pause);
                            } else {
                                y yVar2 = this$0.f15834v;
                                kotlin.jvm.internal.i.d(yVar2);
                                yVar2.cancel();
                                ((AppCompatImageView) this$0._$_findCachedViewById(R.id.img_play_pause)).setImageResource(R.drawable.anim_pause_to_play);
                            }
                            if (((AppCompatImageView) this$0._$_findCachedViewById(R.id.img_play_pause)).getDrawable() instanceof Animatable) {
                                Drawable drawable = ((AppCompatImageView) this$0._$_findCachedViewById(R.id.img_play_pause)).getDrawable();
                                kotlin.jvm.internal.i.e(drawable, "null cannot be cast to non-null type android.graphics.drawable.Animatable");
                                ((Animatable) drawable).start();
                                return;
                            }
                            return;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f15833u, "exception in change count down state", e10);
                            return;
                        }
                }
            }
        });
        ((AppCompatImageView) _$_findCachedViewById(R.id.img_play_pause)).setOnClickListener(new View.OnClickListener(this) { // from class: fq.w

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ z f15818v;

            {
                this.f15818v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                z this$0 = this.f15818v;
                switch (i6) {
                    case 0:
                        int i10 = z.A;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity2 = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                        ((rr.a) activity2).t0();
                        return;
                    default:
                        int i11 = z.A;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        boolean z10 = !this$0.f15835w;
                        this$0.f15835w = z10;
                        try {
                            if (z10) {
                                y yVar = new y(this$0, this$0.f15836x);
                                this$0.f15834v = yVar;
                                yVar.start();
                                ((AppCompatImageView) this$0._$_findCachedViewById(R.id.img_play_pause)).setImageResource(R.drawable.anim_play_to_pause);
                            } else {
                                y yVar2 = this$0.f15834v;
                                kotlin.jvm.internal.i.d(yVar2);
                                yVar2.cancel();
                                ((AppCompatImageView) this$0._$_findCachedViewById(R.id.img_play_pause)).setImageResource(R.drawable.anim_pause_to_play);
                            }
                            if (((AppCompatImageView) this$0._$_findCachedViewById(R.id.img_play_pause)).getDrawable() instanceof Animatable) {
                                Drawable drawable = ((AppCompatImageView) this$0._$_findCachedViewById(R.id.img_play_pause)).getDrawable();
                                kotlin.jvm.internal.i.e(drawable, "null cannot be cast to non-null type android.graphics.drawable.Animatable");
                                ((Animatable) drawable).start();
                                return;
                            }
                            return;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(this$0.f15833u, "exception in change count down state", e10);
                            return;
                        }
                }
            }
        });
        new NotificationUtil();
        ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new x(0, tAActivity));
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
        K();
        if (!kotlin.jvm.internal.i.b(tAActivity.B, "s125")) {
            ((ViewPager) _$_findCachedViewById(R.id.viewpager)).setVisibility(8);
            ((LinearLayout) _$_findCachedViewById(R.id.dotsLayout)).setVisibility(8);
        }
    }
}
