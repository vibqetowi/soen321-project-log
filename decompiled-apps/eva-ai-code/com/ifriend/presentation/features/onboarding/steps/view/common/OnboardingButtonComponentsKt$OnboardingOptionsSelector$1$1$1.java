package com.ifriend.presentation.features.onboarding.steps.view.common;

import com.ifriend.ui.components.MultipleEventsCutterManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: OnboardingButtonComponents.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OnboardingButtonComponentsKt$OnboardingOptionsSelector$1$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ SelectButtonUiParams $button;
    final /* synthetic */ MultipleEventsCutterManager $eventsManager;
    final /* synthetic */ Function1<SelectButtonUiParams, Unit> $onClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingButtonComponentsKt$OnboardingOptionsSelector$1$1$1(MultipleEventsCutterManager multipleEventsCutterManager, Function1<? super SelectButtonUiParams, Unit> function1, SelectButtonUiParams selectButtonUiParams) {
        super(0);
        this.$eventsManager = multipleEventsCutterManager;
        this.$onClick = function1;
        this.$button = selectButtonUiParams;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingButtonComponents.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.onboarding.steps.view.common.OnboardingButtonComponentsKt$OnboardingOptionsSelector$1$1$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        final /* synthetic */ SelectButtonUiParams $button;
        final /* synthetic */ Function1<SelectButtonUiParams, Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function1<? super SelectButtonUiParams, Unit> function1, SelectButtonUiParams selectButtonUiParams) {
            super(0);
            this.$onClick = function1;
            this.$button = selectButtonUiParams;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$onClick.invoke(this.$button);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$eventsManager.processEvent(new AnonymousClass1(this.$onClick, this.$button));
    }
}
