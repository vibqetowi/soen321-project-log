package com.ifriend.presentation.features.home.ui.chatitem;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HomeChatCommonContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeChatCommonContentKt$HomeActiveChatMessageInfo$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $count;
    final /* synthetic */ long $countBoxColor;
    final /* synthetic */ long $countTextColor;
    final /* synthetic */ boolean $neomorphic;
    final /* synthetic */ String $time;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeChatCommonContentKt$HomeActiveChatMessageInfo$2(String str, String str2, boolean z, long j, long j2, int i, int i2) {
        super(2);
        this.$count = str;
        this.$time = str2;
        this.$neomorphic = z;
        this.$countTextColor = j;
        this.$countBoxColor = j2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        HomeChatCommonContentKt.m6931HomeActiveChatMessageInfojA1GFJw(this.$count, this.$time, this.$neomorphic, this.$countTextColor, this.$countBoxColor, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
