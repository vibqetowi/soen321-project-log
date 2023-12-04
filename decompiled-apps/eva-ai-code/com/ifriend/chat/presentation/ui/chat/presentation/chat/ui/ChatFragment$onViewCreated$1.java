package com.ifriend.chat.presentation.ui.chat.presentation.chat.ui;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
/* compiled from: ChatFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class ChatFragment$onViewCreated$1 extends FunctionReferenceImpl implements Function1<Uri, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ChatFragment$onViewCreated$1(Object obj) {
        super(1, obj, ChatFragment.class, "openPreviewSendImage", "openPreviewSendImage(Landroid/net/Uri;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Uri uri) {
        invoke2(uri);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Uri uri) {
        ((ChatFragment) this.receiver).openPreviewSendImage(uri);
    }
}
