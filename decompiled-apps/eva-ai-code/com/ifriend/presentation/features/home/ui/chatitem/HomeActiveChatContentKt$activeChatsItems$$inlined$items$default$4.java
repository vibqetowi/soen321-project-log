package com.ifriend.presentation.features.home.ui.chatitem;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.exifinterface.media.ExifInterface;
import com.ifriend.presentation.features.home.ui.models.HomeActiveChatUi;
import com.ifriend.presentation.features.home.ui.models.HomeChatUi;
import com.ifriend.presentation.features.home.ui.models.HomeUnavailableChatUi;
import com.ifriend.ui.components.modifier.ConditionalModifierKt;
import com.ifriend.ui.theme.AppTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: LazyDsl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V", "androidx/compose/foundation/lazy/LazyDslKt$items$4"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeActiveChatContentKt$activeChatsItems$$inlined$items$default$4 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ List $items;
    final /* synthetic */ Function1 $onChatClick$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeActiveChatContentKt$activeChatsItems$$inlined$items$default$4(List list, Function1 function1) {
        super(4);
        this.$items = list;
        this.$onChatClick$inlined = function1;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(items, "$this$items");
        ComposerKt.sourceInformation(composer, "C145@6530L22:LazyDsl.kt#428nma");
        if ((i2 & 14) == 0) {
            i3 = (composer.changed(items) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composer.changed(i) ? 32 : 16;
        }
        if ((i3 & 731) == 146 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:144)");
        }
        HomeChatUi homeChatUi = (HomeChatUi) this.$items.get(i);
        if (homeChatUi instanceof HomeActiveChatUi) {
            composer.startReplaceableGroup(-559150931);
            HomeActiveChatUi homeActiveChatUi = (HomeActiveChatUi) homeChatUi;
            HomeActiveChatContentKt.HomeActiveChatContent(LazyItemScope.CC.animateItemPlacement$default(items, PaddingKt.m751paddingqDBjuR0(ConditionalModifierKt.conditional(PaddingKt.m751paddingqDBjuR0(ClickableKt.m454clickableXHw0xAI$default(Modifier.Companion, false, null, null, new HomeActiveChatContentKt$activeChatsItems$2$1(this.$onChatClick$inlined, homeChatUi), 7, null), AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7175getMediumD9Ej5fM(), AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7178getSmallestD9Ej5fM(), AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7175getMediumD9Ej5fM(), AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7178getSmallestD9Ej5fM()), homeActiveChatUi.isInfluencer(), HomeActiveChatContentKt$activeChatsItems$2$2.INSTANCE), AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7168getExtraSmallD9Ej5fM(), AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7178getSmallestD9Ej5fM(), Dp.m5607constructorimpl(0), AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7178getSmallestD9Ej5fM()), null, 1, null), homeActiveChatUi, composer, 0, 0);
            composer.endReplaceableGroup();
        } else if (homeChatUi instanceof HomeUnavailableChatUi) {
            composer.startReplaceableGroup(-559149990);
            HomeUnavailableChatContentKt.HomeUnavailableChatContent(LazyItemScope.CC.animateItemPlacement$default(items, PaddingKt.m751paddingqDBjuR0(ClickableKt.m454clickableXHw0xAI$default(Modifier.Companion, false, null, null, new HomeActiveChatContentKt$activeChatsItems$2$3(this.$onChatClick$inlined, homeChatUi), 7, null), AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7175getMediumD9Ej5fM(), AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7178getSmallestD9Ej5fM(), AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7175getMediumD9Ej5fM(), AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7178getSmallestD9Ej5fM()), null, 1, null), (HomeUnavailableChatUi) homeChatUi, composer, 0, 0);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-559149455);
            composer.endReplaceableGroup();
            String simpleName = homeChatUi.getClass().getSimpleName();
            throw new IllegalArgumentException("Unknown active chat item class=" + simpleName);
        }
        HomeChatCommonContentKt.HomeChatItemDivider(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
