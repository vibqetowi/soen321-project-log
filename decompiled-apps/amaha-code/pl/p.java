package pl;

import android.os.CountDownTimer;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.exoplayer2.ui.PlayerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N14AScreenFragment;
/* compiled from: N14AScreenFragment.kt */
/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.k implements ss.l<Integer, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ N14AScreenFragment f28622u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(N14AScreenFragment n14AScreenFragment) {
        super(1);
        this.f28622u = n14AScreenFragment;
    }

    @Override // ss.l
    public final hs.k invoke(Integer num) {
        Integer num2 = num;
        com.google.android.exoplayer2.w wVar = null;
        N14AScreenFragment n14AScreenFragment = this.f28622u;
        if (num2 != null && num2.intValue() == 6) {
            PlayerView playerView = (PlayerView) n14AScreenFragment._$_findCachedViewById(R.id.pvN14ScreenVideoPlayer);
            if (playerView != null) {
                wVar = playerView.getPlayer();
            }
            if (wVar != null) {
                wVar.z(false);
            }
            ((AppCompatImageView) n14AScreenFragment._$_findCachedViewById(R.id.ivN14AScreenPlayPause)).setImageResource(R.drawable.ic_nda_loader_background);
            ((ProgressBar) n14AScreenFragment._$_findCachedViewById(R.id.pBN14AScreenBufferProgressBar)).setVisibility(0);
        } else if (num2 != null && num2.intValue() == 7) {
            PlayerView playerView2 = (PlayerView) n14AScreenFragment._$_findCachedViewById(R.id.pvN14ScreenVideoPlayer);
            if (playerView2 != null) {
                wVar = playerView2.getPlayer();
            }
            if (wVar != null) {
                wVar.z(false);
            }
            ((ProgressBar) n14AScreenFragment._$_findCachedViewById(R.id.pBN14AScreenBufferProgressBar)).setVisibility(8);
            ((AppCompatImageView) n14AScreenFragment._$_findCachedViewById(R.id.ivN14AScreenPlayPause)).setImageResource(R.drawable.ic_nda_play);
        } else if (num2 != null && num2.intValue() == 2) {
            PlayerView playerView3 = (PlayerView) n14AScreenFragment._$_findCachedViewById(R.id.pvN14ScreenVideoPlayer);
            if (playerView3 != null) {
                wVar = playerView3.getPlayer();
            }
            if (wVar != null) {
                wVar.z(false);
            }
            ((AppCompatImageView) n14AScreenFragment._$_findCachedViewById(R.id.ivN14AScreenPlayPause)).setImageResource(R.drawable.ic_nda_play);
            ((ProgressBar) n14AScreenFragment._$_findCachedViewById(R.id.pBN14AScreenBufferProgressBar)).setVisibility(8);
            v0 v0Var = n14AScreenFragment.G;
            if (v0Var != null) {
                v0Var.I(false, n14AScreenFragment.K);
            }
            CountDownTimer countDownTimer = n14AScreenFragment.f10951y;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            ((LottieAnimationView) n14AScreenFragment._$_findCachedViewById(R.id.lavN14ScreenLottie)).g();
        } else if (num2 != null && num2.intValue() == 3) {
            n14AScreenFragment.J = true;
            n14AScreenFragment.K = false;
            ((ProgressBar) n14AScreenFragment._$_findCachedViewById(R.id.pBN14AScreenBufferProgressBar)).setVisibility(8);
            PlayerView playerView4 = (PlayerView) n14AScreenFragment._$_findCachedViewById(R.id.pvN14ScreenVideoPlayer);
            if (playerView4 != null) {
                wVar = playerView4.getPlayer();
            }
            if (wVar != null) {
                wVar.z(true);
            }
            ((AppCompatImageView) n14AScreenFragment._$_findCachedViewById(R.id.ivN14AScreenPlayPause)).setImageResource(R.drawable.ic_nda_pause);
            ((LottieAnimationView) n14AScreenFragment._$_findCachedViewById(R.id.lavN14ScreenLottie)).j();
            v0 v0Var2 = n14AScreenFragment.G;
            if (v0Var2 != null) {
                v0Var2.I(true, n14AScreenFragment.K);
            }
            if (n14AScreenFragment.f10951y == null) {
                n14AScreenFragment.f10951y = new o(n14AScreenFragment);
            }
            CountDownTimer countDownTimer2 = n14AScreenFragment.f10951y;
            if (countDownTimer2 != null) {
                countDownTimer2.start();
            }
        } else if (num2 != null && num2.intValue() == 1) {
            PlayerView playerView5 = (PlayerView) n14AScreenFragment._$_findCachedViewById(R.id.pvN14ScreenVideoPlayer);
            if (playerView5 != null) {
                wVar = playerView5.getPlayer();
            }
            if (wVar != null) {
                wVar.z(false);
            }
            if (n14AScreenFragment.J) {
                N14AScreenFragment.P(n14AScreenFragment);
            }
        }
        return hs.k.f19476a;
    }
}
