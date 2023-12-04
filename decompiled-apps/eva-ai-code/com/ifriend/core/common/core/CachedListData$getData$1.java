package com.ifriend.core.common.core;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CachedData.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.core.common.core.CachedListData", f = "CachedData.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL}, m = "getData", n = {}, s = {})
/* loaded from: classes6.dex */
public final class CachedListData$getData$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CachedListData<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedListData$getData$1(CachedListData<T> cachedListData, Continuation<? super CachedListData$getData$1> continuation) {
        super(continuation);
        this.this$0 = cachedListData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getData(this);
    }
}
