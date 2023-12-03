package r4;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;
/* compiled from: VideoDecoder.java */
/* loaded from: classes.dex */
public final class w extends MediaDataSource {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f30451u;

    public w(ByteBuffer byteBuffer) {
        this.f30451u = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f30451u.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j10, byte[] bArr, int i6, int i10) {
        if (j10 >= this.f30451u.limit()) {
            return -1;
        }
        this.f30451u.position((int) j10);
        int min = Math.min(i10, this.f30451u.remaining());
        this.f30451u.get(bArr, i6, min);
        return min;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
