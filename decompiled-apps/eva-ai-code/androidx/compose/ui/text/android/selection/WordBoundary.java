package androidx.compose.ui.text.android.selection;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: WordBoundary.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordBoundary;", "", "locale", "Ljava/util/Locale;", "text", "", "(Ljava/util/Locale;Ljava/lang/CharSequence;)V", "wordIterator", "Landroidx/compose/ui/text/android/selection/WordIterator;", "getWordEnd", "", TypedValues.CycleType.S_WAVE_OFFSET, "getWordStart", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WordBoundary {
    private final WordIterator wordIterator;

    public WordBoundary(Locale locale, CharSequence text) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(text, "text");
        this.wordIterator = new WordIterator(text, 0, text.length(), locale);
    }

    public final int getWordStart(int i) {
        int prevWordBeginningOnTwoWordsBoundary;
        if (this.wordIterator.isOnPunctuation(this.wordIterator.prevBoundary(i))) {
            prevWordBeginningOnTwoWordsBoundary = this.wordIterator.getPunctuationBeginning(i);
        } else {
            prevWordBeginningOnTwoWordsBoundary = this.wordIterator.getPrevWordBeginningOnTwoWordsBoundary(i);
        }
        return prevWordBeginningOnTwoWordsBoundary == -1 ? i : prevWordBeginningOnTwoWordsBoundary;
    }

    public final int getWordEnd(int i) {
        int nextWordEndOnTwoWordBoundary;
        if (this.wordIterator.isAfterPunctuation(this.wordIterator.nextBoundary(i))) {
            nextWordEndOnTwoWordBoundary = this.wordIterator.getPunctuationEnd(i);
        } else {
            nextWordEndOnTwoWordBoundary = this.wordIterator.getNextWordEndOnTwoWordBoundary(i);
        }
        return nextWordEndOnTwoWordBoundary == -1 ? i : nextWordEndOnTwoWordBoundary;
    }
}
