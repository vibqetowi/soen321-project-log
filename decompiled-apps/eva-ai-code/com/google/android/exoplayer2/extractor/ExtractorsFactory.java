package com.google.android.exoplayer2.extractor;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public interface ExtractorsFactory {
    public static final ExtractorsFactory EMPTY = new ExtractorsFactory() { // from class: com.google.android.exoplayer2.extractor.ExtractorsFactory$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return ExtractorsFactory.CC.lambda$static$0();
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
            Extractor[] createExtractors;
            createExtractors = createExtractors();
            return createExtractors;
        }
    };

    Extractor[] createExtractors();

    Extractor[] createExtractors(Uri uri, Map<String, List<String>> map);

    /* renamed from: com.google.android.exoplayer2.extractor.ExtractorsFactory$-CC  reason: invalid class name */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        static {
            ExtractorsFactory extractorsFactory = ExtractorsFactory.EMPTY;
        }

        public static /* synthetic */ Extractor[] lambda$static$0() {
            return new Extractor[0];
        }
    }
}
