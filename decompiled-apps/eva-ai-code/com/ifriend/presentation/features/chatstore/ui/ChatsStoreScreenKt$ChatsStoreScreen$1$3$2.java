package com.ifriend.presentation.features.chatstore.ui;

import com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
/* compiled from: ChatsStoreScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class ChatsStoreScreenKt$ChatsStoreScreen$1$3$2 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ChatsStoreScreenKt$ChatsStoreScreen$1$3$2(Object obj) {
        super(1, obj, ChatsStoreViewModel.class, "onPageChanged", "onPageChanged(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        ((ChatsStoreViewModel) this.receiver).onPageChanged(i);
    }
}
