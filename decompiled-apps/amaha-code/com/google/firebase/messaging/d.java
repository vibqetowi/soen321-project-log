package com.google.firebase.messaging;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
/* compiled from: ByteStreams.java */
/* loaded from: classes.dex */
public final class d {
    public static byte[] a(ArrayDeque arrayDeque, int i6) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i6) {
            return bArr;
        }
        int length = i6 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i6);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i6 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static byte[] b(a aVar) {
        int i6;
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i10 = 0;
        while (i10 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i10);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i11 = 0;
            while (i11 < min2) {
                int read = aVar.read(bArr, i11, min2 - i11);
                if (read == -1) {
                    return a(arrayDeque, i10);
                }
                i11 += read;
                i10 += read;
            }
            long j10 = min;
            if (min < 4096) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            long j11 = j10 * i6;
            if (j11 > 2147483647L) {
                min = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            } else if (j11 < -2147483648L) {
                min = LinearLayoutManager.INVALID_OFFSET;
            } else {
                min = (int) j11;
            }
        }
        if (aVar.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* compiled from: ByteStreams.java */
    /* loaded from: classes.dex */
    public static final class a extends FilterInputStream {

        /* renamed from: u  reason: collision with root package name */
        public long f9692u;

        /* renamed from: v  reason: collision with root package name */
        public long f9693v;

        public a(InputStream inputStream) {
            super(inputStream);
            this.f9693v = -1L;
            this.f9692u = 1048577L;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int available() {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f9692u);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final synchronized void mark(int i6) {
            ((FilterInputStream) this).in.mark(i6);
            this.f9693v = this.f9692u;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() {
            if (this.f9692u == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f9692u--;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final synchronized void reset() {
            if (((FilterInputStream) this).in.markSupported()) {
                if (this.f9693v != -1) {
                    ((FilterInputStream) this).in.reset();
                    this.f9692u = this.f9693v;
                } else {
                    throw new IOException("Mark not set");
                }
            } else {
                throw new IOException("Mark not supported");
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final long skip(long j10) {
            long skip = ((FilterInputStream) this).in.skip(Math.min(j10, this.f9692u));
            this.f9692u -= skip;
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i6, int i10) {
            long j10 = this.f9692u;
            if (j10 == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i6, (int) Math.min(i10, j10));
            if (read != -1) {
                this.f9692u -= read;
            }
            return read;
        }
    }
}
