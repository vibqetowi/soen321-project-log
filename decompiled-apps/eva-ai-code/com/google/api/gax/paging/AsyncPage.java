package com.google.api.gax.paging;

import com.google.api.core.ApiFuture;
/* loaded from: classes7.dex */
public interface AsyncPage<ResourceT> extends Page<ResourceT> {
    ApiFuture<? extends AsyncPage<ResourceT>> getNextPageAsync();
}
