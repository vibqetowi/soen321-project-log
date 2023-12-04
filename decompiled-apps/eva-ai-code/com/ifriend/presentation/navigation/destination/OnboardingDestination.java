package com.ifriend.presentation.navigation.destination;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OnboardingDestination.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0013\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,¨\u0006-"}, d2 = {"Lcom/ifriend/presentation/navigation/destination/OnboardingDestination;", "Lcom/ifriend/presentation/navigation/destination/NavigationDestination;", "destination", "", "(Ljava/lang/String;)V", "getDestination", "()Ljava/lang/String;", "AskEveryDay", "Awesome", "BotAge", "BotCharacter", "BotGender", "BotJokes", "BotName", "BotPersonality", "BotVoice", "BotsPager", "LastStep", "LetUsKnowMore", "Route", "UserBirthDate", "UserFavoriteTopic", "UserGender", "UserInterests", "UserName", "Welcome", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$AskEveryDay;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$Awesome;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$BotAge;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$BotCharacter;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$BotGender;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$BotJokes;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$BotName;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$BotPersonality;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$BotVoice;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$BotsPager;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$LastStep;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$LetUsKnowMore;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$Route;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$UserBirthDate;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$UserFavoriteTopic;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$UserGender;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$UserInterests;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$UserName;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$Welcome;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class OnboardingDestination implements NavigationDestination {
    public static final int $stable = 0;
    private final String destination;

    public /* synthetic */ OnboardingDestination(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private OnboardingDestination(String str) {
        this.destination = str;
    }

    @Override // com.ifriend.presentation.navigation.destination.NavigationDestination
    public String getDestination() {
        return this.destination;
    }

    /* compiled from: OnboardingDestination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$Route;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Route extends OnboardingDestination {
        public static final int $stable = 0;
        public static final Route INSTANCE = new Route();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Route) {
                Route route = (Route) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -49225260;
        }

        public String toString() {
            return "Route";
        }

        private Route() {
            super("onboarding_flow", null);
        }
    }

    /* compiled from: OnboardingDestination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$UserName;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class UserName extends OnboardingDestination {
        public static final int $stable = 0;
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
            return 2137103755;
        }

        public String toString() {
            return "UserName";
        }

        private UserName() {
            super("onboarding_user_name", null);
        }
    }

    /* compiled from: OnboardingDestination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$Welcome;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Welcome extends OnboardingDestination {
        public static final int $stable = 0;
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
            return -213380051;
        }

        public String toString() {
            return "Welcome";
        }

        private Welcome() {
            super("onboarding_welcome", null);
        }
    }

    /* compiled from: OnboardingDestination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$LetUsKnowMore;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class LetUsKnowMore extends OnboardingDestination {
        public static final int $stable = 0;
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
            return -683736508;
        }

        public String toString() {
            return "LetUsKnowMore";
        }

        private LetUsKnowMore() {
            super("onboarding_let_us_know_more", null);
        }
    }

    /* compiled from: OnboardingDestination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$UserGender;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class UserGender extends OnboardingDestination {
        public static final int $stable = 0;
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
            return 565663169;
        }

        public String toString() {
            return "UserGender";
        }

        private UserGender() {
            super("onboarding_user_gender", null);
        }
    }

    /* compiled from: OnboardingDestination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$AskEveryDay;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class AskEveryDay extends OnboardingDestination {
        public static final int $stable = 0;
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
            return 1625386853;
        }

        public String toString() {
            return "AskEveryDay";
        }

        private AskEveryDay() {
            super("onboarding_ask_every_day", null);
        }
    }

    /* compiled from: OnboardingDestination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$BotVoice;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BotVoice extends OnboardingDestination {
        public static final int $stable = 0;
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
            return 238000192;
        }

        public String toString() {
            return "BotVoice";
        }

        private BotVoice() {
            super("onboarding_bot_voice", null);
        }
    }

    /* compiled from: OnboardingDestination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$BotPersonality;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BotPersonality extends OnboardingDestination {
        public static final int $stable = 0;
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
            return -634814724;
        }

        public String toString() {
            return "BotPersonality";
        }

        private BotPersonality() {
            super("onboarding_bot_personality", null);
        }
    }

    /* compiled from: OnboardingDestination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$UserInterests;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class UserInterests extends OnboardingDestination {
        public static final int $stable = 0;
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
            return -1524302967;
        }

        public String toString() {
            return "UserInterests";
        }

        private UserInterests() {
            super("onboarding_user_interests", null);
        }
    }

    /* compiled from: OnboardingDestination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$UserBirthDate;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class UserBirthDate extends OnboardingDestination {
        public static final int $stable = 0;
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
            return 1058020877;
        }

        public String toString() {
            return "UserBirthDate";
        }

        private UserBirthDate() {
            super("onboarding_user_birth_date", null);
        }
    }

    /* compiled from: OnboardingDestination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$LastStep;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class LastStep extends OnboardingDestination {
        public static final int $stable = 0;
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
            return 944337687;
        }

        public String toString() {
            return "LastStep";
        }

        private LastStep() {
            super("onboarding_last_step", null);
        }
    }

    /* compiled from: OnboardingDestination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$BotName;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BotName extends OnboardingDestination {
        public static final int $stable = 0;
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
            return -1378047555;
        }

        public String toString() {
            return "BotName";
        }

        private BotName() {
            super("onboarding_bot_name", null);
        }
    }

    /* compiled from: OnboardingDestination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$BotAge;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BotAge extends OnboardingDestination {
        public static final int $stable = 0;
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
            return -1984128115;
        }

        public String toString() {
            return "BotAge";
        }

        private BotAge() {
            super("onboarding_bot_age", null);
        }
    }

    /* compiled from: OnboardingDestination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$BotGender;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BotGender extends OnboardingDestination {
        public static final int $stable = 0;
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
            return -1650451085;
        }

        public String toString() {
            return "BotGender";
        }

        private BotGender() {
            super("onboarding_bot_gender", null);
        }
    }

    /* compiled from: OnboardingDestination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$BotsPager;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BotsPager extends OnboardingDestination {
        public static final int $stable = 0;
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
            return -410546782;
        }

        public String toString() {
            return "BotsPager";
        }

        private BotsPager() {
            super("onboarding_bots_pager", null);
        }
    }

    /* compiled from: OnboardingDestination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$Awesome;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Awesome extends OnboardingDestination {
        public static final int $stable = 0;
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
            return -2049255122;
        }

        public String toString() {
            return "Awesome";
        }

        private Awesome() {
            super("onboarding_awesome", null);
        }
    }

    /* compiled from: OnboardingDestination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$BotJokes;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BotJokes extends OnboardingDestination {
        public static final int $stable = 0;
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
            return 226919938;
        }

        public String toString() {
            return "BotJokes";
        }

        private BotJokes() {
            super("onboarding_bot_jokes", null);
        }
    }

    /* compiled from: OnboardingDestination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$UserFavoriteTopic;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class UserFavoriteTopic extends OnboardingDestination {
        public static final int $stable = 0;
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
            return -1977290253;
        }

        public String toString() {
            return "UserFavoriteTopic";
        }

        private UserFavoriteTopic() {
            super("onboarding_user_favorite_topic", null);
        }
    }

    /* compiled from: OnboardingDestination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/navigation/destination/OnboardingDestination$BotCharacter;", "Lcom/ifriend/presentation/navigation/destination/OnboardingDestination;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class BotCharacter extends OnboardingDestination {
        public static final int $stable = 0;
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
            return 1514814263;
        }

        public String toString() {
            return "BotCharacter";
        }

        private BotCharacter() {
            super("onboarding_bot_character", null);
        }
    }
}
