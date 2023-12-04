package com.ifriend.data.socket.mapper;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JsonToChatMessageMapper.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.socket.mapper.JsonToChatMessageMapper", f = "JsonToChatMessageMapper.kt", i = {}, l = {24}, m = "map", n = {}, s = {})
/* loaded from: classes6.dex */
public final class JsonToChatMessageMapper$map$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ JsonToChatMessageMapper this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonToChatMessageMapper$map$1(JsonToChatMessageMapper jsonToChatMessageMapper, Continuation<? super JsonToChatMessageMapper$map$1> continuation) {
        super(continuation);
        this.this$0 = jsonToChatMessageMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.map(null, this);
    }
}
