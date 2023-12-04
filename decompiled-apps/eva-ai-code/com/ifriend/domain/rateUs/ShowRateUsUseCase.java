package com.ifriend.domain.rateUs;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ShowRateUsUseCase.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ifriend/domain/rateUs/ShowRateUsUseCase;", "", "rateUsStateStorage", "Lcom/ifriend/domain/rateUs/RateUsStateStorage;", "rateAppShowingPlanner", "Lcom/ifriend/domain/rateUs/RateAppShowingPlanner;", "(Lcom/ifriend/domain/rateUs/RateUsStateStorage;Lcom/ifriend/domain/rateUs/RateAppShowingPlanner;)V", "checkLastOnline", "", ShowRateUsUseCase.LAST_ONLINE, "", "days", "", "onShowed", "", "showIfNecessary", "sentMessagesInThisSession", "Companion", "Step", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShowRateUsUseCase {
    public static final Companion Companion = new Companion(null);
    public static final String LAST_ONLINE = "lastOnline";
    public static final String RATE_US_REPEATS = "rateUsRepeats";
    public static final String RATE_US_STEP = "rateUsStep";
    private final RateAppShowingPlanner rateAppShowingPlanner;
    private final RateUsStateStorage rateUsStateStorage;

    /* compiled from: ShowRateUsUseCase.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Step.values().length];
            try {
                iArr[Step.INITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Step.DAILY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Step.EACH_10_DAYS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Step.INACTIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ShowRateUsUseCase(RateUsStateStorage rateUsStateStorage, RateAppShowingPlanner rateAppShowingPlanner) {
        Intrinsics.checkNotNullParameter(rateUsStateStorage, "rateUsStateStorage");
        Intrinsics.checkNotNullParameter(rateAppShowingPlanner, "rateAppShowingPlanner");
        this.rateUsStateStorage = rateUsStateStorage;
        this.rateAppShowingPlanner = rateAppShowingPlanner;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShowRateUsUseCase.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/rateUs/ShowRateUsUseCase$Step;", "", "(Ljava/lang/String;I)V", "INITIAL", "DAILY", "EACH_10_DAYS", "INACTIVE", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Step {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Step[] $VALUES;
        public static final Step INITIAL = new Step("INITIAL", 0);
        public static final Step DAILY = new Step("DAILY", 1);
        public static final Step EACH_10_DAYS = new Step("EACH_10_DAYS", 2);
        public static final Step INACTIVE = new Step("INACTIVE", 3);

        private static final /* synthetic */ Step[] $values() {
            return new Step[]{INITIAL, DAILY, EACH_10_DAYS, INACTIVE};
        }

        public static EnumEntries<Step> getEntries() {
            return $ENTRIES;
        }

        public static Step valueOf(String str) {
            return (Step) Enum.valueOf(Step.class, str);
        }

        public static Step[] values() {
            return (Step[]) $VALUES.clone();
        }

        private Step(String str, int i) {
        }

        static {
            Step[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }
    }

    /* compiled from: ShowRateUsUseCase.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/rateUs/ShowRateUsUseCase$Companion;", "", "()V", "LAST_ONLINE", "", "RATE_US_REPEATS", "RATE_US_STEP", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final void showIfNecessary(int i) {
        RateUsStateStorage rateUsStateStorage = this.rateUsStateStorage;
        int i2 = WhenMappings.$EnumSwitchMapping$0[rateUsStateStorage.getCurrentStep().ordinal()];
        if (i2 == 1) {
            if (i >= 7) {
                this.rateAppShowingPlanner.show();
            }
        } else if (i2 == 2) {
            if (!checkLastOnline(rateUsStateStorage.getLastOnline(), 1) || i < 3) {
                return;
            }
            this.rateAppShowingPlanner.show();
        } else if (i2 == 3 && checkLastOnline(rateUsStateStorage.getLastOnline(), 10) && i >= 3) {
            this.rateAppShowingPlanner.show();
        }
    }

    public final void onShowed() {
        RateUsStateStorage rateUsStateStorage = this.rateUsStateStorage;
        rateUsStateStorage.setLastOnline(System.currentTimeMillis());
        int i = WhenMappings.$EnumSwitchMapping$0[rateUsStateStorage.getCurrentStep().ordinal()];
        if (i == 1) {
            rateUsStateStorage.changeStep(Step.DAILY);
        } else if (i != 2) {
        } else {
            rateUsStateStorage.increaseRateUsRepeats();
            if (rateUsStateStorage.getRateUsRepeats() >= 3) {
                rateUsStateStorage.changeStep(Step.EACH_10_DAYS);
            }
        }
    }

    private final boolean checkLastOnline(long j, int i) {
        return System.currentTimeMillis() - j >= TimeUnit.DAYS.toMillis((long) i);
    }
}
