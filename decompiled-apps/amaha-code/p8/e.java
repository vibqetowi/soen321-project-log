package p8;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.theinnerhour.b2b.utils.Constants;
import java.nio.ByteBuffer;
/* compiled from: SimpleSubtitleDecoder.java */
/* loaded from: classes.dex */
public abstract class e extends r7.g<j, k, SubtitleDecoderException> implements g {
    public e() {
        super(new j[2], new k[2]);
        boolean z10;
        int i6 = this.f30551g;
        DecoderInputBuffer[] decoderInputBufferArr = this.f30550e;
        if (i6 == decoderInputBufferArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.C(z10);
        for (DecoderInputBuffer decoderInputBuffer : decoderInputBufferArr) {
            decoderInputBuffer.r(Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID);
        }
    }

    @Override // r7.g
    public final SubtitleDecoderException f(DecoderInputBuffer decoderInputBuffer, r7.e eVar, boolean z10) {
        j jVar = (j) decoderInputBuffer;
        k kVar = (k) eVar;
        try {
            ByteBuffer byteBuffer = jVar.f6360w;
            byteBuffer.getClass();
            kVar.p(jVar.f6362y, h(byteBuffer.array(), byteBuffer.limit(), z10), jVar.C);
            kVar.f30528u &= SubsamplingScaleImageView.TILE_SIZE_AUTO;
            return null;
        } catch (SubtitleDecoderException e10) {
            return e10;
        }
    }

    public abstract f h(byte[] bArr, int i6, boolean z10);

    @Override // p8.g
    public final void b(long j10) {
    }
}
