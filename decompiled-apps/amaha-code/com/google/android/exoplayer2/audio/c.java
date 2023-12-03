package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: BaseAudioProcessor.java */
/* loaded from: classes.dex */
public abstract class c implements AudioProcessor {

    /* renamed from: b  reason: collision with root package name */
    public AudioProcessor.a f6279b;

    /* renamed from: c  reason: collision with root package name */
    public AudioProcessor.a f6280c;

    /* renamed from: d  reason: collision with root package name */
    public AudioProcessor.a f6281d;

    /* renamed from: e  reason: collision with root package name */
    public AudioProcessor.a f6282e;
    public ByteBuffer f;

    /* renamed from: g  reason: collision with root package name */
    public ByteBuffer f6283g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6284h;

    public c() {
        ByteBuffer byteBuffer = AudioProcessor.f6194a;
        this.f = byteBuffer;
        this.f6283g = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.f6195e;
        this.f6281d = aVar;
        this.f6282e = aVar;
        this.f6279b = aVar;
        this.f6280c = aVar;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean a() {
        if (this.f6282e != AudioProcessor.a.f6195e) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean b() {
        if (this.f6284h && this.f6283g == AudioProcessor.f6194a) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.f6283g;
        this.f6283g = AudioProcessor.f6194a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final AudioProcessor.a e(AudioProcessor.a aVar) {
        this.f6281d = aVar;
        this.f6282e = g(aVar);
        if (a()) {
            return this.f6282e;
        }
        return AudioProcessor.a.f6195e;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void f() {
        this.f6284h = true;
        i();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        this.f6283g = AudioProcessor.f6194a;
        this.f6284h = false;
        this.f6279b = this.f6281d;
        this.f6280c = this.f6282e;
        h();
    }

    public abstract AudioProcessor.a g(AudioProcessor.a aVar);

    public final ByteBuffer k(int i6) {
        if (this.f.capacity() < i6) {
            this.f = ByteBuffer.allocateDirect(i6).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.f6283g = byteBuffer;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void reset() {
        flush();
        this.f = AudioProcessor.f6194a;
        AudioProcessor.a aVar = AudioProcessor.a.f6195e;
        this.f6281d = aVar;
        this.f6282e = aVar;
        this.f6279b = aVar;
        this.f6280c = aVar;
        j();
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }
}
