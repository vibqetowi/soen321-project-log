package zp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.FullscreenVideoActivity;
import com.theinnerhour.b2b.activity.VideoActivity;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import dc.h;
import java.io.IOException;
import rr.f;
/* compiled from: VideoFragment.java */
/* loaded from: classes2.dex */
public class c extends rr.b implements SurfaceHolder.Callback, MediaPlayer.OnPreparedListener, f.d {
    public static final /* synthetic */ int B = 0;
    public ProgressBar A;

    /* renamed from: u  reason: collision with root package name */
    public MediaPlayer f39792u;

    /* renamed from: v  reason: collision with root package name */
    public f f39793v;

    /* renamed from: w  reason: collision with root package name */
    public FrameLayout f39794w;

    /* renamed from: x  reason: collision with root package name */
    public ImageView f39795x;

    /* renamed from: y  reason: collision with root package name */
    public String f39796y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f39797z = false;

    /* compiled from: VideoFragment.java */
    /* loaded from: classes2.dex */
    public class a extends ClickableSpan {
        public a() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            c.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.oxfordsparks.ox.ac.uk/what-makes-you-tick")));
        }
    }

    /* compiled from: VideoFragment.java */
    /* loaded from: classes2.dex */
    public class b extends ClickableSpan {
        public b() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            c.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://creativecommons.org/licenses/by/2.0/")));
        }
    }

    /* compiled from: VideoFragment.java */
    /* renamed from: zp.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0682c implements View.OnClickListener {
        public View$OnClickListenerC0682c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            c cVar = c.this;
            cVar.f39795x.setVisibility(4);
            cVar.f39792u.start();
        }
    }

    @Override // rr.f.d
    public final int getCurrentPosition() {
        try {
            return this.f39792u.getCurrentPosition();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
            return 0;
        }
    }

    @Override // rr.f.d
    public final int getDuration() {
        try {
            return this.f39792u.getDuration();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
            return 0;
        }
    }

    @Override // rr.f.d
    public final boolean isPlaying() {
        try {
            return this.f39792u.isPlaying();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
            return false;
        }
    }

    @Override // rr.f.d
    public final void o() {
        this.f39792u.pause();
        Intent intent = new Intent(getActivity(), FullscreenVideoActivity.class);
        intent.putExtra(Constants.NOTIFICATION_URL, this.f39796y);
        intent.putExtra("current_position", this.f39792u.getCurrentPosition());
        startActivity(intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_video, viewGroup, false);
        this.f39794w = (FrameLayout) inflate.findViewById(R.id.videoSurfaceController);
        ((SurfaceView) inflate.findViewById(R.id.videoSurface)).getHolder().addCallback(this);
        Intent intent = getActivity().getIntent();
        if (intent.getExtras() != null && intent.getExtras().containsKey("app_intro")) {
            ((RobertoTextView) inflate.findViewById(R.id.heading)).setText("The InnerHour app has been designed to help you live a happier and healthier life.");
            ((RobertoTextView) inflate.findViewById(R.id.desc)).setText("We are glad to be part of your journey. We wanted to let you know about the different features of the app, so you can kickstart your journey to a better life.");
            ((RobertoButton) inflate.findViewById(R.id.btnSubmit)).setText("BACK");
            this.f39796y = "https://assets.theinnerhour.com/demo/product_demo_1.mp4";
        } else {
            this.f39796y = "http://assets.theinnerhour.com/demo/what_makes_you_tick.mp4";
            SpannableString spannableString = new SpannableString("Video by OxfordSparks / CC by 2.0");
            a aVar = new a();
            b bVar = new b();
            spannableString.setSpan(aVar, 9, 21, 33);
            spannableString.setSpan(new ForegroundColorSpan(g0.a.b(getActivity(), R.color.sea)), 8, 20, 33);
            spannableString.setSpan(bVar, 24, 33, 33);
            spannableString.setSpan(new ForegroundColorSpan(g0.a.b(getActivity(), R.color.sea)), 23, 32, 33);
            RobertoTextView robertoTextView = (RobertoTextView) inflate.findViewById(R.id.tvCopyrights);
            robertoTextView.setText(spannableString);
            robertoTextView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        this.f39792u = new MediaPlayer();
        this.f39793v = new f(getContext());
        this.f39795x = (ImageView) inflate.findViewById(R.id.play_button);
        this.A = (ProgressBar) inflate.findViewById(R.id.progressBar);
        this.f39795x.setOnClickListener(new View$OnClickListenerC0682c());
        try {
            this.f39792u.setAudioStreamType(3);
            this.f39792u.setDataSource(getActivity(), Uri.parse(this.f39796y));
            this.f39792u.setOnPreparedListener(this);
        } catch (IOException | IllegalArgumentException | IllegalStateException | SecurityException e10) {
            LogHelper.INSTANCE.e(e10);
        }
        if (ConnectionStatusReceiver.isConnected()) {
            if (!ConnectionStatusReceiver.isConnectedFast(getContext())) {
                Toast.makeText(getContext(), "Connect to fast network", 0).show();
            }
        } else {
            Toast.makeText(getContext(), "Please connect to internet", 0).show();
            this.A.setVisibility(8);
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f39793v.setMediaPlayer(null);
        this.f39792u.release();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        pause();
        super.onPause();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        this.f39793v.setMediaPlayer(this);
        this.f39795x.setVisibility(0);
        this.A.setVisibility(8);
        this.f39793v.setAnchorView(this.f39794w);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((RobertoButton) view.findViewById(R.id.btnSubmit)).setOnClickListener(new View.OnClickListener(this) { // from class: zp.b

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ c f39791v;

            {
                this.f39791v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                c cVar = this.f39791v;
                switch (i6) {
                    case 0:
                        int i10 = c.B;
                        ((VideoActivity) cVar.requireActivity()).t0();
                        return;
                    default:
                        int i11 = c.B;
                        cVar.requireActivity().finish();
                        return;
                }
            }
        });
        ((ImageView) view.findViewById(R.id.header_arrow_back)).setOnClickListener(new View.OnClickListener(this) { // from class: zp.b

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ c f39791v;

            {
                this.f39791v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                c cVar = this.f39791v;
                switch (i6) {
                    case 0:
                        int i10 = c.B;
                        ((VideoActivity) cVar.requireActivity()).t0();
                        return;
                    default:
                        int i11 = c.B;
                        cVar.requireActivity().finish();
                        return;
                }
            }
        });
        this.f39794w.setOnTouchListener(new h(6, this));
    }

    @Override // rr.f.d
    public final boolean p() {
        try {
            if (getResources().getConfiguration().orientation != 2) {
                return false;
            }
            return true;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
            return false;
        }
    }

    @Override // rr.f.d
    public final void pause() {
        try {
            this.f39792u.pause();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    @Override // rr.f.d
    public final void seekTo(int i6) {
        try {
            this.f39792u.seekTo(i6);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    @Override // rr.f.d
    public final void start() {
        try {
            this.f39792u.start();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        try {
            this.f39792u.setDisplay(surfaceHolder);
            this.f39792u.setOnPreparedListener(this);
            if (!this.f39797z) {
                this.f39797z = true;
                this.f39792u.prepareAsync();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    @Override // rr.f.d
    public final void canPause() {
    }

    @Override // rr.f.d
    public final void getBufferPercentage() {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i6, int i10, int i11) {
    }
}
