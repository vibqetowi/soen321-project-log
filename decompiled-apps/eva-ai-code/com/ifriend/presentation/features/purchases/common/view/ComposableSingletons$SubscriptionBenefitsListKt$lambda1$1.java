package com.ifriend.presentation.features.purchases.common.view;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.ifriend.presentation.features.purchases.common.model.SubscriptionBenefitsGroupUiParams;
import com.ifriend.presentation.features.purchases.common.model.SubscriptionBenefitsUiParams;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ExtensionsKt;
/* compiled from: SubscriptionBenefitsList.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.presentation.features.purchases.common.view.ComposableSingletons$SubscriptionBenefitsListKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$SubscriptionBenefitsListKt$lambda1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$SubscriptionBenefitsListKt$lambda1$1 INSTANCE = new ComposableSingletons$SubscriptionBenefitsListKt$lambda1$1();

    ComposableSingletons$SubscriptionBenefitsListKt$lambda1$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-80546315, i, -1, "com.ifriend.presentation.features.purchases.common.view.ComposableSingletons$SubscriptionBenefitsListKt.lambda-1.<anonymous> (SubscriptionBenefitsList.kt:193)");
            }
            SubscriptionBenefitsListKt.m6988SubscriptionBenefitsList6a0pyJM(ExtensionsKt.persistentListOf(new SubscriptionBenefitsGroupUiParams("Enhance your experience 1", ExtensionsKt.persistentListOf(new SubscriptionBenefitsUiParams("The official digital copy of Eva Elfie", null, null, null, 14, null), new SubscriptionBenefitsUiParams("New Avatar experience", null, null, null, 14, null), new SubscriptionBenefitsUiParams("Endless sexting possibilities", null, "Get access to the most up-to-date EVA-GPT", null, 10, null), new SubscriptionBenefitsUiParams("Personalized daily photos", null, null, null, 14, null), new SubscriptionBenefitsUiParams("Smarter EVA-GPT model", null, null, null, 14, null))), new SubscriptionBenefitsGroupUiParams("Enhance your experience 2", ExtensionsKt.persistentListOf(new SubscriptionBenefitsUiParams("The official digital copy of Eva Elfie", null, null, null, 14, null), new SubscriptionBenefitsUiParams("New Avatar experience", null, null, null, 14, null), new SubscriptionBenefitsUiParams("Endless sexting possibilities", null, "Get access to the most up-to-date EVA-GPT", null, 10, null), new SubscriptionBenefitsUiParams("Personalized daily photos", null, null, null, 14, null), new SubscriptionBenefitsUiParams("Smarter EVA-GPT model", null, null, null, 14, null))), new SubscriptionBenefitsGroupUiParams("Enhance your experience 3", ExtensionsKt.persistentListOf(new SubscriptionBenefitsUiParams("The official digital copy of Eva Elfie", null, null, null, 14, null), new SubscriptionBenefitsUiParams("New Avatar experience", null, null, null, 14, null), new SubscriptionBenefitsUiParams("Endless sexting possibilities", null, "Get access to the most up-to-date EVA-GPT", null, 10, null), new SubscriptionBenefitsUiParams("Personalized daily photos", null, null, null, 14, null), new SubscriptionBenefitsUiParams("Smarter EVA-GPT model", null, null, null, 14, null)))), PaddingKt.m752paddingqDBjuR0$default(PaddingKt.m750paddingVpY3zN4$default(Modifier.Companion, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7176getSmallD9Ej5fM(), 0.0f, 2, null), 0.0f, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7172getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
