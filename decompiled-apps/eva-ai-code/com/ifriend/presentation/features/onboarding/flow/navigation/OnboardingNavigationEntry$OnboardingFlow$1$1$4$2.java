package com.ifriend.presentation.features.onboarding.flow.navigation;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.navigation.NavGraphBuilder;
import com.ifriend.presentation.features.onboarding.steps.viewmodel.factory.OnboardingStepViewModelFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.reflect.KMutableProperty0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingNavigationEntry.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/navigation/NavGraphBuilder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingNavigationEntry$OnboardingFlow$1$1$4$2 extends Lambda implements Function1<NavGraphBuilder, Unit> {
    final /* synthetic */ MutableState<String> $avatar;
    final /* synthetic */ MutableFloatState $avatarOffset;
    final /* synthetic */ OnboardingStepViewModelFactory $factory;
    final /* synthetic */ OnboardingNavigationEntry this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingNavigationEntry$OnboardingFlow$1$1$4$2(MutableState<String> mutableState, MutableFloatState mutableFloatState, OnboardingNavigationEntry onboardingNavigationEntry, OnboardingStepViewModelFactory onboardingStepViewModelFactory) {
        super(1);
        this.$avatar = mutableState;
        this.$avatarOffset = mutableFloatState;
        this.this$0 = onboardingNavigationEntry;
        this.$factory = onboardingStepViewModelFactory;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(NavGraphBuilder navGraphBuilder) {
        invoke2(navGraphBuilder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingNavigationEntry.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.onboarding.flow.navigation.OnboardingNavigationEntry$OnboardingFlow$1$1$4$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<String, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, KMutableProperty0.class, "set", "set(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((KMutableProperty0) this.receiver).set(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingNavigationEntry.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.onboarding.flow.navigation.OnboardingNavigationEntry$OnboardingFlow$1$1$4$2$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function1<Float, Unit> {
        AnonymousClass3(Object obj) {
            super(1, obj, KMutableProperty0.class, "set", "set(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Float f) {
            invoke(f.floatValue());
            return Unit.INSTANCE;
        }

        public final void invoke(float f) {
            ((KMutableProperty0) this.receiver).set(Float.valueOf(f));
        }
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(NavGraphBuilder NavHost) {
        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
        this.this$0.featureNavigation(NavHost, this.$factory, new AnonymousClass3(new MutablePropertyReference0Impl(this.$avatarOffset) { // from class: com.ifriend.presentation.features.onboarding.flow.navigation.OnboardingNavigationEntry$OnboardingFlow$1$1$4$2.4
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Float.valueOf(((MutableFloatState) this.receiver).getFloatValue());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((MutableFloatState) this.receiver).setFloatValue(((Number) obj).floatValue());
            }
        }), new AnonymousClass1(new MutablePropertyReference0Impl(this.$avatar) { // from class: com.ifriend.presentation.features.onboarding.flow.navigation.OnboardingNavigationEntry$OnboardingFlow$1$1$4$2.2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((MutableState) this.receiver).getValue();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((MutableState) this.receiver).setValue(obj);
            }
        }));
    }
}
