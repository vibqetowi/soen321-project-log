package io.grpc.netty.shaded.io.netty.channel.unix;

import com.facebook.share.internal.ShareInternalUtility;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.http.cookie.ClientCookie;
/* loaded from: classes4.dex */
public class FileDescriptor {
    private static final int STATE_ALL_MASK = 7;
    private static final int STATE_CLOSED_MASK = 1;
    private static final int STATE_INPUT_SHUTDOWN_MASK = 2;
    private static final int STATE_OUTPUT_SHUTDOWN_MASK = 4;
    private static final AtomicIntegerFieldUpdater<FileDescriptor> stateUpdater = AtomicIntegerFieldUpdater.newUpdater(FileDescriptor.class, "state");
    final int fd;
    volatile int state;

    private static native int close(int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int inputShutdown(int i) {
        return i | 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isClosed(int i) {
        return (i & 1) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isInputShutdown(int i) {
        return (i & 2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isOutputShutdown(int i) {
        return (i & 4) != 0;
    }

    private static native long newPipe();

    private static native int open(String str);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int outputShutdown(int i) {
        return i | 4;
    }

    private static native int read(int i, ByteBuffer byteBuffer, int i2, int i3);

    private static native int readAddress(int i, long j, int i2, int i3);

    private static native int write(int i, ByteBuffer byteBuffer, int i2, int i3);

    private static native int writeAddress(int i, long j, int i2, int i3);

    private static native long writev(int i, ByteBuffer[] byteBufferArr, int i2, int i3, long j);

    private static native long writevAddresses(int i, long j, int i2);

    public FileDescriptor(int i) {
        ObjectUtil.checkPositiveOrZero(i, "fd");
        this.fd = i;
    }

    public final int intValue() {
        return this.fd;
    }

    public void close() throws IOException {
        int i;
        do {
            i = this.state;
            if (isClosed(i)) {
                return;
            }
        } while (!casState(i, i | 7));
        int close = close(this.fd);
        if (close < 0) {
            throw Errors.newIOException("close", close);
        }
    }

    public boolean isOpen() {
        return !isClosed(this.state);
    }

    public final int write(ByteBuffer byteBuffer, int i, int i2) throws IOException {
        int write = write(this.fd, byteBuffer, i, i2);
        return write >= 0 ? write : Errors.ioResult("write", write);
    }

    public final int writeAddress(long j, int i, int i2) throws IOException {
        int writeAddress = writeAddress(this.fd, j, i, i2);
        return writeAddress >= 0 ? writeAddress : Errors.ioResult("writeAddress", writeAddress);
    }

    public final long writev(ByteBuffer[] byteBufferArr, int i, int i2, long j) throws IOException {
        long writev = writev(this.fd, byteBufferArr, i, Math.min(Limits.IOV_MAX, i2), j);
        return writev >= 0 ? writev : Errors.ioResult("writev", (int) writev);
    }

    public final long writevAddresses(long j, int i) throws IOException {
        long writevAddresses = writevAddresses(this.fd, j, i);
        return writevAddresses >= 0 ? writevAddresses : Errors.ioResult("writevAddresses", (int) writevAddresses);
    }

    public final int read(ByteBuffer byteBuffer, int i, int i2) throws IOException {
        int read = read(this.fd, byteBuffer, i, i2);
        if (read > 0) {
            return read;
        }
        if (read == 0) {
            return -1;
        }
        return Errors.ioResult("read", read);
    }

    public final int readAddress(long j, int i, int i2) throws IOException {
        int readAddress = readAddress(this.fd, j, i, i2);
        if (readAddress > 0) {
            return readAddress;
        }
        if (readAddress == 0) {
            return -1;
        }
        return Errors.ioResult("readAddress", readAddress);
    }

    public String toString() {
        return "FileDescriptor{fd=" + this.fd + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FileDescriptor) && this.fd == ((FileDescriptor) obj).fd;
    }

    public int hashCode() {
        return this.fd;
    }

    public static FileDescriptor from(String str) throws IOException {
        int open = open((String) ObjectUtil.checkNotNull(str, ClientCookie.PATH_ATTR));
        if (open < 0) {
            throw Errors.newIOException("open", open);
        }
        return new FileDescriptor(open);
    }

    public static FileDescriptor from(File file) throws IOException {
        return from(((File) ObjectUtil.checkNotNull(file, ShareInternalUtility.STAGING_PARAM)).getPath());
    }

    public static FileDescriptor[] pipe() throws IOException {
        long newPipe = newPipe();
        if (newPipe >= 0) {
            return new FileDescriptor[]{new FileDescriptor((int) (newPipe >>> 32)), new FileDescriptor((int) newPipe)};
        }
        throw Errors.newIOException("newPipe", (int) newPipe);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean casState(int i, int i2) {
        return stateUpdater.compareAndSet(this, i, i2);
    }
}
