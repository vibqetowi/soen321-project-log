package com.ifriend.data.config.parser;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FirebaseRemoteConfigParserImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.config.parser.FirebaseRemoteConfigParserImpl", f = "FirebaseRemoteConfigParserImpl.kt", i = {0, 0, 0}, l = {26}, m = "parse", n = {"this", "destination$iv$iv", "entry"}, s = {"L$0", "L$1", "L$3"})
/* loaded from: classes6.dex */
public final class FirebaseRemoteConfigParserImpl$parse$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FirebaseRemoteConfigParserImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseRemoteConfigParserImpl$parse$1(FirebaseRemoteConfigParserImpl firebaseRemoteConfigParserImpl, Continuation<? super FirebaseRemoteConfigParserImpl$parse$1> continuation) {
        super(continuation);
        this.this$0 = firebaseRemoteConfigParserImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.parse(null, this);
    }
}
