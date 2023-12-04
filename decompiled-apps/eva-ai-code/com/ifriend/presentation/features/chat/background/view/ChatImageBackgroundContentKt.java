package com.ifriend.presentation.features.chat.background.view;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.location.LocationRequestCompat;
import coil.ImageLoader;
import coil.compose.AsyncImagePainterKt;
import coil.request.CachePolicy;
import coil.request.ImageRequest;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import com.ifriend.ui.components.modifier.ConditionalModifierKt;
import com.ifriend.ui.components.providers.AppLocalProviderKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatImageBackgroundContent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"ChatImageBackgroundContent", "", "uiState", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$UiState;", "imageLoader", "Lcoil/ImageLoader;", "(Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel$UiState;Lcoil/ImageLoader;Landroidx/compose/runtime/Composer;II)V", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatImageBackgroundContentKt {
    public static final void ChatImageBackgroundContent(ChatViewModel.UiState uiState, ImageLoader imageLoader, Composer composer, int i, int i2) {
        ImageLoader imageLoader2;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Composer startRestartGroup = composer.startRestartGroup(999876925);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChatImageBackgroundContent)P(1)");
        if ((i2 & 2) != 0) {
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(AppLocalProviderKt.getLocalAppImageLoaderProvider());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            imageLoader2 = (ImageLoader) consume;
        } else {
            imageLoader2 = imageLoader;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(999876925, i, -1, "com.ifriend.presentation.features.chat.background.view.ChatImageBackgroundContent (ChatImageBackgroundContent.kt:27)");
        }
        long m6925getGradientColor0d7_KjU = uiState.m6925getGradientColor0d7_KjU();
        if (uiState.getImageBgState().length() > 0) {
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            boolean z = !Color.m3292equalsimpl0(m6925getGradientColor0d7_KjU, Color.Companion.m3326getTransparent0d7_KjU());
            Color m3281boximpl = Color.m3281boximpl(m6925getGradientColor0d7_KjU);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(m3281boximpl);
            ChatImageBackgroundContentKt$ChatImageBackgroundContent$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ChatImageBackgroundContentKt$ChatImageBackgroundContent$1$1(m6925getGradientColor0d7_KjU);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier conditional = ConditionalModifierKt.conditional(fillMaxSize$default, z, (Function1) rememberedValue);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(conditional);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ImageKt.Image(AsyncImagePainterKt.m6162rememberAsyncImagePainter5jETZwI(new ImageRequest.Builder((Context) consume2).data(uiState.getImageBgState()).diskCachePolicy(CachePolicy.ENABLED).build(), imageLoader2, null, null, null, 0, startRestartGroup, 72, 60), "", BoxScopeInstance.INSTANCE.align(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Alignment.Companion.getBottomCenter()), (Alignment) null, ContentScale.Companion.getFillWidth(), 0.0f, (ColorFilter) null, startRestartGroup, 24624, (int) LocationRequestCompat.QUALITY_LOW_POWER);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ChatImageBackgroundContentKt$ChatImageBackgroundContent$3(uiState, imageLoader2, i, i2));
    }
}
