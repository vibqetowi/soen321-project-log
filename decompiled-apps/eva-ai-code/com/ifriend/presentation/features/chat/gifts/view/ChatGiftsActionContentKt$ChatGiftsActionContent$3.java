package com.ifriend.presentation.features.chat.gifts.view;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.ifriend.presentation.R;
import com.ifriend.presentation.features.chat.gifts.model.ChatGiftUi;
import com.ifriend.presentation.features.chat.gifts.model.ChatGiftsUiState;
import com.ifriend.ui.components.buttons.TranslucentButtonKt;
import com.ifriend.ui.components.image.AppAsyncImageKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatGiftsActionContent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedVisibilityScope;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatGiftsActionContentKt$ChatGiftsActionContent$3 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function0<Unit> $onGiftsClick;
    final /* synthetic */ ChatGiftsUiState $uiState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatGiftsActionContentKt$ChatGiftsActionContent$3(Function0<Unit> function0, int i, ChatGiftsUiState chatGiftsUiState) {
        super(3);
        this.$onGiftsClick = function0;
        this.$$dirty = i;
        this.$uiState = chatGiftsUiState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1207704764, i, -1, "com.ifriend.presentation.features.chat.gifts.view.ChatGiftsActionContent.<anonymous> (ChatGiftsActionContent.kt:43)");
        }
        TranslucentButtonKt.TranslucentButton(this.$onGiftsClick, SizeKt.m795size3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(80)), 0.0f, false, null, ComposableLambdaKt.composableLambda(composer, -1473825056, true, new AnonymousClass1(this.$uiState)), composer, ((this.$$dirty >> 6) & 14) | 196656, 28);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatGiftsActionContent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.gifts.view.ChatGiftsActionContentKt$ChatGiftsActionContent$3$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {
        final /* synthetic */ ChatGiftsUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ChatGiftsUiState chatGiftsUiState) {
            super(3);
            this.$uiState = chatGiftsUiState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope TranslucentButton, Composer composer, int i) {
            int i2;
            Painter painterResource;
            Intrinsics.checkNotNullParameter(TranslucentButton, "$this$TranslucentButton");
            if ((i & 14) == 0) {
                i2 = (composer.changed(TranslucentButton) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 91) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1473825056, i, -1, "com.ifriend.presentation.features.chat.gifts.view.ChatGiftsActionContent.<anonymous>.<anonymous> (ChatGiftsActionContent.kt:47)");
                }
                float f = 16;
                BoxKt.Box(TranslucentButton.align(BackgroundKt.background$default(SizeKt.m797sizeVpY3zN4(Modifier.Companion, Dp.m5607constructorimpl(55), Dp.m5607constructorimpl(45)), ChatGiftsActionContentKt.getBrush(), RoundedCornerShapeKt.m1011RoundedCornerShapea9UjIt4$default(Dp.m5607constructorimpl(f), 0.0f, 0.0f, Dp.m5607constructorimpl(f), 6, null), 0.0f, 4, null), Alignment.Companion.getCenterEnd()), composer, 0);
                ChatGiftUi buttonGift = this.$uiState.getButtonGift();
                if (buttonGift != null) {
                    AppAsyncImageKt.AppAsyncImage(buttonGift.getImageUrl(), SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, null, null, new ColorPainter(Color.Companion.m3326getTransparent0d7_KjU(), null), new ColorPainter(Color.Companion.m3326getTransparent0d7_KjU(), null), composer, 2359344, 28);
                    Modifier align = TranslucentButton.align(SizeKt.m800width3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(57)), Alignment.Companion.getBottomCenter());
                    if (buttonGift.isFree()) {
                        composer.startReplaceableGroup(820545991);
                        painterResource = PainterResources_androidKt.painterResource(R.drawable.img_free_gift_lable, composer, 0);
                        composer.endReplaceableGroup();
                    } else {
                        composer.startReplaceableGroup(820546097);
                        painterResource = PainterResources_androidKt.painterResource(R.drawable.img_gift_lable, composer, 0);
                        composer.endReplaceableGroup();
                    }
                    ImageKt.Image(painterResource, "", align, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 56, 120);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }
}
