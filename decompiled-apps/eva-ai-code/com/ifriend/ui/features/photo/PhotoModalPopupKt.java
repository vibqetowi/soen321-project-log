package com.ifriend.ui.features.photo;

import android.content.Context;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.location.LocationRequestCompat;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import coil.compose.AsyncImagePainterKt;
import coil.request.CachePolicy;
import coil.request.ImageRequest;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.ui.components.popup.AnimatedPopupKt;
import com.ifriend.ui.components.providers.AppLocalProviderKt;
import com.ifriend.ui.theme.AppTheme;
import com.ifriend.ui.theme.AppThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PhotoModalPopup.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\b\u001a:\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00010\rj\u0002`\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u0010H\u0003¢\u0006\u0002\u0010\u0011\u001a/\u0010\u0012\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\f\u001a\f\u0012\u0004\u0012\u00020\u00010\rj\u0002`\u000eH\u0007¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0015¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u008e\u0002"}, d2 = {"AsyncPhotoContent", "", "modifier", "Landroidx/compose/ui/Modifier;", "imageUrl", "", "imageLoader", "Lcoil/ImageLoader;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcoil/ImageLoader;Landroidx/compose/runtime/Composer;II)V", "ModalPopupPhoto", "isVisible", "", "onDismiss", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", FirebaseAnalytics.Param.CONTENT, "Landroidx/compose/runtime/Composable;", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "PhotoModalPopup", "(ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PhotoModalPopupPreview", "(Landroidx/compose/runtime/Composer;I)V", "common_ui_release", "scale", "", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Offset;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PhotoModalPopupKt {
    public static final void PhotoModalPopupPreview(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(1117454505);
        ComposerKt.sourceInformation(startRestartGroup, "C(PhotoModalPopupPreview)");
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1117454505, i, -1, "com.ifriend.ui.features.photo.PhotoModalPopupPreview (PhotoModalPopup.kt:54)");
            }
            AppThemeKt.AppTheme(null, null, null, null, ComposableSingletons$PhotoModalPopupKt.INSTANCE.m7084getLambda3$common_ui_release(), startRestartGroup, 24576, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new PhotoModalPopupKt$PhotoModalPopupPreview$1(i));
    }

    public static final void PhotoModalPopup(boolean z, String imageUrl, Function0<Unit> onDismiss, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(-1119919258);
        ComposerKt.sourceInformation(startRestartGroup, "C(PhotoModalPopup)P(1)");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(imageUrl) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(onDismiss) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1119919258, i2, -1, "com.ifriend.ui.features.photo.PhotoModalPopup (PhotoModalPopup.kt:77)");
            }
            ModalPopupPhoto(z, onDismiss, ComposableLambdaKt.composableLambda(startRestartGroup, 2100411372, true, new PhotoModalPopupKt$PhotoModalPopup$1(imageUrl, i2, onDismiss)), startRestartGroup, ((i2 >> 3) & 112) | (i2 & 14) | 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new PhotoModalPopupKt$PhotoModalPopup$2(z, imageUrl, onDismiss, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x035d  */
    /* JADX WARN: Type inference failed for: r11v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AsyncPhotoContent(Modifier modifier, String str, ImageLoader imageLoader, Composer composer, int i, int i2) {
        int i3;
        int i4;
        ImageLoader imageLoader2;
        AsyncImagePainter m6162rememberAsyncImagePainter5jETZwI;
        int currentCompositeKeyHash;
        Composer m2893constructorimpl;
        BoxScopeInstance boxScopeInstance;
        Object rememberedValue;
        Object rememberedValue2;
        Object rememberedValue3;
        boolean changed;
        PhotoModalPopupKt$AsyncPhotoContent$1$2$1 rememberedValue4;
        boolean changed2;
        PhotoModalPopupKt$AsyncPhotoContent$1$4$1 rememberedValue5;
        ImageLoader imageLoader3;
        Composer startRestartGroup = composer.startRestartGroup(-530247081);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = i | (startRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 128;
        }
        if (i5 != 4 || (i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if (i5 != 0) {
                    i3 &= -897;
                }
            } else if (i5 != 0) {
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(AppLocalProviderKt.getLocalAppImageLoaderProvider());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                i4 = i3 & (-897);
                imageLoader2 = (ImageLoader) consume;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-530247081, i4, -1, "com.ifriend.ui.features.photo.AsyncPhotoContent (PhotoModalPopup.kt:123)");
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                m6162rememberAsyncImagePainter5jETZwI = AsyncImagePainterKt.m6162rememberAsyncImagePainter5jETZwI(new ImageRequest.Builder((Context) consume2).data(str).diskCachePolicy(CachePolicy.ENABLED).build(), imageLoader2, null, null, null, 0, startRestartGroup, 72, 60);
                int i6 = i4 & 14;
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                int i7 = i6 >> 3;
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, (i7 & 112) | (i7 & 14));
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
                int i8 = ((((i6 << 3) & 112) << 9) & 7168) | 6;
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
                Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (!m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i8 >> 3) & 112));
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(727272852);
                if (m6162rememberAsyncImagePainter5jETZwI.getState() instanceof AsyncImagePainter.State.Loading) {
                    boxScopeInstance = boxScopeInstance2;
                } else {
                    boxScopeInstance = boxScopeInstance2;
                    ProgressIndicatorKt.m1926CircularProgressIndicatorLxG7B9w(boxScopeInstance2.align(Modifier.Companion, Alignment.Companion.getCenter()), AppTheme.INSTANCE.getColors(startRestartGroup, 6).m7100getLight0d7_KjU(), Dp.m5607constructorimpl(2), 0L, 0, startRestartGroup, 384, 24);
                }
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue;
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m3007boximpl(Offset.Companion.m3034getZeroF1C5BW0()), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                MutableState mutableState = (MutableState) rememberedValue2;
                Modifier align = boxScopeInstance.align(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Alignment.Companion.getCenter());
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceableGroup();
                MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue3;
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(mutableFloatState) | startRestartGroup.changed(mutableState);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue4 == Composer.Companion.getEmpty()) {
                    rememberedValue4 = new PhotoModalPopupKt$AsyncPhotoContent$1$2$1(mutableFloatState, mutableState);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier m456combinedClickableXVZzFYc$default = ClickableKt.m456combinedClickableXVZzFYc$default(align, mutableInteractionSource, null, false, null, null, null, null, rememberedValue4, PhotoModalPopupKt$AsyncPhotoContent$1$3.INSTANCE, 124, null);
                Unit unit = Unit.INSTANCE;
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed2 = startRestartGroup.changed(mutableState) | startRestartGroup.changed(mutableFloatState);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changed2 || rememberedValue5 == Composer.Companion.getEmpty()) {
                    rememberedValue5 = new PhotoModalPopupKt$AsyncPhotoContent$1$4$1(mutableState, mutableFloatState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                startRestartGroup.endReplaceableGroup();
                ImageKt.Image(m6162rememberAsyncImagePainter5jETZwI, "", GraphicsLayerModifierKt.m3447graphicsLayerAp8cVGQ$default(SuspendingPointerInputFilterKt.pointerInput(m456combinedClickableXVZzFYc$default, unit, (Function2) rememberedValue5), AsyncPhotoContent$lambda$9$lambda$1(mutableFloatState), AsyncPhotoContent$lambda$9$lambda$1(mutableFloatState), 0.0f, AsyncPhotoContent$lambda$9$lambda$1(mutableFloatState) <= 1.0f ? Offset.m3018getXimpl(AsyncPhotoContent$lambda$9$lambda$4(mutableState)) : 0.0f, AsyncPhotoContent$lambda$9$lambda$1(mutableFloatState) > 1.0f ? Offset.m3019getYimpl(AsyncPhotoContent$lambda$9$lambda$4(mutableState)) : 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131044, null), (Alignment) null, ContentScale.Companion.getFillWidth(), 0.0f, (ColorFilter) null, startRestartGroup, 24624, (int) LocationRequestCompat.QUALITY_LOW_POWER);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                imageLoader3 = imageLoader2;
            }
            imageLoader2 = imageLoader;
            i4 = i3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            m6162rememberAsyncImagePainter5jETZwI = AsyncImagePainterKt.m6162rememberAsyncImagePainter5jETZwI(new ImageRequest.Builder((Context) consume22).data(str).diskCachePolicy(CachePolicy.ENABLED).build(), imageLoader2, null, null, null, 0, startRestartGroup, 72, 60);
            int i62 = i4 & 14;
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            int i72 = i62 >> 3;
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, (i72 & 112) | (i72 & 14));
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifier);
            int i82 = ((((i62 << 3) & 112) << 9) & 7168) | 6;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (!m2893constructorimpl.getInserting()) {
            }
            m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
            modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, Integer.valueOf((i82 >> 3) & 112));
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(727272852);
            if (m6162rememberAsyncImagePainter5jETZwI.getState() instanceof AsyncImagePainter.State.Loading) {
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            MutableFloatState mutableFloatState2 = (MutableFloatState) rememberedValue;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) rememberedValue2;
            Modifier align2 = boxScopeInstance.align(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Alignment.Companion.getCenter());
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) rememberedValue3;
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(mutableFloatState2) | startRestartGroup.changed(mutableState2);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue4 = new PhotoModalPopupKt$AsyncPhotoContent$1$2$1(mutableFloatState2, mutableState2);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            startRestartGroup.endReplaceableGroup();
            Modifier m456combinedClickableXVZzFYc$default2 = ClickableKt.m456combinedClickableXVZzFYc$default(align2, mutableInteractionSource2, null, false, null, null, null, null, rememberedValue4, PhotoModalPopupKt$AsyncPhotoContent$1$3.INSTANCE, 124, null);
            Unit unit2 = Unit.INSTANCE;
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            changed2 = startRestartGroup.changed(mutableState2) | startRestartGroup.changed(mutableFloatState2);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue5 = new PhotoModalPopupKt$AsyncPhotoContent$1$4$1(mutableState2, mutableFloatState2, null);
            startRestartGroup.updateRememberedValue(rememberedValue5);
            startRestartGroup.endReplaceableGroup();
            ImageKt.Image(m6162rememberAsyncImagePainter5jETZwI, "", GraphicsLayerModifierKt.m3447graphicsLayerAp8cVGQ$default(SuspendingPointerInputFilterKt.pointerInput(m456combinedClickableXVZzFYc$default2, unit2, (Function2) rememberedValue5), AsyncPhotoContent$lambda$9$lambda$1(mutableFloatState2), AsyncPhotoContent$lambda$9$lambda$1(mutableFloatState2), 0.0f, AsyncPhotoContent$lambda$9$lambda$1(mutableFloatState2) <= 1.0f ? Offset.m3018getXimpl(AsyncPhotoContent$lambda$9$lambda$4(mutableState2)) : 0.0f, AsyncPhotoContent$lambda$9$lambda$1(mutableFloatState2) > 1.0f ? Offset.m3019getYimpl(AsyncPhotoContent$lambda$9$lambda$4(mutableState2)) : 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131044, null), (Alignment) null, ContentScale.Companion.getFillWidth(), 0.0f, (ColorFilter) null, startRestartGroup, 24624, (int) LocationRequestCompat.QUALITY_LOW_POWER);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
            }
            imageLoader3 = imageLoader2;
        } else {
            startRestartGroup.skipToGroupEnd();
            imageLoader3 = imageLoader;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new PhotoModalPopupKt$AsyncPhotoContent$2(modifier, str, imageLoader3, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float AsyncPhotoContent$lambda$9$lambda$1(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AsyncPhotoContent$lambda$9$lambda$4(MutableState<Offset> mutableState) {
        return mutableState.getValue().m3028unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AsyncPhotoContent$lambda$9$lambda$5(MutableState<Offset> mutableState, long j) {
        mutableState.setValue(Offset.m3007boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ModalPopupPhoto(boolean z, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1379720911);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1379720911, i2, -1, "com.ifriend.ui.features.photo.ModalPopupPhoto (PhotoModalPopup.kt:183)");
            }
            composer2 = startRestartGroup;
            AnimatedPopupKt.m7050FullscreenAnimatedPopupIkByU14(z, function0, Color.Companion.m3326getTransparent0d7_KjU(), null, null, false, EnterExitTransitionKt.slideInVertically(AnimationSpecKt.spring$default(0.0f, 200.0f, IntOffset.m5716boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null), PhotoModalPopupKt$ModalPopupPhoto$1.INSTANCE), null, function2, startRestartGroup, 196992 | (i2 & 14) | (i2 & 112) | ((i2 << 18) & 234881024), 152);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new PhotoModalPopupKt$ModalPopupPhoto$2(z, function0, function2, i));
    }
}
