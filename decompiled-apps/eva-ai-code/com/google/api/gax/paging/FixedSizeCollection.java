package com.google.api.gax.paging;
/* loaded from: classes7.dex */
public interface FixedSizeCollection<ResourceT> {
    int getCollectionSize();

    FixedSizeCollection<ResourceT> getNextCollection();

    String getNextPageToken();

    Iterable<ResourceT> getValues();

    boolean hasNextCollection();
}
