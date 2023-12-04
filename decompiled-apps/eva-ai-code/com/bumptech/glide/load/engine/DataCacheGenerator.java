package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.engine.DataFetcherGenerator;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.util.pool.GlideTrace;
import java.io.File;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class DataCacheGenerator implements DataFetcherGenerator, DataFetcher.DataCallback<Object> {
    private File cacheFile;
    private final List<Key> cacheKeys;
    private final DataFetcherGenerator.FetcherReadyCallback cb;
    private final DecodeHelper<?> helper;
    private volatile ModelLoader.LoadData<?> loadData;
    private int modelLoaderIndex;
    private List<ModelLoader<File, ?>> modelLoaders;
    private int sourceIdIndex;
    private Key sourceKey;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataCacheGenerator(DecodeHelper<?> decodeHelper, DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback) {
        this(decodeHelper.getCacheKeys(), decodeHelper, fetcherReadyCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataCacheGenerator(List<Key> list, DecodeHelper<?> decodeHelper, DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback) {
        this.sourceIdIndex = -1;
        this.cacheKeys = list;
        this.helper = decodeHelper;
        this.cb = fetcherReadyCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (hasNextModelLoader() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        r0 = r7.modelLoaders;
        r3 = r7.modelLoaderIndex;
        r7.modelLoaderIndex = r3 + 1;
        r7.loadData = r0.get(r3).buildLoadData(r7.cacheFile, r7.helper.getWidth(), r7.helper.getHeight(), r7.helper.getOptions());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
        if (r7.loadData == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
        if (r7.helper.hasLoadPath(r7.loadData.fetcher.getDataClass()) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
        r7.loadData.fetcher.loadData(r7.helper.getPriority(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
        r7.loadData = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r1 != false) goto L30;
     */
    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean startNext() {
        GlideTrace.beginSection("DataCacheGenerator.startNext");
        while (true) {
            try {
                boolean z = false;
                if (this.modelLoaders != null && hasNextModelLoader()) {
                    break;
                }
                int i = this.sourceIdIndex + 1;
                this.sourceIdIndex = i;
                if (i >= this.cacheKeys.size()) {
                    return false;
                }
                Key key = this.cacheKeys.get(this.sourceIdIndex);
                File file = this.helper.getDiskCache().get(new DataCacheKey(key, this.helper.getSignature()));
                this.cacheFile = file;
                if (file != null) {
                    this.sourceKey = key;
                    this.modelLoaders = this.helper.getModelLoaders(file);
                    this.modelLoaderIndex = 0;
                }
            } finally {
                GlideTrace.endSection();
            }
        }
    }

    private boolean hasNextModelLoader() {
        return this.modelLoaderIndex < this.modelLoaders.size();
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public void cancel() {
        ModelLoader.LoadData<?> loadData = this.loadData;
        if (loadData != null) {
            loadData.fetcher.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public void onDataReady(Object obj) {
        this.cb.onDataFetcherReady(this.sourceKey, obj, this.loadData.fetcher, DataSource.DATA_DISK_CACHE, this.sourceKey);
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public void onLoadFailed(Exception exc) {
        this.cb.onDataFetcherFailed(this.sourceKey, exc, this.loadData.fetcher, DataSource.DATA_DISK_CACHE);
    }
}
