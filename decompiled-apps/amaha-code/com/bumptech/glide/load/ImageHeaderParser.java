package com.bumptech.glide.load;

import java.io.InputStream;
import java.nio.ByteBuffer;
import l4.b;
/* loaded from: classes.dex */
public interface ImageHeaderParser {

    /* loaded from: classes.dex */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        

        /* renamed from: u  reason: collision with root package name */
        public final boolean f5966u;

        ImageType(boolean z10) {
            this.f5966u = z10;
        }

        public boolean hasAlpha() {
            return this.f5966u;
        }
    }

    ImageType a(ByteBuffer byteBuffer);

    ImageType b(InputStream inputStream);

    int c(InputStream inputStream, b bVar);
}
