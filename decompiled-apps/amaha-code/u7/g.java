package u7;

import java.io.EOFException;
import u7.v;
/* compiled from: DummyTrackOutput.java */
/* loaded from: classes.dex */
public final class g implements v {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f33879a = new byte[4096];

    @Override // u7.v
    public final void a(int i6, c9.q qVar) {
        qVar.B(i6);
    }

    @Override // u7.v
    public final void b(c9.q qVar, int i6) {
        qVar.B(i6);
    }

    @Override // u7.v
    public final int c(b9.d dVar, int i6, boolean z10) {
        return f(dVar, i6, z10);
    }

    public final int f(b9.d dVar, int i6, boolean z10) {
        byte[] bArr = this.f33879a;
        int read = dVar.read(bArr, 0, Math.min(bArr.length, i6));
        if (read == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return read;
    }

    @Override // u7.v
    public final void e(com.google.android.exoplayer2.n nVar) {
    }

    @Override // u7.v
    public final void d(long j10, int i6, int i10, int i11, v.a aVar) {
    }
}
