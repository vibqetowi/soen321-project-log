package com.ifriend.presentation.features.chat.intro.view;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatIntroPopup.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatIntroPopupKt$ChatIntroPopup$2 extends Lambda implements Function1<Integer, Integer> {
    public static final ChatIntroPopupKt$ChatIntroPopup$2 INSTANCE = new ChatIntroPopupKt$ChatIntroPopup$2();

    ChatIntroPopupKt$ChatIntroPopup$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final Integer invoke(int i) {
        return Integer.valueOf(i / 2);
    }
}
