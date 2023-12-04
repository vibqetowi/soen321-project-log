package io.sentry;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import io.sentry.util.StringUtils;
import java.io.IOException;
import java.util.Locale;
/* loaded from: classes4.dex */
public final class SentryEnvelopeItemHeaderAdapter extends TypeAdapter<SentryEnvelopeItemHeader> {
    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, SentryEnvelopeItemHeader sentryEnvelopeItemHeader) throws IOException {
        if (sentryEnvelopeItemHeader == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginObject();
        if (sentryEnvelopeItemHeader.getContentType() != null) {
            jsonWriter.name(FirebaseAnalytics.Param.CONTENT_TYPE);
            jsonWriter.value(sentryEnvelopeItemHeader.getContentType());
        }
        if (sentryEnvelopeItemHeader.getFileName() != null) {
            jsonWriter.name("filename");
            jsonWriter.value(sentryEnvelopeItemHeader.getFileName());
        }
        if (!SentryItemType.Unknown.equals(sentryEnvelopeItemHeader.getType())) {
            jsonWriter.name("type");
            jsonWriter.value(sentryEnvelopeItemHeader.getType().getItemType().toLowerCase(Locale.ROOT));
        }
        if (sentryEnvelopeItemHeader.getAttachmentType() != null) {
            jsonWriter.name("attachment_type");
            jsonWriter.value(sentryEnvelopeItemHeader.getAttachmentType());
        }
        jsonWriter.name(SessionDescription.ATTR_LENGTH);
        jsonWriter.value(sentryEnvelopeItemHeader.getLength());
        jsonWriter.endObject();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    public SentryEnvelopeItemHeader read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        SentryItemType sentryItemType = SentryItemType.Unknown;
        jsonReader.beginObject();
        SentryItemType sentryItemType2 = sentryItemType;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1106363674:
                    if (nextName.equals(SessionDescription.ATTR_LENGTH)) {
                        c = 0;
                        break;
                    }
                    break;
                case -734768633:
                    if (nextName.equals("filename")) {
                        c = 1;
                        break;
                    }
                    break;
                case -672977706:
                    if (nextName.equals("attachment_type")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 3;
                        break;
                    }
                    break;
                case 831846208:
                    if (nextName.equals(FirebaseAnalytics.Param.CONTENT_TYPE)) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    i = jsonReader.nextInt();
                    break;
                case 1:
                    str2 = jsonReader.nextString();
                    break;
                case 2:
                    str3 = jsonReader.nextString();
                    break;
                case 3:
                    try {
                        String nextString = jsonReader.nextString();
                        if (nextString != null) {
                            if (nextString.equalsIgnoreCase("user_report")) {
                                sentryItemType2 = SentryItemType.UserFeedback;
                                break;
                            } else {
                                String capitalize = StringUtils.capitalize(nextString);
                                if (capitalize == null) {
                                    break;
                                } else {
                                    sentryItemType2 = SentryItemType.valueOf(capitalize);
                                    break;
                                }
                            }
                        } else {
                            break;
                        }
                    } catch (IllegalArgumentException unused) {
                        break;
                    }
                case 4:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new SentryEnvelopeItemHeader(sentryItemType2, i, str, str2, str3);
    }
}
