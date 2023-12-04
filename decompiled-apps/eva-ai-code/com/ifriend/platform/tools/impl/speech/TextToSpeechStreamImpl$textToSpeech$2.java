package com.ifriend.platform.tools.impl.speech;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextToSpeechStreamImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/speech/tts/TextToSpeech;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextToSpeechStreamImpl$textToSpeech$2 extends Lambda implements Function0<TextToSpeech> {
    final /* synthetic */ TextToSpeechStreamImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextToSpeechStreamImpl$textToSpeech$2(TextToSpeechStreamImpl textToSpeechStreamImpl) {
        super(0);
        this.this$0 = textToSpeechStreamImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final TextToSpeech invoke() {
        Context context;
        context = this.this$0.context;
        TextToSpeech textToSpeech = new TextToSpeech(context, this.this$0);
        textToSpeech.setLanguage(new Locale("en_US"));
        textToSpeech.setSpeechRate(1.0f);
        return textToSpeech;
    }
}
