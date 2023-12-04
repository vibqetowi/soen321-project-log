package com.ifriend.presentation.features.profile.menu.view;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.ifriend.ui.R;
import com.ifriend.ui.theme.AppFontFamily;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* compiled from: ConstraintLayout.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProfileMenuContentKt$UpgradeItem$$inlined$ConstraintLayout$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function0 $onHelpersChanged;
    final /* synthetic */ ConstraintLayoutScope $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileMenuContentKt$UpgradeItem$$inlined$ConstraintLayout$2(ConstraintLayoutScope constraintLayoutScope, int i, Function0 function0) {
        super(2);
        this.$scope = constraintLayoutScope;
        this.$onHelpersChanged = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if (((i & 11) ^ 2) != 0 || !composer.getSkipping()) {
            int helpersHashCode = this.$scope.getHelpersHashCode();
            this.$scope.reset();
            ConstraintLayoutScope constraintLayoutScope = this.$scope;
            ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope.createRefs();
            ConstrainedLayoutReference component1 = createRefs.component1();
            ConstrainedLayoutReference component2 = createRefs.component2();
            ConstrainedLayoutReference component3 = createRefs.component3();
            Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.background_upgrade, composer, 0);
            Modifier m800width3ABfNKs = SizeKt.m800width3ABfNKs(SizeKt.m781height3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(140)), Dp.m5607constructorimpl((float) PsExtractor.VIDEO_STREAM_MASK));
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = composer.changed(component1);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = (Function1) new ProfileMenuContentKt$UpgradeItem$1$1$1(component1);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            ImageKt.Image(painterResource, (String) null, constraintLayoutScope.constrainAs(m800width3ABfNKs, component2, (Function1) rememberedValue), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 120);
            Painter painterResource2 = PainterResources_androidKt.painterResource(R.drawable.upgrade_image, composer, 0);
            Modifier m781height3ABfNKs = SizeKt.m781height3ABfNKs(SizeKt.m800width3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(26)), Dp.m5607constructorimpl(40));
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed2 = composer.changed(component1);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = (Function1) new ProfileMenuContentKt$UpgradeItem$1$2$1(component1);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            ImageKt.Image(painterResource2, (String) null, constraintLayoutScope.constrainAs(m781height3ABfNKs, component3, (Function1) rememberedValue2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 120);
            String stringResource = StringResources_androidKt.stringResource(com.ifriend.presentation.R.string.profile_menu__upgrade, composer, 0);
            FontFamily ibmSans = AppFontFamily.INSTANCE.getIbmSans();
            FontWeight bold = FontWeight.Companion.getBold();
            long sp = TextUnitKt.getSp(24);
            int m5469getCentere0LSkKk = TextAlign.Companion.m5469getCentere0LSkKk();
            TextKt.m2145Text4IGK_g(stringResource, constraintLayoutScope.constrainAs(PaddingKt.m750paddingVpY3zN4$default(Modifier.Companion, 0.0f, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7175getMediumD9Ej5fM(), 1, null), component1, ProfileMenuContentKt$UpgradeItem$1$3.INSTANCE), AppTheme.INSTANCE.getColors(composer, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), sp, (FontStyle) null, bold, ibmSans, 0L, (TextDecoration) null, TextAlign.m5462boximpl(m5469getCentere0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 199680, 0, 130448);
            if (this.$scope.getHelpersHashCode() != helpersHashCode) {
                this.$onHelpersChanged.invoke();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
