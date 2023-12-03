package com.google.android.exoplayer2.decoder;

import java.nio.ByteBuffer;
import o7.m;
import r7.a;
import r7.c;
/* loaded from: classes.dex */
public class DecoderInputBuffer extends a {
    public final int A;

    /* renamed from: w  reason: collision with root package name */
    public ByteBuffer f6360w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f6361x;

    /* renamed from: y  reason: collision with root package name */
    public long f6362y;

    /* renamed from: z  reason: collision with root package name */
    public ByteBuffer f6363z;

    /* renamed from: v  reason: collision with root package name */
    public final c f6359v = new c();
    public final int B = 0;

    /* loaded from: classes.dex */
    public static final class InsufficientCapacityException extends IllegalStateException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public InsufficientCapacityException(int i6, int i10) {
            super(r0.toString());
            StringBuilder sb2 = new StringBuilder(44);
            sb2.append("Buffer too small (");
            sb2.append(i6);
            sb2.append(" < ");
            sb2.append(i10);
            sb2.append(")");
        }
    }

    static {
        m.a("goog.exo.decoder");
    }

    public DecoderInputBuffer(int i6) {
        this.A = i6;
    }

    public void n() {
        this.f30528u = 0;
        ByteBuffer byteBuffer = this.f6360w;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f6363z;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f6361x = false;
    }

    public final ByteBuffer p(int i6) {
        int capacity;
        int i10 = this.A;
        if (i10 == 1) {
            return ByteBuffer.allocate(i6);
        }
        if (i10 == 2) {
            return ByteBuffer.allocateDirect(i6);
        }
        ByteBuffer byteBuffer = this.f6360w;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new InsufficientCapacityException(capacity, i6);
    }

    public final void r(int i6) {
        int i10 = i6 + this.B;
        ByteBuffer byteBuffer = this.f6360w;
        if (byteBuffer == null) {
            this.f6360w = p(i10);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i11 = i10 + position;
        if (capacity >= i11) {
            this.f6360w = byteBuffer;
            return;
        }
        ByteBuffer p10 = p(i11);
        p10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            p10.put(byteBuffer);
        }
        this.f6360w = p10;
    }

    public final void t() {
        ByteBuffer byteBuffer = this.f6360w;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f6363z;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
