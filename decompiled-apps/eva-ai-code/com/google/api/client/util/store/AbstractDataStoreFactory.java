package com.google.api.client.util.store;

import com.google.api.client.util.Maps;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
/* loaded from: classes7.dex */
public abstract class AbstractDataStoreFactory implements DataStoreFactory {
    private static final Pattern ID_PATTERN = Pattern.compile("\\w{1,30}");
    private final Lock lock = new ReentrantLock();
    private final Map<String, DataStore<? extends Serializable>> dataStoreMap = Maps.newHashMap();

    protected abstract <V extends Serializable> DataStore<V> createDataStore(String str) throws IOException;

    @Override // com.google.api.client.util.store.DataStoreFactory
    public final <V extends Serializable> DataStore<V> getDataStore(String str) throws IOException {
        Pattern pattern = ID_PATTERN;
        Preconditions.checkArgument(pattern.matcher(str).matches(), "%s does not match pattern %s", str, pattern);
        this.lock.lock();
        try {
            DataStore<? extends Serializable> dataStore = this.dataStoreMap.get(str);
            if (dataStore == null) {
                dataStore = createDataStore(str);
                this.dataStoreMap.put(str, dataStore);
            }
            return dataStore;
        } finally {
            this.lock.unlock();
        }
    }
}
