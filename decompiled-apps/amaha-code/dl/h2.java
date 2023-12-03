package dl;

import android.content.res.ColorStateList;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class h2 implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13033a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f13034b;

    public h2(V3DashboardActivity v3DashboardActivity, kotlin.jvm.internal.v vVar) {
        this.f13033a = v3DashboardActivity;
        this.f13034b = vVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i6, boolean z10) {
        hs.f fVar;
        float dimensionPixelSize;
        boolean z11;
        boolean z12;
        AppCompatImageView appCompatImageView;
        V3DashboardActivity v3DashboardActivity = this.f13033a;
        if (seekBar != null) {
            seekBar.setThumbTintList(ColorStateList.valueOf(g0.a.b(v3DashboardActivity, R.color.sea)));
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) v3DashboardActivity.n0(R.id.ivNPSRatingImage);
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageTintList(null);
        }
        kotlin.jvm.internal.v vVar = this.f13034b;
        vVar.f23467u = i6;
        RobertoTextView robertoTextView = (RobertoTextView) v3DashboardActivity.n0(R.id.tvNPSFooterPrompt);
        if (robertoTextView != null) {
            robertoTextView.setVisibility(8);
        }
        RobertoButton robertoButton = (RobertoButton) v3DashboardActivity.n0(R.id.rbNPSSubmit1);
        boolean z13 = false;
        if (robertoButton != null) {
            robertoButton.setVisibility(0);
        }
        int i10 = vVar.f23467u;
        v3DashboardActivity.getClass();
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
        bVar.f((ConstraintLayout) v3DashboardActivity.n0(R.id.clNPSBottomSheetView1));
        Number number = (Number) fVar.f19464u;
        bVar.h(R.id.ivNPSSeekSelector, 3, number.intValue(), 3);
        bVar.h(R.id.ivNPSSeekSelector, 7, number.intValue(), 7);
        bVar.h(R.id.ivNPSSeekSelector, 6, number.intValue(), 6);
        bVar.h(R.id.ivNPSSeekSelector, 4, number.intValue(), 4);
        bVar.b((ConstraintLayout) v3DashboardActivity.n0(R.id.clNPSBottomSheetView1));
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) v3DashboardActivity.n0(R.id.ivNPSSeekSelector);
        Number number2 = (Number) fVar.f19465v;
        if (number2.intValue() == 0) {
            dimensionPixelSize = 0.0f;
        } else {
            dimensionPixelSize = v3DashboardActivity.getResources().getDimensionPixelSize(number2.intValue());
        }
        appCompatImageView3.setTranslationX(dimensionPixelSize);
        AppCompatImageView appCompatImageView4 = (AppCompatImageView) v3DashboardActivity.n0(R.id.ivNPSSeekSelector);
        if (appCompatImageView4 != null) {
            appCompatImageView4.setVisibility(0);
        }
        if (i6 >= 0 && i6 < 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            AppCompatImageView appCompatImageView5 = (AppCompatImageView) v3DashboardActivity.n0(R.id.ivNPSRatingImage);
            if (appCompatImageView5 != null) {
                appCompatImageView5.setImageResource(R.drawable.ic_nps_allie_1);
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
            AppCompatImageView appCompatImageView6 = (AppCompatImageView) v3DashboardActivity.n0(R.id.ivNPSRatingImage);
            if (appCompatImageView6 != null) {
                appCompatImageView6.setImageResource(R.drawable.ic_nps_allie_2);
                return;
            }
            return;
        }
        if (7 <= i6 && i6 < 10) {
            z13 = true;
        }
        if (z13) {
            AppCompatImageView appCompatImageView7 = (AppCompatImageView) v3DashboardActivity.n0(R.id.ivNPSRatingImage);
            if (appCompatImageView7 != null) {
                appCompatImageView7.setImageResource(R.drawable.ic_nps_allie_3);
            }
        } else if (i6 == 10 && (appCompatImageView = (AppCompatImageView) v3DashboardActivity.n0(R.id.ivNPSRatingImage)) != null) {
            appCompatImageView.setImageResource(R.drawable.ic_nps_allie_4);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
