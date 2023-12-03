package fl;

import android.content.res.ColorStateList;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.CustomDashboardActivity;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: CustomDashboardActivity.kt */
/* loaded from: classes2.dex */
public final class h implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CustomDashboardActivity f15139a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f15140b;

    public h(CustomDashboardActivity customDashboardActivity, kotlin.jvm.internal.v vVar) {
        this.f15139a = customDashboardActivity;
        this.f15140b = vVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i6, boolean z10) {
        AppCompatImageView appCompatImageView;
        RobertoTextView robertoTextView;
        RobertoButton robertoButton;
        hs.f fVar;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        AppCompatImageView appCompatImageView2;
        boolean z11;
        boolean z12;
        v.c cVar;
        yp.c cVar2;
        AppCompatImageView appCompatImageView3;
        yp.c cVar3;
        AppCompatImageView appCompatImageView4;
        yp.c cVar4;
        AppCompatImageView appCompatImageView5;
        yp.c cVar5;
        AppCompatImageView appCompatImageView6;
        yp.c cVar6;
        float dimensionPixelSize;
        yp.c cVar7;
        yp.c cVar8;
        yp.c cVar9;
        yp.c cVar10;
        yp.c cVar11;
        yp.c cVar12;
        CustomDashboardActivity customDashboardActivity = this.f15139a;
        if (seekBar != null) {
            seekBar.setThumbTintList(ColorStateList.valueOf(g0.a.b(customDashboardActivity, R.color.sea)));
        }
        v.c cVar13 = customDashboardActivity.A;
        AppCompatImageView appCompatImageView7 = null;
        if (cVar13 != null && (cVar12 = (yp.c) cVar13.f34632w) != null) {
            appCompatImageView = cVar12.f38739g;
        } else {
            appCompatImageView = null;
        }
        if (appCompatImageView != null) {
            appCompatImageView.setImageTintList(null);
        }
        kotlin.jvm.internal.v vVar = this.f15140b;
        vVar.f23467u = i6;
        v.c cVar14 = customDashboardActivity.A;
        if (cVar14 != null && (cVar11 = (yp.c) cVar14.f34632w) != null) {
            robertoTextView = cVar11.f38744l;
        } else {
            robertoTextView = null;
        }
        if (robertoTextView != null) {
            robertoTextView.setVisibility(8);
        }
        v.c cVar15 = customDashboardActivity.A;
        if (cVar15 != null && (cVar10 = (yp.c) cVar15.f34632w) != null) {
            robertoButton = cVar10.f38741i;
        } else {
            robertoButton = null;
        }
        boolean z13 = false;
        if (robertoButton != null) {
            robertoButton.setVisibility(0);
        }
        int i10 = vVar.f23467u;
        customDashboardActivity.getClass();
        Integer valueOf = Integer.valueOf((int) R.dimen._4sdp);
        Integer valueOf2 = Integer.valueOf((int) R.dimen._3sdp);
        switch (i10) {
            case 0:
                fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel0), 0);
                break;
            case 1:
                fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel1), 0);
                break;
            case 2:
                fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel2), 0);
                break;
            case 3:
                fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel3), Integer.valueOf((int) R.dimen._1sdp));
                break;
            case 4:
                fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel4), Integer.valueOf((int) R.dimen._2sdp));
                break;
            case 5:
                fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel5), valueOf2);
                break;
            case 6:
                fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel6), valueOf2);
                break;
            case 7:
                fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel7), valueOf);
                break;
            case 8:
                fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel8), valueOf);
                break;
            case 9:
                fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel9), Integer.valueOf((int) R.dimen._5sdp));
                break;
            default:
                fVar = new hs.f(Integer.valueOf((int) R.id.tvNPSSeekLevel10), 0);
                break;
        }
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        v.c cVar16 = customDashboardActivity.A;
        if (cVar16 != null && (cVar9 = (yp.c) cVar16.f34632w) != null) {
            constraintLayout = cVar9.f38735b;
        } else {
            constraintLayout = null;
        }
        bVar.f(constraintLayout);
        Number number = (Number) fVar.f19464u;
        bVar.h(R.id.ivNPSSeekSelector, 3, number.intValue(), 3);
        bVar.h(R.id.ivNPSSeekSelector, 7, number.intValue(), 7);
        bVar.h(R.id.ivNPSSeekSelector, 6, number.intValue(), 6);
        bVar.h(R.id.ivNPSSeekSelector, 4, number.intValue(), 4);
        v.c cVar17 = customDashboardActivity.A;
        if (cVar17 != null && (cVar8 = (yp.c) cVar17.f34632w) != null) {
            constraintLayout2 = cVar8.f38735b;
        } else {
            constraintLayout2 = null;
        }
        bVar.b(constraintLayout2);
        v.c cVar18 = customDashboardActivity.A;
        if (cVar18 != null && (cVar7 = (yp.c) cVar18.f34632w) != null) {
            appCompatImageView2 = cVar7.f38740h;
        } else {
            appCompatImageView2 = null;
        }
        if (appCompatImageView2 != null) {
            Number number2 = (Number) fVar.f19465v;
            if (number2.intValue() == 0) {
                dimensionPixelSize = 0.0f;
            } else {
                dimensionPixelSize = customDashboardActivity.getResources().getDimensionPixelSize(number2.intValue());
            }
            appCompatImageView2.setTranslationX(dimensionPixelSize);
        }
        v.c cVar19 = customDashboardActivity.A;
        if (cVar19 != null && (cVar6 = (yp.c) cVar19.f34632w) != null) {
            appCompatImageView7 = cVar6.f38740h;
        }
        if (appCompatImageView7 != null) {
            appCompatImageView7.setVisibility(0);
        }
        if (i6 >= 0 && i6 < 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            v.c cVar20 = customDashboardActivity.A;
            if (cVar20 != null && (cVar5 = (yp.c) cVar20.f34632w) != null && (appCompatImageView6 = cVar5.f38739g) != null) {
                appCompatImageView6.setImageResource(R.drawable.ic_nps_allie_1);
                return;
            }
            return;
        }
        if (4 <= i6 && i6 < 7) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            v.c cVar21 = customDashboardActivity.A;
            if (cVar21 != null && (cVar4 = (yp.c) cVar21.f34632w) != null && (appCompatImageView5 = cVar4.f38739g) != null) {
                appCompatImageView5.setImageResource(R.drawable.ic_nps_allie_2);
                return;
            }
            return;
        }
        if (7 <= i6 && i6 < 10) {
            z13 = true;
        }
        if (z13) {
            v.c cVar22 = customDashboardActivity.A;
            if (cVar22 != null && (cVar3 = (yp.c) cVar22.f34632w) != null && (appCompatImageView4 = cVar3.f38739g) != null) {
                appCompatImageView4.setImageResource(R.drawable.ic_nps_allie_3);
            }
        } else if (i6 == 10 && (cVar = customDashboardActivity.A) != null && (cVar2 = (yp.c) cVar.f34632w) != null && (appCompatImageView3 = cVar2.f38739g) != null) {
            appCompatImageView3.setImageResource(R.drawable.ic_nps_allie_4);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
