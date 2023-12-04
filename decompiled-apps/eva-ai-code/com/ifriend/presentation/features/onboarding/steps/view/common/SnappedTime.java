package com.ifriend.presentation.features.onboarding.steps.view.common;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.time.LocalTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: OnboardingWheelPickerComponent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedTime;", "", "snappedLocalTime", "Ljava/time/LocalTime;", "snappedIndex", "", "(Ljava/time/LocalTime;I)V", "getSnappedIndex", "()I", "getSnappedLocalTime", "()Ljava/time/LocalTime;", "Hour", "Minute", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedTime$Hour;", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedTime$Minute;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class SnappedTime {
    private final int snappedIndex;
    private final LocalTime snappedLocalTime;

    public /* synthetic */ SnappedTime(LocalTime localTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(localTime, i);
    }

    /* compiled from: OnboardingWheelPickerComponent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedTime$Hour;", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedTime;", "localTime", "Ljava/time/LocalTime;", FirebaseAnalytics.Param.INDEX, "", "(Ljava/time/LocalTime;I)V", "getIndex", "()I", "getLocalTime", "()Ljava/time/LocalTime;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Hour extends SnappedTime {
        public static final int $stable = 8;
        private final int index;
        private final LocalTime localTime;

        public static /* synthetic */ Hour copy$default(Hour hour, LocalTime localTime, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                localTime = hour.localTime;
            }
            if ((i2 & 2) != 0) {
                i = hour.index;
            }
            return hour.copy(localTime, i);
        }

        public final LocalTime component1() {
            return this.localTime;
        }

        public final int component2() {
            return this.index;
        }

        public final Hour copy(LocalTime localTime, int i) {
            Intrinsics.checkNotNullParameter(localTime, "localTime");
            return new Hour(localTime, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Hour) {
                Hour hour = (Hour) obj;
                return Intrinsics.areEqual(this.localTime, hour.localTime) && this.index == hour.index;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            hashCode = this.localTime.hashCode();
            return (hashCode * 31) + this.index;
        }

        public String toString() {
            LocalTime localTime = this.localTime;
            int i = this.index;
            return "Hour(localTime=" + localTime + ", index=" + i + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Hour(LocalTime localTime, int i) {
            super(localTime, i, null);
            Intrinsics.checkNotNullParameter(localTime, "localTime");
            this.localTime = localTime;
            this.index = i;
        }

        public final int getIndex() {
            return this.index;
        }

        public final LocalTime getLocalTime() {
            return this.localTime;
        }
    }

    private SnappedTime(LocalTime localTime, int i) {
        this.snappedLocalTime = localTime;
        this.snappedIndex = i;
    }

    public final int getSnappedIndex() {
        return this.snappedIndex;
    }

    public final LocalTime getSnappedLocalTime() {
        return this.snappedLocalTime;
    }

    /* compiled from: OnboardingWheelPickerComponent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedTime$Minute;", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SnappedTime;", "localTime", "Ljava/time/LocalTime;", FirebaseAnalytics.Param.INDEX, "", "(Ljava/time/LocalTime;I)V", "getIndex", "()I", "getLocalTime", "()Ljava/time/LocalTime;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Minute extends SnappedTime {
        public static final int $stable = 8;
        private final int index;
        private final LocalTime localTime;

        public static /* synthetic */ Minute copy$default(Minute minute, LocalTime localTime, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                localTime = minute.localTime;
            }
            if ((i2 & 2) != 0) {
                i = minute.index;
            }
            return minute.copy(localTime, i);
        }

        public final LocalTime component1() {
            return this.localTime;
        }

        public final int component2() {
            return this.index;
        }

        public final Minute copy(LocalTime localTime, int i) {
            Intrinsics.checkNotNullParameter(localTime, "localTime");
            return new Minute(localTime, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Minute) {
                Minute minute = (Minute) obj;
                return Intrinsics.areEqual(this.localTime, minute.localTime) && this.index == minute.index;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            hashCode = this.localTime.hashCode();
            return (hashCode * 31) + this.index;
        }

        public String toString() {
            LocalTime localTime = this.localTime;
            int i = this.index;
            return "Minute(localTime=" + localTime + ", index=" + i + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Minute(LocalTime localTime, int i) {
            super(localTime, i, null);
            Intrinsics.checkNotNullParameter(localTime, "localTime");
            this.localTime = localTime;
            this.index = i;
        }

        public final int getIndex() {
            return this.index;
        }

        public final LocalTime getLocalTime() {
            return this.localTime;
        }
    }
}
