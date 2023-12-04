package com.google.android.exoplayer2.source.mediaparser;

import android.media.MediaParser$SeekableInputReader;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
/* loaded from: classes2.dex */
public final class InputReaderAdapterV30 implements MediaParser$SeekableInputReader {
    private long currentPosition;
    private DataReader dataReader;
    private long lastSeekPosition;
    private long resourceLength;

    public void setDataReader(DataReader dataReader, long j) {
        this.dataReader = dataReader;
        this.resourceLength = j;
        this.lastSeekPosition = -1L;
    }

    public void setCurrentPosition(long j) {
        this.currentPosition = j;
    }

    public long getAndResetSeekPosition() {
        long j = this.lastSeekPosition;
        this.lastSeekPosition = -1L;
        return j;
    }

    public void seekToPosition(long j) {
        this.lastSeekPosition = j;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = ((DataReader) Util.castNonNull(this.dataReader)).read(bArr, i, i2);
        this.currentPosition += read;
        return read;
    }

    public long getPosition() {
        return this.currentPosition;
    }

    public long getLength() {
        return this.resourceLength;
    }
}
