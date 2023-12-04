package com.ifriend.data.config.parser;

import com.google.zxing.pdf417.PDF417Common;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FirebaseRemoteConfigParserImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.config.parser.FirebaseRemoteConfigParserImpl", f = "FirebaseRemoteConfigParserImpl.kt", i = {0, 0}, l = {PDF417Common.MAX_ROWS_IN_BARCODE}, m = "mapValue", n = {"this", "value"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class FirebaseRemoteConfigParserImpl$mapValue$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FirebaseRemoteConfigParserImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseRemoteConfigParserImpl$mapValue$1(FirebaseRemoteConfigParserImpl firebaseRemoteConfigParserImpl, Continuation<? super FirebaseRemoteConfigParserImpl$mapValue$1> continuation) {
        super(continuation);
        this.this$0 = firebaseRemoteConfigParserImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object mapValue;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        mapValue = this.this$0.mapValue(null, this);
        return mapValue;
    }
}
