package bm;

import android.widget.ImageView;
import android.widget.SeekBar;
import com.theinnerhour.b2b.R;
/* compiled from: GoalsAdapterNew.kt */
/* loaded from: classes2.dex */
public final class j implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ImageView f4479a;

    public j(ImageView imageView) {
        this.f4479a = imageView;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i6, boolean z10) {
        kotlin.jvm.internal.i.g(seekBar, "seekBar");
        int progress = seekBar.getProgress();
        ImageView imageView = this.f4479a;
        if (progress == 0) {
            imageView.setImageResource(R.drawable.one);
        } else if (seekBar.getProgress() == 1) {
            imageView.setImageResource(R.drawable.two);
        } else if (seekBar.getProgress() == 2) {
            imageView.setImageResource(R.drawable.three);
        } else if (seekBar.getProgress() == 3) {
            imageView.setImageResource(R.drawable.four);
        } else if (seekBar.getProgress() == 4) {
            imageView.setImageResource(R.drawable.five);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        kotlin.jvm.internal.i.g(seekBar, "seekBar");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        kotlin.jvm.internal.i.g(seekBar, "seekBar");
    }
}
