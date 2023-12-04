package com.google.android.exoplayer2.text.ttml;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
final class TextEmphasis {
    public static final int MARK_SHAPE_AUTO = -1;
    public static final int POSITION_OUTSIDE = -2;
    public final int markFill;
    public final int markShape;
    public final int position;
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\s+");
    private static final ImmutableSet<String> SINGLE_STYLE_VALUES = ImmutableSet.of("auto", "none");
    private static final ImmutableSet<String> MARK_SHAPE_VALUES = ImmutableSet.of(TtmlNode.TEXT_EMPHASIS_MARK_DOT, TtmlNode.TEXT_EMPHASIS_MARK_SESAME, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
    private static final ImmutableSet<String> MARK_FILL_VALUES = ImmutableSet.of(TtmlNode.TEXT_EMPHASIS_MARK_FILLED, "open");
    private static final ImmutableSet<String> POSITION_VALUES = ImmutableSet.of(TtmlNode.ANNOTATION_POSITION_AFTER, TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_OUTSIDE);

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Position {
    }

    private TextEmphasis(int i, int i2, int i3) {
        this.markShape = i;
        this.markFill = i2;
        this.position = i3;
    }

    public static TextEmphasis parse(String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (lowerCase.isEmpty()) {
            return null;
        }
        return parseWords(ImmutableSet.copyOf(TextUtils.split(lowerCase, WHITESPACE_PATTERN)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0081, code lost:
        if (r9.equals("auto") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00fe, code lost:
        if (r9.equals(com.google.android.exoplayer2.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_DOT) == false) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static TextEmphasis parseWords(ImmutableSet<String> immutableSet) {
        boolean z;
        boolean z2;
        String str = (String) Iterables.getFirst(Sets.intersection(POSITION_VALUES, immutableSet), TtmlNode.ANNOTATION_POSITION_OUTSIDE);
        int hashCode = str.hashCode();
        boolean z3 = false;
        boolean z4 = true;
        if (hashCode == -1392885889) {
            if (str.equals(TtmlNode.ANNOTATION_POSITION_BEFORE)) {
                z = true;
            }
            z = true;
        } else if (hashCode != -1106037339) {
            if (hashCode == 92734940 && str.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                z = false;
            }
            z = true;
        } else {
            if (str.equals(TtmlNode.ANNOTATION_POSITION_OUTSIDE)) {
                z = true;
            }
            z = true;
        }
        int i = z ? !z ? 1 : -2 : 2;
        Sets.SetView intersection = Sets.intersection(SINGLE_STYLE_VALUES, immutableSet);
        if (!intersection.isEmpty()) {
            String str2 = (String) intersection.iterator().next();
            int hashCode2 = str2.hashCode();
            if (hashCode2 != 3005871) {
                if (hashCode2 == 3387192 && str2.equals("none")) {
                    z4 = false;
                }
                z4 = true;
            }
            return new TextEmphasis(z4 ? -1 : 0, 0, i);
        }
        Sets.SetView intersection2 = Sets.intersection(MARK_FILL_VALUES, immutableSet);
        Sets.SetView intersection3 = Sets.intersection(MARK_SHAPE_VALUES, immutableSet);
        if (intersection2.isEmpty() && intersection3.isEmpty()) {
            return new TextEmphasis(-1, 0, i);
        }
        String str3 = (String) Iterables.getFirst(intersection2, TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
        int hashCode3 = str3.hashCode();
        if (hashCode3 != -1274499742) {
            if (hashCode3 == 3417674 && str3.equals("open")) {
                z2 = false;
            }
            z2 = true;
        } else {
            if (str3.equals(TtmlNode.TEXT_EMPHASIS_MARK_FILLED)) {
                z2 = true;
            }
            z2 = true;
        }
        int i2 = z2 ? 1 : 2;
        String str4 = (String) Iterables.getFirst(intersection3, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
        int hashCode4 = str4.hashCode();
        if (hashCode4 == -1360216880) {
            if (str4.equals(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE)) {
                z3 = true;
            }
            z3 = true;
        } else if (hashCode4 != -905816648) {
            if (hashCode4 == 99657) {
            }
            z3 = true;
        } else {
            if (str4.equals(TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                z3 = true;
            }
            z3 = true;
        }
        return new TextEmphasis(z3 ? !z3 ? 1 : 3 : 2, i2, i);
    }
}
