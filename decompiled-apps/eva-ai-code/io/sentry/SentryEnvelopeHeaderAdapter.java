package io.sentry;

import com.facebook.internal.ServerProtocol;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import io.sentry.TraceState;
import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryPackage;
import java.io.IOException;
import java.util.List;
/* loaded from: classes4.dex */
public final class SentryEnvelopeHeaderAdapter extends TypeAdapter<SentryEnvelopeHeader> {
    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, SentryEnvelopeHeader sentryEnvelopeHeader) throws IOException {
        if (sentryEnvelopeHeader == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginObject();
        if (sentryEnvelopeHeader.getEventId() != null) {
            jsonWriter.name("event_id");
            jsonWriter.value(sentryEnvelopeHeader.getEventId().toString());
        }
        SdkVersion sdkVersion = sentryEnvelopeHeader.getSdkVersion();
        if (sdkVersion != null && hasValidSdkVersion(sdkVersion)) {
            jsonWriter.name(ServerProtocol.DIALOG_PARAM_SDK_VERSION).beginObject();
            jsonWriter.name("name").value(sdkVersion.getName());
            jsonWriter.name("version").value(sdkVersion.getVersion());
            List<String> integrations = sdkVersion.getIntegrations();
            if (integrations != null) {
                jsonWriter.name("integrations").beginArray();
                for (String str : integrations) {
                    jsonWriter.value(str);
                }
                jsonWriter.endArray();
            }
            List<SentryPackage> packages = sdkVersion.getPackages();
            if (packages != null) {
                jsonWriter.name("packages").beginArray();
                for (SentryPackage sentryPackage : packages) {
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(sentryPackage.getName());
                    jsonWriter.name("version").value(sentryPackage.getVersion());
                    jsonWriter.endObject();
                }
                jsonWriter.endArray();
            }
            jsonWriter.endObject();
        }
        TraceState trace = sentryEnvelopeHeader.getTrace();
        if (trace != null) {
            jsonWriter.name(SpanContext.TYPE);
            jsonWriter.beginObject();
            jsonWriter.name("trace_id").value(trace.getTraceId().toString());
            jsonWriter.name("public_key").value(trace.getPublicKey());
            if (trace.getRelease() != null) {
                jsonWriter.name("release").value(trace.getRelease());
            }
            if (trace.getEnvironment() != null) {
                jsonWriter.name("environment").value(trace.getEnvironment());
            }
            if (trace.getTransaction() != null) {
                jsonWriter.name("transaction").value(trace.getTransaction());
            }
            if (trace.getUser() != null && (trace.getUser().getId() != null || trace.getUser().getSegment() != null)) {
                jsonWriter.name("user");
                jsonWriter.beginObject();
                if (trace.getUser().getId() != null) {
                    jsonWriter.name("id").value(trace.getUser().getId());
                }
                if (trace.getUser().getSegment() != null) {
                    jsonWriter.name("segment").value(trace.getUser().getSegment());
                }
                jsonWriter.endObject();
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private boolean hasValidSdkVersion(SdkVersion sdkVersion) {
        return (sdkVersion.getName() == null || sdkVersion.getName().isEmpty() || sdkVersion.getVersion() == null || sdkVersion.getVersion().isEmpty()) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    public SentryEnvelopeHeader read(JsonReader jsonReader) throws IOException {
        boolean z;
        char c;
        char c2;
        String str = null;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        jsonReader.beginObject();
        SentryId sentryId = null;
        SdkVersion sdkVersion = null;
        TraceState traceState = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 113722:
                    if (nextName.equals(ServerProtocol.DIALOG_PARAM_SDK_VERSION)) {
                        z = false;
                        break;
                    }
                    z = true;
                    break;
                case 110620997:
                    if (nextName.equals(SpanContext.TYPE)) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                case 278118624:
                    if (nextName.equals("event_id")) {
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
                    jsonReader.beginObject();
                    sdkVersion = new SdkVersion();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.hashCode();
                        switch (nextName2.hashCode()) {
                            case 3373707:
                                if (nextName2.equals("name")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 351608024:
                                if (nextName2.equals("version")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 750867693:
                                if (nextName2.equals("packages")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1487029535:
                                if (nextName2.equals("integrations")) {
                                    c = 3;
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
                                sdkVersion.setName(jsonReader.nextString());
                                break;
                            case 1:
                                sdkVersion.setVersion(jsonReader.nextString());
                                break;
                            case 2:
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    jsonReader.beginObject();
                                    String str2 = null;
                                    String str3 = null;
                                    while (jsonReader.hasNext()) {
                                        String nextName3 = jsonReader.nextName();
                                        nextName3.hashCode();
                                        if (nextName3.equals("name")) {
                                            str2 = jsonReader.nextString();
                                        } else if (nextName3.equals("version")) {
                                            str3 = jsonReader.nextString();
                                        } else {
                                            jsonReader.skipValue();
                                        }
                                    }
                                    if (str2 != null && str3 != null) {
                                        sdkVersion.addPackage(str2, str3);
                                    }
                                    jsonReader.endObject();
                                }
                                jsonReader.endArray();
                                break;
                            case 3:
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    String nextString = jsonReader.nextString();
                                    if (nextString != null) {
                                        sdkVersion.addIntegration(nextString);
                                    }
                                }
                                jsonReader.endArray();
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    break;
                case true:
                    jsonReader.beginObject();
                    SentryId sentryId2 = str;
                    SentryId sentryId3 = sentryId2;
                    String str4 = sentryId3;
                    String str5 = str4;
                    String str6 = str5;
                    String str7 = str6;
                    String str8 = str7;
                    while (jsonReader.hasNext()) {
                        String nextName4 = jsonReader.nextName();
                        nextName4.hashCode();
                        switch (nextName4.hashCode()) {
                            case -85904877:
                                if (nextName4.equals("environment")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3599307:
                                if (nextName4.equals("user")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1090594823:
                                if (nextName4.equals("release")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1270300245:
                                if (nextName4.equals("trace_id")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1904812937:
                                if (nextName4.equals("public_key")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 2141246174:
                                if (nextName4.equals("transaction")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                str5 = jsonReader.nextString();
                                break;
                            case 1:
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.hashCode();
                                    if (nextName5.equals("id")) {
                                        str7 = jsonReader.nextString();
                                    } else if (nextName5.equals("segment")) {
                                        str8 = jsonReader.nextString();
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                break;
                            case 2:
                                str4 = jsonReader.nextString();
                                break;
                            case 3:
                                sentryId2 = new SentryId(jsonReader.nextString());
                                break;
                            case 4:
                                sentryId3 = jsonReader.nextString();
                                break;
                            case 5:
                                str6 = jsonReader.nextString();
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    if (sentryId2 != null && sentryId3 != null) {
                        traceState = new TraceState(sentryId2, sentryId3, str4, str5, (str7 == null && str8 == null) ? null : new TraceState.TraceStateUser(str7, str8), str6);
                    }
                    jsonReader.endObject();
                    break;
                case true:
                    sentryId = new SentryId(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
            str = null;
        }
        jsonReader.endObject();
        return new SentryEnvelopeHeader(sentryId, sdkVersion, traceState);
    }
}
