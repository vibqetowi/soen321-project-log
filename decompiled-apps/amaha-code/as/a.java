package as;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.n;
import com.google.protobuf.q0;
import com.google.protobuf.z0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;
import tr.a0;
import tr.p;
/* compiled from: ProtoInputStream.java */
/* loaded from: classes2.dex */
public final class a extends InputStream implements p, a0 {

    /* renamed from: u  reason: collision with root package name */
    public q0 f3457u;

    /* renamed from: v  reason: collision with root package name */
    public final z0<?> f3458v;

    /* renamed from: w  reason: collision with root package name */
    public ByteArrayInputStream f3459w;

    public a(q0 q0Var, z0<?> z0Var) {
        this.f3457u = q0Var;
        this.f3458v = z0Var;
    }

    @Override // tr.p
    public final int a(OutputStream outputStream) {
        q0 q0Var = this.f3457u;
        if (q0Var != null) {
            int b10 = q0Var.b();
            this.f3457u.writeTo(outputStream);
            this.f3457u = null;
            return b10;
        }
        ByteArrayInputStream byteArrayInputStream = this.f3459w;
        if (byteArrayInputStream != null) {
            n nVar = b.f3460a;
            sc.b.w(outputStream, "outputStream cannot be null!");
            byte[] bArr = new byte[8192];
            long j10 = 0;
            while (true) {
                int read = byteArrayInputStream.read(bArr);
                if (read == -1) {
                    int i6 = (int) j10;
                    this.f3459w = null;
                    return i6;
                }
                outputStream.write(bArr, 0, read);
                j10 += read;
            }
        } else {
            return 0;
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        q0 q0Var = this.f3457u;
        if (q0Var != null) {
            return q0Var.b();
        }
        ByteArrayInputStream byteArrayInputStream = this.f3459w;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f3457u != null) {
            this.f3459w = new ByteArrayInputStream(this.f3457u.q());
            this.f3457u = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f3459w;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i6, int i10) {
        q0 q0Var = this.f3457u;
        if (q0Var != null) {
            int b10 = q0Var.b();
            if (b10 == 0) {
                this.f3457u = null;
                this.f3459w = null;
                return -1;
            } else if (i10 >= b10) {
                Logger logger = CodedOutputStream.f9865w;
                CodedOutputStream.b bVar = new CodedOutputStream.b(i6, bArr, b10);
                this.f3457u.f(bVar);
                if (bVar.E0() == 0) {
                    this.f3457u = null;
                    this.f3459w = null;
                    return b10;
                }
                throw new IllegalStateException("Did not write as much data as expected.");
            } else {
                this.f3459w = new ByteArrayInputStream(this.f3457u.q());
                this.f3457u = null;
            }
        }
        ByteArrayInputStream byteArrayInputStream = this.f3459w;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i6, i10);
        }
        return -1;
    }
}
