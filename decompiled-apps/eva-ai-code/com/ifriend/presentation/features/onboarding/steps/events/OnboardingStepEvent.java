package com.ifriend.presentation.features.onboarding.steps.events;

import kotlin.Metadata;
/* compiled from: OnboardingStepEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/events/OnboardingStepEvent;", "", "OnStepFinished", "Lcom/ifriend/presentation/features/onboarding/steps/events/OnboardingStepEvent$OnStepFinished;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface OnboardingStepEvent {

    /* compiled from: OnboardingStepEvent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/events/OnboardingStepEvent$OnStepFinished;", "Lcom/ifriend/presentation/features/onboarding/steps/events/OnboardingStepEvent;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class OnStepFinished implements OnboardingStepEvent {
        public static final int $stable = 0;
        public static final OnStepFinished INSTANCE = new OnStepFinished();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OnStepFinished) {
                OnStepFinished onStepFinished = (OnStepFinished) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -589076924;
        }

        public String toString() {
            return "OnStepFinished";
        }

        private OnStepFinished() {
        }
    }
}
