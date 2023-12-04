package com.ifriend.ui.features.pager;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HorizontalSelectChatPageContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HorizontalSelectChatPageContentKt$SelectChatAvatarContent$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $isVerified;
    final /* synthetic */ String $logoUrl;
    final /* synthetic */ String $name;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalSelectChatPageContentKt$SelectChatAvatarContent$2(String str, String str2, boolean z, int i) {
        super(2);
        this.$name = str;
        this.$logoUrl = str2;
        this.$isVerified = z;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        HorizontalSelectChatPageContentKt.SelectChatAvatarContent(this.$name, this.$logoUrl, this.$isVerified, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
