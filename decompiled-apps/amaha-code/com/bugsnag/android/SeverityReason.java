package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SeverityReason implements JsonStream.Streamable {
    static final String REASON_ANR = "anrError";
    static final String REASON_CALLBACK_SPECIFIED = "userCallbackSetSeverity";
    static final String REASON_HANDLED_ERROR = "handledError";
    static final String REASON_HANDLED_EXCEPTION = "handledException";
    static final String REASON_LOG = "log";
    static final String REASON_PROMISE_REJECTION = "unhandledPromiseRejection";
    static final String REASON_SIGNAL = "signal";
    static final String REASON_STRICT_MODE = "strictMode";
    static final String REASON_UNHANDLED_EXCEPTION = "unhandledException";
    static final String REASON_USER_SPECIFIED = "userSpecifiedSeverity";
    private final String attributeKey;
    private final String attributeValue;
    private Severity currentSeverity;
    private final Severity defaultSeverity;
    final boolean originalUnhandled;
    private final String severityReasonType;
    private boolean unhandled;

    public SeverityReason(String str, Severity severity, boolean z10, boolean z11, String str2, String str3) {
        this.severityReasonType = str;
        this.unhandled = z10;
        this.originalUnhandled = z11;
        this.defaultSeverity = severity;
        this.currentSeverity = severity;
        this.attributeValue = str2;
        this.attributeKey = str3;
    }

    public static SeverityReason newInstance(String str) {
        return newInstance(str, null, null);
    }

    public String calculateSeverityReasonType() {
        if (this.defaultSeverity == this.currentSeverity) {
            return this.severityReasonType;
        }
        return REASON_CALLBACK_SPECIFIED;
    }

    public String getAttributeKey() {
        return this.attributeKey;
    }

    public String getAttributeValue() {
        return this.attributeValue;
    }

    public Severity getCurrentSeverity() {
        return this.currentSeverity;
    }

    public String getSeverityReasonType() {
        return this.severityReasonType;
    }

    public boolean getUnhandled() {
        return this.unhandled;
    }

    public boolean getUnhandledOverridden() {
        if (this.unhandled != this.originalUnhandled) {
            return true;
        }
        return false;
    }

    public boolean isOriginalUnhandled() {
        return this.originalUnhandled;
    }

    public void setCurrentSeverity(Severity severity) {
        this.currentSeverity = severity;
    }

    public void setUnhandled(boolean z10) {
        this.unhandled = z10;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(JsonStream jsonStream) {
        jsonStream.beginObject().name("type").value(calculateSeverityReasonType()).name("unhandledOverridden").value(getUnhandledOverridden());
        if (this.attributeKey != null && this.attributeValue != null) {
            jsonStream.name("attributes").beginObject().name(this.attributeKey).value(this.attributeValue).endObject();
        }
        jsonStream.endObject();
    }

    public static SeverityReason newInstance(String str, Severity severity, String str2) {
        if (str.equals(REASON_STRICT_MODE) && Intrinsics.isEmpty(str2)) {
            throw new IllegalArgumentException("No reason supplied for strictmode");
        }
        if (!str.equals(REASON_STRICT_MODE) && !str.equals(REASON_LOG) && !Intrinsics.isEmpty(str2)) {
            throw new IllegalArgumentException("attributeValue should not be supplied");
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1876197364:
                if (str.equals(REASON_STRICT_MODE)) {
                    c10 = 0;
                    break;
                }
                break;
            case -1773746641:
                if (str.equals(REASON_CALLBACK_SPECIFIED)) {
                    c10 = 1;
                    break;
                }
                break;
            case -1591166708:
                if (str.equals(REASON_UNHANDLED_EXCEPTION)) {
                    c10 = 2;
                    break;
                }
                break;
            case -1107031998:
                if (str.equals(REASON_USER_SPECIFIED)) {
                    c10 = 3;
                    break;
                }
                break;
            case -845696980:
                if (str.equals(REASON_HANDLED_ERROR)) {
                    c10 = 4;
                    break;
                }
                break;
            case -573976797:
                if (str.equals(REASON_ANR)) {
                    c10 = 5;
                    break;
                }
                break;
            case 107332:
                if (str.equals(REASON_LOG)) {
                    c10 = 6;
                    break;
                }
                break;
            case 87505361:
                if (str.equals(REASON_PROMISE_REJECTION)) {
                    c10 = 7;
                    break;
                }
                break;
            case 561970291:
                if (str.equals(REASON_HANDLED_EXCEPTION)) {
                    c10 = '\b';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return new SeverityReason(str, Severity.WARNING, true, true, str2, "violationType");
            case 1:
            case 3:
                return new SeverityReason(str, severity, false, false, null, null);
            case 2:
            case 5:
            case 7:
                return new SeverityReason(str, Severity.ERROR, true, true, null, null);
            case 4:
            case '\b':
                return new SeverityReason(str, Severity.WARNING, false, false, null, null);
            case 6:
                return new SeverityReason(str, severity, false, false, str2, "level");
            default:
                throw new IllegalArgumentException("Invalid argument for severityReason: '" + str + '\'');
        }
    }
}
