package com.ifriend.data.networking.api.levels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LevelsApiDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.networking.api.levels.LevelsApiDelegate", f = "LevelsApiDelegate.kt", i = {}, l = {15}, m = "getLevelInfo", n = {}, s = {})
/* loaded from: classes6.dex */
public final class LevelsApiDelegate$getLevelInfo$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LevelsApiDelegate this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelsApiDelegate$getLevelInfo$1(LevelsApiDelegate levelsApiDelegate, Continuation<? super LevelsApiDelegate$getLevelInfo$1> continuation) {
        super(continuation);
        this.this$0 = levelsApiDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getLevelInfo(this);
    }
}
