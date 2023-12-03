package com.google.android.exoplayer2.audio;

import com.appsflyer.R;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.v;
import java.nio.ByteBuffer;
import r1.b0;
/* loaded from: classes.dex */
public interface AudioSink {

    /* loaded from: classes.dex */
    public static final class InitializationException extends Exception {

        /* renamed from: u  reason: collision with root package name */
        public final boolean f6201u;

        /* renamed from: v  reason: collision with root package name */
        public final n f6202v;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public InitializationException(int i6, int i10, int i11, int i12, n nVar, boolean z10, RuntimeException runtimeException) {
            super(b0.b(r2, ")", r0), runtimeException);
            String str;
            if (z10) {
                str = " (recoverable)";
            } else {
                str = "";
            }
            StringBuilder sb2 = new StringBuilder(str.length() + 80);
            sb2.append("AudioTrack init failed ");
            sb2.append(i6);
            sb2.append(" Config(");
            sb2.append(i10);
            sb2.append(", ");
            sb2.append(i11);
            sb2.append(", ");
            sb2.append(i12);
            this.f6201u = z10;
            this.f6202v = nVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class UnexpectedDiscontinuityException extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public UnexpectedDiscontinuityException(long j10, long j11) {
            super(r0.toString());
            StringBuilder sb2 = new StringBuilder((int) R.styleable.AppCompatTheme_textAppearanceListItem);
            sb2.append("Unexpected audio track timestamp discontinuity: expected ");
            sb2.append(j11);
            sb2.append(", got ");
            sb2.append(j10);
        }
    }

    /* loaded from: classes.dex */
    public static final class WriteException extends Exception {

        /* renamed from: u  reason: collision with root package name */
        public final boolean f6203u;

        /* renamed from: v  reason: collision with root package name */
        public final n f6204v;

        public WriteException(int i6, n nVar, boolean z10) {
            super(defpackage.b.h(36, "AudioTrack write failed: ", i6));
            this.f6203u = z10;
            this.f6204v = nVar;
        }
    }

    /* loaded from: classes.dex */
    public interface a {
    }

    boolean a(n nVar);

    boolean b();

    v c();

    void d(v vVar);

    void e(q7.n nVar);

    void f();

    void flush();

    boolean g();

    void h(int i6);

    void i(n nVar, int[] iArr);

    long j(boolean z10);

    void k();

    void l();

    void m(float f);

    void n();

    void o(q7.d dVar);

    boolean p(ByteBuffer byteBuffer, long j10, int i6);

    void pause();

    void q();

    int r(n nVar);

    void reset();

    void s(boolean z10);

    /* loaded from: classes.dex */
    public static final class ConfigurationException extends Exception {

        /* renamed from: u  reason: collision with root package name */
        public final n f6200u;

        public ConfigurationException(AudioProcessor.UnhandledAudioFormatException unhandledAudioFormatException, n nVar) {
            super(unhandledAudioFormatException);
            this.f6200u = nVar;
        }

        public ConfigurationException(String str, n nVar) {
            super(str);
            this.f6200u = nVar;
        }
    }
}
