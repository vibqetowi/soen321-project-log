package com.ifriend.presentation.features.home.delegates;

import io.grpc.netty.shaded.io.netty.internal.tcnative.SSL;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HomeHandleDeepLinksDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.presentation.features.home.delegates.HomeHandleDeepLinksDelegateImpl", f = "HomeHandleDeepLinksDelegate.kt", i = {0}, l = {LockFreeTaskQueueCore.CLOSED_SHIFT, SSL.SSL_PROTOCOL_TLS}, m = "navigateToDefaultChat", n = {"$this$navigateToDefaultChat"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class HomeHandleDeepLinksDelegateImpl$navigateToDefaultChat$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeHandleDeepLinksDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeHandleDeepLinksDelegateImpl$navigateToDefaultChat$1(HomeHandleDeepLinksDelegateImpl homeHandleDeepLinksDelegateImpl, Continuation<? super HomeHandleDeepLinksDelegateImpl$navigateToDefaultChat$1> continuation) {
        super(continuation);
        this.this$0 = homeHandleDeepLinksDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object navigateToDefaultChat;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        navigateToDefaultChat = this.this$0.navigateToDefaultChat(null, this);
        return navigateToDefaultChat;
    }
}
