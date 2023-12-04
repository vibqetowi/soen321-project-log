package androidx.compose.runtime.saveable;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
/* compiled from: RememberSaveable.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\u0002\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00040\u0003\"\u0004\b\u0000\u0010\u00052\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u0002H\u0005\u0012\u0006\b\u0001\u0012\u00020\u00060\u0003H\u0002\u001aa\u0010\b\u001a\u0002H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\n\"\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H\u0005\u0012\u0006\b\u0001\u0012\u00020\u00060\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001ag\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\n\"\u0004\u0018\u00010\u00062\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u0002H\u0005\u0012\u0006\b\u0001\u0012\u00020\u00060\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00040\u000fH\u0007¢\u0006\u0002\u0010\u0012\u001a\u0016\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"MaxSupportedRadix", "", "mutableStateSaver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/runtime/MutableState;", ExifInterface.GPS_DIRECTION_TRUE, "", "inner", "rememberSaveable", "inputs", "", "saver", "key", "", "init", "Lkotlin/Function0;", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;", "stateSaver", "([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/MutableState;", "requireCanBeSaved", "", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "value", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RememberSaveableKt {
    private static final int MaxSupportedRadix = 36;

    /* renamed from: rememberSaveable  reason: collision with other method in class */
    public static final <T> T m2907rememberSaveable(Object[] inputs, Saver<T, ? extends Object> saver, String str, Function0<? extends T> init, Composer composer, int i, int i2) {
        Object consumeRestored;
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(init, "init");
        composer.startReplaceableGroup(441892779);
        ComposerKt.sourceInformation(composer, "C(rememberSaveable)P(1,3,2)80@3500L7,82@3597L244,95@4209L27,96@4262L27,98@4299L441:RememberSaveable.kt#r2ddri");
        if ((i2 & 2) != 0) {
            saver = SaverKt.autoSaver();
        }
        T t = null;
        if ((i2 & 4) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(441892779, i, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:65)");
        }
        composer.startReplaceableGroup(1059366469);
        ComposerKt.sourceInformation(composer, "*75@3334L23");
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            str = Integer.toString(ComposablesKt.getCurrentCompositeKeyHash(composer, 0), CharsKt.checkRadix(MaxSupportedRadix));
            Intrinsics.checkNotNullExpressionValue(str, "toString(this, checkRadix(radix))");
        }
        composer.endReplaceableGroup();
        Intrinsics.checkNotNull(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
        ComposerKt.sourceInformationMarkerEnd(composer);
        SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) consume;
        Object[] copyOf = Arrays.copyOf(inputs, inputs.length);
        composer.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean z = false;
        for (Object obj : copyOf) {
            z |= composer.changed(obj);
        }
        T t2 = (T) composer.rememberedValue();
        if (z || t2 == Composer.Companion.getEmpty()) {
            if (saveableStateRegistry != null && (consumeRestored = saveableStateRegistry.consumeRestored(str)) != null) {
                t = saver.restore(consumeRestored);
            }
            t2 = t == null ? init.invoke() : t;
            composer.updateRememberedValue(t2);
        }
        composer.endReplaceableGroup();
        if (saveableStateRegistry != null) {
            EffectsKt.DisposableEffect(saveableStateRegistry, str, new RememberSaveableKt$rememberSaveable$1(saveableStateRegistry, str, SnapshotStateKt.rememberUpdatedState(saver, composer, 0), SnapshotStateKt.rememberUpdatedState(t2, composer, 0)), composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return t2;
    }

    public static final <T> MutableState<T> rememberSaveable(Object[] inputs, Saver<T, ? extends Object> stateSaver, String str, Function0<? extends MutableState<T>> init, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(stateSaver, "stateSaver");
        Intrinsics.checkNotNullParameter(init, "init");
        composer.startReplaceableGroup(-202053668);
        ComposerKt.sourceInformation(composer, "C(rememberSaveable)P(1,3,2)141@6040L106:RememberSaveable.kt#r2ddri");
        if ((i2 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-202053668, i, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:136)");
        }
        MutableState<T> mutableState = (MutableState) m2907rememberSaveable(Arrays.copyOf(inputs, inputs.length), (Saver<Object, ? extends Object>) mutableStateSaver(stateSaver), str2, (Function0<? extends Object>) init, composer, (i & 896) | 8 | (i & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }

    private static final <T> Saver<MutableState<T>, MutableState<Object>> mutableStateSaver(Saver<T, ? extends Object> saver) {
        Intrinsics.checkNotNull(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        return SaverKt.Saver(new RememberSaveableKt$mutableStateSaver$1$1(saver), new RememberSaveableKt$mutableStateSaver$1$2(saver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requireCanBeSaved(SaveableStateRegistry saveableStateRegistry, Object obj) {
        String str;
        if (obj == null || saveableStateRegistry.canBeSaved(obj)) {
            return;
        }
        if (obj instanceof SnapshotMutableState) {
            SnapshotMutableState snapshotMutableState = (SnapshotMutableState) obj;
            if (snapshotMutableState.getPolicy() == SnapshotStateKt.neverEqualPolicy() || snapshotMutableState.getPolicy() == SnapshotStateKt.structuralEqualityPolicy() || snapshotMutableState.getPolicy() == SnapshotStateKt.referentialEqualityPolicy()) {
                str = "MutableState containing " + snapshotMutableState.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            str = obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
        }
        throw new IllegalArgumentException(str);
    }
}
