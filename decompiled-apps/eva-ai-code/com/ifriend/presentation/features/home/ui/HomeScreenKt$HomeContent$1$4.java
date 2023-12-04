package com.ifriend.presentation.features.home.ui;

import com.ifriend.presentation.features.home.ui.models.HomeChatUi;
import com.ifriend.presentation.features.home.viewmodel.HomeViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: HomeScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class HomeScreenKt$HomeContent$1$4 extends FunctionReferenceImpl implements Function1<HomeChatUi, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public HomeScreenKt$HomeContent$1$4(Object obj) {
        super(1, obj, HomeViewModel.class, "onChatClick", "onChatClick(Lcom/ifriend/presentation/features/home/ui/models/HomeChatUi;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(HomeChatUi homeChatUi) {
        invoke2(homeChatUi);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(HomeChatUi p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((HomeViewModel) this.receiver).onChatClick(p0);
    }
}
