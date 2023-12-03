package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import com.bugsnag.android.internal.DateUtils;
import java.util.Date;
import java.util.Map;
/* loaded from: classes.dex */
public class Breadcrumb implements JsonStream.Streamable {
    final BreadcrumbInternal impl;
    private final Logger logger;

    public Breadcrumb(BreadcrumbInternal breadcrumbInternal, Logger logger) {
        this.impl = breadcrumbInternal;
        this.logger = logger;
    }

    private void logNull(String str) {
        Logger logger = this.logger;
        logger.e("Invalid null value supplied to breadcrumb." + str + ", ignoring");
    }

    public String getMessage() {
        return this.impl.message;
    }

    public Map<String, Object> getMetadata() {
        return this.impl.metadata;
    }

    public String getStringTimestamp() {
        return DateUtils.toIso8601(this.impl.timestamp);
    }

    public Date getTimestamp() {
        return this.impl.timestamp;
    }

    public BreadcrumbType getType() {
        return this.impl.type;
    }

    public void setMessage(String str) {
        if (str != null) {
            this.impl.message = str;
        } else {
            logNull("message");
        }
    }

    public void setMetadata(Map<String, Object> map) {
        this.impl.metadata = map;
    }

    public void setType(BreadcrumbType breadcrumbType) {
        if (breadcrumbType != null) {
            this.impl.type = breadcrumbType;
        } else {
            logNull("type");
        }
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(JsonStream jsonStream) {
        this.impl.toStream(jsonStream);
    }

    public Breadcrumb(String str, Logger logger) {
        this.impl = new BreadcrumbInternal(str);
        this.logger = logger;
    }

    public Breadcrumb(String str, BreadcrumbType breadcrumbType, Map<String, Object> map, Date date, Logger logger) {
        this.impl = new BreadcrumbInternal(str, breadcrumbType, map, date);
        this.logger = logger;
    }
}
