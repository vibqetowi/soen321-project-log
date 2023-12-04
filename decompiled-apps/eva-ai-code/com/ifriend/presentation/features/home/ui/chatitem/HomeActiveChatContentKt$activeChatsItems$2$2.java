package com.ifriend.presentation.features.home.ui.chatitem;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: HomeActiveChatContent.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class HomeActiveChatContentKt$activeChatsItems$2$2 extends Lambda implements Function1<Modifier, Modifier> {
    public static final HomeActiveChatContentKt$activeChatsItems$2$2 INSTANCE = new HomeActiveChatContentKt$activeChatsItems$2$2();

    HomeActiveChatContentKt$activeChatsItems$2$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Modifier invoke(Modifier conditional) {
        Modifier homeChatCardBorder;
        Intrinsics.checkNotNullParameter(conditional, "$this$conditional");
        homeChatCardBorder = HomeActiveChatContentKt.homeChatCardBorder(conditional);
        return homeChatCardBorder;
    }
}
