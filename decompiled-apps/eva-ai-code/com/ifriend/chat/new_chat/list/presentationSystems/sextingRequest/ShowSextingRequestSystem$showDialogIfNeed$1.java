package com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShowSextingRequestSystem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest.ShowSextingRequestSystem", f = "ShowSextingRequestSystem.kt", i = {0, 1, 1, 1, 2, 2, 2, 2}, l = {93, 100, 101}, m = "showDialogIfNeed", n = {"this", "this", "isFlirtyBot", "countOfUserMessages", "this", "isFlirtyBot", "countOfUserMessages", "messagesToShowPopupForFlirtyUser"}, s = {"L$0", "L$0", "Z$0", "I$0", "L$0", "Z$0", "I$0", "I$1"})
/* loaded from: classes6.dex */
public final class ShowSextingRequestSystem$showDialogIfNeed$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ShowSextingRequestSystem this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowSextingRequestSystem$showDialogIfNeed$1(ShowSextingRequestSystem showSextingRequestSystem, Continuation<? super ShowSextingRequestSystem$showDialogIfNeed$1> continuation) {
        super(continuation);
        this.this$0 = showSextingRequestSystem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object showDialogIfNeed;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        showDialogIfNeed = this.this$0.showDialogIfNeed(this);
        return showDialogIfNeed;
    }
}
