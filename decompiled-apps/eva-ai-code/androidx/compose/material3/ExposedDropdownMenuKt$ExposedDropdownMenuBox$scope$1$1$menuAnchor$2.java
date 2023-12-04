package androidx.compose.material3;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ExposedDropdownMenu.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Ref<LayoutCoordinates> $coordinates;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ MutableState<Integer> $menuHeight$delegate;
    final /* synthetic */ Function1<Boolean, Unit> $onExpandedChange;
    final /* synthetic */ int $verticalMarginInPx;
    final /* synthetic */ View $view;
    final /* synthetic */ MutableState<Integer> $width$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2(boolean z, Function1<? super Boolean, Unit> function1, int i, FocusRequester focusRequester, Ref<LayoutCoordinates> ref, View view, int i2, MutableState<Integer> mutableState, MutableState<Integer> mutableState2) {
        super(3);
        this.$expanded = z;
        this.$onExpandedChange = function1;
        this.$$dirty = i;
        this.$focusRequester = focusRequester;
        this.$coordinates = ref;
        this.$view = view;
        this.$verticalMarginInPx = i2;
        this.$width$delegate = mutableState;
        this.$menuHeight$delegate = mutableState2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExposedDropdownMenu.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<LayoutCoordinates, Unit> {
        final /* synthetic */ Ref<LayoutCoordinates> $coordinates;
        final /* synthetic */ MutableState<Integer> $menuHeight$delegate;
        final /* synthetic */ int $verticalMarginInPx;
        final /* synthetic */ View $view;
        final /* synthetic */ MutableState<Integer> $width$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref<LayoutCoordinates> ref, View view, int i, MutableState<Integer> mutableState, MutableState<Integer> mutableState2) {
            super(1);
            this.$coordinates = ref;
            this.$view = view;
            this.$verticalMarginInPx = i;
            this.$width$delegate = mutableState;
            this.$menuHeight$delegate = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
            invoke2(layoutCoordinates);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(LayoutCoordinates it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$2(this.$width$delegate, IntSize.m5767getWidthimpl(it.mo4552getSizeYbymL2g()));
            this.$coordinates.setValue(it);
            View rootView = this.$view.getRootView();
            Intrinsics.checkNotNullExpressionValue(rootView, "view.rootView");
            ExposedDropdownMenuKt.updateHeight(rootView, this.$coordinates.getValue(), this.$verticalMarginInPx, new C00531(this.$menuHeight$delegate));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ExposedDropdownMenu.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00531 extends Lambda implements Function1<Integer, Unit> {
            final /* synthetic */ MutableState<Integer> $menuHeight$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00531(MutableState<Integer> mutableState) {
                super(1);
                this.$menuHeight$delegate = mutableState;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$5(this.$menuHeight$delegate, i);
            }
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier composed, Composer composer, int i) {
        Modifier expandable;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(1714866713);
        ComposerKt.sourceInformation(composer, "C131@6216L31,129@6116L154:ExposedDropdownMenu.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1714866713, i, -1, "androidx.compose.material3.ExposedDropdownMenuBox.<anonymous>.<no name provided>.menuAnchor.<anonymous> (ExposedDropdownMenu.kt:118)");
        }
        Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(composed, new AnonymousClass1(this.$coordinates, this.$view, this.$verticalMarginInPx, this.$width$delegate, this.$menuHeight$delegate));
        boolean z = this.$expanded;
        Function1<Boolean, Unit> function1 = this.$onExpandedChange;
        Boolean valueOf = Boolean.valueOf(z);
        Function1<Boolean, Unit> function12 = this.$onExpandedChange;
        boolean z2 = this.$expanded;
        composer.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed = composer.changed(function1) | composer.changed(valueOf);
        ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2$2$1 rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1$menuAnchor$2$2$1(function12, z2);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        expandable = ExposedDropdownMenuKt.expandable(onGloballyPositioned, z, (Function0) rememberedValue, null, null, null, composer, (this.$$dirty << 3) & 112, 28);
        Modifier focusRequester = FocusRequesterModifierKt.focusRequester(expandable, this.$focusRequester);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return focusRequester;
    }
}
