package com.theinnerhour.b2b.activity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import rr.f;
/* loaded from: classes2.dex */
public class FullscreenVideoActivity extends Activity implements SurfaceHolder.Callback, MediaPlayer.OnPreparedListener, f.d {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f10408z = 0;

    /* renamed from: u  reason: collision with root package name */
    public MediaPlayer f10409u;

    /* renamed from: v  reason: collision with root package name */
    public f f10410v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f10411w = false;

    /* renamed from: x  reason: collision with root package name */
    public int f10412x = 0;

    /* renamed from: y  reason: collision with root package name */
    public ProgressBar f10413y;

    /* loaded from: classes2.dex */
    public class a implements MediaPlayer.OnCompletionListener {
        public a() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public final void onCompletion(MediaPlayer mediaPlayer) {
            int i6 = FullscreenVideoActivity.f10408z;
            FullscreenVideoActivity.this.a();
        }
    }

    public final void a() {
        try {
            Intent intent = new Intent();
            intent.putExtra("current_position", this.f10409u.getCurrentPosition());
            this.f10409u.pause();
            setResult(-1, intent);
            this.f10410v.setMediaPlayer(null);
            finish();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    @Override // rr.f.d
    public final int getCurrentPosition() {
        try {
            return this.f10409u.getCurrentPosition();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
            return 0;
        }
    }

    @Override // rr.f.d
    public final int getDuration() {
        try {
            return this.f10409u.getDuration();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
            return 0;
        }
    }

    @Override // rr.f.d
    public final boolean isPlaying() {
        try {
            return this.f10409u.isPlaying();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
            return false;
        }
    }

    @Override // rr.f.d
    public final void o() {
        try {
            a();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            a();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID, Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID);
        setContentView(R.layout.activity_fullscreen_video);
        ((SurfaceView) findViewById(R.id.videoSurface)).getHolder().addCallback(this);
        this.f10409u = new MediaPlayer();
        this.f10413y = (ProgressBar) findViewById(R.id.progressBar);
        this.f10410v = new f(this);
        String string = getIntent().getExtras().getString(Constants.NOTIFICATION_URL, "");
        this.f10412x = getIntent().getIntExtra("current_position", 0);
        if (string.equals("")) {
            finish();
        }
        try {
            this.f10409u.setAudioStreamType(3);
            this.f10409u.setDataSource(this, Uri.parse(string));
            this.f10409u.setOnPreparedListener(this);
            this.f10409u.setOnCompletionListener(new a());
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        this.f10410v.setMediaPlayer(null);
        this.f10409u.release();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        try {
            super.onPause();
            pause();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        this.f10410v.setMediaPlayer(this);
        this.f10410v.setAnchorView((FrameLayout) findViewById(R.id.videoSurfaceContainer));
        this.f10409u.start();
        this.f10413y.setVisibility(8);
        this.f10409u.seekTo(this.f10412x);
    }

    @Override // android.app.Activity
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f10410v.c(3000);
        return false;
    }

    @Override // rr.f.d
    public final boolean p() {
        return true;
    }

    @Override // rr.f.d
    public final void pause() {
        try {
            this.f10409u.pause();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    @Override // rr.f.d
    public final void seekTo(int i6) {
        try {
            this.f10409u.seekTo(i6);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    @Override // rr.f.d
    public final void start() {
        try {
            this.f10409u.start();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        try {
            this.f10409u.setDisplay(surfaceHolder);
            if (!this.f10411w) {
                this.f10411w = true;
                this.f10409u.prepareAsync();
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
