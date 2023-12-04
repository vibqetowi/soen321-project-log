package com.ifriend.chat.presentation.ui.infoOnboarding.slides.component;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.ifriend.ui.components.MultipleEventsCutterManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SlideCloseButton.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "eventsManager", "Lcom/ifriend/ui/components/MultipleEventsCutterManager;", "invoke", "(Lcom/ifriend/ui/components/MultipleEventsCutterManager;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SlideCloseButtonKt$SlideCloseButton$1 extends Lambda implements Function3<MultipleEventsCutterManager, Composer, Integer, Unit> {
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Unit> $onClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlideCloseButtonKt$SlideCloseButton$1(Modifier modifier, Function0<Unit> function0) {
        super(3);
        this.$modifier = modifier;
        this.$onClick = function0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SlideCloseButton.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.presentation.ui.infoOnboarding.slides.component.SlideCloseButtonKt$SlideCloseButton$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        final /* synthetic */ MultipleEventsCutterManager $eventsManager;
        final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MultipleEventsCutterManager multipleEventsCutterManager, Function0<Unit> function0) {
            super(0);
            this.$eventsManager = multipleEventsCutterManager;
            this.$onClick = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SlideCloseButton.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.chat.presentation.ui.infoOnboarding.slides.component.SlideCloseButtonKt$SlideCloseButton$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01211 extends Lambda implements Function0<Unit> {
            final /* synthetic */ Function0<Unit> $onClick;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01211(Function0<Unit> function0) {
                super(0);
                this.$onClick = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$onClick.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$eventsManager.processEvent(new C01211(this.$onClick));
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(MultipleEventsCutterManager multipleEventsCutterManager, Composer composer, Integer num) {
        invoke(multipleEventsCutterManager, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(MultipleEventsCutterManager eventsManager, Composer composer, int i) {
        long j;
        long j2;
        Intrinsics.checkNotNullParameter(eventsManager, "eventsManager");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(912175489, i, -1, "com.ifriend.chat.presentation.ui.infoOnboarding.slides.component.SlideCloseButton.<anonymous> (SlideCloseButton.kt:25)");
        }
        Modifier m795size3ABfNKs = SizeKt.m795size3ABfNKs(this.$modifier, Dp.m5607constructorimpl(55));
        ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
        j = SlideCloseButtonKt.closeButtonColor;
        j2 = SlideCloseButtonKt.closeButtonColor;
        ButtonKt.Button(new AnonymousClass1(eventsManager, this.$onClick), m795size3ABfNKs, false, null, buttonDefaults.m1595buttonColorsro_MJ88(j, 0L, j2, 0L, composer, (ButtonDefaults.$stable << 12) | 390, 10), null, null, PaddingKt.m741PaddingValues0680j_4(Dp.m5607constructorimpl(0)), null, ComposableSingletons$SlideCloseButtonKt.INSTANCE.m6834getLambda1$presentation_release(), composer, 817889280, 364);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
