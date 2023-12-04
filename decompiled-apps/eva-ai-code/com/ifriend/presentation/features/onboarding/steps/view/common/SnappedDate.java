package com.ifriend.presentation.features.onboarding.steps.view.common;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: OnboardingWheelPickerComponent.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedDate;", "", "snappedLocalDate", "Ljava/time/LocalDate;", "snappedIndex", "", "(Ljava/time/LocalDate;I)V", "getSnappedIndex", "()I", "getSnappedLocalDate", "()Ljava/time/LocalDate;", "DayOfMonth", "Month", "Year", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedDate$DayOfMonth;", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedDate$Month;", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedDate$Year;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class SnappedDate {
    private final int snappedIndex;
    private final LocalDate snappedLocalDate;

    public /* synthetic */ SnappedDate(LocalDate localDate, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(localDate, i);
    }

    /* compiled from: OnboardingWheelPickerComponent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedDate$DayOfMonth;", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedDate;", "localDate", "Ljava/time/LocalDate;", FirebaseAnalytics.Param.INDEX, "", "(Ljava/time/LocalDate;I)V", "getIndex", "()I", "getLocalDate", "()Ljava/time/LocalDate;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DayOfMonth extends SnappedDate {
        public static final int $stable = 8;
        private final int index;
        private final LocalDate localDate;

        public static /* synthetic */ DayOfMonth copy$default(DayOfMonth dayOfMonth, LocalDate localDate, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                localDate = dayOfMonth.localDate;
            }
            if ((i2 & 2) != 0) {
                i = dayOfMonth.index;
            }
            return dayOfMonth.copy(localDate, i);
        }

        public final LocalDate component1() {
            return this.localDate;
        }

        public final int component2() {
            return this.index;
        }

        public final DayOfMonth copy(LocalDate localDate, int i) {
            Intrinsics.checkNotNullParameter(localDate, "localDate");
            return new DayOfMonth(localDate, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof DayOfMonth) {
                DayOfMonth dayOfMonth = (DayOfMonth) obj;
                return Intrinsics.areEqual(this.localDate, dayOfMonth.localDate) && this.index == dayOfMonth.index;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            hashCode = this.localDate.hashCode();
            return (hashCode * 31) + this.index;
        }

        public String toString() {
            LocalDate localDate = this.localDate;
            int i = this.index;
            return "DayOfMonth(localDate=" + localDate + ", index=" + i + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DayOfMonth(LocalDate localDate, int i) {
            super(localDate, i, null);
            Intrinsics.checkNotNullParameter(localDate, "localDate");
            this.localDate = localDate;
            this.index = i;
        }

        public final int getIndex() {
            return this.index;
        }

        public final LocalDate getLocalDate() {
            return this.localDate;
        }
    }

    private SnappedDate(LocalDate localDate, int i) {
        this.snappedLocalDate = localDate;
        this.snappedIndex = i;
    }

    public final int getSnappedIndex() {
        return this.snappedIndex;
    }

    public final LocalDate getSnappedLocalDate() {
        return this.snappedLocalDate;
    }

    /* compiled from: OnboardingWheelPickerComponent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedDate$Month;", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedDate;", "localDate", "Ljava/time/LocalDate;", FirebaseAnalytics.Param.INDEX, "", "(Ljava/time/LocalDate;I)V", "getIndex", "()I", "getLocalDate", "()Ljava/time/LocalDate;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Month extends SnappedDate {
        public static final int $stable = 8;
        private final int index;
        private final LocalDate localDate;

        public static /* synthetic */ Month copy$default(Month month, LocalDate localDate, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                localDate = month.localDate;
            }
            if ((i2 & 2) != 0) {
                i = month.index;
            }
            return month.copy(localDate, i);
        }

        public final LocalDate component1() {
            return this.localDate;
        }

        public final int component2() {
            return this.index;
        }

        public final Month copy(LocalDate localDate, int i) {
            Intrinsics.checkNotNullParameter(localDate, "localDate");
            return new Month(localDate, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Month) {
                Month month = (Month) obj;
                return Intrinsics.areEqual(this.localDate, month.localDate) && this.index == month.index;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            hashCode = this.localDate.hashCode();
            return (hashCode * 31) + this.index;
        }

        public String toString() {
            LocalDate localDate = this.localDate;
            int i = this.index;
            return "Month(localDate=" + localDate + ", index=" + i + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Month(LocalDate localDate, int i) {
            super(localDate, i, null);
            Intrinsics.checkNotNullParameter(localDate, "localDate");
            this.localDate = localDate;
            this.index = i;
        }

        public final int getIndex() {
            return this.index;
        }

        public final LocalDate getLocalDate() {
            return this.localDate;
        }
    }

    /* compiled from: OnboardingWheelPickerComponent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedDate$Year;", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedDate;", "localDate", "Ljava/time/LocalDate;", FirebaseAnalytics.Param.INDEX, "", "(Ljava/time/LocalDate;I)V", "getIndex", "()I", "getLocalDate", "()Ljava/time/LocalDate;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Year extends SnappedDate {
        public static final int $stable = 8;
        private final int index;
        private final LocalDate localDate;

        public static /* synthetic */ Year copy$default(Year year, LocalDate localDate, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                localDate = year.localDate;
            }
            if ((i2 & 2) != 0) {
                i = year.index;
            }
            return year.copy(localDate, i);
        }

        public final LocalDate component1() {
            return this.localDate;
        }

        public final int component2() {
            return this.index;
        }

        public final Year copy(LocalDate localDate, int i) {
            Intrinsics.checkNotNullParameter(localDate, "localDate");
            return new Year(localDate, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Year) {
                Year year = (Year) obj;
                return Intrinsics.areEqual(this.localDate, year.localDate) && this.index == year.index;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            hashCode = this.localDate.hashCode();
            return (hashCode * 31) + this.index;
        }

        public String toString() {
            LocalDate localDate = this.localDate;
            int i = this.index;
            return "Year(localDate=" + localDate + ", index=" + i + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Year(LocalDate localDate, int i) {
            super(localDate, i, null);
            Intrinsics.checkNotNullParameter(localDate, "localDate");
            this.localDate = localDate;
            this.index = i;
        }

        public final int getIndex() {
            return this.index;
        }

        public final LocalDate getLocalDate() {
            return this.localDate;
        }
    }
}
