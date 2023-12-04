package com.ifriend.presentation.features.onboarding.steps.viewmodel;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.onboarding.steps.view.info.OnboardingInfoState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
/* compiled from: OnboardingWelcomeViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingWelcomeViewModel$startAnimations$1", f = "OnboardingWelcomeViewModel.kt", i = {}, l = {46, 47, 48, ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, 50, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class OnboardingWelcomeViewModel$startAnimations$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OnboardingWelcomeViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingWelcomeViewModel$startAnimations$1(OnboardingWelcomeViewModel onboardingWelcomeViewModel, Continuation<? super OnboardingWelcomeViewModel$startAnimations$1> continuation) {
        super(2, continuation);
        this.this$0 = onboardingWelcomeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OnboardingWelcomeViewModel$startAnimations$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OnboardingWelcomeViewModel$startAnimations$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        UiStateDelegate<OnboardingInfoState, Unit> uiStateDelegate;
        UiStateDelegate<OnboardingInfoState, Unit> uiStateDelegate2;
        UiStateDelegate<OnboardingInfoState, Unit> uiStateDelegate3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                Duration.Companion companion = Duration.Companion;
                this.label = 1;
                if (DelayKt.m8803delayVtjQ1oo(DurationKt.toDuration(1, DurationUnit.SECONDS), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                uiStateDelegate = this.this$0;
                this.label = 2;
                if (uiStateDelegate.updateUiState(uiStateDelegate, AnonymousClass1.INSTANCE, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Duration.Companion companion2 = Duration.Companion;
                this.label = 3;
                if (DelayKt.m8803delayVtjQ1oo(DurationKt.toDuration(1, DurationUnit.SECONDS), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                uiStateDelegate2 = this.this$0;
                this.label = 4;
                if (uiStateDelegate2.updateUiState(uiStateDelegate2, AnonymousClass2.INSTANCE, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Duration.Companion companion3 = Duration.Companion;
                this.label = 5;
                if (DelayKt.m8803delayVtjQ1oo(DurationKt.toDuration(1, DurationUnit.SECONDS), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                uiStateDelegate3 = this.this$0;
                this.label = 6;
                if (uiStateDelegate3.updateUiState(uiStateDelegate3, AnonymousClass3.INSTANCE, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure(obj);
                uiStateDelegate = this.this$0;
                this.label = 2;
                if (uiStateDelegate.updateUiState(uiStateDelegate, AnonymousClass1.INSTANCE, this) == coroutine_suspended) {
                }
                Duration.Companion companion22 = Duration.Companion;
                this.label = 3;
                if (DelayKt.m8803delayVtjQ1oo(DurationKt.toDuration(1, DurationUnit.SECONDS), this) == coroutine_suspended) {
                }
                uiStateDelegate2 = this.this$0;
                this.label = 4;
                if (uiStateDelegate2.updateUiState(uiStateDelegate2, AnonymousClass2.INSTANCE, this) == coroutine_suspended) {
                }
                Duration.Companion companion32 = Duration.Companion;
                this.label = 5;
                if (DelayKt.m8803delayVtjQ1oo(DurationKt.toDuration(1, DurationUnit.SECONDS), this) == coroutine_suspended) {
                }
                uiStateDelegate3 = this.this$0;
                this.label = 6;
                if (uiStateDelegate3.updateUiState(uiStateDelegate3, AnonymousClass3.INSTANCE, this) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            case 2:
                ResultKt.throwOnFailure(obj);
                Duration.Companion companion222 = Duration.Companion;
                this.label = 3;
                if (DelayKt.m8803delayVtjQ1oo(DurationKt.toDuration(1, DurationUnit.SECONDS), this) == coroutine_suspended) {
                }
                uiStateDelegate2 = this.this$0;
                this.label = 4;
                if (uiStateDelegate2.updateUiState(uiStateDelegate2, AnonymousClass2.INSTANCE, this) == coroutine_suspended) {
                }
                Duration.Companion companion322 = Duration.Companion;
                this.label = 5;
                if (DelayKt.m8803delayVtjQ1oo(DurationKt.toDuration(1, DurationUnit.SECONDS), this) == coroutine_suspended) {
                }
                uiStateDelegate3 = this.this$0;
                this.label = 6;
                if (uiStateDelegate3.updateUiState(uiStateDelegate3, AnonymousClass3.INSTANCE, this) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            case 3:
                ResultKt.throwOnFailure(obj);
                uiStateDelegate2 = this.this$0;
                this.label = 4;
                if (uiStateDelegate2.updateUiState(uiStateDelegate2, AnonymousClass2.INSTANCE, this) == coroutine_suspended) {
                }
                Duration.Companion companion3222 = Duration.Companion;
                this.label = 5;
                if (DelayKt.m8803delayVtjQ1oo(DurationKt.toDuration(1, DurationUnit.SECONDS), this) == coroutine_suspended) {
                }
                uiStateDelegate3 = this.this$0;
                this.label = 6;
                if (uiStateDelegate3.updateUiState(uiStateDelegate3, AnonymousClass3.INSTANCE, this) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            case 4:
                ResultKt.throwOnFailure(obj);
                Duration.Companion companion32222 = Duration.Companion;
                this.label = 5;
                if (DelayKt.m8803delayVtjQ1oo(DurationKt.toDuration(1, DurationUnit.SECONDS), this) == coroutine_suspended) {
                }
                uiStateDelegate3 = this.this$0;
                this.label = 6;
                if (uiStateDelegate3.updateUiState(uiStateDelegate3, AnonymousClass3.INSTANCE, this) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            case 5:
                ResultKt.throwOnFailure(obj);
                uiStateDelegate3 = this.this$0;
                this.label = 6;
                if (uiStateDelegate3.updateUiState(uiStateDelegate3, AnonymousClass3.INSTANCE, this) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            case 6:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingWelcomeViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/onboarding/steps/view/info/OnboardingInfoState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingWelcomeViewModel$startAnimations$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<OnboardingInfoState, OnboardingInfoState> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final OnboardingInfoState invoke(OnboardingInfoState it) {
            OnboardingInfoState copy;
            Intrinsics.checkNotNullParameter(it, "it");
            copy = it.copy((r18 & 1) != 0 ? it.titleLabel : null, (r18 & 2) != 0 ? it.subtitleLabel : null, (r18 & 4) != 0 ? it.isSubtitleVisible : true, (r18 & 8) != 0 ? it.descriptionLabel : null, (r18 & 16) != 0 ? it.isDescriptionVisible : false, (r18 & 32) != 0 ? it.buttonLabel : null, (r18 & 64) != 0 ? it.isButtonActive : false, (r18 & 128) != 0 ? it.buttonDescriptionLabel : null);
            return copy;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingWelcomeViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/onboarding/steps/view/info/OnboardingInfoState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingWelcomeViewModel$startAnimations$1$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<OnboardingInfoState, OnboardingInfoState> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final OnboardingInfoState invoke(OnboardingInfoState it) {
            OnboardingInfoState copy;
            Intrinsics.checkNotNullParameter(it, "it");
            copy = it.copy((r18 & 1) != 0 ? it.titleLabel : null, (r18 & 2) != 0 ? it.subtitleLabel : null, (r18 & 4) != 0 ? it.isSubtitleVisible : false, (r18 & 8) != 0 ? it.descriptionLabel : null, (r18 & 16) != 0 ? it.isDescriptionVisible : true, (r18 & 32) != 0 ? it.buttonLabel : null, (r18 & 64) != 0 ? it.isButtonActive : false, (r18 & 128) != 0 ? it.buttonDescriptionLabel : null);
            return copy;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingWelcomeViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/onboarding/steps/view/info/OnboardingInfoState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingWelcomeViewModel$startAnimations$1$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass3 extends Lambda implements Function1<OnboardingInfoState, OnboardingInfoState> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final OnboardingInfoState invoke(OnboardingInfoState it) {
            OnboardingInfoState copy;
            Intrinsics.checkNotNullParameter(it, "it");
            copy = it.copy((r18 & 1) != 0 ? it.titleLabel : null, (r18 & 2) != 0 ? it.subtitleLabel : null, (r18 & 4) != 0 ? it.isSubtitleVisible : false, (r18 & 8) != 0 ? it.descriptionLabel : null, (r18 & 16) != 0 ? it.isDescriptionVisible : false, (r18 & 32) != 0 ? it.buttonLabel : null, (r18 & 64) != 0 ? it.isButtonActive : true, (r18 & 128) != 0 ? it.buttonDescriptionLabel : null);
            return copy;
        }
    }
}
