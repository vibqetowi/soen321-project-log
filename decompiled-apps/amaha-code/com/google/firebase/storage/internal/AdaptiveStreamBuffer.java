package com.google.firebase.storage.internal;

import android.util.Log;
import java.io.InputStream;
/* loaded from: classes.dex */
public class AdaptiveStreamBuffer {
    private static final String TAG = "AdaptiveStreamBuffer";
    private static final Runtime runtime = Runtime.getRuntime();
    private byte[] buffer;
    private final InputStream source;
    private int availableBytes = 0;
    private boolean adaptiveMode = true;
    private boolean reachedEnd = false;

    public AdaptiveStreamBuffer(InputStream inputStream, int i6) {
        this.source = inputStream;
        this.buffer = new byte[i6];
    }

    private int resize(int i6) {
        int max = Math.max(this.buffer.length * 2, i6);
        Runtime runtime2 = runtime;
        long maxMemory = runtime2.maxMemory() - (runtime2.totalMemory() - runtime2.freeMemory());
        if (this.adaptiveMode && max < maxMemory) {
            try {
                byte[] bArr = new byte[max];
                System.arraycopy(this.buffer, 0, bArr, 0, this.availableBytes);
                this.buffer = bArr;
            } catch (OutOfMemoryError unused) {
                Log.w(TAG, "Turning off adaptive buffer resizing due to low memory.");
                this.adaptiveMode = false;
            }
        } else {
            Log.w(TAG, "Turning off adaptive buffer resizing to conserve memory.");
        }
        return this.buffer.length;
    }

    public int advance(int i6) {
        int i10 = this.availableBytes;
        int i11 = 0;
        if (i6 <= i10) {
            int i12 = i10 - i6;
            this.availableBytes = i12;
            byte[] bArr = this.buffer;
            System.arraycopy(bArr, i6, bArr, 0, i12);
            return i6;
        }
        this.availableBytes = 0;
        while (i11 < i6) {
            int skip = (int) this.source.skip(i6 - i11);
            if (skip > 0) {
                i11 += skip;
            } else if (skip != 0) {
                continue;
            } else if (this.source.read() == -1) {
                break;
            } else {
                i11++;
            }
        }
        return i11;
    }

    public int available() {
        return this.availableBytes;
    }

    public void close() {
        this.source.close();
    }

    public int fill(int i6) {
        if (i6 > this.buffer.length) {
            i6 = Math.min(i6, resize(i6));
        }
        while (true) {
            int i10 = this.availableBytes;
            if (i10 >= i6) {
                break;
            }
            int read = this.source.read(this.buffer, i10, i6 - i10);
            if (read == -1) {
                this.reachedEnd = true;
                break;
            }
            this.availableBytes += read;
        }
        return this.availableBytes;
    }

    public byte[] get() {
        return this.buffer;
    }

    public boolean isFinished() {
        return this.reachedEnd;
    }
}
