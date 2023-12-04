package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.res.ImageVectorCache;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AndroidCompositionLocals.android.kt */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a(\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00150\u0019¢\u0006\u0002\b\u001aH\u0001¢\u0006\u0002\u0010\u001b\u001a\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002\u001a\u001f\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0002H\u0003¢\u0006\u0002\u0010#\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0004\"\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0004\"\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0004\"\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0004\"\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0004¨\u0006$²\u0006\n\u0010\"\u001a\u00020\u0002X\u008a\u008e\u0002"}, d2 = {"LocalConfiguration", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroid/content/res/Configuration;", "getLocalConfiguration", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalContext", "Landroid/content/Context;", "getLocalContext", "LocalImageVectorCache", "Landroidx/compose/ui/res/ImageVectorCache;", "getLocalImageVectorCache", "LocalLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLocalLifecycleOwner", "LocalSavedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "getLocalSavedStateRegistryOwner", "LocalView", "Landroid/view/View;", "getLocalView", "ProvideAndroidCompositionLocals", "", "owner", "Landroidx/compose/ui/platform/AndroidComposeView;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "noLocalProvidedFor", "", "name", "", "obtainImageVectorCache", "context", "configuration", "(Landroid/content/Context;Landroid/content/res/Configuration;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/res/ImageVectorCache;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidCompositionLocals_androidKt {
    private static final ProvidableCompositionLocal<Configuration> LocalConfiguration = CompositionLocalKt.compositionLocalOf$default(null, AndroidCompositionLocals_androidKt$LocalConfiguration$1.INSTANCE, 1, null);
    private static final ProvidableCompositionLocal<Context> LocalContext = CompositionLocalKt.staticCompositionLocalOf(AndroidCompositionLocals_androidKt$LocalContext$1.INSTANCE);
    private static final ProvidableCompositionLocal<ImageVectorCache> LocalImageVectorCache = CompositionLocalKt.staticCompositionLocalOf(AndroidCompositionLocals_androidKt$LocalImageVectorCache$1.INSTANCE);
    private static final ProvidableCompositionLocal<LifecycleOwner> LocalLifecycleOwner = CompositionLocalKt.staticCompositionLocalOf(AndroidCompositionLocals_androidKt$LocalLifecycleOwner$1.INSTANCE);
    private static final ProvidableCompositionLocal<SavedStateRegistryOwner> LocalSavedStateRegistryOwner = CompositionLocalKt.staticCompositionLocalOf(AndroidCompositionLocals_androidKt$LocalSavedStateRegistryOwner$1.INSTANCE);
    private static final ProvidableCompositionLocal<View> LocalView = CompositionLocalKt.staticCompositionLocalOf(AndroidCompositionLocals_androidKt$LocalView$1.INSTANCE);

    public static final ProvidableCompositionLocal<Configuration> getLocalConfiguration() {
        return LocalConfiguration;
    }

    public static final ProvidableCompositionLocal<Context> getLocalContext() {
        return LocalContext;
    }

    public static final ProvidableCompositionLocal<ImageVectorCache> getLocalImageVectorCache() {
        return LocalImageVectorCache;
    }

    public static final ProvidableCompositionLocal<LifecycleOwner> getLocalLifecycleOwner() {
        return LocalLifecycleOwner;
    }

    public static final ProvidableCompositionLocal<SavedStateRegistryOwner> getLocalSavedStateRegistryOwner() {
        return LocalSavedStateRegistryOwner;
    }

    public static final ProvidableCompositionLocal<View> getLocalView() {
        return LocalView;
    }

    public static final void ProvideAndroidCompositionLocals(AndroidComposeView owner, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1396852028);
        ComposerKt.sourceInformation(startRestartGroup, "C(ProvideAndroidCompositionLocals)P(1)88@3008L87,92@3137L37,94@3197L39,99@3437L102,102@3544L104,108@3677L46,109@3728L589:AndroidCompositionLocals.android.kt#itgzvw");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1396852028, i, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:80)");
        }
        Context context = owner.getContext();
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Configuration(context.getResources().getConfiguration()), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = startRestartGroup.changed(mutableState);
        AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1(mutableState);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        owner.setConfigurationChangeObserver((Function1) rememberedValue2);
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.Companion.getEmpty()) {
            Intrinsics.checkNotNullExpressionValue(context, "context");
            rememberedValue3 = new AndroidUriHandler(context);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceableGroup();
        AndroidUriHandler androidUriHandler = (AndroidUriHandler) rememberedValue3;
        AndroidComposeView.ViewTreeOwners viewTreeOwners = owner.getViewTreeOwners();
        if (viewTreeOwners == null) {
            throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == Composer.Companion.getEmpty()) {
            rememberedValue4 = DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry(owner, viewTreeOwners.getSavedStateRegistryOwner());
            startRestartGroup.updateRememberedValue(rememberedValue4);
        }
        startRestartGroup.endReplaceableGroup();
        DisposableSaveableStateRegistry disposableSaveableStateRegistry = (DisposableSaveableStateRegistry) rememberedValue4;
        EffectsKt.DisposableEffect(Unit.INSTANCE, new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2(disposableSaveableStateRegistry), startRestartGroup, 6);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{LocalConfiguration.provides(ProvideAndroidCompositionLocals$lambda$1(mutableState)), LocalContext.provides(context), LocalLifecycleOwner.provides(viewTreeOwners.getLifecycleOwner()), LocalSavedStateRegistryOwner.provides(viewTreeOwners.getSavedStateRegistryOwner()), SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(disposableSaveableStateRegistry), LocalView.provides(owner.getView()), LocalImageVectorCache.provides(obtainImageVectorCache(context, ProvideAndroidCompositionLocals$lambda$1(mutableState), startRestartGroup, 72))}, ComposableLambdaKt.composableLambda(startRestartGroup, 1471621628, true, new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3(owner, androidUriHandler, content, i)), startRestartGroup, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$4(owner, content, i));
    }

    private static final Configuration ProvideAndroidCompositionLocals$lambda$1(MutableState<Configuration> mutableState) {
        return mutableState.getValue();
    }

    private static final ImageVectorCache obtainImageVectorCache(Context context, Configuration configuration, Composer composer, int i) {
        composer.startReplaceableGroup(-485908294);
        ComposerKt.sourceInformation(composer, "C(obtainImageVectorCache)P(1)132@4482L31,133@4560L88,136@4669L557,153@5231L224:AndroidCompositionLocals.android.kt#itgzvw");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-485908294, i, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:128)");
        }
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ImageVectorCache();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final ImageVectorCache imageVectorCache = (ImageVectorCache) rememberedValue;
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue2 = composer.rememberedValue();
        Object obj = rememberedValue2;
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
            Configuration configuration2 = new Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            composer.updateRememberedValue(configuration2);
            obj = configuration2;
        }
        composer.endReplaceableGroup();
        final Configuration configuration3 = (Configuration) obj;
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = new ComponentCallbacks2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration4) {
                    Intrinsics.checkNotNullParameter(configuration4, "configuration");
                    imageVectorCache.prune(configuration3.updateFrom(configuration4));
                    configuration3.setTo(configuration4);
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                    imageVectorCache.clear();
                }

                @Override // android.content.ComponentCallbacks2
                public void onTrimMemory(int i2) {
                    imageVectorCache.clear();
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        EffectsKt.DisposableEffect(imageVectorCache, new AndroidCompositionLocals_androidKt$obtainImageVectorCache$1(context, (AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1) rememberedValue3), composer, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return imageVectorCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void noLocalProvidedFor(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
