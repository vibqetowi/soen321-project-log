package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.util.Log;
import com.google.android.exoplayer2.a0;
/* compiled from: AudioFocusManager.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final AudioManager f6337a;

    /* renamed from: b  reason: collision with root package name */
    public final a f6338b;

    /* renamed from: c  reason: collision with root package name */
    public b f6339c;

    /* renamed from: d  reason: collision with root package name */
    public q7.d f6340d;

    /* renamed from: e  reason: collision with root package name */
    public int f6341e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public float f6342g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    public AudioFocusRequest f6343h;

    /* compiled from: AudioFocusManager.java */
    /* loaded from: classes.dex */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: u  reason: collision with root package name */
        public final Handler f6344u;

        public a(Handler handler) {
            this.f6344u = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i6) {
            this.f6344u.post(new i0.g(i6, 1, this));
        }
    }

    /* compiled from: AudioFocusManager.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    public c(Context context, Handler handler, a0.a aVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f6337a = audioManager;
        this.f6339c = aVar;
        this.f6338b = new a(handler);
        this.f6341e = 0;
    }

    public final void a() {
        if (this.f6341e == 0) {
            return;
        }
        int i6 = c9.w.f5205a;
        AudioManager audioManager = this.f6337a;
        if (i6 >= 26) {
            AudioFocusRequest audioFocusRequest = this.f6343h;
            if (audioFocusRequest != null) {
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            audioManager.abandonAudioFocus(this.f6338b);
        }
        d(0);
    }

    public final void b(int i6) {
        b bVar = this.f6339c;
        if (bVar != null) {
            a0 a0Var = a0.this;
            boolean h10 = a0Var.h();
            int i10 = 1;
            if (h10 && i6 != 1) {
                i10 = 2;
            }
            a0Var.u0(i6, i10, h10);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r6.f29243u == 1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(q7.d dVar) {
        int i6;
        if (!c9.w.a(this.f6340d, dVar)) {
            this.f6340d = dVar;
            boolean z10 = false;
            if (dVar != null) {
                int i10 = dVar.f29245w;
                switch (i10) {
                    case 0:
                        Log.w("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                        i6 = 1;
                        break;
                    case 1:
                    case 14:
                        i6 = 1;
                        break;
                    case 2:
                    case 4:
                        i6 = 2;
                        break;
                    case 3:
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 13:
                        i6 = 3;
                        break;
                    case 11:
                        break;
                    case 15:
                    default:
                        defpackage.d.k(37, "Unidentified audio usage: ", i10, "AudioFocusManager");
                        break;
                    case 16:
                        if (c9.w.f5205a >= 19) {
                            i6 = 4;
                            break;
                        }
                        i6 = 2;
                        break;
                }
                this.f = i6;
                sc.b.p("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", (i6 != 1 || i6 == 0) ? true : true);
            }
            i6 = 0;
            this.f = i6;
            sc.b.p("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", (i6 != 1 || i6 == 0) ? true : true);
        }
    }

    public final void d(int i6) {
        float f;
        if (this.f6341e == i6) {
            return;
        }
        this.f6341e = i6;
        if (i6 == 3) {
            f = 0.2f;
        } else {
            f = 1.0f;
        }
        if (this.f6342g == f) {
            return;
        }
        this.f6342g = f;
        b bVar = this.f6339c;
        if (bVar != null) {
            a0 a0Var = a0.this;
            a0Var.p0(1, 2, Float.valueOf(a0Var.f6188z * a0Var.f6173j.f6342g));
        }
    }

    public final int e(int i6, boolean z10) {
        boolean z11;
        int requestAudioFocus;
        AudioFocusRequest.Builder builder;
        boolean z12;
        int i10 = 1;
        if (i6 != 1 && this.f == 1) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            a();
            if (z10) {
                return 1;
            }
            return -1;
        } else if (!z10) {
            return -1;
        } else {
            if (this.f6341e != 1) {
                int i11 = c9.w.f5205a;
                a aVar = this.f6338b;
                AudioManager audioManager = this.f6337a;
                if (i11 >= 26) {
                    AudioFocusRequest audioFocusRequest = this.f6343h;
                    if (audioFocusRequest == null) {
                        if (audioFocusRequest == null) {
                            builder = new AudioFocusRequest.Builder(this.f);
                        } else {
                            builder = new AudioFocusRequest.Builder(this.f6343h);
                        }
                        q7.d dVar = this.f6340d;
                        if (dVar != null && dVar.f29243u == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        dVar.getClass();
                        this.f6343h = builder.setAudioAttributes(dVar.b()).setWillPauseWhenDucked(z12).setOnAudioFocusChangeListener(aVar).build();
                    }
                    requestAudioFocus = audioManager.requestAudioFocus(this.f6343h);
                } else {
                    q7.d dVar2 = this.f6340d;
                    dVar2.getClass();
                    requestAudioFocus = audioManager.requestAudioFocus(aVar, c9.w.r(dVar2.f29245w), this.f);
                }
                if (requestAudioFocus == 1) {
                    d(1);
                } else {
                    d(0);
                    i10 = -1;
                }
            }
            return i10;
        }
    }
}
