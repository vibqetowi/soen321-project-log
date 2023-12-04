package com.ifriend.presentation.features.onboarding.steps.view.common;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: OnboardingWheelPickerComponent.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u000b\f\r\u000e\u000fB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedDateTime;", "", "snappedLocalDateTime", "Ljava/time/LocalDateTime;", "snappedIndex", "", "(Ljava/time/LocalDateTime;I)V", "getSnappedIndex", "()I", "getSnappedLocalDateTime", "()Ljava/time/LocalDateTime;", "DayOfMonth", "Hour", "Minute", "Month", "Year", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedDateTime$DayOfMonth;", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedDateTime$Hour;", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedDateTime$Minute;", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedDateTime$Month;", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedDateTime$Year;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class SnappedDateTime {
    private final int snappedIndex;
    private final LocalDateTime snappedLocalDateTime;

    public /* synthetic */ SnappedDateTime(LocalDateTime localDateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(localDateTime, i);
    }

    /* compiled from: OnboardingWheelPickerComponent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedDateTime$DayOfMonth;", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedDateTime;", "localDateTime", "Ljava/time/LocalDateTime;", FirebaseAnalytics.Param.INDEX, "", "(Ljava/time/LocalDateTime;I)V", "getIndex", "()I", "getLocalDateTime", "()Ljava/time/LocalDateTime;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DayOfMonth extends SnappedDateTime {
        public static final int $stable = 8;
        private final int index;
        private final LocalDateTime localDateTime;

        public static /* synthetic */ DayOfMonth copy$default(DayOfMonth dayOfMonth, LocalDateTime localDateTime, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                localDateTime = dayOfMonth.localDateTime;
            }
            if ((i2 & 2) != 0) {
                i = dayOfMonth.index;
            }
            return dayOfMonth.copy(localDateTime, i);
        }

        public final LocalDateTime component1() {
            return this.localDateTime;
        }

        public final int component2() {
            return this.index;
        }

        public final DayOfMonth copy(LocalDateTime localDateTime, int i) {
            Intrinsics.checkNotNullParameter(localDateTime, "localDateTime");
            return new DayOfMonth(localDateTime, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof DayOfMonth) {
                DayOfMonth dayOfMonth = (DayOfMonth) obj;
                return Intrinsics.areEqual(this.localDateTime, dayOfMonth.localDateTime) && this.index == dayOfMonth.index;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            hashCode = this.localDateTime.hashCode();
            return (hashCode * 31) + this.index;
        }

        public String toString() {
            LocalDateTime localDateTime = this.localDateTime;
            int i = this.index;
            return "DayOfMonth(localDateTime=" + localDateTime + ", index=" + i + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DayOfMonth(LocalDateTime localDateTime, int i) {
            super(localDateTime, i, null);
            Intrinsics.checkNotNullParameter(localDateTime, "localDateTime");
            this.localDateTime = localDateTime;
            this.index = i;
        }

        public final int getIndex() {
            return this.index;
        }

        public final LocalDateTime getLocalDateTime() {
            return this.localDateTime;
        }
    }

    private SnappedDateTime(LocalDateTime localDateTime, int i) {
        this.snappedLocalDateTime = localDateTime;
        this.snappedIndex = i;
    }

    public final int getSnappedIndex() {
        return this.snappedIndex;
    }

    public final LocalDateTime getSnappedLocalDateTime() {
        return this.snappedLocalDateTime;
    }

    /* compiled from: OnboardingWheelPickerComponent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedDateTime$Month;", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedDateTime;", "localDateTime", "Ljava/time/LocalDateTime;", FirebaseAnalytics.Param.INDEX, "", "(Ljava/time/LocalDateTime;I)V", "getIndex", "()I", "getLocalDateTime", "()Ljava/time/LocalDateTime;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Month extends SnappedDateTime {
        public static final int $stable = 8;
        private final int index;
        private final LocalDateTime localDateTime;

        public static /* synthetic */ Month copy$default(Month month, LocalDateTime localDateTime, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                localDateTime = month.localDateTime;
            }
            if ((i2 & 2) != 0) {
                i = month.index;
            }
            return month.copy(localDateTime, i);
        }

        public final LocalDateTime component1() {
            return this.localDateTime;
        }

        public final int component2() {
            return this.index;
        }

        public final Month copy(LocalDateTime localDateTime, int i) {
            Intrinsics.checkNotNullParameter(localDateTime, "localDateTime");
            return new Month(localDateTime, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Month) {
                Month month = (Month) obj;
                return Intrinsics.areEqual(this.localDateTime, month.localDateTime) && this.index == month.index;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            hashCode = this.localDateTime.hashCode();
            return (hashCode * 31) + this.index;
        }

        public String toString() {
            LocalDateTime localDateTime = this.localDateTime;
            int i = this.index;
            return "Month(localDateTime=" + localDateTime + ", index=" + i + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Month(LocalDateTime localDateTime, int i) {
            super(localDateTime, i, null);
            Intrinsics.checkNotNullParameter(localDateTime, "localDateTime");
            this.localDateTime = localDateTime;
            this.index = i;
        }

        public final int getIndex() {
            return this.index;
        }

        public final LocalDateTime getLocalDateTime() {
            return this.localDateTime;
        }
    }

    /* compiled from: OnboardingWheelPickerComponent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedDateTime$Year;", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedDateTime;", "localDateTime", "Ljava/time/LocalDateTime;", FirebaseAnalytics.Param.INDEX, "", "(Ljava/time/LocalDateTime;I)V", "getIndex", "()I", "getLocalDateTime", "()Ljava/time/LocalDateTime;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Year extends SnappedDateTime {
        public static final int $stable = 8;
        private final int index;
        private final LocalDateTime localDateTime;

        public static /* synthetic */ Year copy$default(Year year, LocalDateTime localDateTime, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                localDateTime = year.localDateTime;
            }
            if ((i2 & 2) != 0) {
                i = year.index;
            }
            return year.copy(localDateTime, i);
        }

        public final LocalDateTime component1() {
            return this.localDateTime;
        }

        public final int component2() {
            return this.index;
        }

        public final Year copy(LocalDateTime localDateTime, int i) {
            Intrinsics.checkNotNullParameter(localDateTime, "localDateTime");
            return new Year(localDateTime, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Year) {
                Year year = (Year) obj;
                return Intrinsics.areEqual(this.localDateTime, year.localDateTime) && this.index == year.index;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            hashCode = this.localDateTime.hashCode();
            return (hashCode * 31) + this.index;
        }

        public String toString() {
            LocalDateTime localDateTime = this.localDateTime;
            int i = this.index;
            return "Year(localDateTime=" + localDateTime + ", index=" + i + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Year(LocalDateTime localDateTime, int i) {
            super(localDateTime, i, null);
            Intrinsics.checkNotNullParameter(localDateTime, "localDateTime");
            this.localDateTime = localDateTime;
            this.index = i;
        }

        public final int getIndex() {
            return this.index;
        }

        public final LocalDateTime getLocalDateTime() {
            return this.localDateTime;
        }
    }

    /* compiled from: OnboardingWheelPickerComponent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedDateTime$Hour;", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedDateTime;", "localDateTime", "Ljava/time/LocalDateTime;", FirebaseAnalytics.Param.INDEX, "", "(Ljava/time/LocalDateTime;I)V", "getIndex", "()I", "getLocalDateTime", "()Ljava/time/LocalDateTime;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Hour extends SnappedDateTime {
        public static final int $stable = 8;
        private final int index;
        private final LocalDateTime localDateTime;

        public static /* synthetic */ Hour copy$default(Hour hour, LocalDateTime localDateTime, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                localDateTime = hour.localDateTime;
            }
            if ((i2 & 2) != 0) {
                i = hour.index;
            }
            return hour.copy(localDateTime, i);
        }

        public final LocalDateTime component1() {
            return this.localDateTime;
        }

        public final int component2() {
            return this.index;
        }

        public final Hour copy(LocalDateTime localDateTime, int i) {
            Intrinsics.checkNotNullParameter(localDateTime, "localDateTime");
            return new Hour(localDateTime, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Hour) {
                Hour hour = (Hour) obj;
                return Intrinsics.areEqual(this.localDateTime, hour.localDateTime) && this.index == hour.index;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            hashCode = this.localDateTime.hashCode();
            return (hashCode * 31) + this.index;
        }

        public String toString() {
            LocalDateTime localDateTime = this.localDateTime;
            int i = this.index;
            return "Hour(localDateTime=" + localDateTime + ", index=" + i + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Hour(LocalDateTime localDateTime, int i) {
            super(localDateTime, i, null);
            Intrinsics.checkNotNullParameter(localDateTime, "localDateTime");
            this.localDateTime = localDateTime;
            this.index = i;
        }

        public final int getIndex() {
            return this.index;
        }

        public final LocalDateTime getLocalDateTime() {
            return this.localDateTime;
        }
    }

    /* compiled from: OnboardingWheelPickerComponent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedDateTime$Minute;", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedDateTime;", "localDateTime", "Ljava/time/LocalDateTime;", FirebaseAnalytics.Param.INDEX, "", "(Ljava/time/LocalDateTime;I)V", "getIndex", "()I", "getLocalDateTime", "()Ljava/time/LocalDateTime;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Minute extends SnappedDateTime {
        public static final int $stable = 8;
        private final int index;
        private final LocalDateTime localDateTime;

        public static /* synthetic */ Minute copy$default(Minute minute, LocalDateTime localDateTime, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                localDateTime = minute.localDateTime;
            }
            if ((i2 & 2) != 0) {
                i = minute.index;
            }
            return minute.copy(localDateTime, i);
        }

        public final LocalDateTime component1() {
            return this.localDateTime;
        }

        public final int component2() {
            return this.index;
        }

        public final Minute copy(LocalDateTime localDateTime, int i) {
            Intrinsics.checkNotNullParameter(localDateTime, "localDateTime");
            return new Minute(localDateTime, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Minute) {
                Minute minute = (Minute) obj;
                return Intrinsics.areEqual(this.localDateTime, minute.localDateTime) && this.index == minute.index;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            hashCode = this.localDateTime.hashCode();
            return (hashCode * 31) + this.index;
        }

        public String toString() {
            LocalDateTime localDateTime = this.localDateTime;
            int i = this.index;
            return "Minute(localDateTime=" + localDateTime + ", index=" + i + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Minute(LocalDateTime localDateTime, int i) {
            super(localDateTime, i, null);
            Intrinsics.checkNotNullParameter(localDateTime, "localDateTime");
            this.localDateTime = localDateTime;
            this.index = i;
        }

        public final int getIndex() {
            return this.index;
        }

        public final LocalDateTime getLocalDateTime() {
            return this.localDateTime;
        }
    }
}
