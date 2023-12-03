package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import c9.w;
import com.google.android.exoplayer2.decoder.DecoderException;
/* loaded from: classes.dex */
public class MediaCodecDecoderException extends DecoderException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MediaCodecDecoderException(IllegalStateException illegalStateException, d dVar) {
        super(r4, illegalStateException);
        String str;
        String str2;
        if (dVar == null) {
            str = null;
        } else {
            str = dVar.f6638a;
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "Decoder failed: ".concat(valueOf);
        } else {
            str2 = new String("Decoder failed: ");
        }
        if (w.f5205a >= 21 && (illegalStateException instanceof MediaCodec.CodecException)) {
            ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
    }
}
