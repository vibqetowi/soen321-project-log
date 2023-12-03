package q7;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import c9.w;
/* compiled from: AudioTimestampPoller.java */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final a f29278a;

    /* renamed from: b  reason: collision with root package name */
    public int f29279b;

    /* renamed from: c  reason: collision with root package name */
    public long f29280c;

    /* renamed from: d  reason: collision with root package name */
    public long f29281d;

    /* renamed from: e  reason: collision with root package name */
    public long f29282e;
    public long f;

    /* compiled from: AudioTimestampPoller.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final AudioTrack f29283a;

        /* renamed from: b  reason: collision with root package name */
        public final AudioTimestamp f29284b = new AudioTimestamp();

        /* renamed from: c  reason: collision with root package name */
        public long f29285c;

        /* renamed from: d  reason: collision with root package name */
        public long f29286d;

        /* renamed from: e  reason: collision with root package name */
        public long f29287e;

        public a(AudioTrack audioTrack) {
            this.f29283a = audioTrack;
        }
    }

    public m(AudioTrack audioTrack) {
        if (w.f5205a >= 19) {
            this.f29278a = new a(audioTrack);
            a();
            return;
        }
        this.f29278a = null;
        b(3);
    }

    public final void a() {
        if (this.f29278a != null) {
            b(0);
        }
    }

    public final void b(int i6) {
        this.f29279b = i6;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2 && i6 != 3) {
                    if (i6 == 4) {
                        this.f29281d = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f29281d = 10000000L;
                return;
            }
            this.f29281d = 10000L;
            return;
        }
        this.f29282e = 0L;
        this.f = -1L;
        this.f29280c = System.nanoTime() / 1000;
        this.f29281d = 10000L;
    }
}
