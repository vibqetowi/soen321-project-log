package com.google.firebase.database.core.persistence;
/* loaded from: classes.dex */
public interface CachePolicy {
    public static final CachePolicy NONE = new CachePolicy() { // from class: com.google.firebase.database.core.persistence.CachePolicy.1
        @Override // com.google.firebase.database.core.persistence.CachePolicy
        public long getMaxNumberOfQueriesToKeep() {
            return Long.MAX_VALUE;
        }

        @Override // com.google.firebase.database.core.persistence.CachePolicy
        public float getPercentOfQueriesToPruneAtOnce() {
            return 0.0f;
        }

        @Override // com.google.firebase.database.core.persistence.CachePolicy
        public boolean shouldCheckCacheSize(long j10) {
            return false;
        }

        @Override // com.google.firebase.database.core.persistence.CachePolicy
        public boolean shouldPrune(long j10, long j11) {
            return false;
        }
    };

    long getMaxNumberOfQueriesToKeep();

    float getPercentOfQueriesToPruneAtOnce();

    boolean shouldCheckCacheSize(long j10);

    boolean shouldPrune(long j10, long j11);
}
