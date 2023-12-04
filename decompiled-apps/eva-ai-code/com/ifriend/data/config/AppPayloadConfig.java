package com.ifriend.data.config;

import kotlin.Metadata;
/* compiled from: AppPayloadConfig.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ifriend/data/config/AppPayloadConfig;", "", "()V", "mainChatPayload", "", "getMainChatPayload", "()Ljava/lang/String;", "mainWithInfluensersChatPayload", "getMainWithInfluensersChatPayload", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppPayloadConfig {
    public static final AppPayloadConfig INSTANCE = new AppPayloadConfig();
    private static final String mainChatPayload = "{\n\"payload\": {\n                \"conditions\": [\n                {\n                    \"botUIDs\": {\n                    \"list\": [\"main\"],\n                    \"include\": true\n                }\n                }\n                ]\n            }}";
    private static final String mainWithInfluensersChatPayload = "{\n\"payload\": {\n                \"conditions\": [\n                {\n                    \"botUIDs\": {\n                    \"list\": [\"main\",\"eva-elfie\"],\n                    \"include\": true\n                }\n                }\n                ]\n            }}";

    private AppPayloadConfig() {
    }

    public final String getMainChatPayload() {
        return mainChatPayload;
    }

    public final String getMainWithInfluensersChatPayload() {
        return mainWithInfluensersChatPayload;
    }
}
