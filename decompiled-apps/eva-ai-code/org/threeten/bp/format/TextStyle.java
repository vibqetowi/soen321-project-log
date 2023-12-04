package org.threeten.bp.format;
/* loaded from: classes5.dex */
public enum TextStyle {
    FULL,
    FULL_STANDALONE,
    SHORT,
    SHORT_STANDALONE,
    NARROW,
    NARROW_STANDALONE;

    public boolean isStandalone() {
        return (ordinal() & 1) == 1;
    }

    public TextStyle asStandalone() {
        return values()[ordinal() | 1];
    }

    public TextStyle asNormal() {
        return values()[ordinal() & (-2)];
    }
}
