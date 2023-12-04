package com.google.cloud.speech.v1p1beta1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;
/* loaded from: classes7.dex */
public interface SpeechContextOrBuilder extends MessageOrBuilder {
    float getBoost();

    String getPhrases(int i);

    ByteString getPhrasesBytes(int i);

    int getPhrasesCount();

    List<String> getPhrasesList();
}
