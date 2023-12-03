package e9;

import androidx.appcompat.widget.l;
import c9.q;
import c9.w;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.n;
import java.nio.ByteBuffer;
/* compiled from: CameraMotionRenderer.java */
/* loaded from: classes.dex */
public final class b extends com.google.android.exoplayer2.e {
    public final DecoderInputBuffer F;
    public final q G;
    public long H;
    public a I;
    public long J;

    public b() {
        super(6);
        this.F = new DecoderInputBuffer(1);
        this.G = new q();
    }

    @Override // com.google.android.exoplayer2.e
    public final void A(boolean z10, long j10) {
        this.J = Long.MIN_VALUE;
        a aVar = this.I;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // com.google.android.exoplayer2.e
    public final void E(n[] nVarArr, long j10, long j11) {
        this.H = j11;
    }

    @Override // o7.u
    public final int a(n nVar) {
        if ("application/x-camera-motion".equals(nVar.F)) {
            return 4;
        }
        return 0;
    }

    @Override // com.google.android.exoplayer2.z
    public final boolean b() {
        return f();
    }

    @Override // com.google.android.exoplayer2.z, o7.u
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // com.google.android.exoplayer2.z
    public final boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.z
    public final void n(long j10, long j11) {
        float[] fArr;
        while (!f() && this.J < 100000 + j10) {
            DecoderInputBuffer decoderInputBuffer = this.F;
            decoderInputBuffer.n();
            l lVar = this.f6459v;
            lVar.i();
            if (F(lVar, decoderInputBuffer, 0) == -4 && !decoderInputBuffer.k(4)) {
                this.J = decoderInputBuffer.f6362y;
                if (this.I != null && !decoderInputBuffer.l()) {
                    decoderInputBuffer.t();
                    ByteBuffer byteBuffer = decoderInputBuffer.f6360w;
                    int i6 = w.f5205a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        byte[] array = byteBuffer.array();
                        int limit = byteBuffer.limit();
                        q qVar = this.G;
                        qVar.y(array, limit);
                        qVar.A(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i10 = 0; i10 < 3; i10++) {
                            fArr2[i10] = Float.intBitsToFloat(qVar.e());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        this.I.a(this.J - this.H, fArr);
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.x.b
    public final void o(int i6, Object obj) {
        if (i6 == 8) {
            this.I = (a) obj;
        }
    }

    @Override // com.google.android.exoplayer2.e
    public final void y() {
        a aVar = this.I;
        if (aVar != null) {
            aVar.c();
        }
    }
}
