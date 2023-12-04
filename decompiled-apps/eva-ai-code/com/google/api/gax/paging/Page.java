package com.google.api.gax.paging;
/* loaded from: classes7.dex */
public interface Page<ResourceT> {
    Page<ResourceT> getNextPage();

    String getNextPageToken();

    Iterable<ResourceT> getValues();

    boolean hasNextPage();

    Iterable<ResourceT> iterateAll();
}
