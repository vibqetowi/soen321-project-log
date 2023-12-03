package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.util.Log;
import c9.l;
import c9.w;
import com.google.android.exoplayer2.mediacodec.a;
import com.google.android.exoplayer2.mediacodec.c;
import com.google.android.exoplayer2.mediacodec.f;
import com.theinnerhour.b2b.utils.Constants;
import java.io.IOException;
/* compiled from: DefaultMediaCodecAdapterFactory.java */
/* loaded from: classes.dex */
public final class b implements c.b {
    @Override // com.google.android.exoplayer2.mediacodec.c.b
    public final c a(c.a aVar) {
        String str;
        String str2;
        if (w.f5205a >= 31) {
            int g5 = l.g(aVar.f6635c.F);
            switch (g5) {
                case -2:
                    str = Constants.SUBSCRIPTION_NONE;
                    break;
                case -1:
                default:
                    if (g5 >= 10000) {
                        StringBuilder sb2 = new StringBuilder(20);
                        sb2.append("custom (");
                        sb2.append(g5);
                        sb2.append(")");
                        str = sb2.toString();
                        break;
                    } else {
                        str = "?";
                        break;
                    }
                case 0:
                    str = "default";
                    break;
                case 1:
                    str = "audio";
                    break;
                case 2:
                    str = "video";
                    break;
                case 3:
                    str = "text";
                    break;
                case 4:
                    str = "image";
                    break;
                case 5:
                    str = "metadata";
                    break;
                case 6:
                    str = "camera motion";
                    break;
            }
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Creating an asynchronous MediaCodec adapter for track type ".concat(valueOf);
            } else {
                str2 = new String("Creating an asynchronous MediaCodec adapter for track type ");
            }
            Log.i("DefaultMediaCodecAdapterFactory", str2);
            return new a.C0136a(g5).a(aVar);
        }
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = f.a.b(aVar);
            kc.f.j("configureCodec");
            mediaCodec.configure(aVar.f6634b, aVar.f6636d, aVar.f6637e, 0);
            kc.f.B();
            kc.f.j("startCodec");
            mediaCodec.start();
            kc.f.B();
            return new f(mediaCodec);
        } catch (IOException | RuntimeException e10) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e10;
        }
    }
}
