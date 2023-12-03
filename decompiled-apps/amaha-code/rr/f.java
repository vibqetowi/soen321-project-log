package rr;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import com.theinnerhour.b2b.R;
import java.lang.ref.WeakReference;
import java.util.Formatter;
import java.util.Locale;
/* compiled from: VideoControllerView.java */
/* loaded from: classes2.dex */
public final class f extends FrameLayout {
    public TextView A;
    public boolean B;
    public boolean C;
    public StringBuilder D;
    public Formatter E;
    public ImageButton F;
    public ImageButton G;
    public final e H;
    public final a I;
    public final b J;
    public final c K;

    /* renamed from: u  reason: collision with root package name */
    public d f31001u;

    /* renamed from: v  reason: collision with root package name */
    public final Context f31002v;

    /* renamed from: w  reason: collision with root package name */
    public ViewGroup f31003w;

    /* renamed from: x  reason: collision with root package name */
    public View f31004x;

    /* renamed from: y  reason: collision with root package name */
    public SeekBar f31005y;

    /* renamed from: z  reason: collision with root package name */
    public TextView f31006z;

    /* compiled from: VideoControllerView.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            f fVar = f.this;
            d dVar = fVar.f31001u;
            if (dVar != null) {
                if (dVar.isPlaying()) {
                    fVar.f31001u.pause();
                } else {
                    fVar.f31001u.start();
                }
                fVar.f();
            }
            fVar.c(3000);
        }
    }

    /* compiled from: VideoControllerView.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            f fVar = f.this;
            d dVar = fVar.f31001u;
            if (dVar != null) {
                dVar.o();
            }
            fVar.c(3000);
        }
    }

    /* compiled from: VideoControllerView.java */
    /* loaded from: classes2.dex */
    public class c implements SeekBar.OnSeekBarChangeListener {
        public c() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i6, boolean z10) {
            f fVar = f.this;
            d dVar = fVar.f31001u;
            if (dVar == null || !z10) {
                return;
            }
            int duration = (int) ((dVar.getDuration() * i6) / 1000);
            fVar.f31001u.seekTo(duration);
            TextView textView = fVar.A;
            if (textView != null) {
                textView.setText(fVar.d(duration));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            f fVar = f.this;
            fVar.c(3600000);
            fVar.C = true;
            fVar.H.removeMessages(2);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            f fVar = f.this;
            fVar.C = false;
            fVar.b();
            fVar.f();
            fVar.c(3000);
            fVar.H.sendEmptyMessage(2);
        }
    }

    /* compiled from: VideoControllerView.java */
    /* loaded from: classes2.dex */
    public interface d {
        void canPause();

        void getBufferPercentage();

        int getCurrentPosition();

        int getDuration();

        boolean isPlaying();

        void o();

        boolean p();

        void pause();

        void seekTo(int i6);

        void start();
    }

    /* compiled from: VideoControllerView.java */
    /* loaded from: classes2.dex */
    public static class e extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<f> f31010a;

        public e(f fVar) {
            this.f31010a = new WeakReference<>(fVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            f fVar = this.f31010a.get();
            if (fVar != null && fVar.f31001u != null) {
                int i6 = message.what;
                if (i6 != 1) {
                    if (i6 == 2) {
                        int b10 = fVar.b();
                        if (!fVar.C && fVar.B && fVar.f31001u.isPlaying()) {
                            sendMessageDelayed(obtainMessage(2), 1000 - (b10 % 1000));
                            return;
                        }
                        return;
                    }
                    return;
                }
                ViewGroup viewGroup = fVar.f31003w;
                if (viewGroup != null) {
                    try {
                        viewGroup.removeView(fVar);
                        fVar.H.removeMessages(2);
                    } catch (IllegalArgumentException unused) {
                    }
                    fVar.B = false;
                }
            }
        }
    }

    public f(Context context) {
        super(context);
        this.H = new e(this);
        this.I = new a();
        this.J = new b();
        this.K = new c();
        this.f31002v = context;
    }

    public final void a(View view) {
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.pause);
        this.F = imageButton;
        if (imageButton != null) {
            imageButton.requestFocus();
            this.F.setOnClickListener(this.I);
        }
        ImageButton imageButton2 = (ImageButton) view.findViewById(R.id.fullscreen);
        this.G = imageButton2;
        if (imageButton2 != null) {
            imageButton2.requestFocus();
            this.G.setOnClickListener(this.J);
        }
        SeekBar seekBar = (SeekBar) view.findViewById(R.id.mediacontroller_progress);
        this.f31005y = seekBar;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(this.K);
            this.f31005y.setMax(1000);
        }
        this.f31006z = (TextView) view.findViewById(R.id.time);
        this.A = (TextView) view.findViewById(R.id.time_current);
        this.D = new StringBuilder();
        this.E = new Formatter(this.D, Locale.getDefault());
    }

    public final int b() {
        d dVar = this.f31001u;
        if (dVar == null || this.C) {
            return 0;
        }
        int currentPosition = dVar.getCurrentPosition();
        int duration = this.f31001u.getDuration();
        SeekBar seekBar = this.f31005y;
        if (seekBar != null) {
            if (duration > 0) {
                seekBar.setProgress((int) ((currentPosition * 1000) / duration));
            }
            this.f31001u.getBufferPercentage();
            this.f31005y.setSecondaryProgress(0);
        }
        TextView textView = this.f31006z;
        if (textView != null) {
            textView.setText(d(duration));
        }
        TextView textView2 = this.A;
        if (textView2 != null) {
            textView2.setText(d(currentPosition));
        }
        return currentPosition;
    }

    public final void c(int i6) {
        if (!this.B && this.f31003w != null) {
            b();
            ImageButton imageButton = this.F;
            if (imageButton != null) {
                imageButton.requestFocus();
            }
            d dVar = this.f31001u;
            if (dVar != null) {
                try {
                    if (this.F != null) {
                        dVar.canPause();
                    }
                } catch (IncompatibleClassChangeError unused) {
                }
            }
            this.f31003w.addView(this, new FrameLayout.LayoutParams(-1, -2, 80));
            this.B = true;
        }
        f();
        e();
        e eVar = this.H;
        eVar.sendEmptyMessage(2);
        Message obtainMessage = eVar.obtainMessage(1);
        if (i6 != 0) {
            eVar.removeMessages(1);
            eVar.sendMessageDelayed(obtainMessage, i6);
        }
    }

    public final String d(int i6) {
        int i10 = i6 / 1000;
        int i11 = i10 % 60;
        int i12 = (i10 / 60) % 60;
        int i13 = i10 / 3600;
        this.D.setLength(0);
        if (i13 > 0) {
            return this.E.format("%d:%02d:%02d", Integer.valueOf(i13), Integer.valueOf(i12), Integer.valueOf(i11)).toString();
        }
        return this.E.format("%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i11)).toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10;
        ViewGroup viewGroup;
        if (this.f31001u == null) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (keyCode != 79 && keyCode != 85 && keyCode != 62) {
            if (keyCode == 126) {
                if (z10 && !this.f31001u.isPlaying()) {
                    this.f31001u.start();
                    f();
                    c(3000);
                }
                return true;
            } else if (keyCode != 86 && keyCode != 127) {
                if (keyCode != 25 && keyCode != 24 && keyCode != 164) {
                    if (keyCode != 4 && keyCode != 82) {
                        c(3000);
                        return super.dispatchKeyEvent(keyEvent);
                    }
                    if (z10 && (viewGroup = this.f31003w) != null) {
                        try {
                            viewGroup.removeView(this);
                            this.H.removeMessages(2);
                        } catch (IllegalArgumentException unused) {
                        }
                        this.B = false;
                    }
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            } else {
                if (z10 && this.f31001u.isPlaying()) {
                    this.f31001u.pause();
                    f();
                    c(3000);
                }
                return true;
            }
        }
        if (z10) {
            d dVar = this.f31001u;
            if (dVar != null) {
                if (dVar.isPlaying()) {
                    this.f31001u.pause();
                } else {
                    this.f31001u.start();
                }
                f();
            }
            c(3000);
            ImageButton imageButton = this.F;
            if (imageButton != null) {
                imageButton.requestFocus();
            }
        }
        return true;
    }

    public final void e() {
        d dVar;
        if (this.f31004x != null && this.G != null && (dVar = this.f31001u) != null) {
            if (dVar.p()) {
                this.G.setImageResource(R.drawable.ic_video_minimize_fullscreen);
            } else {
                this.G.setImageResource(R.drawable.ic_video_maximise_fullscreen);
            }
        }
    }

    public final void f() {
        d dVar;
        if (this.f31004x != null && this.F != null && (dVar = this.f31001u) != null) {
            if (dVar.isPlaying()) {
                this.F.setImageResource(R.drawable.ic_pause_round);
            } else {
                this.F.setImageResource(R.drawable.ic_play_round);
            }
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View view = this.f31004x;
        if (view != null) {
            a(view);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(f.class.getName());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(f.class.getName());
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c(3000);
        return true;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        c(3000);
        return false;
    }

    public void setAnchorView(ViewGroup viewGroup) {
        this.f31003w = viewGroup;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        removeAllViews();
        View inflate = ((LayoutInflater) this.f31002v.getSystemService("layout_inflater")).inflate(R.layout.media_controller, (ViewGroup) null);
        this.f31004x = inflate;
        a(inflate);
        addView(this.f31004x, layoutParams);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        ImageButton imageButton = this.F;
        if (imageButton != null) {
            imageButton.setEnabled(z10);
        }
        SeekBar seekBar = this.f31005y;
        if (seekBar != null) {
            seekBar.setEnabled(z10);
        }
        d dVar = this.f31001u;
        if (dVar != null) {
            try {
                if (this.F != null) {
                    dVar.canPause();
                }
            } catch (IncompatibleClassChangeError unused) {
            }
        }
        super.setEnabled(z10);
    }

    public void setMediaPlayer(d dVar) {
        this.f31001u = dVar;
        f();
        e();
    }
}
