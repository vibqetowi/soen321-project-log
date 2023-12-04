package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.CacheKeyFactory;
/* loaded from: classes2.dex */
public interface CacheKeyFactory {
    public static final CacheKeyFactory DEFAULT = new CacheKeyFactory() { // from class: com.google.android.exoplayer2.upstream.cache.CacheKeyFactory$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.upstream.cache.CacheKeyFactory
        public final String buildCacheKey(DataSpec dataSpec) {
            return CacheKeyFactory.CC.lambda$static$0(dataSpec);
        }
    };

    String buildCacheKey(DataSpec dataSpec);

    /* renamed from: com.google.android.exoplayer2.upstream.cache.CacheKeyFactory$-CC  reason: invalid class name */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        static {
            CacheKeyFactory cacheKeyFactory = CacheKeyFactory.DEFAULT;
        }

        public static /* synthetic */ String lambda$static$0(DataSpec dataSpec) {
            return dataSpec.key != null ? dataSpec.key : dataSpec.uri.toString();
        }
    }
}
