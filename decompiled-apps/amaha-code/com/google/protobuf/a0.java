package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: IterableByteBufferInputStream.java */
/* loaded from: classes.dex */
public final class a0 extends InputStream {
    public byte[] A;
    public int B;
    public long C;

    /* renamed from: u  reason: collision with root package name */
    public final Iterator<ByteBuffer> f9875u;

    /* renamed from: v  reason: collision with root package name */
    public ByteBuffer f9876v;

    /* renamed from: w  reason: collision with root package name */
    public final int f9877w = 0;

    /* renamed from: x  reason: collision with root package name */
    public int f9878x;

    /* renamed from: y  reason: collision with root package name */
    public int f9879y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f9880z;

    public a0(ArrayList arrayList) {
        this.f9875u = arrayList.iterator();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            this.f9877w++;
        }
        this.f9878x = -1;
        if (!a()) {
            this.f9876v = y.f10088c;
            this.f9878x = 0;
            this.f9879y = 0;
            this.C = 0L;
        }
    }

    public final boolean a() {
        this.f9878x++;
        Iterator<ByteBuffer> it = this.f9875u;
        if (!it.hasNext()) {
            return false;
        }
        ByteBuffer next = it.next();
        this.f9876v = next;
        this.f9879y = next.position();
        if (this.f9876v.hasArray()) {
            this.f9880z = true;
            this.A = this.f9876v.array();
            this.B = this.f9876v.arrayOffset();
        } else {
            this.f9880z = false;
            this.C = q1.f10019c.j(q1.f10022g, this.f9876v);
            this.A = null;
        }
        return true;
    }

    public final void e(int i6) {
        int i10 = this.f9879y + i6;
        this.f9879y = i10;
        if (i10 == this.f9876v.limit()) {
            a();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f9878x == this.f9877w) {
            return -1;
        }
        if (this.f9880z) {
            int i6 = this.A[this.f9879y + this.B] & 255;
            e(1);
            return i6;
        }
        int h10 = q1.h(this.f9879y + this.C) & 255;
        e(1);
        return h10;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i6, int i10) {
        if (this.f9878x == this.f9877w) {
            return -1;
        }
        int limit = this.f9876v.limit();
        int i11 = this.f9879y;
        int i12 = limit - i11;
        if (i10 > i12) {
            i10 = i12;
        }
        if (this.f9880z) {
            System.arraycopy(this.A, i11 + this.B, bArr, i6, i10);
            e(i10);
        } else {
            int position = this.f9876v.position();
            this.f9876v.position(this.f9879y);
            this.f9876v.get(bArr, i6, i10);
            this.f9876v.position(position);
            e(i10);
        }
        return i10;
    }
}
