package com.ifriend.core.common.exception;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HttpErrorCode.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/ifriend/core/common/exception/HttpErrorCode;", "", "code", "", "(Ljava/lang/String;II)V", "getCode", "()I", "BAD_REQUEST", "UNAUTHORIZED", "FORBIDDEN", "PAGE_NOT_FOUND", "INTERNAL_SERVER_ERROR", "DATA_NOT_FOUND", "common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpErrorCode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HttpErrorCode[] $VALUES;
    private final int code;
    public static final HttpErrorCode BAD_REQUEST = new HttpErrorCode("BAD_REQUEST", 0, 400);
    public static final HttpErrorCode UNAUTHORIZED = new HttpErrorCode("UNAUTHORIZED", 1, 401);
    public static final HttpErrorCode FORBIDDEN = new HttpErrorCode("FORBIDDEN", 2, 403);
    public static final HttpErrorCode PAGE_NOT_FOUND = new HttpErrorCode("PAGE_NOT_FOUND", 3, 404);
    public static final HttpErrorCode INTERNAL_SERVER_ERROR = new HttpErrorCode("INTERNAL_SERVER_ERROR", 4, 500);
    public static final HttpErrorCode DATA_NOT_FOUND = new HttpErrorCode("DATA_NOT_FOUND", 5, 502);

    private static final /* synthetic */ HttpErrorCode[] $values() {
        return new HttpErrorCode[]{BAD_REQUEST, UNAUTHORIZED, FORBIDDEN, PAGE_NOT_FOUND, INTERNAL_SERVER_ERROR, DATA_NOT_FOUND};
    }

    public static EnumEntries<HttpErrorCode> getEntries() {
        return $ENTRIES;
    }

    public static HttpErrorCode valueOf(String str) {
        return (HttpErrorCode) Enum.valueOf(HttpErrorCode.class, str);
    }

    public static HttpErrorCode[] values() {
        return (HttpErrorCode[]) $VALUES.clone();
    }

    private HttpErrorCode(String str, int i, int i2) {
        this.code = i2;
    }

    public final int getCode() {
        return this.code;
    }

    static {
        HttpErrorCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
