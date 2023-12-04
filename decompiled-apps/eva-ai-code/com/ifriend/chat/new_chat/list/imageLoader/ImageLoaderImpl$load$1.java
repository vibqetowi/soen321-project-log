package com.ifriend.chat.new_chat.list.imageLoader;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ImageLoaderImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.chat.new_chat.list.imageLoader.ImageLoaderImpl", f = "ImageLoaderImpl.kt", i = {0}, l = {34}, m = "load", n = {ViewHierarchyConstants.VIEW_KEY}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class ImageLoaderImpl$load$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ImageLoaderImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderImpl$load$1(ImageLoaderImpl imageLoaderImpl, Continuation<? super ImageLoaderImpl$load$1> continuation) {
        super(continuation);
        this.this$0 = imageLoaderImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.load(null, null, null, this);
    }
}
