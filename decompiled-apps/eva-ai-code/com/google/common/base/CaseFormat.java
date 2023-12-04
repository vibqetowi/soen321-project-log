package com.google.common.base;

import java.io.Serializable;
import javax.annotation.CheckForNull;
import org.apache.commons.codec.language.Soundex;
@ElementTypesAreNonnullByDefault
/* loaded from: classes7.dex */
public enum CaseFormat {
    LOWER_HYPHEN(CharMatcher.is(Soundex.SILENT_MARKER), "-") { // from class: com.google.common.base.CaseFormat.1
        @Override // com.google.common.base.CaseFormat
        String normalizeWord(String str) {
            return Ascii.toLowerCase(str);
        }

        @Override // com.google.common.base.CaseFormat
        String convert(CaseFormat caseFormat, String str) {
            if (caseFormat == LOWER_UNDERSCORE) {
                return str.replace(Soundex.SILENT_MARKER, '_');
            }
            if (caseFormat == UPPER_UNDERSCORE) {
                return Ascii.toUpperCase(str.replace(Soundex.SILENT_MARKER, '_'));
            }
            return super.convert(caseFormat, str);
        }
    },
    LOWER_UNDERSCORE(CharMatcher.is('_'), "_") { // from class: com.google.common.base.CaseFormat.2
        @Override // com.google.common.base.CaseFormat
        String normalizeWord(String str) {
            return Ascii.toLowerCase(str);
        }

        @Override // com.google.common.base.CaseFormat
        String convert(CaseFormat caseFormat, String str) {
            if (caseFormat == LOWER_HYPHEN) {
                return str.replace('_', Soundex.SILENT_MARKER);
            }
            if (caseFormat == UPPER_UNDERSCORE) {
                return Ascii.toUpperCase(str);
            }
            return super.convert(caseFormat, str);
        }
    },
    LOWER_CAMEL(CharMatcher.inRange('A', 'Z'), "") { // from class: com.google.common.base.CaseFormat.3
        @Override // com.google.common.base.CaseFormat
        String normalizeWord(String str) {
            return CaseFormat.firstCharOnlyToUpper(str);
        }

        @Override // com.google.common.base.CaseFormat
        String normalizeFirstWord(String str) {
            return Ascii.toLowerCase(str);
        }
    },
    UPPER_CAMEL(CharMatcher.inRange('A', 'Z'), "") { // from class: com.google.common.base.CaseFormat.4
        @Override // com.google.common.base.CaseFormat
        String normalizeWord(String str) {
            return CaseFormat.firstCharOnlyToUpper(str);
        }
    },
    UPPER_UNDERSCORE(CharMatcher.is('_'), "_") { // from class: com.google.common.base.CaseFormat.5
        @Override // com.google.common.base.CaseFormat
        String normalizeWord(String str) {
            return Ascii.toUpperCase(str);
        }

        @Override // com.google.common.base.CaseFormat
        String convert(CaseFormat caseFormat, String str) {
            if (caseFormat == LOWER_HYPHEN) {
                return Ascii.toLowerCase(str.replace('_', Soundex.SILENT_MARKER));
            }
            if (caseFormat == LOWER_UNDERSCORE) {
                return Ascii.toLowerCase(str);
            }
            return super.convert(caseFormat, str);
        }
    };
    
    private final CharMatcher wordBoundary;
    private final String wordSeparator;

    abstract String normalizeWord(String str);

    CaseFormat(CharMatcher charMatcher, String str) {
        this.wordBoundary = charMatcher;
        this.wordSeparator = str;
    }

    public final String to(CaseFormat caseFormat, String str) {
        Preconditions.checkNotNull(caseFormat);
        Preconditions.checkNotNull(str);
        return caseFormat == this ? str : convert(caseFormat, str);
    }

    String convert(CaseFormat caseFormat, String str) {
        StringBuilder sb = null;
        int i = 0;
        int i2 = -1;
        while (true) {
            i2 = this.wordBoundary.indexIn(str, i2 + 1);
            if (i2 == -1) {
                break;
            }
            if (i == 0) {
                sb = new StringBuilder(str.length() + (caseFormat.wordSeparator.length() * 4));
                sb.append(caseFormat.normalizeFirstWord(str.substring(i, i2)));
            } else {
                ((StringBuilder) java.util.Objects.requireNonNull(sb)).append(caseFormat.normalizeWord(str.substring(i, i2)));
            }
            sb.append(caseFormat.wordSeparator);
            i = this.wordSeparator.length() + i2;
        }
        if (i == 0) {
            return caseFormat.normalizeFirstWord(str);
        }
        StringBuilder sb2 = (StringBuilder) java.util.Objects.requireNonNull(sb);
        sb2.append(caseFormat.normalizeWord(str.substring(i)));
        return sb2.toString();
    }

    public Converter<String, String> converterTo(CaseFormat caseFormat) {
        return new StringConverter(this, caseFormat);
    }

    /* loaded from: classes7.dex */
    private static final class StringConverter extends Converter<String, String> implements Serializable {
        private static final long serialVersionUID = 0;
        private final CaseFormat sourceFormat;
        private final CaseFormat targetFormat;

        StringConverter(CaseFormat caseFormat, CaseFormat caseFormat2) {
            this.sourceFormat = (CaseFormat) Preconditions.checkNotNull(caseFormat);
            this.targetFormat = (CaseFormat) Preconditions.checkNotNull(caseFormat2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public String doForward(String str) {
            return this.sourceFormat.to(this.targetFormat, str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public String doBackward(String str) {
            return this.targetFormat.to(this.sourceFormat, str);
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof StringConverter) {
                StringConverter stringConverter = (StringConverter) obj;
                return this.sourceFormat.equals(stringConverter.sourceFormat) && this.targetFormat.equals(stringConverter.targetFormat);
            }
            return false;
        }

        public int hashCode() {
            return this.sourceFormat.hashCode() ^ this.targetFormat.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(this.sourceFormat);
            String valueOf2 = String.valueOf(this.targetFormat);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + String.valueOf(valueOf2).length());
            sb.append(valueOf);
            sb.append(".converterTo(");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    String normalizeFirstWord(String str) {
        return normalizeWord(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String firstCharOnlyToUpper(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char upperCase = Ascii.toUpperCase(str.charAt(0));
        String lowerCase = Ascii.toLowerCase(str.substring(1));
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1);
        sb.append(upperCase);
        sb.append(lowerCase);
        return sb.toString();
    }
}
