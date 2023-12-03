package pl;

import android.widget.SeekBar;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N14AScreenFragment;
/* compiled from: N14AScreenFragment.kt */
/* loaded from: classes2.dex */
public final class s implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ N14AScreenFragment f28630a;

    public s(N14AScreenFragment n14AScreenFragment) {
        this.f28630a = n14AScreenFragment;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i6, boolean z10) {
        N14AScreenFragment n14AScreenFragment = this.f28630a;
        N14AScreenFragment.Q(n14AScreenFragment, i6);
        n14AScreenFragment.C = i6;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        Long l2;
        int i6 = N14AScreenFragment.f10947b0;
        N14AScreenFragment n14AScreenFragment = this.f28630a;
        ql.i S = n14AScreenFragment.S();
        if (seekBar != null) {
            l2 = Long.valueOf(seekBar.getProgress());
        } else {
            l2 = null;
        }
        S.f(l2);
        if (seekBar != null) {
            N14AScreenFragment.Q(n14AScreenFragment, seekBar.getProgress());
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }
}
