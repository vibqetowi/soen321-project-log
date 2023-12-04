package androidx.compose.runtime;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: CompositionLocal.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a<\u0010\u0000\u001a\u00020\u00012\u001a\u0010\b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\t\"\u0006\u0012\u0002\b\u00030\n2\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0002\u0010\u000b\u001a0\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\r\"\u0004\b\u0000\u0010\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0005\u001a \u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000e0\r\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0005¨\u0006\u0013"}, d2 = {"CompositionLocalProvider", "", "context", "Landroidx/compose/runtime/CompositionLocalContext;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/runtime/CompositionLocalContext;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "values", "", "Landroidx/compose/runtime/ProvidedValue;", "([Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "compositionLocalOf", "Landroidx/compose/runtime/ProvidableCompositionLocal;", ExifInterface.GPS_DIRECTION_TRUE, "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "defaultFactory", "staticCompositionLocalOf", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CompositionLocalKt {
    public static /* synthetic */ ProvidableCompositionLocal compositionLocalOf$default(SnapshotMutationPolicy snapshotMutationPolicy, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            snapshotMutationPolicy = SnapshotStateKt.structuralEqualityPolicy();
        }
        return compositionLocalOf(snapshotMutationPolicy, function0);
    }

    public static final <T> ProvidableCompositionLocal<T> compositionLocalOf(SnapshotMutationPolicy<T> policy, Function0<? extends T> defaultFactory) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
        return new DynamicProvidableCompositionLocal(policy, defaultFactory);
    }

    public static final <T> ProvidableCompositionLocal<T> staticCompositionLocalOf(Function0<? extends T> defaultFactory) {
        Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
        return new StaticProvidableCompositionLocal(defaultFactory);
    }

    public static final void CompositionLocalProvider(ProvidedValue<?>[] values, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1390796515);
        ComposerKt.sourceInformation(startRestartGroup, "C(CompositionLocalProvider)P(1)227@10002L9:CompositionLocal.kt#9igjgp");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1390796515, i, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:225)");
        }
        startRestartGroup.startProviders(values);
        content.invoke(startRestartGroup, Integer.valueOf((i >> 3) & 14));
        startRestartGroup.endProviders();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new CompositionLocalKt$CompositionLocalProvider$1(values, content, i));
    }

    public static final void CompositionLocalProvider(CompositionLocalContext context, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1853897736);
        ComposerKt.sourceInformation(startRestartGroup, "C(CompositionLocalProvider)P(1)247@10707L209:CompositionLocal.kt#9igjgp");
        int i2 = (i & 14) == 0 ? (startRestartGroup.changed(context) ? 4 : 2) | i : i;
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1853897736, i2, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:246)");
            }
            PersistentCompositionLocalMap compositionLocals$runtime_release = context.getCompositionLocals$runtime_release();
            ArrayList arrayList = new ArrayList(compositionLocals$runtime_release.size());
            for (Map.Entry<CompositionLocal<Object>, State<? extends Object>> entry : compositionLocals$runtime_release.entrySet()) {
                CompositionLocal<Object> key = entry.getKey();
                Intrinsics.checkNotNull(key, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
                arrayList.add(((ProvidableCompositionLocal) key).provides(entry.getValue().getValue()));
            }
            ProvidedValue[] providedValueArr = (ProvidedValue[]) arrayList.toArray(new ProvidedValue[0]);
            CompositionLocalProvider((ProvidedValue[]) Arrays.copyOf(providedValueArr, providedValueArr.length), content, startRestartGroup, (i2 & 112) | 8);
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
        endRestartGroup.updateScope(new CompositionLocalKt$CompositionLocalProvider$3(context, content, i));
    }
}
