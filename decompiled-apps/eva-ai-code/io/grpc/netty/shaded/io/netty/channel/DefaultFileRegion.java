package io.grpc.netty.shaded.io.netty.channel;

import com.facebook.share.internal.ShareInternalUtility;
import io.grpc.netty.shaded.io.netty.util.AbstractReferenceCounted;
import io.grpc.netty.shaded.io.netty.util.IllegalReferenceCountException;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLogger;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLoggerFactory;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
/* loaded from: classes4.dex */
public class DefaultFileRegion extends AbstractReferenceCounted implements FileRegion {
    private static final InternalLogger logger = InternalLoggerFactory.getInstance(DefaultFileRegion.class);
    private final long count;
    private final File f;
    private FileChannel file;
    private final long position;
    private long transferred;

    @Override // io.grpc.netty.shaded.io.netty.util.AbstractReferenceCounted, io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public FileRegion touch() {
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public FileRegion touch(Object obj) {
        return this;
    }

    public DefaultFileRegion(FileChannel fileChannel, long j, long j2) {
        this.file = (FileChannel) ObjectUtil.checkNotNull(fileChannel, ShareInternalUtility.STAGING_PARAM);
        this.position = ObjectUtil.checkPositiveOrZero(j, "position");
        this.count = ObjectUtil.checkPositiveOrZero(j2, "count");
        this.f = null;
    }

    public DefaultFileRegion(File file, long j, long j2) {
        this.f = (File) ObjectUtil.checkNotNull(file, "f");
        this.position = ObjectUtil.checkPositiveOrZero(j, "position");
        this.count = ObjectUtil.checkPositiveOrZero(j2, "count");
    }

    public boolean isOpen() {
        return this.file != null;
    }

    public void open() throws IOException {
        if (isOpen() || refCnt() <= 0) {
            return;
        }
        this.file = new RandomAccessFile(this.f, "r").getChannel();
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.FileRegion
    public long position() {
        return this.position;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.FileRegion
    public long count() {
        return this.count;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.FileRegion
    @Deprecated
    public long transfered() {
        return this.transferred;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.FileRegion
    public long transferred() {
        return this.transferred;
    }

    @Override // io.grpc.netty.shaded.io.netty.channel.FileRegion
    public long transferTo(WritableByteChannel writableByteChannel, long j) throws IOException {
        long j2 = this.count - j;
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i < 0 || j < 0) {
            throw new IllegalArgumentException("position out of range: " + j + " (expected: 0 - " + (this.count - 1) + ')');
        } else if (i == 0) {
            return 0L;
        } else {
            if (refCnt() == 0) {
                throw new IllegalReferenceCountException(0);
            }
            open();
            long transferTo = this.file.transferTo(this.position + j, j2, writableByteChannel);
            int i2 = (transferTo > 0L ? 1 : (transferTo == 0L ? 0 : -1));
            if (i2 > 0) {
                this.transferred += transferTo;
            } else if (i2 == 0) {
                validate(this, j);
            }
            return transferTo;
        }
    }

    @Override // io.grpc.netty.shaded.io.netty.util.AbstractReferenceCounted
    protected void deallocate() {
        FileChannel fileChannel = this.file;
        if (fileChannel == null) {
            return;
        }
        this.file = null;
        try {
            fileChannel.close();
        } catch (IOException e) {
            logger.warn("Failed to close a file.", (Throwable) e);
        }
    }

    @Override // io.grpc.netty.shaded.io.netty.util.AbstractReferenceCounted, io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public FileRegion retain() {
        super.retain();
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.util.AbstractReferenceCounted, io.grpc.netty.shaded.io.netty.util.ReferenceCounted
    public FileRegion retain(int i) {
        super.retain(i);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void validate(DefaultFileRegion defaultFileRegion, long j) throws IOException {
        long size = defaultFileRegion.file.size();
        if (defaultFileRegion.position + (defaultFileRegion.count - j) + j <= size) {
            return;
        }
        throw new IOException("Underlying file size " + size + " smaller then requested count " + defaultFileRegion.count);
    }
}
