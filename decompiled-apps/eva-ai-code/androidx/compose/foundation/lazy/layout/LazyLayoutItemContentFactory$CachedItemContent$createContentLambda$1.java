package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyLayoutItemContentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ LazyLayoutItemContentFactory this$0;
    final /* synthetic */ LazyLayoutItemContentFactory.CachedItemContent this$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, LazyLayoutItemContentFactory.CachedItemContent cachedItemContent) {
        super(2);
        this.this$0 = lazyLayoutItemContentFactory;
        this.this$1 = cachedItemContent;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        SaveableStateHolder saveableStateHolder;
        ComposerKt.sourceInformation(composer, "C99@3691L258,107@3962L219:LazyLayoutItemContentFactory.kt#wow0x6");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1403994769, i, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:90)");
            }
            LazyLayoutItemProvider invoke = this.this$0.getItemProvider().invoke();
            int index = this.this$1.getIndex();
            if ((index >= invoke.getItemCount() || !Intrinsics.areEqual(invoke.getKey(index), this.this$1.getKey())) && (index = invoke.getIndex(this.this$1.getKey())) != -1) {
                this.this$1.index = index;
            }
            int i2 = index;
            boolean z = i2 != -1;
            LazyLayoutItemContentFactory lazyLayoutItemContentFactory = this.this$0;
            LazyLayoutItemContentFactory.CachedItemContent cachedItemContent = this.this$1;
            composer.startReusableGroup(207, Boolean.valueOf(z));
            boolean changed = composer.changed(z);
            if (z) {
                ComposerKt.sourceInformationMarkerStart(composer, -1642427977, "C100@3751L184:LazyLayoutItemContentFactory.kt#wow0x6");
                saveableStateHolder = lazyLayoutItemContentFactory.saveableStateHolder;
                LazyLayoutItemContentFactoryKt.m903SkippableItemJVlU9Rs(invoke, StableValue.m919constructorimpl(saveableStateHolder), i2, StableValue.m919constructorimpl(cachedItemContent.getKey()), composer, 0);
                ComposerKt.sourceInformationMarkerEnd(composer);
            } else {
                composer.deactivateToEndGroup(changed);
            }
            composer.endReusableGroup();
            EffectsKt.DisposableEffect(this.this$1.getKey(), new AnonymousClass2(this.this$1), composer, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyLayoutItemContentFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
        final /* synthetic */ LazyLayoutItemContentFactory.CachedItemContent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(LazyLayoutItemContentFactory.CachedItemContent cachedItemContent) {
            super(1);
            this.this$0 = cachedItemContent;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final LazyLayoutItemContentFactory.CachedItemContent cachedItemContent = this.this$0;
            return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    LazyLayoutItemContentFactory.CachedItemContent.this._content = null;
                }
            };
        }
    }
}
