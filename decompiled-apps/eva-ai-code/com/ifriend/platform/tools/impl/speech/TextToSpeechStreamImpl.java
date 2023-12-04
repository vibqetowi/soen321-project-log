package com.ifriend.platform.tools.impl.speech;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import com.ifriend.platform.tools.api.speech.TextToSpeechInitState;
import com.ifriend.platform.tools.api.speech.TextToSpeechMessageState;
import com.ifriend.platform.tools.api.speech.TextToSpeechStream;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: TextToSpeechStreamImpl.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u001a\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016J\b\u0010&\u001a\u00020\u001fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\tX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b¨\u0006'"}, d2 = {"Lcom/ifriend/platform/tools/impl/speech/TextToSpeechStreamImpl;", "Lcom/ifriend/platform/tools/api/speech/TextToSpeechStream;", "Landroid/speech/tts/TextToSpeech$OnInitListener;", "Lkotlinx/coroutines/CoroutineScope;", "context", "Landroid/content/Context;", "coroutineScope", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "initState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/ifriend/platform/tools/api/speech/TextToSpeechInitState;", "messageState", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/ifriend/platform/tools/api/speech/TextToSpeechMessageState;", "messageStateFlow", "Lkotlinx/coroutines/flow/Flow;", "getMessageStateFlow", "()Lkotlinx/coroutines/flow/Flow;", "stateFlow", "getStateFlow", "textToSpeech", "Landroid/speech/tts/TextToSpeech;", "getTextToSpeech", "()Landroid/speech/tts/TextToSpeech;", "textToSpeech$delegate", "Lkotlin/Lazy;", "onInit", "", "status", "", "speak", "text", "", "textId", "stop", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextToSpeechStreamImpl implements TextToSpeechStream, TextToSpeech.OnInitListener, CoroutineScope {
    private final Context context;
    private final CoroutineScope coroutineScope;
    private final MutableStateFlow<TextToSpeechInitState> initState;
    private final MutableSharedFlow<TextToSpeechMessageState> messageState;
    private final Lazy textToSpeech$delegate;

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineScope.getCoroutineContext();
    }

    @Inject
    public TextToSpeechStreamImpl(Context context, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.context = context;
        this.coroutineScope = coroutineScope;
        this.initState = StateFlowKt.MutableStateFlow(TextToSpeechInitState.UNKNOWN);
        this.messageState = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.textToSpeech$delegate = LazyKt.lazy(new TextToSpeechStreamImpl$textToSpeech$2(this));
        getTextToSpeech().setOnUtteranceProgressListener(new UtteranceProgressListener() { // from class: com.ifriend.platform.tools.impl.speech.TextToSpeechStreamImpl.1
            @Override // android.speech.tts.UtteranceProgressListener
            public void onStart(String str) {
                BuildersKt__Builders_commonKt.launch$default(TextToSpeechStreamImpl.this, null, null, new TextToSpeechStreamImpl$1$onStart$1(TextToSpeechStreamImpl.this, str, null), 3, null);
            }

            @Override // android.speech.tts.UtteranceProgressListener
            public void onDone(String str) {
                BuildersKt__Builders_commonKt.launch$default(TextToSpeechStreamImpl.this, null, null, new TextToSpeechStreamImpl$1$onDone$1(TextToSpeechStreamImpl.this, str, null), 3, null);
            }

            @Override // android.speech.tts.UtteranceProgressListener
            @Deprecated(message = "Deprecated in Java")
            public void onError(String str) {
                BuildersKt__Builders_commonKt.launch$default(TextToSpeechStreamImpl.this, null, null, new TextToSpeechStreamImpl$1$onError$1(TextToSpeechStreamImpl.this, str, null), 3, null);
            }

            @Override // android.speech.tts.UtteranceProgressListener
            public void onError(String str, int i) {
                BuildersKt__Builders_commonKt.launch$default(TextToSpeechStreamImpl.this, null, null, new TextToSpeechStreamImpl$1$onError$2(TextToSpeechStreamImpl.this, str, null), 3, null);
            }
        });
    }

    @Override // com.ifriend.platform.tools.api.speech.TextToSpeechStream
    public Flow<TextToSpeechInitState> getStateFlow() {
        return FlowKt.asSharedFlow(this.initState);
    }

    @Override // com.ifriend.platform.tools.api.speech.TextToSpeechStream
    public Flow<TextToSpeechMessageState> getMessageStateFlow() {
        return FlowKt.asSharedFlow(this.messageState);
    }

    private final TextToSpeech getTextToSpeech() {
        return (TextToSpeech) this.textToSpeech$delegate.getValue();
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public void onInit(int i) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new TextToSpeechStreamImpl$onInit$1(this, i, null), 3, null);
    }

    @Override // com.ifriend.platform.tools.api.speech.TextToSpeechStream
    public void speak(String text, String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        TextToSpeech textToSpeech = getTextToSpeech();
        String str2 = text;
        if (str == null) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        }
        textToSpeech.speak(str2, 1, null, str);
    }

    @Override // com.ifriend.platform.tools.api.speech.TextToSpeechStream
    public void stop() {
        getTextToSpeech().stop();
    }
}
