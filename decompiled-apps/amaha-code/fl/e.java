package fl;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.CustomDashboardActivity;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: CustomDashboardActivity.kt */
/* loaded from: classes2.dex */
public final class e extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends Integer>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ CustomDashboardActivity f15136u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CustomDashboardActivity customDashboardActivity) {
        super(1);
        this.f15136u = customDashboardActivity;
    }

    @Override // ss.l
    public final hs.k invoke(SingleUseEvent<? extends Integer> singleUseEvent) {
        View view;
        AppCompatSeekBar appCompatSeekBar;
        AppCompatImageView appCompatImageView;
        yp.c cVar;
        RobertoTextView robertoTextView;
        yp.c cVar2;
        RobertoTextView robertoTextView2;
        yp.c cVar3;
        RobertoTextView robertoTextView3;
        yp.c cVar4;
        RobertoTextView robertoTextView4;
        yp.c cVar5;
        RobertoTextView robertoTextView5;
        yp.c cVar6;
        RobertoTextView robertoTextView6;
        yp.c cVar7;
        RobertoTextView robertoTextView7;
        yp.c cVar8;
        RobertoTextView robertoTextView8;
        yp.c cVar9;
        RobertoTextView robertoTextView9;
        yp.c cVar10;
        RobertoTextView robertoTextView10;
        yp.c cVar11;
        RobertoTextView robertoTextView11;
        yp.c cVar12;
        AppCompatImageView appCompatImageView2;
        yp.c cVar13;
        AppCompatImageView appCompatImageView3;
        yp.c cVar14;
        ConstraintLayout constraintLayout;
        yp.c cVar15;
        yp.c cVar16;
        RobertoButton robertoButton;
        yp.c cVar17;
        AppCompatSeekBar appCompatSeekBar2;
        yp.c cVar18;
        yp.c cVar19;
        yp.c cVar20;
        ConstraintLayout constraintLayout2;
        yp.c cVar21;
        Integer contentIfNotHandled = singleUseEvent.getContentIfNotHandled();
        if (contentIfNotHandled != null) {
            int intValue = contentIfNotHandled.intValue();
            CustomDashboardActivity customDashboardActivity = this.f15136u;
            v.c cVar22 = customDashboardActivity.A;
            View view2 = null;
            if (cVar22 != null && (cVar21 = (yp.c) cVar22.f34632w) != null) {
                view = cVar21.f38755x;
            } else {
                view = null;
            }
            if (view != null) {
                view.setVisibility(0);
            }
            v.c cVar23 = customDashboardActivity.A;
            if (cVar23 != null && (cVar20 = (yp.c) cVar23.f34632w) != null && (constraintLayout2 = cVar20.f38734a) != null) {
                BottomSheetBehavior.from(constraintLayout2).addBottomSheetCallback(new g(customDashboardActivity));
            }
            kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
            vVar.f23467u = -1;
            v.c cVar24 = customDashboardActivity.A;
            if (cVar24 != null && (cVar19 = (yp.c) cVar24.f34632w) != null) {
                appCompatSeekBar = cVar19.f38743k;
            } else {
                appCompatSeekBar = null;
            }
            if (appCompatSeekBar != null) {
                appCompatSeekBar.setThumbTintList(ColorStateList.valueOf(g0.a.b(customDashboardActivity, R.color.transparent)));
            }
            v.c cVar25 = customDashboardActivity.A;
            if (cVar25 != null && (cVar18 = (yp.c) cVar25.f34632w) != null) {
                appCompatImageView = cVar18.f38739g;
            } else {
                appCompatImageView = null;
            }
            if (appCompatImageView != null) {
                appCompatImageView.setImageTintList(ColorStateList.valueOf(g0.a.b(customDashboardActivity, R.color.login_grey_background)));
            }
            v.c cVar26 = customDashboardActivity.A;
            if (cVar26 != null && (cVar17 = (yp.c) cVar26.f34632w) != null && (appCompatSeekBar2 = cVar17.f38743k) != null) {
                appCompatSeekBar2.setOnSeekBarChangeListener(new h(customDashboardActivity, vVar));
            }
            Animation loadAnimation = AnimationUtils.loadAnimation(customDashboardActivity, R.anim.slide_fade_out_left);
            loadAnimation.setAnimationListener(new i(customDashboardActivity, intValue, vVar));
            v.c cVar27 = customDashboardActivity.A;
            if (cVar27 != null && (cVar16 = (yp.c) cVar27.f34632w) != null && (robertoButton = cVar16.f38741i) != null) {
                robertoButton.setOnClickListener(new dk.t(13, vVar, customDashboardActivity, loadAnimation));
            }
            v.c cVar28 = customDashboardActivity.A;
            if (cVar28 != null && (cVar15 = (yp.c) cVar28.f34632w) != null) {
                view2 = cVar15.f38755x;
            }
            if (view2 != null) {
                view2.setVisibility(0);
            }
            v.c cVar29 = customDashboardActivity.A;
            if (cVar29 != null && (cVar14 = (yp.c) cVar29.f34632w) != null && (constraintLayout = cVar14.f38734a) != null) {
                BottomSheetBehavior.from(constraintLayout).setState(3);
            }
            c cVar30 = new c(customDashboardActivity, 4);
            v.c cVar31 = customDashboardActivity.A;
            if (cVar31 != null && (cVar13 = (yp.c) cVar31.f34632w) != null && (appCompatImageView3 = cVar13.f38738e) != null) {
                appCompatImageView3.setOnClickListener(cVar30);
            }
            v.c cVar32 = customDashboardActivity.A;
            if (cVar32 != null && (cVar12 = (yp.c) cVar32.f34632w) != null && (appCompatImageView2 = cVar12.f) != null) {
                appCompatImageView2.setOnClickListener(cVar30);
            }
            v.c cVar33 = customDashboardActivity.A;
            if (cVar33 != null && (cVar11 = (yp.c) cVar33.f34632w) != null && (robertoTextView11 = cVar11.f38745m) != null) {
                robertoTextView11.setOnClickListener(new c(customDashboardActivity, 5));
            }
            v.c cVar34 = customDashboardActivity.A;
            if (cVar34 != null && (cVar10 = (yp.c) cVar34.f34632w) != null && (robertoTextView10 = cVar10.f38746n) != null) {
                robertoTextView10.setOnClickListener(new c(customDashboardActivity, 6));
            }
            v.c cVar35 = customDashboardActivity.A;
            if (cVar35 != null && (cVar9 = (yp.c) cVar35.f34632w) != null && (robertoTextView9 = cVar9.f38748p) != null) {
                robertoTextView9.setOnClickListener(new c(customDashboardActivity, 7));
            }
            v.c cVar36 = customDashboardActivity.A;
            if (cVar36 != null && (cVar8 = (yp.c) cVar36.f34632w) != null && (robertoTextView8 = cVar8.f38749q) != null) {
                robertoTextView8.setOnClickListener(new c(customDashboardActivity, 8));
            }
            v.c cVar37 = customDashboardActivity.A;
            if (cVar37 != null && (cVar7 = (yp.c) cVar37.f34632w) != null && (robertoTextView7 = cVar7.r) != null) {
                robertoTextView7.setOnClickListener(new c(customDashboardActivity, 9));
            }
            v.c cVar38 = customDashboardActivity.A;
            if (cVar38 != null && (cVar6 = (yp.c) cVar38.f34632w) != null && (robertoTextView6 = cVar6.f38750s) != null) {
                robertoTextView6.setOnClickListener(new c(customDashboardActivity, 10));
            }
            v.c cVar39 = customDashboardActivity.A;
            if (cVar39 != null && (cVar5 = (yp.c) cVar39.f34632w) != null && (robertoTextView5 = cVar5.f38751t) != null) {
                robertoTextView5.setOnClickListener(new c(customDashboardActivity, 11));
            }
            v.c cVar40 = customDashboardActivity.A;
            if (cVar40 != null && (cVar4 = (yp.c) cVar40.f34632w) != null && (robertoTextView4 = cVar4.f38752u) != null) {
                robertoTextView4.setOnClickListener(new c(customDashboardActivity, 12));
            }
            v.c cVar41 = customDashboardActivity.A;
            if (cVar41 != null && (cVar3 = (yp.c) cVar41.f34632w) != null && (robertoTextView3 = cVar3.f38753v) != null) {
                robertoTextView3.setOnClickListener(new c(customDashboardActivity, 1));
            }
            v.c cVar42 = customDashboardActivity.A;
            if (cVar42 != null && (cVar2 = (yp.c) cVar42.f34632w) != null && (robertoTextView2 = cVar2.f38754w) != null) {
                robertoTextView2.setOnClickListener(new c(customDashboardActivity, 2));
            }
            v.c cVar43 = customDashboardActivity.A;
            if (cVar43 != null && (cVar = (yp.c) cVar43.f34632w) != null && (robertoTextView = cVar.f38747o) != null) {
                robertoTextView.setOnClickListener(new c(customDashboardActivity, 3));
            }
            String str = gk.a.f16573a;
            Bundle bundle = new Bundle();
            defpackage.e.s(bundle, "course", "type", "overall");
            hs.k kVar = hs.k.f19476a;
            gk.a.b(bundle, "self_care_nps_display");
        }
        return hs.k.f19476a;
    }
}
