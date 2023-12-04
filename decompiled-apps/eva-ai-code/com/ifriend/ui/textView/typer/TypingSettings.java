package com.ifriend.ui.textView.typer;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
/* compiled from: TypingSettings.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/ifriend/ui/textView/typer/TypingSettings;", "", "speed", "Lcom/ifriend/ui/textView/typer/TypingSettings$Speed;", "growth", "Lcom/ifriend/ui/textView/typer/TypingSettings$Growth;", "(Lcom/ifriend/ui/textView/typer/TypingSettings$Speed;Lcom/ifriend/ui/textView/typer/TypingSettings$Growth;)V", "getGrowth", "()Lcom/ifriend/ui/textView/typer/TypingSettings$Growth;", "getSpeed", "()Lcom/ifriend/ui/textView/typer/TypingSettings$Speed;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Growth", "Speed", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TypingSettings {
    public static final int $stable = 0;
    private final Growth growth;
    private final Speed speed;

    public static /* synthetic */ TypingSettings copy$default(TypingSettings typingSettings, Speed speed, Growth growth, int i, Object obj) {
        if ((i & 1) != 0) {
            speed = typingSettings.speed;
        }
        if ((i & 2) != 0) {
            growth = typingSettings.growth;
        }
        return typingSettings.copy(speed, growth);
    }

    public final Speed component1() {
        return this.speed;
    }

    public final Growth component2() {
        return this.growth;
    }

    public final TypingSettings copy(Speed speed, Growth growth) {
        Intrinsics.checkNotNullParameter(speed, "speed");
        Intrinsics.checkNotNullParameter(growth, "growth");
        return new TypingSettings(speed, growth);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TypingSettings) {
            TypingSettings typingSettings = (TypingSettings) obj;
            return Intrinsics.areEqual(this.speed, typingSettings.speed) && Intrinsics.areEqual(this.growth, typingSettings.growth);
        }
        return false;
    }

    public int hashCode() {
        return (this.speed.hashCode() * 31) + this.growth.hashCode();
    }

    public String toString() {
        Speed speed = this.speed;
        Growth growth = this.growth;
        return "TypingSettings(speed=" + speed + ", growth=" + growth + ")";
    }

    public TypingSettings(Speed speed, Growth growth) {
        Intrinsics.checkNotNullParameter(speed, "speed");
        Intrinsics.checkNotNullParameter(growth, "growth");
        this.speed = speed;
        this.growth = growth;
    }

    public final Speed getSpeed() {
        return this.speed;
    }

    public /* synthetic */ TypingSettings(Speed speed, Growth.ByChars byChars, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(speed, (i & 2) != 0 ? new Growth.ByChars(0, 1, null) : byChars);
    }

    public final Growth getGrowth() {
        return this.growth;
    }

    /* compiled from: TypingSettings.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0002\t\nJ(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H&¨\u0006\u000b"}, d2 = {"Lcom/ifriend/ui/textView/typer/TypingSettings$Speed;", "", "calculateDelay", "", TypedValues.AttributesType.S_TARGET, "", "alreadyTypedLength", "typingSubstring", "iteration", "RandomInRange", "SpeedUp", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface Speed {
        int calculateDelay(CharSequence charSequence, int i, CharSequence charSequence2, int i2);

        /* compiled from: TypingSettings.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ifriend/ui/textView/typer/TypingSettings$Speed$RandomInRange;", "Lcom/ifriend/ui/textView/typer/TypingSettings$Speed;", "typingDelayInMillis", "Lkotlin/ranges/IntRange;", "(Lkotlin/ranges/IntRange;)V", "calculateDelay", "", TypedValues.AttributesType.S_TARGET, "", "alreadyTypedLength", "typingSubstring", "iteration", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class RandomInRange implements Speed {
            public static final int $stable = 8;
            private final IntRange typingDelayInMillis;

            public RandomInRange(IntRange typingDelayInMillis) {
                Intrinsics.checkNotNullParameter(typingDelayInMillis, "typingDelayInMillis");
                this.typingDelayInMillis = typingDelayInMillis;
            }

            @Override // com.ifriend.ui.textView.typer.TypingSettings.Speed
            public int calculateDelay(CharSequence target, int i, CharSequence typingSubstring, int i2) {
                Intrinsics.checkNotNullParameter(target, "target");
                Intrinsics.checkNotNullParameter(typingSubstring, "typingSubstring");
                return RangesKt.random(this.typingDelayInMillis, Random.Default);
            }
        }

        /* compiled from: TypingSettings.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/ifriend/ui/textView/typer/TypingSettings$Speed$SpeedUp;", "Lcom/ifriend/ui/textView/typer/TypingSettings$Speed;", "()V", "calculateDelay", "", TypedValues.AttributesType.S_TARGET, "", "alreadyTypedLength", "typingSubstring", "iteration", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SpeedUp implements Speed {
            public static final int $stable = 0;

            @Override // com.ifriend.ui.textView.typer.TypingSettings.Speed
            public int calculateDelay(CharSequence target, int i, CharSequence typingSubstring, int i2) {
                int i3;
                Intrinsics.checkNotNullParameter(target, "target");
                Intrinsics.checkNotNullParameter(typingSubstring, "typingSubstring");
                if (typingSubstring.length() > 12) {
                    i3 = 400;
                } else {
                    i3 = typingSubstring.length() > 5 ? 300 : 150;
                }
                if (i2 > 6) {
                    return i3 / 4;
                }
                return i2 > 3 ? i3 / 2 : i3;
            }
        }
    }

    /* compiled from: TypingSettings.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0003\u0007\b\tJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/ifriend/ui/textView/typer/TypingSettings$Growth;", "", "calculateGrowth", "", TypedValues.AttributesType.S_TARGET, "", "alreadyTypedLength", "ByChars", "ByWords", "FirstWordsByCharsThenByWords", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface Growth {
        int calculateGrowth(CharSequence charSequence, int i);

        /* compiled from: TypingSettings.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ifriend/ui/textView/typer/TypingSettings$Growth$FirstWordsByCharsThenByWords;", "Lcom/ifriend/ui/textView/typer/TypingSettings$Growth;", "byChars", "Lcom/ifriend/ui/textView/typer/TypingSettings$Growth$ByChars;", "byWords", "Lcom/ifriend/ui/textView/typer/TypingSettings$Growth$ByWords;", "countOfWordsNeedToTypeByChars", "", "(Lcom/ifriend/ui/textView/typer/TypingSettings$Growth$ByChars;Lcom/ifriend/ui/textView/typer/TypingSettings$Growth$ByWords;I)V", "calculateGrowth", TypedValues.AttributesType.S_TARGET, "", "alreadyTypedLength", "countOfTypedWords", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class FirstWordsByCharsThenByWords implements Growth {
            public static final int $stable = 0;
            private final ByChars byChars;
            private final ByWords byWords;
            private final int countOfWordsNeedToTypeByChars;

            public FirstWordsByCharsThenByWords(ByChars byChars, ByWords byWords, int i) {
                Intrinsics.checkNotNullParameter(byChars, "byChars");
                Intrinsics.checkNotNullParameter(byWords, "byWords");
                this.byChars = byChars;
                this.byWords = byWords;
                this.countOfWordsNeedToTypeByChars = i;
            }

            @Override // com.ifriend.ui.textView.typer.TypingSettings.Growth
            public int calculateGrowth(CharSequence target, int i) {
                Intrinsics.checkNotNullParameter(target, "target");
                return countOfTypedWords(target, i) < this.countOfWordsNeedToTypeByChars ? this.byChars.calculateGrowth(target, i) : this.byWords.calculateGrowth(target, i);
            }

            private final int countOfTypedWords(CharSequence charSequence, int i) {
                CharSequence subSequence = StringsKt.subSequence(charSequence, new IntRange(0, i));
                int i2 = 0;
                for (int i3 = 0; i3 < subSequence.length(); i3++) {
                    if (subSequence.charAt(i3) == ' ') {
                        i2++;
                    }
                }
                return i2;
            }
        }

        /* compiled from: TypingSettings.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ifriend/ui/textView/typer/TypingSettings$Growth$ByChars;", "Lcom/ifriend/ui/textView/typer/TypingSettings$Growth;", "count", "", "(I)V", "getCount", "()I", "calculateGrowth", TypedValues.AttributesType.S_TARGET, "", "alreadyTypedLength", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ByChars implements Growth {
            public static final int $stable = 0;
            private final int count;

            public ByChars() {
                this(0, 1, null);
            }

            public ByChars(int i) {
                this.count = i;
            }

            public /* synthetic */ ByChars(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? 1 : i);
            }

            public final int getCount() {
                return this.count;
            }

            @Override // com.ifriend.ui.textView.typer.TypingSettings.Growth
            public int calculateGrowth(CharSequence target, int i) {
                Intrinsics.checkNotNullParameter(target, "target");
                int length = target.length() - i;
                int i2 = this.count;
                return length < i2 ? length : i2;
            }
        }

        /* compiled from: TypingSettings.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ifriend/ui/textView/typer/TypingSettings$Growth$ByWords;", "Lcom/ifriend/ui/textView/typer/TypingSettings$Growth;", "withDividers", "", "(Z)V", "calculateGrowth", "", TypedValues.AttributesType.S_TARGET, "", "alreadyTypedLength", "Companion", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class ByWords implements Growth {
            public static final int $stable = 0;
            @Deprecated
            public static final String dividers = ",.!?:;-@";
            private static final String emojies;
            private static final Regex wordWithRolePlay;
            private static final Regex wordsAndDividersRegex;
            private static final Regex wordsWithDividers;
            private final boolean withDividers;
            private static final Companion Companion = new Companion(null);
            private static final String oneEmoji = "[\\uD83C-\\uDBFF\\uDC00-\\uDFFF]";

            public ByWords(boolean z) {
                this.withDividers = z;
            }

            /* compiled from: TypingSettings.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/ifriend/ui/textView/typer/TypingSettings$Growth$ByWords$Companion;", "", "()V", "dividers", "", "emojies", "getEmojies", "()Ljava/lang/String;", "oneEmoji", "getOneEmoji", "wordWithRolePlay", "Lkotlin/text/Regex;", "getWordWithRolePlay", "()Lkotlin/text/Regex;", "wordsAndDividersRegex", "getWordsAndDividersRegex", "wordsWithDividers", "getWordsWithDividers", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes4.dex */
            private static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final String getOneEmoji() {
                    return ByWords.oneEmoji;
                }

                public final Regex getWordWithRolePlay() {
                    return ByWords.wordWithRolePlay;
                }

                public final String getEmojies() {
                    return ByWords.emojies;
                }

                public final Regex getWordsWithDividers() {
                    return ByWords.wordsWithDividers;
                }

                public final Regex getWordsAndDividersRegex() {
                    return ByWords.wordsAndDividersRegex;
                }
            }

            static {
                Regex regex = new Regex("\\*?\\w+\\*?");
                wordWithRolePlay = regex;
                String str = "[\\uD83C-\\uDBFF\\uDC00-\\uDFFF]+";
                emojies = str;
                wordsWithDividers = new Regex("(" + str + ")|(\\s*(" + regex + "[,.!?:;-@]*\\s*[,.!?:;-@]*))");
                wordsAndDividersRegex = new Regex("(" + str + ")|([,.!?:;-@]+\\s*)|(\\s*(" + regex + "\\s*))");
            }

            @Override // com.ifriend.ui.textView.typer.TypingSettings.Growth
            public int calculateGrowth(CharSequence target, int i) {
                Intrinsics.checkNotNullParameter(target, "target");
                MatchResult find = (this.withDividers ? wordsWithDividers : wordsAndDividersRegex).find(target, i);
                IntRange range = find != null ? find.getRange() : null;
                int length = target.length() - i;
                if (range != null || target.length() <= i) {
                    if (range == null) {
                        return 0;
                    }
                    int last = (range.getLast() + 1) - i;
                    return i + last > target.length() ? length : last;
                }
                return length;
            }
        }
    }
}
