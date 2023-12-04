package com.google.accompanist.systemuicontroller;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.DialogWindowProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SystemUiController.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0002\u0010\u0007\u001a\u0019\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u000b\u001a\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\fH\u0082\u0010\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"BlackScrim", "Landroidx/compose/ui/graphics/Color;", "J", "BlackScrimmed", "Lkotlin/Function1;", "findWindow", "Landroid/view/Window;", "(Landroidx/compose/runtime/Composer;I)Landroid/view/Window;", "rememberSystemUiController", "Lcom/google/accompanist/systemuicontroller/SystemUiController;", "window", "(Landroid/view/Window;Landroidx/compose/runtime/Composer;II)Lcom/google/accompanist/systemuicontroller/SystemUiController;", "Landroid/content/Context;", "systemuicontroller_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SystemUiControllerKt {
    private static final long BlackScrim = ColorKt.Color$default(0.0f, 0.0f, 0.0f, 0.3f, null, 16, null);
    private static final Function1<Color, Color> BlackScrimmed = SystemUiControllerKt$BlackScrimmed$1.INSTANCE;

    public static final SystemUiController rememberSystemUiController(Window window, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-715745933);
        ComposerKt.sourceInformation(composer, "C(rememberSystemUiController)");
        if ((i2 & 1) != 0) {
            window = findWindow(composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-715745933, i, -1, "com.google.accompanist.systemuicontroller.rememberSystemUiController (SystemUiController.kt:183)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        ComposerKt.sourceInformationMarkerEnd(composer);
        View view = (View) consume;
        composer.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed = composer.changed(view) | composer.changed(window);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new AndroidSystemUiController(view, window);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        AndroidSystemUiController androidSystemUiController = (AndroidSystemUiController) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return androidSystemUiController;
    }

    private static final Window findWindow(Composer composer, int i) {
        composer.startReplaceableGroup(1009281237);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1009281237, i, -1, "com.google.accompanist.systemuicontroller.findWindow (SystemUiController.kt:191)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        ComposerKt.sourceInformationMarkerEnd(composer);
        ViewParent parent = ((View) consume).getParent();
        DialogWindowProvider dialogWindowProvider = parent instanceof DialogWindowProvider ? (DialogWindowProvider) parent : null;
        Window window = dialogWindowProvider != null ? dialogWindowProvider.getWindow() : null;
        if (window == null) {
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
            ComposerKt.sourceInformationMarkerEnd(composer);
            Context context = ((View) consume2).getContext();
            Intrinsics.checkNotNullExpressionValue(context, "LocalView.current.context");
            window = findWindow(context);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return window;
    }

    private static final Window findWindow(Context baseContext) {
        while (!(baseContext instanceof Activity)) {
            if (!(baseContext instanceof ContextWrapper)) {
                return null;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "baseContext");
        }
        return ((Activity) baseContext).getWindow();
    }
}
