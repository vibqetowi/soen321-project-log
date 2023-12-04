package com.ifriend.domain.onboarding.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.http.cookie.ClientCookie;
/* compiled from: OnboardingStep.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0012\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0012\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*¨\u0006+"}, d2 = {"Lcom/ifriend/domain/onboarding/model/OnboardingStep;", "", "order", "", "(I)V", "getOrder", "()I", "AskEveryDay", "Awesome", "BotAge", "BotCharacter", "BotGender", "BotJokes", "BotName", "BotPersonality", "BotVoice", "BotsPager", "LastStep", "LetUsKnowMore", "UserBirthDate", "UserFavoriteTopic", "UserGender", "UserInterests", "UserName", "Welcome", "Lcom/ifriend/domain/onboarding/model/OnboardingStep$AskEveryDay;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep$Awesome;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep$BotAge;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep$BotCharacter;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep$BotGender;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep$BotJokes;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep$BotName;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep$BotPersonality;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep$BotVoice;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep$BotsPager;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep$LastStep;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep$LetUsKnowMore;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep$UserBirthDate;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep$UserFavoriteTopic;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep$UserGender;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep$UserInterests;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep$UserName;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep$Welcome;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class OnboardingStep {
    private final int order;

    public /* synthetic */ OnboardingStep(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    private OnboardingStep(int i) {
        this.order = i;
    }

    public final int getOrder() {
        return this.order;
    }

    /* compiled from: OnboardingStep.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/onboarding/model/OnboardingStep$UserName;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class UserName extends OnboardingStep {
        public static final UserName INSTANCE = new UserName();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof UserName) {
                UserName userName = (UserName) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1940182011;
        }

        public String toString() {
            return "UserName";
        }

        private UserName() {
            super(0, null);
        }
    }

    /* compiled from: OnboardingStep.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/onboarding/model/OnboardingStep$Welcome;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Welcome extends OnboardingStep {
        public static final Welcome INSTANCE = new Welcome();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Welcome) {
                Welcome welcome = (Welcome) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -2020847683;
        }

        public String toString() {
            return "Welcome";
        }

        private Welcome() {
            super(1, null);
        }
    }

    /* compiled from: OnboardingStep.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/onboarding/model/OnboardingStep$LetUsKnowMore;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class LetUsKnowMore extends OnboardingStep {
        public static final LetUsKnowMore INSTANCE = new LetUsKnowMore();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LetUsKnowMore) {
                LetUsKnowMore letUsKnowMore = (LetUsKnowMore) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -106147372;
        }

        public String toString() {
            return "LetUsKnowMore";
        }

        private LetUsKnowMore() {
            super(2, null);
        }
    }

    /* compiled from: OnboardingStep.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/onboarding/model/OnboardingStep$UserGender;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class UserGender extends OnboardingStep {
        public static final UserGender INSTANCE = new UserGender();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof UserGender) {
                UserGender userGender = (UserGender) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 302428209;
        }

        public String toString() {
            return "UserGender";
        }

        private UserGender() {
            super(3, null);
        }
    }

    /* compiled from: OnboardingStep.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/onboarding/model/OnboardingStep$AskEveryDay;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class AskEveryDay extends OnboardingStep {
        public static final AskEveryDay INSTANCE = new AskEveryDay();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AskEveryDay) {
                AskEveryDay askEveryDay = (AskEveryDay) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 2055037685;
        }

        public String toString() {
            return "AskEveryDay";
        }

        private AskEveryDay() {
            super(4, null);
        }
    }

    /* compiled from: OnboardingStep.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/onboarding/model/OnboardingStep$BotVoice;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BotVoice extends OnboardingStep {
        public static final BotVoice INSTANCE = new BotVoice();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BotVoice) {
                BotVoice botVoice = (BotVoice) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 41078448;
        }

        public String toString() {
            return "BotVoice";
        }

        private BotVoice() {
            super(5, null);
        }
    }

    /* compiled from: OnboardingStep.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/onboarding/model/OnboardingStep$BotPersonality;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BotPersonality extends OnboardingStep {
        public static final BotPersonality INSTANCE = new BotPersonality();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BotPersonality) {
                BotPersonality botPersonality = (BotPersonality) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 90579308;
        }

        public String toString() {
            return "BotPersonality";
        }

        private BotPersonality() {
            super(6, null);
        }
    }

    /* compiled from: OnboardingStep.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/onboarding/model/OnboardingStep$UserInterests;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class UserInterests extends OnboardingStep {
        public static final UserInterests INSTANCE = new UserInterests();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof UserInterests) {
                UserInterests userInterests = (UserInterests) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -946713831;
        }

        public String toString() {
            return "UserInterests";
        }

        private UserInterests() {
            super(7, null);
        }
    }

    /* compiled from: OnboardingStep.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/onboarding/model/OnboardingStep$UserBirthDate;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class UserBirthDate extends OnboardingStep {
        public static final UserBirthDate INSTANCE = new UserBirthDate();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof UserBirthDate) {
                UserBirthDate userBirthDate = (UserBirthDate) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1635610013;
        }

        public String toString() {
            return "UserBirthDate";
        }

        private UserBirthDate() {
            super(8, null);
        }
    }

    /* compiled from: OnboardingStep.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/onboarding/model/OnboardingStep$LastStep;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class LastStep extends OnboardingStep {
        public static final LastStep INSTANCE = new LastStep();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LastStep) {
                LastStep lastStep = (LastStep) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 747415943;
        }

        public String toString() {
            return "LastStep";
        }

        private LastStep() {
            super(9, null);
        }
    }

    /* compiled from: OnboardingStep.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/onboarding/model/OnboardingStep$BotName;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BotName extends OnboardingStep {
        public static final BotName INSTANCE = new BotName();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BotName) {
                BotName botName = (BotName) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1109452109;
        }

        public String toString() {
            return "BotName";
        }

        private BotName() {
            super(10, null);
        }
    }

    /* compiled from: OnboardingStep.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/onboarding/model/OnboardingStep$BotAge;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BotAge extends OnboardingStep {
        public static final BotAge INSTANCE = new BotAge();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BotAge) {
                BotAge botAge = (BotAge) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1698344445;
        }

        public String toString() {
            return "BotAge";
        }

        private BotAge() {
            super(11, null);
        }
    }

    /* compiled from: OnboardingStep.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/onboarding/model/OnboardingStep$BotGender;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BotGender extends OnboardingStep {
        public static final BotGender INSTANCE = new BotGender();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BotGender) {
                BotGender botGender = (BotGender) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 834909443;
        }

        public String toString() {
            return "BotGender";
        }

        private BotGender() {
            super(12, null);
        }
    }

    /* compiled from: OnboardingStep.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/onboarding/model/OnboardingStep$BotsPager;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BotsPager extends OnboardingStep {
        public static final BotsPager INSTANCE = new BotsPager();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BotsPager) {
                BotsPager botsPager = (BotsPager) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 2074813746;
        }

        public String toString() {
            return "BotsPager";
        }

        private BotsPager() {
            super(16, null);
        }
    }

    /* compiled from: OnboardingStep.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/onboarding/model/OnboardingStep$Awesome;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Awesome extends OnboardingStep {
        public static final Awesome INSTANCE = new Awesome();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Awesome) {
                Awesome awesome = (Awesome) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 438244542;
        }

        public String toString() {
            return "Awesome";
        }

        private Awesome() {
            super(17, null);
        }
    }

    /* compiled from: OnboardingStep.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/onboarding/model/OnboardingStep$BotJokes;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BotJokes extends OnboardingStep {
        public static final BotJokes INSTANCE = new BotJokes();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BotJokes) {
                BotJokes botJokes = (BotJokes) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 29998194;
        }

        public String toString() {
            return "BotJokes";
        }

        private BotJokes() {
            super(13, null);
        }
    }

    /* compiled from: OnboardingStep.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/onboarding/model/OnboardingStep$UserFavoriteTopic;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class UserFavoriteTopic extends OnboardingStep {
        public static final UserFavoriteTopic INSTANCE = new UserFavoriteTopic();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof UserFavoriteTopic) {
                UserFavoriteTopic userFavoriteTopic = (UserFavoriteTopic) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 255850883;
        }

        public String toString() {
            return "UserFavoriteTopic";
        }

        private UserFavoriteTopic() {
            super(14, null);
        }
    }

    /* compiled from: OnboardingStep.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/domain/onboarding/model/OnboardingStep$BotCharacter;", "Lcom/ifriend/domain/onboarding/model/OnboardingStep;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BotCharacter extends OnboardingStep {
        public static final BotCharacter INSTANCE = new BotCharacter();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BotCharacter) {
                BotCharacter botCharacter = (BotCharacter) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1949088167;
        }

        public String toString() {
            return "BotCharacter";
        }

        private BotCharacter() {
            super(15, null);
        }
    }
}
