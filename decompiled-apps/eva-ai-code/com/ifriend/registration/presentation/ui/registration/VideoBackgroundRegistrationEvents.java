package com.ifriend.registration.presentation.ui.registration;

import com.ifriend.ui.base.mvvm.BaseEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: VideoBackgroundRegistrationEvents.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/registration/presentation/ui/registration/VideoBackgroundRegistrationEvents;", "Lcom/ifriend/ui/base/mvvm/BaseEvent;", "()V", "NavigateNext", "NavigateToEmail", "Lcom/ifriend/registration/presentation/ui/registration/VideoBackgroundRegistrationEvents$NavigateNext;", "Lcom/ifriend/registration/presentation/ui/registration/VideoBackgroundRegistrationEvents$NavigateToEmail;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class VideoBackgroundRegistrationEvents extends BaseEvent {
    public static final int $stable = 0;

    public /* synthetic */ VideoBackgroundRegistrationEvents(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: VideoBackgroundRegistrationEvents.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/registration/presentation/ui/registration/VideoBackgroundRegistrationEvents$NavigateNext;", "Lcom/ifriend/registration/presentation/ui/registration/VideoBackgroundRegistrationEvents;", "()V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class NavigateNext extends VideoBackgroundRegistrationEvents {
        public static final int $stable = 0;
        public static final NavigateNext INSTANCE = new NavigateNext();

        private NavigateNext() {
            super(null);
        }
    }

    private VideoBackgroundRegistrationEvents() {
    }

    /* compiled from: VideoBackgroundRegistrationEvents.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/registration/presentation/ui/registration/VideoBackgroundRegistrationEvents$NavigateToEmail;", "Lcom/ifriend/registration/presentation/ui/registration/VideoBackgroundRegistrationEvents;", "()V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class NavigateToEmail extends VideoBackgroundRegistrationEvents {
        public static final int $stable = 0;
        public static final NavigateToEmail INSTANCE = new NavigateToEmail();

        private NavigateToEmail() {
            super(null);
        }
    }
}
