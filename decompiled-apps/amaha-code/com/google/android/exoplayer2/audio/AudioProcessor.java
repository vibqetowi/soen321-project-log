package com.google.android.exoplayer2.audio;

import c9.w;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public interface AudioProcessor {

    /* renamed from: a  reason: collision with root package name */
    public static final ByteBuffer f6194a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* loaded from: classes.dex */
    public static final class UnhandledAudioFormatException extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public UnhandledAudioFormatException(a aVar) {
            super(r1.toString());
            String valueOf = String.valueOf(aVar);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 18);
            sb2.append("Unhandled format: ");
            sb2.append(valueOf);
        }
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f6195e = new a(-1, -1, -1);

        /* renamed from: a  reason: collision with root package name */
        public final int f6196a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6197b;

        /* renamed from: c  reason: collision with root package name */
        public final int f6198c;

        /* renamed from: d  reason: collision with root package name */
        public final int f6199d;

        public a(int i6, int i10, int i11) {
            int i12;
            this.f6196a = i6;
            this.f6197b = i10;
            this.f6198c = i11;
            if (w.w(i11)) {
                i12 = w.q(i11, i10);
            } else {
                i12 = -1;
            }
            this.f6199d = i12;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(83);
            sb2.append("AudioFormat[sampleRate=");
            sb2.append(this.f6196a);
            sb2.append(", channelCount=");
            sb2.append(this.f6197b);
            sb2.append(", encoding=");
            sb2.append(this.f6198c);
            sb2.append(']');
            return sb2.toString();
        }
    }

    boolean a();

    boolean b();

    ByteBuffer c();

    void d(ByteBuffer byteBuffer);

    a e(a aVar);

    void f();

    void flush();

    void reset();
}
