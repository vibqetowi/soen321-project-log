package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.DataSourceUtil;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import java.io.IOException;
import java.io.InterruptedIOException;
/* loaded from: classes2.dex */
public final class CacheWriter {
    public static final int DEFAULT_BUFFER_SIZE_BYTES = 131072;
    private long bytesCached;
    private final Cache cache;
    private final String cacheKey;
    private final CacheDataSource dataSource;
    private final DataSpec dataSpec;
    private long endPosition;
    private volatile boolean isCanceled;
    private long nextPosition;
    private final ProgressListener progressListener;
    private final byte[] temporaryBuffer;

    /* loaded from: classes2.dex */
    public interface ProgressListener {
        void onProgress(long j, long j2, long j3);
    }

    public CacheWriter(CacheDataSource cacheDataSource, DataSpec dataSpec, byte[] bArr, ProgressListener progressListener) {
        this.dataSource = cacheDataSource;
        this.cache = cacheDataSource.getCache();
        this.dataSpec = dataSpec;
        this.temporaryBuffer = bArr == null ? new byte[131072] : bArr;
        this.progressListener = progressListener;
        this.cacheKey = cacheDataSource.getCacheKeyFactory().buildCacheKey(dataSpec);
        this.nextPosition = dataSpec.position;
    }

    public void cancel() {
        this.isCanceled = true;
    }

    public void cache() throws IOException {
        throwIfCanceled();
        this.bytesCached = this.cache.getCachedBytes(this.cacheKey, this.dataSpec.position, this.dataSpec.length);
        if (this.dataSpec.length != -1) {
            this.endPosition = this.dataSpec.position + this.dataSpec.length;
        } else {
            long contentLength = ContentMetadata.CC.getContentLength(this.cache.getContentMetadata(this.cacheKey));
            if (contentLength == -1) {
                contentLength = -1;
            }
            this.endPosition = contentLength;
        }
        ProgressListener progressListener = this.progressListener;
        if (progressListener != null) {
            progressListener.onProgress(getLength(), this.bytesCached, 0L);
        }
        while (true) {
            long j = this.endPosition;
            if (j != -1 && this.nextPosition >= j) {
                return;
            }
            throwIfCanceled();
            long j2 = this.endPosition;
            long cachedLength = this.cache.getCachedLength(this.cacheKey, this.nextPosition, j2 == -1 ? Long.MAX_VALUE : j2 - this.nextPosition);
            if (cachedLength > 0) {
                this.nextPosition += cachedLength;
            } else {
                long j3 = -cachedLength;
                if (j3 == Long.MAX_VALUE) {
                    j3 = -1;
                }
                long j4 = this.nextPosition;
                this.nextPosition = j4 + readBlockToCache(j4, j3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f A[Catch: IOException -> 0x0068, TryCatch #0 {IOException -> 0x0068, blocks: (B:27:0x0064, B:33:0x006f, B:35:0x007d, B:37:0x0085), top: B:43:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[Catch: IOException -> 0x0068, TRY_LEAVE, TryCatch #0 {IOException -> 0x0068, blocks: (B:27:0x0064, B:33:0x006f, B:35:0x007d, B:37:0x0085), top: B:43:0x0064 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long readBlockToCache(long j, long j2) throws IOException {
        long j3;
        int i;
        boolean z = true;
        boolean z2 = j + j2 == this.endPosition || j2 == -1;
        if (j2 != -1) {
            try {
                j3 = this.dataSource.open(this.dataSpec.buildUpon().setPosition(j).setLength(j2).build());
            } catch (IOException unused) {
                DataSourceUtil.closeQuietly(this.dataSource);
            }
            if (!z) {
                throwIfCanceled();
                try {
                    j3 = this.dataSource.open(this.dataSpec.buildUpon().setPosition(j).setLength(-1L).build());
                } catch (IOException e) {
                    DataSourceUtil.closeQuietly(this.dataSource);
                    throw e;
                }
            }
            if (z2 && j3 != -1) {
                try {
                    onRequestEndPosition(j3 + j);
                } catch (IOException e2) {
                    DataSourceUtil.closeQuietly(this.dataSource);
                    throw e2;
                }
            }
            i = 0;
            int i2 = 0;
            while (i != -1) {
                throwIfCanceled();
                CacheDataSource cacheDataSource = this.dataSource;
                byte[] bArr = this.temporaryBuffer;
                i = cacheDataSource.read(bArr, 0, bArr.length);
                if (i != -1) {
                    onNewBytesCached(i);
                    i2 += i;
                }
            }
            if (z2) {
                onRequestEndPosition(j + i2);
            }
            this.dataSource.close();
            return i2;
        }
        z = false;
        j3 = -1;
        if (!z) {
        }
        if (z2) {
            onRequestEndPosition(j3 + j);
        }
        i = 0;
        int i22 = 0;
        while (i != -1) {
        }
        if (z2) {
        }
        this.dataSource.close();
        return i22;
    }

    private void onRequestEndPosition(long j) {
        if (this.endPosition == j) {
            return;
        }
        this.endPosition = j;
        ProgressListener progressListener = this.progressListener;
        if (progressListener != null) {
            progressListener.onProgress(getLength(), this.bytesCached, 0L);
        }
    }

    private void onNewBytesCached(long j) {
        this.bytesCached += j;
        ProgressListener progressListener = this.progressListener;
        if (progressListener != null) {
            progressListener.onProgress(getLength(), this.bytesCached, j);
        }
    }

    private long getLength() {
        long j = this.endPosition;
        if (j == -1) {
            return -1L;
        }
        return j - this.dataSpec.position;
    }

    private void throwIfCanceled() throws InterruptedIOException {
        if (this.isCanceled) {
            throw new InterruptedIOException();
        }
    }
}
