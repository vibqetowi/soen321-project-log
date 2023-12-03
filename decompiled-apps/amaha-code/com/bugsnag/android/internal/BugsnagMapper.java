package com.bugsnag.android.internal;

import com.bugsnag.android.BugsnagEventMapper;
import com.bugsnag.android.Error;
import com.bugsnag.android.Event;
import com.bugsnag.android.JsonStream;
import com.bugsnag.android.Logger;
import gv.a;
import hs.k;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: BugsnagMapper.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0007\u001a\u00020\b2\u0016\u0010\t\u001a\u0012\u0012\u0006\b\u0000\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nJ&\u0010\f\u001a\u00020\r2\u0016\u0010\t\u001a\u0012\u0012\u0006\b\u0000\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n2\u0006\u0010\u000e\u001a\u00020\u000bJ\u001e\u0010\u000f\u001a\u0012\u0012\u0006\b\u0000\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n2\u0006\u0010\u0010\u001a\u00020\bJ\u001e\u0010\u000f\u001a\u0012\u0012\u0006\b\u0000\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n2\u0006\u0010\u0011\u001a\u00020\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/bugsnag/android/internal/BugsnagMapper;", "", "logger", "Lcom/bugsnag/android/Logger;", "(Lcom/bugsnag/android/Logger;)V", "eventMapper", "Lcom/bugsnag/android/BugsnagEventMapper;", "convertToError", "Lcom/bugsnag/android/Error;", "data", "", "", "convertToEvent", "Lcom/bugsnag/android/Event;", "fallbackApiKey", "convertToMap", "error", "event", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class BugsnagMapper {
    private final BugsnagEventMapper eventMapper;

    public BugsnagMapper(Logger logger) {
        i.h(logger, "logger");
        this.eventMapper = new BugsnagEventMapper(logger);
    }

    public final Error convertToError(Map<? super String, ? extends Object> data) {
        i.h(data, "data");
        return this.eventMapper.convertError$bugsnag_android_core_release(data);
    }

    public final Event convertToEvent(Map<? super String, ? extends Object> data, String fallbackApiKey) {
        i.h(data, "data");
        i.h(fallbackApiKey, "fallbackApiKey");
        return this.eventMapper.convertToEvent$bugsnag_android_core_release(data, fallbackApiKey);
    }

    public final Map<? super String, Object> convertToMap(Event event) {
        i.h(event, "event");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream, a.f16927b);
        try {
            new JsonStream(outputStreamWriter).value(event);
            k kVar = k.f19476a;
            ca.a.z(outputStreamWriter, null);
            JsonHelper jsonHelper = JsonHelper.INSTANCE;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            i.c(byteArray, "byteStream.toByteArray()");
            return jsonHelper.deserialize(byteArray);
        } finally {
        }
    }

    public final Map<? super String, Object> convertToMap(Error error) {
        i.h(error, "error");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream, a.f16927b);
        try {
            new JsonStream(outputStreamWriter).value(error);
            k kVar = k.f19476a;
            ca.a.z(outputStreamWriter, null);
            JsonHelper jsonHelper = JsonHelper.INSTANCE;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            i.c(byteArray, "byteStream.toByteArray()");
            return jsonHelper.deserialize(byteArray);
        } finally {
        }
    }
}
