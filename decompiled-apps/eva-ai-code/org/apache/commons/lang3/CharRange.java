package org.apache.commons.lang3;

import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.commons.codec.language.Soundex;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class CharRange implements Iterable<Character>, Serializable {
    private static final long serialVersionUID = 8270183163158333422L;
    private final char end;
    private transient String iToString;
    private final boolean negated;
    private final char start;

    private CharRange(char c, char c2, boolean z) {
        if (c > c2) {
            c2 = c;
            c = c2;
        }
        this.start = c;
        this.end = c2;
        this.negated = z;
    }

    public static CharRange is(char c) {
        return new CharRange(c, c, false);
    }

    public static CharRange isNot(char c) {
        return new CharRange(c, c, true);
    }

    public static CharRange isIn(char c, char c2) {
        return new CharRange(c, c2, false);
    }

    public static CharRange isNotIn(char c, char c2) {
        return new CharRange(c, c2, true);
    }

    public char getStart() {
        return this.start;
    }

    public char getEnd() {
        return this.end;
    }

    public boolean isNegated() {
        return this.negated;
    }

    public boolean contains(char c) {
        return (c >= this.start && c <= this.end) != this.negated;
    }

    public boolean contains(CharRange charRange) {
        Validate.notNull(charRange, "The Range must not be null", new Object[0]);
        return this.negated ? charRange.negated ? this.start >= charRange.start && this.end <= charRange.end : charRange.end < this.start || charRange.start > this.end : charRange.negated ? this.start == 0 && this.end == 65535 : this.start <= charRange.start && this.end >= charRange.end;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CharRange) {
            CharRange charRange = (CharRange) obj;
            return this.start == charRange.start && this.end == charRange.end && this.negated == charRange.negated;
        }
        return false;
    }

    public int hashCode() {
        return this.start + 'S' + (this.end * 7) + (this.negated ? 1 : 0);
    }

    public String toString() {
        if (this.iToString == null) {
            StringBuilder sb = new StringBuilder(4);
            if (isNegated()) {
                sb.append('^');
            }
            sb.append(this.start);
            if (this.start != this.end) {
                sb.append(Soundex.SILENT_MARKER);
                sb.append(this.end);
            }
            this.iToString = sb.toString();
        }
        return this.iToString;
    }

    @Override // java.lang.Iterable
    public Iterator<Character> iterator() {
        return new CharacterIterator();
    }

    /* loaded from: classes5.dex */
    private static class CharacterIterator implements Iterator<Character> {
        private char current;
        private boolean hasNext;
        private final CharRange range;

        private CharacterIterator(CharRange charRange) {
            this.range = charRange;
            this.hasNext = true;
            if (charRange.negated) {
                if (charRange.start == 0) {
                    if (charRange.end != 65535) {
                        this.current = (char) (charRange.end + 1);
                        return;
                    } else {
                        this.hasNext = false;
                        return;
                    }
                }
                this.current = (char) 0;
                return;
            }
            this.current = charRange.start;
        }

        private void prepareNext() {
            if (!this.range.negated) {
                if (this.current < this.range.end) {
                    this.current = (char) (this.current + 1);
                    return;
                } else {
                    this.hasNext = false;
                    return;
                }
            }
            char c = this.current;
            if (c != 65535) {
                if (c + 1 == this.range.start) {
                    if (this.range.end != 65535) {
                        this.current = (char) (this.range.end + 1);
                        return;
                    } else {
                        this.hasNext = false;
                        return;
                    }
                }
                this.current = (char) (this.current + 1);
                return;
            }
            this.hasNext = false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasNext;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public Character next() {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            char c = this.current;
            prepareNext();
            return Character.valueOf(c);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
