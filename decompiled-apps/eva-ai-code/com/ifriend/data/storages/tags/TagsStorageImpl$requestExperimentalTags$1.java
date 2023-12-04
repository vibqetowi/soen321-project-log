package com.ifriend.data.storages.tags;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TagsStorageImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.storages.tags.TagsStorageImpl", f = "TagsStorageImpl.kt", i = {0}, l = {78}, m = "requestExperimentalTags", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class TagsStorageImpl$requestExperimentalTags$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TagsStorageImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagsStorageImpl$requestExperimentalTags$1(TagsStorageImpl tagsStorageImpl, Continuation<? super TagsStorageImpl$requestExperimentalTags$1> continuation) {
        super(continuation);
        this.this$0 = tagsStorageImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object requestExperimentalTags;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        requestExperimentalTags = this.this$0.requestExperimentalTags(null, null, this);
        return requestExperimentalTags;
    }
}
