package com.ifriend.presentation.features.profile.menu.view;

import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import com.ifriend.presentation.features.profile.menu.model.ProfileMenuUiState;
import com.ifriend.ui.theme.AppFontFamily;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ProfileMenuContent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "textRef", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "invoke", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ProfileMenuContentKt$ProfileMenuContent$1$2$5 extends Lambda implements Function4<ConstraintLayoutScope, ConstrainedLayoutReference, Composer, Integer, Unit> {
    final /* synthetic */ ProfileMenuUiState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileMenuContentKt$ProfileMenuContent$1$2$5(ProfileMenuUiState profileMenuUiState) {
        super(4);
        this.$state = profileMenuUiState;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(ConstraintLayoutScope constraintLayoutScope, ConstrainedLayoutReference constrainedLayoutReference, Composer composer, Integer num) {
        invoke(constraintLayoutScope, constrainedLayoutReference, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ConstraintLayoutScope ProfileMenuItem, ConstrainedLayoutReference textRef, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(ProfileMenuItem, "$this$ProfileMenuItem");
        Intrinsics.checkNotNullParameter(textRef, "textRef");
        if ((i & 14) == 0) {
            i2 = i | (composer.changed(ProfileMenuItem) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composer.changed(textRef) ? 32 : 16;
        }
        if ((i2 & 731) != 146 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2107029651, i2, -1, "com.ifriend.presentation.features.profile.menu.view.ProfileMenuContent.<anonymous>.<anonymous>.<anonymous> (ProfileMenuContent.kt:136)");
            }
            ConstrainedLayoutReference createRef = ProfileMenuItem.createRef();
            String neuronsCount = this.$state.getNeuronsCount();
            FontFamily ibmSans = AppFontFamily.INSTANCE.getIbmSans();
            FontWeight normal = FontWeight.Companion.getNormal();
            int m5474getStarte0LSkKk = TextAlign.Companion.m5474getStarte0LSkKk();
            long sp = TextUnitKt.getSp(18);
            long m7108getTextPrimary0d7_KjU = AppTheme.INSTANCE.getColors(composer, AppTheme.$stable).m7108getTextPrimary0d7_KjU();
            Modifier alpha = AlphaKt.alpha(Modifier.Companion, 0.7f);
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = composer.changed(textRef);
            ProfileMenuContentKt$ProfileMenuContent$1$2$5$1$1 rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ProfileMenuContentKt$ProfileMenuContent$1$2$5$1$1(textRef);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            TextKt.m2145Text4IGK_g(neuronsCount, ProfileMenuItem.constrainAs(alpha, createRef, (Function1) rememberedValue), m7108getTextPrimary0d7_KjU, sp, (FontStyle) null, normal, ibmSans, 0L, (TextDecoration) null, TextAlign.m5462boximpl(m5474getStarte0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 199680, 0, 130448);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
