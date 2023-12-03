package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import com.bugsnag.android.internal.JsonHelper;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: NativeStackframe.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0004\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001Bg\b\u0000\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b4\u00105J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR$\u0010!\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR$\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'\"\u0004\b(\u0010)R$\u0010+\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00101\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\b\u001a\u0004\b2\u0010\n\"\u0004\b3\u0010\f¨\u00066"}, d2 = {"Lcom/bugsnag/android/NativeStackframe;", "Lcom/bugsnag/android/JsonStream$Streamable;", "Lcom/bugsnag/android/JsonStream;", "writer", "Lhs/k;", "toStream", "", "method", "Ljava/lang/String;", "getMethod", "()Ljava/lang/String;", "setMethod", "(Ljava/lang/String;)V", "file", "getFile", "setFile", "", "lineNumber", "Ljava/lang/Number;", "getLineNumber", "()Ljava/lang/Number;", "setLineNumber", "(Ljava/lang/Number;)V", "", "frameAddress", "Ljava/lang/Long;", "getFrameAddress", "()Ljava/lang/Long;", "setFrameAddress", "(Ljava/lang/Long;)V", "symbolAddress", "getSymbolAddress", "setSymbolAddress", "loadAddress", "getLoadAddress", "setLoadAddress", "", "isPC", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setPC", "(Ljava/lang/Boolean;)V", "Lcom/bugsnag/android/ErrorType;", "type", "Lcom/bugsnag/android/ErrorType;", "getType", "()Lcom/bugsnag/android/ErrorType;", "setType", "(Lcom/bugsnag/android/ErrorType;)V", "codeIdentifier", "getCodeIdentifier", "setCodeIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Lcom/bugsnag/android/ErrorType;Ljava/lang/String;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class NativeStackframe implements JsonStream.Streamable {
    private String codeIdentifier;
    private String file;
    private Long frameAddress;
    private Boolean isPC;
    private Number lineNumber;
    private Long loadAddress;
    private String method;
    private Long symbolAddress;
    private ErrorType type;

    public NativeStackframe(String str, String str2, Number number, Long l2, Long l10, Long l11, Boolean bool, ErrorType errorType, String str3) {
        this.method = str;
        this.file = str2;
        this.lineNumber = number;
        this.frameAddress = l2;
        this.symbolAddress = l10;
        this.loadAddress = l11;
        this.isPC = bool;
        this.type = errorType;
        this.codeIdentifier = str3;
    }

    public final String getCodeIdentifier() {
        return this.codeIdentifier;
    }

    public final String getFile() {
        return this.file;
    }

    public final Long getFrameAddress() {
        return this.frameAddress;
    }

    public final Number getLineNumber() {
        return this.lineNumber;
    }

    public final Long getLoadAddress() {
        return this.loadAddress;
    }

    public final String getMethod() {
        return this.method;
    }

    public final Long getSymbolAddress() {
        return this.symbolAddress;
    }

    public final ErrorType getType() {
        return this.type;
    }

    public final Boolean isPC() {
        return this.isPC;
    }

    public final void setCodeIdentifier(String str) {
        this.codeIdentifier = str;
    }

    public final void setFile(String str) {
        this.file = str;
    }

    public final void setFrameAddress(Long l2) {
        this.frameAddress = l2;
    }

    public final void setLineNumber(Number number) {
        this.lineNumber = number;
    }

    public final void setLoadAddress(Long l2) {
        this.loadAddress = l2;
    }

    public final void setMethod(String str) {
        this.method = str;
    }

    public final void setPC(Boolean bool) {
        this.isPC = bool;
    }

    public final void setSymbolAddress(Long l2) {
        this.symbolAddress = l2;
    }

    public final void setType(ErrorType errorType) {
        this.type = errorType;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(JsonStream writer) {
        i.h(writer, "writer");
        writer.beginObject();
        writer.name("method").value(this.method);
        writer.name("file").value(this.file);
        writer.name("lineNumber").value(this.lineNumber);
        Long l2 = this.frameAddress;
        if (l2 != null) {
            l2.longValue();
            writer.name("frameAddress").value(JsonHelper.INSTANCE.ulongToHex(this.frameAddress));
        }
        Long l10 = this.symbolAddress;
        if (l10 != null) {
            l10.longValue();
            writer.name("symbolAddress").value(JsonHelper.INSTANCE.ulongToHex(this.symbolAddress));
        }
        Long l11 = this.loadAddress;
        if (l11 != null) {
            l11.longValue();
            writer.name("loadAddress").value(JsonHelper.INSTANCE.ulongToHex(this.loadAddress));
        }
        writer.name("codeIdentifier").value(this.codeIdentifier);
        writer.name("isPC").value(this.isPC);
        ErrorType errorType = this.type;
        if (errorType != null) {
            writer.name("type").value(errorType.getDesc$bugsnag_android_core_release());
        }
        writer.endObject();
    }

    public /* synthetic */ NativeStackframe(String str, String str2, Number number, Long l2, Long l10, Long l11, Boolean bool, ErrorType errorType, String str3, int i6, d dVar) {
        this(str, str2, number, l2, l10, l11, bool, (i6 & 128) != 0 ? null : errorType, (i6 & 256) != 0 ? null : str3);
    }
}
