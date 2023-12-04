package com.ifriend.presentation.features.chat.intro.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatIntroPopup.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatIntroPopupKt$ChatIntroInfoRow$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ String $avatarUrl;
    final /* synthetic */ String $description;
    final /* synthetic */ String $name;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatIntroPopupKt$ChatIntroInfoRow$2(String str, String str2, String str3, int i) {
        super(2);
        this.$avatarUrl = str;
        this.$name = str2;
        this.$description = str3;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ChatIntroPopupKt.ChatIntroInfoRow(this.$avatarUrl, this.$name, this.$description, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
