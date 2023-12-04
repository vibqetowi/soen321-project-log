package com.ifriend.platform.tools.api.speech;

import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
/* compiled from: TextToSpeechStream.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH&J\b\u0010\u000f\u001a\u00020\u000bH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/platform/tools/api/speech/TextToSpeechStream;", "", "messageStateFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/platform/tools/api/speech/TextToSpeechMessageState;", "getMessageStateFlow", "()Lkotlinx/coroutines/flow/Flow;", "stateFlow", "Lcom/ifriend/platform/tools/api/speech/TextToSpeechInitState;", "getStateFlow", "speak", "", "text", "", "textId", "stop", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface TextToSpeechStream {
    Flow<TextToSpeechMessageState> getMessageStateFlow();

    Flow<TextToSpeechInitState> getStateFlow();

    void speak(String str, String str2);

    void stop();

    /* compiled from: TextToSpeechStream.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void speak$default(TextToSpeechStream textToSpeechStream, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: speak");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            textToSpeechStream.speak(str, str2);
        }
    }
}
