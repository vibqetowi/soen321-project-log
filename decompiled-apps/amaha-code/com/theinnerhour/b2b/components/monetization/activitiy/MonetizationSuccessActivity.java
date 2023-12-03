package com.theinnerhour.b2b.components.monetization.activitiy;

import a3.t;
import android.animation.Animator;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import ol.k;
/* compiled from: MonetizationSuccessActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/monetization/activitiy/MonetizationSuccessActivity;", "Lrr/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class MonetizationSuccessActivity extends rr.a {

    /* renamed from: x  reason: collision with root package name */
    public int f11440x;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f11442z = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f11439w = LogHelper.INSTANCE.makeLogTag(MonetizationSuccessActivity.class);

    /* renamed from: y  reason: collision with root package name */
    public final a f11441y = new a();

    /* compiled from: MonetizationSuccessActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            i.g(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            i.g(animation, "animation");
            MonetizationSuccessActivity monetizationSuccessActivity = MonetizationSuccessActivity.this;
            int i6 = monetizationSuccessActivity.f11440x;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 == 3) {
                            ((RobertoButton) monetizationSuccessActivity.u0(R.id.btnContinue)).setVisibility(0);
                            ((RobertoButton) monetizationSuccessActivity.u0(R.id.btnContinue)).setOnClickListener(new k(29, monetizationSuccessActivity));
                            return;
                        }
                        return;
                    }
                    ((RobertoTextView) monetizationSuccessActivity.u0(R.id.bodyText)).setVisibility(0);
                    monetizationSuccessActivity.f11440x = 3;
                    ((RobertoButton) monetizationSuccessActivity.u0(R.id.btnContinue)).animate().alpha(1.0f).setDuration(700L).setListener(this);
                    return;
                }
                ((RobertoTextView) monetizationSuccessActivity.u0(R.id.headerText)).setVisibility(0);
                monetizationSuccessActivity.f11440x = 2;
                ((RobertoTextView) monetizationSuccessActivity.u0(R.id.bodyText)).animate().alpha(1.0f).setDuration(700L).setListener(this);
                return;
            }
            ((RobertoTextView) monetizationSuccessActivity.u0(R.id.headerText)).animate().alpha(1.0f).setDuration(700L).setListener(this);
            monetizationSuccessActivity.f11440x = 1;
            ((LottieAnimationView) monetizationSuccessActivity.u0(R.id.headerAnim)).i();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animation) {
            i.g(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animation) {
            i.g(animation, "animation");
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i6;
        String str = this.f11439w;
        super.onCreate(bundle);
        setContentView(R.layout.activity_monetization_success);
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 25) {
                LottieAnimationView lottieAnimationView = (LottieAnimationView) u0(R.id.headerAnim);
                if (lottieAnimationView != null) {
                    lottieAnimationView.setRenderMode(t.SOFTWARE);
                }
            } else {
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) u0(R.id.headerAnim);
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setRenderMode(t.HARDWARE);
                }
            }
            Intent intent = getIntent();
            boolean z10 = false;
            if (intent != null && intent.getBooleanExtra("pro", false)) {
                z10 = true;
            }
            try {
                if (i10 >= 23) {
                    Window window = getWindow();
                    if (z10) {
                        i6 = R.color.proPink;
                    } else {
                        i6 = R.color.plusPurple;
                    }
                    window.setStatusBarColor(g0.a.b(this, i6));
                } else {
                    getWindow().setStatusBarColor(g0.a.b(this, R.color.status_bar_grey));
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str, "Error in setting custom status bar", e10);
            }
            if (!z10) {
                ((LottieAnimationView) u0(R.id.headerAnim)).setAnimation(R.raw.purchase_success_unlock_plus);
                ((AppCompatImageView) u0(R.id.headerImage)).setImageResource(R.drawable.ir_purchase_success_plus_bg);
                ((RobertoTextView) u0(R.id.headerText)).setText(getString(R.string.plusUnlockedSuccessHeader));
                ((RobertoTextView) u0(R.id.headerText)).setTextColor(g0.a.b(this, R.color.plusPurple));
                ((RobertoTextView) u0(R.id.bodyText)).setText(getString(R.string.plusUnlockedSuccessSubHeader));
                ((RobertoTextView) u0(R.id.bodyText)).setTextColor(g0.a.b(this, R.color.plusPurpleLite));
                ((RobertoButton) u0(R.id.btnContinue)).setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this, R.color.plusPurple)));
            }
            ((LottieAnimationView) u0(R.id.headerAnim)).c(this.f11441y);
            ((LottieAnimationView) u0(R.id.headerAnim)).h();
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str, e11);
        }
    }

    public final View u0(int i6) {
        LinkedHashMap linkedHashMap = this.f11442z;
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
}
