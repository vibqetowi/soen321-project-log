package coil.decode;

import java.io.InputStream;
import kotlin.Metadata;
import kotlinx.coroutines.DebugKt;
/* compiled from: ExifUtils.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcoil/decode/ExifInterfaceInputStream;", "Ljava/io/InputStream;", "delegate", "(Ljava/io/InputStream;)V", "availableBytes", "", "available", "close", "", "interceptBytesRead", "bytesRead", "read", "b", "", DebugKt.DEBUG_PROPERTY_VALUE_OFF, "len", "skip", "", "n", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ExifInterfaceInputStream extends InputStream {
    private int availableBytes = 1073741824;
    private final InputStream delegate;

    public ExifInterfaceInputStream(InputStream inputStream) {
        this.delegate = inputStream;
    }

    @Override // java.io.InputStream
    public int read() {
        return interceptBytesRead(this.delegate.read());
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return interceptBytesRead(this.delegate.read(bArr));
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        return interceptBytesRead(this.delegate.read(bArr, i, i2));
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        return this.delegate.skip(j);
    }

    @Override // java.io.InputStream
    public int available() {
        return this.availableBytes;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    private final int interceptBytesRead(int i) {
        if (i == -1) {
            this.availableBytes = 0;
        }
        return i;
    }
}
