package androidx.compose.material3;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: CalendarModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/DateInputFormat;", "", "patternWithDelimiters", "", TtmlNode.RUBY_DELIMITER, "", "(Ljava/lang/String;C)V", "getDelimiter", "()C", "getPatternWithDelimiters", "()Ljava/lang/String;", "patternWithoutDelimiters", "getPatternWithoutDelimiters", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DateInputFormat {
    private final char delimiter;
    private final String patternWithDelimiters;
    private final String patternWithoutDelimiters;

    public static /* synthetic */ DateInputFormat copy$default(DateInputFormat dateInputFormat, String str, char c, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dateInputFormat.patternWithDelimiters;
        }
        if ((i & 2) != 0) {
            c = dateInputFormat.delimiter;
        }
        return dateInputFormat.copy(str, c);
    }

    public final String component1() {
        return this.patternWithDelimiters;
    }

    public final char component2() {
        return this.delimiter;
    }

    public final DateInputFormat copy(String patternWithDelimiters, char c) {
        Intrinsics.checkNotNullParameter(patternWithDelimiters, "patternWithDelimiters");
        return new DateInputFormat(patternWithDelimiters, c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DateInputFormat) {
            DateInputFormat dateInputFormat = (DateInputFormat) obj;
            return Intrinsics.areEqual(this.patternWithDelimiters, dateInputFormat.patternWithDelimiters) && this.delimiter == dateInputFormat.delimiter;
        }
        return false;
    }

    public int hashCode() {
        return (this.patternWithDelimiters.hashCode() * 31) + this.delimiter;
    }

    public String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.patternWithDelimiters + ", delimiter=" + this.delimiter + ')';
    }

    public DateInputFormat(String patternWithDelimiters, char c) {
        Intrinsics.checkNotNullParameter(patternWithDelimiters, "patternWithDelimiters");
        this.patternWithDelimiters = patternWithDelimiters;
        this.delimiter = c;
        this.patternWithoutDelimiters = StringsKt.replace$default(patternWithDelimiters, String.valueOf(c), "", false, 4, (Object) null);
    }

    public final String getPatternWithDelimiters() {
        return this.patternWithDelimiters;
    }

    public final char getDelimiter() {
        return this.delimiter;
    }

    public final String getPatternWithoutDelimiters() {
        return this.patternWithoutDelimiters;
    }
}
