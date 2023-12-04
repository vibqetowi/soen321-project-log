package io.sentry;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.ifriend.analytics.AnalyticsConstants;
import io.grpc.netty.shaded.io.netty.handler.codec.rtsp.RtspHeaders;
import io.sentry.Session;
import io.sentry.util.Objects;
import io.sentry.util.StringUtils;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
/* loaded from: classes4.dex */
public final class SessionAdapter extends TypeAdapter<Session> {
    private final SentryOptions options;

    public SessionAdapter(SentryOptions sentryOptions) {
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "The SentryOptions is required.");
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Session session) throws IOException {
        if (session == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginObject();
        if (session.getSessionId() != null) {
            jsonWriter.name("sid").value(session.getSessionId().toString());
        }
        if (session.getDistinctId() != null) {
            jsonWriter.name("did").value(session.getDistinctId());
        }
        if (session.getInit() != null) {
            jsonWriter.name("init").value(session.getInit());
        }
        Date started = session.getStarted();
        if (started != null) {
            jsonWriter.name("started").value(DateUtils.getTimestamp(started));
        }
        Session.State status = session.getStatus();
        if (status != null) {
            jsonWriter.name("status").value(status.name().toLowerCase(Locale.ROOT));
        }
        if (session.getSequence() != null) {
            jsonWriter.name(RtspHeaders.Values.SEQ).value(session.getSequence());
        }
        int errorCount = session.errorCount();
        if (errorCount > 0) {
            jsonWriter.name("errors").value(errorCount);
        }
        if (session.getDuration() != null) {
            jsonWriter.name("duration").value(session.getDuration());
        }
        if (session.getTimestamp() != null) {
            jsonWriter.name(AnalyticsConstants.TIMESTAMP).value(DateUtils.getTimestamp(session.getTimestamp()));
        }
        boolean initAttrs = initAttrs(jsonWriter, false);
        jsonWriter.name("release").value(session.getRelease());
        if (session.getEnvironment() != null) {
            initAttrs = initAttrs(jsonWriter, initAttrs);
            jsonWriter.name("environment").value(session.getEnvironment());
        }
        if (session.getIpAddress() != null) {
            initAttrs = initAttrs(jsonWriter, initAttrs);
            jsonWriter.name("ip_address").value(session.getIpAddress());
        }
        if (session.getUserAgent() != null) {
            initAttrs = initAttrs(jsonWriter, initAttrs);
            jsonWriter.name("user_agent").value(session.getUserAgent());
        }
        if (initAttrs) {
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private boolean initAttrs(JsonWriter jsonWriter, boolean z) throws IOException {
        if (z) {
            return true;
        }
        jsonWriter.name("attrs").beginObject();
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    public Session read(JsonReader jsonReader) throws IOException {
        char c;
        String str;
        boolean z;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        jsonReader.beginObject();
        Session.State state = null;
        Date date = null;
        Date date2 = null;
        String str2 = null;
        UUID uuid = null;
        Boolean bool = null;
        Long l = null;
        Double d = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        int i = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            String str7 = str4;
            switch (nextName.hashCode()) {
                case -1992012396:
                    if (nextName.equals("duration")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1897185151:
                    if (nextName.equals("started")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1294635157:
                    if (nextName.equals("errors")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -892481550:
                    if (nextName.equals("status")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 99455:
                    if (nextName.equals("did")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 113759:
                    if (nextName.equals(RtspHeaders.Values.SEQ)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 113870:
                    if (nextName.equals("sid")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3237136:
                    if (nextName.equals("init")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 55126294:
                    if (nextName.equals(AnalyticsConstants.TIMESTAMP)) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 93152418:
                    if (nextName.equals("attrs")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    d = Double.valueOf(jsonReader.nextDouble());
                    break;
                case 1:
                    date = converTimeStamp(jsonReader.nextString(), "started");
                    break;
                case 2:
                    i = jsonReader.nextInt();
                    break;
                case 3:
                    try {
                        String capitalize = StringUtils.capitalize(jsonReader.nextString());
                        if (capitalize != null) {
                            try {
                                state = Session.State.valueOf(capitalize);
                            } catch (IllegalArgumentException unused) {
                                this.options.getLogger().log(SentryLevel.ERROR, "%s status is not valid.", null);
                                str4 = str7;
                            }
                        }
                    } catch (IllegalArgumentException unused2) {
                    }
                case 4:
                    str2 = jsonReader.nextString();
                    break;
                case 5:
                    l = Long.valueOf(jsonReader.nextLong());
                    break;
                case 6:
                    try {
                        str = jsonReader.nextString();
                    } catch (IllegalArgumentException unused3) {
                        str = null;
                    }
                    try {
                        uuid = UUID.fromString(str);
                    } catch (IllegalArgumentException unused4) {
                        this.options.getLogger().log(SentryLevel.ERROR, "%s sid is not valid.", str);
                        str4 = str7;
                    }
                case 7:
                    bool = Boolean.valueOf(jsonReader.nextBoolean());
                    break;
                case '\b':
                    date2 = converTimeStamp(jsonReader.nextString(), AnalyticsConstants.TIMESTAMP);
                    break;
                case '\t':
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.hashCode();
                        switch (nextName2.hashCode()) {
                            case -85904877:
                                if (nextName2.equals("environment")) {
                                    z = false;
                                    break;
                                }
                                z = true;
                                break;
                            case 1090594823:
                                if (nextName2.equals("release")) {
                                    z = true;
                                    break;
                                }
                                z = true;
                                break;
                            case 1480014044:
                                if (nextName2.equals("ip_address")) {
                                    z = true;
                                    break;
                                }
                                z = true;
                                break;
                            case 1917799825:
                                if (nextName2.equals("user_agent")) {
                                    z = true;
                                    break;
                                }
                                z = true;
                                break;
                            default:
                                z = true;
                                break;
                        }
                        switch (z) {
                            case false:
                                str5 = jsonReader.nextString();
                                break;
                            case true:
                                str6 = jsonReader.nextString();
                                break;
                            case true:
                                str3 = jsonReader.nextString();
                                break;
                            case true:
                                str7 = jsonReader.nextString();
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
            str4 = str7;
        }
        String str8 = str4;
        jsonReader.endObject();
        if (state == null || date == null || str6 == null || str6.isEmpty()) {
            this.options.getLogger().log(SentryLevel.ERROR, "Session is gonna be dropped due to invalid fields.", new Object[0]);
            return null;
        }
        return new Session(state, date, date2, i, str2, uuid, bool, l, d, str3, str8, str5, str6);
    }

    private Date converTimeStamp(String str, String str2) {
        try {
            return DateUtils.getDateTime(str);
        } catch (IllegalArgumentException e) {
            this.options.getLogger().log(SentryLevel.ERROR, e, "Error converting session (%s) field.", str2);
            return null;
        }
    }
}
