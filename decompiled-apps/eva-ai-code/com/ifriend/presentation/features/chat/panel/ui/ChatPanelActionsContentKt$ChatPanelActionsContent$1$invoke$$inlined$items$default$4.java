package com.ifriend.presentation.features.chat.panel.ui;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.exifinterface.media.ExifInterface;
import com.ifriend.presentation.features.chat.actions.ui.topics.ChatCallButtomKt;
import com.ifriend.presentation.features.chat.panel.models.ChatCallUi;
import com.ifriend.presentation.features.chat.panel.models.ChatDiaryUi;
import com.ifriend.presentation.features.chat.panel.models.ChatPanelActionMarker;
import com.ifriend.presentation.features.chat.panel.models.ChatPremiumTopicUi;
import com.ifriend.presentation.features.chat.panel.models.ChatTopicUi;
import com.ifriend.presentation.features.chat.panel.ui.topics.ChatPremiumTopicContentKt;
import com.ifriend.presentation.features.chat.panel.ui.topics.ChatTopicContentKt;
import com.ifriend.presentation.features.chat.panel.ui.topics.DiaryButtonKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: LazyDsl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V", "androidx/compose/foundation/lazy/LazyDslKt$items$4"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatPanelActionsContentKt$ChatPanelActionsContent$1$invoke$$inlined$items$default$4 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ List $items;
    final /* synthetic */ Function1 $onPanelActionClick$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPanelActionsContentKt$ChatPanelActionsContent$1$invoke$$inlined$items$default$4(List list, Function1 function1) {
        super(4);
        this.$items = list;
        this.$onPanelActionClick$inlined = function1;
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
        ChatPanelActionMarker chatPanelActionMarker = (ChatPanelActionMarker) this.$items.get(i);
        composer.startReplaceableGroup(-264211419);
        ComposerKt.sourceInformation(composer, "CC(rememberAction)P(1)");
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(chatPanelActionMarker);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = (Function0) new ChatPanelActionsContentKt$ChatPanelActionsContent$1$invoke$lambda$1$$inlined$rememberAction$1(this.$onPanelActionClick$inlined, chatPanelActionMarker);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceableGroup();
        if (chatPanelActionMarker instanceof ChatTopicUi) {
            composer.startReplaceableGroup(-1420440174);
            ChatTopicContentKt.ChatTopicContent((ChatTopicUi) chatPanelActionMarker, function0, composer, 0);
            composer.endReplaceableGroup();
        } else if (chatPanelActionMarker instanceof ChatPremiumTopicUi) {
            composer.startReplaceableGroup(-1420440017);
            ChatPremiumTopicContentKt.ChatPremiumTopicContent((ChatPremiumTopicUi) chatPanelActionMarker, function0, composer, 0);
            composer.endReplaceableGroup();
        } else if (chatPanelActionMarker instanceof ChatDiaryUi) {
            composer.startReplaceableGroup(-1420439860);
            DiaryButtonKt.ChatDiaryButton((ChatDiaryUi) chatPanelActionMarker, function0, composer, 0);
            composer.endReplaceableGroup();
        } else if (chatPanelActionMarker instanceof ChatCallUi) {
            composer.startReplaceableGroup(-1420439713);
            ChatCallButtomKt.ChatCallButton((ChatCallUi) chatPanelActionMarker, function0, composer, 0);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1420439568);
            composer.endReplaceableGroup();
            String simpleName = chatPanelActionMarker.getClass().getSimpleName();
            throw new IllegalArgumentException("Unknown chat  panel action class=" + simpleName);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
