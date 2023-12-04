package com.ifriend.presentation.features.profile.header.view;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.profileinstaller.ProfileVerifier;
import com.ifriend.presentation.R;
import com.ifriend.presentation.features.profile.header.model.ChatHeaderUiState;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatHeaderContent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedVisibilityScope;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatHeaderContentKt$ChatScreenHeaderContent$1$1 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ChatHeaderClicks $clicks;
    final /* synthetic */ ChatHeaderUiState $state;
    final /* synthetic */ RowScope $this_Row;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatHeaderContentKt$ChatScreenHeaderContent$1$1(ChatHeaderClicks chatHeaderClicks, RowScope rowScope, ChatHeaderUiState chatHeaderUiState, int i) {
        super(3);
        this.$clicks = chatHeaderClicks;
        this.$this_Row = rowScope;
        this.$state = chatHeaderUiState;
        this.$$changed = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatHeaderContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.profile.header.view.ChatHeaderContentKt$ChatScreenHeaderContent$1$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ ChatHeaderUiState $state;
        final /* synthetic */ RowScope $this_Row;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RowScope rowScope, ChatHeaderUiState chatHeaderUiState, int i) {
            super(2);
            this.$this_Row = rowScope;
            this.$state = chatHeaderUiState;
            this.$$changed = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1620357418, i, -1, "com.ifriend.presentation.features.profile.header.view.ChatScreenHeaderContent.<anonymous>.<anonymous>.<anonymous> (ChatHeaderContent.kt:103)");
                }
                IconKt.m1828Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_menu, composer, 0), StringResources_androidKt.stringResource(R.string.content_description__back_button, composer, 0), (Modifier) null, AppTheme.INSTANCE.getColors(composer, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), composer, 8, 4);
                AnimatedVisibilityKt.AnimatedVisibility(this.$this_Row, this.$state.isVisibleMenuIndicator(), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableSingletons$ChatHeaderContentKt.INSTANCE.m6946getLambda1$presentation_release(), composer, 1572864 | (this.$$changed & 14), 30);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-10308461, i, -1, "com.ifriend.presentation.features.profile.header.view.ChatScreenHeaderContent.<anonymous>.<anonymous> (ChatHeaderContent.kt:102)");
        }
        IconButtonKt.IconButton(this.$clicks.getOnMenuClick(), null, false, null, null, ComposableLambdaKt.composableLambda(composer, -1620357418, true, new AnonymousClass1(this.$this_Row, this.$state, this.$$changed)), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
