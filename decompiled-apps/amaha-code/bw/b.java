package bw;

import com.appsflyer.R;
/* compiled from: GifError.java */
/* loaded from: classes2.dex */
public enum b {
    /* JADX INFO: Fake field, exist only in values array */
    NO_ERROR(0, "No error"),
    OPEN_FAILED(R.styleable.AppCompatTheme_switchStyle, "Failed to open given input"),
    /* JADX INFO: Fake field, exist only in values array */
    READ_FAILED(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, "Failed to read from given input"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_GIF_FILE(R.styleable.AppCompatTheme_textAppearanceListItem, "Data is not in GIF format"),
    /* JADX INFO: Fake field, exist only in values array */
    NO_SCRN_DSCR(R.styleable.AppCompatTheme_textAppearanceListItemSecondary, "No screen descriptor detected"),
    /* JADX INFO: Fake field, exist only in values array */
    NO_IMAG_DSCR(R.styleable.AppCompatTheme_textAppearanceListItemSmall, "No image descriptor detected"),
    /* JADX INFO: Fake field, exist only in values array */
    NO_COLOR_MAP(R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, "Neither global nor local color map found"),
    /* JADX INFO: Fake field, exist only in values array */
    WRONG_RECORD(R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, "Wrong record type detected"),
    /* JADX INFO: Fake field, exist only in values array */
    DATA_TOO_BIG(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, "Number of pixels bigger than width * height"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_ENOUGH_MEM(R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu, "Failed to allocate required memory"),
    /* JADX INFO: Fake field, exist only in values array */
    CLOSE_FAILED(R.styleable.AppCompatTheme_textColorAlertDialogListItem, "Failed to close given input"),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_BYTE_BUFFER(R.styleable.AppCompatTheme_textColorSearchUrl, "Given file was not opened for read"),
    /* JADX INFO: Fake field, exist only in values array */
    REWIND_FAILED(R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, "Image is defective, decoding aborted"),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_BYTE_BUFFER(R.styleable.AppCompatTheme_toolbarStyle, "Image EOF detected before image complete"),
    /* JADX INFO: Fake field, exist only in values array */
    REWIND_FAILED(1000, "No frames found, at least one frame required"),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_BYTE_BUFFER(1001, "Invalid screen size, dimensions must be positive"),
    /* JADX INFO: Fake field, exist only in values array */
    REWIND_FAILED(1002, "Invalid image size, dimensions must be positive"),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_BYTE_BUFFER(1003, "Image size exceeds screen size"),
    /* JADX INFO: Fake field, exist only in values array */
    REWIND_FAILED(1004, "Input source rewind failed, animation stopped"),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_BYTE_BUFFER(1005, "Invalid and/or indirect byte buffer specified"),
    UNKNOWN(-1, "Unknown error");
    

    /* renamed from: u  reason: collision with root package name */
    public final String f4728u;

    /* renamed from: v  reason: collision with root package name */
    public int f4729v;

    b(int i6, String str) {
        this.f4729v = i6;
        this.f4728u = str;
    }
}
