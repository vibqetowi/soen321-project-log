package f8;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
/* compiled from: BatchBuffer.java */
/* loaded from: classes.dex */
public final class f extends DecoderInputBuffer {
    public long C;
    public int D;
    public int E;

    public f() {
        super(2);
        this.E = 32;
    }

    @Override // com.google.android.exoplayer2.decoder.DecoderInputBuffer
    public final void n() {
        super.n();
        this.D = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        if ((r0.remaining() + r3.position()) > 3072000) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u(DecoderInputBuffer decoderInputBuffer) {
        boolean z10;
        boolean z11;
        sc.b.q(!decoderInputBuffer.k(1073741824));
        sc.b.q(!decoderInputBuffer.k(268435456));
        sc.b.q(!decoderInputBuffer.k(4));
        int i6 = this.D;
        if (i6 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i6 < this.E && decoderInputBuffer.l() == l()) {
                ByteBuffer byteBuffer = decoderInputBuffer.f6360w;
                if (byteBuffer != null && (r3 = this.f6360w) != null) {
                }
            }
            z11 = false;
            if (z11) {
                return false;
            }
            int i10 = this.D;
            this.D = i10 + 1;
            if (i10 == 0) {
                this.f6362y = decoderInputBuffer.f6362y;
                if (decoderInputBuffer.k(1)) {
                    this.f30528u = 1;
                }
            }
            if (decoderInputBuffer.l()) {
                this.f30528u = LinearLayoutManager.INVALID_OFFSET;
            }
            ByteBuffer byteBuffer2 = decoderInputBuffer.f6360w;
            if (byteBuffer2 != null) {
                r(byteBuffer2.remaining());
                this.f6360w.put(byteBuffer2);
            }
            this.C = decoderInputBuffer.f6362y;
            return true;
        }
        z11 = true;
        if (z11) {
        }
    }
}
