package com.ifriend.chat.presentation.ui.rateApp;

import com.ifriend.ui.base.mvvm.BaseState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: RateAppState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/chat/presentation/ui/rateApp/RateAppState;", "Lcom/ifriend/ui/base/mvvm/BaseState;", "()V", "ReviewState", "StarsState", "Lcom/ifriend/chat/presentation/ui/rateApp/RateAppState$ReviewState;", "Lcom/ifriend/chat/presentation/ui/rateApp/RateAppState$StarsState;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class RateAppState extends BaseState {
    public static final int $stable = 0;

    public /* synthetic */ RateAppState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: RateAppState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/ifriend/chat/presentation/ui/rateApp/RateAppState$StarsState;", "Lcom/ifriend/chat/presentation/ui/rateApp/RateAppState;", "name", "", "stars", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getName", "()Ljava/lang/String;", "getStars", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/ifriend/chat/presentation/ui/rateApp/RateAppState$StarsState;", "equals", "", "other", "", "hashCode", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class StarsState extends RateAppState {
        public static final int $stable = 0;
        private final String name;
        private final Integer stars;

        public static /* synthetic */ StarsState copy$default(StarsState starsState, String str, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = starsState.name;
            }
            if ((i & 2) != 0) {
                num = starsState.stars;
            }
            return starsState.copy(str, num);
        }

        public final String component1() {
            return this.name;
        }

        public final Integer component2() {
            return this.stars;
        }

        public final StarsState copy(String name, Integer num) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new StarsState(name, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof StarsState) {
                StarsState starsState = (StarsState) obj;
                return Intrinsics.areEqual(this.name, starsState.name) && Intrinsics.areEqual(this.stars, starsState.stars);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            Integer num = this.stars;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            String str = this.name;
            Integer num = this.stars;
            return "StarsState(name=" + str + ", stars=" + num + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StarsState(String name, Integer num) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.stars = num;
        }

        public /* synthetic */ StarsState(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : num);
        }

        public final String getName() {
            return this.name;
        }

        public final Integer getStars() {
            return this.stars;
        }
    }

    private RateAppState() {
    }

    /* compiled from: RateAppState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ifriend/chat/presentation/ui/rateApp/RateAppState$ReviewState;", "Lcom/ifriend/chat/presentation/ui/rateApp/RateAppState;", "review", "", "currentCharacterCount", "", "maxCharacterCount", "(Ljava/lang/String;II)V", "getCurrentCharacterCount", "()I", "getMaxCharacterCount", "getReview", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class ReviewState extends RateAppState {
        public static final int $stable = 0;
        private final int currentCharacterCount;
        private final int maxCharacterCount;
        private final String review;

        public static /* synthetic */ ReviewState copy$default(ReviewState reviewState, String str, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = reviewState.review;
            }
            if ((i3 & 2) != 0) {
                i = reviewState.currentCharacterCount;
            }
            if ((i3 & 4) != 0) {
                i2 = reviewState.maxCharacterCount;
            }
            return reviewState.copy(str, i, i2);
        }

        public final String component1() {
            return this.review;
        }

        public final int component2() {
            return this.currentCharacterCount;
        }

        public final int component3() {
            return this.maxCharacterCount;
        }

        public final ReviewState copy(String review, int i, int i2) {
            Intrinsics.checkNotNullParameter(review, "review");
            return new ReviewState(review, i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ReviewState) {
                ReviewState reviewState = (ReviewState) obj;
                return Intrinsics.areEqual(this.review, reviewState.review) && this.currentCharacterCount == reviewState.currentCharacterCount && this.maxCharacterCount == reviewState.maxCharacterCount;
            }
            return false;
        }

        public int hashCode() {
            return (((this.review.hashCode() * 31) + this.currentCharacterCount) * 31) + this.maxCharacterCount;
        }

        public String toString() {
            String str = this.review;
            int i = this.currentCharacterCount;
            int i2 = this.maxCharacterCount;
            return "ReviewState(review=" + str + ", currentCharacterCount=" + i + ", maxCharacterCount=" + i2 + ")";
        }

        public final String getReview() {
            return this.review;
        }

        public final int getCurrentCharacterCount() {
            return this.currentCharacterCount;
        }

        public final int getMaxCharacterCount() {
            return this.maxCharacterCount;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReviewState(String review, int i, int i2) {
            super(null);
            Intrinsics.checkNotNullParameter(review, "review");
            this.review = review;
            this.currentCharacterCount = i;
            this.maxCharacterCount = i2;
        }
    }
}
