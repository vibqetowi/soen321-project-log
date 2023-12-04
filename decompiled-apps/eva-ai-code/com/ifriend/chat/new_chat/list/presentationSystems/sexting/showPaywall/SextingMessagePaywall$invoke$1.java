package com.ifriend.chat.new_chat.list.presentationSystems.sexting.showPaywall;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SextingMessagePaywall.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.chat.new_chat.list.presentationSystems.sexting.showPaywall.SextingMessagePaywall", f = "SextingMessagePaywall.kt", i = {0, 0, 0, 0}, l = {30, 65}, m = "invoke", n = {"this", "messageIds", "onResult", "requestId"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes6.dex */
public final class SextingMessagePaywall$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SextingMessagePaywall this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SextingMessagePaywall$invoke$1(SextingMessagePaywall sextingMessagePaywall, Continuation<? super SextingMessagePaywall$invoke$1> continuation) {
        super(continuation);
        this.this$0 = sextingMessagePaywall;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, this);
    }
}
