package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Surface.kt */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0092\u0001\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001ap\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u009a\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a \u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060#2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010$\u001a%\u0010%\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u0002H\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a;\u0010)\u001a\u00020\n*\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0013\u001a\u00020\u0002H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"LocalAbsoluteTonalElevation", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/unit/Dp;", "getLocalAbsoluteTonalElevation", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Surface", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "color", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "shadowElevation", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", FirebaseAnalytics.Param.CONTENT, "Landroidx/compose/runtime/Composable;", "Surface-o_FOJdg", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Surface-T9BRK9s", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "selected", "Surface-d85dljk", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "checked", "onCheckedChange", "Lkotlin/Function1;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "surfaceColorAtElevation", "elevation", "surfaceColorAtElevation-CLU3JFs", "(JFLandroidx/compose/runtime/Composer;I)J", "surface", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "surface-8ww4TTg", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/BorderStroke;F)Landroidx/compose/ui/Modifier;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurfaceKt {
    private static final ProvidableCompositionLocal<Dp> LocalAbsoluteTonalElevation = CompositionLocalKt.compositionLocalOf$default(null, SurfaceKt$LocalAbsoluteTonalElevation$1.INSTANCE, 1, null);

    /* renamed from: Surface-T9BRK9s  reason: not valid java name */
    public static final void m2067SurfaceT9BRK9s(Modifier modifier, Shape shape, long j, long j2, float f, float f2, BorderStroke borderStroke, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-513881741);
        ComposerKt.sourceInformation(composer, "C(Surface)P(4,6,1:c#ui.graphics.Color,3:c#ui.graphics.Color,7:c#ui.unit.Dp,5:c#ui.unit.Dp)102@5102L11,103@5149L22,*109@5366L7,110@5395L784:Surface.kt#uh7d8r");
        Modifier.Companion companion = (i2 & 1) != 0 ? Modifier.Companion : modifier;
        Shape rectangleShape = (i2 & 2) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        long m1651getSurface0d7_KjU = (i2 & 4) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1651getSurface0d7_KjU() : j;
        long m1687contentColorForek8zF_U = (i2 & 8) != 0 ? ColorSchemeKt.m1687contentColorForek8zF_U(m1651getSurface0d7_KjU, composer, (i >> 6) & 14) : j2;
        float m5607constructorimpl = (i2 & 16) != 0 ? Dp.m5607constructorimpl(0) : f;
        float m5607constructorimpl2 = (i2 & 32) != 0 ? Dp.m5607constructorimpl(0) : f2;
        BorderStroke borderStroke2 = (i2 & 64) != 0 ? null : borderStroke;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-513881741, i, -1, "androidx.compose.material3.Surface (Surface.kt:99)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(providableCompositionLocal);
        ComposerKt.sourceInformationMarkerEnd(composer);
        float m5607constructorimpl3 = Dp.m5607constructorimpl(((Dp) consume).m5621unboximpl() + m5607constructorimpl);
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(m1687contentColorForek8zF_U)), providableCompositionLocal.provides(Dp.m5605boximpl(m5607constructorimpl3))}, ComposableLambdaKt.composableLambda(composer, -70914509, true, new SurfaceKt$Surface$1(companion, rectangleShape, m1651getSurface0d7_KjU, m5607constructorimpl3, i, borderStroke2, m5607constructorimpl2, content)), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    /* renamed from: Surface-o_FOJdg  reason: not valid java name */
    public static final void m2070Surfaceo_FOJdg(Function0<Unit> onClick, Modifier modifier, boolean z, Shape shape, long j, long j2, float f, float f2, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2, int i3) {
        MutableInteractionSource mutableInteractionSource2;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-789752804);
        ComposerKt.sourceInformation(composer, "C(Surface)P(7,6,4,9,1:c#ui.graphics.Color,3:c#ui.graphics.Color,10:c#ui.unit.Dp,8:c#ui.unit.Dp!1,5)206@10475L11,207@10522L22,211@10693L39,*214@10830L7,215@10859L917:Surface.kt#uh7d8r");
        Modifier.Companion companion = (i3 & 2) != 0 ? Modifier.Companion : modifier;
        boolean z2 = (i3 & 4) != 0 ? true : z;
        Shape rectangleShape = (i3 & 8) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        long m1651getSurface0d7_KjU = (i3 & 16) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1651getSurface0d7_KjU() : j;
        long m1687contentColorForek8zF_U = (i3 & 32) != 0 ? ColorSchemeKt.m1687contentColorForek8zF_U(m1651getSurface0d7_KjU, composer, (i >> 12) & 14) : j2;
        float m5607constructorimpl = (i3 & 64) != 0 ? Dp.m5607constructorimpl(0) : f;
        float m5607constructorimpl2 = (i3 & 128) != 0 ? Dp.m5607constructorimpl(0) : f2;
        BorderStroke borderStroke2 = (i3 & 256) != 0 ? null : borderStroke;
        if ((i3 & 512) != 0) {
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-789752804, i, i2, "androidx.compose.material3.Surface (Surface.kt:201)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(providableCompositionLocal);
        ComposerKt.sourceInformationMarkerEnd(composer);
        float m5607constructorimpl3 = Dp.m5607constructorimpl(((Dp) consume).m5621unboximpl() + m5607constructorimpl);
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(m1687contentColorForek8zF_U)), providableCompositionLocal.provides(Dp.m5605boximpl(m5607constructorimpl3))}, ComposableLambdaKt.composableLambda(composer, 1279702876, true, new SurfaceKt$Surface$3(companion, rectangleShape, m1651getSurface0d7_KjU, m5607constructorimpl3, i, borderStroke2, m5607constructorimpl2, mutableInteractionSource2, z2, onClick, content, i2)), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    /* renamed from: Surface-d85dljk  reason: not valid java name */
    public static final void m2068Surfaced85dljk(boolean z, Function0<Unit> onClick, Modifier modifier, boolean z2, Shape shape, long j, long j2, float f, float f2, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2, int i3) {
        MutableInteractionSource mutableInteractionSource2;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(540296512);
        ComposerKt.sourceInformation(composer, "C(Surface)P(8,7,6,4,10,1:c#ui.graphics.Color,3:c#ui.graphics.Color,11:c#ui.unit.Dp,9:c#ui.unit.Dp!1,5)315@16017L11,316@16064L22,320@16235L39,*323@16372L7,324@16401L959:Surface.kt#uh7d8r");
        Modifier.Companion companion = (i3 & 4) != 0 ? Modifier.Companion : modifier;
        boolean z3 = (i3 & 8) != 0 ? true : z2;
        Shape rectangleShape = (i3 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        long m1651getSurface0d7_KjU = (i3 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1651getSurface0d7_KjU() : j;
        long m1687contentColorForek8zF_U = (i3 & 64) != 0 ? ColorSchemeKt.m1687contentColorForek8zF_U(m1651getSurface0d7_KjU, composer, (i >> 15) & 14) : j2;
        float m5607constructorimpl = (i3 & 128) != 0 ? Dp.m5607constructorimpl(0) : f;
        float m5607constructorimpl2 = (i3 & 256) != 0 ? Dp.m5607constructorimpl(0) : f2;
        BorderStroke borderStroke2 = (i3 & 512) != 0 ? null : borderStroke;
        if ((i3 & 1024) != 0) {
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(540296512, i, i2, "androidx.compose.material3.Surface (Surface.kt:309)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(providableCompositionLocal);
        ComposerKt.sourceInformationMarkerEnd(composer);
        float m5607constructorimpl3 = Dp.m5607constructorimpl(((Dp) consume).m5621unboximpl() + m5607constructorimpl);
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(m1687contentColorForek8zF_U)), providableCompositionLocal.provides(Dp.m5605boximpl(m5607constructorimpl3))}, ComposableLambdaKt.composableLambda(composer, -1164547968, true, new SurfaceKt$Surface$5(companion, rectangleShape, m1651getSurface0d7_KjU, m5607constructorimpl3, i, borderStroke2, m5607constructorimpl2, z, mutableInteractionSource2, z3, onClick, content, i2)), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    /* renamed from: Surface-d85dljk  reason: not valid java name */
    public static final void m2069Surfaced85dljk(boolean z, Function1<? super Boolean, Unit> onCheckedChange, Modifier modifier, boolean z2, Shape shape, long j, long j2, float f, float f2, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2, int i3) {
        MutableInteractionSource mutableInteractionSource2;
        Intrinsics.checkNotNullParameter(onCheckedChange, "onCheckedChange");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-1877401889);
        ComposerKt.sourceInformation(composer, "C(Surface)P(1,8,7,5,10,2:c#ui.graphics.Color,4:c#ui.graphics.Color,11:c#ui.unit.Dp,9:c#ui.unit.Dp!1,6)425@21669L11,426@21716L22,430@21887L39,*433@22024L7,434@22053L969:Surface.kt#uh7d8r");
        Modifier.Companion companion = (i3 & 4) != 0 ? Modifier.Companion : modifier;
        boolean z3 = (i3 & 8) != 0 ? true : z2;
        Shape rectangleShape = (i3 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        long m1651getSurface0d7_KjU = (i3 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1651getSurface0d7_KjU() : j;
        long m1687contentColorForek8zF_U = (i3 & 64) != 0 ? ColorSchemeKt.m1687contentColorForek8zF_U(m1651getSurface0d7_KjU, composer, (i >> 15) & 14) : j2;
        float m5607constructorimpl = (i3 & 128) != 0 ? Dp.m5607constructorimpl(0) : f;
        float m5607constructorimpl2 = (i3 & 256) != 0 ? Dp.m5607constructorimpl(0) : f2;
        BorderStroke borderStroke2 = (i3 & 512) != 0 ? null : borderStroke;
        if ((i3 & 1024) != 0) {
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1877401889, i, i2, "androidx.compose.material3.Surface (Surface.kt:419)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(providableCompositionLocal);
        ComposerKt.sourceInformationMarkerEnd(composer);
        float m5607constructorimpl3 = Dp.m5607constructorimpl(((Dp) consume).m5621unboximpl() + m5607constructorimpl);
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3281boximpl(m1687contentColorForek8zF_U)), providableCompositionLocal.provides(Dp.m5605boximpl(m5607constructorimpl3))}, ComposableLambdaKt.composableLambda(composer, 712720927, true, new SurfaceKt$Surface$7(companion, rectangleShape, m1651getSurface0d7_KjU, m5607constructorimpl3, i, borderStroke2, m5607constructorimpl2, z, mutableInteractionSource2, z3, onCheckedChange, content, i2)), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: surface-8ww4TTg  reason: not valid java name */
    public static final Modifier m2073surface8ww4TTg(Modifier modifier, Shape shape, long j, BorderStroke borderStroke, float f) {
        return ClipKt.clip(BackgroundKt.m420backgroundbw27NRU(ShadowKt.m2930shadows4CzXII$default(modifier, f, shape, false, 0L, 0L, 24, null).then(borderStroke != null ? BorderKt.border(Modifier.Companion, borderStroke, shape) : Modifier.Companion), j, shape), shape);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: surfaceColorAtElevation-CLU3JFs  reason: not valid java name */
    public static final long m2074surfaceColorAtElevationCLU3JFs(long j, float f, Composer composer, int i) {
        composer.startReplaceableGroup(-2079918090);
        ComposerKt.sourceInformation(composer, "C(surfaceColorAtElevation)P(0:c#ui.graphics.Color,1:c#ui.unit.Dp)476@23481L11,477@23526L11:Surface.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2079918090, i, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:475)");
        }
        if (Color.m3292equalsimpl0(j, MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1651getSurface0d7_KjU())) {
            j = ColorSchemeKt.m1692surfaceColorAtElevation3ABfNKs(MaterialTheme.INSTANCE.getColorScheme(composer, 6), f);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j;
    }

    public static final ProvidableCompositionLocal<Dp> getLocalAbsoluteTonalElevation() {
        return LocalAbsoluteTonalElevation;
    }
}
