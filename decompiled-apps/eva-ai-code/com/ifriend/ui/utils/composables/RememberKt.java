package com.ifriend.ui.utils.composables;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.facebook.internal.NativeProtocol;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: remember.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u0002H\u00020\u0001¢\u0006\u0002\b\u0004H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a<\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u0002H\u00020\u0001¢\u0006\u0002\b\u0004H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\b\u001aF\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0013\b\u0004\u0010\u0003\u001a\r\u0012\u0004\u0012\u0002H\u00020\u0001¢\u0006\u0002\b\u0004H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\n\u001aD\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u00022\u0019\b\u0004\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u00020\f¢\u0006\u0002\b\u0004H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001aV\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u00020\u0010\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\u0012\"\u0004\b\u0002\u0010\u00022\u001f\b\u0004\u0010\u000e\u001a\u0019\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\u00020\u0010¢\u0006\u0002\b\u0004H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"rememberAction", "Lkotlin/Function0;", "R", NativeProtocol.WEB_DIALOG_ACTION, "Landroidx/compose/runtime/DisallowComposableCalls;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "key1", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "rememberFunction", "Lkotlin/Function1;", "P", "function", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function1;", "Lkotlin/Function2;", "P1", "P2", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RememberKt {
    public static final <R> Function0<R> rememberAction(Function0<? extends R> action, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(action, "action");
        composer.startReplaceableGroup(92232837);
        ComposerKt.sourceInformation(composer, "CC(rememberAction)");
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        RememberKt$rememberAction$1$1 rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new RememberKt$rememberAction$1$1(action);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function0<R> function0 = (Function0) rememberedValue;
        composer.endReplaceableGroup();
        return function0;
    }

    public static final <R> Function0<R> rememberAction(Object obj, Function0<? extends R> action, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(action, "action");
        composer.startReplaceableGroup(-264211419);
        ComposerKt.sourceInformation(composer, "CC(rememberAction)P(1)");
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(obj);
        RememberKt$rememberAction$2$1 rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new RememberKt$rememberAction$2$1(action);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function0<R> function0 = (Function0) rememberedValue;
        composer.endReplaceableGroup();
        return function0;
    }

    public static final <R> Function0<R> rememberAction(Object obj, Object obj2, Function0<? extends R> action, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(action, "action");
        composer.startReplaceableGroup(-546522171);
        ComposerKt.sourceInformation(composer, "CC(rememberAction)P(1,2)");
        composer.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed = composer.changed(obj) | composer.changed(obj2);
        RememberKt$rememberAction$3$1 rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new RememberKt$rememberAction$3$1(action);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function0<R> function0 = (Function0) rememberedValue;
        composer.endReplaceableGroup();
        return function0;
    }

    public static final <P, R> Function1<P, R> rememberFunction(Function1<? super P, ? extends R> function, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(function, "function");
        composer.startReplaceableGroup(1931250217);
        ComposerKt.sourceInformation(composer, "CC(rememberFunction)");
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        RememberKt$rememberFunction$1$1 rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new RememberKt$rememberFunction$1$1(function);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function1<P, R> function1 = (Function1) rememberedValue;
        composer.endReplaceableGroup();
        return function1;
    }

    public static final <P1, P2, R> Function2<P1, P2, R> rememberFunction(Function2<? super P1, ? super P2, ? extends R> function, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(function, "function");
        composer.startReplaceableGroup(-365930645);
        ComposerKt.sourceInformation(composer, "CC(rememberFunction)");
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        RememberKt$rememberFunction$2$1 rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new RememberKt$rememberFunction$2$1(function);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function2<P1, P2, R> function2 = (Function2) rememberedValue;
        composer.endReplaceableGroup();
        return function2;
    }
}
