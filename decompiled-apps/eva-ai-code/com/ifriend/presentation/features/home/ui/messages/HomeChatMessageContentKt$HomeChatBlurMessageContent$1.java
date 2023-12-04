package com.ifriend.presentation.features.home.ui.messages;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.presentation.features.home.ui.models.HomeLastChatMessageUi;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HomeChatMessageContent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeChatMessageContentKt$HomeChatBlurMessageContent$1 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {
    final /* synthetic */ HomeLastChatMessageUi.Text $message;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeChatMessageContentKt$HomeChatBlurMessageContent$1(HomeLastChatMessageUi.Text text) {
        super(3);
        this.$message = text;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        invoke(boxScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BoxScope SextingShadowContainer, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(SextingShadowContainer, "$this$SextingShadowContainer");
        if ((i & 14) == 0) {
            i2 = (composer.changed(SextingShadowContainer) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1645092265, i, -1, "com.ifriend.presentation.features.home.ui.messages.HomeChatBlurMessageContent.<anonymous> (HomeChatMessageContent.kt:83)");
            }
            TextKt.m2145Text4IGK_g(this.$message.getText(), SextingShadowContainer.align(Modifier.Companion, Alignment.Companion.getCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, AppTheme.INSTANCE.getTypography(composer, AppTheme.$stable).getDescriptionItem(), composer, 0, (int) CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 57340);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
